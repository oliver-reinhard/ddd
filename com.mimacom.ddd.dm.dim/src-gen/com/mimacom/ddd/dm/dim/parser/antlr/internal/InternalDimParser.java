package com.mimacom.ddd.dm.dim.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDimParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'import'", "'function'", "'('", "')'", "':'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'redefines'", "'archetype'", "'enumeration'", "','", "'abstract'", "'root'", "'relationship'", "'detail'", "'extends'", "'derived'", "'composite'", "'key'", "'returns'", "'application'", "'service'", "'raises'", "'precondition'", "'postcondition'", "'exception'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'.'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'..'", "'*'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'reference'", "'inverse'", "'synchronous'", "'async'", "'in'", "'out'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
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
    public static final int RULE_PLAIN_TEXT_MIDDLE=7;
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
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
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


        public InternalDimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDim.g"; }



     	private DimGrammarAccess grammarAccess;

        public InternalDimParser(TokenStream input, DimGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DDomain";
       	}

       	@Override
       	protected DimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDDomain"
    // InternalDim.g:65:1: entryRuleDDomain returns [EObject current=null] : iv_ruleDDomain= ruleDDomain EOF ;
    public final EObject entryRuleDDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomain = null;


        try {
            // InternalDim.g:65:48: (iv_ruleDDomain= ruleDDomain EOF )
            // InternalDim.g:66:2: iv_ruleDDomain= ruleDDomain EOF
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
    // InternalDim.g:72:1: ruleDDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_aggregates_8_0 = null;

        EObject lv_applications_9_0 = null;

        EObject lv_actors_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* ) )
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* )
            {
            // InternalDim.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* )
            // InternalDim.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainAccess().getDomainKeyword_0());
              		
            }
            // InternalDim.g:84:3: ( (lv_name_1_0= ruleDQualifiedName ) )
            // InternalDim.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            {
            // InternalDim.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            // InternalDim.g:86:5: lv_name_1_0= ruleDQualifiedName
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

            // InternalDim.g:103:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDim.g:104:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDDomainAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:108:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:109:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:109:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:110:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDDomainAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDim.g:127:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLAIN_TEXT_ONLY && LA2_0<=RULE_PLAIN_TEXT_START)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDim.g:128:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:128:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:129:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainRule());
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

            // InternalDim.g:146:3: ( (lv_imports_5_0= ruleDImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDim.g:147:4: (lv_imports_5_0= ruleDImport )
            	    {
            	    // InternalDim.g:147:4: (lv_imports_5_0= ruleDImport )
            	    // InternalDim.g:148:5: lv_imports_5_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainAccess().getImportsDImportParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_5_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_5_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDim.g:165:3: ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )*
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case 28:
                case 30:
                case 31:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=2;
                    }
                    break;
                case 24:
                    {
                    alt4=3;
                    }
                    break;
                case 42:
                    {
                    alt4=4;
                    }
                    break;
                case 43:
                case 84:
                case 85:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalDim.g:166:4: ( (lv_types_6_0= ruleDType ) )
            	    {
            	    // InternalDim.g:166:4: ( (lv_types_6_0= ruleDType ) )
            	    // InternalDim.g:167:5: (lv_types_6_0= ruleDType )
            	    {
            	    // InternalDim.g:167:5: (lv_types_6_0= ruleDType )
            	    // InternalDim.g:168:6: lv_types_6_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getTypesDTypeParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_types_6_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_6_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:186:4: ( (lv_functions_7_0= ruleDFunction ) )
            	    {
            	    // InternalDim.g:186:4: ( (lv_functions_7_0= ruleDFunction ) )
            	    // InternalDim.g:187:5: (lv_functions_7_0= ruleDFunction )
            	    {
            	    // InternalDim.g:187:5: (lv_functions_7_0= ruleDFunction )
            	    // InternalDim.g:188:6: lv_functions_7_0= ruleDFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getFunctionsDFunctionParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_functions_7_0=ruleDFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"functions",
            	      							lv_functions_7_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DFunction");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDim.g:206:4: ( (lv_aggregates_8_0= ruleDAggregate ) )
            	    {
            	    // InternalDim.g:206:4: ( (lv_aggregates_8_0= ruleDAggregate ) )
            	    // InternalDim.g:207:5: (lv_aggregates_8_0= ruleDAggregate )
            	    {
            	    // InternalDim.g:207:5: (lv_aggregates_8_0= ruleDAggregate )
            	    // InternalDim.g:208:6: lv_aggregates_8_0= ruleDAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getAggregatesDAggregateParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_aggregates_8_0=ruleDAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_8_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DAggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDim.g:226:4: ( (lv_applications_9_0= ruleDExistingApplication ) )
            	    {
            	    // InternalDim.g:226:4: ( (lv_applications_9_0= ruleDExistingApplication ) )
            	    // InternalDim.g:227:5: (lv_applications_9_0= ruleDExistingApplication )
            	    {
            	    // InternalDim.g:227:5: (lv_applications_9_0= ruleDExistingApplication )
            	    // InternalDim.g:228:6: lv_applications_9_0= ruleDExistingApplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getApplicationsDExistingApplicationParserRuleCall_5_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_applications_9_0=ruleDExistingApplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"applications",
            	      							lv_applications_9_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DExistingApplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDim.g:246:4: ( (lv_actors_10_0= ruleDService ) )
            	    {
            	    // InternalDim.g:246:4: ( (lv_actors_10_0= ruleDService ) )
            	    // InternalDim.g:247:5: (lv_actors_10_0= ruleDService )
            	    {
            	    // InternalDim.g:247:5: (lv_actors_10_0= ruleDService )
            	    // InternalDim.g:248:6: lv_actors_10_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getActorsDServiceParserRuleCall_5_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_actors_10_0=ruleDService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actors",
            	      							lv_actors_10_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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
    // $ANTLR end "ruleDDomain"


    // $ANTLR start "entryRuleDImport"
    // InternalDim.g:270:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDim.g:270:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDim.g:271:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDim.g:277:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:283:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDim.g:284:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDim.g:284:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDim.g:285:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDim.g:289:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDim.g:290:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDim.g:290:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDim.g:291:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
    // InternalDim.g:312:1: entryRuleDFunction returns [EObject current=null] : iv_ruleDFunction= ruleDFunction EOF ;
    public final EObject entryRuleDFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunction = null;


        try {
            // InternalDim.g:312:50: (iv_ruleDFunction= ruleDFunction EOF )
            // InternalDim.g:313:2: iv_ruleDFunction= ruleDFunction EOF
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
    // InternalDim.g:319:1: ruleDFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) ;
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
            // InternalDim.g:325:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ) )
            // InternalDim.g:326:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            {
            // InternalDim.g:326:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? )
            // InternalDim.g:327:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalDim.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:333:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDFunctionAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDFunctionAccess().getColonKeyword_4());
              		
            }
            // InternalDim.g:361:3: ( (otherlv_5= RULE_ID ) )
            // InternalDim.g:362:4: (otherlv_5= RULE_ID )
            {
            // InternalDim.g:362:4: (otherlv_5= RULE_ID )
            // InternalDim.g:363:5: otherlv_5= RULE_ID
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

            // InternalDim.g:374:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDim.g:375:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:375:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalDim.g:376:5: lv_multiplicity_6_0= ruleDMultiplicity
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
    // InternalDim.g:397:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalDim.g:397:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalDim.g:398:2: iv_ruleDAggregate= ruleDAggregate EOF
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
    // InternalDim.g:404:1: ruleDAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:410:2: ( ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) )
            // InternalDim.g:411:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            {
            // InternalDim.g:411:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            // InternalDim.g:412:3: () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}'
            {
            // InternalDim.g:412:3: ()
            // InternalDim.g:413:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDAggregateAccess().getAggregateKeyword_1());
              		
            }
            // InternalDim.g:423:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PLAIN_TEXT_ONLY && LA6_0<=RULE_PLAIN_TEXT_START)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDim.g:424:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDim.g:424:4: (lv_description_2_0= ruleDRichText )
                    // InternalDim.g:425:5: lv_description_2_0= ruleDRichText
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

            otherlv_3=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:446:3: ( (lv_types_4_0= ruleDType ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28||(LA7_0>=30 && LA7_0<=31)||(LA7_0>=33 && LA7_0<=36)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDim.g:447:4: (lv_types_4_0= ruleDType )
            	    {
            	    // InternalDim.g:447:4: (lv_types_4_0= ruleDType )
            	    // InternalDim.g:448:5: lv_types_4_0= ruleDType
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
            	      						"com.mimacom.ddd.dm.dim.Dim.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:473:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalDim.g:473:46: (iv_ruleDType= ruleDType EOF )
            // InternalDim.g:474:2: iv_ruleDType= ruleDType EOF
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
    // InternalDim.g:480:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DRootType_3= ruleDRootType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DPrimitiveArchetype_1 = null;

        EObject this_DEnumeration_2 = null;

        EObject this_DRootType_3 = null;

        EObject this_DRelationship_4 = null;

        EObject this_DDetailType_5 = null;



        	enterRule();

        try {
            // InternalDim.g:486:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DRootType_3= ruleDRootType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) )
            // InternalDim.g:487:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DRootType_3= ruleDRootType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
            {
            // InternalDim.g:487:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DRootType_3= ruleDRootType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt8=5;
                    }
                    break;
                case 36:
                    {
                    alt8=6;
                    }
                    break;
                case 34:
                    {
                    alt8=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDim.g:488:3: this_DPrimitive_0= ruleDPrimitive
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
                    // InternalDim.g:497:3: this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDPrimitiveArchetypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitiveArchetype_1=ruleDPrimitiveArchetype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitiveArchetype_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDim.g:506:3: this_DEnumeration_2= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEnumerationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_2=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:515:3: this_DRootType_3= ruleDRootType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRootTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRootType_3=ruleDRootType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRootType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDim.g:524:3: this_DRelationship_4= ruleDRelationship
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRelationshipParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRelationship_4=ruleDRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRelationship_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDim.g:533:3: this_DDetailType_5= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDDetailTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_5=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_5;
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
    // InternalDim.g:545:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDim.g:545:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDim.g:546:2: iv_ruleDConstraint= ruleDConstraint EOF
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
    // InternalDim.g:552:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        EObject lv_condition_5_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:558:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDim.g:559:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDim.g:559:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDim.g:560:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (lv_condition_5_0= ruleDExpression ) ) ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDim.g:564:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:565:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:565:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:566:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            // InternalDim.g:582:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDim.g:583:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:587:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:588:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:588:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:589:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDConstraintAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDConstraintRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalDim.g:610:3: ( (lv_condition_5_0= ruleDExpression ) )
            // InternalDim.g:611:4: (lv_condition_5_0= ruleDExpression )
            {
            // InternalDim.g:611:4: (lv_condition_5_0= ruleDExpression )
            // InternalDim.g:612:5: lv_condition_5_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getConditionDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_condition_5_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConstraintRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_5_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:629:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_PLAIN_TEXT_ONLY && LA10_0<=RULE_PLAIN_TEXT_START)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDim.g:630:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDim.g:630:4: (lv_description_6_0= ruleDRichText )
                    // InternalDim.g:631:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConstraintAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConstraintRule());
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
    // $ANTLR end "ruleDConstraint"


    // $ANTLR start "entryRuleDPrimitive"
    // InternalDim.g:652:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalDim.g:652:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalDim.g:653:2: iv_ruleDPrimitive= ruleDPrimitive EOF
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
    // InternalDim.g:659:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' ) ;
    public final EObject ruleDPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_description_6_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalDim.g:665:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' ) )
            // InternalDim.g:666:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' )
            {
            // InternalDim.g:666:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}' )
            // InternalDim.g:667:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) ( (lv_description_6_0= ruleDRichText ) )? otherlv_7= '{' ( (lv_constraints_8_0= ruleDConstraint ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalDim.g:671:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:672:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:672:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:673:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalDim.g:689:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDim.g:690:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:694:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:695:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:695:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:696:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDPrimitiveAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDPrimitiveRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_3());
              		
            }
            // InternalDim.g:717:3: ( (otherlv_5= RULE_ID ) )
            // InternalDim.g:718:4: (otherlv_5= RULE_ID )
            {
            // InternalDim.g:718:4: (otherlv_5= RULE_ID )
            // InternalDim.g:719:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDPrimitiveCrossReference_4_0());
              				
            }

            }


            }

            // InternalDim.g:730:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_PLAIN_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDim.g:731:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDim.g:731:4: (lv_description_6_0= ruleDRichText )
                    // InternalDim.g:732:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
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

            otherlv_7=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:753:3: ( (lv_constraints_8_0= ruleDConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDim.g:754:4: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:754:4: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalDim.g:755:5: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_constraints_8_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_8_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDPrimitiveAccess().getRightCurlyBracketKeyword_8());
              		
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


    // $ANTLR start "entryRuleDPrimitiveArchetype"
    // InternalDim.g:780:1: entryRuleDPrimitiveArchetype returns [EObject current=null] : iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF ;
    public final EObject entryRuleDPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitiveArchetype = null;


        try {
            // InternalDim.g:780:60: (iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF )
            // InternalDim.g:781:2: iv_ruleDPrimitiveArchetype= ruleDPrimitiveArchetype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimitiveArchetypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimitiveArchetype=ruleDPrimitiveArchetype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimitiveArchetype; 
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
    // $ANTLR end "entryRuleDPrimitiveArchetype"


    // $ANTLR start "ruleDPrimitiveArchetype"
    // InternalDim.g:787:1: ruleDPrimitiveArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDPrimitiveArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_4_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:793:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) )
            // InternalDim.g:794:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            {
            // InternalDim.g:794:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            // InternalDim.g:795:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDim.g:799:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:800:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:800:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:801:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDPrimitiveArchetypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveArchetypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDim.g:817:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDim.g:818:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDPrimitiveArchetypeAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:822:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:823:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:823:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:824:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDPrimitiveArchetypeAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDPrimitiveArchetypeRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDim.g:841:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLAIN_TEXT_ONLY && LA15_0<=RULE_PLAIN_TEXT_START)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDim.g:842:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:842:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:843:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveArchetypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveArchetypeRule());
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

            otherlv_5=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:864:3: ( (lv_constraints_6_0= ruleDConstraint ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDim.g:865:4: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:865:4: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDim.g:866:5: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveArchetypeAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDPrimitiveArchetypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDPrimitiveArchetype"


    // $ANTLR start "entryRuleDEnumeration"
    // InternalDim.g:891:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalDim.g:891:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalDim.g:892:2: iv_ruleDEnumeration= ruleDEnumeration EOF
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
    // InternalDim.g:898:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) ;
    public final EObject ruleDEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_description_4_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_literals_8_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalDim.g:904:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' ) )
            // InternalDim.g:905:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            {
            // InternalDim.g:905:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}' )
            // InternalDim.g:906:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )? ( (lv_constraints_9_0= ruleDConstraint ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalDim.g:910:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:911:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:911:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:912:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            // InternalDim.g:928:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDim.g:929:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDEnumerationAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDim.g:933:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:934:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:934:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:935:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDEnumerationAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDEnumerationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalDim.g:952:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_PLAIN_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDim.g:953:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:953:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:954:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
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

            otherlv_5=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:975:3: ( ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDim.g:976:4: ( (lv_literals_6_0= ruleDLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )*
                    {
                    // InternalDim.g:976:4: ( (lv_literals_6_0= ruleDLiteral ) )
                    // InternalDim.g:977:5: (lv_literals_6_0= ruleDLiteral )
                    {
                    // InternalDim.g:977:5: (lv_literals_6_0= ruleDLiteral )
                    // InternalDim.g:978:6: lv_literals_6_0= ruleDLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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
                      							"com.mimacom.ddd.dm.dim.Dim.DLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:995:4: (otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==32) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDim.g:996:5: otherlv_7= ',' ( (lv_literals_8_0= ruleDLiteral ) )
                    	    {
                    	    otherlv_7=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getDEnumerationAccess().getCommaKeyword_5_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1000:5: ( (lv_literals_8_0= ruleDLiteral ) )
                    	    // InternalDim.g:1001:6: (lv_literals_8_0= ruleDLiteral )
                    	    {
                    	    // InternalDim.g:1001:6: (lv_literals_8_0= ruleDLiteral )
                    	    // InternalDim.g:1002:7: lv_literals_8_0= ruleDLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_literals_8_0=ruleDLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_8_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DLiteral");
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

            // InternalDim.g:1021:3: ( (lv_constraints_9_0= ruleDConstraint ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDim.g:1022:4: (lv_constraints_9_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1022:4: (lv_constraints_9_0= ruleDConstraint )
            	    // InternalDim.g:1023:5: lv_constraints_9_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_constraints_9_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_9_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDEnumerationAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalDim.g:1048:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalDim.g:1048:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalDim.g:1049:2: iv_ruleDLiteral= ruleDLiteral EOF
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
    // InternalDim.g:1055:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1061:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalDim.g:1062:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1062:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalDim.g:1063:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* ( (lv_description_3_0= ruleDRichText ) )?
            {
            // InternalDim.g:1063:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1064:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1064:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1065:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            // InternalDim.g:1081:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDim.g:1082:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDLiteralAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1086:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1087:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1087:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1088:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDLiteralAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDLiteralRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalDim.g:1105:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_PLAIN_TEXT_ONLY && LA23_0<=RULE_PLAIN_TEXT_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDim.g:1106:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDim.g:1106:4: (lv_description_3_0= ruleDRichText )
                    // InternalDim.g:1107:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDLiteralAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDLiteralRule());
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
    // InternalDim.g:1128:1: entryRuleDRootType returns [EObject current=null] : iv_ruleDRootType= ruleDRootType EOF ;
    public final EObject entryRuleDRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRootType = null;


        try {
            // InternalDim.g:1128:50: (iv_ruleDRootType= ruleDRootType EOF )
            // InternalDim.g:1129:2: iv_ruleDRootType= ruleDRootType EOF
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
    // InternalDim.g:1135:1: ruleDRootType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRootType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1141:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDim.g:1142:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDim.g:1142:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDim.g:1143:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDim.g:1143:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDim.g:1144:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1144:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1145:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
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
    // InternalDim.g:1176:1: entryRuleDRelationship returns [EObject current=null] : iv_ruleDRelationship= ruleDRelationship EOF ;
    public final EObject entryRuleDRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationship = null;


        try {
            // InternalDim.g:1176:54: (iv_ruleDRelationship= ruleDRelationship EOF )
            // InternalDim.g:1177:2: iv_ruleDRelationship= ruleDRelationship EOF
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
    // InternalDim.g:1183:1: ruleDRelationship returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1189:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDim.g:1190:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDim.g:1190:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDim.g:1191:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDim.g:1191:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDim.g:1192:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1192:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1193:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
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
    // InternalDim.g:1224:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalDim.g:1224:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalDim.g:1225:2: iv_ruleDDetailType= ruleDDetailType EOF
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
    // InternalDim.g:1231:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1237:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDim.g:1238:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDim.g:1238:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDim.g:1239:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDim.g:1239:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDim.g:1240:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1240:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1241:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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
    // InternalDim.g:1273:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_description_5_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1279:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) )
            // InternalDim.g:1280:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            {
            // InternalDim.g:1280:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            // InternalDim.g:1281:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}'
            {
            // InternalDim.g:1281:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1282:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1282:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1283:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            // InternalDim.g:1299:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDim.g:1300:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1304:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1305:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1305:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1306:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDComplexTypeAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalDim.g:1323:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDim.g:1324:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDim.g:1328:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:1329:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:1329:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:1330:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1342:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_PLAIN_TEXT_ONLY && LA29_0<=RULE_PLAIN_TEXT_START)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDim.g:1343:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:1343:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:1344:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
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

            otherlv_6=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:1365:3: ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==36||(LA30_0>=38 && LA30_0<=39)||(LA30_0>=82 && LA30_0<=83)) ) {
                    alt30=1;
                }
                else if ( (LA30_0==27) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDim.g:1366:4: ( (lv_features_7_0= ruleDFeature ) )
            	    {
            	    // InternalDim.g:1366:4: ( (lv_features_7_0= ruleDFeature ) )
            	    // InternalDim.g:1367:5: (lv_features_7_0= ruleDFeature )
            	    {
            	    // InternalDim.g:1367:5: (lv_features_7_0= ruleDFeature )
            	    // InternalDim.g:1368:6: lv_features_7_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesDFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_features_7_0=ruleDFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_7_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:1386:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1386:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    // InternalDim.g:1387:5: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1387:5: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalDim.g:1388:6: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_constraints_8_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_8_0,
            	      							"com.mimacom.ddd.dm.dim.Dim.DConstraint");
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

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDComplexTypeAccess().getRightCurlyBracketKeyword_6());
              		
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
    // InternalDim.g:1414:1: entryRuleDFeature returns [EObject current=null] : iv_ruleDFeature= ruleDFeature EOF ;
    public final EObject entryRuleDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFeature = null;


        try {
            // InternalDim.g:1414:49: (iv_ruleDFeature= ruleDFeature EOF )
            // InternalDim.g:1415:2: iv_ruleDFeature= ruleDFeature EOF
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
    // InternalDim.g:1421:1: ruleDFeature returns [EObject current=null] : (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) ;
    public final EObject ruleDFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DAssociation_0 = null;

        EObject this_DAttribute_1 = null;

        EObject this_DQuery_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1427:2: ( (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) )
            // InternalDim.g:1428:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            {
            // InternalDim.g:1428:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalDim.g:1429:3: this_DAssociation_0= ruleDAssociation
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
                    // InternalDim.g:1438:3: this_DAttribute_1= ruleDAttribute
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
                    // InternalDim.g:1447:3: this_DQuery_2= ruleDQuery
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
    // InternalDim.g:1459:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalDim.g:1459:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalDim.g:1460:2: iv_ruleDAssociation= ruleDAssociation EOF
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
    // InternalDim.g:1466:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_aliases_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_multiplicity_9_0 = null;

        EObject lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1472:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalDim.g:1473:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1473:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalDim.g:1474:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalDim.g:1474:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDim.g:1475:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalDim.g:1475:4: (lv_derived_0_0= 'derived' )
                    // InternalDim.g:1476:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,38,FOLLOW_28); if (state.failed) return current;
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

            // InternalDim.g:1488:3: ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39||LA33_0==82) ) {
                alt33=1;
            }
            else if ( (LA33_0==83) ) {
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
                    // InternalDim.g:1489:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    {
                    // InternalDim.g:1489:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    // InternalDim.g:1490:5: (lv_kind_1_0= ruleDAssociationKind )
                    {
                    // InternalDim.g:1490:5: (lv_kind_1_0= ruleDAssociationKind )
                    // InternalDim.g:1491:6: lv_kind_1_0= ruleDAssociationKind
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
                      							"com.mimacom.ddd.dm.dim.Dim.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:1509:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalDim.g:1509:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalDim.g:1510:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalDim.g:1510:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) )
                    // InternalDim.g:1511:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    {
                    // InternalDim.g:1511:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    // InternalDim.g:1512:7: lv_kind_2_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_29);
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
                      								"com.mimacom.ddd.dm.dim.Dim.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDAssociationAccess().getCompositeKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1535:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDim.g:1536:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDim.g:1536:4: (lv_name_4_0= RULE_ID )
            // InternalDim.g:1537:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            // InternalDim.g:1553:3: (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDim.g:1554:4: otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDim.g:1558:4: ( (lv_aliases_6_0= RULE_ID ) )
            	    // InternalDim.g:1559:5: (lv_aliases_6_0= RULE_ID )
            	    {
            	    // InternalDim.g:1559:5: (lv_aliases_6_0= RULE_ID )
            	    // InternalDim.g:1560:6: lv_aliases_6_0= RULE_ID
            	    {
            	    lv_aliases_6_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_6_0, grammarAccess.getDAssociationAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDAssociationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_6_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDAssociationAccess().getColonKeyword_4());
              		
            }
            // InternalDim.g:1581:3: ( (otherlv_8= RULE_ID ) )
            // InternalDim.g:1582:4: (otherlv_8= RULE_ID )
            {
            // InternalDim.g:1582:4: (otherlv_8= RULE_ID )
            // InternalDim.g:1583:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getDAssociationAccess().getTypeDRootTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDim.g:1594:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDim.g:1595:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1595:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDim.g:1596:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_multiplicity_9_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_9_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1613:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_PLAIN_TEXT_ONLY && LA36_0<=RULE_PLAIN_TEXT_START)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDim.g:1614:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDim.g:1614:4: (lv_description_10_0= ruleDRichText )
                    // InternalDim.g:1615:5: lv_description_10_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getDescriptionDRichTextParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_10_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_10_0,
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
    // InternalDim.g:1636:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalDim.g:1636:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalDim.g:1637:2: iv_ruleDAttribute= ruleDAttribute EOF
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
    // InternalDim.g:1643:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_detail_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_key_7_0=null;
        EObject lv_multiplicity_6_0 = null;

        EObject lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1649:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDim.g:1650:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1650:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDim.g:1651:3: ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalDim.g:1651:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDim.g:1652:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalDim.g:1652:4: (lv_detail_0_0= 'detail' )
                    // InternalDim.g:1653:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
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

            // InternalDim.g:1665:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDim.g:1666:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            // InternalDim.g:1666:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:1667:5: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:1667:5: (lv_name_1_0= RULE_ID )
            // InternalDim.g:1668:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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

            // InternalDim.g:1684:4: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==18) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDim.g:1685:5: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getAliasKeyword_1_1_0());
            	      				
            	    }
            	    // InternalDim.g:1689:5: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:1690:6: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:1690:6: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:1691:7: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_aliases_3_0, grammarAccess.getDAttributeAccess().getAliasesIDTerminalRuleCall_1_1_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDAttributeRule());
            	      							}
            	      							addWithLastConsumed(
            	      								current,
            	      								"aliases",
            	      								lv_aliases_3_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDAttributeAccess().getColonKeyword_1_2());
              			
            }
            // InternalDim.g:1712:4: ( (otherlv_5= RULE_ID ) )
            // InternalDim.g:1713:5: (otherlv_5= RULE_ID )
            {
            // InternalDim.g:1713:5: (otherlv_5= RULE_ID )
            // InternalDim.g:1714:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getTypeDTypeCrossReference_1_3_0());
              					
            }

            }


            }


            }

            // InternalDim.g:1726:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDim.g:1727:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1727:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalDim.g:1728:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_32);
                    lv_multiplicity_6_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
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

            // InternalDim.g:1745:3: ( (lv_key_7_0= 'key' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDim.g:1746:4: (lv_key_7_0= 'key' )
                    {
                    // InternalDim.g:1746:4: (lv_key_7_0= 'key' )
                    // InternalDim.g:1747:5: lv_key_7_0= 'key'
                    {
                    lv_key_7_0=(Token)match(input,40,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_7_0, grammarAccess.getDAttributeAccess().getKeyKeyKeyword_3_0());
                      				
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

            // InternalDim.g:1759:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_PLAIN_TEXT_ONLY && LA41_0<=RULE_PLAIN_TEXT_START)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDim.g:1760:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDim.g:1760:4: (lv_description_8_0= ruleDRichText )
                    // InternalDim.g:1761:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
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
    // $ANTLR end "ruleDAttribute"


    // $ANTLR start "entryRuleDQuery"
    // InternalDim.g:1782:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalDim.g:1782:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalDim.g:1783:2: iv_ruleDQuery= ruleDQuery EOF
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
    // InternalDim.g:1789:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_multiplicity_10_0 = null;

        EObject lv_returns_12_0 = null;

        EObject lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1795:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDim.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDim.g:1797:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDim.g:1797:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1798:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1798:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1799:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
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

            // InternalDim.g:1815:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDim.g:1816:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1820:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1821:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1821:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1822:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDQueryAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDQueryRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:1843:3: ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDim.g:1844:4: ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalDim.g:1844:4: ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    // InternalDim.g:1845:5: (lv_parameters_4_0= ruleDQueryParameter )
                    {
                    // InternalDim.g:1845:5: (lv_parameters_4_0= ruleDQueryParameter )
                    // InternalDim.g:1846:6: lv_parameters_4_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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
                      							"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:1863:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==32) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDim.g:1864:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1868:5: ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    // InternalDim.g:1869:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    {
                    	    // InternalDim.g:1869:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    // InternalDim.g:1870:7: lv_parameters_6_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_parameters_6_0=ruleDQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"com.mimacom.ddd.dm.dim.Dim.DQueryParameter");
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
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDQueryAccess().getColonKeyword_5());
              		
            }
            // InternalDim.g:1897:3: ( (otherlv_9= RULE_ID ) )
            // InternalDim.g:1898:4: (otherlv_9= RULE_ID )
            {
            // InternalDim.g:1898:4: (otherlv_9= RULE_ID )
            // InternalDim.g:1899:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_6_0());
              				
            }

            }


            }

            // InternalDim.g:1910:3: ( (lv_multiplicity_10_0= ruleDMultiplicity ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDim.g:1911:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1911:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    // InternalDim.g:1912:5: lv_multiplicity_10_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    lv_multiplicity_10_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_10_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1929:3: (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDim.g:1930:4: otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDQueryAccess().getReturnsKeyword_8_0());
                      			
                    }
                    // InternalDim.g:1934:4: ( (lv_returns_12_0= ruleDExpression ) )
                    // InternalDim.g:1935:5: (lv_returns_12_0= ruleDExpression )
                    {
                    // InternalDim.g:1935:5: (lv_returns_12_0= ruleDExpression )
                    // InternalDim.g:1936:6: lv_returns_12_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_returns_12_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						set(
                      							current,
                      							"returns",
                      							lv_returns_12_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDim.g:1954:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_PLAIN_TEXT_ONLY && LA47_0<=RULE_PLAIN_TEXT_START)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDim.g:1955:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDim.g:1955:4: (lv_description_13_0= ruleDRichText )
                    // InternalDim.g:1956:5: lv_description_13_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getDescriptionDRichTextParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_13_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_13_0,
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
    // InternalDim.g:1977:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalDim.g:1977:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalDim.g:1978:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
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
    // InternalDim.g:1984:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:1990:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDim.g:1991:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1991:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDim.g:1992:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDim.g:1992:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1993:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1993:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1994:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:2014:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:2015:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:2015:4: (otherlv_2= RULE_ID )
            // InternalDim.g:2016:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDim.g:2027:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDim.g:2028:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2028:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDim.g:2029:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDim.g:2046:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_PLAIN_TEXT_ONLY && LA49_0<=RULE_PLAIN_TEXT_START)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDim.g:2047:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:2047:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:2048:5: lv_description_4_0= ruleDRichText
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
    // InternalDim.g:2069:1: entryRuleDExistingApplication returns [EObject current=null] : iv_ruleDExistingApplication= ruleDExistingApplication EOF ;
    public final EObject entryRuleDExistingApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExistingApplication = null;


        try {
            // InternalDim.g:2069:61: (iv_ruleDExistingApplication= ruleDExistingApplication EOF )
            // InternalDim.g:2070:2: iv_ruleDExistingApplication= ruleDExistingApplication EOF
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
    // InternalDim.g:2076:1: ruleDExistingApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) ;
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
            // InternalDim.g:2082:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) )
            // InternalDim.g:2083:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            {
            // InternalDim.g:2083:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            // InternalDim.g:2084:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExistingApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalDim.g:2088:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2089:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2089:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2090:5: lv_name_1_0= RULE_ID
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

            // InternalDim.g:2106:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_PLAIN_TEXT_ONLY && LA50_0<=RULE_PLAIN_TEXT_START)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDim.g:2107:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDim.g:2107:4: (lv_description_2_0= ruleDRichText )
                    // InternalDim.g:2108:5: lv_description_2_0= ruleDRichText
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

            otherlv_3=(Token)match(input,25,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDExistingApplicationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:2129:3: ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )*
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case 43:
                case 84:
                case 85:
                    {
                    alt51=1;
                    }
                    break;
                case 47:
                    {
                    alt51=2;
                    }
                    break;
                case 28:
                case 30:
                case 31:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt51=3;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // InternalDim.g:2130:4: ( (lv_services_4_0= ruleDService ) )
            	    {
            	    // InternalDim.g:2130:4: ( (lv_services_4_0= ruleDService ) )
            	    // InternalDim.g:2131:5: (lv_services_4_0= ruleDService )
            	    {
            	    // InternalDim.g:2131:5: (lv_services_4_0= ruleDService )
            	    // InternalDim.g:2132:6: lv_services_4_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getServicesDServiceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	      							"com.mimacom.ddd.dm.dim.Dim.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:2150:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    {
            	    // InternalDim.g:2150:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    // InternalDim.g:2151:5: (lv_exceptions_5_0= ruleDException )
            	    {
            	    // InternalDim.g:2151:5: (lv_exceptions_5_0= ruleDException )
            	    // InternalDim.g:2152:6: lv_exceptions_5_0= ruleDException
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getExceptionsDExceptionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	      							"com.mimacom.ddd.dm.dim.Dim.DException");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDim.g:2170:4: ( (lv_types_6_0= ruleDType ) )
            	    {
            	    // InternalDim.g:2170:4: ( (lv_types_6_0= ruleDType ) )
            	    // InternalDim.g:2171:5: (lv_types_6_0= ruleDType )
            	    {
            	    // InternalDim.g:2171:5: (lv_types_6_0= ruleDType )
            	    // InternalDim.g:2172:6: lv_types_6_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getTypesDTypeParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	      							"com.mimacom.ddd.dm.dim.Dim.DType");
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

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:2198:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDim.g:2198:49: (iv_ruleDService= ruleDService EOF )
            // InternalDim.g:2199:2: iv_ruleDService= ruleDService EOF
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
    // InternalDim.g:2205:1: ruleDService returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) ;
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
            // InternalDim.g:2211:2: ( ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) )
            // InternalDim.g:2212:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            {
            // InternalDim.g:2212:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            // InternalDim.g:2213:3: ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )? (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )? ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}'
            {
            // InternalDim.g:2213:3: ( (lv_kind_0_0= ruleDServiceKind ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=84 && LA52_0<=85)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDim.g:2214:4: (lv_kind_0_0= ruleDServiceKind )
                    {
                    // InternalDim.g:2214:4: (lv_kind_0_0= ruleDServiceKind )
                    // InternalDim.g:2215:5: lv_kind_0_0= ruleDServiceKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getKindDServiceKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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
                      						"com.mimacom.ddd.dm.dim.Dim.DServiceKind");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getServiceKeyword_1());
              		
            }
            // InternalDim.g:2236:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:2237:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:2237:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:2238:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
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

            // InternalDim.g:2254:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDim.g:2255:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalDim.g:2259:4: ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=86 && LA54_0<=87)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalDim.g:2260:5: ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            {
                            // InternalDim.g:2260:5: ( (lv_parameters_4_0= ruleDServiceParameter ) )
                            // InternalDim.g:2261:6: (lv_parameters_4_0= ruleDServiceParameter )
                            {
                            // InternalDim.g:2261:6: (lv_parameters_4_0= ruleDServiceParameter )
                            // InternalDim.g:2262:7: lv_parameters_4_0= ruleDServiceParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
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
                              								"com.mimacom.ddd.dm.dim.Dim.DServiceParameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDim.g:2279:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==32) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalDim.g:2280:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDServiceAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDim.g:2284:6: ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    // InternalDim.g:2285:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    {
                            	    // InternalDim.g:2285:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    // InternalDim.g:2286:8: lv_parameters_6_0= ruleDServiceParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_35);
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
                            	      									"com.mimacom.ddd.dm.dim.Dim.DServiceParameter");
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

                    otherlv_7=(Token)match(input,22,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDServiceAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:2310:3: (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDim.g:2311:4: otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDServiceAccess().getRaisesKeyword_4_0());
                      			
                    }
                    // InternalDim.g:2315:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDim.g:2316:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDim.g:2316:5: (otherlv_9= RULE_ID )
                    // InternalDim.g:2317:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDServiceRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalDim.g:2328:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==32) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDim.g:2329:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getDServiceAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2333:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalDim.g:2334:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalDim.g:2334:6: (otherlv_11= RULE_ID )
                    	    // InternalDim.g:2335:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDServiceRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_2_1_0());
                    	      						
                    	    }

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

            // InternalDim.g:2348:3: ( (lv_description_12_0= ruleDRichText ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_PLAIN_TEXT_ONLY && LA58_0<=RULE_PLAIN_TEXT_START)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDim.g:2349:4: (lv_description_12_0= ruleDRichText )
                    {
                    // InternalDim.g:2349:4: (lv_description_12_0= ruleDRichText )
                    // InternalDim.g:2350:5: lv_description_12_0= ruleDRichText
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

            otherlv_13=(Token)match(input,25,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDServiceAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:2371:3: (otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDim.g:2372:4: otherlv_14= 'precondition' ( (lv_precondition_15_0= ruleDExpression ) )
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDServiceAccess().getPreconditionKeyword_7_0());
                      			
                    }
                    // InternalDim.g:2376:4: ( (lv_precondition_15_0= ruleDExpression ) )
                    // InternalDim.g:2377:5: (lv_precondition_15_0= ruleDExpression )
                    {
                    // InternalDim.g:2377:5: (lv_precondition_15_0= ruleDExpression )
                    // InternalDim.g:2378:6: lv_precondition_15_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPreconditionDExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

            // InternalDim.g:2396:3: (otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDim.g:2397:4: otherlv_16= 'postcondition' ( (lv_postcondition_17_0= ruleDExpression ) )
                    {
                    otherlv_16=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDServiceAccess().getPostconditionKeyword_8_0());
                      			
                    }
                    // InternalDim.g:2401:4: ( (lv_postcondition_17_0= ruleDExpression ) )
                    // InternalDim.g:2402:5: (lv_postcondition_17_0= ruleDExpression )
                    {
                    // InternalDim.g:2402:5: (lv_postcondition_17_0= ruleDExpression )
                    // InternalDim.g:2403:6: lv_postcondition_17_0= ruleDExpression
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

            // InternalDim.g:2421:3: ( (lv_types_18_0= ruleDType ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==28||(LA61_0>=30 && LA61_0<=31)||(LA61_0>=33 && LA61_0<=36)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalDim.g:2422:4: (lv_types_18_0= ruleDType )
            	    {
            	    // InternalDim.g:2422:4: (lv_types_18_0= ruleDType )
            	    // InternalDim.g:2423:5: lv_types_18_0= ruleDType
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
            	      						"com.mimacom.ddd.dm.dim.Dim.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_19=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:2448:1: entryRuleDServiceParameter returns [EObject current=null] : iv_ruleDServiceParameter= ruleDServiceParameter EOF ;
    public final EObject entryRuleDServiceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDServiceParameter = null;


        try {
            // InternalDim.g:2448:58: (iv_ruleDServiceParameter= ruleDServiceParameter EOF )
            // InternalDim.g:2449:2: iv_ruleDServiceParameter= ruleDServiceParameter EOF
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
    // InternalDim.g:2455:1: ruleDServiceParameter returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:2461:2: ( ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDim.g:2462:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2462:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDim.g:2463:3: ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDim.g:2463:3: ( (lv_direction_0_0= ruleDDirection ) )
            // InternalDim.g:2464:4: (lv_direction_0_0= ruleDDirection )
            {
            // InternalDim.g:2464:4: (lv_direction_0_0= ruleDDirection )
            // InternalDim.g:2465:5: lv_direction_0_0= ruleDDirection
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
              						"com.mimacom.ddd.dm.dim.Dim.DDirection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDim.g:2482:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2483:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2483:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2484:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDServiceParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDim.g:2504:3: ( (otherlv_3= RULE_ID ) )
            // InternalDim.g:2505:4: (otherlv_3= RULE_ID )
            {
            // InternalDim.g:2505:4: (otherlv_3= RULE_ID )
            // InternalDim.g:2506:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDServiceParameterAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDim.g:2517:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDim.g:2518:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2518:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDim.g:2519:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalDim.g:2536:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_PLAIN_TEXT_ONLY && LA63_0<=RULE_PLAIN_TEXT_START)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDim.g:2537:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:2537:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:2538:5: lv_description_5_0= ruleDRichText
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
    // InternalDim.g:2559:1: entryRuleDException returns [EObject current=null] : iv_ruleDException= ruleDException EOF ;
    public final EObject entryRuleDException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDException = null;


        try {
            // InternalDim.g:2559:51: (iv_ruleDException= ruleDException EOF )
            // InternalDim.g:2560:2: iv_ruleDException= ruleDException EOF
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
    // InternalDim.g:2566:1: ruleDException returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) ;
    public final EObject ruleDException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2572:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) )
            // InternalDim.g:2573:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2573:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            // InternalDim.g:2574:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExceptionAccess().getExceptionKeyword_0());
              		
            }
            // InternalDim.g:2578:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2579:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2579:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2580:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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

            // InternalDim.g:2596:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_PLAIN_TEXT_ONLY && LA64_0<=RULE_PLAIN_TEXT_START)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDim.g:2597:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDim.g:2597:4: (lv_description_2_0= ruleDRichText )
                    // InternalDim.g:2598:5: lv_description_2_0= ruleDRichText
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
    // InternalDim.g:2619:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDim.g:2619:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDim.g:2620:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDim.g:2626:1: ruleDRichText returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) ;
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
            // InternalDim.g:2632:2: ( ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDim.g:2633:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDim.g:2633:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_PLAIN_TEXT_START) ) {
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
                    // InternalDim.g:2634:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    {
                    // InternalDim.g:2634:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    // InternalDim.g:2635:4: (lv_elements_0_0= ruleDTextOnly )
                    {
                    // InternalDim.g:2635:4: (lv_elements_0_0= ruleDTextOnly )
                    // InternalDim.g:2636:5: lv_elements_0_0= ruleDTextOnly
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
                    // InternalDim.g:2654:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDim.g:2654:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    // InternalDim.g:2655:4: ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) )
                    {
                    // InternalDim.g:2655:4: ( (lv_elements_1_0= ruleDTextStart ) )
                    // InternalDim.g:2656:5: (lv_elements_1_0= ruleDTextStart )
                    {
                    // InternalDim.g:2656:5: (lv_elements_1_0= ruleDTextStart )
                    // InternalDim.g:2657:6: lv_elements_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalDim.g:2674:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDim.g:2675:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDim.g:2675:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDim.g:2676:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
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

                    // InternalDim.g:2693:4: ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDim.g:2694:5: ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDim.g:2694:5: ( (lv_elements_3_0= ruleDTextMiddle ) )
                    	    // InternalDim.g:2695:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDim.g:2695:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    // InternalDim.g:2696:7: lv_elements_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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

                    	    // InternalDim.g:2713:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDim.g:2714:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:2714:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDim.g:2715:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop65;
                        }
                    } while (true);

                    // InternalDim.g:2733:4: ( (lv_elements_5_0= ruleDTextEnd ) )
                    // InternalDim.g:2734:5: (lv_elements_5_0= ruleDTextEnd )
                    {
                    // InternalDim.g:2734:5: (lv_elements_5_0= ruleDTextEnd )
                    // InternalDim.g:2735:6: lv_elements_5_0= ruleDTextEnd
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
    // InternalDim.g:2757:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDim.g:2757:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDim.g:2758:2: iv_ruleDTextOnly= ruleDTextOnly EOF
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
    // InternalDim.g:2764:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2770:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDim.g:2771:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDim.g:2771:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDim.g:2772:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDim.g:2772:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDim.g:2773:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDim.g:2792:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDim.g:2792:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDim.g:2793:2: iv_ruleDTextStart= ruleDTextStart EOF
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
    // InternalDim.g:2799:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2805:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDim.g:2806:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDim.g:2806:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDim.g:2807:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDim.g:2807:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDim.g:2808:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalDim.g:2827:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDim.g:2827:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDim.g:2828:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
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
    // InternalDim.g:2834:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2840:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDim.g:2841:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDim.g:2841:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDim.g:2842:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDim.g:2842:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDim.g:2843:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDim.g:2862:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDim.g:2862:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDim.g:2863:2: iv_ruleDTextEnd= ruleDTextEnd EOF
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
    // InternalDim.g:2869:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2875:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDim.g:2876:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDim.g:2876:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDim.g:2877:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDim.g:2877:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDim.g:2878:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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
    // InternalDim.g:2897:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDim.g:2897:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDim.g:2898:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDim.g:2904:1: ruleDExpression returns [EObject current=null] : this_DAssignment_0= ruleDAssignment ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2910:2: (this_DAssignment_0= ruleDAssignment )
            // InternalDim.g:2911:2: this_DAssignment_0= ruleDAssignment
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
    // InternalDim.g:2922:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDim.g:2922:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDim.g:2923:2: iv_ruleDAssignment= ruleDAssignment EOF
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
    // InternalDim.g:2929:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDim.g:2935:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDim.g:2936:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDim.g:2936:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==EOF||(LA67_1>=RULE_ID && LA67_1<=RULE_PLAIN_TEXT_END)||(LA67_1>=21 && LA67_1<=22)||(LA67_1>=26 && LA67_1<=28)||(LA67_1>=30 && LA67_1<=36)||(LA67_1>=38 && LA67_1<=39)||LA67_1==46||(LA67_1>=49 && LA67_1<=54)||(LA67_1>=64 && LA67_1<=66)||(LA67_1>=68 && LA67_1<=70)||(LA67_1>=79 && LA67_1<=80)||(LA67_1>=82 && LA67_1<=83)||(LA67_1>=88 && LA67_1<=107)) ) {
                    alt67=2;
                }
                else if ( (LA67_1==48) ) {
                    alt67=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA67_0>=RULE_NATURAL && LA67_0<=RULE_STRING)||LA67_0==21||(LA67_0>=55 && LA67_0<=63)||LA67_0==67||(LA67_0>=71 && LA67_0<=76)||(LA67_0>=79 && LA67_0<=80)||(LA67_0>=108 && LA67_0<=110)) ) {
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
                    // InternalDim.g:2937:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDim.g:2937:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDim.g:2938:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDim.g:2938:4: ()
                    // InternalDim.g:2939:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:2945:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDim.g:2946:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDim.g:2946:5: (otherlv_1= RULE_ID )
                    // InternalDim.g:2947:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDim.g:2965:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDim.g:2966:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDim.g:2966:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDim.g:2967:6: lv_value_3_0= ruleDAssignment
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
                    // InternalDim.g:2986:3: this_DOrExpression_4= ruleDOrExpression
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
    // InternalDim.g:2998:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDim.g:2998:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDim.g:2999:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // InternalDim.g:3005:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3011:2: (kw= ':=' )
            // InternalDim.g:3012:2: kw= ':='
            {
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3020:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDim.g:3020:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDim.g:3021:2: iv_ruleDOrExpression= ruleDOrExpression EOF
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
    // InternalDim.g:3027:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3033:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDim.g:3034:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDim.g:3034:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDim.g:3035:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3043:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                switch ( input.LA(1) ) {
                case 88:
                    {
                    int LA68_2 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt68=1;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA68_3 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt68=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA68_4 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt68=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA68_5 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt68=1;
                    }


                    }
                    break;

                }

                switch (alt68) {
            	case 1 :
            	    // InternalDim.g:3044:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDim.g:3044:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDim.g:3045:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDim.g:3055:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDim.g:3056:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDim.g:3056:6: ()
            	    // InternalDim.g:3057:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3063:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDim.g:3064:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDim.g:3064:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDim.g:3065:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3084:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDim.g:3085:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDim.g:3085:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDim.g:3086:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
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
            	    break loop68;
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
    // InternalDim.g:3108:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDim.g:3108:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDim.g:3109:2: iv_ruleDAndExpression= ruleDAndExpression EOF
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
    // InternalDim.g:3115:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3121:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDim.g:3122:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDim.g:3122:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDim.g:3123:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3131:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==92) ) {
                    int LA69_2 = input.LA(2);

                    if ( (synpred2_InternalDim()) ) {
                        alt69=1;
                    }


                }
                else if ( (LA69_0==93) ) {
                    int LA69_3 = input.LA(2);

                    if ( (synpred2_InternalDim()) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // InternalDim.g:3132:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDim.g:3132:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDim.g:3133:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDim.g:3143:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDim.g:3144:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDim.g:3144:6: ()
            	    // InternalDim.g:3145:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3151:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDim.g:3152:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDim.g:3152:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDim.g:3153:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3172:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDim.g:3173:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDim.g:3173:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDim.g:3174:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
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
            	    break loop69;
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
    // InternalDim.g:3196:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDim.g:3196:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDim.g:3197:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
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
    // InternalDim.g:3203:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3209:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDim.g:3210:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDim.g:3210:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDim.g:3211:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3219:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case 94:
                    {
                    int LA70_2 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt70=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA70_3 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt70=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA70_4 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt70=1;
                    }


                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // InternalDim.g:3220:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDim.g:3220:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDim.g:3221:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDim.g:3231:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDim.g:3232:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDim.g:3232:6: ()
            	    // InternalDim.g:3233:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3239:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDim.g:3240:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDim.g:3240:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDim.g:3241:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3260:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDim.g:3261:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDim.g:3261:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDim.g:3262:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop70;
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
    // InternalDim.g:3284:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDim.g:3284:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDim.g:3285:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
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
    // InternalDim.g:3291:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3297:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDim.g:3298:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDim.g:3298:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDim.g:3299:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3307:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop71:
            do {
                int alt71=3;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // InternalDim.g:3308:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDim.g:3308:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDim.g:3309:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDim.g:3309:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDim.g:3310:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDim.g:3316:6: ( () ruleOpInstanceOf )
            	    // InternalDim.g:3317:7: () ruleOpInstanceOf
            	    {
            	    // InternalDim.g:3317:7: ()
            	    // InternalDim.g:3318:8: 
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

            	    // InternalDim.g:3333:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3334:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3334:6: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3335:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:3348:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDim.g:3348:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDim.g:3349:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDim.g:3349:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDim.g:3350:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDim.g:3360:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDim.g:3361:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDim.g:3361:7: ()
            	    // InternalDim.g:3362:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDim.g:3368:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDim.g:3369:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDim.g:3369:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDim.g:3370:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3389:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDim.g:3390:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDim.g:3390:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDim.g:3391:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalDim.g:3414:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDim.g:3414:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDim.g:3415:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
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
    // InternalDim.g:3421:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3427:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDim.g:3428:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDim.g:3428:2: (kw= 'ISA' | kw= 'isa' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==49) ) {
                alt72=1;
            }
            else if ( (LA72_0==50) ) {
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
                    // InternalDim.g:3429:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:3435:3: kw= 'isa'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3444:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDim.g:3444:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDim.g:3445:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
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
    // InternalDim.g:3451:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3457:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDim.g:3458:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDim.g:3458:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDim.g:3459:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3467:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA73_2 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;
                case 103:
                    {
                    int LA73_3 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA73_4 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // InternalDim.g:3468:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDim.g:3468:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDim.g:3469:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDim.g:3479:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDim.g:3480:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDim.g:3480:6: ()
            	    // InternalDim.g:3481:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3487:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDim.g:3488:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDim.g:3488:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDim.g:3489:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3508:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDim.g:3509:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDim.g:3509:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDim.g:3510:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    break loop73;
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
    // InternalDim.g:3532:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDim.g:3532:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDim.g:3533:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
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
    // InternalDim.g:3539:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3545:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDim.g:3546:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDim.g:3546:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDim.g:3547:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3555:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==79) ) {
                    int LA74_2 = input.LA(2);

                    if ( (synpred7_InternalDim()) ) {
                        alt74=1;
                    }


                }
                else if ( (LA74_0==80) ) {
                    int LA74_3 = input.LA(2);

                    if ( (synpred7_InternalDim()) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // InternalDim.g:3556:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDim.g:3556:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDim.g:3557:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDim.g:3567:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDim.g:3568:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDim.g:3568:6: ()
            	    // InternalDim.g:3569:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3575:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDim.g:3576:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDim.g:3576:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDim.g:3577:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3596:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDim.g:3597:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDim.g:3597:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDim.g:3598:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
            	    break loop74;
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
    // InternalDim.g:3620:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDim.g:3620:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDim.g:3621:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
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
    // InternalDim.g:3627:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3633:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDim.g:3634:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDim.g:3634:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDim.g:3635:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3643:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop75:
            do {
                int alt75=2;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    int LA75_2 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt75=1;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA75_3 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt75=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA75_4 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt75=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA75_5 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt75=1;
                    }


                    }
                    break;

                }

                switch (alt75) {
            	case 1 :
            	    // InternalDim.g:3644:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDim.g:3644:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDim.g:3645:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDim.g:3655:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDim.g:3656:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDim.g:3656:6: ()
            	    // InternalDim.g:3657:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3663:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDim.g:3664:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDim.g:3664:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDim.g:3665:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_15);
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

            	    // InternalDim.g:3684:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDim.g:3685:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDim.g:3685:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDim.g:3686:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop75;
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
    // InternalDim.g:3708:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDim.g:3708:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDim.g:3709:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
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
    // InternalDim.g:3715:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDim.g:3721:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDim.g:3722:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDim.g:3722:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=79 && LA76_0<=80)||(LA76_0>=108 && LA76_0<=110)) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_ID||(LA76_0>=RULE_NATURAL && LA76_0<=RULE_STRING)||LA76_0==21||(LA76_0>=55 && LA76_0<=63)||LA76_0==67||(LA76_0>=71 && LA76_0<=76)) ) {
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
                    // InternalDim.g:3723:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDim.g:3723:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDim.g:3724:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDim.g:3724:4: ()
                    // InternalDim.g:3725:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:3731:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDim.g:3732:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDim.g:3732:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDim.g:3733:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalDim.g:3750:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDim.g:3751:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDim.g:3751:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDim.g:3752:6: lv_operand_2_0= ruleDUnaryOperation
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
                    // InternalDim.g:3771:3: this_DCastExpression_3= ruleDCastExpression
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
    // InternalDim.g:3783:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDim.g:3783:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDim.g:3784:2: iv_ruleDCastExpression= ruleDCastExpression EOF
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
    // InternalDim.g:3790:1: ruleDCastExpression returns [EObject current=null] : (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DTypedMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3796:2: ( (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDim.g:3797:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDim.g:3797:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDim.g:3798:3: this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DTypedMemberReference_0=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DTypedMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3806:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==51) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred9_InternalDim()) ) {
                    alt77=1;
                }
            }
            else if ( (LA77_0==52) ) {
                int LA77_2 = input.LA(2);

                if ( (synpred9_InternalDim()) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // InternalDim.g:3807:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDim.g:3807:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDim.g:3808:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDim.g:3814:5: ( () ruleOpCast )
                    // InternalDim.g:3815:6: () ruleOpCast
                    {
                    // InternalDim.g:3815:6: ()
                    // InternalDim.g:3816:7: 
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

                    // InternalDim.g:3831:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDim.g:3832:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDim.g:3832:5: (otherlv_3= RULE_ID )
                    // InternalDim.g:3833:6: otherlv_3= RULE_ID
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
    // InternalDim.g:3849:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDim.g:3849:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDim.g:3850:2: iv_ruleOpCast= ruleOpCast EOF
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
    // InternalDim.g:3856:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3862:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDim.g:3863:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDim.g:3863:2: (kw= 'AS' | kw= 'as' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==51) ) {
                alt78=1;
            }
            else if ( (LA78_0==52) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalDim.g:3864:3: kw= 'AS'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:3870:3: kw= 'as'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3879:1: entryRuleDTypedMemberReference returns [EObject current=null] : iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF ;
    public final EObject entryRuleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTypedMemberReference = null;


        try {
            // InternalDim.g:3879:62: (iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF )
            // InternalDim.g:3880:2: iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF
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
    // InternalDim.g:3886:1: ruleDTypedMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDim.g:3892:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalDim.g:3893:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalDim.g:3893:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalDim.g:3894:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3902:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop82:
            do {
                int alt82=3;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==53) ) {
                    int LA82_2 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt82=1;
                    }
                    else if ( (synpred11_InternalDim()) ) {
                        alt82=2;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // InternalDim.g:3903:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDim.g:3903:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDim.g:3904:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDim.g:3904:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDim.g:3905:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDim.g:3917:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDim.g:3918:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDim.g:3918:7: ()
            	    // InternalDim.g:3919:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDim.g:3929:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3930:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3930:8: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3931:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3951:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDim.g:3952:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDim.g:3952:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDim.g:3953:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_57);
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
            	    // InternalDim.g:3972:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalDim.g:3972:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalDim.g:3973:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalDim.g:3973:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDim.g:3974:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDim.g:3980:6: ( () otherlv_7= '.' )
            	    // InternalDim.g:3981:7: () otherlv_7= '.'
            	    {
            	    // InternalDim.g:3981:7: ()
            	    // InternalDim.g:3982:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3994:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDim.g:3995:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDim.g:3995:6: (otherlv_8= RULE_ID )
            	    // InternalDim.g:3996:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:4007:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt81=3;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==21) && (synpred12_InternalDim())) {
            	        alt81=1;
            	    }
            	    else if ( (LA81_0==54) ) {
            	        alt81=2;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalDim.g:4008:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalDim.g:4008:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalDim.g:4009:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDim.g:4009:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDim.g:4010:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDim.g:4014:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDim.g:4015:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,21,FOLLOW_59); if (state.failed) return current;
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

            	            // InternalDim.g:4027:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt80=2;
            	            int LA80_0 = input.LA(1);

            	            if ( (LA80_0==RULE_ID||(LA80_0>=RULE_NATURAL && LA80_0<=RULE_STRING)||LA80_0==21||(LA80_0>=55 && LA80_0<=63)||LA80_0==67||(LA80_0>=71 && LA80_0<=76)||(LA80_0>=79 && LA80_0<=80)||(LA80_0>=108 && LA80_0<=110)) ) {
            	                alt80=1;
            	            }
            	            switch (alt80) {
            	                case 1 :
            	                    // InternalDim.g:4028:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDim.g:4028:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDim.g:4029:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDim.g:4029:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDim.g:4030:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_35);
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

            	                    // InternalDim.g:4047:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop79:
            	                    do {
            	                        int alt79=2;
            	                        int LA79_0 = input.LA(1);

            	                        if ( (LA79_0==32) ) {
            	                            alt79=1;
            	                        }


            	                        switch (alt79) {
            	                    	case 1 :
            	                    	    // InternalDim.g:4048:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalDim.g:4052:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDim.g:4053:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDim.g:4053:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDim.g:4054:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_35);
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
            	                    	    break loop79;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,22,FOLLOW_57); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDim.g:4079:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalDim.g:4079:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalDim.g:4080:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalDim.g:4080:7: (lv_before_14_0= '@before' )
            	            // InternalDim.g:4081:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,54,FOLLOW_57); if (state.failed) return current;
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
            	    break loop82;
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
    // InternalDim.g:4100:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDim.g:4100:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDim.g:4101:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
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
    // InternalDim.g:4107:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
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
            // InternalDim.g:4113:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDim.g:4114:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDim.g:4114:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt83=10;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalDim.g:4115:3: this_DLiteralExpression_0= ruleDLiteralExpression
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
                    // InternalDim.g:4124:3: this_DSelfExpression_1= ruleDSelfExpression
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
                    // InternalDim.g:4133:3: this_DReturnExpression_2= ruleDReturnExpression
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
                    // InternalDim.g:4142:3: this_DRaiseExpression_3= ruleDRaiseExpression
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
                    // InternalDim.g:4151:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
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
                    // InternalDim.g:4160:3: this_DFunctionCall_5= ruleDFunctionCall
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
                    // InternalDim.g:4169:3: this_DConstructorCall_6= ruleDConstructorCall
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
                    // InternalDim.g:4178:3: this_DContextReference_7= ruleDContextReference
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
                    // InternalDim.g:4187:3: this_DIfExpression_8= ruleDIfExpression
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
                    // InternalDim.g:4196:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDim.g:4196:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDim.g:4197:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
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
    // InternalDim.g:4222:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDim.g:4222:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDim.g:4223:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
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
    // InternalDim.g:4229:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDim.g:4235:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDim.g:4236:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDim.g:4236:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt84=1;
                }
                break;
            case RULE_STRING:
                {
                alt84=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA84_3 = input.LA(2);

                if ( (LA84_3==53) ) {
                    int LA84_5 = input.LA(3);

                    if ( (LA84_5==RULE_ID) ) {
                        alt84=3;
                    }
                    else if ( (LA84_5==RULE_NATURAL) ) {
                        alt84=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA84_3==EOF||(LA84_3>=RULE_ID && LA84_3<=RULE_PLAIN_TEXT_END)||LA84_3==22||(LA84_3>=26 && LA84_3<=28)||(LA84_3>=30 && LA84_3<=36)||(LA84_3>=38 && LA84_3<=39)||LA84_3==46||(LA84_3>=49 && LA84_3<=52)||(LA84_3>=64 && LA84_3<=66)||(LA84_3>=68 && LA84_3<=70)||(LA84_3>=79 && LA84_3<=80)||(LA84_3>=82 && LA84_3<=83)||(LA84_3>=88 && LA84_3<=107)) ) {
                    alt84=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 3, input);

                    throw nvae;
                }
                }
                break;
            case 75:
            case 76:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalDim.g:4237:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
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
                    // InternalDim.g:4246:3: this_DStringLiteral_1= ruleDStringLiteral
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
                    // InternalDim.g:4255:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
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
                    // InternalDim.g:4264:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
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
                    // InternalDim.g:4273:3: this_DNilLiteral_4= ruleDNilLiteral
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
    // InternalDim.g:4285:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDim.g:4285:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDim.g:4286:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
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
    // InternalDim.g:4292:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:4298:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDim.g:4299:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDim.g:4299:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDim.g:4300:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDim.g:4300:3: ()
            // InternalDim.g:4301:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4307:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==55) ) {
                alt85=1;
            }
            else if ( (LA85_0==56) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalDim.g:4308:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4313:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4322:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDim.g:4322:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDim.g:4323:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
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
    // InternalDim.g:4329:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4335:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDim.g:4336:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDim.g:4336:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDim.g:4337:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDim.g:4337:3: ()
            // InternalDim.g:4338:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4344:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==57) ) {
                alt86=1;
            }
            else if ( (LA86_0==58) ) {
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
                    // InternalDim.g:4345:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4350:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:4355:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalDim.g:4356:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDim.g:4357:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDim.g:4358:5: lv_expression_3_0= ruleDExpression
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
    // InternalDim.g:4379:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDim.g:4379:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDim.g:4380:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
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
    // InternalDim.g:4386:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4392:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDim.g:4393:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDim.g:4393:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDim.g:4394:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDim.g:4394:3: ()
            // InternalDim.g:4395:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4401:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==59) ) {
                alt88=1;
            }
            else if ( (LA88_0==60) ) {
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
                    // InternalDim.g:4402:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4407:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:4412:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDim.g:4413:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDim.g:4413:4: (lv_expression_3_0= ruleDExpression )
            // InternalDim.g:4414:5: lv_expression_3_0= ruleDExpression
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
    // InternalDim.g:4435:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDim.g:4435:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDim.g:4436:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
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
    // InternalDim.g:4442:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDim.g:4448:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDim.g:4449:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDim.g:4449:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDim.g:4450:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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
            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4470:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDim.g:4470:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDim.g:4471:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
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
    // InternalDim.g:4477:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDim.g:4483:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDim.g:4484:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDim.g:4484:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDim.g:4485:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDim.g:4485:3: ()
            // InternalDim.g:4486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4492:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:4493:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:4493:4: (otherlv_1= RULE_ID )
            // InternalDim.g:4494:5: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,21,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:4509:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID||(LA90_0>=RULE_NATURAL && LA90_0<=RULE_STRING)||LA90_0==21||(LA90_0>=55 && LA90_0<=63)||LA90_0==67||(LA90_0>=71 && LA90_0<=76)||(LA90_0>=79 && LA90_0<=80)||(LA90_0>=108 && LA90_0<=110)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDim.g:4510:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:4510:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDim.g:4511:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDim.g:4511:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDim.g:4512:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    // InternalDim.g:4529:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==32) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalDim.g:4530:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:4534:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDim.g:4535:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:4535:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDim.g:4536:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4563:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDim.g:4563:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDim.g:4564:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
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
    // InternalDim.g:4570:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalDim.g:4576:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDim.g:4577:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDim.g:4577:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDim.g:4578:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDim.g:4578:3: ()
            // InternalDim.g:4579:4: 
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
            // InternalDim.g:4592:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:4593:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:4593:4: (otherlv_2= RULE_ID )
            // InternalDim.g:4594:5: otherlv_2= RULE_ID
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

            // InternalDim.g:4605:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==21) && (synpred15_InternalDim())) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDim.g:4606:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDim.g:4606:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDim.g:4607:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDim.g:4611:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDim.g:4612:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,21,FOLLOW_59); if (state.failed) return current;
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

                    // InternalDim.g:4624:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_ID||(LA92_0>=RULE_NATURAL && LA92_0<=RULE_STRING)||LA92_0==21||(LA92_0>=55 && LA92_0<=63)||LA92_0==67||(LA92_0>=71 && LA92_0<=76)||(LA92_0>=79 && LA92_0<=80)||(LA92_0>=108 && LA92_0<=110)) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalDim.g:4625:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDim.g:4625:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDim.g:4626:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDim.g:4626:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDim.g:4627:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_35);
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

                            // InternalDim.g:4644:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==32) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // InternalDim.g:4645:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDim.g:4649:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDim.g:4650:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDim.g:4650:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDim.g:4651:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_35);
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
                            	    break loop91;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4679:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDim.g:4679:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDim.g:4680:2: iv_ruleOpConstructor= ruleOpConstructor EOF
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
    // InternalDim.g:4686:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4692:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDim.g:4693:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDim.g:4693:2: (kw= 'NEW' | kw= 'new' )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==61) ) {
                alt94=1;
            }
            else if ( (LA94_0==62) ) {
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
                    // InternalDim.g:4694:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4700:3: kw= 'new'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4709:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDim.g:4709:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDim.g:4710:2: iv_ruleDContextReference= ruleDContextReference EOF
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
    // InternalDim.g:4716:1: ruleDContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;


        	enterRule();

        try {
            // InternalDim.g:4722:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) )
            // InternalDim.g:4723:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            {
            // InternalDim.g:4723:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            // InternalDim.g:4724:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
            {
            // InternalDim.g:4724:3: ()
            // InternalDim.g:4725:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4731:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:4732:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:4732:4: (otherlv_1= RULE_ID )
            // InternalDim.g:4733:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDim.g:4744:3: ( (lv_before_2_0= '@before' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==54) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDim.g:4745:4: (lv_before_2_0= '@before' )
                    {
                    // InternalDim.g:4745:4: (lv_before_2_0= '@before' )
                    // InternalDim.g:4746:5: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4762:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDim.g:4762:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDim.g:4763:2: iv_ruleDIfExpression= ruleDIfExpression EOF
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
    // InternalDim.g:4769:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDim.g:4775:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDim.g:4776:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDim.g:4776:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDim.g:4777:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDim.g:4777:3: ()
            // InternalDim.g:4778:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDim.g:4788:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDim.g:4789:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDim.g:4789:4: (lv_if_2_0= ruleDExpression )
            // InternalDim.g:4790:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,64,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDim.g:4811:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDim.g:4812:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDim.g:4812:4: (lv_then_4_0= ruleDExpression )
            // InternalDim.g:4813:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalDim.g:4830:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==65) && (synpred16_InternalDim())) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDim.g:4831:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDim.g:4831:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDim.g:4832:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDim.g:4838:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDim.g:4839:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDim.g:4839:5: (lv_else_6_0= ruleDExpression )
                    // InternalDim.g:4840:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
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

            otherlv_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4866:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDim.g:4866:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDim.g:4867:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
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
    // InternalDim.g:4873:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
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
            // InternalDim.g:4879:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDim.g:4880:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDim.g:4880:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDim.g:4881:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDim.g:4881:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDim.g:4882:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDim.g:4894:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDim.g:4895:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDim.g:4895:5: ()
            // InternalDim.g:4896:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDim.g:4906:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDim.g:4907:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDim.g:4907:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDim.g:4908:7: lv_declaredParam_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalDim.g:4930:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDim.g:4931:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDim.g:4931:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDim.g:4932:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,68,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDim.g:4953:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDim.g:4954:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDim.g:4954:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDim.g:4955:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_64);
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

            otherlv_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4980:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDim.g:4980:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDim.g:4981:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDim.g:4987:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4993:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalDim.g:4994:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalDim.g:4994:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalDim.g:4995:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDim.g:4999:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalDim.g:5000:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalDim.g:5000:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalDim.g:5001:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_67); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,69,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalDim.g:5021:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalDim.g:5022:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalDim.g:5022:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalDim.g:5023:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5048:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDim.g:5048:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDim.g:5049:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDim.g:5055:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:5061:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDim.g:5062:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDim.g:5062:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_NATURAL) ) {
                alt97=1;
            }
            else if ( (LA97_0==70) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalDim.g:5063:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDim.g:5071:3: kw= '*'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5080:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDim.g:5080:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDim.g:5081:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
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
    // InternalDim.g:5087:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDim.g:5093:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDim.g:5094:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDim.g:5094:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDim.g:5095:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDim.g:5095:3: ()
            // InternalDim.g:5096:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5102:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt98=1;
                }
                break;
            case 72:
                {
                alt98=2;
                }
                break;
            case 73:
                {
                alt98=3;
                }
                break;
            case 74:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalDim.g:5103:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDim.g:5103:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDim.g:5104:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDim.g:5104:5: (lv_value_1_0= 'TRUE' )
                    // InternalDim.g:5105:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5118:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDim.g:5118:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDim.g:5119:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDim.g:5119:5: (lv_value_2_0= 'true' )
                    // InternalDim.g:5120:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5133:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:5138:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5147:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDim.g:5147:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDim.g:5148:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
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
    // InternalDim.g:5154:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5160:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDim.g:5161:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDim.g:5161:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDim.g:5162:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDim.g:5162:3: ()
            // InternalDim.g:5163:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5169:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDim.g:5170:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDim.g:5170:4: (lv_value_1_0= RULE_STRING )
            // InternalDim.g:5171:5: lv_value_1_0= RULE_STRING
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
    // InternalDim.g:5191:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDim.g:5191:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDim.g:5192:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
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
    // InternalDim.g:5198:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5204:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDim.g:5205:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDim.g:5205:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDim.g:5206:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDim.g:5206:3: ()
            // InternalDim.g:5207:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5213:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDim.g:5214:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDim.g:5214:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDim.g:5215:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDim.g:5235:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDim.g:5235:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDim.g:5236:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
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
    // InternalDim.g:5242:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5248:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDim.g:5249:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDim.g:5249:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDim.g:5250:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDim.g:5250:3: ()
            // InternalDim.g:5251:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5257:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDim.g:5258:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDim.g:5258:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDim.g:5259:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDim.g:5280:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDim.g:5280:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDim.g:5281:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
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
    // InternalDim.g:5287:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:5293:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDim.g:5294:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDim.g:5294:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDim.g:5295:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDim.g:5295:3: ()
            // InternalDim.g:5296:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5302:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==75) ) {
                alt99=1;
            }
            else if ( (LA99_0==76) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalDim.g:5303:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:5308:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDNilLiteralAccess().getUndefinedKeyword_1_1());
                      			
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
    // InternalDim.g:5317:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDim.g:5317:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDim.g:5318:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDim.g:5324:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDim.g:5330:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDim.g:5331:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDim.g:5331:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDim.g:5332:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,53,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDim.g:5351:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=77 && LA102_0<=78)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDim.g:5352:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDim.g:5352:4: (kw= 'E' | kw= 'e' )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==77) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==78) ) {
                        alt100=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalDim.g:5353:5: kw= 'E'
                            {
                            kw=(Token)match(input,77,FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5359:5: kw= 'e'
                            {
                            kw=(Token)match(input,78,FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDim.g:5365:4: (kw= '+' | kw= '-' )?
                    int alt101=3;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==79) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==80) ) {
                        alt101=2;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalDim.g:5366:5: kw= '+'
                            {
                            kw=(Token)match(input,79,FOLLOW_66); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5372:5: kw= '-'
                            {
                            kw=(Token)match(input,80,FOLLOW_66); if (state.failed) return current;
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
    // InternalDim.g:5390:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDim.g:5390:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDim.g:5391:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDim.g:5397:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5403:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDim.g:5404:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDim.g:5404:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDim.g:5405:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:5415:3: (kw= '.*' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==81) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalDim.g:5416:4: kw= '.*'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5426:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDim.g:5426:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDim.g:5427:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDim.g:5433:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDim.g:5439:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDim.g:5440:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDim.g:5440:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDim.g:5441:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDim.g:5448:3: (kw= '.' this_ID_2= RULE_ID )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==53) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalDim.g:5449:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop104;
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
    // InternalDim.g:5466:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5472:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalDim.g:5473:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalDim.g:5473:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==82) ) {
                alt105=1;
            }
            else if ( (LA105_0==39) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalDim.g:5474:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalDim.g:5474:3: (enumLiteral_0= 'reference' )
                    // InternalDim.g:5475:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5482:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalDim.g:5482:3: (enumLiteral_1= 'composite' )
                    // InternalDim.g:5483:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5493:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:5499:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDim.g:5500:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDim.g:5500:2: (enumLiteral_0= 'inverse' )
            // InternalDim.g:5501:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5510:1: ruleDServiceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleDServiceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5516:2: ( ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) )
            // InternalDim.g:5517:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalDim.g:5517:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==84) ) {
                alt106=1;
            }
            else if ( (LA106_0==85) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalDim.g:5518:3: (enumLiteral_0= 'synchronous' )
                    {
                    // InternalDim.g:5518:3: (enumLiteral_0= 'synchronous' )
                    // InternalDim.g:5519:4: enumLiteral_0= 'synchronous'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5526:3: (enumLiteral_1= 'async' )
                    {
                    // InternalDim.g:5526:3: (enumLiteral_1= 'async' )
                    // InternalDim.g:5527:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5537:1: ruleDDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5543:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalDim.g:5544:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalDim.g:5544:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==86) ) {
                alt107=1;
            }
            else if ( (LA107_0==87) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalDim.g:5545:3: (enumLiteral_0= 'in' )
                    {
                    // InternalDim.g:5545:3: (enumLiteral_0= 'in' )
                    // InternalDim.g:5546:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5553:3: (enumLiteral_1= 'out' )
                    {
                    // InternalDim.g:5553:3: (enumLiteral_1= 'out' )
                    // InternalDim.g:5554:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5564:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:5570:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDim.g:5571:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDim.g:5571:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt108=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt108=1;
                }
                break;
            case 89:
                {
                alt108=2;
                }
                break;
            case 90:
                {
                alt108=3;
                }
                break;
            case 91:
                {
                alt108=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalDim.g:5572:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDim.g:5572:3: (enumLiteral_0= 'OR' )
                    // InternalDim.g:5573:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5580:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDim.g:5580:3: (enumLiteral_1= 'or' )
                    // InternalDim.g:5581:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5588:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDim.g:5588:3: (enumLiteral_2= 'XOR' )
                    // InternalDim.g:5589:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5596:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDim.g:5596:3: (enumLiteral_3= 'xor' )
                    // InternalDim.g:5597:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5607:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5613:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDim.g:5614:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDim.g:5614:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==92) ) {
                alt109=1;
            }
            else if ( (LA109_0==93) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalDim.g:5615:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDim.g:5615:3: (enumLiteral_0= 'AND' )
                    // InternalDim.g:5616:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5623:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDim.g:5623:3: (enumLiteral_1= 'and' )
                    // InternalDim.g:5624:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5634:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:5640:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDim.g:5641:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDim.g:5641:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt110=1;
                }
                break;
            case 95:
                {
                alt110=2;
                }
                break;
            case 96:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalDim.g:5642:3: (enumLiteral_0= '=' )
                    {
                    // InternalDim.g:5642:3: (enumLiteral_0= '=' )
                    // InternalDim.g:5643:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5650:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDim.g:5650:3: (enumLiteral_1= '!=' )
                    // InternalDim.g:5651:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5658:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDim.g:5658:3: (enumLiteral_2= '<>' )
                    // InternalDim.g:5659:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5669:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDim.g:5675:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDim.g:5676:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDim.g:5676:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt111=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt111=1;
                }
                break;
            case 98:
                {
                alt111=2;
                }
                break;
            case 99:
                {
                alt111=3;
                }
                break;
            case 100:
                {
                alt111=4;
                }
                break;
            case 101:
                {
                alt111=5;
                }
                break;
            case 102:
                {
                alt111=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalDim.g:5677:3: (enumLiteral_0= '<' )
                    {
                    // InternalDim.g:5677:3: (enumLiteral_0= '<' )
                    // InternalDim.g:5678:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5685:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDim.g:5685:3: (enumLiteral_1= '<=' )
                    // InternalDim.g:5686:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5693:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDim.g:5693:3: (enumLiteral_2= '\\u2264' )
                    // InternalDim.g:5694:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5701:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDim.g:5701:3: (enumLiteral_3= '>=' )
                    // InternalDim.g:5702:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:5709:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDim.g:5709:3: (enumLiteral_4= '\\u2265' )
                    // InternalDim.g:5710:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:5717:3: (enumLiteral_5= '>' )
                    {
                    // InternalDim.g:5717:3: (enumLiteral_5= '>' )
                    // InternalDim.g:5718:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5728:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:5734:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDim.g:5735:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDim.g:5735:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt112=1;
                }
                break;
            case 103:
                {
                alt112=2;
                }
                break;
            case 104:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalDim.g:5736:3: (enumLiteral_0= '..' )
                    {
                    // InternalDim.g:5736:3: (enumLiteral_0= '..' )
                    // InternalDim.g:5737:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5744:3: (enumLiteral_1= '->' )
                    {
                    // InternalDim.g:5744:3: (enumLiteral_1= '->' )
                    // InternalDim.g:5745:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5752:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDim.g:5752:3: (enumLiteral_2= '=>' )
                    // InternalDim.g:5753:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5763:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5769:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDim.g:5770:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDim.g:5770:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==79) ) {
                alt113=1;
            }
            else if ( (LA113_0==80) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalDim.g:5771:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:5771:3: (enumLiteral_0= '+' )
                    // InternalDim.g:5772:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5779:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:5779:3: (enumLiteral_1= '-' )
                    // InternalDim.g:5780:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5790:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:5796:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDim.g:5797:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDim.g:5797:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt114=1;
                }
                break;
            case 105:
                {
                alt114=2;
                }
                break;
            case 106:
                {
                alt114=3;
                }
                break;
            case 107:
                {
                alt114=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalDim.g:5798:3: (enumLiteral_0= '*' )
                    {
                    // InternalDim.g:5798:3: (enumLiteral_0= '*' )
                    // InternalDim.g:5799:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5806:3: (enumLiteral_1= '/' )
                    {
                    // InternalDim.g:5806:3: (enumLiteral_1= '/' )
                    // InternalDim.g:5807:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5814:3: (enumLiteral_2= '**' )
                    {
                    // InternalDim.g:5814:3: (enumLiteral_2= '**' )
                    // InternalDim.g:5815:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5822:3: (enumLiteral_3= '%' )
                    {
                    // InternalDim.g:5822:3: (enumLiteral_3= '%' )
                    // InternalDim.g:5823:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5833:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:5839:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDim.g:5840:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDim.g:5840:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt115=1;
                }
                break;
            case 80:
                {
                alt115=2;
                }
                break;
            case 108:
                {
                alt115=3;
                }
                break;
            case 109:
                {
                alt115=4;
                }
                break;
            case 110:
                {
                alt115=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalDim.g:5841:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:5841:3: (enumLiteral_0= '+' )
                    // InternalDim.g:5842:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5849:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:5849:3: (enumLiteral_1= '-' )
                    // InternalDim.g:5850:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5857:3: (enumLiteral_2= '!' )
                    {
                    // InternalDim.g:5857:3: (enumLiteral_2= '!' )
                    // InternalDim.g:5858:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5865:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDim.g:5865:3: (enumLiteral_3= 'NOT' )
                    // InternalDim.g:5866:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:5873:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDim.g:5873:3: (enumLiteral_4= 'not' )
                    // InternalDim.g:5874:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDim
    public final void synpred1_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3045:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDim.g:3045:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDim.g:3045:6: ( () ( ( ruleOpOr ) ) )
        // InternalDim.g:3046:6: () ( ( ruleOpOr ) )
        {
        // InternalDim.g:3046:6: ()
        // InternalDim.g:3047:6: 
        {
        }

        // InternalDim.g:3048:6: ( ( ruleOpOr ) )
        // InternalDim.g:3049:7: ( ruleOpOr )
        {
        // InternalDim.g:3049:7: ( ruleOpOr )
        // InternalDim.g:3050:8: ruleOpOr
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
    // $ANTLR end synpred1_InternalDim

    // $ANTLR start synpred2_InternalDim
    public final void synpred2_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3133:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDim.g:3133:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDim.g:3133:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDim.g:3134:6: () ( ( ruleOpAnd ) )
        {
        // InternalDim.g:3134:6: ()
        // InternalDim.g:3135:6: 
        {
        }

        // InternalDim.g:3136:6: ( ( ruleOpAnd ) )
        // InternalDim.g:3137:7: ( ruleOpAnd )
        {
        // InternalDim.g:3137:7: ( ruleOpAnd )
        // InternalDim.g:3138:8: ruleOpAnd
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
    // $ANTLR end synpred2_InternalDim

    // $ANTLR start synpred3_InternalDim
    public final void synpred3_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3221:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDim.g:3221:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDim.g:3221:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDim.g:3222:6: () ( ( ruleOpEquality ) )
        {
        // InternalDim.g:3222:6: ()
        // InternalDim.g:3223:6: 
        {
        }

        // InternalDim.g:3224:6: ( ( ruleOpEquality ) )
        // InternalDim.g:3225:7: ( ruleOpEquality )
        {
        // InternalDim.g:3225:7: ( ruleOpEquality )
        // InternalDim.g:3226:8: ruleOpEquality
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
    // $ANTLR end synpred3_InternalDim

    // $ANTLR start synpred4_InternalDim
    public final void synpred4_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3310:6: ( ( () ruleOpInstanceOf ) )
        // InternalDim.g:3310:7: ( () ruleOpInstanceOf )
        {
        // InternalDim.g:3310:7: ( () ruleOpInstanceOf )
        // InternalDim.g:3311:7: () ruleOpInstanceOf
        {
        // InternalDim.g:3311:7: ()
        // InternalDim.g:3312:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDim

    // $ANTLR start synpred5_InternalDim
    public final void synpred5_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3350:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDim.g:3350:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDim.g:3350:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDim.g:3351:7: () ( ( ruleOpCompare ) )
        {
        // InternalDim.g:3351:7: ()
        // InternalDim.g:3352:7: 
        {
        }

        // InternalDim.g:3353:7: ( ( ruleOpCompare ) )
        // InternalDim.g:3354:8: ( ruleOpCompare )
        {
        // InternalDim.g:3354:8: ( ruleOpCompare )
        // InternalDim.g:3355:9: ruleOpCompare
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
    // $ANTLR end synpred5_InternalDim

    // $ANTLR start synpred6_InternalDim
    public final void synpred6_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3469:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDim.g:3469:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDim.g:3469:6: ( () ( ( ruleOpOther ) ) )
        // InternalDim.g:3470:6: () ( ( ruleOpOther ) )
        {
        // InternalDim.g:3470:6: ()
        // InternalDim.g:3471:6: 
        {
        }

        // InternalDim.g:3472:6: ( ( ruleOpOther ) )
        // InternalDim.g:3473:7: ( ruleOpOther )
        {
        // InternalDim.g:3473:7: ( ruleOpOther )
        // InternalDim.g:3474:8: ruleOpOther
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
    // $ANTLR end synpred6_InternalDim

    // $ANTLR start synpred7_InternalDim
    public final void synpred7_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3557:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDim.g:3557:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDim.g:3557:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDim.g:3558:6: () ( ( ruleOpAdd ) )
        {
        // InternalDim.g:3558:6: ()
        // InternalDim.g:3559:6: 
        {
        }

        // InternalDim.g:3560:6: ( ( ruleOpAdd ) )
        // InternalDim.g:3561:7: ( ruleOpAdd )
        {
        // InternalDim.g:3561:7: ( ruleOpAdd )
        // InternalDim.g:3562:8: ruleOpAdd
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
    // $ANTLR end synpred7_InternalDim

    // $ANTLR start synpred8_InternalDim
    public final void synpred8_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3645:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDim.g:3645:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDim.g:3645:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDim.g:3646:6: () ( ( ruleOpMulti ) )
        {
        // InternalDim.g:3646:6: ()
        // InternalDim.g:3647:6: 
        {
        }

        // InternalDim.g:3648:6: ( ( ruleOpMulti ) )
        // InternalDim.g:3649:7: ( ruleOpMulti )
        {
        // InternalDim.g:3649:7: ( ruleOpMulti )
        // InternalDim.g:3650:8: ruleOpMulti
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
    // $ANTLR end synpred8_InternalDim

    // $ANTLR start synpred9_InternalDim
    public final void synpred9_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3808:5: ( ( () ruleOpCast ) )
        // InternalDim.g:3808:6: ( () ruleOpCast )
        {
        // InternalDim.g:3808:6: ( () ruleOpCast )
        // InternalDim.g:3809:6: () ruleOpCast
        {
        // InternalDim.g:3809:6: ()
        // InternalDim.g:3810:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalDim

    // $ANTLR start synpred10_InternalDim
    public final void synpred10_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3905:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDim.g:3905:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDim.g:3905:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDim.g:3906:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDim.g:3906:7: ()
        // InternalDim.g:3907:7: 
        {
        }

        match(input,53,FOLLOW_3); if (state.failed) return ;
        // InternalDim.g:3909:7: ( ( RULE_ID ) )
        // InternalDim.g:3910:8: ( RULE_ID )
        {
        // InternalDim.g:3910:8: ( RULE_ID )
        // InternalDim.g:3911:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_48); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDim

    // $ANTLR start synpred11_InternalDim
    public final void synpred11_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:3974:6: ( ( () '.' ) )
        // InternalDim.g:3974:7: ( () '.' )
        {
        // InternalDim.g:3974:7: ( () '.' )
        // InternalDim.g:3975:7: () '.'
        {
        // InternalDim.g:3975:7: ()
        // InternalDim.g:3976:7: 
        {
        }

        match(input,53,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDim

    // $ANTLR start synpred12_InternalDim
    public final void synpred12_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4010:8: ( ( '(' ) )
        // InternalDim.g:4010:9: ( '(' )
        {
        // InternalDim.g:4010:9: ( '(' )
        // InternalDim.g:4011:9: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDim

    // $ANTLR start synpred13_InternalDim
    public final void synpred13_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4197:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDim.g:4197:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDim.g:4197:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDim.g:4198:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDim.g:4198:5: ()
        // InternalDim.g:4199:5: 
        {
        }

        match(input,67,FOLLOW_3); if (state.failed) return ;
        // InternalDim.g:4201:5: ( ( RULE_ID ) )
        // InternalDim.g:4202:6: ( RULE_ID )
        {
        // InternalDim.g:4202:6: ( RULE_ID )
        // InternalDim.g:4203:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_9); if (state.failed) return ;

        }


        }

        match(input,23,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDim

    // $ANTLR start synpred14_InternalDim
    public final void synpred14_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4356:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )
        // InternalDim.g:
        {
        if ( input.LA(1)==RULE_ID||(input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_STRING)||input.LA(1)==21||(input.LA(1)>=55 && input.LA(1)<=63)||input.LA(1)==67||(input.LA(1)>=71 && input.LA(1)<=76)||(input.LA(1)>=79 && input.LA(1)<=80)||(input.LA(1)>=108 && input.LA(1)<=110) ) {
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
    // $ANTLR end synpred14_InternalDim

    // $ANTLR start synpred15_InternalDim
    public final void synpred15_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4607:5: ( ( '(' ) )
        // InternalDim.g:4607:6: ( '(' )
        {
        // InternalDim.g:4607:6: ( '(' )
        // InternalDim.g:4608:6: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDim

    // $ANTLR start synpred16_InternalDim
    public final void synpred16_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4832:5: ( 'else' )
        // InternalDim.g:4832:6: 'else'
        {
        match(input,65,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalDim

    // Delegated rules

    public final boolean synpred7_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA87 dfa87 = new DFA87(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\22\1\4\1\uffff\1\22";
    static final String dfa_3s = "\1\123\2\uffff\1\27\1\4\1\uffff\1\27";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\37\uffff\1\2\1\uffff\2\1\52\uffff\2\1",
            "",
            "",
            "\1\4\2\uffff\1\5\1\uffff\1\2",
            "\1\6",
            "",
            "\1\4\2\uffff\1\5\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1428:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\153\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\6\1\4\1\3\1\0\1\7\1\5\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\15\uffff\1\1\3\uffff\3\1\1\uffff\7\1\1\uffff\2\1\6\uffff\1\1\2\uffff\1\2\1\3\3\1\12\uffff\3\1\1\uffff\3\1\10\uffff\2\1\1\uffff\2\1\4\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 3307:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\6\uffff\1\13\5\uffff";
    static final String dfa_15s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_16s = "\1\114\5\uffff\1\153\5\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\10";
    static final String dfa_18s = "\1\0\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\4\uffff\2\1\12\uffff\1\5\41\uffff\2\2\2\3\2\4\2\7\1\10\3\uffff\1\11\3\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\5\13\14\uffff\1\12\1\13\3\uffff\3\13\1\uffff\7\13\1\uffff\2\13\6\uffff\1\13\2\uffff\6\13\11\uffff\3\13\1\uffff\3\13\10\uffff\2\13\1\uffff\2\13\4\uffff\24\13",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_7;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "4114:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_0 = input.LA(1);

                         
                        int index83_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA83_0>=RULE_NATURAL && LA83_0<=RULE_STRING)||(LA83_0>=71 && LA83_0<=76)) ) {s = 1;}

                        else if ( ((LA83_0>=55 && LA83_0<=56)) ) {s = 2;}

                        else if ( ((LA83_0>=57 && LA83_0<=58)) ) {s = 3;}

                        else if ( ((LA83_0>=59 && LA83_0<=60)) ) {s = 4;}

                        else if ( (LA83_0==21) ) {s = 5;}

                        else if ( (LA83_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA83_0>=61 && LA83_0<=62)) ) {s = 7;}

                        else if ( (LA83_0==63) ) {s = 8;}

                        else if ( (LA83_0==67) && (synpred13_InternalDim())) {s = 9;}

                         
                        input.seek(index83_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\116\uffff";
    static final String dfa_21s = "\1\32\115\uffff";
    static final String dfa_22s = "\1\4\3\0\112\uffff";
    static final String dfa_23s = "\1\156\3\0\112\uffff";
    static final String dfa_24s = "\4\uffff\26\1\1\2\63\uffff";
    static final String dfa_25s = "\1\0\1\1\1\2\1\3\112\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\4\32\1\14\1\13\12\uffff\1\25\1\32\3\uffff\3\32\1\uffff\7\32\1\uffff\2\32\6\uffff\1\32\2\uffff\5\32\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\3\32\1\31\3\32\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\1\uffff\2\32\4\uffff\24\32\1\4\1\5\1\6",
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
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4355:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_0 = input.LA(1);

                         
                        int index87_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA87_0==RULE_ID) ) {s = 1;}

                        else if ( (LA87_0==79) ) {s = 2;}

                        else if ( (LA87_0==80) ) {s = 3;}

                        else if ( (LA87_0==108) && (synpred14_InternalDim())) {s = 4;}

                        else if ( (LA87_0==109) && (synpred14_InternalDim())) {s = 5;}

                        else if ( (LA87_0==110) && (synpred14_InternalDim())) {s = 6;}

                        else if ( (LA87_0==71) && (synpred14_InternalDim())) {s = 7;}

                        else if ( (LA87_0==72) && (synpred14_InternalDim())) {s = 8;}

                        else if ( (LA87_0==73) && (synpred14_InternalDim())) {s = 9;}

                        else if ( (LA87_0==74) && (synpred14_InternalDim())) {s = 10;}

                        else if ( (LA87_0==RULE_STRING) && (synpred14_InternalDim())) {s = 11;}

                        else if ( (LA87_0==RULE_NATURAL) && (synpred14_InternalDim())) {s = 12;}

                        else if ( (LA87_0==75) && (synpred14_InternalDim())) {s = 13;}

                        else if ( (LA87_0==76) && (synpred14_InternalDim())) {s = 14;}

                        else if ( (LA87_0==55) && (synpred14_InternalDim())) {s = 15;}

                        else if ( (LA87_0==56) && (synpred14_InternalDim())) {s = 16;}

                        else if ( (LA87_0==57) && (synpred14_InternalDim())) {s = 17;}

                        else if ( (LA87_0==58) && (synpred14_InternalDim())) {s = 18;}

                        else if ( (LA87_0==59) && (synpred14_InternalDim())) {s = 19;}

                        else if ( (LA87_0==60) && (synpred14_InternalDim())) {s = 20;}

                        else if ( (LA87_0==21) && (synpred14_InternalDim())) {s = 21;}

                        else if ( (LA87_0==61) && (synpred14_InternalDim())) {s = 22;}

                        else if ( (LA87_0==62) && (synpred14_InternalDim())) {s = 23;}

                        else if ( (LA87_0==63) && (synpred14_InternalDim())) {s = 24;}

                        else if ( (LA87_0==67) && (synpred14_InternalDim())) {s = 25;}

                        else if ( (LA87_0==EOF||(LA87_0>=RULE_PLAIN_TEXT_ONLY && LA87_0<=RULE_PLAIN_TEXT_END)||LA87_0==22||(LA87_0>=26 && LA87_0<=28)||(LA87_0>=30 && LA87_0<=36)||(LA87_0>=38 && LA87_0<=39)||LA87_0==46||(LA87_0>=49 && LA87_0<=53)||(LA87_0>=64 && LA87_0<=66)||(LA87_0>=68 && LA87_0<=70)||(LA87_0>=82 && LA87_0<=83)||(LA87_0>=88 && LA87_0<=107)) ) {s = 26;}

                         
                        input.seek(index87_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA87_2 = input.LA(1);

                         
                        int index87_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index87_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA87_3 = input.LA(1);

                         
                        int index87_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index87_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000C1ED11C0062L,0x0000000000300000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000C1ED1180002L,0x0000000000300000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000C1ED1100002L,0x0000000000300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001ED4000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFF80000000200610L,0x0000700000019F88L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002040060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000010C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002002040060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000D00C000010L,0x00000000000C0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200062L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000200062L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000200062L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000062L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00008C1ED5100000L,0x0000000000300000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100002200060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100002000060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000102000060L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000601ED4000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000401ED4000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x000000000F000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0006000000000002L,0x0000007E00000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0060000000200002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xFF80000000600610L,0x0000700000019F88L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xFF80000000200612L,0x0000700000019F88L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000200L,0x0000000000018000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});

}