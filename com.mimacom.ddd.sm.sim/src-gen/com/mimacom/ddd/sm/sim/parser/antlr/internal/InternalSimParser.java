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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'information'", "'model'", "'generate'", "'import'", "'as'", "'and'", "'to'", "'extends'", "':'", "'grab'", "'domain'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'archetype'", "'redefines'", "'enumeration'", "'ditch'", "','", "'root'", "'entity'", "'morph'", "'fuse'", "'abstract'", "'detail'", "'reference'", "'composite'", "'derived'", "'attribute'", "'key'", "'query'", "'('", "'*'", "')'", "'returns'", "'.*'", "'.'", "'..'", "'base'", "'interface'", "'core'", "'nonabstract'", "'nonroot'", "'inverse'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
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
                    case 21:
                        {
                        alt3=3;
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
    // InternalSim.g:662:1: ruleSMorphComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSMorphComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeComplexType_1 = null;



        	enterRule();

        try {
            // InternalSim.g:668:2: ( ( ( ( ruleSQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] ) )
            // InternalSim.g:669:2: ( ( ( ruleSQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:669:2: ( ( ( ruleSQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current] )
            // InternalSim.g:670:3: ( ( ruleSQualifiedName ) ) this_ChangeComplexType_1= ruleChangeComplexType[$current]
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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSMorphComplexTypeRuleRule());
            			}
            			newCompositeNode(grammarAccess.getSMorphComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ChangeComplexType_1=ruleChangeComplexType(current);

            state._fsp--;


            			current = this_ChangeComplexType_1;
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
    // $ANTLR end "ruleSMorphComplexTypeRule"


    // $ANTLR start "entryRuleSFuseComplexTypeRule"
    // InternalSim.g:701:1: entryRuleSFuseComplexTypeRule returns [EObject current=null] : iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF ;
    public final EObject entryRuleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFuseComplexTypeRule = null;


        try {
            // InternalSim.g:701:61: (iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:702:2: iv_ruleSFuseComplexTypeRule= ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:708:1: ruleSFuseComplexTypeRule returns [EObject current=null] : ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) ;
    public final EObject ruleSFuseComplexTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ChangeComplexType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:714:2: ( ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] ) )
            // InternalSim.g:715:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            {
            // InternalSim.g:715:2: ( ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current] )
            // InternalSim.g:716:3: ( ( ruleSQualifiedName ) ) (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+ this_ChangeComplexType_3= ruleChangeComplexType[$current]
            {
            // InternalSim.g:716:3: ( ( ruleSQualifiedName ) )
            // InternalSim.g:717:4: ( ruleSQualifiedName )
            {
            // InternalSim.g:717:4: ( ruleSQualifiedName )
            // InternalSim.g:718:5: ruleSQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleSQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSim.g:732:3: (otherlv_1= 'and' ( ( ruleSQualifiedName ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSim.g:733:4: otherlv_1= 'and' ( ( ruleSQualifiedName ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0());
            	    			
            	    // InternalSim.g:737:4: ( ( ruleSQualifiedName ) )
            	    // InternalSim.g:738:5: ( ruleSQualifiedName )
            	    {
            	    // InternalSim.g:738:5: ( ruleSQualifiedName )
            	    // InternalSim.g:739:6: ruleSQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleSQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSFuseComplexTypeRuleRule());
            			}
            			newCompositeNode(grammarAccess.getSFuseComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ChangeComplexType_3=ruleChangeComplexType(current);

            state._fsp--;


            			current = this_ChangeComplexType_3;
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
    // $ANTLR end "ruleSFuseComplexTypeRule"


    // $ANTLR start "ruleChangeComplexType"
    // InternalSim.g:770:1: ruleChangeComplexType[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleChangeComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_renameTo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_abstract_1_0 = null;

        Enumerator lv_rootEntity_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:776:2: ( (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalSim.g:777:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalSim.g:777:2: (otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalSim.g:778:3: otherlv_0= 'to' ( (lv_abstract_1_0= ruleSAbstractType ) )? ( (lv_rootEntity_2_0= ruleSRootEntity ) )? ( (lv_renameTo_3_0= RULE_ID ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeComplexTypeAccess().getToKeyword_0());
            		
            // InternalSim.g:782:3: ( (lv_abstract_1_0= ruleSAbstractType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36||LA9_0==54) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSim.g:783:4: (lv_abstract_1_0= ruleSAbstractType )
                    {
                    // InternalSim.g:783:4: (lv_abstract_1_0= ruleSAbstractType )
                    // InternalSim.g:784:5: lv_abstract_1_0= ruleSAbstractType
                    {

                    					newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getAbstractSAbstractTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_abstract_1_0=ruleSAbstractType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeComplexTypeRule());
                    					}
                    					set(
                    						current,
                    						"abstract",
                    						lv_abstract_1_0,
                    						"com.mimacom.ddd.sm.sim.Sim.SAbstractType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSim.g:801:3: ( (lv_rootEntity_2_0= ruleSRootEntity ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32||LA10_0==55) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:802:4: (lv_rootEntity_2_0= ruleSRootEntity )
                    {
                    // InternalSim.g:802:4: (lv_rootEntity_2_0= ruleSRootEntity )
                    // InternalSim.g:803:5: lv_rootEntity_2_0= ruleSRootEntity
                    {

                    					newCompositeNode(grammarAccess.getChangeComplexTypeAccess().getRootEntitySRootEntityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_rootEntity_2_0=ruleSRootEntity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChangeComplexTypeRule());
                    					}
                    					set(
                    						current,
                    						"rootEntity",
                    						lv_rootEntity_2_0,
                    						"com.mimacom.ddd.sm.sim.Sim.SRootEntity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSim.g:820:3: ( (lv_renameTo_3_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:821:4: (lv_renameTo_3_0= RULE_ID )
                    {
                    // InternalSim.g:821:4: (lv_renameTo_3_0= RULE_ID )
                    // InternalSim.g:822:5: lv_renameTo_3_0= RULE_ID
                    {
                    lv_renameTo_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    					newLeafNode(lv_renameTo_3_0, grammarAccess.getChangeComplexTypeAccess().getRenameToIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"renameTo",
                    						lv_renameTo_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalSim.g:838:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSim.g:839:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getChangeComplexTypeAccess().getExtendsKeyword_4_0());
                    			
                    // InternalSim.g:843:4: ( (otherlv_5= RULE_ID ) )
                    // InternalSim.g:844:5: (otherlv_5= RULE_ID )
                    {
                    // InternalSim.g:844:5: (otherlv_5= RULE_ID )
                    // InternalSim.g:845:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChangeComplexTypeRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getChangeComplexTypeAccess().getExtendFromSComplexTypeCrossReference_4_1_0());
                    					

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
    // $ANTLR end "ruleChangeComplexType"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:861:1: entryRuleSGrabFeatureRule returns [EObject current=null] : iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF ;
    public final EObject entryRuleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSGrabFeatureRule = null;


        try {
            // InternalSim.g:861:57: (iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF )
            // InternalSim.g:862:2: iv_ruleSGrabFeatureRule= ruleSGrabFeatureRule EOF
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
    // InternalSim.g:868:1: ruleSGrabFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSGrabFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_renameTo_2_0=null;


        	enterRule();

        try {
            // InternalSim.g:874:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? ) )
            // InternalSim.g:875:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            {
            // InternalSim.g:875:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )? )
            // InternalSim.g:876:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            {
            // InternalSim.g:876:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:877:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:877:4: (otherlv_0= RULE_ID )
            // InternalSim.g:878:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSGrabFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            // InternalSim.g:889:3: (otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSim.g:890:4: otherlv_1= 'as' ( (lv_renameTo_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0());
                    			
                    // InternalSim.g:894:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:895:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:895:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:896:6: lv_renameTo_2_0= RULE_ID
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
    // InternalSim.g:917:1: entryRuleSMorphFeatureRule returns [EObject current=null] : iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF ;
    public final EObject entryRuleSMorphFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMorphFeatureRule = null;


        try {
            // InternalSim.g:917:58: (iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF )
            // InternalSim.g:918:2: iv_ruleSMorphFeatureRule= ruleSMorphFeatureRule EOF
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
    // InternalSim.g:924:1: ruleSMorphFeatureRule returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? ) ;
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
            // InternalSim.g:930:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? ) )
            // InternalSim.g:931:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )
            {
            // InternalSim.g:931:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )? )
            // InternalSim.g:932:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (otherlv_4= RULE_ID ) ) ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
            {
            // InternalSim.g:932:3: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:933:4: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:933:4: (otherlv_0= RULE_ID )
            // InternalSim.g:934:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSMorphFeatureRuleAccess().getToKeyword_1());
            		
            // InternalSim.g:949:3: ( ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==19) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:950:4: ( (lv_renameTo_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalSim.g:950:4: ( (lv_renameTo_2_0= RULE_ID ) )
                    // InternalSim.g:951:5: (lv_renameTo_2_0= RULE_ID )
                    {
                    // InternalSim.g:951:5: (lv_renameTo_2_0= RULE_ID )
                    // InternalSim.g:952:6: lv_renameTo_2_0= RULE_ID
                    {
                    lv_renameTo_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_renameTo_2_0, grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_2_0_0());
                    					

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

                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalSim.g:973:3: ( (otherlv_4= RULE_ID ) )
            // InternalSim.g:974:4: (otherlv_4= RULE_ID )
            {
            // InternalSim.g:974:4: (otherlv_4= RULE_ID )
            // InternalSim.g:975:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMorphFeatureRuleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_4, grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_3_0());
            				

            }


            }

            // InternalSim.g:986:3: ( (lv_remultiplyTo_5_0= ruleSMultiplicity ) )?
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
                    // InternalSim.g:987:4: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                    {
                    // InternalSim.g:987:4: (lv_remultiplyTo_5_0= ruleSMultiplicity )
                    // InternalSim.g:988:5: lv_remultiplyTo_5_0= ruleSMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_4_0());
                    				
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
    // InternalSim.g:1009:1: entryRuleSDitchFeatureRule returns [EObject current=null] : iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF ;
    public final EObject entryRuleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDitchFeatureRule = null;


        try {
            // InternalSim.g:1009:58: (iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF )
            // InternalSim.g:1010:2: iv_ruleSDitchFeatureRule= ruleSDitchFeatureRule EOF
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
    // InternalSim.g:1016:1: ruleSDitchFeatureRule returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSDitchFeatureRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSim.g:1022:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSim.g:1023:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSim.g:1023:2: ( (otherlv_0= RULE_ID ) )
            // InternalSim.g:1024:3: (otherlv_0= RULE_ID )
            {
            // InternalSim.g:1024:3: (otherlv_0= RULE_ID )
            // InternalSim.g:1025:4: otherlv_0= RULE_ID
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
    // InternalSim.g:1039:1: entryRuleSDomainProxy returns [EObject current=null] : iv_ruleSDomainProxy= ruleSDomainProxy EOF ;
    public final EObject entryRuleSDomainProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDomainProxy = null;


        try {
            // InternalSim.g:1039:53: (iv_ruleSDomainProxy= ruleSDomainProxy EOF )
            // InternalSim.g:1040:2: iv_ruleSDomainProxy= ruleSDomainProxy EOF
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
    // InternalSim.g:1046:1: ruleSDomainProxy returns [EObject current=null] : ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) ;
    public final EObject ruleSDomainProxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_deductionRule_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1052:2: ( ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) ) )
            // InternalSim.g:1053:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            {
            // InternalSim.g:1053:2: ( () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) ) )
            // InternalSim.g:1054:3: () otherlv_1= 'grab' otherlv_2= 'domain' ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            {
            // InternalSim.g:1054:3: ()
            // InternalSim.g:1055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSDomainProxyAccess().getSDomainProxyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSDomainProxyAccess().getGrabKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSDomainProxyAccess().getDomainKeyword_2());
            		
            // InternalSim.g:1069:3: ( (lv_deductionRule_3_0= ruleSGrabDomainRule ) )
            // InternalSim.g:1070:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            {
            // InternalSim.g:1070:4: (lv_deductionRule_3_0= ruleSGrabDomainRule )
            // InternalSim.g:1071:5: lv_deductionRule_3_0= ruleSGrabDomainRule
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
    // InternalSim.g:1092:1: entryRuleSAggregate returns [EObject current=null] : iv_ruleSAggregate= ruleSAggregate EOF ;
    public final EObject entryRuleSAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAggregate = null;


        try {
            // InternalSim.g:1092:51: (iv_ruleSAggregate= ruleSAggregate EOF )
            // InternalSim.g:1093:2: iv_ruleSAggregate= ruleSAggregate EOF
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
    // InternalSim.g:1099:1: ruleSAggregate returns [EObject current=null] : ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) ;
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
            // InternalSim.g:1105:2: ( ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' ) )
            // InternalSim.g:1106:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            {
            // InternalSim.g:1106:2: ( () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}' )
            // InternalSim.g:1107:3: () ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' ) otherlv_5= '{' ( (lv_types_6_0= ruleSType ) )* otherlv_7= '}'
            {
            // InternalSim.g:1107:3: ()
            // InternalSim.g:1108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSAggregateAccess().getSAggregateAction_0(),
            					current);
            			

            }

            // InternalSim.g:1114:3: ( (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) ) | otherlv_4= 'aggregate' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==22) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:1115:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    {
                    // InternalSim.g:1115:4: (otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) ) )
                    // InternalSim.g:1116:5: otherlv_1= 'grab' otherlv_2= 'aggregate' ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1());
                    				
                    // InternalSim.g:1124:5: ( (lv_deductionRule_3_0= ruleSGrabAggregateRule ) )
                    // InternalSim.g:1125:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    {
                    // InternalSim.g:1125:6: (lv_deductionRule_3_0= ruleSGrabAggregateRule )
                    // InternalSim.g:1126:7: lv_deductionRule_3_0= ruleSGrabAggregateRule
                    {

                    							newCompositeNode(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_21);
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
                    // InternalSim.g:1145:4: otherlv_4= 'aggregate'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSim.g:1154:3: ( (lv_types_6_0= ruleSType ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20||(LA17_0>=26 && LA17_0<=27)||(LA17_0>=29 && LA17_0<=30)||(LA17_0>=32 && LA17_0<=37)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSim.g:1155:4: (lv_types_6_0= ruleSType )
            	    {
            	    // InternalSim.g:1155:4: (lv_types_6_0= ruleSType )
            	    // InternalSim.g:1156:5: lv_types_6_0= ruleSType
            	    {

            	    					newCompositeNode(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop17;
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
    // InternalSim.g:1181:1: entryRuleSType returns [EObject current=null] : iv_ruleSType= ruleSType EOF ;
    public final EObject entryRuleSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSType = null;


        try {
            // InternalSim.g:1181:46: (iv_ruleSType= ruleSType EOF )
            // InternalSim.g:1182:2: iv_ruleSType= ruleSType EOF
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
    // InternalSim.g:1188:1: ruleSType returns [EObject current=null] : (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType ) ;
    public final EObject ruleSType() throws RecognitionException {
        EObject current = null;

        EObject this_SPrimitive_0 = null;

        EObject this_SEnumeration_1 = null;

        EObject this_SEntityType_2 = null;

        EObject this_SDetailType_3 = null;



        	enterRule();

        try {
            // InternalSim.g:1194:2: ( (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType ) )
            // InternalSim.g:1195:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )
            {
            // InternalSim.g:1195:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1196:3: this_SPrimitive_0= ruleSPrimitive
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
                    // InternalSim.g:1205:3: this_SEnumeration_1= ruleSEnumeration
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
                    // InternalSim.g:1214:3: this_SEntityType_2= ruleSEntityType
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
                    // InternalSim.g:1223:3: this_SDetailType_3= ruleSDetailType
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
    // InternalSim.g:1235:1: entryRuleSConstraint returns [EObject current=null] : iv_ruleSConstraint= ruleSConstraint EOF ;
    public final EObject entryRuleSConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSConstraint = null;


        try {
            // InternalSim.g:1235:52: (iv_ruleSConstraint= ruleSConstraint EOF )
            // InternalSim.g:1236:2: iv_ruleSConstraint= ruleSConstraint EOF
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
    // InternalSim.g:1242:1: ruleSConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) ;
    public final EObject ruleSConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1248:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) ) )
            // InternalSim.g:1249:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            {
            // InternalSim.g:1249:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) ) )
            // InternalSim.g:1250:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleSExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSConstraintAccess().getConstraintKeyword_0());
            		
            // InternalSim.g:1254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSim.g:1255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSim.g:1255:4: (lv_name_1_0= RULE_ID )
            // InternalSim.g:1256:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSConstraintAccess().getColonKeyword_2());
            		
            // InternalSim.g:1276:3: ( (lv_condition_3_0= ruleSExpression ) )
            // InternalSim.g:1277:4: (lv_condition_3_0= ruleSExpression )
            {
            // InternalSim.g:1277:4: (lv_condition_3_0= ruleSExpression )
            // InternalSim.g:1278:5: lv_condition_3_0= ruleSExpression
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
    // InternalSim.g:1299:1: entryRuleSPrimitive returns [EObject current=null] : iv_ruleSPrimitive= ruleSPrimitive EOF ;
    public final EObject entryRuleSPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPrimitive = null;


        try {
            // InternalSim.g:1299:51: (iv_ruleSPrimitive= ruleSPrimitive EOF )
            // InternalSim.g:1300:2: iv_ruleSPrimitive= ruleSPrimitive EOF
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
    // InternalSim.g:1306:1: ruleSPrimitive returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) ;
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
            // InternalSim.g:1312:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' ) )
            // InternalSim.g:1313:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
            {
            // InternalSim.g:1313:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}' )
            // InternalSim.g:1314:3: ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) ) otherlv_10= '{' ( (lv_constraints_11_0= ruleSConstraint ) )* otherlv_12= '}'
            {
            // InternalSim.g:1314:3: ( ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) ) | (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 27:
                {
                alt19=2;
                }
                break;
            case 26:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSim.g:1315:4: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    {
                    // InternalSim.g:1315:4: ( () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) ) )
                    // InternalSim.g:1316:5: () otherlv_1= 'grab' otherlv_2= 'primitive' ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    {
                    // InternalSim.g:1316:5: ()
                    // InternalSim.g:1317:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_24); 

                    					newLeafNode(otherlv_1, grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2());
                    				
                    // InternalSim.g:1331:5: ( (lv_deductionRule_3_0= ruleSGrabPrimitiveRule ) )
                    // InternalSim.g:1332:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    {
                    // InternalSim.g:1332:6: (lv_deductionRule_3_0= ruleSGrabPrimitiveRule )
                    // InternalSim.g:1333:7: lv_deductionRule_3_0= ruleSGrabPrimitiveRule
                    {

                    							newCompositeNode(grammarAccess.getSPrimitiveAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_21);
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
                    // InternalSim.g:1352:4: (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // InternalSim.g:1352:4: (otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) ) )
                    // InternalSim.g:1353:5: otherlv_4= 'archetype' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0());
                    				
                    // InternalSim.g:1357:5: ( (lv_name_5_0= RULE_ID ) )
                    // InternalSim.g:1358:6: (lv_name_5_0= RULE_ID )
                    {
                    // InternalSim.g:1358:6: (lv_name_5_0= RULE_ID )
                    // InternalSim.g:1359:7: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
                    // InternalSim.g:1377:4: (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalSim.g:1377:4: (otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) ) )
                    // InternalSim.g:1378:5: otherlv_6= 'primitive' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'redefines' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0());
                    				
                    // InternalSim.g:1382:5: ( (lv_name_7_0= RULE_ID ) )
                    // InternalSim.g:1383:6: (lv_name_7_0= RULE_ID )
                    {
                    // InternalSim.g:1383:6: (lv_name_7_0= RULE_ID )
                    // InternalSim.g:1384:7: lv_name_7_0= RULE_ID
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
                    				
                    // InternalSim.g:1404:5: ( (otherlv_9= RULE_ID ) )
                    // InternalSim.g:1405:6: (otherlv_9= RULE_ID )
                    {
                    // InternalSim.g:1405:6: (otherlv_9= RULE_ID )
                    // InternalSim.g:1406:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSPrimitiveRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_9, grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSim.g:1423:3: ( (lv_constraints_11_0= ruleSConstraint ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSim.g:1424:4: (lv_constraints_11_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1424:4: (lv_constraints_11_0= ruleSConstraint )
            	    // InternalSim.g:1425:5: lv_constraints_11_0= ruleSConstraint
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
            	    break loop20;
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
    // InternalSim.g:1450:1: entryRuleSEnumeration returns [EObject current=null] : iv_ruleSEnumeration= ruleSEnumeration EOF ;
    public final EObject entryRuleSEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumeration = null;


        try {
            // InternalSim.g:1450:53: (iv_ruleSEnumeration= ruleSEnumeration EOF )
            // InternalSim.g:1451:2: iv_ruleSEnumeration= ruleSEnumeration EOF
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
    // InternalSim.g:1457:1: ruleSEnumeration returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) ;
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
            // InternalSim.g:1463:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' ) )
            // InternalSim.g:1464:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            {
            // InternalSim.g:1464:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}' )
            // InternalSim.g:1465:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) ) otherlv_10= '{' ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )? ( (lv_constraints_14_0= ruleSConstraint ) )* otherlv_15= '}'
            {
            // InternalSim.g:1465:3: ( ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) ) | (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 29:
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
                    // InternalSim.g:1466:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    {
                    // InternalSim.g:1466:4: ( () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) ) )
                    // InternalSim.g:1467:5: () otherlv_1= 'grab' otherlv_2= 'enumeration' ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    {
                    // InternalSim.g:1467:5: ()
                    // InternalSim.g:1468:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_27); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2());
                    				
                    // InternalSim.g:1482:5: ( (lv_deductionRule_3_0= ruleSGrabEnumerationRule ) )
                    // InternalSim.g:1483:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    {
                    // InternalSim.g:1483:6: (lv_deductionRule_3_0= ruleSGrabEnumerationRule )
                    // InternalSim.g:1484:7: lv_deductionRule_3_0= ruleSGrabEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_21);
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
                    // InternalSim.g:1503:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    {
                    // InternalSim.g:1503:4: ( () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) ) )
                    // InternalSim.g:1504:5: () otherlv_5= 'ditch' otherlv_6= 'enumeration' ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    {
                    // InternalSim.g:1504:5: ()
                    // InternalSim.g:1505:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_27); 

                    					newLeafNode(otherlv_5, grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2());
                    				
                    // InternalSim.g:1519:5: ( (lv_deductionRule_7_0= ruleSDitchEnumerationRule ) )
                    // InternalSim.g:1520:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    {
                    // InternalSim.g:1520:6: (lv_deductionRule_7_0= ruleSDitchEnumerationRule )
                    // InternalSim.g:1521:7: lv_deductionRule_7_0= ruleSDitchEnumerationRule
                    {

                    							newCompositeNode(grammarAccess.getSEnumerationAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_21);
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
                    // InternalSim.g:1540:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    {
                    // InternalSim.g:1540:4: (otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) ) )
                    // InternalSim.g:1541:5: otherlv_8= 'enumeration' ( (lv_name_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_8, grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0());
                    				
                    // InternalSim.g:1545:5: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:1546:6: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:1546:6: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:1547:7: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
            		
            // InternalSim.g:1569:3: ( ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==20||LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSim.g:1570:4: ( (lv_literals_11_0= ruleSLiteral ) ) (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    {
                    // InternalSim.g:1570:4: ( (lv_literals_11_0= ruleSLiteral ) )
                    // InternalSim.g:1571:5: (lv_literals_11_0= ruleSLiteral )
                    {
                    // InternalSim.g:1571:5: (lv_literals_11_0= ruleSLiteral )
                    // InternalSim.g:1572:6: lv_literals_11_0= ruleSLiteral
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

                    // InternalSim.g:1589:4: (otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==31) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSim.g:1590:5: otherlv_12= ',' ( (lv_literals_13_0= ruleSLiteral ) )
                    	    {
                    	    otherlv_12=(Token)match(input,31,FOLLOW_30); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSim.g:1594:5: ( (lv_literals_13_0= ruleSLiteral ) )
                    	    // InternalSim.g:1595:6: (lv_literals_13_0= ruleSLiteral )
                    	    {
                    	    // InternalSim.g:1595:6: (lv_literals_13_0= ruleSLiteral )
                    	    // InternalSim.g:1596:7: lv_literals_13_0= ruleSLiteral
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSim.g:1615:3: ( (lv_constraints_14_0= ruleSConstraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSim.g:1616:4: (lv_constraints_14_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:1616:4: (lv_constraints_14_0= ruleSConstraint )
            	    // InternalSim.g:1617:5: lv_constraints_14_0= ruleSConstraint
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
            	    break loop24;
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
    // InternalSim.g:1642:1: entryRuleSLiteral returns [EObject current=null] : iv_ruleSLiteral= ruleSLiteral EOF ;
    public final EObject entryRuleSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSLiteral = null;


        try {
            // InternalSim.g:1642:49: (iv_ruleSLiteral= ruleSLiteral EOF )
            // InternalSim.g:1643:2: iv_ruleSLiteral= ruleSLiteral EOF
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
    // InternalSim.g:1649:1: ruleSLiteral returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleSLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        EObject lv_deductionRule_2_0 = null;

        EObject lv_deductionRule_5_0 = null;



        	enterRule();

        try {
            // InternalSim.g:1655:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalSim.g:1656:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalSim.g:1656:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) ) | ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt25=1;
                }
                break;
            case 30:
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
                    // InternalSim.g:1657:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1657:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) ) )
                    // InternalSim.g:1658:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1658:4: ()
                    // InternalSim.g:1659:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSLiteralAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:1669:4: ( (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule ) )
                    // InternalSim.g:1670:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    {
                    // InternalSim.g:1670:5: (lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule )
                    // InternalSim.g:1671:6: lv_deductionRule_2_0= ruleSGrabEnumerationLiteralRule
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
                    // InternalSim.g:1690:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    {
                    // InternalSim.g:1690:3: ( () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) ) )
                    // InternalSim.g:1691:4: () otherlv_4= 'ditch' ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    {
                    // InternalSim.g:1691:4: ()
                    // InternalSim.g:1692:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSLiteralAccess().getSLiteralAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSLiteralAccess().getDitchKeyword_1_1());
                    			
                    // InternalSim.g:1702:4: ( (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule ) )
                    // InternalSim.g:1703:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    {
                    // InternalSim.g:1703:5: (lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule )
                    // InternalSim.g:1704:6: lv_deductionRule_5_0= ruleSDitchEnumerationLiteralRule
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
                    // InternalSim.g:1723:3: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalSim.g:1723:3: ( (lv_name_6_0= RULE_ID ) )
                    // InternalSim.g:1724:4: (lv_name_6_0= RULE_ID )
                    {
                    // InternalSim.g:1724:4: (lv_name_6_0= RULE_ID )
                    // InternalSim.g:1725:5: lv_name_6_0= RULE_ID
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
    // InternalSim.g:1745:1: entryRuleSEntityType returns [EObject current=null] : iv_ruleSEntityType= ruleSEntityType EOF ;
    public final EObject entryRuleSEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEntityType = null;


        try {
            // InternalSim.g:1745:52: (iv_ruleSEntityType= ruleSEntityType EOF )
            // InternalSim.g:1746:2: iv_ruleSEntityType= ruleSEntityType EOF
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
    // InternalSim.g:1752:1: ruleSEntityType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_25= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_root_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_root_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_root_12_0=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token lv_root_17_0=null;
        Token otherlv_18=null;
        Token lv_abstract_20_0=null;
        Token lv_root_21_0=null;
        Token otherlv_22=null;
        Token lv_name_23_0=null;
        EObject lv_deductionRule_4_0 = null;

        EObject lv_deductionRule_9_0 = null;

        EObject lv_deductionRule_14_0 = null;

        EObject lv_deductionRule_19_0 = null;

        EObject this_SComplexTypeExtends_24 = null;

        EObject this_SComplexTypeFeatures_25 = null;



        	enterRule();

        try {
            // InternalSim.g:1758:2: ( ( ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_25= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:1759:2: ( ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_25= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:1759:2: ( ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_25= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:1760:3: ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_25= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:1760:3: ( ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt32=1;
                }
                break;
            case 30:
                {
                alt32=2;
                }
                break;
            case 34:
                {
                alt32=3;
                }
                break;
            case 35:
                {
                alt32=4;
                }
                break;
            case 32:
            case 33:
            case 36:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSim.g:1761:4: ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1761:4: ( () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:1762:5: () otherlv_1= 'grab' ( (lv_root_2_0= 'root' ) )? otherlv_3= 'entity' ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:1762:5: ()
                    // InternalSim.g:1763:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_31); 

                    					newLeafNode(otherlv_1, grammarAccess.getSEntityTypeAccess().getGrabKeyword_0_0_1());
                    				
                    // InternalSim.g:1773:5: ( (lv_root_2_0= 'root' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSim.g:1774:6: (lv_root_2_0= 'root' )
                            {
                            // InternalSim.g:1774:6: (lv_root_2_0= 'root' )
                            // InternalSim.g:1775:7: lv_root_2_0= 'root'
                            {
                            lv_root_2_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_root_2_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_0_3());
                    				
                    // InternalSim.g:1791:5: ( (lv_deductionRule_4_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:1792:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:1792:6: (lv_deductionRule_4_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:1793:7: lv_deductionRule_4_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_4_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
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
                    // InternalSim.g:1812:4: ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1812:4: ( () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:1813:5: () otherlv_6= 'ditch' ( (lv_root_7_0= 'root' ) )? otherlv_8= 'entity' ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:1813:5: ()
                    // InternalSim.g:1814:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_31); 

                    					newLeafNode(otherlv_6, grammarAccess.getSEntityTypeAccess().getDitchKeyword_0_1_1());
                    				
                    // InternalSim.g:1824:5: ( (lv_root_7_0= 'root' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSim.g:1825:6: (lv_root_7_0= 'root' )
                            {
                            // InternalSim.g:1825:6: (lv_root_7_0= 'root' )
                            // InternalSim.g:1826:7: lv_root_7_0= 'root'
                            {
                            lv_root_7_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_root_7_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_5); 

                    					newLeafNode(otherlv_8, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_1_3());
                    				
                    // InternalSim.g:1842:5: ( (lv_deductionRule_9_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:1843:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:1843:6: (lv_deductionRule_9_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:1844:7: lv_deductionRule_9_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_9_0=ruleSDitchComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
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
                    // InternalSim.g:1863:4: ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1863:4: ( () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:1864:5: () otherlv_11= 'morph' ( (lv_root_12_0= 'root' ) )? otherlv_13= 'entity' ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:1864:5: ()
                    // InternalSim.g:1865:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_31); 

                    					newLeafNode(otherlv_11, grammarAccess.getSEntityTypeAccess().getMorphKeyword_0_2_1());
                    				
                    // InternalSim.g:1875:5: ( (lv_root_12_0= 'root' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==32) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSim.g:1876:6: (lv_root_12_0= 'root' )
                            {
                            // InternalSim.g:1876:6: (lv_root_12_0= 'root' )
                            // InternalSim.g:1877:7: lv_root_12_0= 'root'
                            {
                            lv_root_12_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_root_12_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_5); 

                    					newLeafNode(otherlv_13, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_2_3());
                    				
                    // InternalSim.g:1893:5: ( (lv_deductionRule_14_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:1894:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:1894:6: (lv_deductionRule_14_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:1895:7: lv_deductionRule_14_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_14_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
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
                    // InternalSim.g:1914:4: ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:1914:4: ( () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:1915:5: () otherlv_16= 'fuse' ( (lv_root_17_0= 'root' ) )? otherlv_18= 'entity' ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:1915:5: ()
                    // InternalSim.g:1916:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_16=(Token)match(input,35,FOLLOW_31); 

                    					newLeafNode(otherlv_16, grammarAccess.getSEntityTypeAccess().getFuseKeyword_0_3_1());
                    				
                    // InternalSim.g:1926:5: ( (lv_root_17_0= 'root' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==32) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSim.g:1927:6: (lv_root_17_0= 'root' )
                            {
                            // InternalSim.g:1927:6: (lv_root_17_0= 'root' )
                            // InternalSim.g:1928:7: lv_root_17_0= 'root'
                            {
                            lv_root_17_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_root_17_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,33,FOLLOW_5); 

                    					newLeafNode(otherlv_18, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_3_3());
                    				
                    // InternalSim.g:1944:5: ( (lv_deductionRule_19_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:1945:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:1945:6: (lv_deductionRule_19_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:1946:7: lv_deductionRule_19_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSEntityTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_19_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSEntityTypeRule());
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
                    // InternalSim.g:1965:4: ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:1965:4: ( ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:1966:5: ( (lv_abstract_20_0= 'abstract' ) )? ( (lv_root_21_0= 'root' ) )? otherlv_22= 'entity' ( (lv_name_23_0= RULE_ID ) ) this_SComplexTypeExtends_24= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:1966:5: ( (lv_abstract_20_0= 'abstract' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==36) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSim.g:1967:6: (lv_abstract_20_0= 'abstract' )
                            {
                            // InternalSim.g:1967:6: (lv_abstract_20_0= 'abstract' )
                            // InternalSim.g:1968:7: lv_abstract_20_0= 'abstract'
                            {
                            lv_abstract_20_0=(Token)match(input,36,FOLLOW_31); 

                            							newLeafNode(lv_abstract_20_0, grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    // InternalSim.g:1980:5: ( (lv_root_21_0= 'root' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSim.g:1981:6: (lv_root_21_0= 'root' )
                            {
                            // InternalSim.g:1981:6: (lv_root_21_0= 'root' )
                            // InternalSim.g:1982:7: lv_root_21_0= 'root'
                            {
                            lv_root_21_0=(Token)match(input,32,FOLLOW_32); 

                            							newLeafNode(lv_root_21_0, grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSEntityTypeRule());
                            							}
                            							setWithLastConsumed(current, "root", true, "root");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,33,FOLLOW_5); 

                    					newLeafNode(otherlv_22, grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_4_2());
                    				
                    // InternalSim.g:1998:5: ( (lv_name_23_0= RULE_ID ) )
                    // InternalSim.g:1999:6: (lv_name_23_0= RULE_ID )
                    {
                    // InternalSim.g:1999:6: (lv_name_23_0= RULE_ID )
                    // InternalSim.g:2000:7: lv_name_23_0= RULE_ID
                    {
                    lv_name_23_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(lv_name_23_0, grammarAccess.getSEntityTypeAccess().getNameIDTerminalRuleCall_0_4_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSEntityTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_23_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSEntityTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSEntityTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_4());
                    				
                    pushFollow(FOLLOW_21);
                    this_SComplexTypeExtends_24=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_24;
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
            this_SComplexTypeFeatures_25=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_25;
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
    // InternalSim.g:2044:1: entryRuleSDetailType returns [EObject current=null] : iv_ruleSDetailType= ruleSDetailType EOF ;
    public final EObject entryRuleSDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDetailType = null;


        try {
            // InternalSim.g:2044:52: (iv_ruleSDetailType= ruleSDetailType EOF )
            // InternalSim.g:2045:2: iv_ruleSDetailType= ruleSDetailType EOF
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
    // InternalSim.g:2051:1: ruleSDetailType returns [EObject current=null] : ( ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_20= ruleSComplexTypeFeatures[$current] ) ;
    public final EObject ruleSDetailType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_abstract_16_0=null;
        Token otherlv_17=null;
        Token lv_name_18_0=null;
        EObject lv_deductionRule_3_0 = null;

        EObject lv_deductionRule_7_0 = null;

        EObject lv_deductionRule_11_0 = null;

        EObject lv_deductionRule_15_0 = null;

        EObject this_SComplexTypeExtends_19 = null;

        EObject this_SComplexTypeFeatures_20 = null;



        	enterRule();

        try {
            // InternalSim.g:2057:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_20= ruleSComplexTypeFeatures[$current] ) )
            // InternalSim.g:2058:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_20= ruleSComplexTypeFeatures[$current] )
            {
            // InternalSim.g:2058:2: ( ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_20= ruleSComplexTypeFeatures[$current] )
            // InternalSim.g:2059:3: ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) ) this_SComplexTypeFeatures_20= ruleSComplexTypeFeatures[$current]
            {
            // InternalSim.g:2059:3: ( ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) ) | ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) ) | ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) ) | ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) ) | ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt34=1;
                }
                break;
            case 30:
                {
                alt34=2;
                }
                break;
            case 34:
                {
                alt34=3;
                }
                break;
            case 35:
                {
                alt34=4;
                }
                break;
            case 36:
            case 37:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSim.g:2060:4: ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2060:4: ( () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) ) )
                    // InternalSim.g:2061:5: () otherlv_1= 'grab' otherlv_2= 'detail' ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    {
                    // InternalSim.g:2061:5: ()
                    // InternalSim.g:2062:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_34); 

                    					newLeafNode(otherlv_1, grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2());
                    				
                    // InternalSim.g:2076:5: ( (lv_deductionRule_3_0= ruleSGrabComplexTypeRule ) )
                    // InternalSim.g:2077:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    {
                    // InternalSim.g:2077:6: (lv_deductionRule_3_0= ruleSGrabComplexTypeRule )
                    // InternalSim.g:2078:7: lv_deductionRule_3_0= ruleSGrabComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_3_0=ruleSGrabComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_3_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SGrabComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:2097:4: ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2097:4: ( () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) ) )
                    // InternalSim.g:2098:5: () otherlv_5= 'ditch' otherlv_6= 'detail' ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) )
                    {
                    // InternalSim.g:2098:5: ()
                    // InternalSim.g:2099:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_34); 

                    					newLeafNode(otherlv_5, grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1());
                    				
                    otherlv_6=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_2());
                    				
                    // InternalSim.g:2113:5: ( (lv_deductionRule_7_0= ruleSDitchComplexTypeRule ) )
                    // InternalSim.g:2114:6: (lv_deductionRule_7_0= ruleSDitchComplexTypeRule )
                    {
                    // InternalSim.g:2114:6: (lv_deductionRule_7_0= ruleSDitchComplexTypeRule )
                    // InternalSim.g:2115:7: lv_deductionRule_7_0= ruleSDitchComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_7_0=ruleSDitchComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_7_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SDitchComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:2134:4: ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2134:4: ( () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) ) )
                    // InternalSim.g:2135:5: () otherlv_9= 'morph' otherlv_10= 'detail' ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) )
                    {
                    // InternalSim.g:2135:5: ()
                    // InternalSim.g:2136:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_34); 

                    					newLeafNode(otherlv_9, grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1());
                    				
                    otherlv_10=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_10, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_2());
                    				
                    // InternalSim.g:2150:5: ( (lv_deductionRule_11_0= ruleSMorphComplexTypeRule ) )
                    // InternalSim.g:2151:6: (lv_deductionRule_11_0= ruleSMorphComplexTypeRule )
                    {
                    // InternalSim.g:2151:6: (lv_deductionRule_11_0= ruleSMorphComplexTypeRule )
                    // InternalSim.g:2152:7: lv_deductionRule_11_0= ruleSMorphComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_3_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_11_0=ruleSMorphComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_11_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SMorphComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:2171:4: ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) )
                    {
                    // InternalSim.g:2171:4: ( () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) ) )
                    // InternalSim.g:2172:5: () otherlv_13= 'fuse' otherlv_14= 'detail' ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) )
                    {
                    // InternalSim.g:2172:5: ()
                    // InternalSim.g:2173:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_13=(Token)match(input,35,FOLLOW_34); 

                    					newLeafNode(otherlv_13, grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1());
                    				
                    otherlv_14=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_14, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_2());
                    				
                    // InternalSim.g:2187:5: ( (lv_deductionRule_15_0= ruleSFuseComplexTypeRule ) )
                    // InternalSim.g:2188:6: (lv_deductionRule_15_0= ruleSFuseComplexTypeRule )
                    {
                    // InternalSim.g:2188:6: (lv_deductionRule_15_0= ruleSFuseComplexTypeRule )
                    // InternalSim.g:2189:7: lv_deductionRule_15_0= ruleSFuseComplexTypeRule
                    {

                    							newCompositeNode(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_3_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_deductionRule_15_0=ruleSFuseComplexTypeRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSDetailTypeRule());
                    							}
                    							set(
                    								current,
                    								"deductionRule",
                    								lv_deductionRule_15_0,
                    								"com.mimacom.ddd.sm.sim.Sim.SFuseComplexTypeRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:2208:4: ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] )
                    {
                    // InternalSim.g:2208:4: ( ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current] )
                    // InternalSim.g:2209:5: ( (lv_abstract_16_0= 'abstract' ) )? otherlv_17= 'detail' ( (lv_name_18_0= RULE_ID ) ) this_SComplexTypeExtends_19= ruleSComplexTypeExtends[$current]
                    {
                    // InternalSim.g:2209:5: ( (lv_abstract_16_0= 'abstract' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==36) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSim.g:2210:6: (lv_abstract_16_0= 'abstract' )
                            {
                            // InternalSim.g:2210:6: (lv_abstract_16_0= 'abstract' )
                            // InternalSim.g:2211:7: lv_abstract_16_0= 'abstract'
                            {
                            lv_abstract_16_0=(Token)match(input,36,FOLLOW_34); 

                            							newLeafNode(lv_abstract_16_0, grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSDetailTypeRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,37,FOLLOW_5); 

                    					newLeafNode(otherlv_17, grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1());
                    				
                    // InternalSim.g:2227:5: ( (lv_name_18_0= RULE_ID ) )
                    // InternalSim.g:2228:6: (lv_name_18_0= RULE_ID )
                    {
                    // InternalSim.g:2228:6: (lv_name_18_0= RULE_ID )
                    // InternalSim.g:2229:7: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(lv_name_18_0, grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_4_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSDetailTypeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_18_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSDetailTypeRule());
                    					}
                    					newCompositeNode(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3());
                    				
                    pushFollow(FOLLOW_21);
                    this_SComplexTypeExtends_19=ruleSComplexTypeExtends(current);

                    state._fsp--;


                    					current = this_SComplexTypeExtends_19;
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
            this_SComplexTypeFeatures_20=ruleSComplexTypeFeatures(current);

            state._fsp--;


            			current = this_SComplexTypeFeatures_20;
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
    // InternalSim.g:2274:1: ruleSComplexTypeExtends[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? ;
    public final EObject ruleSComplexTypeExtends(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSim.g:2280:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )? )
            // InternalSim.g:2281:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            {
            // InternalSim.g:2281:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2282:3: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_5); 

                    			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0());
                    		
                    // InternalSim.g:2286:3: ( (otherlv_1= RULE_ID ) )
                    // InternalSim.g:2287:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSim.g:2287:4: (otherlv_1= RULE_ID )
                    // InternalSim.g:2288:5: otherlv_1= RULE_ID
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
    // InternalSim.g:2304:1: ruleSComplexTypeFeatures[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSComplexTypeFeatures(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_features_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSim.g:2310:2: ( (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' ) )
            // InternalSim.g:2311:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            {
            // InternalSim.g:2311:2: (otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}' )
            // InternalSim.g:2312:3: otherlv_0= '{' ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSim.g:2316:3: ( ( (lv_features_1_0= ruleSFeature ) ) | ( (lv_constraints_2_0= ruleSConstraint ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==20||LA36_0==30||LA36_0==34||(LA36_0>=37 && LA36_0<=40)||LA36_0==56) ) {
                    alt36=1;
                }
                else if ( (LA36_0==25) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSim.g:2317:4: ( (lv_features_1_0= ruleSFeature ) )
            	    {
            	    // InternalSim.g:2317:4: ( (lv_features_1_0= ruleSFeature ) )
            	    // InternalSim.g:2318:5: (lv_features_1_0= ruleSFeature )
            	    {
            	    // InternalSim.g:2318:5: (lv_features_1_0= ruleSFeature )
            	    // InternalSim.g:2319:6: lv_features_1_0= ruleSFeature
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesSFeatureParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    // InternalSim.g:2337:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    {
            	    // InternalSim.g:2337:4: ( (lv_constraints_2_0= ruleSConstraint ) )
            	    // InternalSim.g:2338:5: (lv_constraints_2_0= ruleSConstraint )
            	    {
            	    // InternalSim.g:2338:5: (lv_constraints_2_0= ruleSConstraint )
            	    // InternalSim.g:2339:6: lv_constraints_2_0= ruleSConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsSConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop36;
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
    // InternalSim.g:2365:1: entryRuleSFeature returns [EObject current=null] : iv_ruleSFeature= ruleSFeature EOF ;
    public final EObject entryRuleSFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFeature = null;


        try {
            // InternalSim.g:2365:49: (iv_ruleSFeature= ruleSFeature EOF )
            // InternalSim.g:2366:2: iv_ruleSFeature= ruleSFeature EOF
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
    // InternalSim.g:2372:1: ruleSFeature returns [EObject current=null] : (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) ;
    public final EObject ruleSFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SAssociation_0 = null;

        EObject this_SAttribute_1 = null;

        EObject this_SQuery_2 = null;



        	enterRule();

        try {
            // InternalSim.g:2378:2: ( (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery ) )
            // InternalSim.g:2379:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            {
            // InternalSim.g:2379:2: (this_SAssociation_0= ruleSAssociation | this_SAttribute_1= ruleSAttribute | this_SQuery_2= ruleSQuery )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 39:
                    {
                    alt37=1;
                    }
                    break;
                case 43:
                    {
                    alt37=3;
                    }
                    break;
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt37=3;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt37=1;
                    }
                    break;
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }

                }
                break;
            case 30:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 37:
                case 41:
                    {
                    alt37=2;
                    }
                    break;
                case 43:
                    {
                    alt37=3;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt37=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }

                }
                break;
            case 38:
            case 39:
            case 40:
            case 56:
                {
                alt37=1;
                }
                break;
            case 37:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                int LA37_6 = input.LA(2);

                if ( (LA37_6==44) ) {
                    alt37=3;
                }
                else if ( (LA37_6==19) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalSim.g:2380:3: this_SAssociation_0= ruleSAssociation
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
                    // InternalSim.g:2389:3: this_SAttribute_1= ruleSAttribute
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
                    // InternalSim.g:2398:3: this_SQuery_2= ruleSQuery
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
    // InternalSim.g:2410:1: entryRuleSAssociation returns [EObject current=null] : iv_ruleSAssociation= ruleSAssociation EOF ;
    public final EObject entryRuleSAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAssociation = null;


        try {
            // InternalSim.g:2410:53: (iv_ruleSAssociation= ruleSAssociation EOF )
            // InternalSim.g:2411:2: iv_ruleSAssociation= ruleSAssociation EOF
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
    // InternalSim.g:2417:1: ruleSAssociation returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) ;
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
            // InternalSim.g:2423:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:2424:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:2424:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt44=1;
                }
                break;
            case 34:
                {
                alt44=2;
                }
                break;
            case 30:
                {
                alt44=3;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 56:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSim.g:2425:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2425:3: ( () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2426:4: () otherlv_1= 'grab' (otherlv_2= 'reference' | otherlv_3= 'composite' ) ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2426:4: ()
                    // InternalSim.g:2427:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAssociationAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2437:4: (otherlv_2= 'reference' | otherlv_3= 'composite' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==38) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==39) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSim.g:2438:5: otherlv_2= 'reference'
                            {
                            otherlv_2=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2443:5: otherlv_3= 'composite'
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2448:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2449:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2449:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2450:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:2469:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2469:3: ( () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2470:4: () otherlv_6= 'morph' (otherlv_7= 'reference' | otherlv_8= 'composite' ) ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2470:4: ()
                    // InternalSim.g:2471:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAssociationAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2481:4: (otherlv_7= 'reference' | otherlv_8= 'composite' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==38) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==39) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSim.g:2482:5: otherlv_7= 'reference'
                            {
                            otherlv_7=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2487:5: otherlv_8= 'composite'
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2492:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2493:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2493:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2494:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:2513:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2513:3: ( () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2514:4: () otherlv_11= 'ditch' (otherlv_12= 'reference' | otherlv_13= 'composite' ) ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2514:4: ()
                    // InternalSim.g:2515:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAssociationAccess().getSAssociationAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAssociationAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2525:4: (otherlv_12= 'reference' | otherlv_13= 'composite' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==38) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==39) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalSim.g:2526:5: otherlv_12= 'reference'
                            {
                            otherlv_12=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2531:5: otherlv_13= 'composite'
                            {
                            otherlv_13=(Token)match(input,39,FOLLOW_5); 

                            					newLeafNode(otherlv_13, grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1());
                            				

                            }
                            break;

                    }

                    // InternalSim.g:2536:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2537:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2537:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2538:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:2557:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:2557:3: ( ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:2558:4: ( (lv_derived_15_0= 'derived' ) )? ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' ( (otherlv_21= RULE_ID ) ) ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:2558:4: ( (lv_derived_15_0= 'derived' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==40) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSim.g:2559:5: (lv_derived_15_0= 'derived' )
                            {
                            // InternalSim.g:2559:5: (lv_derived_15_0= 'derived' )
                            // InternalSim.g:2560:6: lv_derived_15_0= 'derived'
                            {
                            lv_derived_15_0=(Token)match(input,40,FOLLOW_37); 

                            						newLeafNode(lv_derived_15_0, grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSAssociationRule());
                            						}
                            						setWithLastConsumed(current, "derived", true, "derived");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSim.g:2572:4: ( ( (lv_kind_16_0= ruleSAssociationKind ) ) | ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=38 && LA42_0<=39)) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==56) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSim.g:2573:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            {
                            // InternalSim.g:2573:5: ( (lv_kind_16_0= ruleSAssociationKind ) )
                            // InternalSim.g:2574:6: (lv_kind_16_0= ruleSAssociationKind )
                            {
                            // InternalSim.g:2574:6: (lv_kind_16_0= ruleSAssociationKind )
                            // InternalSim.g:2575:7: lv_kind_16_0= ruleSAssociationKind
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
                            // InternalSim.g:2593:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            {
                            // InternalSim.g:2593:5: ( ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite' )
                            // InternalSim.g:2594:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) ) otherlv_18= 'composite'
                            {
                            // InternalSim.g:2594:6: ( (lv_kind_17_0= ruleSAssociationKindInverse ) )
                            // InternalSim.g:2595:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            {
                            // InternalSim.g:2595:7: (lv_kind_17_0= ruleSAssociationKindInverse )
                            // InternalSim.g:2596:8: lv_kind_17_0= ruleSAssociationKindInverse
                            {

                            								newCompositeNode(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0());
                            							
                            pushFollow(FOLLOW_38);
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

                    // InternalSim.g:2619:4: ( (lv_name_19_0= RULE_ID ) )
                    // InternalSim.g:2620:5: (lv_name_19_0= RULE_ID )
                    {
                    // InternalSim.g:2620:5: (lv_name_19_0= RULE_ID )
                    // InternalSim.g:2621:6: lv_name_19_0= RULE_ID
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

                    otherlv_20=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getSAssociationAccess().getColonKeyword_3_3());
                    			
                    // InternalSim.g:2641:4: ( (otherlv_21= RULE_ID ) )
                    // InternalSim.g:2642:5: (otherlv_21= RULE_ID )
                    {
                    // InternalSim.g:2642:5: (otherlv_21= RULE_ID )
                    // InternalSim.g:2643:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAssociationRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_21, grammarAccess.getSAssociationAccess().getTypeSEntityTypeCrossReference_3_4_0());
                    					

                    }


                    }

                    // InternalSim.g:2654:4: ( (lv_multiplicity_22_0= ruleSMultiplicity ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==44) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSim.g:2655:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2655:5: (lv_multiplicity_22_0= ruleSMultiplicity )
                            // InternalSim.g:2656:6: lv_multiplicity_22_0= ruleSMultiplicity
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
    // InternalSim.g:2678:1: entryRuleSAttribute returns [EObject current=null] : iv_ruleSAttribute= ruleSAttribute EOF ;
    public final EObject entryRuleSAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAttribute = null;


        try {
            // InternalSim.g:2678:51: (iv_ruleSAttribute= ruleSAttribute EOF )
            // InternalSim.g:2679:2: iv_ruleSAttribute= ruleSAttribute EOF
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
    // InternalSim.g:2685:1: ruleSAttribute returns [EObject current=null] : ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) ;
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
            // InternalSim.g:2691:2: ( ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) ) )
            // InternalSim.g:2692:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            {
            // InternalSim.g:2692:2: ( ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt51=1;
                }
                break;
            case 34:
                {
                alt51=2;
                }
                break;
            case 30:
                {
                alt51=3;
                }
                break;
            case RULE_ID:
            case 37:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalSim.g:2693:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:2693:3: ( () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:2694:4: () otherlv_1= 'grab' (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )? ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:2694:4: ()
                    // InternalSim.g:2695:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getSAttributeAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:2705:4: (otherlv_2= 'attribute' | ( (lv_detail_3_0= 'detail' ) ) )?
                    int alt45=3;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==41) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==37) ) {
                        alt45=2;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSim.g:2706:5: otherlv_2= 'attribute'
                            {
                            otherlv_2=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2711:5: ( (lv_detail_3_0= 'detail' ) )
                            {
                            // InternalSim.g:2711:5: ( (lv_detail_3_0= 'detail' ) )
                            // InternalSim.g:2712:6: (lv_detail_3_0= 'detail' )
                            {
                            // InternalSim.g:2712:6: (lv_detail_3_0= 'detail' )
                            // InternalSim.g:2713:7: lv_detail_3_0= 'detail'
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

                    // InternalSim.g:2726:4: ( (lv_deductionRule_4_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:2727:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:2727:5: (lv_deductionRule_4_0= ruleSGrabFeatureRule )
                    // InternalSim.g:2728:6: lv_deductionRule_4_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:2747:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:2747:3: ( () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:2748:4: () otherlv_6= 'morph' (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )? ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:2748:4: ()
                    // InternalSim.g:2749:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getSAttributeAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:2759:4: (otherlv_7= 'attribute' | ( (lv_detail_8_0= 'detail' ) ) )?
                    int alt46=3;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==41) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==37) ) {
                        alt46=2;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSim.g:2760:5: otherlv_7= 'attribute'
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2765:5: ( (lv_detail_8_0= 'detail' ) )
                            {
                            // InternalSim.g:2765:5: ( (lv_detail_8_0= 'detail' ) )
                            // InternalSim.g:2766:6: (lv_detail_8_0= 'detail' )
                            {
                            // InternalSim.g:2766:6: (lv_detail_8_0= 'detail' )
                            // InternalSim.g:2767:7: lv_detail_8_0= 'detail'
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

                    // InternalSim.g:2780:4: ( (lv_deductionRule_9_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:2781:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:2781:5: (lv_deductionRule_9_0= ruleSMorphFeatureRule )
                    // InternalSim.g:2782:6: lv_deductionRule_9_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:2801:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:2801:3: ( () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:2802:4: () otherlv_11= 'ditch' (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )? ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:2802:4: ()
                    // InternalSim.g:2803:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSAttributeAccess().getSAttributeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getSAttributeAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:2813:4: (otherlv_12= 'attribute' | ( (lv_detail_13_0= 'detail' ) ) )?
                    int alt47=3;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==41) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==37) ) {
                        alt47=2;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalSim.g:2814:5: otherlv_12= 'attribute'
                            {
                            otherlv_12=(Token)match(input,41,FOLLOW_5); 

                            					newLeafNode(otherlv_12, grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:2819:5: ( (lv_detail_13_0= 'detail' ) )
                            {
                            // InternalSim.g:2819:5: ( (lv_detail_13_0= 'detail' ) )
                            // InternalSim.g:2820:6: (lv_detail_13_0= 'detail' )
                            {
                            // InternalSim.g:2820:6: (lv_detail_13_0= 'detail' )
                            // InternalSim.g:2821:7: lv_detail_13_0= 'detail'
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

                    // InternalSim.g:2834:4: ( (lv_deductionRule_14_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:2835:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:2835:5: (lv_deductionRule_14_0= ruleSDitchFeatureRule )
                    // InternalSim.g:2836:6: lv_deductionRule_14_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:2855:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    {
                    // InternalSim.g:2855:3: ( ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )? )
                    // InternalSim.g:2856:4: ( (lv_detail_15_0= 'detail' ) )? ( (lv_name_16_0= RULE_ID ) ) otherlv_17= ':' ( (otherlv_18= RULE_ID ) ) ( (lv_multiplicity_19_0= ruleSMultiplicity ) )? ( (lv_key_20_0= 'key' ) )?
                    {
                    // InternalSim.g:2856:4: ( (lv_detail_15_0= 'detail' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==37) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalSim.g:2857:5: (lv_detail_15_0= 'detail' )
                            {
                            // InternalSim.g:2857:5: (lv_detail_15_0= 'detail' )
                            // InternalSim.g:2858:6: lv_detail_15_0= 'detail'
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

                    // InternalSim.g:2870:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalSim.g:2871:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalSim.g:2871:5: (lv_name_16_0= RULE_ID )
                    // InternalSim.g:2872:6: lv_name_16_0= RULE_ID
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

                    otherlv_17=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getSAttributeAccess().getColonKeyword_3_2());
                    			
                    // InternalSim.g:2892:4: ( (otherlv_18= RULE_ID ) )
                    // InternalSim.g:2893:5: (otherlv_18= RULE_ID )
                    {
                    // InternalSim.g:2893:5: (otherlv_18= RULE_ID )
                    // InternalSim.g:2894:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSAttributeRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_18, grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0());
                    					

                    }


                    }

                    // InternalSim.g:2905:4: ( (lv_multiplicity_19_0= ruleSMultiplicity ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==44) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalSim.g:2906:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:2906:5: (lv_multiplicity_19_0= ruleSMultiplicity )
                            // InternalSim.g:2907:6: lv_multiplicity_19_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0());
                            					
                            pushFollow(FOLLOW_41);
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

                    // InternalSim.g:2924:4: ( (lv_key_20_0= 'key' ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==42) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalSim.g:2925:5: (lv_key_20_0= 'key' )
                            {
                            // InternalSim.g:2925:5: (lv_key_20_0= 'key' )
                            // InternalSim.g:2926:6: lv_key_20_0= 'key'
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
    // InternalSim.g:2943:1: entryRuleSQuery returns [EObject current=null] : iv_ruleSQuery= ruleSQuery EOF ;
    public final EObject entryRuleSQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQuery = null;


        try {
            // InternalSim.g:2943:47: (iv_ruleSQuery= ruleSQuery EOF )
            // InternalSim.g:2944:2: iv_ruleSQuery= ruleSQuery EOF
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
    // InternalSim.g:2950:1: ruleSQuery returns [EObject current=null] : ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) ;
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
            // InternalSim.g:2956:2: ( ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) ) )
            // InternalSim.g:2957:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            {
            // InternalSim.g:2957:2: ( ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' ) | (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 20:
            case 34:
                {
                alt60=1;
                }
                break;
            case 30:
                {
                alt60=2;
                }
                break;
            case RULE_ID:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSim.g:2958:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    {
                    // InternalSim.g:2958:3: ( ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')' )
                    // InternalSim.g:2959:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) ) otherlv_8= '(' (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? ) otherlv_13= ')'
                    {
                    // InternalSim.g:2959:4: ( ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==20) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==34) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalSim.g:2960:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            {
                            // InternalSim.g:2960:5: ( () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) ) )
                            // InternalSim.g:2961:6: () otherlv_1= 'grab' otherlv_2= 'query' ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            {
                            // InternalSim.g:2961:6: ()
                            // InternalSim.g:2962:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_1=(Token)match(input,20,FOLLOW_42); 

                            						newLeafNode(otherlv_1, grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1());
                            					
                            otherlv_2=(Token)match(input,43,FOLLOW_5); 

                            						newLeafNode(otherlv_2, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2());
                            					
                            // InternalSim.g:2976:6: ( (lv_deductionRule_3_0= ruleSGrabFeatureRule ) )
                            // InternalSim.g:2977:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            {
                            // InternalSim.g:2977:7: (lv_deductionRule_3_0= ruleSGrabFeatureRule )
                            // InternalSim.g:2978:8: lv_deductionRule_3_0= ruleSGrabFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_3_0());
                            							
                            pushFollow(FOLLOW_43);
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
                            // InternalSim.g:2997:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            {
                            // InternalSim.g:2997:5: ( () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) ) )
                            // InternalSim.g:2998:6: () otherlv_5= 'morph' otherlv_6= 'query' ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            {
                            // InternalSim.g:2998:6: ()
                            // InternalSim.g:2999:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_5=(Token)match(input,34,FOLLOW_42); 

                            						newLeafNode(otherlv_5, grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1());
                            					
                            otherlv_6=(Token)match(input,43,FOLLOW_5); 

                            						newLeafNode(otherlv_6, grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2());
                            					
                            // InternalSim.g:3013:6: ( (lv_deductionRule_7_0= ruleSMorphFeatureRule ) )
                            // InternalSim.g:3014:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            {
                            // InternalSim.g:3014:7: (lv_deductionRule_7_0= ruleSMorphFeatureRule )
                            // InternalSim.g:3015:8: lv_deductionRule_7_0= ruleSMorphFeatureRule
                            {

                            								newCompositeNode(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_3_0());
                            							
                            pushFollow(FOLLOW_43);
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

                    otherlv_8=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_8, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalSim.g:3038:4: (otherlv_9= '*' | ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )? )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==45) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_ID||LA55_0==20||LA55_0==30||LA55_0==34||LA55_0==46) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSim.g:3039:5: otherlv_9= '*'
                            {
                            otherlv_9=(Token)match(input,45,FOLLOW_45); 

                            					newLeafNode(otherlv_9, grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSim.g:3044:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            {
                            // InternalSim.g:3044:5: ( ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )* )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==RULE_ID||LA54_0==20||LA54_0==30||LA54_0==34) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // InternalSim.g:3045:6: ( (lv_parameters_10_0= ruleSQueryParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    {
                                    // InternalSim.g:3045:6: ( (lv_parameters_10_0= ruleSQueryParameter ) )
                                    // InternalSim.g:3046:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    {
                                    // InternalSim.g:3046:7: (lv_parameters_10_0= ruleSQueryParameter )
                                    // InternalSim.g:3047:8: lv_parameters_10_0= ruleSQueryParameter
                                    {

                                    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0());
                                    							
                                    pushFollow(FOLLOW_46);
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

                                    // InternalSim.g:3064:6: (otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) ) )*
                                    loop53:
                                    do {
                                        int alt53=2;
                                        int LA53_0 = input.LA(1);

                                        if ( (LA53_0==31) ) {
                                            alt53=1;
                                        }


                                        switch (alt53) {
                                    	case 1 :
                                    	    // InternalSim.g:3065:7: otherlv_11= ',' ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,31,FOLLOW_47); 

                                    	    							newLeafNode(otherlv_11, grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0());
                                    	    						
                                    	    // InternalSim.g:3069:7: ( (lv_parameters_12_0= ruleSQueryParameter ) )
                                    	    // InternalSim.g:3070:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    {
                                    	    // InternalSim.g:3070:8: (lv_parameters_12_0= ruleSQueryParameter )
                                    	    // InternalSim.g:3071:9: lv_parameters_12_0= ruleSQueryParameter
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_46);
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
                                    	    break loop53;
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
                    // InternalSim.g:3097:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3097:3: (otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3098:4: otherlv_14= 'ditch' otherlv_15= 'query' ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getSQueryAccess().getDitchKeyword_1_0());
                    			
                    otherlv_15=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getSQueryAccess().getQueryKeyword_1_1());
                    			
                    // InternalSim.g:3106:4: ( (lv_deductionRule_16_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3107:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3107:5: (lv_deductionRule_16_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3108:6: lv_deductionRule_16_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:3127:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    {
                    // InternalSim.g:3127:3: ( ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )? )
                    // InternalSim.g:3128:4: ( (lv_name_17_0= RULE_ID ) ) otherlv_18= '(' ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )? otherlv_22= ')' otherlv_23= ':' ( (otherlv_24= RULE_ID ) ) ( (lv_multiplicity_25_0= ruleSMultiplicity ) )? (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    {
                    // InternalSim.g:3128:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalSim.g:3129:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalSim.g:3129:5: (lv_name_17_0= RULE_ID )
                    // InternalSim.g:3130:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

                    otherlv_18=(Token)match(input,44,FOLLOW_48); 

                    				newLeafNode(otherlv_18, grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalSim.g:3150:4: ( ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_ID||LA57_0==20||LA57_0==30||LA57_0==34) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSim.g:3151:5: ( (lv_parameters_19_0= ruleSQueryParameter ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            {
                            // InternalSim.g:3151:5: ( (lv_parameters_19_0= ruleSQueryParameter ) )
                            // InternalSim.g:3152:6: (lv_parameters_19_0= ruleSQueryParameter )
                            {
                            // InternalSim.g:3152:6: (lv_parameters_19_0= ruleSQueryParameter )
                            // InternalSim.g:3153:7: lv_parameters_19_0= ruleSQueryParameter
                            {

                            							newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_46);
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

                            // InternalSim.g:3170:5: (otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==31) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalSim.g:3171:6: otherlv_20= ',' ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    {
                            	    otherlv_20=(Token)match(input,31,FOLLOW_47); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalSim.g:3175:6: ( (lv_parameters_21_0= ruleSQueryParameter ) )
                            	    // InternalSim.g:3176:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    {
                            	    // InternalSim.g:3176:7: (lv_parameters_21_0= ruleSQueryParameter )
                            	    // InternalSim.g:3177:8: lv_parameters_21_0= ruleSQueryParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_46);
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
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,46,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3());
                    			
                    otherlv_23=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getSQueryAccess().getColonKeyword_2_4());
                    			
                    // InternalSim.g:3204:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSim.g:3205:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSim.g:3205:5: (otherlv_24= RULE_ID )
                    // InternalSim.g:3206:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(otherlv_24, grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0());
                    					

                    }


                    }

                    // InternalSim.g:3217:4: ( (lv_multiplicity_25_0= ruleSMultiplicity ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==44) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSim.g:3218:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3218:5: (lv_multiplicity_25_0= ruleSMultiplicity )
                            // InternalSim.g:3219:6: lv_multiplicity_25_0= ruleSMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0());
                            					
                            pushFollow(FOLLOW_50);
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

                    // InternalSim.g:3236:4: (otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==47) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalSim.g:3237:5: otherlv_26= 'returns' ( (lv_returns_27_0= ruleSExpression ) )
                            {
                            otherlv_26=(Token)match(input,47,FOLLOW_23); 

                            					newLeafNode(otherlv_26, grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0());
                            				
                            // InternalSim.g:3241:5: ( (lv_returns_27_0= ruleSExpression ) )
                            // InternalSim.g:3242:6: (lv_returns_27_0= ruleSExpression )
                            {
                            // InternalSim.g:3242:6: (lv_returns_27_0= ruleSExpression )
                            // InternalSim.g:3243:7: lv_returns_27_0= ruleSExpression
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
    // InternalSim.g:3266:1: entryRuleSQueryParameter returns [EObject current=null] : iv_ruleSQueryParameter= ruleSQueryParameter EOF ;
    public final EObject entryRuleSQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSQueryParameter = null;


        try {
            // InternalSim.g:3266:56: (iv_ruleSQueryParameter= ruleSQueryParameter EOF )
            // InternalSim.g:3267:2: iv_ruleSQueryParameter= ruleSQueryParameter EOF
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
    // InternalSim.g:3273:1: ruleSQueryParameter returns [EObject current=null] : ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) ;
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
            // InternalSim.g:3279:2: ( ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) ) )
            // InternalSim.g:3280:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            {
            // InternalSim.g:3280:2: ( ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) ) | ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) ) | ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt62=1;
                }
                break;
            case 34:
                {
                alt62=2;
                }
                break;
            case 30:
                {
                alt62=3;
                }
                break;
            case RULE_ID:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalSim.g:3281:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    {
                    // InternalSim.g:3281:3: ( () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) ) )
                    // InternalSim.g:3282:4: () otherlv_1= 'grab' ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    {
                    // InternalSim.g:3282:4: ()
                    // InternalSim.g:3283:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1());
                    			
                    // InternalSim.g:3293:4: ( (lv_deductionRule_2_0= ruleSGrabFeatureRule ) )
                    // InternalSim.g:3294:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    {
                    // InternalSim.g:3294:5: (lv_deductionRule_2_0= ruleSGrabFeatureRule )
                    // InternalSim.g:3295:6: lv_deductionRule_2_0= ruleSGrabFeatureRule
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
                    // InternalSim.g:3314:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    {
                    // InternalSim.g:3314:3: ( () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) ) )
                    // InternalSim.g:3315:4: () otherlv_4= 'morph' ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    {
                    // InternalSim.g:3315:4: ()
                    // InternalSim.g:3316:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1());
                    			
                    // InternalSim.g:3326:4: ( (lv_deductionRule_5_0= ruleSMorphFeatureRule ) )
                    // InternalSim.g:3327:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    {
                    // InternalSim.g:3327:5: (lv_deductionRule_5_0= ruleSMorphFeatureRule )
                    // InternalSim.g:3328:6: lv_deductionRule_5_0= ruleSMorphFeatureRule
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
                    // InternalSim.g:3347:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    {
                    // InternalSim.g:3347:3: ( () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) ) )
                    // InternalSim.g:3348:4: () otherlv_7= 'ditch' ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    {
                    // InternalSim.g:3348:4: ()
                    // InternalSim.g:3349:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1());
                    			
                    // InternalSim.g:3359:4: ( (lv_deductionRule_8_0= ruleSDitchFeatureRule ) )
                    // InternalSim.g:3360:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    {
                    // InternalSim.g:3360:5: (lv_deductionRule_8_0= ruleSDitchFeatureRule )
                    // InternalSim.g:3361:6: lv_deductionRule_8_0= ruleSDitchFeatureRule
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
                    // InternalSim.g:3380:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    {
                    // InternalSim.g:3380:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )? )
                    // InternalSim.g:3381:4: ( (lv_name_9_0= RULE_ID ) ) otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    {
                    // InternalSim.g:3381:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalSim.g:3382:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalSim.g:3382:5: (lv_name_9_0= RULE_ID )
                    // InternalSim.g:3383:6: lv_name_9_0= RULE_ID
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

                    otherlv_10=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1());
                    			
                    // InternalSim.g:3403:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSim.g:3404:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSim.g:3404:5: (otherlv_11= RULE_ID )
                    // InternalSim.g:3405:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSQueryParameterRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_11, grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalSim.g:3416:4: ( (lv_multiplicity_12_0= ruleSMultiplicity ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==44) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalSim.g:3417:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            {
                            // InternalSim.g:3417:5: (lv_multiplicity_12_0= ruleSMultiplicity )
                            // InternalSim.g:3418:6: lv_multiplicity_12_0= ruleSMultiplicity
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
    // InternalSim.g:3440:1: entryRuleSExpression returns [EObject current=null] : iv_ruleSExpression= ruleSExpression EOF ;
    public final EObject entryRuleSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSExpression = null;


        try {
            // InternalSim.g:3440:52: (iv_ruleSExpression= ruleSExpression EOF )
            // InternalSim.g:3441:2: iv_ruleSExpression= ruleSExpression EOF
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
    // InternalSim.g:3447:1: ruleSExpression returns [EObject current=null] : ( (lv_expr_0_0= RULE_STRING ) ) ;
    public final EObject ruleSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalSim.g:3453:2: ( ( (lv_expr_0_0= RULE_STRING ) ) )
            // InternalSim.g:3454:2: ( (lv_expr_0_0= RULE_STRING ) )
            {
            // InternalSim.g:3454:2: ( (lv_expr_0_0= RULE_STRING ) )
            // InternalSim.g:3455:3: (lv_expr_0_0= RULE_STRING )
            {
            // InternalSim.g:3455:3: (lv_expr_0_0= RULE_STRING )
            // InternalSim.g:3456:4: lv_expr_0_0= RULE_STRING
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
    // InternalSim.g:3475:1: entryRuleSQualifiedNameWithWildcard returns [String current=null] : iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF ;
    public final String entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedNameWithWildcard = null;


        try {
            // InternalSim.g:3475:66: (iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:3476:2: iv_ruleSQualifiedNameWithWildcard= ruleSQualifiedNameWithWildcard EOF
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
    // InternalSim.g:3482:1: ruleSQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3488:2: ( (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? ) )
            // InternalSim.g:3489:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            {
            // InternalSim.g:3489:2: (this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )? )
            // InternalSim.g:3490:3: this_SQualifiedName_0= ruleSQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_SQualifiedName_0=ruleSQualifiedName();

            state._fsp--;


            			current.merge(this_SQualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSim.g:3500:3: (kw= '.*' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:3501:4: kw= '.*'
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
    // InternalSim.g:3511:1: entryRuleSQualifiedName returns [String current=null] : iv_ruleSQualifiedName= ruleSQualifiedName EOF ;
    public final String entryRuleSQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQualifiedName = null;


        try {
            // InternalSim.g:3511:54: (iv_ruleSQualifiedName= ruleSQualifiedName EOF )
            // InternalSim.g:3512:2: iv_ruleSQualifiedName= ruleSQualifiedName EOF
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
    // InternalSim.g:3518:1: ruleSQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSim.g:3524:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSim.g:3525:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSim.g:3525:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSim.g:3526:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSim.g:3533:3: (kw= '.' this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==49) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSim.g:3534:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,49,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // InternalSim.g:3551:1: entryRuleSMultiplicity returns [EObject current=null] : iv_ruleSMultiplicity= ruleSMultiplicity EOF ;
    public final EObject entryRuleSMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMultiplicity = null;


        try {
            // InternalSim.g:3551:54: (iv_ruleSMultiplicity= ruleSMultiplicity EOF )
            // InternalSim.g:3552:2: iv_ruleSMultiplicity= ruleSMultiplicity EOF
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
    // InternalSim.g:3558:1: ruleSMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalSim.g:3564:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalSim.g:3565:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalSim.g:3565:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalSim.g:3566:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSim.g:3570:3: ( (lv_minOccurs_1_0= RULE_INT ) )
            // InternalSim.g:3571:4: (lv_minOccurs_1_0= RULE_INT )
            {
            // InternalSim.g:3571:4: (lv_minOccurs_1_0= RULE_INT )
            // InternalSim.g:3572:5: lv_minOccurs_1_0= RULE_INT
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_INT,FOLLOW_54); 

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

            otherlv_2=(Token)match(input,50,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSim.g:3592:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalSim.g:3593:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalSim.g:3593:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalSim.g:3594:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {

            					newCompositeNode(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:3619:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalSim.g:3619:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalSim.g:3620:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalSim.g:3626:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSim.g:3632:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSim.g:3633:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSim.g:3633:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            else if ( (LA65_0==45) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:3634:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSim.g:3642:3: kw= '*'
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
    // InternalSim.g:3651:1: ruleSInformationModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) ;
    public final Enumerator ruleSInformationModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSim.g:3657:2: ( ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) ) )
            // InternalSim.g:3658:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            {
            // InternalSim.g:3658:2: ( (enumLiteral_0= 'base' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'core' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt66=1;
                }
                break;
            case 52:
                {
                alt66=2;
                }
                break;
            case 53:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalSim.g:3659:3: (enumLiteral_0= 'base' )
                    {
                    // InternalSim.g:3659:3: (enumLiteral_0= 'base' )
                    // InternalSim.g:3660:4: enumLiteral_0= 'base'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3667:3: (enumLiteral_1= 'interface' )
                    {
                    // InternalSim.g:3667:3: (enumLiteral_1= 'interface' )
                    // InternalSim.g:3668:4: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:3675:3: (enumLiteral_2= 'core' )
                    {
                    // InternalSim.g:3675:3: (enumLiteral_2= 'core' )
                    // InternalSim.g:3676:4: enumLiteral_2= 'core'
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


    // $ANTLR start "ruleSAbstractType"
    // InternalSim.g:3686:1: ruleSAbstractType returns [Enumerator current=null] : ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) ;
    public final Enumerator ruleSAbstractType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:3692:2: ( ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) ) )
            // InternalSim.g:3693:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            {
            // InternalSim.g:3693:2: ( (enumLiteral_0= 'nonabstract' ) | (enumLiteral_1= 'abstract' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==54) ) {
                alt67=1;
            }
            else if ( (LA67_0==36) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSim.g:3694:3: (enumLiteral_0= 'nonabstract' )
                    {
                    // InternalSim.g:3694:3: (enumLiteral_0= 'nonabstract' )
                    // InternalSim.g:3695:4: enumLiteral_0= 'nonabstract'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3702:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalSim.g:3702:3: (enumLiteral_1= 'abstract' )
                    // InternalSim.g:3703:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSAbstractType"


    // $ANTLR start "ruleSRootEntity"
    // InternalSim.g:3713:1: ruleSRootEntity returns [Enumerator current=null] : ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) ;
    public final Enumerator ruleSRootEntity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:3719:2: ( ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) ) )
            // InternalSim.g:3720:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            {
            // InternalSim.g:3720:2: ( (enumLiteral_0= 'nonroot' ) | (enumLiteral_1= 'root' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==55) ) {
                alt68=1;
            }
            else if ( (LA68_0==32) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:3721:3: (enumLiteral_0= 'nonroot' )
                    {
                    // InternalSim.g:3721:3: (enumLiteral_0= 'nonroot' )
                    // InternalSim.g:3722:4: enumLiteral_0= 'nonroot'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3729:3: (enumLiteral_1= 'root' )
                    {
                    // InternalSim.g:3729:3: (enumLiteral_1= 'root' )
                    // InternalSim.g:3730:4: enumLiteral_1= 'root'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSRootEntity"


    // $ANTLR start "ruleSAssociationKind"
    // InternalSim.g:3740:1: ruleSAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleSAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSim.g:3746:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalSim.g:3747:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalSim.g:3747:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            else if ( (LA69_0==39) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSim.g:3748:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalSim.g:3748:3: (enumLiteral_0= 'reference' )
                    // InternalSim.g:3749:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:3756:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalSim.g:3756:3: (enumLiteral_1= 'composite' )
                    // InternalSim.g:3757:4: enumLiteral_1= 'composite'
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
    // InternalSim.g:3767:1: ruleSAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleSAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSim.g:3773:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalSim.g:3774:2: (enumLiteral_0= 'inverse' )
            {
            // InternalSim.g:3774:2: (enumLiteral_0= 'inverse' )
            // InternalSim.g:3775:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\24\1\32\1\uffff\1\35\1\uffff\3\40\2\uffff";
    static final String dfa_3s = "\2\45\1\uffff\1\45\1\uffff\3\45\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\2\2\1\uffff\1\4\1\3\1\uffff\2\10\1\5\1\6\1\7\1\11",
            "\1\2\2\uffff\1\4\2\uffff\2\10\3\uffff\1\11",
            "",
            "\1\4\2\uffff\2\10\3\uffff\1\11",
            "",
            "\2\10\3\uffff\1\11",
            "\2\10\3\uffff\1\11",
            "\2\10\3\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1195:2: (this_SPrimitive_0= ruleSPrimitive | this_SEnumeration_1= ruleSEnumeration | this_SEntityType_2= ruleSEntityType | this_SDetailType_3= ruleSDetailType )";
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00C0001100040012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0080000100040012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003F6D100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000043100010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000083000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040100010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x010001E443100010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x010001C440100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000022000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000600440100010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000440100010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400440100010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000900000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000040L});

}