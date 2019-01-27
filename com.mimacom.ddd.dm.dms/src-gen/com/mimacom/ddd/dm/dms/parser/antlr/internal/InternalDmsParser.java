package com.mimacom.ddd.dm.dms.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dms.services.DmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'import'", "'function'", "'('", "')'", "':'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'redefines'", "'enumeration'", "','", "'abstract'", "'root'", "'relationship'", "'detail'", "'extends'", "'derived'", "'composite'", "'key'", "'returns'", "'application'", "'service'", "'raises'", "'precondition'", "'postcondition'", "'exception'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'.'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'..'", "'*'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'NIL'", "'nil'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'reference'", "'inverse'", "'synchronous'", "'async'", "'in'", "'out'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
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
    public static final int RULE_PLAIN_TEXT_END=8;
    public static final int RULE_ID=4;
    public static final int RULE_PLAIN_TEXT_START=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
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
    public static final int RULE_PLAIN_TEXT_MIDDLE=7;
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
    public static final int T__16=16;
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
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_PLAIN_TEXT=11;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
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


        public InternalDmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDms.g"; }



     	private DmsGrammarAccess grammarAccess;

        public InternalDmsParser(TokenStream input, DmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DDomain";
       	}

       	@Override
       	protected DmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDDomain"
    // InternalDms.g:65:1: entryRuleDDomain returns [EObject current=null] : iv_ruleDDomain= ruleDDomain EOF ;
    public final EObject entryRuleDDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomain = null;


        try {
            // InternalDms.g:65:48: (iv_ruleDDomain= ruleDDomain EOF )
            // InternalDms.g:66:2: iv_ruleDDomain= ruleDDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDomain=ruleDDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDomain; 
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
    // $ANTLR end "entryRuleDDomain"


    // $ANTLR start "ruleDDomain"
    // InternalDms.g:72:1: ruleDDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_description_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_types_4_0 = null;

        EObject lv_functions_5_0 = null;

        EObject lv_aggregates_6_0 = null;

        EObject lv_applications_7_0 = null;

        EObject lv_actors_8_0 = null;



        	enterRule();

        try {
            // InternalDms.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )* ) )
            // InternalDms.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )* )
            {
            // InternalDms.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )* )
            // InternalDms.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainAccess().getDomainKeyword_0());
              		
            }
            // InternalDms.g:84:3: ( (lv_name_1_0= ruleDQualifiedName ) )
            // InternalDms.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            {
            // InternalDms.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            // InternalDms.g:86:5: lv_name_1_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDomainAccess().getNameDQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDomainRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:103:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_PLAIN_TEXT_ONLY && LA1_0<=RULE_PLAIN_TEXT_START)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDms.g:104:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:104:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:105:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:122:3: ( (lv_imports_3_0= ruleDImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDms.g:123:4: (lv_imports_3_0= ruleDImport )
            	    {
            	    // InternalDms.g:123:4: (lv_imports_3_0= ruleDImport )
            	    // InternalDms.g:124:5: lv_imports_3_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainAccess().getImportsDImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDms.g:141:3: ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_functions_5_0= ruleDFunction ) ) | ( (lv_aggregates_6_0= ruleDAggregate ) ) | ( (lv_applications_7_0= ruleDExistingApplication ) ) | ( (lv_actors_8_0= ruleDService ) ) )*
            loop3:
            do {
                int alt3=6;
                switch ( input.LA(1) ) {
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;
                case 39:
                    {
                    alt3=4;
                    }
                    break;
                case 40:
                case 81:
                case 82:
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDms.g:142:4: ( (lv_types_4_0= ruleDType ) )
            	    {
            	    // InternalDms.g:142:4: ( (lv_types_4_0= ruleDType ) )
            	    // InternalDms.g:143:5: (lv_types_4_0= ruleDType )
            	    {
            	    // InternalDms.g:143:5: (lv_types_4_0= ruleDType )
            	    // InternalDms.g:144:6: lv_types_4_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getTypesDTypeParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_types_4_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_4_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:162:4: ( (lv_functions_5_0= ruleDFunction ) )
            	    {
            	    // InternalDms.g:162:4: ( (lv_functions_5_0= ruleDFunction ) )
            	    // InternalDms.g:163:5: (lv_functions_5_0= ruleDFunction )
            	    {
            	    // InternalDms.g:163:5: (lv_functions_5_0= ruleDFunction )
            	    // InternalDms.g:164:6: lv_functions_5_0= ruleDFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getFunctionsDFunctionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_functions_5_0=ruleDFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"functions",
            	      							lv_functions_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DFunction");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDms.g:182:4: ( (lv_aggregates_6_0= ruleDAggregate ) )
            	    {
            	    // InternalDms.g:182:4: ( (lv_aggregates_6_0= ruleDAggregate ) )
            	    // InternalDms.g:183:5: (lv_aggregates_6_0= ruleDAggregate )
            	    {
            	    // InternalDms.g:183:5: (lv_aggregates_6_0= ruleDAggregate )
            	    // InternalDms.g:184:6: lv_aggregates_6_0= ruleDAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getAggregatesDAggregateParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_aggregates_6_0=ruleDAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_6_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DAggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDms.g:202:4: ( (lv_applications_7_0= ruleDExistingApplication ) )
            	    {
            	    // InternalDms.g:202:4: ( (lv_applications_7_0= ruleDExistingApplication ) )
            	    // InternalDms.g:203:5: (lv_applications_7_0= ruleDExistingApplication )
            	    {
            	    // InternalDms.g:203:5: (lv_applications_7_0= ruleDExistingApplication )
            	    // InternalDms.g:204:6: lv_applications_7_0= ruleDExistingApplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getApplicationsDExistingApplicationParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_applications_7_0=ruleDExistingApplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"applications",
            	      							lv_applications_7_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DExistingApplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDms.g:222:4: ( (lv_actors_8_0= ruleDService ) )
            	    {
            	    // InternalDms.g:222:4: ( (lv_actors_8_0= ruleDService ) )
            	    // InternalDms.g:223:5: (lv_actors_8_0= ruleDService )
            	    {
            	    // InternalDms.g:223:5: (lv_actors_8_0= ruleDService )
            	    // InternalDms.g:224:6: lv_actors_8_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getActorsDServiceParserRuleCall_4_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_actors_8_0=ruleDService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actors",
            	      							lv_actors_8_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // $ANTLR end "ruleDDomain"


    // $ANTLR start "entryRuleDImport"
    // InternalDms.g:246:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDms.g:246:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDms.g:247:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDms.g:253:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:259:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDms.g:260:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDms.g:260:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDms.g:261:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDms.g:265:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDms.g:266:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDms.g:266:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDms.g:267:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleDFunction"
    // InternalDms.g:288:1: entryRuleDFunction returns [EObject current=null] : iv_ruleDFunction= ruleDFunction EOF ;
    public final EObject entryRuleDFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunction = null;


        try {
            // InternalDms.g:288:50: (iv_ruleDFunction= ruleDFunction EOF )
            // InternalDms.g:289:2: iv_ruleDFunction= ruleDFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFunction=ruleDFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFunction; 
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
    // $ANTLR end "entryRuleDFunction"


    // $ANTLR start "ruleDFunction"
    // InternalDms.g:295:1: ruleDFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_multiplicity_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:301:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) )
            // InternalDms.g:302:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            {
            // InternalDms.g:302:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            // InternalDms.g:303:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalDms.g:307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:308:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:309:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDFunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDFunctionAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDFunctionAccess().getColonKeyword_4());
              		
            }
            // InternalDms.g:337:3: ( (otherlv_5= RULE_ID ) )
            // InternalDms.g:338:4: (otherlv_5= RULE_ID )
            {
            // InternalDms.g:338:4: (otherlv_5= RULE_ID )
            // InternalDms.g:339:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDFunctionAccess().getTypeDTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDms.g:350:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDms.g:351:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:351:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalDms.g:352:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDFunctionAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_6_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDFunctionRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_6_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
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
    // $ANTLR end "ruleDFunction"


    // $ANTLR start "entryRuleDAggregate"
    // InternalDms.g:373:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalDms.g:373:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalDms.g:374:2: iv_ruleDAggregate= ruleDAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAggregate=ruleDAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAggregate; 
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
    // $ANTLR end "entryRuleDAggregate"


    // $ANTLR start "ruleDAggregate"
    // InternalDms.g:380:1: ruleDAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:386:2: ( ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) )
            // InternalDms.g:387:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            {
            // InternalDms.g:387:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            // InternalDms.g:388:3: () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}'
            {
            // InternalDms.g:388:3: ()
            // InternalDms.g:389:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDAggregateAccess().getAggregateKeyword_1());
              		
            }
            // InternalDms.g:399:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_PLAIN_TEXT_ONLY && LA5_0<=RULE_PLAIN_TEXT_START)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDms.g:400:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:400:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:401:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAggregateAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:422:3: ( (lv_types_4_0= ruleDType ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26||LA6_0==28||(LA6_0>=30 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDms.g:423:4: (lv_types_4_0= ruleDType )
            	    {
            	    // InternalDms.g:423:4: (lv_types_4_0= ruleDType )
            	    // InternalDms.g:424:5: lv_types_4_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDAggregateAccess().getTypesDTypeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_types_4_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_4_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDAggregateAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDAggregate"


    // $ANTLR start "entryRuleDType"
    // InternalDms.g:449:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalDms.g:449:46: (iv_ruleDType= ruleDType EOF )
            // InternalDms.g:450:2: iv_ruleDType= ruleDType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDType=ruleDType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDType; 
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
    // $ANTLR end "entryRuleDType"


    // $ANTLR start "ruleDType"
    // InternalDms.g:456:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DEnumeration_1 = null;

        EObject this_DRootType_2 = null;

        EObject this_DRelationship_3 = null;

        EObject this_DDetailType_4 = null;



        	enterRule();

        try {
            // InternalDms.g:462:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType ) )
            // InternalDms.g:463:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType )
            {
            // InternalDms.g:463:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt7=5;
                    }
                    break;
                case 31:
                    {
                    alt7=3;
                    }
                    break;
                case 32:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
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
                    // InternalDms.g:464:3: this_DPrimitive_0= ruleDPrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitive_0=ruleDPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:473:3: this_DEnumeration_1= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_1=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:482:3: this_DRootType_2= ruleDRootType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRootTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRootType_2=ruleDRootType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRootType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:491:3: this_DRelationship_3= ruleDRelationship
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRelationshipParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRelationship_3=ruleDRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRelationship_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDms.g:500:3: this_DDetailType_4= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDDetailTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_4=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_4;
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
    // $ANTLR end "ruleDType"


    // $ANTLR start "entryRuleDConstraint"
    // InternalDms.g:512:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDms.g:512:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDms.g:513:2: iv_ruleDConstraint= ruleDConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDConstraint=ruleDConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDConstraint; 
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
    // $ANTLR end "entryRuleDConstraint"


    // $ANTLR start "ruleDConstraint"
    // InternalDms.g:519:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:525:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDms.g:526:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDms.g:526:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDms.g:527:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDms.g:531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:532:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDConstraintAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstraintRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:553:3: ( (lv_condition_3_0= ruleDExpression ) )
            // InternalDms.g:554:4: (lv_condition_3_0= ruleDExpression )
            {
            // InternalDms.g:554:4: (lv_condition_3_0= ruleDExpression )
            // InternalDms.g:555:5: lv_condition_3_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getConditionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_condition_3_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConstraintRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:572:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_PLAIN_TEXT_ONLY && LA8_0<=RULE_PLAIN_TEXT_START)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDms.g:573:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDms.g:573:4: (lv_description_4_0= ruleDRichText )
                    // InternalDms.g:574:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConstraintAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConstraintRule());
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
    // $ANTLR end "ruleDConstraint"


    // $ANTLR start "entryRuleDPrimitive"
    // InternalDms.g:595:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalDms.g:595:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalDms.g:596:2: iv_ruleDPrimitive= ruleDPrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimitive=ruleDPrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimitive; 
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
    // $ANTLR end "entryRuleDPrimitive"


    // $ANTLR start "ruleDPrimitive"
    // InternalDms.g:602:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_2_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:608:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) )
            // InternalDms.g:609:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            {
            // InternalDms.g:609:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            // InternalDms.g:610:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalDms.g:614:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:615:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:615:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:616:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDPrimitiveAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:632:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_PLAIN_TEXT_ONLY && LA9_0<=RULE_PLAIN_TEXT_START)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDms.g:633:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:633:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:634:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:655:3: (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDms.g:656:4: otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_4_0());
                      			
                    }
                    // InternalDms.g:660:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDms.g:661:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDms.g:661:5: (otherlv_5= RULE_ID )
                    // InternalDms.g:662:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDPrimitiveRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDPrimitiveCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:674:3: ( (lv_constraints_6_0= ruleDConstraint ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDms.g:675:4: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:675:4: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDms.g:676:5: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDPrimitive"


    // $ANTLR start "entryRuleDEnumeration"
    // InternalDms.g:701:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalDms.g:701:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalDms.g:702:2: iv_ruleDEnumeration= ruleDEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEnumeration=ruleDEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEnumeration; 
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
    // $ANTLR end "entryRuleDEnumeration"


    // $ANTLR start "ruleDEnumeration"
    // InternalDms.g:708:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' ) ;
    public final EObject ruleDEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_description_2_0 = null;

        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_constraints_7_0 = null;



        	enterRule();

        try {
            // InternalDms.g:714:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' ) )
            // InternalDms.g:715:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' )
            {
            // InternalDms.g:715:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' )
            // InternalDms.g:716:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalDms.g:720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:721:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDEnumerationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:738:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_PLAIN_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDms.g:739:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:739:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:740:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:761:3: ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDms.g:762:4: ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )*
                    {
                    // InternalDms.g:762:4: ( (lv_literals_4_0= ruleDLiteral ) )
                    // InternalDms.g:763:5: (lv_literals_4_0= ruleDLiteral )
                    {
                    // InternalDms.g:763:5: (lv_literals_4_0= ruleDLiteral )
                    // InternalDms.g:764:6: lv_literals_4_0= ruleDLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_literals_4_0=ruleDLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                      						}
                      						add(
                      							current,
                      							"literals",
                      							lv_literals_4_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:781:4: (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==29) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDms.g:782:5: otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:786:5: ( (lv_literals_6_0= ruleDLiteral ) )
                    	    // InternalDms.g:787:6: (lv_literals_6_0= ruleDLiteral )
                    	    {
                    	    // InternalDms.g:787:6: (lv_literals_6_0= ruleDLiteral )
                    	    // InternalDms.g:788:7: lv_literals_6_0= ruleDLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_literals_6_0=ruleDLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_6_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DLiteral");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDms.g:807:3: ( (lv_constraints_7_0= ruleDConstraint ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDms.g:808:4: (lv_constraints_7_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:808:4: (lv_constraints_7_0= ruleDConstraint )
            	    // InternalDms.g:809:5: lv_constraints_7_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_constraints_7_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_7_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDEnumerationAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDEnumeration"


    // $ANTLR start "entryRuleDLiteral"
    // InternalDms.g:834:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalDms.g:834:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalDms.g:835:2: iv_ruleDLiteral= ruleDLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDLiteral=ruleDLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDLiteral; 
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
    // $ANTLR end "entryRuleDLiteral"


    // $ANTLR start "ruleDLiteral"
    // InternalDms.g:841:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:847:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? ) )
            // InternalDms.g:848:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? )
            {
            // InternalDms.g:848:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? )
            // InternalDms.g:849:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )?
            {
            // InternalDms.g:849:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:850:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:850:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:851:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDLiteralAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:867:3: ( (lv_description_1_0= ruleDRichText ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_PLAIN_TEXT_ONLY && LA16_0<=RULE_PLAIN_TEXT_START)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDms.g:868:4: (lv_description_1_0= ruleDRichText )
                    {
                    // InternalDms.g:868:4: (lv_description_1_0= ruleDRichText )
                    // InternalDms.g:869:5: lv_description_1_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDLiteralAccess().getDescriptionDRichTextParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_1_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDLiteralRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_1_0,
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
    // $ANTLR end "ruleDLiteral"


    // $ANTLR start "entryRuleDRootType"
    // InternalDms.g:890:1: entryRuleDRootType returns [EObject current=null] : iv_ruleDRootType= ruleDRootType EOF ;
    public final EObject entryRuleDRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRootType = null;


        try {
            // InternalDms.g:890:50: (iv_ruleDRootType= ruleDRootType EOF )
            // InternalDms.g:891:2: iv_ruleDRootType= ruleDRootType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRootTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRootType=ruleDRootType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRootType; 
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
    // $ANTLR end "entryRuleDRootType"


    // $ANTLR start "ruleDRootType"
    // InternalDms.g:897:1: ruleDRootType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRootType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:903:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:904:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:904:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:905:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:905:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDms.g:906:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:906:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:907:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDRootTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRootTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDRootTypeAccess().getRootKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRootTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDRootTypeAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
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
    // $ANTLR end "ruleDRootType"


    // $ANTLR start "entryRuleDRelationship"
    // InternalDms.g:938:1: entryRuleDRelationship returns [EObject current=null] : iv_ruleDRelationship= ruleDRelationship EOF ;
    public final EObject entryRuleDRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationship = null;


        try {
            // InternalDms.g:938:54: (iv_ruleDRelationship= ruleDRelationship EOF )
            // InternalDms.g:939:2: iv_ruleDRelationship= ruleDRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRelationship=ruleDRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRelationship; 
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
    // $ANTLR end "entryRuleDRelationship"


    // $ANTLR start "ruleDRelationship"
    // InternalDms.g:945:1: ruleDRelationship returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:951:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:952:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:952:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:953:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:953:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDms.g:954:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:954:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:955:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDRelationshipAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDRelationshipAccess().getRelationshipKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRelationshipRule());
              			}
              			newCompositeNode(grammarAccess.getDRelationshipAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
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
    // $ANTLR end "ruleDRelationship"


    // $ANTLR start "entryRuleDDetailType"
    // InternalDms.g:986:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalDms.g:986:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalDms.g:987:2: iv_ruleDDetailType= ruleDDetailType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDetailTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDetailType=ruleDDetailType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDetailType; 
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
    // $ANTLR end "entryRuleDDetailType"


    // $ANTLR start "ruleDDetailType"
    // InternalDms.g:993:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:999:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:1000:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:1000:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:1001:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:1001:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDms.g:1002:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:1002:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:1003:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDDetailTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDDetailTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDDetailTypeAccess().getDetailKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDDetailTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDDetailTypeAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
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
    // $ANTLR end "ruleDDetailType"


    // $ANTLR start "ruleDComplexType"
    // InternalDms.g:1035:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_description_3_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1041:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDms.g:1042:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDms.g:1042:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDms.g:1043:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDms.g:1043:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1044:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1044:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1045:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDComplexTypeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDComplexTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1061:3: (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDms.g:1062:4: otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalDms.g:1066:4: ( (otherlv_2= RULE_ID ) )
                    // InternalDms.g:1067:5: (otherlv_2= RULE_ID )
                    {
                    // InternalDms.g:1067:5: (otherlv_2= RULE_ID )
                    // InternalDms.g:1068:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:1080:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_PLAIN_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDms.g:1081:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDms.g:1081:4: (lv_description_3_0= ruleDRichText )
                    // InternalDms.g:1082:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:1103:3: ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==33||(LA22_0>=35 && LA22_0<=36)||(LA22_0>=79 && LA22_0<=80)) ) {
                    alt22=1;
                }
                else if ( (LA22_0==25) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDms.g:1104:4: ( (lv_features_5_0= ruleDFeature ) )
            	    {
            	    // InternalDms.g:1104:4: ( (lv_features_5_0= ruleDFeature ) )
            	    // InternalDms.g:1105:5: (lv_features_5_0= ruleDFeature )
            	    {
            	    // InternalDms.g:1105:5: (lv_features_5_0= ruleDFeature )
            	    // InternalDms.g:1106:6: lv_features_5_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesDFeatureParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_features_5_0=ruleDFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:1124:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDms.g:1124:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDms.g:1125:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:1125:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDms.g:1126:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_6_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DConstraint");
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDComplexTypeAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDComplexType"


    // $ANTLR start "entryRuleDFeature"
    // InternalDms.g:1152:1: entryRuleDFeature returns [EObject current=null] : iv_ruleDFeature= ruleDFeature EOF ;
    public final EObject entryRuleDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFeature = null;


        try {
            // InternalDms.g:1152:49: (iv_ruleDFeature= ruleDFeature EOF )
            // InternalDms.g:1153:2: iv_ruleDFeature= ruleDFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFeature=ruleDFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFeature; 
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
    // $ANTLR end "entryRuleDFeature"


    // $ANTLR start "ruleDFeature"
    // InternalDms.g:1159:1: ruleDFeature returns [EObject current=null] : (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) ;
    public final EObject ruleDFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DAssociation_0 = null;

        EObject this_DAttribute_1 = null;

        EObject this_DQuery_2 = null;



        	enterRule();

        try {
            // InternalDms.g:1165:2: ( (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) )
            // InternalDms.g:1166:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            {
            // InternalDms.g:1166:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 79:
            case 80:
                {
                alt23=1;
                }
                break;
            case 33:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==19) ) {
                    alt23=3;
                }
                else if ( (LA23_3==21) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDms.g:1167:3: this_DAssociation_0= ruleDAssociation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDAssociationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAssociation_0=ruleDAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAssociation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:1176:3: this_DAttribute_1= ruleDAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDAttributeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAttribute_1=ruleDAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAttribute_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:1185:3: this_DQuery_2= ruleDQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DQuery_2=ruleDQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DQuery_2;
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
    // $ANTLR end "ruleDFeature"


    // $ANTLR start "entryRuleDAssociation"
    // InternalDms.g:1197:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalDms.g:1197:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalDms.g:1198:2: iv_ruleDAssociation= ruleDAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAssociation=ruleDAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAssociation; 
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
    // $ANTLR end "entryRuleDAssociation"


    // $ANTLR start "ruleDAssociation"
    // InternalDms.g:1204:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_multiplicity_7_0 = null;

        EObject lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1210:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDms.g:1211:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1211:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDms.g:1212:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalDms.g:1212:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDms.g:1213:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalDms.g:1213:4: (lv_derived_0_0= 'derived' )
                    // InternalDms.g:1214:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_derived_0_0, grammarAccess.getDAssociationAccess().getDerivedDerivedKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAssociationRule());
                      					}
                      					setWithLastConsumed(current, "derived", true, "derived");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1226:3: ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36||LA25_0==79) ) {
                alt25=1;
            }
            else if ( (LA25_0==80) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDms.g:1227:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    {
                    // InternalDms.g:1227:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    // InternalDms.g:1228:5: (lv_kind_1_0= ruleDAssociationKind )
                    {
                    // InternalDms.g:1228:5: (lv_kind_1_0= ruleDAssociationKind )
                    // InternalDms.g:1229:6: lv_kind_1_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_kind_1_0=ruleDAssociationKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      						}
                      						set(
                      							current,
                      							"kind",
                      							lv_kind_1_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:1247:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalDms.g:1247:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalDms.g:1248:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalDms.g:1248:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) )
                    // InternalDms.g:1249:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    {
                    // InternalDms.g:1249:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    // InternalDms.g:1250:7: lv_kind_2_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_26);
                    lv_kind_2_0=ruleDAssociationKindInverse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      							}
                      							set(
                      								current,
                      								"kind",
                      								lv_kind_2_0,
                      								"com.mimacom.ddd.dm.dms.Dms.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDAssociationAccess().getCompositeKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1273:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDms.g:1274:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDms.g:1274:4: (lv_name_4_0= RULE_ID )
            // InternalDms.g:1275:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getDAssociationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDAssociationAccess().getColonKeyword_3());
              		
            }
            // InternalDms.g:1295:3: ( (otherlv_6= RULE_ID ) )
            // InternalDms.g:1296:4: (otherlv_6= RULE_ID )
            {
            // InternalDms.g:1296:4: (otherlv_6= RULE_ID )
            // InternalDms.g:1297:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDAssociationAccess().getTypeDRootTypeCrossReference_4_0());
              				
            }

            }


            }

            // InternalDms.g:1308:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDms.g:1309:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1309:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDms.g:1310:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_multiplicity_7_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_7_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1327:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_PLAIN_TEXT_START)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDms.g:1328:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDms.g:1328:4: (lv_description_8_0= ruleDRichText )
                    // InternalDms.g:1329:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_8_0,
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
    // $ANTLR end "ruleDAssociation"


    // $ANTLR start "entryRuleDAttribute"
    // InternalDms.g:1350:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalDms.g:1350:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalDms.g:1351:2: iv_ruleDAttribute= ruleDAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAttribute=ruleDAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAttribute; 
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
    // $ANTLR end "entryRuleDAttribute"


    // $ANTLR start "ruleDAttribute"
    // InternalDms.g:1357:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_key_5_0= 'key' ) )? ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_detail_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_key_5_0=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1363:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_key_5_0= 'key' ) )? ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDms.g:1364:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_key_5_0= 'key' ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1364:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_key_5_0= 'key' ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDms.g:1365:3: ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_key_5_0= 'key' ) )? ( (lv_description_6_0= ruleDRichText ) )?
            {
            // InternalDms.g:1365:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDms.g:1366:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalDms.g:1366:4: (lv_detail_0_0= 'detail' )
                    // InternalDms.g:1367:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_detail_0_0, grammarAccess.getDAttributeAccess().getDetailDetailKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAttributeRule());
                      					}
                      					setWithLastConsumed(current, "detail", true, "detail");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1379:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalDms.g:1380:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalDms.g:1380:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:1381:5: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:1381:5: (lv_name_1_0= RULE_ID )
            // InternalDms.g:1382:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_name_1_0, grammarAccess.getDAttributeAccess().getNameIDTerminalRuleCall_1_0_0());
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              						setWithLastConsumed(
              							current,
              							"name",
              							lv_name_1_0,
              							"com.mimacom.ddd.dm.dmx.Dmx.ID");
              					
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getColonKeyword_1_1());
              			
            }
            // InternalDms.g:1402:4: ( (otherlv_3= RULE_ID ) )
            // InternalDms.g:1403:5: (otherlv_3= RULE_ID )
            {
            // InternalDms.g:1403:5: (otherlv_3= RULE_ID )
            // InternalDms.g:1404:6: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              					
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_3, grammarAccess.getDAttributeAccess().getTypeDSimpleTypeCrossReference_1_2_0());
              					
            }

            }


            }


            }

            // InternalDms.g:1416:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDms.g:1417:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1417:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDms.g:1418:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1435:3: ( (lv_key_5_0= 'key' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDms.g:1436:4: (lv_key_5_0= 'key' )
                    {
                    // InternalDms.g:1436:4: (lv_key_5_0= 'key' )
                    // InternalDms.g:1437:5: lv_key_5_0= 'key'
                    {
                    lv_key_5_0=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_5_0, grammarAccess.getDAttributeAccess().getKeyKeyKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAttributeRule());
                      					}
                      					setWithLastConsumed(current, "key", true, "key");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1449:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_PLAIN_TEXT_ONLY && LA31_0<=RULE_PLAIN_TEXT_START)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDms.g:1450:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDms.g:1450:4: (lv_description_6_0= ruleDRichText )
                    // InternalDms.g:1451:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_6_0,
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
    // $ANTLR end "ruleDAttribute"


    // $ANTLR start "entryRuleDQuery"
    // InternalDms.g:1472:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalDms.g:1472:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalDms.g:1473:2: iv_ruleDQuery= ruleDQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQuery=ruleDQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQuery; 
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
    // $ANTLR end "entryRuleDQuery"


    // $ANTLR start "ruleDQuery"
    // InternalDms.g:1479:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQuery() throws RecognitionException {
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

        EObject lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1485:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? ) )
            // InternalDms.g:1486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1486:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? )
            // InternalDms.g:1487:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )?
            {
            // InternalDms.g:1487:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1488:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1488:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1489:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDQueryAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDms.g:1509:3: ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDms.g:1510:4: ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalDms.g:1510:4: ( (lv_parameters_2_0= ruleDQueryParameter ) )
                    // InternalDms.g:1511:5: (lv_parameters_2_0= ruleDQueryParameter )
                    {
                    // InternalDms.g:1511:5: (lv_parameters_2_0= ruleDQueryParameter )
                    // InternalDms.g:1512:6: lv_parameters_2_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_parameters_2_0=ruleDQueryParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:1529:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==29) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDms.g:1530:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:1534:5: ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    	    // InternalDms.g:1535:6: (lv_parameters_4_0= ruleDQueryParameter )
                    	    {
                    	    // InternalDms.g:1535:6: (lv_parameters_4_0= ruleDQueryParameter )
                    	    // InternalDms.g:1536:7: lv_parameters_4_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_4_0=ruleDQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DQueryParameter");
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
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDQueryAccess().getColonKeyword_4());
              		
            }
            // InternalDms.g:1563:3: ( (otherlv_7= RULE_ID ) )
            // InternalDms.g:1564:4: (otherlv_7= RULE_ID )
            {
            // InternalDms.g:1564:4: (otherlv_7= RULE_ID )
            // InternalDms.g:1565:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDms.g:1576:3: ( (lv_multiplicity_8_0= ruleDMultiplicity ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDms.g:1577:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1577:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    // InternalDms.g:1578:5: lv_multiplicity_8_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    lv_multiplicity_8_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_8_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1595:3: (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDms.g:1596:4: otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getReturnsKeyword_7_0());
                      			
                    }
                    // InternalDms.g:1600:4: ( (lv_returns_10_0= ruleDExpression ) )
                    // InternalDms.g:1601:5: (lv_returns_10_0= ruleDExpression )
                    {
                    // InternalDms.g:1601:5: (lv_returns_10_0= ruleDExpression )
                    // InternalDms.g:1602:6: lv_returns_10_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_returns_10_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						set(
                      							current,
                      							"returns",
                      							lv_returns_10_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:1620:3: ( (lv_description_11_0= ruleDRichText ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_PLAIN_TEXT_ONLY && LA36_0<=RULE_PLAIN_TEXT_START)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDms.g:1621:4: (lv_description_11_0= ruleDRichText )
                    {
                    // InternalDms.g:1621:4: (lv_description_11_0= ruleDRichText )
                    // InternalDms.g:1622:5: lv_description_11_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_11_0,
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
    // $ANTLR end "ruleDQuery"


    // $ANTLR start "entryRuleDQueryParameter"
    // InternalDms.g:1643:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalDms.g:1643:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalDms.g:1644:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQueryParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQueryParameter=ruleDQueryParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQueryParameter; 
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
    // $ANTLR end "entryRuleDQueryParameter"


    // $ANTLR start "ruleDQueryParameter"
    // InternalDms.g:1650:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1656:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDms.g:1657:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1657:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDms.g:1658:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDms.g:1658:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1659:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1659:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1660:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDQueryParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDms.g:1680:3: ( (otherlv_2= RULE_ID ) )
            // InternalDms.g:1681:4: (otherlv_2= RULE_ID )
            {
            // InternalDms.g:1681:4: (otherlv_2= RULE_ID )
            // InternalDms.g:1682:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDms.g:1693:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDms.g:1694:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1694:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDms.g:1695:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_multiplicity_3_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryParameterRule());
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

            // InternalDms.g:1712:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_PLAIN_TEXT_ONLY && LA38_0<=RULE_PLAIN_TEXT_START)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDms.g:1713:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDms.g:1713:4: (lv_description_4_0= ruleDRichText )
                    // InternalDms.g:1714:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryParameterRule());
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
    // $ANTLR end "ruleDQueryParameter"


    // $ANTLR start "entryRuleDExistingApplication"
    // InternalDms.g:1735:1: entryRuleDExistingApplication returns [EObject current=null] : iv_ruleDExistingApplication= ruleDExistingApplication EOF ;
    public final EObject entryRuleDExistingApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExistingApplication = null;


        try {
            // InternalDms.g:1735:61: (iv_ruleDExistingApplication= ruleDExistingApplication EOF )
            // InternalDms.g:1736:2: iv_ruleDExistingApplication= ruleDExistingApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDExistingApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDExistingApplication=ruleDExistingApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDExistingApplication; 
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
    // $ANTLR end "entryRuleDExistingApplication"


    // $ANTLR start "ruleDExistingApplication"
    // InternalDms.g:1742:1: ruleDExistingApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDExistingApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_description_2_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_exceptions_5_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1748:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) )
            // InternalDms.g:1749:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            {
            // InternalDms.g:1749:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            // InternalDms.g:1750:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExistingApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalDms.g:1754:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:1755:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:1755:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:1756:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDExistingApplicationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDExistingApplicationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1772:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_PLAIN_TEXT_ONLY && LA39_0<=RULE_PLAIN_TEXT_START)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDms.g:1773:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:1773:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:1774:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDExistingApplicationAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDExistingApplicationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:1795:3: ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case 40:
                case 81:
                case 82:
                    {
                    alt40=1;
                    }
                    break;
                case 44:
                    {
                    alt40=2;
                    }
                    break;
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // InternalDms.g:1796:4: ( (lv_services_4_0= ruleDService ) )
            	    {
            	    // InternalDms.g:1796:4: ( (lv_services_4_0= ruleDService ) )
            	    // InternalDms.g:1797:5: (lv_services_4_0= ruleDService )
            	    {
            	    // InternalDms.g:1797:5: (lv_services_4_0= ruleDService )
            	    // InternalDms.g:1798:6: lv_services_4_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getServicesDServiceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_services_4_0=ruleDService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"services",
            	      							lv_services_4_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:1816:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    {
            	    // InternalDms.g:1816:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    // InternalDms.g:1817:5: (lv_exceptions_5_0= ruleDException )
            	    {
            	    // InternalDms.g:1817:5: (lv_exceptions_5_0= ruleDException )
            	    // InternalDms.g:1818:6: lv_exceptions_5_0= ruleDException
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getExceptionsDExceptionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_exceptions_5_0=ruleDException();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exceptions",
            	      							lv_exceptions_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DException");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDms.g:1836:4: ( (lv_types_6_0= ruleDType ) )
            	    {
            	    // InternalDms.g:1836:4: ( (lv_types_6_0= ruleDType ) )
            	    // InternalDms.g:1837:5: (lv_types_6_0= ruleDType )
            	    {
            	    // InternalDms.g:1837:5: (lv_types_6_0= ruleDType )
            	    // InternalDms.g:1838:6: lv_types_6_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getTypesDTypeParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_types_6_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_6_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DType");
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDExistingApplicationAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDExistingApplication"


    // $ANTLR start "entryRuleDService"
    // InternalDms.g:1864:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDms.g:1864:49: (iv_ruleDService= ruleDService EOF )
            // InternalDms.g:1865:2: iv_ruleDService= ruleDService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDService=ruleDService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDService; 
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
    // $ANTLR end "entryRuleDService"


    // $ANTLR start "ruleDService"
    // InternalDms.g:1871:1: ruleDService returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) ;
    public final EObject ruleDService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_description_12_0 = null;

        EObject lv_precondition_15_0 = null;

        EObject lv_postcondition_17_0 = null;

        EObject lv_types_18_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1877:2: ( ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) )
            // InternalDms.g:1878:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            {
            // InternalDms.g:1878:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            // InternalDms.g:1879:3: ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}'
            {
            // InternalDms.g:1879:3: ( (lv_kind_0_0= ruleDServiceKind ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=81 && LA41_0<=82)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDms.g:1880:4: (lv_kind_0_0= ruleDServiceKind )
                    {
                    // InternalDms.g:1880:4: (lv_kind_0_0= ruleDServiceKind )
                    // InternalDms.g:1881:5: lv_kind_0_0= ruleDServiceKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getKindDServiceKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    lv_kind_0_0=ruleDServiceKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DServiceKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getServiceKeyword_1());
              		
            }
            // InternalDms.g:1902:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDms.g:1903:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDms.g:1903:4: (lv_name_2_0= RULE_ID )
            // InternalDms.g:1904:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDServiceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1920:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDms.g:1921:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalDms.g:1925:4: ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=83 && LA43_0<=84)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalDms.g:1926:5: ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            {
                            // InternalDms.g:1926:5: ( (lv_parameters_4_0= ruleDServiceParameter ) )
                            // InternalDms.g:1927:6: (lv_parameters_4_0= ruleDServiceParameter )
                            {
                            // InternalDms.g:1927:6: (lv_parameters_4_0= ruleDServiceParameter )
                            // InternalDms.g:1928:7: lv_parameters_4_0= ruleDServiceParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_parameters_4_0=ruleDServiceParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDServiceRule());
                              							}
                              							add(
                              								current,
                              								"parameters",
                              								lv_parameters_4_0,
                              								"com.mimacom.ddd.dm.dms.Dms.DServiceParameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDms.g:1945:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==29) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalDms.g:1946:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,29,FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDServiceAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDms.g:1950:6: ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    // InternalDms.g:1951:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    {
                            	    // InternalDms.g:1951:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    // InternalDms.g:1952:8: lv_parameters_6_0= ruleDServiceParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_31);
                            	    lv_parameters_6_0=ruleDServiceParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDServiceRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"parameters",
                            	      									lv_parameters_6_0,
                            	      									"com.mimacom.ddd.dm.dms.Dms.DServiceParameter");
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

                    otherlv_7=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDServiceAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:1976:3: (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDms.g:1977:4: otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDServiceAccess().getRaisesKeyword_4_0());
                      			
                    }
                    // InternalDms.g:1981:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDms.g:1982:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDms.g:1982:5: (otherlv_9= RULE_ID )
                    // InternalDms.g:1983:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDServiceRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalDms.g:1994:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==29) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDms.g:1995:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getDServiceAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalDms.g:1999:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalDms.g:2000:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalDms.g:2000:6: (otherlv_11= RULE_ID )
                    	    // InternalDms.g:2001:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDServiceRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_2_1_0());
                    	      						
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
                    break;

            }

            // InternalDms.g:2014:3: ( (lv_description_12_0= ruleDRichText ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_PLAIN_TEXT_ONLY && LA47_0<=RULE_PLAIN_TEXT_START)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDms.g:2015:4: (lv_description_12_0= ruleDRichText )
                    {
                    // InternalDms.g:2015:4: (lv_description_12_0= ruleDRichText )
                    // InternalDms.g:2016:5: lv_description_12_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_12_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_12_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDServiceAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDms.g:2037:3: (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDms.g:2038:4: otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) )
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDServiceAccess().getPreconditionKeyword_7_0());
                      			
                    }
                    // InternalDms.g:2042:4: ( (lv_precondition_15_0= ruleDExpression ) )
                    // InternalDms.g:2043:5: (lv_precondition_15_0= ruleDExpression )
                    {
                    // InternalDms.g:2043:5: (lv_precondition_15_0= ruleDExpression )
                    // InternalDms.g:2044:6: lv_precondition_15_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPreconditionDExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_precondition_15_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"precondition",
                      							lv_precondition_15_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:2062:3: (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDms.g:2063:4: otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) )
                    {
                    otherlv_16=(Token)match(input,43,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDServiceAccess().getPostconditionKeyword_8_0());
                      			
                    }
                    // InternalDms.g:2067:4: ( (lv_postcondition_17_0= ruleDExpression ) )
                    // InternalDms.g:2068:5: (lv_postcondition_17_0= ruleDExpression )
                    {
                    // InternalDms.g:2068:5: (lv_postcondition_17_0= ruleDExpression )
                    // InternalDms.g:2069:6: lv_postcondition_17_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPostconditionDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_postcondition_17_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"postcondition",
                      							lv_postcondition_17_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:2087:3: ( (lv_types_18_0= ruleDType ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==26||LA50_0==28||(LA50_0>=30 && LA50_0<=33)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDms.g:2088:4: (lv_types_18_0= ruleDType )
            	    {
            	    // InternalDms.g:2088:4: (lv_types_18_0= ruleDType )
            	    // InternalDms.g:2089:5: lv_types_18_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDServiceAccess().getTypesDTypeParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_types_18_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDServiceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_18_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_19=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getDServiceAccess().getRightCurlyBracketKeyword_10());
              		
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
    // $ANTLR end "ruleDService"


    // $ANTLR start "entryRuleDServiceParameter"
    // InternalDms.g:2114:1: entryRuleDServiceParameter returns [EObject current=null] : iv_ruleDServiceParameter= ruleDServiceParameter EOF ;
    public final EObject entryRuleDServiceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDServiceParameter = null;


        try {
            // InternalDms.g:2114:58: (iv_ruleDServiceParameter= ruleDServiceParameter EOF )
            // InternalDms.g:2115:2: iv_ruleDServiceParameter= ruleDServiceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDServiceParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDServiceParameter=ruleDServiceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDServiceParameter; 
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
    // $ANTLR end "entryRuleDServiceParameter"


    // $ANTLR start "ruleDServiceParameter"
    // InternalDms.g:2121:1: ruleDServiceParameter returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDServiceParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2127:2: ( ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDms.g:2128:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2128:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDms.g:2129:3: ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDms.g:2129:3: ( (lv_direction_0_0= ruleDDirection ) )
            // InternalDms.g:2130:4: (lv_direction_0_0= ruleDDirection )
            {
            // InternalDms.g:2130:4: (lv_direction_0_0= ruleDDirection )
            // InternalDms.g:2131:5: lv_direction_0_0= ruleDDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDirectionDDirectionEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_direction_0_0=ruleDDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_0_0,
              						"com.mimacom.ddd.dm.dms.Dms.DDirection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:2148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2149:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDServiceParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDServiceParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:2170:3: ( (otherlv_3= RULE_ID ) )
            // InternalDms.g:2171:4: (otherlv_3= RULE_ID )
            {
            // InternalDms.g:2171:4: (otherlv_3= RULE_ID )
            // InternalDms.g:2172:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDServiceParameterAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDms.g:2183:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDms.g:2184:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:2184:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDms.g:2185:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:2202:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_PLAIN_TEXT_ONLY && LA52_0<=RULE_PLAIN_TEXT_START)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDms.g:2203:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDms.g:2203:4: (lv_description_5_0= ruleDRichText )
                    // InternalDms.g:2204:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_5_0,
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
    // $ANTLR end "ruleDServiceParameter"


    // $ANTLR start "entryRuleDException"
    // InternalDms.g:2225:1: entryRuleDException returns [EObject current=null] : iv_ruleDException= ruleDException EOF ;
    public final EObject entryRuleDException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDException = null;


        try {
            // InternalDms.g:2225:51: (iv_ruleDException= ruleDException EOF )
            // InternalDms.g:2226:2: iv_ruleDException= ruleDException EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDExceptionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDException=ruleDException();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDException; 
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
    // $ANTLR end "entryRuleDException"


    // $ANTLR start "ruleDException"
    // InternalDms.g:2232:1: ruleDException returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) ;
    public final EObject ruleDException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2238:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) )
            // InternalDms.g:2239:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2239:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            // InternalDms.g:2240:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExceptionAccess().getExceptionKeyword_0());
              		
            }
            // InternalDms.g:2244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2245:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDExceptionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDExceptionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:2262:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_PLAIN_TEXT_ONLY && LA53_0<=RULE_PLAIN_TEXT_START)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDms.g:2263:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:2263:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:2264:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDExceptionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDExceptionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
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
    // $ANTLR end "ruleDException"


    // $ANTLR start "entryRuleDRichText"
    // InternalDms.g:2285:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDms.g:2285:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDms.g:2286:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDms.g:2292:1: ruleDRichText returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) ;
    public final EObject ruleDRichText() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2298:2: ( ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDms.g:2299:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDms.g:2299:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_PLAIN_TEXT_START) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalDms.g:2300:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    {
                    // InternalDms.g:2300:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    // InternalDms.g:2301:4: (lv_elements_0_0= ruleDTextOnly )
                    {
                    // InternalDms.g:2301:4: (lv_elements_0_0= ruleDTextOnly )
                    // InternalDms.g:2302:5: lv_elements_0_0= ruleDTextOnly
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextOnlyParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleDTextOnly();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      					}
                      					add(
                      						current,
                      						"elements",
                      						lv_elements_0_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DTextOnly");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:2320:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDms.g:2320:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    // InternalDms.g:2321:4: ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) )
                    {
                    // InternalDms.g:2321:4: ( (lv_elements_1_0= ruleDTextStart ) )
                    // InternalDms.g:2322:5: (lv_elements_1_0= ruleDTextStart )
                    {
                    // InternalDms.g:2322:5: (lv_elements_1_0= ruleDTextStart )
                    // InternalDms.g:2323:6: lv_elements_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_elements_1_0=ruleDTextStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextStart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:2340:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDms.g:2341:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDms.g:2341:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDms.g:2342:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_elements_2_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
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

                    // InternalDms.g:2359:4: ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalDms.g:2360:5: ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDms.g:2360:5: ( (lv_elements_3_0= ruleDTextMiddle ) )
                    	    // InternalDms.g:2361:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDms.g:2361:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    // InternalDms.g:2362:7: lv_elements_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_elements_3_0=ruleDTextMiddle();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_3_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DTextMiddle");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalDms.g:2379:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDms.g:2380:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDms.g:2380:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDms.g:2381:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
                    	    lv_elements_4_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
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
                    	    break loop54;
                        }
                    } while (true);

                    // InternalDms.g:2399:4: ( (lv_elements_5_0= ruleDTextEnd ) )
                    // InternalDms.g:2400:5: (lv_elements_5_0= ruleDTextEnd )
                    {
                    // InternalDms.g:2400:5: (lv_elements_5_0= ruleDTextEnd )
                    // InternalDms.g:2401:6: lv_elements_5_0= ruleDTextEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elements_5_0=ruleDTextEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_5_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextEnd");
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


    // $ANTLR start "entryRuleDTextOnly"
    // InternalDms.g:2423:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDms.g:2423:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDms.g:2424:2: iv_ruleDTextOnly= ruleDTextOnly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextOnlyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextOnly=ruleDTextOnly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextOnly; 
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
    // $ANTLR end "entryRuleDTextOnly"


    // $ANTLR start "ruleDTextOnly"
    // InternalDms.g:2430:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:2436:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDms.g:2437:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDms.g:2437:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDms.g:2438:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDms.g:2438:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDms.g:2439:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_ONLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextOnlyAccess().getValuePLAIN_TEXT_ONLYTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextOnlyRule());
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
    // $ANTLR end "ruleDTextOnly"


    // $ANTLR start "entryRuleDTextStart"
    // InternalDms.g:2458:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDms.g:2458:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDms.g:2459:2: iv_ruleDTextStart= ruleDTextStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextStart=ruleDTextStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextStart; 
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
    // $ANTLR end "entryRuleDTextStart"


    // $ANTLR start "ruleDTextStart"
    // InternalDms.g:2465:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:2471:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDms.g:2472:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDms.g:2472:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDms.g:2473:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDms.g:2473:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDms.g:2474:4: lv_value_0_0= RULE_PLAIN_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_START,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextStartAccess().getValuePLAIN_TEXT_STARTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextStartRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_START");
              			
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
    // $ANTLR end "ruleDTextStart"


    // $ANTLR start "entryRuleDTextMiddle"
    // InternalDms.g:2493:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDms.g:2493:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDms.g:2494:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextMiddleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextMiddle=ruleDTextMiddle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextMiddle; 
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
    // $ANTLR end "entryRuleDTextMiddle"


    // $ANTLR start "ruleDTextMiddle"
    // InternalDms.g:2500:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:2506:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDms.g:2507:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDms.g:2507:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDms.g:2508:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDms.g:2508:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDms.g:2509:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_MIDDLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextMiddleAccess().getValuePLAIN_TEXT_MIDDLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextMiddleRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_MIDDLE");
              			
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
    // $ANTLR end "ruleDTextMiddle"


    // $ANTLR start "entryRuleDTextEnd"
    // InternalDms.g:2528:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDms.g:2528:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDms.g:2529:2: iv_ruleDTextEnd= ruleDTextEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextEnd=ruleDTextEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextEnd; 
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
    // $ANTLR end "entryRuleDTextEnd"


    // $ANTLR start "ruleDTextEnd"
    // InternalDms.g:2535:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:2541:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDms.g:2542:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDms.g:2542:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDms.g:2543:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDms.g:2543:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDms.g:2544:4: lv_value_0_0= RULE_PLAIN_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextEndAccess().getValuePLAIN_TEXT_ENDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextEndRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_END");
              			
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
    // $ANTLR end "ruleDTextEnd"


    // $ANTLR start "entryRuleDExpression"
    // InternalDms.g:2563:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDms.g:2563:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDms.g:2564:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDms.g:2570:1: ruleDExpression returns [EObject current=null] : this_DAssignment_0= ruleDAssignment ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2576:2: (this_DAssignment_0= ruleDAssignment )
            // InternalDms.g:2577:2: this_DAssignment_0= ruleDAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_DAssignment_0=ruleDAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DAssignment_0;
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


    // $ANTLR start "entryRuleDAssignment"
    // InternalDms.g:2588:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDms.g:2588:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDms.g:2589:2: iv_ruleDAssignment= ruleDAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAssignment=ruleDAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAssignment; 
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
    // $ANTLR end "entryRuleDAssignment"


    // $ANTLR start "ruleDAssignment"
    // InternalDms.g:2595:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDms.g:2601:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDms.g:2602:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDms.g:2602:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EOF||(LA56_1>=RULE_ID && LA56_1<=RULE_PLAIN_TEXT_END)||(LA56_1>=19 && LA56_1<=20)||(LA56_1>=24 && LA56_1<=26)||(LA56_1>=28 && LA56_1<=33)||(LA56_1>=35 && LA56_1<=36)||LA56_1==43||(LA56_1>=46 && LA56_1<=51)||(LA56_1>=61 && LA56_1<=63)||(LA56_1>=65 && LA56_1<=67)||(LA56_1>=76 && LA56_1<=77)||(LA56_1>=79 && LA56_1<=80)||(LA56_1>=85 && LA56_1<=104)) ) {
                    alt56=2;
                }
                else if ( (LA56_1==45) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA56_0>=RULE_NATURAL && LA56_0<=RULE_STRING)||LA56_0==19||(LA56_0>=52 && LA56_0<=60)||LA56_0==64||(LA56_0>=68 && LA56_0<=73)||(LA56_0>=76 && LA56_0<=77)||(LA56_0>=105 && LA56_0<=107)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalDms.g:2603:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDms.g:2603:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDms.g:2604:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDms.g:2604:4: ()
                    // InternalDms.g:2605:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDms.g:2611:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDms.g:2612:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDms.g:2612:5: (otherlv_1= RULE_ID )
                    // InternalDms.g:2613:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDms.g:2631:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDms.g:2632:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDms.g:2632:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDms.g:2633:6: lv_value_3_0= ruleDAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssignmentAccess().getValueDAssignmentParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:2652:3: this_DOrExpression_4= ruleDOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDAssignmentAccess().getDOrExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DOrExpression_4=ruleDOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DOrExpression_4;
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
    // $ANTLR end "ruleDAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalDms.g:2664:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDms.g:2664:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDms.g:2665:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalDms.g:2671:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:2677:2: (kw= ':=' )
            // InternalDms.g:2678:2: kw= ':='
            {
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getColonEqualsSignKeyword());
              	
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleDOrExpression"
    // InternalDms.g:2686:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDms.g:2686:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDms.g:2687:2: iv_ruleDOrExpression= ruleDOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOrExpression=ruleDOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOrExpression; 
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
    // $ANTLR end "entryRuleDOrExpression"


    // $ANTLR start "ruleDOrExpression"
    // InternalDms.g:2693:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2699:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDms.g:2700:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDms.g:2700:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDms.g:2701:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:2709:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case 85:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 86:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 87:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 88:
                    {
                    int LA57_5 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt57=1;
                    }


                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // InternalDms.g:2710:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDms.g:2710:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDms.g:2711:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDms.g:2721:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDms.g:2722:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDms.g:2722:6: ()
            	    // InternalDms.g:2723:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:2729:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDms.g:2730:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDms.g:2730:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDms.g:2731:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDOrExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpOr");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDms.g:2750:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDms.g:2751:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDms.g:2751:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDms.g:2752:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_rightOperand_3_0=ruleDAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DAndExpression");
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
    // $ANTLR end "ruleDOrExpression"


    // $ANTLR start "entryRuleDAndExpression"
    // InternalDms.g:2774:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDms.g:2774:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDms.g:2775:2: iv_ruleDAndExpression= ruleDAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAndExpression=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAndExpression; 
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
    // $ANTLR end "entryRuleDAndExpression"


    // $ANTLR start "ruleDAndExpression"
    // InternalDms.g:2781:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2787:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDms.g:2788:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDms.g:2788:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDms.g:2789:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:2797:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==89) ) {
                    int LA58_2 = input.LA(2);

                    if ( (synpred2_InternalDms()) ) {
                        alt58=1;
                    }


                }
                else if ( (LA58_0==90) ) {
                    int LA58_3 = input.LA(2);

                    if ( (synpred2_InternalDms()) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalDms.g:2798:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDms.g:2798:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDms.g:2799:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDms.g:2809:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDms.g:2810:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDms.g:2810:6: ()
            	    // InternalDms.g:2811:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:2817:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDms.g:2818:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDms.g:2818:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDms.g:2819:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDAndExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpAnd");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDms.g:2838:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDms.g:2839:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDms.g:2839:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDms.g:2840:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_rightOperand_3_0=ruleDEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // $ANTLR end "ruleDAndExpression"


    // $ANTLR start "entryRuleDEqualityExpression"
    // InternalDms.g:2862:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDms.g:2862:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDms.g:2863:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEqualityExpression=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEqualityExpression; 
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
    // $ANTLR end "entryRuleDEqualityExpression"


    // $ANTLR start "ruleDEqualityExpression"
    // InternalDms.g:2869:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2875:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDms.g:2876:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDms.g:2876:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDms.g:2877:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:2885:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                switch ( input.LA(1) ) {
                case 91:
                    {
                    int LA59_2 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt59=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA59_3 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt59=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA59_4 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt59=1;
                    }


                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // InternalDms.g:2886:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDms.g:2886:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDms.g:2887:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDms.g:2897:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDms.g:2898:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDms.g:2898:6: ()
            	    // InternalDms.g:2899:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:2905:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDms.g:2906:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDms.g:2906:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDms.g:2907:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDEqualityExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpEquality");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDms.g:2926:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDms.g:2927:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDms.g:2927:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDms.g:2928:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_rightOperand_3_0=ruleDRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DRelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleDEqualityExpression"


    // $ANTLR start "entryRuleDRelationalExpression"
    // InternalDms.g:2950:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDms.g:2950:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDms.g:2951:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRelationalExpression=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRelationalExpression; 
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
    // $ANTLR end "entryRuleDRelationalExpression"


    // $ANTLR start "ruleDRelationalExpression"
    // InternalDms.g:2957:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2963:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDms.g:2964:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDms.g:2964:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDms.g:2965:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:2973:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop60:
            do {
                int alt60=3;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // InternalDms.g:2974:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDms.g:2974:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDms.g:2975:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDms.g:2975:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDms.g:2976:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDms.g:2982:6: ( () ruleOpInstanceOf )
            	    // InternalDms.g:2983:7: () ruleOpInstanceOf
            	    {
            	    // InternalDms.g:2983:7: ()
            	    // InternalDms.g:2984:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOpInstanceOfParserRuleCall_1_0_0_0_1());
            	      						
            	    }
            	    pushFollow(FOLLOW_3);
            	    ruleOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:2999:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDms.g:3000:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDms.g:3000:6: (otherlv_3= RULE_ID )
            	    // InternalDms.g:3001:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:3014:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDms.g:3014:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDms.g:3015:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDms.g:3015:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDms.g:3016:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDms.g:3026:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDms.g:3027:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDms.g:3027:7: ()
            	    // InternalDms.g:3028:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDms.g:3034:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDms.g:3035:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDms.g:3035:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDms.g:3036:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_5_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getDRelationalExpressionRule());
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

            	    // InternalDms.g:3055:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDms.g:3056:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDms.g:3056:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDms.g:3057:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_rightOperand_6_0=ruleDOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightOperand",
            	      								lv_rightOperand_6_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DOtherOperatorExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalDms.g:3080:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDms.g:3080:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDms.g:3081:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpInstanceOfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpInstanceOf=ruleOpInstanceOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpInstanceOf.getText(); 
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
    // $ANTLR end "entryRuleOpInstanceOf"


    // $ANTLR start "ruleOpInstanceOf"
    // InternalDms.g:3087:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:3093:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDms.g:3094:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDms.g:3094:2: (kw= 'ISA' | kw= 'isa' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            else if ( (LA61_0==47) ) {
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
                    // InternalDms.g:3095:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:3101:3: kw= 'isa'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getIsaKeyword_1());
                      		
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
    // $ANTLR end "ruleOpInstanceOf"


    // $ANTLR start "entryRuleDOtherOperatorExpression"
    // InternalDms.g:3110:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDms.g:3110:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDms.g:3111:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOtherOperatorExpression=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOtherOperatorExpression; 
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
    // $ANTLR end "entryRuleDOtherOperatorExpression"


    // $ANTLR start "ruleDOtherOperatorExpression"
    // InternalDms.g:3117:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3123:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDms.g:3124:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDms.g:3124:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDms.g:3125:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3133:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 100:
                    {
                    int LA62_3 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 101:
                    {
                    int LA62_4 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt62=1;
                    }


                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // InternalDms.g:3134:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDms.g:3134:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDms.g:3135:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDms.g:3145:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDms.g:3146:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDms.g:3146:6: ()
            	    // InternalDms.g:3147:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3153:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDms.g:3154:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDms.g:3154:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDms.g:3155:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDOtherOperatorExpressionRule());
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

            	    // InternalDms.g:3174:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDms.g:3175:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDms.g:3175:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDms.g:3176:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_rightOperand_3_0=ruleDAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDOtherOperatorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleDOtherOperatorExpression"


    // $ANTLR start "entryRuleDAdditiveExpression"
    // InternalDms.g:3198:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDms.g:3198:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDms.g:3199:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAdditiveExpression=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAdditiveExpression; 
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
    // $ANTLR end "entryRuleDAdditiveExpression"


    // $ANTLR start "ruleDAdditiveExpression"
    // InternalDms.g:3205:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3211:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDms.g:3212:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDms.g:3212:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDms.g:3213:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3221:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==76) ) {
                    int LA63_2 = input.LA(2);

                    if ( (synpred7_InternalDms()) ) {
                        alt63=1;
                    }


                }
                else if ( (LA63_0==77) ) {
                    int LA63_3 = input.LA(2);

                    if ( (synpred7_InternalDms()) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalDms.g:3222:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDms.g:3222:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDms.g:3223:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDms.g:3233:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDms.g:3234:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDms.g:3234:6: ()
            	    // InternalDms.g:3235:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3241:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDms.g:3242:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDms.g:3242:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDms.g:3243:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDAdditiveExpressionRule());
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

            	    // InternalDms.g:3262:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDms.g:3263:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDms.g:3263:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDms.g:3264:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_rightOperand_3_0=ruleDMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // $ANTLR end "ruleDAdditiveExpression"


    // $ANTLR start "entryRuleDMultiplicativeExpression"
    // InternalDms.g:3286:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDms.g:3286:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDms.g:3287:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDMultiplicativeExpression=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleDMultiplicativeExpression"


    // $ANTLR start "ruleDMultiplicativeExpression"
    // InternalDms.g:3293:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3299:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDms.g:3300:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDms.g:3300:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDms.g:3301:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3309:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop64:
            do {
                int alt64=2;
                switch ( input.LA(1) ) {
                case 67:
                    {
                    int LA64_2 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 102:
                    {
                    int LA64_3 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 103:
                    {
                    int LA64_4 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA64_5 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt64=1;
                    }


                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // InternalDms.g:3310:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDms.g:3310:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDms.g:3311:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDms.g:3321:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDms.g:3322:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDms.g:3322:6: ()
            	    // InternalDms.g:3323:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3329:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDms.g:3330:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDms.g:3330:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDms.g:3331:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDMultiplicativeExpressionRule());
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

            	    // InternalDms.g:3350:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDms.g:3351:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDms.g:3351:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDms.g:3352:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_rightOperand_3_0=ruleDUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DUnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // $ANTLR end "ruleDMultiplicativeExpression"


    // $ANTLR start "entryRuleDUnaryOperation"
    // InternalDms.g:3374:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDms.g:3374:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDms.g:3375:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDUnaryOperation=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDUnaryOperation; 
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
    // $ANTLR end "entryRuleDUnaryOperation"


    // $ANTLR start "ruleDUnaryOperation"
    // InternalDms.g:3381:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDms.g:3387:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDms.g:3388:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDms.g:3388:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=76 && LA65_0<=77)||(LA65_0>=105 && LA65_0<=107)) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID||(LA65_0>=RULE_NATURAL && LA65_0<=RULE_STRING)||LA65_0==19||(LA65_0>=52 && LA65_0<=60)||LA65_0==64||(LA65_0>=68 && LA65_0<=73)) ) {
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
                    // InternalDms.g:3389:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDms.g:3389:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDms.g:3390:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDms.g:3390:4: ()
                    // InternalDms.g:3391:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDms.g:3397:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDms.g:3398:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDms.g:3398:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDms.g:3399:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_operator_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDUnaryOperationRule());
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

                    // InternalDms.g:3416:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDms.g:3417:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDms.g:3417:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDms.g:3418:6: lv_operand_2_0= ruleDUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperandDUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleDUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DUnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:3437:3: this_DCastExpression_3= ruleDCastExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDUnaryOperationAccess().getDCastExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DCastExpression_3=ruleDCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DCastExpression_3;
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
    // $ANTLR end "ruleDUnaryOperation"


    // $ANTLR start "entryRuleDCastExpression"
    // InternalDms.g:3449:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDms.g:3449:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDms.g:3450:2: iv_ruleDCastExpression= ruleDCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDCastExpression=ruleDCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCastExpression; 
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
    // $ANTLR end "entryRuleDCastExpression"


    // $ANTLR start "ruleDCastExpression"
    // InternalDms.g:3456:1: ruleDCastExpression returns [EObject current=null] : (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DTypedMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3462:2: ( (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDms.g:3463:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDms.g:3463:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDms.g:3464:3: this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_DTypedMemberReference_0=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DTypedMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3472:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==48) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred9_InternalDms()) ) {
                    alt66=1;
                }
            }
            else if ( (LA66_0==49) ) {
                int LA66_2 = input.LA(2);

                if ( (synpred9_InternalDms()) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalDms.g:3473:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDms.g:3473:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDms.g:3474:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDms.g:3480:5: ( () ruleOpCast )
                    // InternalDms.g:3481:6: () ruleOpCast
                    {
                    // InternalDms.g:3481:6: ()
                    // InternalDms.g:3482:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDCastExpressionAccess().getOpCastParserRuleCall_1_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    ruleOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:3497:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDms.g:3498:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDms.g:3498:5: (otherlv_3= RULE_ID )
                    // InternalDms.g:3499:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCastExpressionRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0());
                      					
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
    // $ANTLR end "ruleDCastExpression"


    // $ANTLR start "entryRuleOpCast"
    // InternalDms.g:3515:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDms.g:3515:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDms.g:3516:2: iv_ruleOpCast= ruleOpCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCast=ruleOpCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCast.getText(); 
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
    // $ANTLR end "entryRuleOpCast"


    // $ANTLR start "ruleOpCast"
    // InternalDms.g:3522:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:3528:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDms.g:3529:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDms.g:3529:2: (kw= 'AS' | kw= 'as' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==48) ) {
                alt67=1;
            }
            else if ( (LA67_0==49) ) {
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
                    // InternalDms.g:3530:3: kw= 'AS'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:3536:3: kw= 'as'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getAsKeyword_1());
                      		
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
    // $ANTLR end "ruleOpCast"


    // $ANTLR start "entryRuleDTypedMemberReference"
    // InternalDms.g:3545:1: entryRuleDTypedMemberReference returns [EObject current=null] : iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF ;
    public final EObject entryRuleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTypedMemberReference = null;


        try {
            // InternalDms.g:3545:62: (iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF )
            // InternalDms.g:3546:2: iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTypedMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTypedMemberReference=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTypedMemberReference; 
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
    // $ANTLR end "entryRuleDTypedMemberReference"


    // $ANTLR start "ruleDTypedMemberReference"
    // InternalDms.g:3552:1: ruleDTypedMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
    public final EObject ruleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_before_14_0=null;
        EObject this_DPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_memberCallArguments_10_0 = null;

        EObject lv_memberCallArguments_12_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3558:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalDms.g:3559:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalDms.g:3559:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalDms.g:3560:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3568:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop71:
            do {
                int alt71=3;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==50) ) {
                    int LA71_2 = input.LA(2);

                    if ( (synpred10_InternalDms()) ) {
                        alt71=1;
                    }
                    else if ( (synpred11_InternalDms()) ) {
                        alt71=2;
                    }


                }


                switch (alt71) {
            	case 1 :
            	    // InternalDms.g:3569:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDms.g:3569:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDms.g:3570:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDms.g:3570:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDms.g:3571:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDms.g:3583:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDms.g:3584:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDms.g:3584:7: ()
            	    // InternalDms.g:3585:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDms.g:3595:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDms.g:3596:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDms.g:3596:8: (otherlv_3= RULE_ID )
            	    // InternalDms.g:3597:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:3617:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDms.g:3618:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDms.g:3618:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDms.g:3619:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_value_5_0=ruleDAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
            	      							}
            	      							set(
            	      								current,
            	      								"value",
            	      								lv_value_5_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DAssignment");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:3638:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalDms.g:3638:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalDms.g:3639:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalDms.g:3639:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDms.g:3640:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDms.g:3646:6: ( () otherlv_7= '.' )
            	    // InternalDms.g:3647:7: () otherlv_7= '.'
            	    {
            	    // InternalDms.g:3647:7: ()
            	    // InternalDms.g:3648:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:3660:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDms.g:3661:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDms.g:3661:6: (otherlv_8= RULE_ID )
            	    // InternalDms.g:3662:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:3673:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt70=3;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==19) && (synpred12_InternalDms())) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==51) ) {
            	        alt70=2;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalDms.g:3674:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalDms.g:3674:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalDms.g:3675:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDms.g:3675:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDms.g:3676:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDms.g:3680:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDms.g:3681:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,19,FOLLOW_55); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	              									}
            	              									setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              								
            	            }

            	            }


            	            }

            	            // InternalDms.g:3693:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt69=2;
            	            int LA69_0 = input.LA(1);

            	            if ( (LA69_0==RULE_ID||(LA69_0>=RULE_NATURAL && LA69_0<=RULE_STRING)||LA69_0==19||(LA69_0>=52 && LA69_0<=60)||LA69_0==64||(LA69_0>=68 && LA69_0<=73)||(LA69_0>=76 && LA69_0<=77)||(LA69_0>=105 && LA69_0<=107)) ) {
            	                alt69=1;
            	            }
            	            switch (alt69) {
            	                case 1 :
            	                    // InternalDms.g:3694:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDms.g:3694:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDms.g:3695:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDms.g:3695:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDms.g:3696:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_31);
            	                    lv_memberCallArguments_10_0=ruleDExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
            	                      										}
            	                      										add(
            	                      											current,
            	                      											"memberCallArguments",
            	                      											lv_memberCallArguments_10_0,
            	                      											"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	                      										afterParserOrEnumRuleCall();
            	                      									
            	                    }

            	                    }


            	                    }

            	                    // InternalDms.g:3713:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop68:
            	                    do {
            	                        int alt68=2;
            	                        int LA68_0 = input.LA(1);

            	                        if ( (LA68_0==29) ) {
            	                            alt68=1;
            	                        }


            	                        switch (alt68) {
            	                    	case 1 :
            	                    	    // InternalDms.g:3714:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalDms.g:3718:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDms.g:3719:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDms.g:3719:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDms.g:3720:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_31);
            	                    	    lv_memberCallArguments_12_0=ruleDExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											if (current==null) {
            	                    	      												current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
            	                    	      											}
            	                    	      											add(
            	                    	      												current,
            	                    	      												"memberCallArguments",
            	                    	      												lv_memberCallArguments_12_0,
            	                    	      												"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	                    	      											afterParserOrEnumRuleCall();
            	                    	      										
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop68;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDms.g:3745:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalDms.g:3745:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalDms.g:3746:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalDms.g:3746:7: (lv_before_14_0= '@before' )
            	            // InternalDms.g:3747:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,51,FOLLOW_53); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_before_14_0, grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
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
    // $ANTLR end "ruleDTypedMemberReference"


    // $ANTLR start "entryRuleDPrimaryExpression"
    // InternalDms.g:3766:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDms.g:3766:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDms.g:3767:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimaryExpression=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimaryExpression; 
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
    // $ANTLR end "entryRuleDPrimaryExpression"


    // $ANTLR start "ruleDPrimaryExpression"
    // InternalDms.g:3773:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
    public final EObject ruleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DLiteralExpression_0 = null;

        EObject this_DSelfExpression_1 = null;

        EObject this_DReturnExpression_2 = null;

        EObject this_DRaiseExpression_3 = null;

        EObject this_DParenthesizedExpression_4 = null;

        EObject this_DFunctionCall_5 = null;

        EObject this_DConstructorCall_6 = null;

        EObject this_DContextReference_7 = null;

        EObject this_DIfExpression_8 = null;

        EObject this_DForLoopExpression_9 = null;



        	enterRule();

        try {
            // InternalDms.g:3779:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDms.g:3780:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDms.g:3780:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt72=10;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalDms.g:3781:3: this_DLiteralExpression_0= ruleDLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DLiteralExpression_0=ruleDLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:3790:3: this_DSelfExpression_1= ruleDSelfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDSelfExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DSelfExpression_1=ruleDSelfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DSelfExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:3799:3: this_DReturnExpression_2= ruleDReturnExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDReturnExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DReturnExpression_2=ruleDReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DReturnExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:3808:3: this_DRaiseExpression_3= ruleDRaiseExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDRaiseExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRaiseExpression_3=ruleDRaiseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRaiseExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDms.g:3817:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDParenthesizedExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DParenthesizedExpression_4=ruleDParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DParenthesizedExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDms.g:3826:3: this_DFunctionCall_5= ruleDFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDFunctionCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DFunctionCall_5=ruleDFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DFunctionCall_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDms.g:3835:3: this_DConstructorCall_6= ruleDConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDConstructorCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DConstructorCall_6=ruleDConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DConstructorCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDms.g:3844:3: this_DContextReference_7= ruleDContextReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDContextReferenceParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DContextReference_7=ruleDContextReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DContextReference_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDms.g:3853:3: this_DIfExpression_8= ruleDIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDIfExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DIfExpression_8=ruleDIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DIfExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDms.g:3862:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDms.g:3862:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDms.g:3863:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_DForLoopExpression_9=ruleDForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DForLoopExpression_9;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleDPrimaryExpression"


    // $ANTLR start "entryRuleDLiteralExpression"
    // InternalDms.g:3888:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDms.g:3888:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDms.g:3889:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDLiteralExpression=ruleDLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDLiteralExpression; 
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
    // $ANTLR end "entryRuleDLiteralExpression"


    // $ANTLR start "ruleDLiteralExpression"
    // InternalDms.g:3895:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDms.g:3901:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDms.g:3902:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDms.g:3902:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt73=1;
                }
                break;
            case RULE_STRING:
                {
                alt73=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA73_3 = input.LA(2);

                if ( (LA73_3==50) ) {
                    int LA73_5 = input.LA(3);

                    if ( (LA73_5==RULE_NATURAL) ) {
                        alt73=4;
                    }
                    else if ( (LA73_5==RULE_ID) ) {
                        alt73=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA73_3==EOF||(LA73_3>=RULE_ID && LA73_3<=RULE_PLAIN_TEXT_END)||LA73_3==20||(LA73_3>=24 && LA73_3<=26)||(LA73_3>=28 && LA73_3<=33)||(LA73_3>=35 && LA73_3<=36)||LA73_3==43||(LA73_3>=46 && LA73_3<=49)||(LA73_3>=61 && LA73_3<=63)||(LA73_3>=65 && LA73_3<=67)||(LA73_3>=76 && LA73_3<=77)||(LA73_3>=79 && LA73_3<=80)||(LA73_3>=85 && LA73_3<=104)) ) {
                    alt73=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 3, input);

                    throw nvae;
                }
                }
                break;
            case 72:
            case 73:
                {
                alt73=5;
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
                    // InternalDms.g:3903:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDBooleanLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DBooleanLiteral_0=ruleDBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DBooleanLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:3912:3: this_DStringLiteral_1= ruleDStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDStringLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DStringLiteral_1=ruleDStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DStringLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:3921:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDNaturalLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DNaturalLiteral_2=ruleDNaturalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DNaturalLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:3930:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDDecimalLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDecimalLiteral_3=ruleDDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDecimalLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDms.g:3939:3: this_DNilLiteral_4= ruleDNilLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDNilLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DNilLiteral_4=ruleDNilLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DNilLiteral_4;
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
    // $ANTLR end "ruleDLiteralExpression"


    // $ANTLR start "entryRuleDSelfExpression"
    // InternalDms.g:3951:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDms.g:3951:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDms.g:3952:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDSelfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDSelfExpression=ruleDSelfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDSelfExpression; 
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
    // $ANTLR end "entryRuleDSelfExpression"


    // $ANTLR start "ruleDSelfExpression"
    // InternalDms.g:3958:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDms.g:3964:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDms.g:3965:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDms.g:3965:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDms.g:3966:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDms.g:3966:3: ()
            // InternalDms.g:3967:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:3973:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==52) ) {
                alt74=1;
            }
            else if ( (LA74_0==53) ) {
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
                    // InternalDms.g:3974:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:3979:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1());
                      			
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
    // $ANTLR end "ruleDSelfExpression"


    // $ANTLR start "entryRuleDReturnExpression"
    // InternalDms.g:3988:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDms.g:3988:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDms.g:3989:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDReturnExpression=ruleDReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDReturnExpression; 
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
    // $ANTLR end "entryRuleDReturnExpression"


    // $ANTLR start "ruleDReturnExpression"
    // InternalDms.g:3995:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4001:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDms.g:4002:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDms.g:4002:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDms.g:4003:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDms.g:4003:3: ()
            // InternalDms.g:4004:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4010:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==54) ) {
                alt75=1;
            }
            else if ( (LA75_0==55) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalDms.g:4011:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4016:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:4021:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalDms.g:4022:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDms.g:4023:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDms.g:4024:5: lv_expression_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDReturnExpressionAccess().getExpressionDExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDReturnExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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
    // $ANTLR end "ruleDReturnExpression"


    // $ANTLR start "entryRuleDRaiseExpression"
    // InternalDms.g:4045:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDms.g:4045:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDms.g:4046:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRaiseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRaiseExpression=ruleDRaiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRaiseExpression; 
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
    // $ANTLR end "entryRuleDRaiseExpression"


    // $ANTLR start "ruleDRaiseExpression"
    // InternalDms.g:4052:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4058:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDms.g:4059:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDms.g:4059:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDms.g:4060:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDms.g:4060:3: ()
            // InternalDms.g:4061:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4067:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            else if ( (LA77_0==57) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalDms.g:4068:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4073:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:4078:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDms.g:4079:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDms.g:4079:4: (lv_expression_3_0= ruleDExpression )
            // InternalDms.g:4080:5: lv_expression_3_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRaiseExpressionAccess().getExpressionDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDRaiseExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
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
    // $ANTLR end "ruleDRaiseExpression"


    // $ANTLR start "entryRuleDParenthesizedExpression"
    // InternalDms.g:4101:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDms.g:4101:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDms.g:4102:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDParenthesizedExpression=ruleDParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDParenthesizedExpression; 
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
    // $ANTLR end "entryRuleDParenthesizedExpression"


    // $ANTLR start "ruleDParenthesizedExpression"
    // InternalDms.g:4108:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDms.g:4114:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDms.g:4115:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDms.g:4115:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDms.g:4116:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_8);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleDParenthesizedExpression"


    // $ANTLR start "entryRuleDFunctionCall"
    // InternalDms.g:4136:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDms.g:4136:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDms.g:4137:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFunctionCall=ruleDFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFunctionCall; 
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
    // $ANTLR end "entryRuleDFunctionCall"


    // $ANTLR start "ruleDFunctionCall"
    // InternalDms.g:4143:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleDFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_functionCallArguments_3_0 = null;

        EObject lv_functionCallArguments_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4149:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDms.g:4150:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDms.g:4150:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDms.g:4151:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDms.g:4151:3: ()
            // InternalDms.g:4152:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4158:3: ( (otherlv_1= RULE_ID ) )
            // InternalDms.g:4159:4: (otherlv_1= RULE_ID )
            {
            // InternalDms.g:4159:4: (otherlv_1= RULE_ID )
            // InternalDms.g:4160:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDms.g:4175:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||(LA79_0>=RULE_NATURAL && LA79_0<=RULE_STRING)||LA79_0==19||(LA79_0>=52 && LA79_0<=60)||LA79_0==64||(LA79_0>=68 && LA79_0<=73)||(LA79_0>=76 && LA79_0<=77)||(LA79_0>=105 && LA79_0<=107)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDms.g:4176:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDms.g:4176:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDms.g:4177:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDms.g:4177:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDms.g:4178:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_functionCallArguments_3_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"functionCallArguments",
                      							lv_functionCallArguments_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:4195:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==29) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalDms.g:4196:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:4200:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDms.g:4201:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDms.g:4201:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDms.g:4202:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_functionCallArguments_5_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"functionCallArguments",
                    	      								lv_functionCallArguments_5_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDFunctionCallAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDFunctionCall"


    // $ANTLR start "entryRuleDConstructorCall"
    // InternalDms.g:4229:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDms.g:4229:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDms.g:4230:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDConstructorCall=ruleDConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDConstructorCall; 
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
    // $ANTLR end "entryRuleDConstructorCall"


    // $ANTLR start "ruleDConstructorCall"
    // InternalDms.g:4236:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleDConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitConstructorCall_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4242:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDms.g:4243:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDms.g:4243:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDms.g:4244:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDms.g:4244:3: ()
            // InternalDms.g:4245:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDConstructorCallAccess().getOpConstructorParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_3);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4258:3: ( (otherlv_2= RULE_ID ) )
            // InternalDms.g:4259:4: (otherlv_2= RULE_ID )
            {
            // InternalDms.g:4259:4: (otherlv_2= RULE_ID )
            // InternalDms.g:4260:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDms.g:4271:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==19) && (synpred15_InternalDms())) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDms.g:4272:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDms.g:4272:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDms.g:4273:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDms.g:4277:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDms.g:4278:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,19,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitConstructorCall_3_0, grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDConstructorCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalDms.g:4290:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID||(LA81_0>=RULE_NATURAL && LA81_0<=RULE_STRING)||LA81_0==19||(LA81_0>=52 && LA81_0<=60)||LA81_0==64||(LA81_0>=68 && LA81_0<=73)||(LA81_0>=76 && LA81_0<=77)||(LA81_0>=105 && LA81_0<=107)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalDms.g:4291:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDms.g:4291:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDms.g:4292:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDms.g:4292:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDms.g:4293:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_arguments_4_0=ruleDExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDConstructorCallRule());
                              							}
                              							add(
                              								current,
                              								"arguments",
                              								lv_arguments_4_0,
                              								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDms.g:4310:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==29) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // InternalDms.g:4311:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDms.g:4315:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDms.g:4316:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDms.g:4316:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDms.g:4317:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_31);
                            	    lv_arguments_6_0=ruleDExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDConstructorCallRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"arguments",
                            	      									lv_arguments_6_0,
                            	      									"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDConstructorCallAccess().getRightParenthesisKeyword_3_2());
                      			
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
    // $ANTLR end "ruleDConstructorCall"


    // $ANTLR start "entryRuleOpConstructor"
    // InternalDms.g:4345:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDms.g:4345:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDms.g:4346:2: iv_ruleOpConstructor= ruleOpConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpConstructor=ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpConstructor.getText(); 
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
    // $ANTLR end "entryRuleOpConstructor"


    // $ANTLR start "ruleOpConstructor"
    // InternalDms.g:4352:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:4358:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDms.g:4359:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDms.g:4359:2: (kw= 'NEW' | kw= 'new' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==58) ) {
                alt83=1;
            }
            else if ( (LA83_0==59) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalDms.g:4360:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4366:3: kw= 'new'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNewKeyword_1());
                      		
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
    // $ANTLR end "ruleOpConstructor"


    // $ANTLR start "entryRuleDContextReference"
    // InternalDms.g:4375:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDms.g:4375:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDms.g:4376:2: iv_ruleDContextReference= ruleDContextReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDContextReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDContextReference=ruleDContextReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDContextReference; 
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
    // $ANTLR end "entryRuleDContextReference"


    // $ANTLR start "ruleDContextReference"
    // InternalDms.g:4382:1: ruleDContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;


        	enterRule();

        try {
            // InternalDms.g:4388:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) )
            // InternalDms.g:4389:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            {
            // InternalDms.g:4389:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            // InternalDms.g:4390:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
            {
            // InternalDms.g:4390:3: ()
            // InternalDms.g:4391:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4397:3: ( (otherlv_1= RULE_ID ) )
            // InternalDms.g:4398:4: (otherlv_1= RULE_ID )
            {
            // InternalDms.g:4398:4: (otherlv_1= RULE_ID )
            // InternalDms.g:4399:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDms.g:4410:3: ( (lv_before_2_0= '@before' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==51) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDms.g:4411:4: (lv_before_2_0= '@before' )
                    {
                    // InternalDms.g:4411:4: (lv_before_2_0= '@before' )
                    // InternalDms.g:4412:5: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_before_2_0, grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDContextReferenceRule());
                      					}
                      					setWithLastConsumed(current, "before", true, "@before");
                      				
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
    // $ANTLR end "ruleDContextReference"


    // $ANTLR start "entryRuleDIfExpression"
    // InternalDms.g:4428:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDms.g:4428:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDms.g:4429:2: iv_ruleDIfExpression= ruleDIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDIfExpression=ruleDIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDIfExpression; 
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
    // $ANTLR end "entryRuleDIfExpression"


    // $ANTLR start "ruleDIfExpression"
    // InternalDms.g:4435:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
    public final EObject ruleDIfExpression() throws RecognitionException {
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
            // InternalDms.g:4441:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDms.g:4442:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDms.g:4442:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDms.g:4443:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDms.g:4443:3: ()
            // InternalDms.g:4444:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDms.g:4454:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDms.g:4455:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDms.g:4455:4: (lv_if_2_0= ruleDExpression )
            // InternalDms.g:4456:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_if_2_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
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

            otherlv_3=(Token)match(input,61,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDms.g:4477:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDms.g:4478:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDms.g:4478:4: (lv_then_4_0= ruleDExpression )
            // InternalDms.g:4479:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_then_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
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

            // InternalDms.g:4496:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==62) && (synpred16_InternalDms())) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDms.g:4497:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDms.g:4497:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDms.g:4498:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDms.g:4504:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDms.g:4505:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDms.g:4505:5: (lv_else_6_0= ruleDExpression )
                    // InternalDms.g:4506:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_60);
                    lv_else_6_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
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

            otherlv_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDIfExpressionAccess().getEndKeyword_6());
              		
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
    // $ANTLR end "ruleDIfExpression"


    // $ANTLR start "entryRuleDForLoopExpression"
    // InternalDms.g:4532:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDms.g:4532:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDms.g:4533:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDForLoopExpression=ruleDForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDForLoopExpression; 
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
    // $ANTLR end "entryRuleDForLoopExpression"


    // $ANTLR start "ruleDForLoopExpression"
    // InternalDms.g:4539:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
    public final EObject ruleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_declaredParam_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4545:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDms.g:4546:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDms.g:4546:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDms.g:4547:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDms.g:4547:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDms.g:4548:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDms.g:4560:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDms.g:4561:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDms.g:4561:5: ()
            // InternalDms.g:4562:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDms.g:4572:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDms.g:4573:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDms.g:4573:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDms.g:4574:7: lv_declaredParam_2_0= RULE_ID
            {
            lv_declaredParam_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(lv_declaredParam_2_0, grammarAccess.getDForLoopExpressionAccess().getDeclaredParamIDTerminalRuleCall_0_0_2_0());
              						
            }
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getDForLoopExpressionRule());
              							}
              							setWithLastConsumed(
              								current,
              								"declaredParam",
              								lv_declaredParam_2_0,
              								"com.mimacom.ddd.dm.dmx.Dmx.ID");
              						
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalDms.g:4596:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDms.g:4597:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDms.g:4597:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDms.g:4598:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_forExpression_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDForLoopExpressionRule());
              					}
              					set(
              						current,
              						"forExpression",
              						lv_forExpression_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,65,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDms.g:4619:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDms.g:4620:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDms.g:4620:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDms.g:4621:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_eachExpression_6_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_6_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDForLoopExpressionAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleDForLoopExpression"


    // $ANTLR start "entryRuleDMultiplicity"
    // InternalDms.g:4646:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDms.g:4646:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDms.g:4647:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDms.g:4653:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4659:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalDms.g:4660:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalDms.g:4660:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalDms.g:4661:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDms.g:4665:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalDms.g:4666:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalDms.g:4666:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalDms.g:4667:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_minOccurs_1_0, grammarAccess.getDMultiplicityAccess().getMinOccursNATURALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDMultiplicityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"minOccurs",
              						lv_minOccurs_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.NATURAL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalDms.g:4687:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalDms.g:4688:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalDms.g:4688:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalDms.g:4689:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_maxOccurs_3_0=ruleMULTIPLICITY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDMultiplicityRule());
              					}
              					set(
              						current,
              						"maxOccurs",
              						lv_maxOccurs_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.MULTIPLICITY");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDMultiplicityAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDMultiplicity"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalDms.g:4714:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDms.g:4714:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDms.g:4715:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDms.g:4721:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:4727:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDms.g:4728:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDms.g:4728:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_NATURAL) ) {
                alt86=1;
            }
            else if ( (LA86_0==67) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalDms.g:4729:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDms.g:4737:3: kw= '*'
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


    // $ANTLR start "entryRuleDBooleanLiteral"
    // InternalDms.g:4746:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDms.g:4746:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDms.g:4747:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDBooleanLiteral=ruleDBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBooleanLiteral; 
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
    // $ANTLR end "entryRuleDBooleanLiteral"


    // $ANTLR start "ruleDBooleanLiteral"
    // InternalDms.g:4753:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDms.g:4759:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDms.g:4760:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDms.g:4760:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDms.g:4761:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDms.g:4761:3: ()
            // InternalDms.g:4762:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4768:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt87=1;
                }
                break;
            case 69:
                {
                alt87=2;
                }
                break;
            case 70:
                {
                alt87=3;
                }
                break;
            case 71:
                {
                alt87=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalDms.g:4769:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDms.g:4769:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDms.g:4770:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDms.g:4770:5: (lv_value_1_0= 'TRUE' )
                    // InternalDms.g:4771:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "TRUE");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:4784:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDms.g:4784:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDms.g:4785:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDms.g:4785:5: (lv_value_2_0= 'true' )
                    // InternalDms.g:4786:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:4799:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:4804:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3());
                      			
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
    // $ANTLR end "ruleDBooleanLiteral"


    // $ANTLR start "entryRuleDStringLiteral"
    // InternalDms.g:4813:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDms.g:4813:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDms.g:4814:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDStringLiteral=ruleDStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDStringLiteral; 
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
    // $ANTLR end "entryRuleDStringLiteral"


    // $ANTLR start "ruleDStringLiteral"
    // InternalDms.g:4820:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDms.g:4826:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDms.g:4827:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDms.g:4827:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDms.g:4828:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDms.g:4828:3: ()
            // InternalDms.g:4829:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4835:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDms.g:4836:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDms.g:4836:4: (lv_value_1_0= RULE_STRING )
            // InternalDms.g:4837:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDStringLiteralRule());
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
    // $ANTLR end "ruleDStringLiteral"


    // $ANTLR start "entryRuleDNaturalLiteral"
    // InternalDms.g:4857:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDms.g:4857:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDms.g:4858:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNaturalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNaturalLiteral=ruleDNaturalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNaturalLiteral; 
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
    // $ANTLR end "entryRuleDNaturalLiteral"


    // $ANTLR start "ruleDNaturalLiteral"
    // InternalDms.g:4864:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDms.g:4870:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDms.g:4871:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDms.g:4871:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDms.g:4872:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDms.g:4872:3: ()
            // InternalDms.g:4873:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4879:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDms.g:4880:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDms.g:4880:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDms.g:4881:5: lv_value_1_0= RULE_NATURAL
            {
            lv_value_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDNaturalLiteralAccess().getValueNATURALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNaturalLiteralRule());
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
    // $ANTLR end "ruleDNaturalLiteral"


    // $ANTLR start "entryRuleDDecimalLiteral"
    // InternalDms.g:4901:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDms.g:4901:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDms.g:4902:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDecimalLiteral=ruleDDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDecimalLiteral; 
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
    // $ANTLR end "entryRuleDDecimalLiteral"


    // $ANTLR start "ruleDDecimalLiteral"
    // InternalDms.g:4908:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4914:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDms.g:4915:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDms.g:4915:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDms.g:4916:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDms.g:4916:3: ()
            // InternalDms.g:4917:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4923:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDms.g:4924:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDms.g:4924:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDms.g:4925:5: lv_value_1_0= ruleDECIMAL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDecimalLiteralAccess().getValueDECIMALParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDecimalLiteralRule());
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
    // $ANTLR end "ruleDDecimalLiteral"


    // $ANTLR start "entryRuleDNilLiteral"
    // InternalDms.g:4946:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDms.g:4946:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDms.g:4947:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNilLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNilLiteral=ruleDNilLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNilLiteral; 
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
    // $ANTLR end "entryRuleDNilLiteral"


    // $ANTLR start "ruleDNilLiteral"
    // InternalDms.g:4953:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDms.g:4959:2: ( ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) ) )
            // InternalDms.g:4960:2: ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) )
            {
            // InternalDms.g:4960:2: ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) )
            // InternalDms.g:4961:3: () (otherlv_1= 'NIL' | otherlv_2= 'nil' )
            {
            // InternalDms.g:4961:3: ()
            // InternalDms.g:4962:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4968:3: (otherlv_1= 'NIL' | otherlv_2= 'nil' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==72) ) {
                alt88=1;
            }
            else if ( (LA88_0==73) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalDms.g:4969:4: otherlv_1= 'NIL'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4974:4: otherlv_2= 'nil'
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDNilLiteralAccess().getNilKeyword_1_1());
                      			
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
    // $ANTLR end "ruleDNilLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalDms.g:4983:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDms.g:4983:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDms.g:4984:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDms.g:4990:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDms.g:4996:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDms.g:4997:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDms.g:4997:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDms.g:4998:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,50,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDms.g:5017:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=74 && LA91_0<=75)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDms.g:5018:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDms.g:5018:4: (kw= 'E' | kw= 'e' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==74) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==75) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalDms.g:5019:5: kw= 'E'
                            {
                            kw=(Token)match(input,74,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDms.g:5025:5: kw= 'e'
                            {
                            kw=(Token)match(input,75,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDms.g:5031:4: (kw= '+' | kw= '-' )?
                    int alt90=3;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==76) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==77) ) {
                        alt90=2;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalDms.g:5032:5: kw= '+'
                            {
                            kw=(Token)match(input,76,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDms.g:5038:5: kw= '-'
                            {
                            kw=(Token)match(input,77,FOLLOW_62); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDQualifiedNameWithWildcard"
    // InternalDms.g:5056:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDms.g:5056:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDms.g:5057:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDms.g:5063:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDms.g:5069:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDms.g:5070:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDms.g:5070:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDms.g:5071:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:5081:3: (kw= '.*' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==78) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalDms.g:5082:4: kw= '.*'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5092:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDms.g:5092:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDms.g:5093:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDms.g:5099:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDms.g:5105:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDms.g:5106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDms.g:5106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDms.g:5107:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDms.g:5114:3: (kw= '.' this_ID_2= RULE_ID )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==50) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalDms.g:5115:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop93;
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


    // $ANTLR start "ruleDAssociationKind"
    // InternalDms.g:5132:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5138:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalDms.g:5139:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalDms.g:5139:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==79) ) {
                alt94=1;
            }
            else if ( (LA94_0==36) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalDms.g:5140:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalDms.g:5140:3: (enumLiteral_0= 'reference' )
                    // InternalDms.g:5141:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5148:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalDms.g:5148:3: (enumLiteral_1= 'composite' )
                    // InternalDms.g:5149:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDAssociationKind"


    // $ANTLR start "ruleDAssociationKindInverse"
    // InternalDms.g:5159:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDms.g:5165:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDms.g:5166:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDms.g:5166:2: (enumLiteral_0= 'inverse' )
            // InternalDms.g:5167:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleDAssociationKindInverse"


    // $ANTLR start "ruleDServiceKind"
    // InternalDms.g:5176:1: ruleDServiceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleDServiceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5182:2: ( ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) )
            // InternalDms.g:5183:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalDms.g:5183:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==81) ) {
                alt95=1;
            }
            else if ( (LA95_0==82) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalDms.g:5184:3: (enumLiteral_0= 'synchronous' )
                    {
                    // InternalDms.g:5184:3: (enumLiteral_0= 'synchronous' )
                    // InternalDms.g:5185:4: enumLiteral_0= 'synchronous'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5192:3: (enumLiteral_1= 'async' )
                    {
                    // InternalDms.g:5192:3: (enumLiteral_1= 'async' )
                    // InternalDms.g:5193:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getASYNCHRONOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDServiceKindAccess().getASYNCHRONOUSEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDServiceKind"


    // $ANTLR start "ruleDDirection"
    // InternalDms.g:5203:1: ruleDDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5209:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalDms.g:5210:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalDms.g:5210:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==83) ) {
                alt96=1;
            }
            else if ( (LA96_0==84) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalDms.g:5211:3: (enumLiteral_0= 'in' )
                    {
                    // InternalDms.g:5211:3: (enumLiteral_0= 'in' )
                    // InternalDms.g:5212:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5219:3: (enumLiteral_1= 'out' )
                    {
                    // InternalDms.g:5219:3: (enumLiteral_1= 'out' )
                    // InternalDms.g:5220:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getOUTBOUNDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDDirectionAccess().getOUTBOUNDEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDDirection"


    // $ANTLR start "ruleOpOr"
    // InternalDms.g:5230:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDms.g:5236:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDms.g:5237:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDms.g:5237:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt97=1;
                }
                break;
            case 86:
                {
                alt97=2;
                }
                break;
            case 87:
                {
                alt97=3;
                }
                break;
            case 88:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalDms.g:5238:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDms.g:5238:3: (enumLiteral_0= 'OR' )
                    // InternalDms.g:5239:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5246:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDms.g:5246:3: (enumLiteral_1= 'or' )
                    // InternalDms.g:5247:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5254:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDms.g:5254:3: (enumLiteral_2= 'XOR' )
                    // InternalDms.g:5255:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:5262:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDms.g:5262:3: (enumLiteral_3= 'xor' )
                    // InternalDms.g:5263:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "ruleOpAnd"
    // InternalDms.g:5273:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5279:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDms.g:5280:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDms.g:5280:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==89) ) {
                alt98=1;
            }
            else if ( (LA98_0==90) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalDms.g:5281:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDms.g:5281:3: (enumLiteral_0= 'AND' )
                    // InternalDms.g:5282:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5289:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDms.g:5289:3: (enumLiteral_1= 'and' )
                    // InternalDms.g:5290:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "ruleOpEquality"
    // InternalDms.g:5300:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDms.g:5306:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDms.g:5307:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDms.g:5307:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt99=1;
                }
                break;
            case 92:
                {
                alt99=2;
                }
                break;
            case 93:
                {
                alt99=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalDms.g:5308:3: (enumLiteral_0= '=' )
                    {
                    // InternalDms.g:5308:3: (enumLiteral_0= '=' )
                    // InternalDms.g:5309:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5316:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDms.g:5316:3: (enumLiteral_1= '!=' )
                    // InternalDms.g:5317:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5324:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDms.g:5324:3: (enumLiteral_2= '<>' )
                    // InternalDms.g:5325:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "ruleOpCompare"
    // InternalDms.g:5335:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDms.g:5341:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDms.g:5342:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDms.g:5342:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt100=6;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt100=1;
                }
                break;
            case 95:
                {
                alt100=2;
                }
                break;
            case 96:
                {
                alt100=3;
                }
                break;
            case 97:
                {
                alt100=4;
                }
                break;
            case 98:
                {
                alt100=5;
                }
                break;
            case 99:
                {
                alt100=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalDms.g:5343:3: (enumLiteral_0= '<' )
                    {
                    // InternalDms.g:5343:3: (enumLiteral_0= '<' )
                    // InternalDms.g:5344:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5351:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDms.g:5351:3: (enumLiteral_1= '<=' )
                    // InternalDms.g:5352:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5359:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDms.g:5359:3: (enumLiteral_2= '\\u2264' )
                    // InternalDms.g:5360:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:5367:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDms.g:5367:3: (enumLiteral_3= '>=' )
                    // InternalDms.g:5368:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDms.g:5375:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDms.g:5375:3: (enumLiteral_4= '\\u2265' )
                    // InternalDms.g:5376:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDms.g:5383:3: (enumLiteral_5= '>' )
                    {
                    // InternalDms.g:5383:3: (enumLiteral_5= '>' )
                    // InternalDms.g:5384:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5394:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDms.g:5400:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDms.g:5401:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDms.g:5401:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt101=1;
                }
                break;
            case 100:
                {
                alt101=2;
                }
                break;
            case 101:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalDms.g:5402:3: (enumLiteral_0= '..' )
                    {
                    // InternalDms.g:5402:3: (enumLiteral_0= '..' )
                    // InternalDms.g:5403:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5410:3: (enumLiteral_1= '->' )
                    {
                    // InternalDms.g:5410:3: (enumLiteral_1= '->' )
                    // InternalDms.g:5411:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5418:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDms.g:5418:3: (enumLiteral_2= '=>' )
                    // InternalDms.g:5419:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2());
                      			
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
    // InternalDms.g:5429:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5435:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDms.g:5436:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDms.g:5436:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==76) ) {
                alt102=1;
            }
            else if ( (LA102_0==77) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalDms.g:5437:3: (enumLiteral_0= '+' )
                    {
                    // InternalDms.g:5437:3: (enumLiteral_0= '+' )
                    // InternalDms.g:5438:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5445:3: (enumLiteral_1= '-' )
                    {
                    // InternalDms.g:5445:3: (enumLiteral_1= '-' )
                    // InternalDms.g:5446:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5456:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDms.g:5462:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDms.g:5463:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDms.g:5463:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt103=1;
                }
                break;
            case 102:
                {
                alt103=2;
                }
                break;
            case 103:
                {
                alt103=3;
                }
                break;
            case 104:
                {
                alt103=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalDms.g:5464:3: (enumLiteral_0= '*' )
                    {
                    // InternalDms.g:5464:3: (enumLiteral_0= '*' )
                    // InternalDms.g:5465:4: enumLiteral_0= '*'
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
                    // InternalDms.g:5472:3: (enumLiteral_1= '/' )
                    {
                    // InternalDms.g:5472:3: (enumLiteral_1= '/' )
                    // InternalDms.g:5473:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5480:3: (enumLiteral_2= '**' )
                    {
                    // InternalDms.g:5480:3: (enumLiteral_2= '**' )
                    // InternalDms.g:5481:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:5488:3: (enumLiteral_3= '%' )
                    {
                    // InternalDms.g:5488:3: (enumLiteral_3= '%' )
                    // InternalDms.g:5489:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5499:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDms.g:5505:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDms.g:5506:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDms.g:5506:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt104=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt104=1;
                }
                break;
            case 77:
                {
                alt104=2;
                }
                break;
            case 105:
                {
                alt104=3;
                }
                break;
            case 106:
                {
                alt104=4;
                }
                break;
            case 107:
                {
                alt104=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalDms.g:5507:3: (enumLiteral_0= '+' )
                    {
                    // InternalDms.g:5507:3: (enumLiteral_0= '+' )
                    // InternalDms.g:5508:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5515:3: (enumLiteral_1= '-' )
                    {
                    // InternalDms.g:5515:3: (enumLiteral_1= '-' )
                    // InternalDms.g:5516:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:5523:3: (enumLiteral_2= '!' )
                    {
                    // InternalDms.g:5523:3: (enumLiteral_2= '!' )
                    // InternalDms.g:5524:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:5531:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDms.g:5531:3: (enumLiteral_3= 'NOT' )
                    // InternalDms.g:5532:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDms.g:5539:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDms.g:5539:3: (enumLiteral_4= 'not' )
                    // InternalDms.g:5540:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDms
    public final void synpred1_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:2711:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDms.g:2711:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDms.g:2711:6: ( () ( ( ruleOpOr ) ) )
        // InternalDms.g:2712:6: () ( ( ruleOpOr ) )
        {
        // InternalDms.g:2712:6: ()
        // InternalDms.g:2713:6: 
        {
        }

        // InternalDms.g:2714:6: ( ( ruleOpOr ) )
        // InternalDms.g:2715:7: ( ruleOpOr )
        {
        // InternalDms.g:2715:7: ( ruleOpOr )
        // InternalDms.g:2716:8: ruleOpOr
        {
        pushFollow(FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalDms

    // $ANTLR start synpred2_InternalDms
    public final void synpred2_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:2799:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDms.g:2799:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDms.g:2799:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDms.g:2800:6: () ( ( ruleOpAnd ) )
        {
        // InternalDms.g:2800:6: ()
        // InternalDms.g:2801:6: 
        {
        }

        // InternalDms.g:2802:6: ( ( ruleOpAnd ) )
        // InternalDms.g:2803:7: ( ruleOpAnd )
        {
        // InternalDms.g:2803:7: ( ruleOpAnd )
        // InternalDms.g:2804:8: ruleOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalDms

    // $ANTLR start synpred3_InternalDms
    public final void synpred3_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:2887:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDms.g:2887:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDms.g:2887:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDms.g:2888:6: () ( ( ruleOpEquality ) )
        {
        // InternalDms.g:2888:6: ()
        // InternalDms.g:2889:6: 
        {
        }

        // InternalDms.g:2890:6: ( ( ruleOpEquality ) )
        // InternalDms.g:2891:7: ( ruleOpEquality )
        {
        // InternalDms.g:2891:7: ( ruleOpEquality )
        // InternalDms.g:2892:8: ruleOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalDms

    // $ANTLR start synpred4_InternalDms
    public final void synpred4_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:2976:6: ( ( () ruleOpInstanceOf ) )
        // InternalDms.g:2976:7: ( () ruleOpInstanceOf )
        {
        // InternalDms.g:2976:7: ( () ruleOpInstanceOf )
        // InternalDms.g:2977:7: () ruleOpInstanceOf
        {
        // InternalDms.g:2977:7: ()
        // InternalDms.g:2978:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDms

    // $ANTLR start synpred5_InternalDms
    public final void synpred5_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3016:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDms.g:3016:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDms.g:3016:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDms.g:3017:7: () ( ( ruleOpCompare ) )
        {
        // InternalDms.g:3017:7: ()
        // InternalDms.g:3018:7: 
        {
        }

        // InternalDms.g:3019:7: ( ( ruleOpCompare ) )
        // InternalDms.g:3020:8: ( ruleOpCompare )
        {
        // InternalDms.g:3020:8: ( ruleOpCompare )
        // InternalDms.g:3021:9: ruleOpCompare
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
    // $ANTLR end synpred5_InternalDms

    // $ANTLR start synpred6_InternalDms
    public final void synpred6_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3135:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDms.g:3135:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDms.g:3135:6: ( () ( ( ruleOpOther ) ) )
        // InternalDms.g:3136:6: () ( ( ruleOpOther ) )
        {
        // InternalDms.g:3136:6: ()
        // InternalDms.g:3137:6: 
        {
        }

        // InternalDms.g:3138:6: ( ( ruleOpOther ) )
        // InternalDms.g:3139:7: ( ruleOpOther )
        {
        // InternalDms.g:3139:7: ( ruleOpOther )
        // InternalDms.g:3140:8: ruleOpOther
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
    // $ANTLR end synpred6_InternalDms

    // $ANTLR start synpred7_InternalDms
    public final void synpred7_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3223:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDms.g:3223:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDms.g:3223:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDms.g:3224:6: () ( ( ruleOpAdd ) )
        {
        // InternalDms.g:3224:6: ()
        // InternalDms.g:3225:6: 
        {
        }

        // InternalDms.g:3226:6: ( ( ruleOpAdd ) )
        // InternalDms.g:3227:7: ( ruleOpAdd )
        {
        // InternalDms.g:3227:7: ( ruleOpAdd )
        // InternalDms.g:3228:8: ruleOpAdd
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
    // $ANTLR end synpred7_InternalDms

    // $ANTLR start synpred8_InternalDms
    public final void synpred8_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3311:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDms.g:3311:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDms.g:3311:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDms.g:3312:6: () ( ( ruleOpMulti ) )
        {
        // InternalDms.g:3312:6: ()
        // InternalDms.g:3313:6: 
        {
        }

        // InternalDms.g:3314:6: ( ( ruleOpMulti ) )
        // InternalDms.g:3315:7: ( ruleOpMulti )
        {
        // InternalDms.g:3315:7: ( ruleOpMulti )
        // InternalDms.g:3316:8: ruleOpMulti
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
    // $ANTLR end synpred8_InternalDms

    // $ANTLR start synpred9_InternalDms
    public final void synpred9_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3474:5: ( ( () ruleOpCast ) )
        // InternalDms.g:3474:6: ( () ruleOpCast )
        {
        // InternalDms.g:3474:6: ( () ruleOpCast )
        // InternalDms.g:3475:6: () ruleOpCast
        {
        // InternalDms.g:3475:6: ()
        // InternalDms.g:3476:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalDms

    // $ANTLR start synpred10_InternalDms
    public final void synpred10_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3571:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDms.g:3571:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDms.g:3571:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDms.g:3572:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDms.g:3572:7: ()
        // InternalDms.g:3573:7: 
        {
        }

        match(input,50,FOLLOW_3); if (state.failed) return ;
        // InternalDms.g:3575:7: ( ( RULE_ID ) )
        // InternalDms.g:3576:8: ( RULE_ID )
        {
        // InternalDms.g:3576:8: ( RULE_ID )
        // InternalDms.g:3577:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_44); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDms

    // $ANTLR start synpred11_InternalDms
    public final void synpred11_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3640:6: ( ( () '.' ) )
        // InternalDms.g:3640:7: ( () '.' )
        {
        // InternalDms.g:3640:7: ( () '.' )
        // InternalDms.g:3641:7: () '.'
        {
        // InternalDms.g:3641:7: ()
        // InternalDms.g:3642:7: 
        {
        }

        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDms

    // $ANTLR start synpred12_InternalDms
    public final void synpred12_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3676:8: ( ( '(' ) )
        // InternalDms.g:3676:9: ( '(' )
        {
        // InternalDms.g:3676:9: ( '(' )
        // InternalDms.g:3677:9: '('
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDms

    // $ANTLR start synpred13_InternalDms
    public final void synpred13_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3863:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDms.g:3863:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDms.g:3863:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDms.g:3864:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDms.g:3864:5: ()
        // InternalDms.g:3865:5: 
        {
        }

        match(input,64,FOLLOW_3); if (state.failed) return ;
        // InternalDms.g:3867:5: ( ( RULE_ID ) )
        // InternalDms.g:3868:6: ( RULE_ID )
        {
        // InternalDms.g:3868:6: ( RULE_ID )
        // InternalDms.g:3869:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_9); if (state.failed) return ;

        }


        }

        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDms

    // $ANTLR start synpred14_InternalDms
    public final void synpred14_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4022:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )
        // InternalDms.g:
        {
        if ( input.LA(1)==RULE_ID||(input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_STRING)||input.LA(1)==19||(input.LA(1)>=52 && input.LA(1)<=60)||input.LA(1)==64||(input.LA(1)>=68 && input.LA(1)<=73)||(input.LA(1)>=76 && input.LA(1)<=77)||(input.LA(1)>=105 && input.LA(1)<=107) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred14_InternalDms

    // $ANTLR start synpred15_InternalDms
    public final void synpred15_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4273:5: ( ( '(' ) )
        // InternalDms.g:4273:6: ( '(' )
        {
        // InternalDms.g:4273:6: ( '(' )
        // InternalDms.g:4274:6: '('
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDms

    // $ANTLR start synpred16_InternalDms
    public final void synpred16_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4498:5: ( 'else' )
        // InternalDms.g:4498:6: 'else'
        {
        match(input,62,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalDms

    // Delegated rules

    public final boolean synpred8_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA60 dfa60 = new DFA60(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\150\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\4\1\5\1\2\1\0\1\7\1\6\1\3\1\1\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\1\13\uffff\1\1\3\uffff\3\1\1\uffff\6\1\1\uffff\2\1\6\uffff\1\1\2\uffff\1\2\1\3\3\1\12\uffff\3\1\1\uffff\3\1\10\uffff\2\1\1\uffff\2\1\4\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2973:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDms()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDms()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\6\uffff\1\13\5\uffff";
    static final String dfa_9s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_10s = "\1\111\5\uffff\1\150\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\10";
    static final String dfa_12s = "\1\0\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\4\uffff\2\1\10\uffff\1\5\40\uffff\2\2\2\3\2\4\2\7\1\10\3\uffff\1\11\3\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\5\13\12\uffff\1\12\1\13\3\uffff\3\13\1\uffff\6\13\1\uffff\2\13\6\uffff\1\13\2\uffff\6\13\11\uffff\3\13\1\uffff\3\13\10\uffff\2\13\1\uffff\2\13\4\uffff\24\13",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3780:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA72_0>=RULE_NATURAL && LA72_0<=RULE_STRING)||(LA72_0>=68 && LA72_0<=73)) ) {s = 1;}

                        else if ( ((LA72_0>=52 && LA72_0<=53)) ) {s = 2;}

                        else if ( ((LA72_0>=54 && LA72_0<=55)) ) {s = 3;}

                        else if ( ((LA72_0>=56 && LA72_0<=57)) ) {s = 4;}

                        else if ( (LA72_0==19) ) {s = 5;}

                        else if ( (LA72_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA72_0>=58 && LA72_0<=59)) ) {s = 7;}

                        else if ( (LA72_0==60) ) {s = 8;}

                        else if ( (LA72_0==64) && (synpred13_InternalDms())) {s = 9;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\115\uffff";
    static final String dfa_15s = "\1\32\114\uffff";
    static final String dfa_16s = "\1\4\3\0\111\uffff";
    static final String dfa_17s = "\1\153\3\0\111\uffff";
    static final String dfa_18s = "\4\uffff\26\1\1\2\62\uffff";
    static final String dfa_19s = "\1\0\1\1\1\2\1\3\111\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\4\32\1\14\1\13\10\uffff\1\25\1\32\3\uffff\3\32\1\uffff\6\32\1\uffff\2\32\6\uffff\1\32\2\uffff\5\32\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\3\32\1\31\3\32\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\1\uffff\2\32\4\uffff\24\32\1\4\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4021:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_0 = input.LA(1);

                         
                        int index76_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA76_0==RULE_ID) ) {s = 1;}

                        else if ( (LA76_0==76) ) {s = 2;}

                        else if ( (LA76_0==77) ) {s = 3;}

                        else if ( (LA76_0==105) && (synpred14_InternalDms())) {s = 4;}

                        else if ( (LA76_0==106) && (synpred14_InternalDms())) {s = 5;}

                        else if ( (LA76_0==107) && (synpred14_InternalDms())) {s = 6;}

                        else if ( (LA76_0==68) && (synpred14_InternalDms())) {s = 7;}

                        else if ( (LA76_0==69) && (synpred14_InternalDms())) {s = 8;}

                        else if ( (LA76_0==70) && (synpred14_InternalDms())) {s = 9;}

                        else if ( (LA76_0==71) && (synpred14_InternalDms())) {s = 10;}

                        else if ( (LA76_0==RULE_STRING) && (synpred14_InternalDms())) {s = 11;}

                        else if ( (LA76_0==RULE_NATURAL) && (synpred14_InternalDms())) {s = 12;}

                        else if ( (LA76_0==72) && (synpred14_InternalDms())) {s = 13;}

                        else if ( (LA76_0==73) && (synpred14_InternalDms())) {s = 14;}

                        else if ( (LA76_0==52) && (synpred14_InternalDms())) {s = 15;}

                        else if ( (LA76_0==53) && (synpred14_InternalDms())) {s = 16;}

                        else if ( (LA76_0==54) && (synpred14_InternalDms())) {s = 17;}

                        else if ( (LA76_0==55) && (synpred14_InternalDms())) {s = 18;}

                        else if ( (LA76_0==56) && (synpred14_InternalDms())) {s = 19;}

                        else if ( (LA76_0==57) && (synpred14_InternalDms())) {s = 20;}

                        else if ( (LA76_0==19) && (synpred14_InternalDms())) {s = 21;}

                        else if ( (LA76_0==58) && (synpred14_InternalDms())) {s = 22;}

                        else if ( (LA76_0==59) && (synpred14_InternalDms())) {s = 23;}

                        else if ( (LA76_0==60) && (synpred14_InternalDms())) {s = 24;}

                        else if ( (LA76_0==64) && (synpred14_InternalDms())) {s = 25;}

                        else if ( (LA76_0==EOF||(LA76_0>=RULE_PLAIN_TEXT_ONLY && LA76_0<=RULE_PLAIN_TEXT_END)||LA76_0==20||(LA76_0>=24 && LA76_0<=26)||(LA76_0>=28 && LA76_0<=33)||(LA76_0>=35 && LA76_0<=36)||LA76_0==43||(LA76_0>=46 && LA76_0<=50)||(LA76_0>=61 && LA76_0<=63)||(LA76_0>=65 && LA76_0<=67)||(LA76_0>=79 && LA76_0<=80)||(LA76_0>=85 && LA76_0<=104)) ) {s = 26;}

                         
                        input.seek(index76_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000183D4460062L,0x0000000000060000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000183D4460002L,0x0000000000060000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000183D4440002L,0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003D5000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1FF0000000080610L,0x00000E00000033F1L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000023000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400800060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001A03000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080062L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000080062L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000062L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000080062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000062L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001183D5440000L,0x0000000000060000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000880060L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L,0x0000000000180000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000800060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020800060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C03D5000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000803D5000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000001E00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000038000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000C00000000002L,0x0000000FC0000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x000001C000000008L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000000080002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1FF0000000180610L,0x00000E00000033F1L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1FF0000000080612L,0x00000E00000033F1L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000200L,0x0000000000003000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});

}