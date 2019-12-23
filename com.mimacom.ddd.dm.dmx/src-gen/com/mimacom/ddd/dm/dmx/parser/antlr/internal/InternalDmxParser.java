package com.mimacom.ddd.dm.dmx.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDmxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_MIDDLE", "RULE_RICH_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'test'", "'context'", "','", "'{'", "'}'", "':'", "':='", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "'|'", "'ISA'", "'isa'", "'AS'", "'as'", "'entity'", "'detail'", "'='", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=5;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_RICH_TEXT_START=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_NATURAL=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_RICH_TEXT_END=8;
    public static final int RULE_RICH_TEXT_MIDDLE=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDmxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDmxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDmxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDmx.g"; }



     	private DmxGrammarAccess grammarAccess;

        public InternalDmxParser(TokenStream input, DmxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DmxNamespace";
       	}

       	@Override
       	protected DmxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDmxNamespace"
    // InternalDmx.g:65:1: entryRuleDmxNamespace returns [EObject current=null] : iv_ruleDmxNamespace= ruleDmxNamespace EOF ;
    public final EObject entryRuleDmxNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNamespace = null;


        try {
            // InternalDmx.g:65:53: (iv_ruleDmxNamespace= ruleDmxNamespace EOF )
            // InternalDmx.g:66:2: iv_ruleDmxNamespace= ruleDmxNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxNamespace=ruleDmxNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxNamespace; 
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
    // $ANTLR end "entryRuleDmxNamespace"


    // $ANTLR start "ruleDmxNamespace"
    // InternalDmx.g:72:1: ruleDmxNamespace returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'namespace' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_types_3_0= ruleDmxArchetype ) )* ( (lv_filters_4_0= ruleDmxFilter ) )* ( (lv_tests_5_0= ruleDmxTest ) )* ) ;
    public final EObject ruleDmxNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_filters_4_0 = null;

        EObject lv_tests_5_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:78:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'namespace' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_types_3_0= ruleDmxArchetype ) )* ( (lv_filters_4_0= ruleDmxFilter ) )* ( (lv_tests_5_0= ruleDmxTest ) )* ) )
            // InternalDmx.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'namespace' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_types_3_0= ruleDmxArchetype ) )* ( (lv_filters_4_0= ruleDmxFilter ) )* ( (lv_tests_5_0= ruleDmxTest ) )* )
            {
            // InternalDmx.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'namespace' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_types_3_0= ruleDmxArchetype ) )* ( (lv_filters_4_0= ruleDmxFilter ) )* ( (lv_tests_5_0= ruleDmxTest ) )* )
            // InternalDmx.g:80:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'namespace' ( (lv_name_2_0= ruleDQualifiedName ) ) ( (lv_types_3_0= ruleDmxArchetype ) )* ( (lv_filters_4_0= ruleDmxFilter ) )* ( (lv_tests_5_0= ruleDmxTest ) )*
            {
            // InternalDmx.g:80:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDmx.g:81:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalDmx.g:81:4: (lv_imports_0_0= ruleDImport )
            	    // InternalDmx.g:82:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxNamespaceAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxNamespaceAccess().getNamespaceKeyword_1());
              		
            }
            // InternalDmx.g:103:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalDmx.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalDmx.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalDmx.g:105:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxNamespaceAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxNamespaceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDmx.g:122:3: ( (lv_types_3_0= ruleDmxArchetype ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDmx.g:123:4: (lv_types_3_0= ruleDmxArchetype )
            	    {
            	    // InternalDmx.g:123:4: (lv_types_3_0= ruleDmxArchetype )
            	    // InternalDmx.g:124:5: lv_types_3_0= ruleDmxArchetype
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxNamespaceAccess().getTypesDmxArchetypeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleDmxArchetype();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_3_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxArchetype");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDmx.g:141:3: ( (lv_filters_4_0= ruleDmxFilter ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDmx.g:142:4: (lv_filters_4_0= ruleDmxFilter )
            	    {
            	    // InternalDmx.g:142:4: (lv_filters_4_0= ruleDmxFilter )
            	    // InternalDmx.g:143:5: lv_filters_4_0= ruleDmxFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxNamespaceAccess().getFiltersDmxFilterParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_filters_4_0=ruleDmxFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"filters",
            	      						lv_filters_4_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxFilter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDmx.g:160:3: ( (lv_tests_5_0= ruleDmxTest ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDmx.g:161:4: (lv_tests_5_0= ruleDmxTest )
            	    {
            	    // InternalDmx.g:161:4: (lv_tests_5_0= ruleDmxTest )
            	    // InternalDmx.g:162:5: lv_tests_5_0= ruleDmxTest
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxNamespaceAccess().getTestsDmxTestParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_tests_5_0=ruleDmxTest();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDmxNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tests",
            	      						lv_tests_5_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DmxTest");
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
    // $ANTLR end "ruleDmxNamespace"


    // $ANTLR start "entryRuleDImport"
    // InternalDmx.g:183:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDmx.g:183:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDmx.g:184:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDmx.g:190:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:196:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDmx.g:197:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDmx.g:197:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDmx.g:198:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDmx.g:202:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDmx.g:203:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDmx.g:203:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDmx.g:204:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDmx.g:225:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDmx.g:225:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDmx.g:226:2: iv_ruleDmxTest= ruleDmxTest EOF
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
    // InternalDmx.g:232:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
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
            // InternalDmx.g:238:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDmx.g:239:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDmx.g:239:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDmx.g:240:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDmx.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmx.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDmx.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalDmx.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            // InternalDmx.g:262:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDmx.g:263:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDmx.g:267:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDmx.g:268:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDmx.g:268:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDmx.g:269:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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

                    // InternalDmx.g:286:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDmx.g:287:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:291:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDmx.g:292:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDmx.g:292:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDmx.g:293:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDmx.g:316:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDmx.g:317:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDmx.g:317:4: (lv_expr_7_0= ruleDExpression )
            // InternalDmx.g:318:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
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
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:343:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDmx.g:343:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDmx.g:344:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
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
    // InternalDmx.g:350:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) ;
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
            // InternalDmx.g:356:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? ) )
            // InternalDmx.g:357:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            {
            // InternalDmx.g:357:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )? )
            // InternalDmx.g:358:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            {
            // InternalDmx.g:358:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmx.g:359:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDmx.g:359:4: (lv_name_0_0= RULE_ID )
            // InternalDmx.g:360:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDmx.g:380:3: ( (otherlv_2= RULE_ID ) )
            // InternalDmx.g:381:4: (otherlv_2= RULE_ID )
            {
            // InternalDmx.g:381:4: (otherlv_2= RULE_ID )
            // InternalDmx.g:382:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDmx.g:393:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27||LA7_0==33||LA7_0==61||LA7_0==98) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDmx.g:394:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDmx.g:394:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDmx.g:395:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalDmx.g:412:3: (otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDmx.g:413:4: otherlv_4= ':=' ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxTestContextAccess().getColonEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalDmx.g:417:4: ( ( (lv_value_5_0= ruleDmxLiteralExpression ) ) | ( (lv_value_6_0= ruleDmxLiteralListExpression ) ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_NATURAL && LA8_0<=RULE_STRING)||(LA8_0>=41 && LA8_0<=42)||(LA8_0>=53 && LA8_0<=58)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==22) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDmx.g:418:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            {
                            // InternalDmx.g:418:5: ( (lv_value_5_0= ruleDmxLiteralExpression ) )
                            // InternalDmx.g:419:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            {
                            // InternalDmx.g:419:6: (lv_value_5_0= ruleDmxLiteralExpression )
                            // InternalDmx.g:420:7: lv_value_5_0= ruleDmxLiteralExpression
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
                            // InternalDmx.g:438:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            {
                            // InternalDmx.g:438:5: ( (lv_value_6_0= ruleDmxLiteralListExpression ) )
                            // InternalDmx.g:439:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            {
                            // InternalDmx.g:439:6: (lv_value_6_0= ruleDmxLiteralListExpression )
                            // InternalDmx.g:440:7: lv_value_6_0= ruleDmxLiteralListExpression
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
    // InternalDmx.g:463:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDmx.g:463:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDmx.g:464:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
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
    // InternalDmx.g:470:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
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
            // InternalDmx.g:476:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDmx.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDmx.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDmx.g:478:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDmx.g:478:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmx.g:479:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDmx.g:479:4: (lv_name_0_0= RULE_ID )
            // InternalDmx.g:480:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDmx.g:504:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDmx.g:505:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDmx.g:505:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDmx.g:506:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalDmx.g:523:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDmx.g:524:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDmx.g:528:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDmx.g:529:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDmx.g:529:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDmx.g:530:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:556:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDmx.g:556:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDmx.g:557:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
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
    // InternalDmx.g:563:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:569:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDmx.g:570:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDmx.g:570:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDmx.g:571:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDmx.g:575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmx.g:576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDmx.g:576:4: (lv_name_1_0= RULE_ID )
            // InternalDmx.g:577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDmx.g:597:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDmx.g:598:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDmx.g:598:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDmx.g:599:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalDmx.g:616:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_PLAIN_TEXT_ONLY && LA11_0<=RULE_RICH_TEXT_START)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDmx.g:617:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDmx.g:617:4: (lv_description_4_0= ruleDRichText )
                    // InternalDmx.g:618:5: lv_description_4_0= ruleDRichText
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
    // InternalDmx.g:639:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDmx.g:639:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDmx.g:640:2: iv_ruleDmxFilter= ruleDmxFilter EOF
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
    // InternalDmx.g:646:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
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
            // InternalDmx.g:652:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDmx.g:653:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDmx.g:653:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDmx.g:654:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDmx.g:658:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDmx.g:659:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDmx.g:659:4: (lv_name_1_0= RULE_ID )
            // InternalDmx.g:660:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDmx.g:680:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDmx.g:681:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDmx.g:681:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDmx.g:682:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDmx.g:682:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDmx.g:683:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalDmx.g:700:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==21) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDmx.g:701:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:705:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDmx.g:706:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDmx.g:706:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDmx.g:707:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDmx.g:734:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDmx.g:735:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDmx.g:735:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDmx.g:736:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalDmx.g:753:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDmx.g:754:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDmx.g:758:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDmx.g:759:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDmx.g:759:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDmx.g:760:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
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
    // InternalDmx.g:782:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDmx.g:782:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDmx.g:783:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
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
    // InternalDmx.g:789:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:795:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDmx.g:796:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDmx.g:796:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDmx.g:797:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDmx.g:797:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=64 && LA15_0<=74)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDmx.g:798:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDmx.g:798:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDmx.g:799:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDmx.g:799:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDmx.g:800:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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
                    // InternalDmx.g:818:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDmx.g:818:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDmx.g:819:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDmx.g:819:5: (otherlv_1= RULE_ID )
                    // InternalDmx.g:820:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDmx.g:832:3: ( (lv_collection_2_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDmx.g:833:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDmx.g:833:4: (lv_collection_2_0= '*' )
                    // InternalDmx.g:834:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:850:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDmx.g:850:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDmx.g:851:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
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
    // InternalDmx.g:857:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:863:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDmx.g:864:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDmx.g:864:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDmx.g:865:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDmx.g:865:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmx.g:866:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDmx.g:866:4: (lv_name_0_0= RULE_ID )
            // InternalDmx.g:867:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDmx.g:887:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDmx.g:888:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDmx.g:888:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDmx.g:889:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
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


    // $ANTLR start "entryRuleDExpression"
    // InternalDmx.g:910:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDmx.g:910:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDmx.g:911:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDmx.g:917:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDmx.g:923:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDmx.g:924:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDmx.g:924:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||LA17_1==RULE_ID||(LA17_1>=RULE_RICH_TEXT_MIDDLE && LA17_1<=RULE_RICH_TEXT_END)||LA17_1==21||LA17_1==23||(LA17_1>=26 && LA17_1<=28)||(LA17_1>=33 && LA17_1<=40)||LA17_1==43||(LA17_1>=49 && LA17_1<=52)||(LA17_1>=61 && LA17_1<=62)||(LA17_1>=75 && LA17_1<=94)) ) {
                    alt17=2;
                }
                else if ( (LA17_1==25) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 22:
            case 27:
            case 41:
            case 42:
            case 44:
            case 48:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 61:
            case 62:
            case 95:
            case 96:
            case 97:
                {
                alt17=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_RICH_TEXT_START:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDmx.g:925:3: this_DmxAssignment_0= ruleDmxAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDmxAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxAssignment_0=ruleDmxAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:934:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDmxPredicateWithCorrelationVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxPredicateWithCorrelationVariable_1=ruleDmxPredicateWithCorrelationVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxPredicateWithCorrelationVariable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDmx.g:943:3: this_DRichText_2= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRichText_2=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRichText_2;
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
    // $ANTLR end "ruleDExpression"


    // $ANTLR start "entryRuleDRichText"
    // InternalDmx.g:955:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDmx.g:955:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDmx.g:956:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDmx.g:962:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDmx.g:968:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDmx.g:969:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDmx.g:969:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_RICH_TEXT_START) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDmx.g:970:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDmx.g:970:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDmx.g:971:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDmx.g:971:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDmx.g:972:5: lv_segments_0_0= ruleDmxTextOnly
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
                    // InternalDmx.g:990:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDmx.g:990:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDmx.g:991:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDmx.g:991:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDmx.g:992:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDmx.g:992:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDmx.g:993:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
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

                    // InternalDmx.g:1010:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDmx.g:1011:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDmx.g:1011:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDmx.g:1012:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:1029:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_RICH_TEXT_MIDDLE) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDmx.g:1030:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDmx.g:1030:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDmx.g:1031:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDmx.g:1031:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDmx.g:1032:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
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

                    	    // InternalDmx.g:1049:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDmx.g:1050:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDmx.g:1050:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDmx.g:1051:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
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
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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

                    // InternalDmx.g:1069:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDmx.g:1070:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDmx.g:1070:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDmx.g:1071:6: lv_segments_5_0= ruleDmxTextEnd
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
    // InternalDmx.g:1093:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDmx.g:1093:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDmx.g:1094:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
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
    // InternalDmx.g:1100:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:1106:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDmx.g:1107:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDmx.g:1107:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:1108:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:1108:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:1109:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDmx.g:1128:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDmx.g:1128:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDmx.g:1129:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
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
    // InternalDmx.g:1135:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:1141:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // InternalDmx.g:1142:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // InternalDmx.g:1142:2: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // InternalDmx.g:1143:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // InternalDmx.g:1143:3: (lv_value_0_0= RULE_RICH_TEXT_START )
            // InternalDmx.g:1144:4: lv_value_0_0= RULE_RICH_TEXT_START
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
    // InternalDmx.g:1163:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDmx.g:1163:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDmx.g:1164:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
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
    // InternalDmx.g:1170:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:1176:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) ) )
            // InternalDmx.g:1177:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            {
            // InternalDmx.g:1177:2: ( (lv_value_0_0= RULE_RICH_TEXT_MIDDLE ) )
            // InternalDmx.g:1178:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            {
            // InternalDmx.g:1178:3: (lv_value_0_0= RULE_RICH_TEXT_MIDDLE )
            // InternalDmx.g:1179:4: lv_value_0_0= RULE_RICH_TEXT_MIDDLE
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
    // InternalDmx.g:1198:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDmx.g:1198:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDmx.g:1199:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
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
    // InternalDmx.g:1205:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:1211:2: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // InternalDmx.g:1212:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // InternalDmx.g:1212:2: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // InternalDmx.g:1213:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // InternalDmx.g:1213:3: (lv_value_0_0= RULE_RICH_TEXT_END )
            // InternalDmx.g:1214:4: lv_value_0_0= RULE_RICH_TEXT_END
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
    // InternalDmx.g:1233:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDmx.g:1233:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDmx.g:1234:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
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
    // InternalDmx.g:1240:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDmx.g:1246:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDmx.g:1247:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDmx.g:1247:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDmx.g:1248:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1256:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred1_InternalDmx()) ) {
                        alt21=1;
                    }
                    else if ( (synpred2_InternalDmx()) ) {
                        alt21=2;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalDmx.g:1257:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDmx.g:1257:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDmx.g:1258:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDmx.g:1258:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDmx.g:1259:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDmx.g:1271:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDmx.g:1272:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDmx.g:1272:7: ()
            	    // InternalDmx.g:1273:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDmx.g:1283:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDmx.g:1284:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDmx.g:1284:8: (otherlv_3= RULE_ID )
            	    // InternalDmx.g:1285:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_30);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1305:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDmx.g:1306:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDmx.g:1306:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDmx.g:1307:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    // InternalDmx.g:1326:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDmx.g:1326:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDmx.g:1327:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDmx.g:1327:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDmx.g:1328:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDmx.g:1334:6: ( () otherlv_7= '.' )
            	    // InternalDmx.g:1335:7: () otherlv_7= '.'
            	    {
            	    // InternalDmx.g:1335:7: ()
            	    // InternalDmx.g:1336:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1348:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDmx.g:1349:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDmx.g:1349:6: (otherlv_8= RULE_ID )
            	    // InternalDmx.g:1350:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1361:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt20=3;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==27) && (synpred3_InternalDmx())) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==35) ) {
            	        alt20=2;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDmx.g:1362:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDmx.g:1362:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDmx.g:1363:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDmx.g:1363:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDmx.g:1364:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDmx.g:1368:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDmx.g:1369:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,27,FOLLOW_32); if (state.failed) return current;
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

            	            // InternalDmx.g:1381:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDmx.g:1382:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDmx.g:1382:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDmx.g:1383:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_33);
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

            	            otherlv_11=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDmx.g:1406:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDmx.g:1406:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDmx.g:1407:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDmx.g:1407:7: (lv_before_12_0= '@before' )
            	            // InternalDmx.g:1408:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
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
            	    break loop21;
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
    // InternalDmx.g:1427:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDmx.g:1427:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDmx.g:1428:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
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
    // InternalDmx.g:1434:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1440:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDmx.g:1441:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDmx.g:1441:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDmx.g:1442:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDmx.g:1442:3: ()
            // InternalDmx.g:1443:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:1449:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=RULE_NATURAL && LA23_0<=RULE_STRING)||LA23_0==22||LA23_0==27||(LA23_0>=41 && LA23_0<=42)||LA23_0==44||LA23_0==48||(LA23_0>=53 && LA23_0<=58)||(LA23_0>=61 && LA23_0<=62)||(LA23_0>=95 && LA23_0<=97)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDmx.g:1450:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDmx.g:1450:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDmx.g:1451:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDmx.g:1451:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDmx.g:1452:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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

                    // InternalDmx.g:1469:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==21) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDmx.g:1470:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:1474:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDmx.g:1475:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDmx.g:1475:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDmx.g:1476:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_34);
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
                    	    break loop22;
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


    // $ANTLR start "entryRuleDmxAssignment"
    // InternalDmx.g:1499:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDmx.g:1499:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDmx.g:1500:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxAssignment=ruleDmxAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxAssignment; 
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
    // $ANTLR end "entryRuleDmxAssignment"


    // $ANTLR start "ruleDmxAssignment"
    // InternalDmx.g:1506:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1512:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDmx.g:1513:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDmx.g:1513:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDmx.g:1514:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDmx.g:1514:3: ()
            // InternalDmx.g:1515:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:1521:3: ( (otherlv_1= RULE_ID ) )
            // InternalDmx.g:1522:4: (otherlv_1= RULE_ID )
            {
            // InternalDmx.g:1522:4: (otherlv_1= RULE_ID )
            // InternalDmx.g:1523:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_30);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1541:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDmx.g:1542:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDmx.g:1542:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDmx.g:1543:5: lv_value_3_0= ruleDmxOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxAssignmentAccess().getValueDmxOrExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleDmxOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxOrExpression");
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
    // $ANTLR end "ruleDmxAssignment"


    // $ANTLR start "entryRuleDmxOpSingleAssign"
    // InternalDmx.g:1564:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDmx.g:1564:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDmx.g:1565:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
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
    // InternalDmx.g:1571:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:1577:2: (kw= ':=' )
            // InternalDmx.g:1578:2: kw= ':='
            {
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:1586:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDmx.g:1586:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDmx.g:1587:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
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
    // InternalDmx.g:1593:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDmx.g:1599:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDmx.g:1600:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDmx.g:1600:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==36) ) {
                    alt24=1;
                }
                else if ( (LA24_1==EOF||LA24_1==RULE_ID||(LA24_1>=RULE_RICH_TEXT_MIDDLE && LA24_1<=RULE_RICH_TEXT_END)||LA24_1==21||LA24_1==23||(LA24_1>=26 && LA24_1<=28)||(LA24_1>=33 && LA24_1<=35)||(LA24_1>=37 && LA24_1<=40)||LA24_1==43||(LA24_1>=49 && LA24_1<=52)||(LA24_1>=61 && LA24_1<=62)||(LA24_1>=75 && LA24_1<=94)) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA24_0>=RULE_NATURAL && LA24_0<=RULE_STRING)||LA24_0==22||LA24_0==27||(LA24_0>=41 && LA24_0<=42)||LA24_0==44||LA24_0==48||(LA24_0>=53 && LA24_0<=58)||(LA24_0>=61 && LA24_0<=62)||(LA24_0>=95 && LA24_0<=97)) ) {
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
                    // InternalDmx.g:1601:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDmx.g:1601:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDmx.g:1602:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDmx.g:1602:4: ()
                    // InternalDmx.g:1603:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDmx.g:1609:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDmx.g:1610:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDmx.g:1610:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDmx.g:1611:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    otherlv_2=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDmx.g:1632:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDmx.g:1633:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDmx.g:1633:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDmx.g:1634:6: lv_predicate_3_0= ruleDmxOrExpression
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
                    // InternalDmx.g:1653:3: this_DmxOrExpression_4= ruleDmxOrExpression
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
    // InternalDmx.g:1665:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDmx.g:1665:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDmx.g:1666:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
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
    // InternalDmx.g:1672:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:1678:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDmx.g:1679:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDmx.g:1679:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDmx.g:1680:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDmx.g:1680:3: (lv_name_0_0= RULE_ID )
            // InternalDmx.g:1681:4: lv_name_0_0= RULE_ID
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
    // InternalDmx.g:1700:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDmx.g:1700:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDmx.g:1701:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
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
    // InternalDmx.g:1707:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1713:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDmx.g:1714:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDmx.g:1714:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDmx.g:1715:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1723:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case 75:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred4_InternalDmx()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred4_InternalDmx()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred4_InternalDmx()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred4_InternalDmx()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalDmx.g:1724:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDmx.g:1724:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDmx.g:1725:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDmx.g:1735:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDmx.g:1736:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDmx.g:1736:6: ()
            	    // InternalDmx.g:1737:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1743:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDmx.g:1744:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDmx.g:1744:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDmx.g:1745:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:1764:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDmx.g:1765:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDmx.g:1765:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDmx.g:1766:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop25;
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
    // InternalDmx.g:1788:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDmx.g:1788:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDmx.g:1789:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
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
    // InternalDmx.g:1795:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1801:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDmx.g:1802:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDmx.g:1802:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDmx.g:1803:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1811:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==79) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred5_InternalDmx()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==80) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred5_InternalDmx()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalDmx.g:1812:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDmx.g:1812:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDmx.g:1813:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDmx.g:1823:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDmx.g:1824:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDmx.g:1824:6: ()
            	    // InternalDmx.g:1825:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1831:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDmx.g:1832:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDmx.g:1832:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDmx.g:1833:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:1852:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDmx.g:1853:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDmx.g:1853:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDmx.g:1854:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop26;
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
    // InternalDmx.g:1876:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDmx.g:1876:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDmx.g:1877:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
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
    // InternalDmx.g:1883:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1889:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDmx.g:1890:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDmx.g:1890:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDmx.g:1891:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1899:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 82:
                    {
                    int LA27_4 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt27=1;
                    }


                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalDmx.g:1900:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDmx.g:1900:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDmx.g:1901:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDmx.g:1911:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDmx.g:1912:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDmx.g:1912:6: ()
            	    // InternalDmx.g:1913:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1919:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDmx.g:1920:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDmx.g:1920:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDmx.g:1921:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:1940:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDmx.g:1941:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDmx.g:1941:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDmx.g:1942:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop27;
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
    // InternalDmx.g:1964:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDmx.g:1964:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDmx.g:1965:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
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
    // InternalDmx.g:1971:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1977:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDmx.g:1978:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDmx.g:1978:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDmx.g:1979:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1987:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop28:
            do {
                int alt28=3;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // InternalDmx.g:1988:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDmx.g:1988:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDmx.g:1989:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDmx.g:1989:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDmx.g:1990:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDmx.g:1996:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDmx.g:1997:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDmx.g:1997:7: ()
            	    // InternalDmx.g:1998:8: 
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

            	    // InternalDmx.g:2013:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDmx.g:2014:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDmx.g:2014:6: (otherlv_3= RULE_ID )
            	    // InternalDmx.g:2015:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDmx.g:2028:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDmx.g:2028:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDmx.g:2029:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDmx.g:2029:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDmx.g:2030:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDmx.g:2040:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDmx.g:2041:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDmx.g:2041:7: ()
            	    // InternalDmx.g:2042:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDmx.g:2048:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDmx.g:2049:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDmx.g:2049:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDmx.g:2050:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:2069:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDmx.g:2070:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDmx.g:2070:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDmx.g:2071:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop28;
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
    // InternalDmx.g:2094:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDmx.g:2094:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDmx.g:2095:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
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
    // InternalDmx.g:2101:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:2107:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDmx.g:2108:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDmx.g:2108:2: (kw= 'ISA' | kw= 'isa' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==38) ) {
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
                    // InternalDmx.g:2109:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:2115:3: kw= 'isa'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2124:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDmx.g:2124:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDmx.g:2125:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
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
    // InternalDmx.g:2131:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2137:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDmx.g:2138:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDmx.g:2138:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDmx.g:2139:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:2147:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 89:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred9_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred9_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred9_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred9_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA30_6 = input.LA(2);

                    if ( (synpred9_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalDmx.g:2148:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDmx.g:2148:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDmx.g:2149:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDmx.g:2159:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDmx.g:2160:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDmx.g:2160:6: ()
            	    // InternalDmx.g:2161:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:2167:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDmx.g:2168:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDmx.g:2168:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDmx.g:2169:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:2188:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDmx.g:2189:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDmx.g:2189:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDmx.g:2190:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop30;
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
    // InternalDmx.g:2212:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDmx.g:2212:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDmx.g:2213:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
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
    // InternalDmx.g:2219:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2225:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDmx.g:2226:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDmx.g:2226:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDmx.g:2227:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:2235:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==61) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred10_InternalDmx()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==62) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred10_InternalDmx()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalDmx.g:2236:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDmx.g:2236:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDmx.g:2237:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDmx.g:2247:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDmx.g:2248:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDmx.g:2248:6: ()
            	    // InternalDmx.g:2249:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:2255:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDmx.g:2256:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDmx.g:2256:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDmx.g:2257:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:2276:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDmx.g:2277:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDmx.g:2277:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDmx.g:2278:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop31;
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
    // InternalDmx.g:2300:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDmx.g:2300:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDmx.g:2301:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
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
    // InternalDmx.g:2307:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2313:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDmx.g:2314:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDmx.g:2314:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDmx.g:2315:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:2323:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred11_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred11_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred11_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA32_5 = input.LA(2);

                    if ( (synpred11_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalDmx.g:2324:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDmx.g:2324:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDmx.g:2325:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDmx.g:2335:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDmx.g:2336:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDmx.g:2336:6: ()
            	    // InternalDmx.g:2337:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:2343:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDmx.g:2344:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDmx.g:2344:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDmx.g:2345:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_30);
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

            	    // InternalDmx.g:2364:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDmx.g:2365:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDmx.g:2365:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDmx.g:2366:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
            	    break loop32;
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
    // InternalDmx.g:2388:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDmx.g:2388:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDmx.g:2389:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
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
    // InternalDmx.g:2395:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDmx.g:2401:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDmx.g:2402:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDmx.g:2402:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=61 && LA33_0<=62)||(LA33_0>=95 && LA33_0<=97)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID||(LA33_0>=RULE_NATURAL && LA33_0<=RULE_STRING)||LA33_0==22||LA33_0==27||(LA33_0>=41 && LA33_0<=42)||LA33_0==44||LA33_0==48||(LA33_0>=53 && LA33_0<=58)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDmx.g:2403:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDmx.g:2403:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDmx.g:2404:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDmx.g:2404:4: ()
                    // InternalDmx.g:2405:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDmx.g:2411:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDmx.g:2412:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDmx.g:2412:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDmx.g:2413:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    // InternalDmx.g:2430:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDmx.g:2431:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDmx.g:2431:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDmx.g:2432:6: lv_operand_2_0= ruleDmxUnaryOperation
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
                    // InternalDmx.g:2451:3: this_DmxCastExpression_3= ruleDmxCastExpression
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
    // InternalDmx.g:2463:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDmx.g:2463:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDmx.g:2464:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
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
    // InternalDmx.g:2470:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2476:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDmx.g:2477:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDmx.g:2477:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDmx.g:2478:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:2486:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred12_InternalDmx()) ) {
                    alt34=1;
                }
            }
            else if ( (LA34_0==40) ) {
                int LA34_2 = input.LA(2);

                if ( (synpred12_InternalDmx()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalDmx.g:2487:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDmx.g:2487:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDmx.g:2488:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDmx.g:2494:5: ( () ruleDmxOpCast )
                    // InternalDmx.g:2495:6: () ruleDmxOpCast
                    {
                    // InternalDmx.g:2495:6: ()
                    // InternalDmx.g:2496:7: 
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

                    // InternalDmx.g:2511:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDmx.g:2512:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDmx.g:2512:5: (otherlv_3= RULE_ID )
                    // InternalDmx.g:2513:6: otherlv_3= RULE_ID
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
    // InternalDmx.g:2529:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDmx.g:2529:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDmx.g:2530:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
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
    // InternalDmx.g:2536:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:2542:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDmx.g:2543:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDmx.g:2543:2: (kw= 'AS' | kw= 'as' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            else if ( (LA35_0==40) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDmx.g:2544:3: kw= 'AS'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:2550:3: kw= 'as'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2559:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDmx.g:2559:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDmx.g:2560:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
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
    // InternalDmx.g:2566:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) ;
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
            // InternalDmx.g:2572:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression ) )
            // InternalDmx.g:2573:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            {
            // InternalDmx.g:2573:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxStaticReference_4= ruleDmxStaticReference | this_DmxContextReference_5= ruleDmxContextReference | this_DmxIfExpression_6= ruleDmxIfExpression )
            int alt36=7;
            switch ( input.LA(1) ) {
            case RULE_NATURAL:
            case RULE_STRING:
            case 41:
            case 42:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt36=1;
                }
                break;
            case 27:
                {
                alt36=2;
                }
                break;
            case 22:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
                {
                int LA36_4 = input.LA(2);

                if ( (LA36_4==EOF||LA36_4==RULE_ID||(LA36_4>=RULE_RICH_TEXT_MIDDLE && LA36_4<=RULE_RICH_TEXT_END)||LA36_4==21||LA36_4==23||LA36_4==26||LA36_4==28||(LA36_4>=33 && LA36_4<=35)||(LA36_4>=37 && LA36_4<=40)||LA36_4==43||(LA36_4>=49 && LA36_4<=52)||(LA36_4>=61 && LA36_4<=62)||(LA36_4>=75 && LA36_4<=94)) ) {
                    alt36=6;
                }
                else if ( (LA36_4==27) ) {
                    alt36=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt36=5;
                }
                break;
            case 48:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDmx.g:2574:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
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
                    // InternalDmx.g:2583:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
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
                    // InternalDmx.g:2592:3: this_DmxListExpression_2= ruleDmxListExpression
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
                    // InternalDmx.g:2601:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
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
                    // InternalDmx.g:2610:3: this_DmxStaticReference_4= ruleDmxStaticReference
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
                    // InternalDmx.g:2619:3: this_DmxContextReference_5= ruleDmxContextReference
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
                    // InternalDmx.g:2628:3: this_DmxIfExpression_6= ruleDmxIfExpression
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
    // InternalDmx.g:2640:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDmx.g:2640:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDmx.g:2641:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
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
    // InternalDmx.g:2647:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) ;
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
            // InternalDmx.g:2653:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail ) )
            // InternalDmx.g:2654:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            {
            // InternalDmx.g:2654:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )
            int alt37=7;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalDmx.g:2655:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
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
                    // InternalDmx.g:2664:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
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
                    // InternalDmx.g:2673:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
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
                    // InternalDmx.g:2682:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
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
                    // InternalDmx.g:2691:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
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
                    // InternalDmx.g:2700:3: this_DmxEntity_5= ruleDmxEntity
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
                    // InternalDmx.g:2709:3: this_DmxDetail_6= ruleDmxDetail
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
    // InternalDmx.g:2721:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDmx.g:2721:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDmx.g:2722:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
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
    // InternalDmx.g:2728:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDmx.g:2734:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDmx.g:2735:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDmx.g:2735:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDmx.g:2736:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2756:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDmx.g:2756:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDmx.g:2757:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
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
    // InternalDmx.g:2763:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2769:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDmx.g:2770:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDmx.g:2770:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDmx.g:2771:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDmx.g:2771:3: ()
            // InternalDmx.g:2772:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDmx.g:2782:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_RICH_TEXT_START)||(LA39_0>=RULE_NATURAL && LA39_0<=RULE_STRING)||LA39_0==22||LA39_0==27||(LA39_0>=41 && LA39_0<=42)||LA39_0==44||LA39_0==48||(LA39_0>=53 && LA39_0<=58)||(LA39_0>=61 && LA39_0<=62)||(LA39_0>=95 && LA39_0<=97)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmx.g:2783:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDmx.g:2783:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDmx.g:2784:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDmx.g:2784:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDmx.g:2785:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:2802:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDmx.g:2803:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:2807:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDmx.g:2808:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDmx.g:2808:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDmx.g:2809:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2836:1: entryRuleDmxLiteralListExpression returns [EObject current=null] : iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF ;
    public final EObject entryRuleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralListExpression = null;


        try {
            // InternalDmx.g:2836:65: (iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF )
            // InternalDmx.g:2837:2: iv_ruleDmxLiteralListExpression= ruleDmxLiteralListExpression EOF
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
    // InternalDmx.g:2843:1: ruleDmxLiteralListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxLiteralListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2849:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDmx.g:2850:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDmx.g:2850:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}' )
            // InternalDmx.g:2851:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDmx.g:2851:3: ()
            // InternalDmx.g:2852:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxLiteralListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxLiteralListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDmx.g:2862:3: ( ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_NATURAL && LA41_0<=RULE_STRING)||(LA41_0>=41 && LA41_0<=42)||(LA41_0>=53 && LA41_0<=58)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmx.g:2863:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    {
                    // InternalDmx.g:2863:4: ( (lv_elements_2_0= ruleDmxLiteralExpression ) )
                    // InternalDmx.g:2864:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    {
                    // InternalDmx.g:2864:5: (lv_elements_2_0= ruleDmxLiteralExpression )
                    // InternalDmx.g:2865:6: lv_elements_2_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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

                    // InternalDmx.g:2882:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==21) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalDmx.g:2883:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxLiteralListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:2887:5: ( (lv_elements_4_0= ruleDmxLiteralExpression ) )
                    	    // InternalDmx.g:2888:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    {
                    	    // InternalDmx.g:2888:6: (lv_elements_4_0= ruleDmxLiteralExpression )
                    	    // InternalDmx.g:2889:7: lv_elements_4_0= ruleDmxLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxLiteralListExpressionAccess().getElementsDmxLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2916:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDmx.g:2916:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDmx.g:2917:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
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
    // InternalDmx.g:2923:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2929:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDmx.g:2930:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDmx.g:2930:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDmx.g:2931:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDmx.g:2931:3: ()
            // InternalDmx.g:2932:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2938:3: ( (otherlv_1= RULE_ID ) )
            // InternalDmx.g:2939:4: (otherlv_1= RULE_ID )
            {
            // InternalDmx.g:2939:4: (otherlv_1= RULE_ID )
            // InternalDmx.g:2940:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDmx.g:2955:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDmx.g:2956:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDmx.g:2956:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDmx.g:2957:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:2982:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDmx.g:2982:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDmx.g:2983:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
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
    // InternalDmx.g:2989:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2995:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDmx.g:2996:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDmx.g:2996:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDmx.g:2997:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDmx.g:2997:3: ()
            // InternalDmx.g:2998:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3004:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_RICH_TEXT_START)||(LA43_0>=RULE_NATURAL && LA43_0<=RULE_STRING)||LA43_0==22||LA43_0==27||(LA43_0>=41 && LA43_0<=42)||LA43_0==44||LA43_0==48||(LA43_0>=53 && LA43_0<=58)||(LA43_0>=61 && LA43_0<=62)||(LA43_0>=95 && LA43_0<=97)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDmx.g:3005:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDmx.g:3005:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDmx.g:3006:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDmx.g:3006:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDmx.g:3007:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:3024:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==21) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalDmx.g:3025:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:3029:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDmx.g:3030:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDmx.g:3030:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDmx.g:3031:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_34);
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
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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
    // InternalDmx.g:3054:1: entryRuleDmxEntity returns [EObject current=null] : iv_ruleDmxEntity= ruleDmxEntity EOF ;
    public final EObject entryRuleDmxEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEntity = null;


        try {
            // InternalDmx.g:3054:50: (iv_ruleDmxEntity= ruleDmxEntity EOF )
            // InternalDmx.g:3055:2: iv_ruleDmxEntity= ruleDmxEntity EOF
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
    // InternalDmx.g:3061:1: ruleDmxEntity returns [EObject current=null] : (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDmx.g:3067:2: ( (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDmx.g:3068:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDmx.g:3068:2: (otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDmx.g:3069:3: otherlv_0= 'entity' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
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
    // InternalDmx.g:3088:1: entryRuleDmxDetail returns [EObject current=null] : iv_ruleDmxDetail= ruleDmxDetail EOF ;
    public final EObject entryRuleDmxDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDetail = null;


        try {
            // InternalDmx.g:3088:50: (iv_ruleDmxDetail= ruleDmxDetail EOF )
            // InternalDmx.g:3089:2: iv_ruleDmxDetail= ruleDmxDetail EOF
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
    // InternalDmx.g:3095:1: ruleDmxDetail returns [EObject current=null] : (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) ;
    public final EObject ruleDmxDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DmxComplexObject_1 = null;



        	enterRule();

        try {
            // InternalDmx.g:3101:2: ( (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] ) )
            // InternalDmx.g:3102:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            {
            // InternalDmx.g:3102:2: (otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current] )
            // InternalDmx.g:3103:3: otherlv_0= 'detail' this_DmxComplexObject_1= ruleDmxComplexObject[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
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
    // InternalDmx.g:3123:1: ruleDmxComplexObject[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) ;
    public final EObject ruleDmxComplexObject(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:3129:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' ) )
            // InternalDmx.g:3130:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            {
            // InternalDmx.g:3130:2: ( ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}' )
            // InternalDmx.g:3131:3: ( (otherlv_0= RULE_ID ) ) ruleDomFieldListStartSymbol ( (lv_fields_2_0= ruleDmxField ) )* otherlv_3= '}'
            {
            // InternalDmx.g:3131:3: ( (otherlv_0= RULE_ID ) )
            // InternalDmx.g:3132:4: (otherlv_0= RULE_ID )
            {
            // InternalDmx.g:3132:4: (otherlv_0= RULE_ID )
            // InternalDmx.g:3133:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxComplexObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxComplexObjectAccess().getTypeDComplexTypeCrossReference_0_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getDomFieldListStartSymbolParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_50);
            ruleDomFieldListStartSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:3151:3: ( (lv_fields_2_0= ruleDmxField ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDmx.g:3152:4: (lv_fields_2_0= ruleDmxField )
            	    {
            	    // InternalDmx.g:3152:4: (lv_fields_2_0= ruleDmxField )
            	    // InternalDmx.g:3153:5: lv_fields_2_0= ruleDmxField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDmxComplexObjectAccess().getFieldsDmxFieldParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_50);
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
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3178:1: entryRuleDmxField returns [EObject current=null] : iv_ruleDmxField= ruleDmxField EOF ;
    public final EObject entryRuleDmxField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxField = null;


        try {
            // InternalDmx.g:3178:49: (iv_ruleDmxField= ruleDmxField EOF )
            // InternalDmx.g:3179:2: iv_ruleDmxField= ruleDmxField EOF
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
    // InternalDmx.g:3185:1: ruleDmxField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) ;
    public final EObject ruleDmxField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:3191:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) ) )
            // InternalDmx.g:3192:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            {
            // InternalDmx.g:3192:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) ) )
            // InternalDmx.g:3193:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDExpression ) )
            {
            // InternalDmx.g:3193:3: ( (otherlv_0= RULE_ID ) )
            // InternalDmx.g:3194:4: (otherlv_0= RULE_ID )
            {
            // InternalDmx.g:3194:4: (otherlv_0= RULE_ID )
            // InternalDmx.g:3195:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFieldRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDmxFieldAccess().getFeatureDFeatureCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalDmx.g:3210:3: ( (lv_value_2_0= ruleDExpression ) )
            // InternalDmx.g:3211:4: (lv_value_2_0= ruleDExpression )
            {
            // InternalDmx.g:3211:4: (lv_value_2_0= ruleDExpression )
            // InternalDmx.g:3212:5: lv_value_2_0= ruleDExpression
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
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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
    // InternalDmx.g:3233:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDmx.g:3233:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDmx.g:3234:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
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
    // InternalDmx.g:3240:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
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
            // InternalDmx.g:3246:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDmx.g:3247:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDmx.g:3247:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDmx.g:3248:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDmx.g:3248:3: ()
            // InternalDmx.g:3249:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDmx.g:3259:3: ( ( ruleDQualifiedName ) )
            // InternalDmx.g:3260:4: ( ruleDQualifiedName )
            {
            // InternalDmx.g:3260:4: ( ruleDQualifiedName )
            // InternalDmx.g:3261:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_52);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDmx.g:3275:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmx.g:3276:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDmx.g:3280:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDmx.g:3281:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDmx.g:3281:5: (otherlv_4= RULE_ID )
                    // InternalDmx.g:3282:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDmx.g:3294:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmx.g:3295:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDmx.g:3299:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==33) ) {
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
                            // InternalDmx.g:3300:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDmx.g:3300:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDmx.g:3301:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDmx.g:3301:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDmx.g:3302:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
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
                            // InternalDmx.g:3319:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDmx.g:3319:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDmx.g:3320:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDmx.g:3320:6: (lv_plural_7_0= '*' )
                            // InternalDmx.g:3321:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,33,FOLLOW_55); if (state.failed) return current;
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

            // InternalDmx.g:3335:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDmx.g:3336:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3346:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDmx.g:3346:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDmx.g:3347:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
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
    // InternalDmx.g:3353:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDmx.g:3359:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDmx.g:3360:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDmx.g:3360:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDmx.g:3361:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDmx.g:3361:3: ()
            // InternalDmx.g:3362:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3368:3: ( (otherlv_1= RULE_ID ) )
            // InternalDmx.g:3369:4: (otherlv_1= RULE_ID )
            {
            // InternalDmx.g:3369:4: (otherlv_1= RULE_ID )
            // InternalDmx.g:3370:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDmx.g:3381:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            else if ( (LA48_0==34) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==47) ) {
                    alt48=2;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalDmx.g:3382:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDmx.g:3382:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDmx.g:3383:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDmx.g:3383:5: (lv_before_2_0= '@before' )
                    // InternalDmx.g:3384:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDmx.g:3397:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDmx.g:3397:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDmx.g:3398:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDmx.g:3402:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDmx.g:3403:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDmx.g:3403:6: (lv_all_4_0= 'all' )
                    // InternalDmx.g:3404:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3422:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDmx.g:3422:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDmx.g:3423:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
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
    // InternalDmx.g:3429:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDmx.g:3435:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDmx.g:3436:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDmx.g:3436:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDmx.g:3437:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDmx.g:3437:3: ()
            // InternalDmx.g:3438:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDmx.g:3448:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDmx.g:3449:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDmx.g:3449:4: (lv_if_2_0= ruleDExpression )
            // InternalDmx.g:3450:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_58);
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
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDmx.g:3471:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDmx.g:3472:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDmx.g:3472:4: (lv_then_4_0= ruleDExpression )
            // InternalDmx.g:3473:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_59);
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
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDmx.g:3490:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) && (synpred14_InternalDmx())) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDmx.g:3491:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDmx.g:3491:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDmx.g:3492:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDmx.g:3498:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDmx.g:3499:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDmx.g:3499:5: (lv_else_6_0= ruleDExpression )
                    // InternalDmx.g:3500:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_60);
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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3526:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDmx.g:3526:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDmx.g:3527:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDmx.g:3533:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
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
            // InternalDmx.g:3539:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDmx.g:3540:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDmx.g:3540:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33||LA50_0==61||LA50_0==98) ) {
                alt50=1;
            }
            else if ( (LA50_0==27) ) {
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
                    // InternalDmx.g:3541:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDmx.g:3541:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDmx.g:3542:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDmx.g:3542:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDmx.g:3543:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
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
                    // InternalDmx.g:3561:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDmx.g:3561:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDmx.g:3562:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDmx.g:3566:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDmx.g:3567:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDmx.g:3567:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDmx.g:3568:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_62); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,52,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDmx.g:3588:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDmx.g:3589:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDmx.g:3589:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDmx.g:3590:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
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

                    otherlv_5=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3616:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDmx.g:3616:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDmx.g:3617:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDmx.g:3623:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:3629:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDmx.g:3630:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDmx.g:3630:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_NATURAL) ) {
                alt51=1;
            }
            else if ( (LA51_0==33) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmx.g:3631:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDmx.g:3639:3: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3648:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDmx.g:3648:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDmx.g:3649:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
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
    // InternalDmx.g:3655:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDmx.g:3661:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDmx.g:3662:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDmx.g:3662:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDmx.g:3663:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDmx.g:3663:3: ()
            // InternalDmx.g:3664:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3670:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt52=1;
                }
                break;
            case 54:
                {
                alt52=2;
                }
                break;
            case 55:
                {
                alt52=3;
                }
                break;
            case 56:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalDmx.g:3671:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDmx.g:3671:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDmx.g:3672:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDmx.g:3672:5: (lv_value_1_0= 'TRUE' )
                    // InternalDmx.g:3673:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDmx.g:3686:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDmx.g:3686:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDmx.g:3687:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDmx.g:3687:5: (lv_value_2_0= 'true' )
                    // InternalDmx.g:3688:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDmx.g:3701:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDmx.g:3706:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3715:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDmx.g:3715:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDmx.g:3716:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
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
    // InternalDmx.g:3722:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDmx.g:3728:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDmx.g:3729:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDmx.g:3729:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDmx.g:3730:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDmx.g:3730:3: ()
            // InternalDmx.g:3731:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3737:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDmx.g:3738:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDmx.g:3738:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDmx.g:3739:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDmx.g:3759:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDmx.g:3759:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDmx.g:3760:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
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
    // InternalDmx.g:3766:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:3772:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDmx.g:3773:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDmx.g:3773:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDmx.g:3774:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDmx.g:3774:3: ()
            // InternalDmx.g:3775:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3781:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDmx.g:3782:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDmx.g:3782:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDmx.g:3783:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDmx.g:3804:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDmx.g:3804:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDmx.g:3805:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
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
    // InternalDmx.g:3811:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDmx.g:3817:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDmx.g:3818:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDmx.g:3818:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDmx.g:3819:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDmx.g:3819:3: ()
            // InternalDmx.g:3820:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3826:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDmx.g:3827:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDmx.g:3827:4: (lv_value_1_0= RULE_STRING )
            // InternalDmx.g:3828:5: lv_value_1_0= RULE_STRING
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
    // InternalDmx.g:3848:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDmx.g:3848:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDmx.g:3849:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
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
    // InternalDmx.g:3855:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDmx.g:3861:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDmx.g:3862:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDmx.g:3862:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDmx.g:3863:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDmx.g:3863:3: ()
            // InternalDmx.g:3864:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:3870:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57) ) {
                alt53=1;
            }
            else if ( (LA53_0==58) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDmx.g:3871:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:3876:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3885:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDmx.g:3885:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDmx.g:3886:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDmx.g:3892:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDmx.g:3898:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDmx.g:3899:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDmx.g:3899:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDmx.g:3900:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,34,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDmx.g:3919:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=59 && LA56_0<=60)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDmx.g:3920:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDmx.g:3920:4: (kw= 'E' | kw= 'e' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==59) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==60) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalDmx.g:3921:5: kw= 'E'
                            {
                            kw=(Token)match(input,59,FOLLOW_66); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDmx.g:3927:5: kw= 'e'
                            {
                            kw=(Token)match(input,60,FOLLOW_66); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDmx.g:3933:4: (kw= '+' | kw= '-' )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==61) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==62) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalDmx.g:3934:5: kw= '+'
                            {
                            kw=(Token)match(input,61,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDmx.g:3940:5: kw= '-'
                            {
                            kw=(Token)match(input,62,FOLLOW_61); if (state.failed) return current;
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
    // InternalDmx.g:3958:1: entryRuleDomFieldListStartSymbol returns [String current=null] : iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF ;
    public final String entryRuleDomFieldListStartSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomFieldListStartSymbol = null;


        try {
            // InternalDmx.g:3958:63: (iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF )
            // InternalDmx.g:3959:2: iv_ruleDomFieldListStartSymbol= ruleDomFieldListStartSymbol EOF
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
    // InternalDmx.g:3965:1: ruleDomFieldListStartSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleDomFieldListStartSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:3971:2: (kw= '{' )
            // InternalDmx.g:3972:2: kw= '{'
            {
            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:3980:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDmx.g:3980:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDmx.g:3981:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDmx.g:3987:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:3993:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDmx.g:3994:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDmx.g:3994:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDmx.g:3995:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:4005:3: (kw= '.*' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDmx.g:4006:4: kw= '.*'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4016:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDmx.g:4016:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDmx.g:4017:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDmx.g:4023:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDmx.g:4029:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDmx.g:4030:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDmx.g:4030:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDmx.g:4031:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDmx.g:4038:3: (kw= '.' this_ID_2= RULE_ID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==34) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDmx.g:4039:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleDmxBaseType"
    // InternalDmx.g:4056:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
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
            // InternalDmx.g:4062:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDmx.g:4063:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDmx.g:4063:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt59=11;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt59=1;
                }
                break;
            case 65:
                {
                alt59=2;
                }
                break;
            case 66:
                {
                alt59=3;
                }
                break;
            case 67:
                {
                alt59=4;
                }
                break;
            case 68:
                {
                alt59=5;
                }
                break;
            case 69:
                {
                alt59=6;
                }
                break;
            case 70:
                {
                alt59=7;
                }
                break;
            case 71:
                {
                alt59=8;
                }
                break;
            case 72:
                {
                alt59=9;
                }
                break;
            case 73:
                {
                alt59=10;
                }
                break;
            case 74:
                {
                alt59=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalDmx.g:4064:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDmx.g:4064:3: (enumLiteral_0= 'VOID' )
                    // InternalDmx.g:4065:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4072:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDmx.g:4072:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDmx.g:4073:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4080:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDmx.g:4080:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDmx.g:4081:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4088:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDmx.g:4088:3: (enumLiteral_3= 'TEXT' )
                    // InternalDmx.g:4089:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:4096:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDmx.g:4096:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDmx.g:4097:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:4104:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDmx.g:4104:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDmx.g:4105:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDmx.g:4112:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDmx.g:4112:3: (enumLiteral_6= 'STATE' )
                    // InternalDmx.g:4113:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDmx.g:4120:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDmx.g:4120:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDmx.g:4121:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDmx.g:4128:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDmx.g:4128:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDmx.g:4129:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDmx.g:4136:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDmx.g:4136:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDmx.g:4137:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDmx.g:4144:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDmx.g:4144:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDmx.g:4145:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4155:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDmx.g:4161:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDmx.g:4162:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDmx.g:4162:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt60=1;
                }
                break;
            case 76:
                {
                alt60=2;
                }
                break;
            case 77:
                {
                alt60=3;
                }
                break;
            case 78:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalDmx.g:4163:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDmx.g:4163:3: (enumLiteral_0= 'OR' )
                    // InternalDmx.g:4164:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4171:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDmx.g:4171:3: (enumLiteral_1= 'or' )
                    // InternalDmx.g:4172:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4179:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDmx.g:4179:3: (enumLiteral_2= 'XOR' )
                    // InternalDmx.g:4180:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4187:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDmx.g:4187:3: (enumLiteral_3= 'xor' )
                    // InternalDmx.g:4188:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4198:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDmx.g:4204:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDmx.g:4205:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDmx.g:4205:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==79) ) {
                alt61=1;
            }
            else if ( (LA61_0==80) ) {
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
                    // InternalDmx.g:4206:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDmx.g:4206:3: (enumLiteral_0= 'AND' )
                    // InternalDmx.g:4207:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4214:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDmx.g:4214:3: (enumLiteral_1= 'and' )
                    // InternalDmx.g:4215:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4225:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDmx.g:4231:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDmx.g:4232:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDmx.g:4232:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt62=1;
                }
                break;
            case 81:
                {
                alt62=2;
                }
                break;
            case 82:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalDmx.g:4233:3: (enumLiteral_0= '=' )
                    {
                    // InternalDmx.g:4233:3: (enumLiteral_0= '=' )
                    // InternalDmx.g:4234:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4241:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDmx.g:4241:3: (enumLiteral_1= '!=' )
                    // InternalDmx.g:4242:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4249:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDmx.g:4249:3: (enumLiteral_2= '<>' )
                    // InternalDmx.g:4250:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4260:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDmx.g:4266:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDmx.g:4267:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDmx.g:4267:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt63=1;
                }
                break;
            case 84:
                {
                alt63=2;
                }
                break;
            case 85:
                {
                alt63=3;
                }
                break;
            case 86:
                {
                alt63=4;
                }
                break;
            case 87:
                {
                alt63=5;
                }
                break;
            case 88:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalDmx.g:4268:3: (enumLiteral_0= '<' )
                    {
                    // InternalDmx.g:4268:3: (enumLiteral_0= '<' )
                    // InternalDmx.g:4269:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4276:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDmx.g:4276:3: (enumLiteral_1= '<=' )
                    // InternalDmx.g:4277:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4284:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDmx.g:4284:3: (enumLiteral_2= '\\u2264' )
                    // InternalDmx.g:4285:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4292:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDmx.g:4292:3: (enumLiteral_3= '>=' )
                    // InternalDmx.g:4293:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:4300:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDmx.g:4300:3: (enumLiteral_4= '\\u2265' )
                    // InternalDmx.g:4301:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:4308:3: (enumLiteral_5= '>' )
                    {
                    // InternalDmx.g:4308:3: (enumLiteral_5= '>' )
                    // InternalDmx.g:4309:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4319:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDmx.g:4325:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDmx.g:4326:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDmx.g:4326:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt64=1;
                }
                break;
            case 26:
                {
                alt64=2;
                }
                break;
            case 52:
                {
                alt64=3;
                }
                break;
            case 90:
                {
                alt64=4;
                }
                break;
            case 91:
                {
                alt64=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalDmx.g:4327:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDmx.g:4327:3: (enumLiteral_0= 'IN' )
                    // InternalDmx.g:4328:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4335:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDmx.g:4335:3: (enumLiteral_1= 'in' )
                    // InternalDmx.g:4336:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4343:3: (enumLiteral_2= '..' )
                    {
                    // InternalDmx.g:4343:3: (enumLiteral_2= '..' )
                    // InternalDmx.g:4344:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4351:3: (enumLiteral_3= '->' )
                    {
                    // InternalDmx.g:4351:3: (enumLiteral_3= '->' )
                    // InternalDmx.g:4352:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:4359:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDmx.g:4359:3: (enumLiteral_4= '=>' )
                    // InternalDmx.g:4360:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4370:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDmx.g:4376:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDmx.g:4377:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDmx.g:4377:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==61) ) {
                alt65=1;
            }
            else if ( (LA65_0==62) ) {
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
                    // InternalDmx.g:4378:3: (enumLiteral_0= '+' )
                    {
                    // InternalDmx.g:4378:3: (enumLiteral_0= '+' )
                    // InternalDmx.g:4379:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4386:3: (enumLiteral_1= '-' )
                    {
                    // InternalDmx.g:4386:3: (enumLiteral_1= '-' )
                    // InternalDmx.g:4387:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4397:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDmx.g:4403:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDmx.g:4404:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDmx.g:4404:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt66=1;
                }
                break;
            case 92:
                {
                alt66=2;
                }
                break;
            case 93:
                {
                alt66=3;
                }
                break;
            case 94:
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
                    // InternalDmx.g:4405:3: (enumLiteral_0= '*' )
                    {
                    // InternalDmx.g:4405:3: (enumLiteral_0= '*' )
                    // InternalDmx.g:4406:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4413:3: (enumLiteral_1= '/' )
                    {
                    // InternalDmx.g:4413:3: (enumLiteral_1= '/' )
                    // InternalDmx.g:4414:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4421:3: (enumLiteral_2= '**' )
                    {
                    // InternalDmx.g:4421:3: (enumLiteral_2= '**' )
                    // InternalDmx.g:4422:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4429:3: (enumLiteral_3= '%' )
                    {
                    // InternalDmx.g:4429:3: (enumLiteral_3= '%' )
                    // InternalDmx.g:4430:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4440:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDmx.g:4446:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDmx.g:4447:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDmx.g:4447:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt67=1;
                }
                break;
            case 62:
                {
                alt67=2;
                }
                break;
            case 95:
                {
                alt67=3;
                }
                break;
            case 96:
                {
                alt67=4;
                }
                break;
            case 97:
                {
                alt67=5;
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
                    // InternalDmx.g:4448:3: (enumLiteral_0= '+' )
                    {
                    // InternalDmx.g:4448:3: (enumLiteral_0= '+' )
                    // InternalDmx.g:4449:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4456:3: (enumLiteral_1= '-' )
                    {
                    // InternalDmx.g:4456:3: (enumLiteral_1= '-' )
                    // InternalDmx.g:4457:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4464:3: (enumLiteral_2= '!' )
                    {
                    // InternalDmx.g:4464:3: (enumLiteral_2= '!' )
                    // InternalDmx.g:4465:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:4472:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDmx.g:4472:3: (enumLiteral_3= 'NOT' )
                    // InternalDmx.g:4473:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:4480:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDmx.g:4480:3: (enumLiteral_4= 'not' )
                    // InternalDmx.g:4481:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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
    // InternalDmx.g:4491:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDmx.g:4497:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDmx.g:4498:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDmx.g:4498:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt68=1;
                }
                break;
            case 61:
                {
                alt68=2;
                }
                break;
            case 33:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalDmx.g:4499:3: (enumLiteral_0= '?' )
                    {
                    // InternalDmx.g:4499:3: (enumLiteral_0= '?' )
                    // InternalDmx.g:4500:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:4507:3: (enumLiteral_1= '+' )
                    {
                    // InternalDmx.g:4507:3: (enumLiteral_1= '+' )
                    // InternalDmx.g:4508:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:4515:3: (enumLiteral_2= '*' )
                    {
                    // InternalDmx.g:4515:3: (enumLiteral_2= '*' )
                    // InternalDmx.g:4516:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDmx
    public final void synpred1_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1259:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDmx.g:1259:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDmx.g:1259:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDmx.g:1260:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDmx.g:1260:7: ()
        // InternalDmx.g:1261:7: 
        {
        }

        match(input,34,FOLLOW_4); if (state.failed) return ;
        // InternalDmx.g:1263:7: ( ( RULE_ID ) )
        // InternalDmx.g:1264:8: ( RULE_ID )
        {
        // InternalDmx.g:1264:8: ( RULE_ID )
        // InternalDmx.g:1265:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_29); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleDmxOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalDmx

    // $ANTLR start synpred2_InternalDmx
    public final void synpred2_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1328:6: ( ( () '.' ) )
        // InternalDmx.g:1328:7: ( () '.' )
        {
        // InternalDmx.g:1328:7: ( () '.' )
        // InternalDmx.g:1329:7: () '.'
        {
        // InternalDmx.g:1329:7: ()
        // InternalDmx.g:1330:7: 
        {
        }

        match(input,34,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDmx

    // $ANTLR start synpred3_InternalDmx
    public final void synpred3_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1364:8: ( ( '(' ) )
        // InternalDmx.g:1364:9: ( '(' )
        {
        // InternalDmx.g:1364:9: ( '(' )
        // InternalDmx.g:1365:9: '('
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDmx

    // $ANTLR start synpred4_InternalDmx
    public final void synpred4_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1725:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDmx.g:1725:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDmx.g:1725:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDmx.g:1726:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDmx.g:1726:6: ()
        // InternalDmx.g:1727:6: 
        {
        }

        // InternalDmx.g:1728:6: ( ( ruleDmxOpOr ) )
        // InternalDmx.g:1729:7: ( ruleDmxOpOr )
        {
        // InternalDmx.g:1729:7: ( ruleDmxOpOr )
        // InternalDmx.g:1730:8: ruleDmxOpOr
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
    // $ANTLR end synpred4_InternalDmx

    // $ANTLR start synpred5_InternalDmx
    public final void synpred5_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1813:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDmx.g:1813:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDmx.g:1813:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDmx.g:1814:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDmx.g:1814:6: ()
        // InternalDmx.g:1815:6: 
        {
        }

        // InternalDmx.g:1816:6: ( ( ruleDmxOpAnd ) )
        // InternalDmx.g:1817:7: ( ruleDmxOpAnd )
        {
        // InternalDmx.g:1817:7: ( ruleDmxOpAnd )
        // InternalDmx.g:1818:8: ruleDmxOpAnd
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
    // $ANTLR end synpred5_InternalDmx

    // $ANTLR start synpred6_InternalDmx
    public final void synpred6_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1901:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDmx.g:1901:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDmx.g:1901:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDmx.g:1902:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDmx.g:1902:6: ()
        // InternalDmx.g:1903:6: 
        {
        }

        // InternalDmx.g:1904:6: ( ( ruleDmxOpEquality ) )
        // InternalDmx.g:1905:7: ( ruleDmxOpEquality )
        {
        // InternalDmx.g:1905:7: ( ruleDmxOpEquality )
        // InternalDmx.g:1906:8: ruleDmxOpEquality
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
    // $ANTLR end synpred6_InternalDmx

    // $ANTLR start synpred7_InternalDmx
    public final void synpred7_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1990:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDmx.g:1990:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDmx.g:1990:7: ( () ruleDmxOpInstanceOf )
        // InternalDmx.g:1991:7: () ruleDmxOpInstanceOf
        {
        // InternalDmx.g:1991:7: ()
        // InternalDmx.g:1992:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalDmx

    // $ANTLR start synpred8_InternalDmx
    public final void synpred8_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2030:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDmx.g:2030:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDmx.g:2030:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDmx.g:2031:7: () ( ( ruleOpCompare ) )
        {
        // InternalDmx.g:2031:7: ()
        // InternalDmx.g:2032:7: 
        {
        }

        // InternalDmx.g:2033:7: ( ( ruleOpCompare ) )
        // InternalDmx.g:2034:8: ( ruleOpCompare )
        {
        // InternalDmx.g:2034:8: ( ruleOpCompare )
        // InternalDmx.g:2035:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalDmx

    // $ANTLR start synpred9_InternalDmx
    public final void synpred9_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2149:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDmx.g:2149:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDmx.g:2149:6: ( () ( ( ruleOpOther ) ) )
        // InternalDmx.g:2150:6: () ( ( ruleOpOther ) )
        {
        // InternalDmx.g:2150:6: ()
        // InternalDmx.g:2151:6: 
        {
        }

        // InternalDmx.g:2152:6: ( ( ruleOpOther ) )
        // InternalDmx.g:2153:7: ( ruleOpOther )
        {
        // InternalDmx.g:2153:7: ( ruleOpOther )
        // InternalDmx.g:2154:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalDmx

    // $ANTLR start synpred10_InternalDmx
    public final void synpred10_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2237:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDmx.g:2237:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDmx.g:2237:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDmx.g:2238:6: () ( ( ruleOpAdd ) )
        {
        // InternalDmx.g:2238:6: ()
        // InternalDmx.g:2239:6: 
        {
        }

        // InternalDmx.g:2240:6: ( ( ruleOpAdd ) )
        // InternalDmx.g:2241:7: ( ruleOpAdd )
        {
        // InternalDmx.g:2241:7: ( ruleOpAdd )
        // InternalDmx.g:2242:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalDmx

    // $ANTLR start synpred11_InternalDmx
    public final void synpred11_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2325:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDmx.g:2325:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDmx.g:2325:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDmx.g:2326:6: () ( ( ruleOpMulti ) )
        {
        // InternalDmx.g:2326:6: ()
        // InternalDmx.g:2327:6: 
        {
        }

        // InternalDmx.g:2328:6: ( ( ruleOpMulti ) )
        // InternalDmx.g:2329:7: ( ruleOpMulti )
        {
        // InternalDmx.g:2329:7: ( ruleOpMulti )
        // InternalDmx.g:2330:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalDmx

    // $ANTLR start synpred12_InternalDmx
    public final void synpred12_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2488:5: ( ( () ruleDmxOpCast ) )
        // InternalDmx.g:2488:6: ( () ruleDmxOpCast )
        {
        // InternalDmx.g:2488:6: ( () ruleDmxOpCast )
        // InternalDmx.g:2489:6: () ruleDmxOpCast
        {
        // InternalDmx.g:2489:6: ()
        // InternalDmx.g:2490:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDmx

    // $ANTLR start synpred13_InternalDmx
    public final void synpred13_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3336:4: ( ']' )
        // InternalDmx.g:3336:5: ']'
        {
        match(input,46,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalDmx

    // $ANTLR start synpred14_InternalDmx
    public final void synpred14_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3492:5: ( 'else' )
        // InternalDmx.g:3492:6: 'else'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalDmx

    // Delegated rules

    public final boolean synpred9_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\136\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\0\1\1\1\3\1\5\1\7\1\2\1\4\1\6\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\2\1\14\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\2\1\2\uffff\1\2\1\3\2\1\2\uffff\1\1\5\uffff\4\1\10\uffff\2\1\14\uffff\10\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1987:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_9 = input.LA(1);

                         
                        int index28_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\1\10\6\uffff";
    static final String dfa_10s = "\1\11\2\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String dfa_11s = "\1\72\2\uffff\1\136\3\uffff\1\11\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\2\36\uffff\1\5\1\6\12\uffff\4\1\2\4",
            "",
            "",
            "\1\10\2\uffff\2\10\14\uffff\3\10\2\uffff\1\10\1\uffff\1\10\4\uffff\1\10\1\7\2\uffff\4\10\2\uffff\1\10\5\uffff\4\10\10\uffff\2\10\14\uffff\24\10",
            "",
            "",
            "",
            "\1\10\4\uffff\1\11",
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2654:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral | this_DmxEntity_5= ruleDmxEntity | this_DmxDetail_6= ruleDmxDetail )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A0080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x67E1160008400670L,0x0000000380000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x200000020A000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x07E0060000400600L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x67E1160008400672L,0x0000000380000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x67E1160008400610L,0x0000000380000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C08000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x67E1160018400610L,0x0000000380000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000006000000002L,0x0000000001F80000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000004000002L,0x000000000E000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x67E1160008C00670L,0x0000000380000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x07E0060000800600L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x07E0060000000600L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x67E1160018400670L,0x0000000380000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000601000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x6000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000000002L});

}