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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'information'", "'model'", "'generate'", "'import'", "'as'", "'extends'", "'='", "'and'", "':'", "'grab'", "'domain'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'archetype'", "'redefines'", "'enumeration'", "'ditch'", "','", "'abstract'", "'root'", "'entity'", "'morph'", "'fuse'", "'detail'", "'reference'", "'composite'", "'derived'", "'attribute'", "'key'", "'query'", "'('", "'*'", "')'", "'returns'", "'.*'", "'.'", "'..'", "'base'", "'interface'", "'core'", "'inverse'"
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
    public static final int T__53=53;
    public static final int T__54=54;
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
        	return "SInformationModel";
       	}

       	@Override
       	protected SimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSInformationModel"
    // InternalSim.g:65:1: entryRuleSInformationModel returns [EObject current=null] : iv_ruleSInformationModel= ruleSInformationModel EOF ;
    public final EObject entryRuleSInformationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSInformationModel = null;


        try {
            // InternalSim.g:65:58: (iv_ruleSInformationModel= ruleSInformationModel EOF )
            // InternalSim.g:66:2: iv_ruleSInformationModel= ruleSInformationModel EOF
            {
             newCompositeNode(grammarAccess.getSInformationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSInformationModel=ruleSInformationModel();

            state._fsp--;

             current =iv_ruleSInformationModel; 
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
    // $ANTLR end "entryRuleSInformationModel"


    // $ANTLR start "ruleSInformationModel"
    // InternalSim.g:72:1: ruleSInformationModel returns [EObject current=null] : ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleSQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_imports_5_0= ruleSImport ) )* ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )* ) ;
    public final EObject ruleSInformationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generate_4_0=null;
        Enumerator lv_kind_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_aggregates_7_0 = null;

        EObject lv_domainProxies_8_0 = null;



        	enterRule();

        try {
            // InternalSim.g:78:2: ( ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleSQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_imports_5_0= ruleSImport ) )* ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )* ) )
            // InternalSim.g:79:2: ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleSQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_imports_5_0= ruleSImport ) )* ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )* )
            {
            // InternalSim.g:79:2: ( ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleSQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_imports_5_0= ruleSImport ) )* ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )* )
            // InternalSim.g:80:3: ( (lv_kind_0_0= ruleSInformationModelKind ) ) otherlv_1= 'information' otherlv_2= 'model' ( (lv_name_3_0= ruleSQualifiedName ) ) ( (lv_generate_4_0= 'generate' ) )? ( (lv_imports_5_0= ruleSImport ) )* ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )*
            {
            // InternalSim.g:80:3: ( (lv_kind_0_0= ruleSInformationModelKind ) )
            // InternalSim.g:81:4: (lv_kind_0_0= ruleSInformationModelKind )
            {
            // InternalSim.g:81:4: (lv_kind_0_0= ruleSInformationModelKind )
            // InternalSim.g:82:5: lv_kind_0_0= ruleSInformationModelKind
            {

            					newCompositeNode(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_kind_0_0=ruleSInformationModelKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"com.mimacom.ddd.sm.sim.Sim.SInformationModelKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSInformationModelAccess().getInformationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSInformationModelAccess().getModelKeyword_2());
            		
            // InternalSim.g:107:3: ( (lv_name_3_0= ruleSQualifiedName ) )
            // InternalSim.g:108:4: (lv_name_3_0= ruleSQualifiedName )
            {
            // InternalSim.g:108:4: (lv_name_3_0= ruleSQualifiedName )
            // InternalSim.g:109:5: lv_name_3_0= ruleSQualifiedName
            {

            					newCompositeNode(grammarAccess.getSInformationModelAccess().getNameSQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleSQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"com.mimacom.ddd.sm.sim.Sim.SQualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:126:3: ( (lv_generate_4_0= 'generate' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSim.g:127:4: (lv_generate_4_0= 'generate' )
                    {
                    // InternalSim.g:127:4: (lv_generate_4_0= 'generate' )
                    // InternalSim.g:128:5: lv_generate_4_0= 'generate'
                    {
                    lv_generate_4_0=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(lv_generate_4_0, grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSInformationModelRule());
                    					}
                    					setWithLastConsumed(current, "generate", true, "generate");
                    				

                    }


                    }
                    break;

            }

            // InternalSim.g:140:3: ( (lv_imports_5_0= ruleSImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSim.g:141:4: (lv_imports_5_0= ruleSImport )
            	    {
            	    // InternalSim.g:141:4: (lv_imports_5_0= ruleSImport )
            	    // InternalSim.g:142:5: lv_imports_5_0= ruleSImport
            	    {

            	    					newCompositeNode(grammarAccess.getSInformationModelAccess().getImportsSImportParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_imports_5_0=ruleSImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_5_0,
            	    						"com.mimacom.ddd.sm.sim.Sim.SImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSim.g:159:3: ( ( (lv_types_6_0= ruleSType ) ) | ( (lv_aggregates_7_0= ruleSAggregate ) ) | ( (lv_domainProxies_8_0= ruleSDomainProxy ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    switch ( input.LA(2) ) {
                    case 26:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 37:
                        {
                        alt3=1;
                        }
                        break;
                    case 21:
                        {
                        alt3=3;
                        }
                        break;
                    case 22:
                        {
                        alt3=2;
                        }
                        break;

                    }

                    }
                    break;
                case 26:
                case 27:
                case 29:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    {
                    alt3=1;
                    }
                    break;
                case 22:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalSim.g:160:4: ( (lv_types_6_0= ruleSType ) )
            	    {
            	    // InternalSim.g:160:4: ( (lv_types_6_0= ruleSType ) )
            	    // InternalSim.g:161:5: (lv_types_6_0= ruleSType )
            	    {
            	    // InternalSim.g:161:5: (lv_types_6_0= ruleSType )
            	    // InternalSim.g:162:6: lv_types_6_0= ruleSType
            	    {

            	    						newCompositeNode(grammarAccess.getSInformationModelAccess().getTypesSTypeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_types_6_0=ruleSType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_6_0,
            	    							"com.mimacom.ddd.sm.sim.Sim.SType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSim.g:180:4: ( (lv_aggregates_7_0= ruleSAggregate ) )
            	    {
            	    // InternalSim.g:180:4: ( (lv_aggregates_7_0= ruleSAggregate ) )
            	    // InternalSim.g:181:5: (lv_aggregates_7_0= ruleSAggregate )
            	    {
            	    // InternalSim.g:181:5: (lv_aggregates_7_0= ruleSAggregate )
            	    // InternalSim.g:182:6: lv_aggregates_7_0= ruleSAggregate
            	    {

            	    						newCompositeNode(grammarAccess.getSInformationModelAccess().getAggregatesSAggregateParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_aggregates_7_0=ruleSAggregate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aggregates",
            	    							lv_aggregates_7_0,
            	    							"com.mimacom.ddd.sm.sim.Sim.SAggregate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSim.g:200:4: ( (lv_domainProxies_8_0= ruleSDomainProxy ) )
            	    {
            	    // InternalSim.g:200:4: ( (lv_domainProxies_8_0= ruleSDomainProxy ) )
            	    // InternalSim.g:201:5: (lv_domainProxies_8_0= ruleSDomainProxy )
            	    {
            	    // InternalSim.g:201:5: (lv_domainProxies_8_0= ruleSDomainProxy )
            	    // InternalSim.g:202:6: lv_domainProxies_8_0= ruleSDomainProxy
            	    {

            	    						newCompositeNode(grammarAccess.getSInformationModelAccess().getDomainProxiesSDomainProxyParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_domainProxies_8_0=ruleSDomainProxy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSInformationModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"domainProxies",
            	    							lv_domainProxies_8_0,
            	    							"com.mimacom.ddd.sm.sim.Sim.SDomainProxy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleSInformationModel"


    // $ANTLR start "entryRuleSImport"
    // InternalSim.g:224:1: entryRuleSImport returns [EObject current=null] : iv_ruleSImport= ruleSImport EOF ;
    public final EObject entryRuleSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSImport = null;


        try {
            // InternalSim.g:224:48: (iv_ruleSImport= ruleSImport EOF )
            // InternalSim.g:225:2: iv_ruleSImport= ruleSImport EOF
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
    // InternalSim.g:231:1: ruleSImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSim.g:237:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) ) )
            // InternalSim.g:238:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            {
            // InternalSim.g:238:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) ) )
            // InternalSim.g:239:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSImportAccess().getImportKeyword_0());
            		
            // InternalSim.g:243:3: ( (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:244:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:244:4: (lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard )
            // InternalSim.g:245:5: lv_importedNamespace_1_0= ruleSQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleSGrabDomainRule"
    // InternalSim.g:266:1: entryRuleSGrabDomainRule returns [EObject current=null] : iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF ;
    public final EObject entryRuleSGrabDomainRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabDomainRule = null;


        try {
            // InternalSim.g:266:56: (iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF )
            // InternalSim.g:267:2: iv_ruleSGrabDomainRule= ruleSGrabDomainRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabDomainRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabDomainRule=ruleSGrabDomainRule();

            state._fsp--;

             current =iv_ruleSGrabDomainRule; 
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
    // $ANTLR end "entryRuleSGrabDomainRule"


    // $ANTLR start "ruleSGrabDomainRule"
    // InternalSim.g:273:1: ruleSGrabDomainRule returns [EObject current=null] : ( ( ruleSQualifiedName ) ) ;
    public final EObject ruleSGrabDomainRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:279:2: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:280:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:280:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:281:3: ( ruleSQualifiedName )
            {
            // InternalSim.g:281:3: ( ruleSQualifiedName )
            // InternalSim.g:282:4: ruleSQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSGrabDomainRuleRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSGrabDomainRule"


    // $ANTLR start "entryRuleSGrabAggregateRule"
    // InternalSim.g:299:1: entryRuleSGrabAggregateRule returns [EObject current=null] : iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF ;
    public final EObject entryRuleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabAggregateRule = null;


        try {
            // InternalSim.g:299:59: (iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF )
            // InternalSim.g:300:2: iv_ruleSGrabAggregateRule= ruleSGrabAggregateRule EOF
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
    // InternalSim.g:306:1: ruleSGrabAggregateRule returns [EObject current=null] : ( ( ruleSQualifiedName ) ) ;
    public final EObject ruleSGrabAggregateRule() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSim.g:312:2: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:313:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:313:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:314:3: ( ruleSQualifiedName )
            {
            // InternalSim.g:314:3: ( ruleSQualifiedName )
            // InternalSim.g:315:4: ruleSQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSGrabAggregateRuleRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleSGrabPrimitiveRule"
    // InternalSim.g:332:1: entryRuleSGrabPrimitiveRule returns [EObject current=null] : iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF ;
    public final EObject entryRuleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabPrimitiveRule = null;


        try {
            // InternalSim.g:332:59: (iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF )
            // InternalSim.g:333:2: iv_ruleSGrabPrimitiveRule= ruleSGrabPrimitiveRule EOF
            {
             newCompositeNode(grammarAccess.getSGrabPrimitiveRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSGrabPrimitiveRule=ruleSGrabPrimitiveRule();

            state._fsp--;

             current =iv_ruleSGrabPrimitiveRule; 
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
    // $ANTLR end "entryRuleSGrabPrimitiveRule"


    // $ANTLR start "ruleSGrabPrimitiveRule"
    // InternalSim.g:339:1: ruleSGrabPrimitiveRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabPrimitiveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:345:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:346:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:346:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:347:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:347:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:348:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:348:4: ( ruleSQualifiedName )
            // InternalSim.g:349:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabPrimitiveRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0());
            				
            pushFollow(FOLLOW_9);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:363:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSim.g:364:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:368:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:369:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:369:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:370:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSGrabPrimitiveRuleRule());
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
    // $ANTLR end "ruleSGrabPrimitiveRule"


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSim.g:391:1: entryRuleSGrabEnumerationRule returns [EObject current=null] : iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF ;
    public final EObject entryRuleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationRule = null;


        try {
            // InternalSim.g:391:61: (iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF )
            // InternalSim.g:392:2: iv_ruleSGrabEnumerationRule= ruleSGrabEnumerationRule EOF
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
    // InternalSim.g:398:1: ruleSGrabEnumerationRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:404:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:405:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:405:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:406:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:406:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:407:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:407:4: ( ruleSQualifiedName )
            // InternalSim.g:408:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabEnumerationRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0());
            				
            pushFollow(FOLLOW_9);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:422:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSim.g:423:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:427:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:428:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:428:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:429:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:450:1: entryRuleSDitchEnumerationRule returns [EObject current=null] : iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF ;
    public final EObject entryRuleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationRule = null;


        try {
            // InternalSim.g:450:62: (iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF )
            // InternalSim.g:451:2: iv_ruleSDitchEnumerationRule= ruleSDitchEnumerationRule EOF
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
    // InternalSim.g:457:1: ruleSDitchEnumerationRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:463:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:464:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:464:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:465:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:465:3: (otherlv_0= RULE_ID )
            // InternalSim.g:466:4: otherlv_0= RULE_ID
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
    // InternalSim.g:480:1: entryRuleSGrabEnumerationLiteralRule returns [EObject current=null] : iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF ;
    public final EObject entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabEnumerationLiteralRule = null;


        try {
            // InternalSim.g:480:68: (iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:481:2: iv_ruleSGrabEnumerationLiteralRule= ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSim.g:487:1: ruleSGrabEnumerationLiteralRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:493:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:494:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:494:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:495:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:495:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:496:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:496:4: (otherlv_0= RULE_ID )
            // InternalSim.g:497:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabEnumerationLiteralRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:508:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSim.g:509:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:513:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:514:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:514:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:515:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:536:1: entryRuleSDitchEnumerationLiteralRule returns [EObject current=null] : iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF ;
    public final EObject entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchEnumerationLiteralRule = null;


        try {
            // InternalSim.g:536:69: (iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:537:2: iv_ruleSDitchEnumerationLiteralRule= ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSim.g:543:1: ruleSDitchEnumerationLiteralRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchEnumerationLiteralRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:549:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:550:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:550:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:551:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:551:3: (otherlv_0= RULE_ID )
            // InternalSim.g:552:4: otherlv_0= RULE_ID
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
    // InternalSim.g:566:1: entryRuleSGrabComplexTypeRule returns [EObject current=null] : iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF ;
    public final EObject entryRuleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabComplexTypeRule = null;


        try {
            // InternalSim.g:566:61: (iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:567:2: iv_ruleSGrabComplexTypeRule= ruleSGrabComplexTypeRule EOF
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
    // InternalSim.g:573:1: ruleSGrabComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:579:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:580:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:580:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:581:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:581:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:582:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:582:4: ( ruleSQualifiedName )
            // InternalSim.g:583:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_9);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:597:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSim.g:598:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:602:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:603:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:603:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:604:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:625:1: entryRuleSDitchComplexTypeRule returns [EObject current=null] : iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF ;
    public final EObject entryRuleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchComplexTypeRule = null;


        try {
            // InternalSim.g:625:62: (iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:626:2: iv_ruleSDitchComplexTypeRule= ruleSDitchComplexTypeRule EOF
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
    // InternalSim.g:632:1: ruleSDitchComplexTypeRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:638:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:639:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:639:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:640:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:640:3: (otherlv_0= RULE_ID )
            // InternalSim.g:641:4: otherlv_0= RULE_ID
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
    // InternalSim.g:655:1: entryRuleSMorphComplexTypeRule returns [EObject current=null] : iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF ;
    public final EObject entryRuleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphComplexTypeRule = null;


        try {
            // InternalSim.g:655:62: (iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:656:2: iv_ruleSMorphComplexTypeRule= ruleSMorphComplexTypeRule EOF
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
    // InternalSim.g:662:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSim.g:668:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalSim.g:669:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalSim.g:669:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalSim.g:670:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalSim.g:670:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:671:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:671:4: ( ruleSQualifiedName )
            // InternalSim.g:672:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:686:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSim.g:687:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:691:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:692:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:692:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:693:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalSim.g:710:3: (otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSim.g:711:4: otherlv_3= 'extends' otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalSim.g:719:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSim.g:720:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSim.g:720:5: (otherlv_5= RULE_ID )
                    // InternalSim.g:721:6: otherlv_5= RULE_ID
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
    // InternalSim.g:737:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSim.g:737:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:738:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:744:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_renameTo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSim.g:750:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalSim.g:751:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalSim.g:751:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalSim.g:752:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            {
            // InternalSim.g:752:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:753:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:753:4: ( ruleSQualifiedName )
            // InternalSim.g:754:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_13);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:768:3: (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSim.g:769:4: otherlv_1= 'and' ( ( ruleSQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0());
            	    			
            	    // InternalSim.g:773:4: ( ( ruleSQualifiedName ) )
            	    // InternalSim.g:774:5: ( ruleSQualifiedName )
            	    {
            	    // InternalSim.g:774:5: ( ruleSQualifiedName )
            	    // InternalSim.g:775:6: ruleSQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    ruleSQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalSim.g:790:3: (otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:791:4: otherlv_3= 'as' ( (lv_renameTo_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_2_0());
                    			
                    // InternalSim.g:795:4: ( (lv_renameTo_4_0= RULE_ID ) )
                    // InternalSim.g:796:5: (lv_renameTo_4_0= RULE_ID )
                    {
                    // InternalSim.g:796:5: (lv_renameTo_4_0= RULE_ID )
                    // InternalSim.g:797:6: lv_renameTo_4_0= RULE_ID
                    {
                    lv_renameTo_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_renameTo_4_0, grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_2_1_0());
                    					

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

            // InternalSim.g:814:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSim.g:815:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSim.g:819:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSim.g:820:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSim.g:820:5: (otherlv_6= RULE_ID )
                    // InternalSim.g:821:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_3_1_0());
                    					

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
    // InternalSim.g:837:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSim.g:837:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSim.g:838:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
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
    // InternalSim.g:844:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:850:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:851:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:851:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:852:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:852:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:853:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:853:4: (otherlv_0= RULE_ID )
            // InternalSim.g:854:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:865:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSim.g:866:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:870:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:871:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:871:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:872:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:893:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSim.g:893:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSim.g:894:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
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
    // InternalSim.g:900:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? ) ;
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
            // InternalSim.g:906:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? ) )
            // InternalSim.g:907:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? )
            {
            // InternalSim.g:907:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )? )
            // InternalSim.g:908:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )?
            {
            // InternalSim.g:908:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:909:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:909:4: (otherlv_0= RULE_ID )
            // InternalSim.g:910:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:921:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:922:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:926:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:927:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:927:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:928:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalSim.g:945:3: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:946:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0());
                    			
                    // InternalSim.g:950:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSim.g:951:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSim.g:951:5: (otherlv_4= RULE_ID )
                    // InternalSim.g:952:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalSim.g:963:4: ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==44) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==RULE_INT) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSim.g:964:5: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:964:5: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                            // InternalSim.g:965:6: lv_remultiplyTo_5_0= ruleSMultiplicity
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
    // InternalSim.g:987:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSim.g:987:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSim.g:988:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
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
    // InternalSim.g:994:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:1000:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:1001:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:1001:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:1002:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:1002:3: (otherlv_0= RULE_ID )
            // InternalSim.g:1003:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleSDomainProxy"
    // InternalSim.g:1017:1: entryRuleSDomainProxy returns [EObject current=null] : iv_ruleSDomainProxy= ruleSDomainProxy EOF ;
    public final EObject entryRuleSDomainProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDomainProxy = null;


        try {
            // InternalSim.g:1017:53: (iv_ruleSDomainProxy= ruleSDomainProxy EOF )
            // InternalSim.g:1018:2: iv_ruleSDomainProxy= ruleSDomainProxy EOF
            {
             newCompositeNode(grammarAccess.getSDomainProxyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDomainProxy=ruleSDomainProxy();

            state._fsp--;

             current =iv_ruleSDomainProxy; 
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
    // $ANTLR end "entryRuleSDomainProxy"


    // $ANTLR start "ruleSDomainProxy"
    // InternalSim.g:1024:1: ruleSDomainProxy returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) ;
    public final EObject ruleSDomainProxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_deductionRule_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1030:2: ( ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) )
            // InternalSim.g:1031:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            {
            // InternalSim.g:1031:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            // InternalSim.g:1032:3: () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            {
            // InternalSim.g:1032:3: ()
            // InternalSim.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSDomainProxyAccess().getSDomainProxyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSDomainProxyAccess().getGrabKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSDomainProxyAccess().getDomainKeyword_2());
            		
            // InternalSim.g:1047:3: ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            // InternalSim.g:1048:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            {
            // InternalSim.g:1048:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            // InternalSim.g:1049:5: lv_deductionRule_3_0= ruleSGrabDomainRule
            {

            					newCompositeNode(grammarAccess.getSDomainProxyAccess().getDeductionRuleSGrabDomainRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_deductionRule_3_0=ruleSGrabDomainRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSDomainProxyRule());
            					}
            					set(
            						current,
            						"deductionRule",
            						lv_deductionRule_3_0,
            						"com.mimacom.ddd.sm.sim.Sim.SGrabDomainRule");
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
    // $ANTLR end "ruleSDomainProxy"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSim.g:1070:1: entryRuleSAggregate returns [EObject current=null] : iv_ruleSAggregate= ruleSAggregate EOF ;
    public final EObject entryRuleSAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregate = null;


        try {
            // InternalSim.g:1070:51: (iv_ruleSAggregate= ruleSAggregate EOF )
            // InternalSim.g:1071:2: iv_ruleSAggregate= ruleSAggregate EOF
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
    // InternalSim.g:1077:1: ruleSAggregate returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ;
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
            // InternalSim.g:1083:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) )
            // InternalSim.g:1084:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            {
            // InternalSim.g:1084:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            // InternalSim.g:1085:3: () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}'
            {
            // InternalSim.g:1085:3: ()
            // InternalSim.g:1086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSAggregateAccess().getSAggregateAction_0(),
            					current);
            			

            }

            // InternalSim.g:1092:3: ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSim.g:1093:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    {
                    // InternalSim.g:1093:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    // InternalSim.g:1094:5: otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(otherlv_1, grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1());
                    				
                    // InternalSim.g:1102:5: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    // InternalSim.g:1103:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    {
                    // InternalSim.g:1103:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    // InternalSim.g:1104:7: lv_deductionRule_3_0= ruleSGrabAggregateRule
                    {

                    							newCompositeNode(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:1123:4: otherlv_4= 'aggregate'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSim.g:1132:3: ( (lv_types_6_0= ruleSType ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20||(LA18_0>=26 && LA18_0<=27)||(LA18_0>=29 && LA18_0<=30)||(LA18_0>=32 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSim.g:1133:4: (lv_types_6_0= ruleSType )
            	    {
            	    // InternalSim.g:1133:4: (lv_types_6_0= ruleSType )
            	    // InternalSim.g:1134:5: lv_types_6_0= ruleSType
            	    {

            	    					newCompositeNode(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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
    // InternalSim.g:1159:1: entryRuleSType returns [EObject current=null] : iv_ruleSType= ruleSType EOF ;
    public final EObject entryRuleSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSType = null;


        try {
            // InternalSim.g:1159:46: (iv_ruleSType= ruleSType EOF )
            // InternalSim.g:1160:2: iv_ruleSType= ruleSType EOF
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
    // InternalSim.g:1166:1: ruleSType returns [EObject current=null] : (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType ) ;
    public final EObject ruleSType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitive_0 = null;

        EObject this_SEnumeration_1 = null;

        EObject this_SEntityType_2 = null;

        EObject this_SDetailType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:1172:2: ( (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType ) )
            // InternalSim.g:1173:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )
            {
            // InternalSim.g:1173:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1174:3: this_SPrimitive_0= ruleSPrimitive
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
                    // InternalSim.g:1183:3: this_SEnumeration_1= ruleSEnumeration
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
                    // InternalSim.g:1192:3: this_SEntityType_2= ruleSEntityType
                    {

                    			newCompositeNode(grammarAccess.getSTypeAccess().getSEntityTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SEntityType_2=ruleSEntityType();

                    state._fsp--;


                    			current = this_SEntityType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSim.g:1201:3: this_SDetailType_3= ruleSDetailType
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
    // InternalSim.g:1213:1: entryRuleSConstraint returns [EObject current=null] : iv_ruleSConstraint= ruleSConstraint EOF ;
    public final EObject entryRuleSConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSConstraint = null;


        try {
            // InternalSim.g:1213:52: (iv_ruleSConstraint= ruleSConstraint EOF )
            // InternalSim.g:1214:2: iv_ruleSConstraint= ruleSConstraint EOF
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
    // InternalSim.g:1220:1: ruleSConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) ;
    public final EObject ruleSConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1226:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) )
            // InternalSim.g:1227:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            {
            // InternalSim.g:1227:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            // InternalSim.g:1228:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSim.g:1232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1233:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSConstraintAccess().getColonKeyword_2());
            		
            // InternalSim.g:1254:3: ( (lv_condition_3_0= ruleSExpression ) )
            // InternalSim.g:1255:4: (lv_condition_3_0= ruleSExpression )
            {
            // InternalSim.g:1255:4: (lv_condition_3_0= ruleSExpression )
            // InternalSim.g:1256:5: lv_condition_3_0= ruleSExpression
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
    // InternalSim.g:1277:1: entryRuleSPrimitive returns [EObject current=null] : iv_ruleSPrimitive= ruleSPrimitive EOF ;
    public final EObject entryRuleSPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitive = null;


        try {
            // InternalSim.g:1277:51: (iv_ruleSPrimitive= ruleSPrimitive EOF )
            // InternalSim.g:1278:2: iv_ruleSPrimitive= ruleSPrimitive EOF
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
    // InternalSim.g:1284:1: ruleSPrimitive returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) ;
    public final EObject ruleSPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_constraints_11_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1290:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) )
            // InternalSim.g:1291:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
            {
            // InternalSim.g:1291:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
            // InternalSim.g:1292:3: ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}'
            {
            // InternalSim.g:1292:3: ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt20=1;
                }
                break;
            case 27:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSim.g:1293:4: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    {
                    // InternalSim.g:1293:4: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    // InternalSim.g:1294:5: () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    {
                    // InternalSim.g:1294:5: ()
                    // InternalSim.g:1295:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_24); 

                    					newLeafNode(otherlv_1, grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2());
                    				
                    // InternalSim.g:1309:5: ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    // InternalSim.g:1310:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    {
                    // InternalSim.g:1310:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    // InternalSim.g:1311:7: lv_deductionRule_3_0= ruleSGrabPrimitiveRule
                    {

                    							newCompositeNode(grammarAccess.getSPrimitiveAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_deductionRule_3_0=ruleSGrabPrimitiveRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSPrimitiveRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabPrimitiveRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1330:4: (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // InternalSim.g:1330:4: (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) )
                    // InternalSim.g:1331:5: otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0());
                    				
                    // InternalSim.g:1335:5: ( (lv_name_5_0= RULE_ID ) )
                    // InternalSim.g:1336:6: (lv_name_5_0= RULE_ID )
                    {
                    // InternalSim.g:1336:6: (lv_name_5_0= RULE_ID )
                    // InternalSim.g:1337:7: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    							newLeafNode(lv_name_5_0, grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_5_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1355:4: (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalSim.g:1355:4: (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) )
                    // InternalSim.g:1356:5: otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0());
                    				
                    // InternalSim.g:1360:5: ( (lv_name_7_0= RULE_ID ) )
                    // InternalSim.g:1361:6: (lv_name_7_0= RULE_ID )
                    {
                    // InternalSim.g:1361:6: (lv_name_7_0= RULE_ID )
                    // InternalSim.g:1362:7: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    							newLeafNode(lv_name_7_0, grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_7_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,28,FOLLOW_5); 

                    					newLeafNode(otherlv_8, grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_0_2_2());
                    				
                    // InternalSim.g:1382:5: ( (otherlv_9= RULE_ID ) )
                    // InternalSim.g:1383:6: (otherlv_9= RULE_ID )
                    {
                    // InternalSim.g:1383:6: (otherlv_9= RULE_ID )
                    // InternalSim.g:1384:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

                    							newLeafNode(otherlv_9, grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSim.g:1401:3: ( (lv_constraints_11_0= ruleSConstraint ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSim.g:1402:4: (lv_constraints_11_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1402:4: (lv_constraints_11_0= ruleSConstraint )
            	    // InternalSim.g:1403:5: lv_constraints_11_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_constraints_11_0=ruleSConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSPrimitiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_11_0,
            	    						"com.mimacom.ddd.sm.sim.Sim.SConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalSim.g:1428:1: entryRuleSEnumeration returns [EObject current=null] : iv_ruleSEnumeration= ruleSEnumeration EOF ;
    public final EObject entryRuleSEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumeration = null;


        try {
            // InternalSim.g:1428:53: (iv_ruleSEnumeration= ruleSEnumeration EOF )
            // InternalSim.g:1429:2: iv_ruleSEnumeration= ruleSEnumeration EOF
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
    // InternalSim.g:1435:1: ruleSEnumeration returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) ;
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
            // InternalSim.g:1441:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) )
            // InternalSim.g:1442:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            {
            // InternalSim.g:1442:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            // InternalSim.g:1443:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}'
            {
            // InternalSim.g:1443:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 29:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSim.g:1444:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSim.g:1444:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSim.g:1445:5: () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    {
                    // InternalSim.g:1445:5: ()
                    // InternalSim.g:1446:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_27); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2());
                    				
                    // InternalSim.g:1460:5: ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    // InternalSim.g:1461:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSim.g:1461:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    // InternalSim.g:1462:7: lv_deductionRule_3_0= ruleSGrabEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:1481:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    {
                    // InternalSim.g:1481:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    // InternalSim.g:1482:5: () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    {
                    // InternalSim.g:1482:5: ()
                    // InternalSim.g:1483:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_27); 

                    					newLeafNode(otherlv_5, grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2());
                    				
                    // InternalSim.g:1497:5: ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    // InternalSim.g:1498:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    {
                    // InternalSim.g:1498:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    // InternalSim.g:1499:7: lv_deductionRule_7_0= ruleSDitchEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:1518:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    {
                    // InternalSim.g:1518:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    // InternalSim.g:1519:5: otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_8, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0());
                    				
                    // InternalSim.g:1523:5: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:1524:6: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:1524:6: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:1525:7: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_10=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSim.g:1547:3: ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==20||LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSim.g:1548:4: ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    {
                    // InternalSim.g:1548:4: ( (lv_literals_11_0= ruleSLiteral ) )
                    // InternalSim.g:1549:5: (lv_literals_11_0= ruleSLiteral )
                    {
                    // InternalSim.g:1549:5: (lv_literals_11_0= ruleSLiteral )
                    // InternalSim.g:1550:6: lv_literals_11_0= ruleSLiteral
                    {

                    						newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalSim.g:1567:4: (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==31) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSim.g:1568:5: otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) )
                    	    {
                    	    otherlv_12=(Token)match(input,31,FOLLOW_30); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSim.g:1572:5: ( (lv_literals_13_0= ruleSLiteral ) )
                    	    // InternalSim.g:1573:6: (lv_literals_13_0= ruleSLiteral )
                    	    {
                    	    // InternalSim.g:1573:6: (lv_literals_13_0= ruleSLiteral )
                    	    // InternalSim.g:1574:7: lv_literals_13_0= ruleSLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:1593:3: ( (lv_constraints_14_0= ruleSConstraint ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSim.g:1594:4: (lv_constraints_14_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1594:4: (lv_constraints_14_0= ruleSConstraint )
            	    // InternalSim.g:1595:5: lv_constraints_14_0= ruleSConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop25;
                }
            } while (true);

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

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
    // InternalSim.g:1620:1: entryRuleSLiteral returns [EObject current=null] : iv_ruleSLiteral= ruleSLiteral EOF ;
    public final EObject entryRuleSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteral = null;


        try {
            // InternalSim.g:1620:49: (iv_ruleSLiteral= ruleSLiteral EOF )
            // InternalSim.g:1621:2: iv_ruleSLiteral= ruleSLiteral EOF
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
    // InternalSim.g:1627:1: ruleSLiteral returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleSLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1633:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalSim.g:1634:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalSim.g:1634:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt26=1;
                }
                break;
            case 30:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSim.g:1635:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1635:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSim.g:1636:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1636:4: ()
                    // InternalSim.g:1637:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSLiteralAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:1647:4: ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSim.g:1648:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSim.g:1648:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSim.g:1649:6: lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule
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
                    // InternalSim.g:1668:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1668:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSim.g:1669:4: () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1669:4: ()
                    // InternalSim.g:1670:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSLiteralAccess().getDitchKeyword_1_1());
                    			
                    // InternalSim.g:1680:4: ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSim.g:1681:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSim.g:1681:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSim.g:1682:6: lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule
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
                    // InternalSim.g:1701:3: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalSim.g:1701:3: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSim.g:1702:4: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSim.g:1702:4: (lv_name_6_0= RULE_ID )
                    // InternalSim.g:1703:5: lv_name_6_0= RULE_ID
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


    // $ANTLR start "entryRuleSEntityType"
    // InternalSim.g:1723:1: entryRuleSEntityType returns [EObject current=null] : iv_ruleSEntityType= ruleSEntityType EOF ;
    public final EObject entryRuleSEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEntityType = null;


        try {
            // InternalSim.g:1723:52: (iv_ruleSEntityType= ruleSEntityType EOF )
            // InternalSim.g:1724:2: iv_ruleSEntityType= ruleSEntityType EOF
            {
             newCompositeNode(grammarAccess.getSEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEntityType=ruleSEntityType();

            state._fsp--;

             current =iv_ruleSEntityType; 
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
    // $ANTLR end "entryRuleSEntityType"


    // $ANTLR start "ruleSEntityType"
    // InternalSim.g:1730:1: ruleSEntityType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_29= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_abstract_2_0=null;
        Token lv_root_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_abstract_8_0=null;
        Token lv_root_9_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token lv_abstract_14_0=null;
        Token lv_root_15_0=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token lv_abstract_20_0=null;
        Token lv_root_21_0=null;
        Token otherlv_22=null;
        Token lv_abstract_24_0=null;
        Token lv_root_25_0=null;
        Token otherlv_26=null;
        Token lv_name_27_0=null;
        EObject lv_deductionRule_5_0 = null;

        EObject lv_deductionRule_11_0 = null;

        EObject lv_deductionRule_17_0 = null;

        EObject lv_deductionRule_23_0 = null;

        EObject this_SComplexTypeExtends_28 = null;

        EObject this_SComplexTypeFeatures_29 = null;



        	enterRule();

        try {
            // InternalSim.g:1736:2: ( ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_29= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:1737:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_29= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:1737:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_29= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:1738:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_29= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:1738:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt37=1;
                }
                break;
            case 30:
                {
                alt37=2;
                }
                break;
            case 35:
                {
                alt37=3;
                }
                break;
            case 36:
                {
                alt37=4;
                }
                break;
            case 32:
            case 33:
            case 34:
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
                    // InternalSim.g:1739:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1739:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:1740:5: () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_root_3_0= 'root' ) )? otherlv_4= 'entity' ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:1740:5: ()
                    // InternalSim.g:1741:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_31); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEntityTypeAccess().getGrabKeyword_0_0_1());
                    				
                    // InternalSim.g:1751:5: ( (lv_abstract_2_0= 'abstract' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSim.g:1752:6: (lv_abstract_2_0= 'abstract' )
                            {
                            // InternalSim.g:1752:6: (lv_abstract_2_0= 'abstract' )
                            // InternalSim.g:1753:7: lv_abstract_2_0= 'abstract'
                            {
                            lv_abstract_2_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_abstract_2_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:1765:5: ( (lv_root_3_0= 'root' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==33) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSim.g:1766:6: (lv_root_3_0= 'root' )
                            {
                            // InternalSim.g:1766:6: (lv_root_3_0= 'root' )
                            // InternalSim.g:1767:7: lv_root_3_0= 'root'
                            {
                            lv_root_3_0=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(lv_root_3_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_0_4());
                    				
                    // InternalSim.g:1783:5: ( (lv_deductionRule_5_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:1784:6: (lv_deductionRule_5_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:1784:6: (lv_deductionRule_5_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:1785:7: lv_deductionRule_5_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_5_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_deductionRule_5_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_5_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1804:4: ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1804:4: ( () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:1805:5: () otherlv_7= 'ditch' ( (lv_abstract_8_0= 'abstract' ) )? ( (lv_root_9_0= 'root' ) )? otherlv_10= 'entity' ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:1805:5: ()
                    // InternalSim.g:1806:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_31); 

                    					newLeafNode(otherlv_7, grammarAccess.getSEntityTypeAccess().getDitchKeyword_0_1_1());
                    				
                    // InternalSim.g:1816:5: ( (lv_abstract_8_0= 'abstract' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==32) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSim.g:1817:6: (lv_abstract_8_0= 'abstract' )
                            {
                            // InternalSim.g:1817:6: (lv_abstract_8_0= 'abstract' )
                            // InternalSim.g:1818:7: lv_abstract_8_0= 'abstract'
                            {
                            lv_abstract_8_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_abstract_8_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:1830:5: ( (lv_root_9_0= 'root' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==33) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSim.g:1831:6: (lv_root_9_0= 'root' )
                            {
                            // InternalSim.g:1831:6: (lv_root_9_0= 'root' )
                            // InternalSim.g:1832:7: lv_root_9_0= 'root'
                            {
                            lv_root_9_0=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(lv_root_9_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_10, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_1_4());
                    				
                    // InternalSim.g:1848:5: ( (lv_deductionRule_11_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:1849:6: (lv_deductionRule_11_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:1849:6: (lv_deductionRule_11_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:1850:7: lv_deductionRule_11_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_deductionRule_11_0=ruleSDitchComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_11_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1869:4: ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1869:4: ( () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:1870:5: () otherlv_13= 'morph' ( (lv_abstract_14_0= 'abstract' ) )? ( (lv_root_15_0= 'root' ) )? otherlv_16= 'entity' ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:1870:5: ()
                    // InternalSim.g:1871:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_13=(Token)match(input,35,FOLLOW_31); 

                    					newLeafNode(otherlv_13, grammarAccess.getSEntityTypeAccess().getMorphKeyword_0_2_1());
                    				
                    // InternalSim.g:1881:5: ( (lv_abstract_14_0= 'abstract' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSim.g:1882:6: (lv_abstract_14_0= 'abstract' )
                            {
                            // InternalSim.g:1882:6: (lv_abstract_14_0= 'abstract' )
                            // InternalSim.g:1883:7: lv_abstract_14_0= 'abstract'
                            {
                            lv_abstract_14_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_abstract_14_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:1895:5: ( (lv_root_15_0= 'root' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSim.g:1896:6: (lv_root_15_0= 'root' )
                            {
                            // InternalSim.g:1896:6: (lv_root_15_0= 'root' )
                            // InternalSim.g:1897:7: lv_root_15_0= 'root'
                            {
                            lv_root_15_0=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(lv_root_15_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_16, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_2_4());
                    				
                    // InternalSim.g:1913:5: ( (lv_deductionRule_17_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:1914:6: (lv_deductionRule_17_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:1914:6: (lv_deductionRule_17_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:1915:7: lv_deductionRule_17_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_5_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_deductionRule_17_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_17_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1934:4: ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1934:4: ( () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:1935:5: () otherlv_19= 'fuse' ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:1935:5: ()
                    // InternalSim.g:1936:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_19=(Token)match(input,36,FOLLOW_31); 

                    					newLeafNode(otherlv_19, grammarAccess.getSEntityTypeAccess().getFuseKeyword_0_3_1());
                    				
                    // InternalSim.g:1946:5: ( (lv_abstract_20_0= 'abstract' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==32) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSim.g:1947:6: (lv_abstract_20_0= 'abstract' )
                            {
                            // InternalSim.g:1947:6: (lv_abstract_20_0= 'abstract' )
                            // InternalSim.g:1948:7: lv_abstract_20_0= 'abstract'
                            {
                            lv_abstract_20_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_abstract_20_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:1960:5: ( (lv_root_21_0= 'root' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==33) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSim.g:1961:6: (lv_root_21_0= 'root' )
                            {
                            // InternalSim.g:1961:6: (lv_root_21_0= 'root' )
                            // InternalSim.g:1962:7: lv_root_21_0= 'root'
                            {
                            lv_root_21_0=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(lv_root_21_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_22, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_3_4());
                    				
                    // InternalSim.g:1978:5: ( (lv_deductionRule_23_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:1979:6: (lv_deductionRule_23_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:1979:6: (lv_deductionRule_23_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:1980:7: lv_deductionRule_23_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_5_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_deductionRule_23_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_23_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1999:4: ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:1999:4: ( ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:2000:5: ( (lv_abstract_24_0= 'abstract' ) )? ( (lv_root_25_0= 'root' ) )? otherlv_26= 'entity' ( (lv_name_27_0= RULE_ID ) ) this_SComplexTypeExtends_28= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:2000:5: ( (lv_abstract_24_0= 'abstract' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==32) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalSim.g:2001:6: (lv_abstract_24_0= 'abstract' )
                            {
                            // InternalSim.g:2001:6: (lv_abstract_24_0= 'abstract' )
                            // InternalSim.g:2002:7: lv_abstract_24_0= 'abstract'
                            {
                            lv_abstract_24_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_abstract_24_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2014:5: ( (lv_root_25_0= 'root' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==33) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalSim.g:2015:6: (lv_root_25_0= 'root' )
                            {
                            // InternalSim.g:2015:6: (lv_root_25_0= 'root' )
                            // InternalSim.g:2016:7: lv_root_25_0= 'root'
                            {
                            lv_root_25_0=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(lv_root_25_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_26, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_4_2());
                    				
                    // InternalSim.g:2032:5: ( (lv_name_27_0= RULE_ID ) )
                    // InternalSim.g:2033:6: (lv_name_27_0= RULE_ID )
                    {
                    // InternalSim.g:2033:6: (lv_name_27_0= RULE_ID )
                    // InternalSim.g:2034:7: lv_name_27_0= RULE_ID
                    {
                    lv_name_27_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    							newLeafNode(lv_name_27_0, grammarAccess.getSEntityTypeAccess().getNameIDTerminalRuleCall_0_4_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSEntityTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_27_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSEntityTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSEntityTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_4());
                    				
                    pushFollow(FOLLOW_20);
                    this_SComplexTypeExtends_28=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_28;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSEntityTypeRule());
            			}
            			newCompositeNode(grammarAccess.getSEntityTypeAccess().getSComplexTypeFeaturesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SComplexTypeFeatures_29=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_29;
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
    // $ANTLR end "ruleSEntityType"


    // $ANTLR start "entryRuleSDetailType"
    // InternalSim.g:2078:1: entryRuleSDetailType returns [EObject current=null] : iv_ruleSDetailType= ruleSDetailType EOF ;
    public final EObject entryRuleSDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailType = null;


        try {
            // InternalSim.g:2078:52: (iv_ruleSDetailType= ruleSDetailType EOF )
            // InternalSim.g:2079:2: iv_ruleSDetailType= ruleSDetailType EOF
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
    // InternalSim.g:2085:1: ruleSDetailType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) ;
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
            // InternalSim.g:2091:2: ( ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:2092:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:2092:2: ( ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:2093:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_24= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:2093:3: ( ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt43=1;
                }
                break;
            case 30:
                {
                alt43=2;
                }
                break;
            case 35:
                {
                alt43=3;
                }
                break;
            case 36:
                {
                alt43=4;
                }
                break;
            case 32:
            case 37:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSim.g:2094:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2094:4: ( () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:2095:5: () otherlv_1= 'grab' ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'detail' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:2095:5: ()
                    // InternalSim.g:2096:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1());
                    				
                    // InternalSim.g:2106:5: ( (lv_abstract_2_0= 'abstract' ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==32) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSim.g:2107:6: (lv_abstract_2_0= 'abstract' )
                            {
                            // InternalSim.g:2107:6: (lv_abstract_2_0= 'abstract' )
                            // InternalSim.g:2108:7: lv_abstract_2_0= 'abstract'
                            {
                            lv_abstract_2_0=(Token)match(input,32,FOLLOW_36); 

                            							newLeafNode(lv_abstract_2_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3());
                    				
                    // InternalSim.g:2124:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:2125:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:2125:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:2126:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:2145:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2145:4: ( () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2146:5: () otherlv_6= 'ditch' ( (lv_abstract_7_0= 'abstract' ) )? otherlv_8= 'detail' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:2146:5: ()
                    // InternalSim.g:2147:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_35); 

                    					newLeafNode(otherlv_6, grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1());
                    				
                    // InternalSim.g:2157:5: ( (lv_abstract_7_0= 'abstract' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==32) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSim.g:2158:6: (lv_abstract_7_0= 'abstract' )
                            {
                            // InternalSim.g:2158:6: (lv_abstract_7_0= 'abstract' )
                            // InternalSim.g:2159:7: lv_abstract_7_0= 'abstract'
                            {
                            lv_abstract_7_0=(Token)match(input,32,FOLLOW_36); 

                            							newLeafNode(lv_abstract_7_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_8, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3());
                    				
                    // InternalSim.g:2175:5: ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2176:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2176:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2177:7: lv_deductionRule_9_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:2196:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2196:4: ( () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2197:5: () otherlv_11= 'morph' ( (lv_abstract_12_0= 'abstract' ) )? otherlv_13= 'detail' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:2197:5: ()
                    // InternalSim.g:2198:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_35); 

                    					newLeafNode(otherlv_11, grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1());
                    				
                    // InternalSim.g:2208:5: ( (lv_abstract_12_0= 'abstract' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==32) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalSim.g:2209:6: (lv_abstract_12_0= 'abstract' )
                            {
                            // InternalSim.g:2209:6: (lv_abstract_12_0= 'abstract' )
                            // InternalSim.g:2210:7: lv_abstract_12_0= 'abstract'
                            {
                            lv_abstract_12_0=(Token)match(input,32,FOLLOW_36); 

                            							newLeafNode(lv_abstract_12_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_13, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3());
                    				
                    // InternalSim.g:2226:5: ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2227:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2227:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2228:7: lv_deductionRule_14_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:2247:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2247:4: ( () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2248:5: () otherlv_16= 'fuse' ( (lv_abstract_17_0= 'abstract' ) )? otherlv_18= 'detail' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:2248:5: ()
                    // InternalSim.g:2249:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_16=(Token)match(input,36,FOLLOW_35); 

                    					newLeafNode(otherlv_16, grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1());
                    				
                    // InternalSim.g:2259:5: ( (lv_abstract_17_0= 'abstract' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==32) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSim.g:2260:6: (lv_abstract_17_0= 'abstract' )
                            {
                            // InternalSim.g:2260:6: (lv_abstract_17_0= 'abstract' )
                            // InternalSim.g:2261:7: lv_abstract_17_0= 'abstract'
                            {
                            lv_abstract_17_0=(Token)match(input,32,FOLLOW_36); 

                            							newLeafNode(lv_abstract_17_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_18, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3());
                    				
                    // InternalSim.g:2277:5: ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2278:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2278:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2279:7: lv_deductionRule_19_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0());
                    						
                    pushFollow(FOLLOW_20);
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
                    // InternalSim.g:2298:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:2298:4: ( ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:2299:5: ( (lv_abstract_20_0= 'abstract' ) )? otherlv_21= 'detail' ( (lv_name_22_0= RULE_ID ) ) this_SComplexTypeExtends_23= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:2299:5: ( (lv_abstract_20_0= 'abstract' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==32) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSim.g:2300:6: (lv_abstract_20_0= 'abstract' )
                            {
                            // InternalSim.g:2300:6: (lv_abstract_20_0= 'abstract' )
                            // InternalSim.g:2301:7: lv_abstract_20_0= 'abstract'
                            {
                            lv_abstract_20_0=(Token)match(input,32,FOLLOW_36); 

                            							newLeafNode(lv_abstract_20_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_21, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1());
                    				
                    // InternalSim.g:2317:5: ( (lv_name_22_0= RULE_ID ) )
                    // InternalSim.g:2318:6: (lv_name_22_0= RULE_ID )
                    {
                    // InternalSim.g:2318:6: (lv_name_22_0= RULE_ID )
                    // InternalSim.g:2319:7: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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
                    				
                    pushFollow(FOLLOW_20);
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
    // InternalSim.g:2364:1: ruleSComplexTypeExtends[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? ;
    public final EObject ruleSComplexTypeExtends(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSim.g:2370:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? )
            // InternalSim.g:2371:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            {
            // InternalSim.g:2371:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSim.g:2372:3: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_5); 

                    			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0());
                    		
                    // InternalSim.g:2376:3: ( (otherlv_1= RULE_ID ) )
                    // InternalSim.g:2377:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSim.g:2377:4: (otherlv_1= RULE_ID )
                    // InternalSim.g:2378:5: otherlv_1= RULE_ID
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
    // InternalSim.g:2394:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2400:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSim.g:2401:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSim.g:2401:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            // InternalSim.g:2402:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSim.g:2406:3: ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID||LA45_0==20||LA45_0==30||LA45_0==35||(LA45_0>=37 && LA45_0<=40)||LA45_0==54) ) {
                    alt45=1;
                }
                else if ( (LA45_0==25) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSim.g:2407:4: ( (lv_features_1_0= ruleSFeature ) )
            	    {
            	    // InternalSim.g:2407:4: ( (lv_features_1_0= ruleSFeature ) )
            	    // InternalSim.g:2408:5: (lv_features_1_0= ruleSFeature )
            	    {
            	    // InternalSim.g:2408:5: (lv_features_1_0= ruleSFeature )
            	    // InternalSim.g:2409:6: lv_features_1_0= ruleSFeature
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesSFeatureParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    // InternalSim.g:2427:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    {
            	    // InternalSim.g:2427:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    // InternalSim.g:2428:5: (lv_constraints_2_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:2428:5: (lv_constraints_2_0= ruleSConstraint )
            	    // InternalSim.g:2429:6: lv_constraints_2_0= ruleSConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsSConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalSim.g:2455:1: entryRuleSFeature returns [EObject current=null] : iv_ruleSFeature= ruleSFeature EOF ;
    public final EObject entryRuleSFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFeature = null;


        try {
            // InternalSim.g:2455:49: (iv_ruleSFeature= ruleSFeature EOF )
            // InternalSim.g:2456:2: iv_ruleSFeature= ruleSFeature EOF
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
    // InternalSim.g:2462:1: ruleSFeature returns [EObject current=null] : (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) ;
    public final EObject ruleSFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociation_0 = null;

        EObject this_SAttribute_1 = null;

        EObject this_SQuery_2 = null;



        	enterRule();

        try {
            // InternalSim.g:2468:2: ( (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) )
            // InternalSim.g:2469:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            {
            // InternalSim.g:2469:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt46=3;
                    }
                    break;
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt46=2;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt46=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 39:
                    {
                    alt46=1;
                    }
                    break;
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt46=2;
                    }
                    break;
                case 43:
                    {
                    alt46=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }

                }
                break;
            case 30:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 39:
                    {
                    alt46=1;
                    }
                    break;
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt46=2;
                    }
                    break;
                case 43:
                    {
                    alt46=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;
                }

                }
                break;
            case 38:
            case 39:
            case 40:
            case 54:
                {
                alt46=1;
                }
                break;
            case 37:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
                {
                int LA46_6 = input.LA(2);

                if ( (LA46_6==19) ) {
                    alt46=2;
                }
                else if ( (LA46_6==44) ) {
                    alt46=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSim.g:2470:3: this_SAssociation_0= ruleSAssociation
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
                    // InternalSim.g:2479:3: this_SAttribute_1= ruleSAttribute
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
                    // InternalSim.g:2488:3: this_SQuery_2= ruleSQuery
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
    // InternalSim.g:2500:1: entryRuleSAssociation returns [EObject current=null] : iv_ruleSAssociation= ruleSAssociation EOF ;
    public final EObject entryRuleSAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociation = null;


        try {
            // InternalSim.g:2500:53: (iv_ruleSAssociation= ruleSAssociation EOF )
            // InternalSim.g:2501:2: iv_ruleSAssociation= ruleSAssociation EOF
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
    // InternalSim.g:2507:1: ruleSAssociation returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) ;
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
            // InternalSim.g:2513:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:2514:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:2514:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt53=1;
                }
                break;
            case 35:
                {
                alt53=2;
                }
                break;
            case 30:
                {
                alt53=3;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 54:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalSim.g:2515:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2515:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2516:4: () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2516:4: ()
                    // InternalSim.g:2517:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAssociationAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2527:4: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==38) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==39) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalSim.g:2528:5: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2533:5: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2538:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2539:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2539:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2540:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:2559:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2559:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2560:4: () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2560:4: ()
                    // InternalSim.g:2561:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAssociationAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2571:4: (otherlv_7= 'reference' | otherlv_8= 'composite' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==38) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==39) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalSim.g:2572:5: otherlv_7= 'reference'
                            {
                            otherlv_7=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2577:5: otherlv_8= 'composite'
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2582:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2583:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2583:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2584:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:2603:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2603:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2604:4: () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2604:4: ()
                    // InternalSim.g:2605:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_38); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAssociationAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2615:4: (otherlv_12= 'reference' | otherlv_13= 'composite' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==38) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==39) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalSim.g:2616:5: otherlv_12= 'reference'
                            {
                            otherlv_12=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2621:5: otherlv_13= 'composite'
                            {
                            otherlv_13=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_13, grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2626:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2627:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2627:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2628:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:2647:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:2647:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:2648:4: ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:2648:4: ( (lv_derived_15_0= 'derived' ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==40) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalSim.g:2649:5: (lv_derived_15_0= 'derived' )
                            {
                            // InternalSim.g:2649:5: (lv_derived_15_0= 'derived' )
                            // InternalSim.g:2650:6: lv_derived_15_0= 'derived'
                            {
                            lv_derived_15_0=(Token)match(input,40,FOLLOW_39); 

                            						newLeafNode(lv_derived_15_0, grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAssociationRule());
                            						}
                            						setWithLastConsumed(current, "derived", true, "derived");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2662:4: ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=38 && LA51_0<=39)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==54) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSim.g:2663:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            {
                            // InternalSim.g:2663:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            // InternalSim.g:2664:6: (lv_kind_16_0= ruleSAssociationKind )
                            {
                            // InternalSim.g:2664:6: (lv_kind_16_0= ruleSAssociationKind )
                            // InternalSim.g:2665:7: lv_kind_16_0= ruleSAssociationKind
                            {

                            							newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_5);
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
                            // InternalSim.g:2683:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            {
                            // InternalSim.g:2683:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            // InternalSim.g:2684:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite'
                            {
                            // InternalSim.g:2684:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) )
                            // InternalSim.g:2685:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            {
                            // InternalSim.g:2685:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            // InternalSim.g:2686:8: lv_kind_17_0= ruleSAssociationKindInverse
                            {

                            								newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0());
                            							
                            pushFollow(FOLLOW_40);
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

                            otherlv_18=(Token)match(input,39,FOLLOW_5); 

                            						newLeafNode(otherlv_18, grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2709:4: ( (lv_name_19_0= RULE_ID ) )
                    // InternalSim.g:2710:5: (lv_name_19_0= RULE_ID )
                    {
                    // InternalSim.g:2710:5: (lv_name_19_0= RULE_ID )
                    // InternalSim.g:2711:6: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

                    otherlv_20=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getSAssociationAccess().getColonKeyword_3_3());
                    			
                    // InternalSim.g:2731:4: ( (otherlv_21= RULE_ID ) )
                    // InternalSim.g:2732:5: (otherlv_21= RULE_ID )
                    {
                    // InternalSim.g:2732:5: (otherlv_21= RULE_ID )
                    // InternalSim.g:2733:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_21, grammarAccess.getSAssociationAccess().getTypeSEntityTypeCrossReference_3_4_0());
                    					

                    }


                    }

                    // InternalSim.g:2744:4: ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==44) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalSim.g:2745:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2745:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            // InternalSim.g:2746:6: lv_multiplicity_22_0= ruleSMultiplicity
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
    // InternalSim.g:2768:1: entryRuleSAttribute returns [EObject current=null] : iv_ruleSAttribute= ruleSAttribute EOF ;
    public final EObject entryRuleSAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttribute = null;


        try {
            // InternalSim.g:2768:51: (iv_ruleSAttribute= ruleSAttribute EOF )
            // InternalSim.g:2769:2: iv_ruleSAttribute= ruleSAttribute EOF
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
    // InternalSim.g:2775:1: ruleSAttribute returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) ;
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
            // InternalSim.g:2781:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) )
            // InternalSim.g:2782:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            {
            // InternalSim.g:2782:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt60=1;
                }
                break;
            case 35:
                {
                alt60=2;
                }
                break;
            case 30:
                {
                alt60=3;
                }
                break;
            case RULE_ID:
            case 37:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSim.g:2783:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2783:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2784:4: () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2784:4: ()
                    // InternalSim.g:2785:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAttributeAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2795:4: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt54=3;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==41) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==37) ) {
                        alt54=2;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSim.g:2796:5: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2801:5: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalSim.g:2801:5: ( (lv_detail_3_0= 'detail' ) )
                            // InternalSim.g:2802:6: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSim.g:2802:6: (lv_detail_3_0= 'detail' )
                            // InternalSim.g:2803:7: lv_detail_3_0= 'detail'
                            {
                            lv_detail_3_0=(Token)match(input,37,FOLLOW_5); 

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

                    // InternalSim.g:2816:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2817:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2817:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2818:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:2837:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2837:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2838:4: () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2838:4: ()
                    // InternalSim.g:2839:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAttributeAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2849:4: (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==41) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==37) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSim.g:2850:5: otherlv_7= 'attribute'
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2855:5: ( (lv_detail_8_0= 'detail' ) )
                            {
                            // InternalSim.g:2855:5: ( (lv_detail_8_0= 'detail' ) )
                            // InternalSim.g:2856:6: (lv_detail_8_0= 'detail' )
                            {
                            // InternalSim.g:2856:6: (lv_detail_8_0= 'detail' )
                            // InternalSim.g:2857:7: lv_detail_8_0= 'detail'
                            {
                            lv_detail_8_0=(Token)match(input,37,FOLLOW_5); 

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

                    // InternalSim.g:2870:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2871:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2871:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2872:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:2891:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2891:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2892:4: () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2892:4: ()
                    // InternalSim.g:2893:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAttributeAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2903:4: (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )?
                    int alt56=3;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==41) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==37) ) {
                        alt56=2;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSim.g:2904:5: otherlv_12= 'attribute'
                            {
                            otherlv_12=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2909:5: ( (lv_detail_13_0= 'detail' ) )
                            {
                            // InternalSim.g:2909:5: ( (lv_detail_13_0= 'detail' ) )
                            // InternalSim.g:2910:6: (lv_detail_13_0= 'detail' )
                            {
                            // InternalSim.g:2910:6: (lv_detail_13_0= 'detail' )
                            // InternalSim.g:2911:7: lv_detail_13_0= 'detail'
                            {
                            lv_detail_13_0=(Token)match(input,37,FOLLOW_5); 

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

                    // InternalSim.g:2924:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2925:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2925:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2926:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:2945:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    {
                    // InternalSim.g:2945:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    // InternalSim.g:2946:4: ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )?
                    {
                    // InternalSim.g:2946:4: ( (lv_detail_15_0= 'detail' ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==37) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSim.g:2947:5: (lv_detail_15_0= 'detail' )
                            {
                            // InternalSim.g:2947:5: (lv_detail_15_0= 'detail' )
                            // InternalSim.g:2948:6: lv_detail_15_0= 'detail'
                            {
                            lv_detail_15_0=(Token)match(input,37,FOLLOW_5); 

                            						newLeafNode(lv_detail_15_0, grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAttributeRule());
                            						}
                            						setWithLastConsumed(current, "detail", true, "detail");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2960:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalSim.g:2961:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalSim.g:2961:5: (lv_name_16_0= RULE_ID )
                    // InternalSim.g:2962:6: lv_name_16_0= RULE_ID
                    {
                    lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

                    otherlv_17=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getSAttributeAccess().getColonKeyword_3_2());
                    			
                    // InternalSim.g:2982:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSim.g:2983:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSim.g:2983:5: (otherlv_18= RULE_ID )
                    // InternalSim.g:2984:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_18, grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0());
                    					

                    }


                    }

                    // InternalSim.g:2995:4: ( (lv_multiplicity_19_0= ruleSMultiplicity ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==44) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSim.g:2996:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2996:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            // InternalSim.g:2997:6: lv_multiplicity_19_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0());
                            					
                            pushFollow(FOLLOW_43);
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

                    // InternalSim.g:3014:4: ( (lv_key_20_0= 'key' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==42) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalSim.g:3015:5: (lv_key_20_0= 'key' )
                            {
                            // InternalSim.g:3015:5: (lv_key_20_0= 'key' )
                            // InternalSim.g:3016:6: lv_key_20_0= 'key'
                            {
                            lv_key_20_0=(Token)match(input,42,FOLLOW_2); 

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
    // InternalSim.g:3033:1: entryRuleSQuery returns [EObject current=null] : iv_ruleSQuery= ruleSQuery EOF ;
    public final EObject entryRuleSQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQuery = null;


        try {
            // InternalSim.g:3033:47: (iv_ruleSQuery= ruleSQuery EOF )
            // InternalSim.g:3034:2: iv_ruleSQuery= ruleSQuery EOF
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
    // InternalSim.g:3040:1: ruleSQuery returns [EObject current=null] : ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) ;
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
            // InternalSim.g:3046:2: ( ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) )
            // InternalSim.g:3047:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            {
            // InternalSim.g:3047:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 20:
            case 35:
                {
                alt69=1;
                }
                break;
            case 30:
                {
                alt69=2;
                }
                break;
            case RULE_ID:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalSim.g:3048:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    {
                    // InternalSim.g:3048:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    // InternalSim.g:3049:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')'
                    {
                    // InternalSim.g:3049:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==20) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==35) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalSim.g:3050:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSim.g:3050:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            // InternalSim.g:3051:6: () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            {
                            // InternalSim.g:3051:6: ()
                            // InternalSim.g:3052:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_1=(Token)match(input,20,FOLLOW_44); 

                            						newLeafNode(otherlv_1, grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1());
                            					
                            otherlv_2=(Token)match(input,43,FOLLOW_5); 

                            						newLeafNode(otherlv_2, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2());
                            					
                            // InternalSim.g:3066:6: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            // InternalSim.g:3067:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            {
                            // InternalSim.g:3067:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            // InternalSim.g:3068:8: lv_deductionRule_3_0= ruleSGrabFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_3_0());
                            							
                            pushFollow(FOLLOW_45);
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
                            // InternalSim.g:3087:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSim.g:3087:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            // InternalSim.g:3088:6: () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            {
                            // InternalSim.g:3088:6: ()
                            // InternalSim.g:3089:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_5=(Token)match(input,35,FOLLOW_44); 

                            						newLeafNode(otherlv_5, grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1());
                            					
                            otherlv_6=(Token)match(input,43,FOLLOW_5); 

                            						newLeafNode(otherlv_6, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2());
                            					
                            // InternalSim.g:3103:6: ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            // InternalSim.g:3104:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            {
                            // InternalSim.g:3104:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            // InternalSim.g:3105:8: lv_deductionRule_7_0= ruleSMorphFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_3_0());
                            							
                            pushFollow(FOLLOW_45);
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

                    otherlv_8=(Token)match(input,44,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSim.g:3128:4: (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==45) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==RULE_ID||LA64_0==20||LA64_0==30||LA64_0==35||LA64_0==46) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalSim.g:3129:5: otherlv_9= '*'
                            {
                            otherlv_9=(Token)match(input,45,FOLLOW_47); 

                            					newLeafNode(otherlv_9, grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3134:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            {
                            // InternalSim.g:3134:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==RULE_ID||LA63_0==20||LA63_0==30||LA63_0==35) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalSim.g:3135:6: ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    {
                                    // InternalSim.g:3135:6: ( (lv_parameters_10_0= ruleSQueryParameter ) )
                                    // InternalSim.g:3136:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    {
                                    // InternalSim.g:3136:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    // InternalSim.g:3137:8: lv_parameters_10_0= ruleSQueryParameter
                                    {

                                    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0());
                                    							
                                    pushFollow(FOLLOW_48);
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

                                    // InternalSim.g:3154:6: (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    loop62:
                                    do {
                                        int alt62=2;
                                        int LA62_0 = input.LA(1);

                                        if ( (LA62_0==31) ) {
                                            alt62=1;
                                        }


                                        switch (alt62) {
                                    	case 1 :
                                    	    // InternalSim.g:3155:7: otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,31,FOLLOW_49); 

                                    	    							newLeafNode(otherlv_11, grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0());
                                    	    						
                                    	    // InternalSim.g:3159:7: ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    // InternalSim.g:3160:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    {
                                    	    // InternalSim.g:3160:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    // InternalSim.g:3161:9: lv_parameters_12_0= ruleSQueryParameter
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_48);
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
                                    	    break loop62;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3187:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3187:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3188:4: otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getSQueryAccess().getDitchKeyword_1_0());
                    			
                    otherlv_15=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getSQueryAccess().getQueryKeyword_1_1());
                    			
                    // InternalSim.g:3196:4: ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3197:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3197:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3198:6: lv_deductionRule_16_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:3217:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    {
                    // InternalSim.g:3217:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    // InternalSim.g:3218:4: ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    {
                    // InternalSim.g:3218:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalSim.g:3219:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalSim.g:3219:5: (lv_name_17_0= RULE_ID )
                    // InternalSim.g:3220:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_45); 

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

                    otherlv_18=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_18, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSim.g:3240:4: ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID||LA66_0==20||LA66_0==30||LA66_0==35) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalSim.g:3241:5: ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            {
                            // InternalSim.g:3241:5: ( (lv_parameters_19_0= ruleSQueryParameter ) )
                            // InternalSim.g:3242:6: (lv_parameters_19_0= ruleSQueryParameter )
                            {
                            // InternalSim.g:3242:6: (lv_parameters_19_0= ruleSQueryParameter )
                            // InternalSim.g:3243:7: lv_parameters_19_0= ruleSQueryParameter
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_48);
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

                            // InternalSim.g:3260:5: (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==31) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // InternalSim.g:3261:6: otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    {
                            	    otherlv_20=(Token)match(input,31,FOLLOW_49); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalSim.g:3265:6: ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    // InternalSim.g:3266:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    {
                            	    // InternalSim.g:3266:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    // InternalSim.g:3267:8: lv_parameters_21_0= ruleSQueryParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_48);
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
                            	    break loop65;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,46,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3());
                    			
                    otherlv_23=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getSQueryAccess().getColonKeyword_2_4());
                    			
                    // InternalSim.g:3294:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSim.g:3295:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSim.g:3295:5: (otherlv_24= RULE_ID )
                    // InternalSim.g:3296:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_51); 

                    						newLeafNode(otherlv_24, grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0());
                    					

                    }


                    }

                    // InternalSim.g:3307:4: ( (lv_multiplicity_25_0= ruleSMultiplicity ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==44) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalSim.g:3308:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3308:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            // InternalSim.g:3309:6: lv_multiplicity_25_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0());
                            					
                            pushFollow(FOLLOW_52);
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

                    // InternalSim.g:3326:4: (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==47) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalSim.g:3327:5: otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) )
                            {
                            otherlv_26=(Token)match(input,47,FOLLOW_23); 

                            					newLeafNode(otherlv_26, grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0());
                            				
                            // InternalSim.g:3331:5: ( (lv_returns_27_0= ruleSExpression ) )
                            // InternalSim.g:3332:6: (lv_returns_27_0= ruleSExpression )
                            {
                            // InternalSim.g:3332:6: (lv_returns_27_0= ruleSExpression )
                            // InternalSim.g:3333:7: lv_returns_27_0= ruleSExpression
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
    // InternalSim.g:3356:1: entryRuleSQueryParameter returns [EObject current=null] : iv_ruleSQueryParameter= ruleSQueryParameter EOF ;
    public final EObject entryRuleSQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameter = null;


        try {
            // InternalSim.g:3356:56: (iv_ruleSQueryParameter= ruleSQueryParameter EOF )
            // InternalSim.g:3357:2: iv_ruleSQueryParameter= ruleSQueryParameter EOF
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
    // InternalSim.g:3363:1: ruleSQueryParameter returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) ;
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
            // InternalSim.g:3369:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:3370:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:3370:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt71=1;
                }
                break;
            case 35:
                {
                alt71=2;
                }
                break;
            case 30:
                {
                alt71=3;
                }
                break;
            case RULE_ID:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalSim.g:3371:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:3371:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:3372:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:3372:4: ()
                    // InternalSim.g:3373:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:3383:4: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3384:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3384:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3385:6: lv_deductionRule_2_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:3404:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3404:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3405:4: () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:3405:4: ()
                    // InternalSim.g:3406:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:3416:4: ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3417:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3417:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3418:6: lv_deductionRule_5_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:3437:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3437:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3438:4: () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:3438:4: ()
                    // InternalSim.g:3439:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:3449:4: ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3450:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3450:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3451:6: lv_deductionRule_8_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:3470:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:3470:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:3471:4: ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:3471:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:3472:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:3472:5: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:3473:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

                    otherlv_10=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1());
                    			
                    // InternalSim.g:3493:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSim.g:3494:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSim.g:3494:5: (otherlv_11= RULE_ID )
                    // InternalSim.g:3495:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_11, grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalSim.g:3506:4: ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==44) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalSim.g:3507:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3507:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            // InternalSim.g:3508:6: lv_multiplicity_12_0= ruleSMultiplicity
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
    // InternalSim.g:3530:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalSim.g:3530:52: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalSim.g:3531:2: iv_ruleSExpression= ruleSExpression EOF
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
    // InternalSim.g:3537:1: ruleSExpression returns [EObject current=null] : ( (lv_expr_0_0= RULE_STRING ) ) ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:3543:2: ( ( (lv_expr_0_0= RULE_STRING ) ) )
            // InternalSim.g:3544:2: ( (lv_expr_0_0= RULE_STRING ) )
            {
            // InternalSim.g:3544:2: ( (lv_expr_0_0= RULE_STRING ) )
            // InternalSim.g:3545:3: (lv_expr_0_0= RULE_STRING )
            {
            // InternalSim.g:3545:3: (lv_expr_0_0= RULE_STRING )
            // InternalSim.g:3546:4: lv_expr_0_0= RULE_STRING
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
    // InternalSim.g:3565:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalSim.g:3565:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:3566:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
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
    // InternalSim.g:3572:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3578:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalSim.g:3579:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalSim.g:3579:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalSim.g:3580:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSim.g:3590:3: (kw= '.*' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==48) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:3591:4: kw= '.*'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalSim.g:3601:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalSim.g:3601:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalSim.g:3602:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
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
    // InternalSim.g:3608:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSim.g:3614:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSim.g:3615:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSim.g:3615:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSim.g:3616:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSim.g:3623:3: (kw= '.' this_ID_2= RULE_ID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==49) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSim.g:3624:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_54); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalSim.g:3641:1: entryRuleSMultiplicity returns [EObject current=null] : iv_ruleSMultiplicity= ruleSMultiplicity EOF ;
    public final EObject entryRuleSMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMultiplicity = null;


        try {
            // InternalSim.g:3641:54: (iv_ruleSMultiplicity= ruleSMultiplicity EOF )
            // InternalSim.g:3642:2: iv_ruleSMultiplicity= ruleSMultiplicity EOF
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
    // InternalSim.g:3648:1: ruleSMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3654:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSim.g:3655:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSim.g:3655:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSim.g:3656:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSim.g:3660:3: ( (lv_minOccurs_1_0= RULE_INT ) )
            // InternalSim.g:3661:4: (lv_minOccurs_1_0= RULE_INT )
            {
            // InternalSim.g:3661:4: (lv_minOccurs_1_0= RULE_INT )
            // InternalSim.g:3662:5: lv_minOccurs_1_0= RULE_INT
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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

            otherlv_2=(Token)match(input,50,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSim.g:3682:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSim.g:3683:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSim.g:3683:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSim.g:3684:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {

            					newCompositeNode(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

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
    // InternalSim.g:3709:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSim.g:3709:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSim.g:3710:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSim.g:3716:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:3722:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSim.g:3723:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSim.g:3723:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                alt74=1;
            }
            else if ( (LA74_0==45) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalSim.g:3724:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSim.g:3732:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "ruleSInformationModelKind"
    // InternalSim.g:3741:1: ruleSInformationModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) ;
    public final Enumerator ruleSInformationModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:3747:2: ( ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) )
            // InternalSim.g:3748:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            {
            // InternalSim.g:3748:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt75=1;
                }
                break;
            case 52:
                {
                alt75=2;
                }
                break;
            case 53:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalSim.g:3749:3: (enumLiteral_0= 'base' )
                    {
                    // InternalSim.g:3749:3: (enumLiteral_0= 'base' )
                    // InternalSim.g:3750:4: enumLiteral_0= 'base'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3757:3: (enumLiteral_1= 'interface' )
                    {
                    // InternalSim.g:3757:3: (enumLiteral_1= 'interface' )
                    // InternalSim.g:3758:4: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:3765:3: (enumLiteral_2= 'core' )
                    {
                    // InternalSim.g:3765:3: (enumLiteral_2= 'core' )
                    // InternalSim.g:3766:4: enumLiteral_2= 'core'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSInformationModelKind"


    // $ANTLR start "ruleSAssociationKind"
    // InternalSim.g:3776:1: ruleSAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleSAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:3782:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSim.g:3783:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSim.g:3783:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            else if ( (LA76_0==39) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalSim.g:3784:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSim.g:3784:3: (enumLiteral_0= 'reference' )
                    // InternalSim.g:3785:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3792:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSim.g:3792:3: (enumLiteral_1= 'composite' )
                    // InternalSim.g:3793:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalSim.g:3803:1: ruleSAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleSAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSim.g:3809:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSim.g:3810:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSim.g:3810:2: (enumLiteral_0= 'inverse' )
            // InternalSim.g:3811:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

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


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\24\1\32\1\uffff\1\35\1\uffff\2\40\1\41\2\uffff\4\41";
    static final String dfa_3s = "\2\45\1\uffff\1\45\1\uffff\3\45\2\uffff\4\45";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4\4\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\2\2\1\uffff\1\4\1\3\1\uffff\1\7\2\10\1\5\1\6\1\11",
            "\1\2\2\uffff\1\4\2\uffff\1\12\2\10\2\uffff\1\11",
            "",
            "\1\4\2\uffff\1\13\2\10\2\uffff\1\11",
            "",
            "\1\14\2\10\2\uffff\1\11",
            "\1\15\2\10\2\uffff\1\11",
            "\2\10\2\uffff\1\11",
            "",
            "",
            "\2\10\2\uffff\1\11",
            "\2\10\2\uffff\1\11",
            "\2\10\2\uffff\1\11",
            "\2\10\2\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1173:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003F6C506002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003F6C504002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003F6C500002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000058002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003F6D100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000043100010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000083000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040100010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x004001E843100010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x004001C840100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000022000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600840100010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000840100010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400840100010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000900000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000000040L});

}