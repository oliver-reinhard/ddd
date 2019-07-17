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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'import'", "'function'", "'('", "')'", "':'", "'aggregate'", "'{'", "'}'", "'constraint'", "'primitive'", "'redefines'", "'archetype'", "'enumeration'", "','", "'abstract'", "'root'", "'entity'", "'relationship'", "'detail'", "'extends'", "'derived'", "'composite'", "'key'", "'returns'", "'application'", "'service'", "'raises'", "'guard'", "'effect'", "'exception'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'.'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'..'", "'*'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'reference'", "'inverse'", "'synchronous'", "'async'", "'in'", "'out'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
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
    public static final int T__111=111;
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
    // InternalDim.g:72:1: ruleDDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_aggregates_8_0 = null;

        EObject lv_applications_9_0 = null;

        EObject lv_actors_10_0 = null;



        	enterRule();

        try {
            // InternalDim.g:78:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* ) )
            // InternalDim.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* )
            {
            // InternalDim.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )* )
            // InternalDim.g:80:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_types_6_0= ruleDType ) ) | ( (lv_functions_7_0= ruleDFunction ) ) | ( (lv_aggregates_8_0= ruleDAggregate ) ) | ( (lv_applications_9_0= ruleDExistingApplication ) ) | ( (lv_actors_10_0= ruleDService ) ) )*
            {
            // InternalDim.g:80:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDim.g:81:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalDim.g:81:4: (lv_imports_0_0= ruleDImport )
            	    // InternalDim.g:82:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"com.mimacom.ddd.dm.dim.Dim.DImport");
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

              			newLeafNode(otherlv_1, grammarAccess.getDDomainAccess().getDomainKeyword_1());
              		
            }
            // InternalDim.g:103:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalDim.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalDim.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalDim.g:105:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDomainAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDomainRule());
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

            // InternalDim.g:122:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDim.g:123:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDDomainAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDim.g:127:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDim.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDim.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDim.g:129:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDDomainAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_4_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDim.g:146:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_PLAIN_TEXT_START)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDim.g:147:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:147:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:148:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainRule());
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
                case 37:
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
                case 43:
                    {
                    alt4=4;
                    }
                    break;
                case 44:
                case 85:
                case 86:
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
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
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
            otherlv_4=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
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

                if ( (LA7_0==28||(LA7_0>=30 && LA7_0<=31)||(LA7_0>=33 && LA7_0<=37)) ) {
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
    // InternalDim.g:480:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DPrimitiveArchetype_1 = null;

        EObject this_DEnumeration_2 = null;

        EObject this_DEntityType_3 = null;

        EObject this_DRelationship_4 = null;

        EObject this_DDetailType_5 = null;



        	enterRule();

        try {
            // InternalDim.g:486:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType ) )
            // InternalDim.g:487:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
            {
            // InternalDim.g:487:2: (this_DPrimitive_0= ruleDPrimitive | this_DPrimitiveArchetype_1= ruleDPrimitiveArchetype | this_DEnumeration_2= ruleDEnumeration | this_DEntityType_3= ruleDEntityType | this_DRelationship_4= ruleDRelationship | this_DDetailType_5= ruleDDetailType )
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
                case 37:
                    {
                    alt8=6;
                    }
                    break;
                case 34:
                    {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==35) ) {
                        alt8=4;
                    }
                    else if ( (LA8_5==36) ) {
                        alt8=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    alt8=4;
                    }
                    break;
                case 36:
                    {
                    alt8=5;
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
                int LA8_5 = input.LA(2);

                if ( (LA8_5==35) ) {
                    alt8=4;
                }
                else if ( (LA8_5==36) ) {
                    alt8=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
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
                    // InternalDim.g:515:3: this_DEntityType_3= ruleDEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEntityTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEntityType_3=ruleDEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEntityType_3;
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
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
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
                    	    otherlv_7=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDEntityType"
    // InternalDim.g:1128:1: entryRuleDEntityType returns [EObject current=null] : iv_ruleDEntityType= ruleDEntityType EOF ;
    public final EObject entryRuleDEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEntityType = null;


        try {
            // InternalDim.g:1128:52: (iv_ruleDEntityType= ruleDEntityType EOF )
            // InternalDim.g:1129:2: iv_ruleDEntityType= ruleDEntityType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEntityTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEntityType=ruleDEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEntityType; 
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
    // $ANTLR end "entryRuleDEntityType"


    // $ANTLR start "ruleDEntityType"
    // InternalDim.g:1135:1: ruleDEntityType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) ;
    public final EObject ruleDEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        EObject this_DComplexType_3 = null;



        	enterRule();

        try {
            // InternalDim.g:1141:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] ) )
            // InternalDim.g:1142:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            {
            // InternalDim.g:1142:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current] )
            // InternalDim.g:1143:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'entity' this_DComplexType_3= ruleDComplexType[$current]
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

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDEntityTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1157:3: ( (lv_root_1_0= 'root' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDim.g:1158:4: (lv_root_1_0= 'root' )
                    {
                    // InternalDim.g:1158:4: (lv_root_1_0= 'root' )
                    // InternalDim.g:1159:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_1_0, grammarAccess.getDEntityTypeAccess().getRootRootKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDEntityTypeRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "root");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDEntityTypeAccess().getEntityKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDEntityTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDEntityTypeAccess().getDComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_3=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_3;
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
    // $ANTLR end "ruleDEntityType"


    // $ANTLR start "entryRuleDRelationship"
    // InternalDim.g:1190:1: entryRuleDRelationship returns [EObject current=null] : iv_ruleDRelationship= ruleDRelationship EOF ;
    public final EObject entryRuleDRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationship = null;


        try {
            // InternalDim.g:1190:54: (iv_ruleDRelationship= ruleDRelationship EOF )
            // InternalDim.g:1191:2: iv_ruleDRelationship= ruleDRelationship EOF
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
    // InternalDim.g:1197:1: ruleDRelationship returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] ) ;
    public final EObject ruleDRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_root_1_0=null;
        Token otherlv_2=null;
        EObject this_DComplexType_3 = null;



        	enterRule();

        try {
            // InternalDim.g:1203:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] ) )
            // InternalDim.g:1204:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] )
            {
            // InternalDim.g:1204:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current] )
            // InternalDim.g:1205:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_root_1_0= 'root' ) )? otherlv_2= 'relationship' this_DComplexType_3= ruleDComplexType[$current]
            {
            // InternalDim.g:1205:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDim.g:1206:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1206:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1207:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
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

            // InternalDim.g:1219:3: ( (lv_root_1_0= 'root' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDim.g:1220:4: (lv_root_1_0= 'root' )
                    {
                    // InternalDim.g:1220:4: (lv_root_1_0= 'root' )
                    // InternalDim.g:1221:5: lv_root_1_0= 'root'
                    {
                    lv_root_1_0=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_root_1_0, grammarAccess.getDRelationshipAccess().getRootRootKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "root", true, "root");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDRelationshipAccess().getRelationshipKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRelationshipRule());
              			}
              			newCompositeNode(grammarAccess.getDRelationshipAccess().getDComplexTypeParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_3=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_3;
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
    // InternalDim.g:1252:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalDim.g:1252:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalDim.g:1253:2: iv_ruleDDetailType= ruleDDetailType EOF
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
    // InternalDim.g:1259:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1265:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDim.g:1266:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDim.g:1266:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDim.g:1267:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDim.g:1267:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDim.g:1268:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDim.g:1268:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDim.g:1269:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
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
    // InternalDim.g:1301:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) ;
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
            // InternalDim.g:1307:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' ) )
            // InternalDim.g:1308:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            {
            // InternalDim.g:1308:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}' )
            // InternalDim.g:1309:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )* otherlv_9= '}'
            {
            // InternalDim.g:1309:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1310:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1310:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1311:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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

            // InternalDim.g:1327:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDim.g:1328:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1332:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1333:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1333:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1334:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
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
            	    break loop29;
                }
            } while (true);

            // InternalDim.g:1351:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDim.g:1352:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDim.g:1356:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDim.g:1357:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDim.g:1357:5: (otherlv_4= RULE_ID )
                    // InternalDim.g:1358:6: otherlv_4= RULE_ID
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

            // InternalDim.g:1370:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_PLAIN_TEXT_ONLY && LA31_0<=RULE_PLAIN_TEXT_START)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDim.g:1371:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:1371:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:1372:5: lv_description_5_0= ruleDRichText
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

            otherlv_6=(Token)match(input,25,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDim.g:1393:3: ( ( (lv_features_7_0= ruleDFeature ) ) | ( (lv_constraints_8_0= ruleDConstraint ) ) )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==37||(LA32_0>=39 && LA32_0<=40)||(LA32_0>=83 && LA32_0<=84)) ) {
                    alt32=1;
                }
                else if ( (LA32_0==27) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDim.g:1394:4: ( (lv_features_7_0= ruleDFeature ) )
            	    {
            	    // InternalDim.g:1394:4: ( (lv_features_7_0= ruleDFeature ) )
            	    // InternalDim.g:1395:5: (lv_features_7_0= ruleDFeature )
            	    {
            	    // InternalDim.g:1395:5: (lv_features_7_0= ruleDFeature )
            	    // InternalDim.g:1396:6: lv_features_7_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesDFeatureParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDim.g:1414:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    {
            	    // InternalDim.g:1414:4: ( (lv_constraints_8_0= ruleDConstraint ) )
            	    // InternalDim.g:1415:5: (lv_constraints_8_0= ruleDConstraint )
            	    {
            	    // InternalDim.g:1415:5: (lv_constraints_8_0= ruleDConstraint )
            	    // InternalDim.g:1416:6: lv_constraints_8_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop32;
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
    // InternalDim.g:1442:1: entryRuleDFeature returns [EObject current=null] : iv_ruleDFeature= ruleDFeature EOF ;
    public final EObject entryRuleDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFeature = null;


        try {
            // InternalDim.g:1442:49: (iv_ruleDFeature= ruleDFeature EOF )
            // InternalDim.g:1443:2: iv_ruleDFeature= ruleDFeature EOF
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
    // InternalDim.g:1449:1: ruleDFeature returns [EObject current=null] : (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) ;
    public final EObject ruleDFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DAssociation_0 = null;

        EObject this_DAttribute_1 = null;

        EObject this_DQuery_2 = null;



        	enterRule();

        try {
            // InternalDim.g:1455:2: ( (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) )
            // InternalDim.g:1456:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            {
            // InternalDim.g:1456:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalDim.g:1457:3: this_DAssociation_0= ruleDAssociation
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
                    // InternalDim.g:1466:3: this_DAttribute_1= ruleDAttribute
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
                    // InternalDim.g:1475:3: this_DQuery_2= ruleDQuery
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
    // InternalDim.g:1487:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalDim.g:1487:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalDim.g:1488:2: iv_ruleDAssociation= ruleDAssociation EOF
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
    // InternalDim.g:1494:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1500:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? ) )
            // InternalDim.g:1501:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1501:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )? )
            // InternalDim.g:1502:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )* otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ( (lv_description_10_0= ruleDRichText ) )?
            {
            // InternalDim.g:1502:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDim.g:1503:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalDim.g:1503:4: (lv_derived_0_0= 'derived' )
                    // InternalDim.g:1504:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
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

            // InternalDim.g:1516:3: ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40||LA35_0==83) ) {
                alt35=1;
            }
            else if ( (LA35_0==84) ) {
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
                    // InternalDim.g:1517:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    {
                    // InternalDim.g:1517:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    // InternalDim.g:1518:5: (lv_kind_1_0= ruleDAssociationKind )
                    {
                    // InternalDim.g:1518:5: (lv_kind_1_0= ruleDAssociationKind )
                    // InternalDim.g:1519:6: lv_kind_1_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
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
                    // InternalDim.g:1537:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalDim.g:1537:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalDim.g:1538:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalDim.g:1538:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) )
                    // InternalDim.g:1539:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    {
                    // InternalDim.g:1539:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    // InternalDim.g:1540:7: lv_kind_2_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
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

                    otherlv_3=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDAssociationAccess().getCompositeKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDim.g:1563:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDim.g:1564:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDim.g:1564:4: (lv_name_4_0= RULE_ID )
            // InternalDim.g:1565:5: lv_name_4_0= RULE_ID
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

            // InternalDim.g:1581:3: (otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDim.g:1582:4: otherlv_5= 'alias' ( (lv_aliases_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDAssociationAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDim.g:1586:4: ( (lv_aliases_6_0= RULE_ID ) )
            	    // InternalDim.g:1587:5: (lv_aliases_6_0= RULE_ID )
            	    {
            	    // InternalDim.g:1587:5: (lv_aliases_6_0= RULE_ID )
            	    // InternalDim.g:1588:6: lv_aliases_6_0= RULE_ID
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
            	    break loop36;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDAssociationAccess().getColonKeyword_4());
              		
            }
            // InternalDim.g:1609:3: ( (otherlv_8= RULE_ID ) )
            // InternalDim.g:1610:4: (otherlv_8= RULE_ID )
            {
            // InternalDim.g:1610:4: (otherlv_8= RULE_ID )
            // InternalDim.g:1611:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getDAssociationAccess().getTypeDEntityTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDim.g:1622:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDim.g:1623:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1623:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDim.g:1624:5: lv_multiplicity_9_0= ruleDMultiplicity
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

            // InternalDim.g:1641:3: ( (lv_description_10_0= ruleDRichText ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_PLAIN_TEXT_ONLY && LA38_0<=RULE_PLAIN_TEXT_START)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDim.g:1642:4: (lv_description_10_0= ruleDRichText )
                    {
                    // InternalDim.g:1642:4: (lv_description_10_0= ruleDRichText )
                    // InternalDim.g:1643:5: lv_description_10_0= ruleDRichText
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
    // InternalDim.g:1664:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalDim.g:1664:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalDim.g:1665:2: iv_ruleDAttribute= ruleDAttribute EOF
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
    // InternalDim.g:1671:1: ruleDAttribute returns [EObject current=null] : ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1677:2: ( ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDim.g:1678:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1678:2: ( ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDim.g:1679:3: ( (lv_detail_0_0= 'detail' ) )? ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_multiplicity_6_0= ruleDMultiplicity ) )? ( (lv_key_7_0= 'key' ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalDim.g:1679:3: ( (lv_detail_0_0= 'detail' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDim.g:1680:4: (lv_detail_0_0= 'detail' )
                    {
                    // InternalDim.g:1680:4: (lv_detail_0_0= 'detail' )
                    // InternalDim.g:1681:5: lv_detail_0_0= 'detail'
                    {
                    lv_detail_0_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
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

            // InternalDim.g:1693:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDim.g:1694:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            // InternalDim.g:1694:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:1695:5: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:1695:5: (lv_name_1_0= RULE_ID )
            // InternalDim.g:1696:6: lv_name_1_0= RULE_ID
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

            // InternalDim.g:1712:4: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==18) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDim.g:1713:5: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getAliasKeyword_1_1_0());
            	      				
            	    }
            	    // InternalDim.g:1717:5: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDim.g:1718:6: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDim.g:1718:6: (lv_aliases_3_0= RULE_ID )
            	    // InternalDim.g:1719:7: lv_aliases_3_0= RULE_ID
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
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDAttributeAccess().getColonKeyword_1_2());
              			
            }
            // InternalDim.g:1740:4: ( (otherlv_5= RULE_ID ) )
            // InternalDim.g:1741:5: (otherlv_5= RULE_ID )
            {
            // InternalDim.g:1741:5: (otherlv_5= RULE_ID )
            // InternalDim.g:1742:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDAttributeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getTypeDTypeCrossReference_1_3_0());
              					
            }

            }


            }


            }

            // InternalDim.g:1754:3: ( (lv_multiplicity_6_0= ruleDMultiplicity ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDim.g:1755:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1755:4: (lv_multiplicity_6_0= ruleDMultiplicity )
                    // InternalDim.g:1756:5: lv_multiplicity_6_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
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

            // InternalDim.g:1773:3: ( (lv_key_7_0= 'key' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDim.g:1774:4: (lv_key_7_0= 'key' )
                    {
                    // InternalDim.g:1774:4: (lv_key_7_0= 'key' )
                    // InternalDim.g:1775:5: lv_key_7_0= 'key'
                    {
                    lv_key_7_0=(Token)match(input,41,FOLLOW_16); if (state.failed) return current;
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

            // InternalDim.g:1787:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_PLAIN_TEXT_ONLY && LA43_0<=RULE_PLAIN_TEXT_START)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDim.g:1788:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDim.g:1788:4: (lv_description_8_0= ruleDRichText )
                    // InternalDim.g:1789:5: lv_description_8_0= ruleDRichText
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
    // InternalDim.g:1810:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalDim.g:1810:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalDim.g:1811:2: iv_ruleDQuery= ruleDQuery EOF
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
    // InternalDim.g:1817:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:1823:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? ) )
            // InternalDim.g:1824:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            {
            // InternalDim.g:1824:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )? )
            // InternalDim.g:1825:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) ( (lv_multiplicity_10_0= ruleDMultiplicity ) )? (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )? ( (lv_description_13_0= ruleDRichText ) )?
            {
            // InternalDim.g:1825:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:1826:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:1826:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:1827:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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

            // InternalDim.g:1843:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDim.g:1844:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDim.g:1848:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDim.g:1849:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDim.g:1849:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDim.g:1850:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:1871:3: ( ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDim.g:1872:4: ( (lv_parameters_4_0= ruleDQueryParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalDim.g:1872:4: ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    // InternalDim.g:1873:5: (lv_parameters_4_0= ruleDQueryParameter )
                    {
                    // InternalDim.g:1873:5: (lv_parameters_4_0= ruleDQueryParameter )
                    // InternalDim.g:1874:6: lv_parameters_4_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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

                    // InternalDim.g:1891:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==32) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDim.g:1892:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:1896:5: ( (lv_parameters_6_0= ruleDQueryParameter ) )
                    	    // InternalDim.g:1897:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    {
                    	    // InternalDim.g:1897:6: (lv_parameters_6_0= ruleDQueryParameter )
                    	    // InternalDim.g:1898:7: lv_parameters_6_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDQueryAccess().getColonKeyword_5());
              		
            }
            // InternalDim.g:1925:3: ( (otherlv_9= RULE_ID ) )
            // InternalDim.g:1926:4: (otherlv_9= RULE_ID )
            {
            // InternalDim.g:1926:4: (otherlv_9= RULE_ID )
            // InternalDim.g:1927:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_6_0());
              				
            }

            }


            }

            // InternalDim.g:1938:3: ( (lv_multiplicity_10_0= ruleDMultiplicity ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDim.g:1939:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:1939:4: (lv_multiplicity_10_0= ruleDMultiplicity )
                    // InternalDim.g:1940:5: lv_multiplicity_10_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
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

            // InternalDim.g:1957:3: (otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDim.g:1958:4: otherlv_11= 'returns' ( (lv_returns_12_0= ruleDExpression ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDQueryAccess().getReturnsKeyword_8_0());
                      			
                    }
                    // InternalDim.g:1962:4: ( (lv_returns_12_0= ruleDExpression ) )
                    // InternalDim.g:1963:5: (lv_returns_12_0= ruleDExpression )
                    {
                    // InternalDim.g:1963:5: (lv_returns_12_0= ruleDExpression )
                    // InternalDim.g:1964:6: lv_returns_12_0= ruleDExpression
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

            // InternalDim.g:1982:3: ( (lv_description_13_0= ruleDRichText ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_PLAIN_TEXT_ONLY && LA49_0<=RULE_PLAIN_TEXT_START)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDim.g:1983:4: (lv_description_13_0= ruleDRichText )
                    {
                    // InternalDim.g:1983:4: (lv_description_13_0= ruleDRichText )
                    // InternalDim.g:1984:5: lv_description_13_0= ruleDRichText
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
    // InternalDim.g:2005:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalDim.g:2005:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalDim.g:2006:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
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
    // InternalDim.g:2012:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2018:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDim.g:2019:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2019:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDim.g:2020:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDim.g:2020:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDim.g:2021:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDim.g:2021:4: (lv_name_0_0= RULE_ID )
            // InternalDim.g:2022:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDim.g:2042:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:2043:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:2043:4: (otherlv_2= RULE_ID )
            // InternalDim.g:2044:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDim.g:2055:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDim.g:2056:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2056:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDim.g:2057:5: lv_multiplicity_3_0= ruleDMultiplicity
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

            // InternalDim.g:2074:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_PLAIN_TEXT_ONLY && LA51_0<=RULE_PLAIN_TEXT_START)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDim.g:2075:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDim.g:2075:4: (lv_description_4_0= ruleDRichText )
                    // InternalDim.g:2076:5: lv_description_4_0= ruleDRichText
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
    // InternalDim.g:2097:1: entryRuleDExistingApplication returns [EObject current=null] : iv_ruleDExistingApplication= ruleDExistingApplication EOF ;
    public final EObject entryRuleDExistingApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExistingApplication = null;


        try {
            // InternalDim.g:2097:61: (iv_ruleDExistingApplication= ruleDExistingApplication EOF )
            // InternalDim.g:2098:2: iv_ruleDExistingApplication= ruleDExistingApplication EOF
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
    // InternalDim.g:2104:1: ruleDExistingApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) ;
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
            // InternalDim.g:2110:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' ) )
            // InternalDim.g:2111:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            {
            // InternalDim.g:2111:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}' )
            // InternalDim.g:2112:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExistingApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalDim.g:2116:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2117:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2117:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2118:5: lv_name_1_0= RULE_ID
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

            // InternalDim.g:2134:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_PLAIN_TEXT_ONLY && LA52_0<=RULE_PLAIN_TEXT_START)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDim.g:2135:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDim.g:2135:4: (lv_description_2_0= ruleDRichText )
                    // InternalDim.g:2136:5: lv_description_2_0= ruleDRichText
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

            otherlv_3=(Token)match(input,25,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDExistingApplicationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDim.g:2157:3: ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) | ( (lv_types_6_0= ruleDType ) ) )*
            loop53:
            do {
                int alt53=4;
                switch ( input.LA(1) ) {
                case 44:
                case 85:
                case 86:
                    {
                    alt53=1;
                    }
                    break;
                case 48:
                    {
                    alt53=2;
                    }
                    break;
                case 28:
                case 30:
                case 31:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    {
                    alt53=3;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalDim.g:2158:4: ( (lv_services_4_0= ruleDService ) )
            	    {
            	    // InternalDim.g:2158:4: ( (lv_services_4_0= ruleDService ) )
            	    // InternalDim.g:2159:5: (lv_services_4_0= ruleDService )
            	    {
            	    // InternalDim.g:2159:5: (lv_services_4_0= ruleDService )
            	    // InternalDim.g:2160:6: lv_services_4_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getServicesDServiceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    // InternalDim.g:2178:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    {
            	    // InternalDim.g:2178:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    // InternalDim.g:2179:5: (lv_exceptions_5_0= ruleDException )
            	    {
            	    // InternalDim.g:2179:5: (lv_exceptions_5_0= ruleDException )
            	    // InternalDim.g:2180:6: lv_exceptions_5_0= ruleDException
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getExceptionsDExceptionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    // InternalDim.g:2198:4: ( (lv_types_6_0= ruleDType ) )
            	    {
            	    // InternalDim.g:2198:4: ( (lv_types_6_0= ruleDType ) )
            	    // InternalDim.g:2199:5: (lv_types_6_0= ruleDType )
            	    {
            	    // InternalDim.g:2199:5: (lv_types_6_0= ruleDType )
            	    // InternalDim.g:2200:6: lv_types_6_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getTypesDTypeParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop53;
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
    // InternalDim.g:2226:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDim.g:2226:49: (iv_ruleDService= ruleDService EOF )
            // InternalDim.g:2227:2: iv_ruleDService= ruleDService EOF
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
    // InternalDim.g:2233:1: ruleDService returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )* (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )* ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) ;
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

        EObject lv_guards_15_0 = null;

        EObject lv_effects_17_0 = null;

        EObject lv_types_18_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2239:2: ( ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )* (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )* ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' ) )
            // InternalDim.g:2240:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )* (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )* ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            {
            // InternalDim.g:2240:2: ( ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )* (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )* ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}' )
            // InternalDim.g:2241:3: ( (lv_kind_0_0= ruleDServiceKind ) )? otherlv_1= 'service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )? (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ( (lv_description_12_0= ruleDRichText ) )? otherlv_13= '{' (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )* (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )* ( (lv_types_18_0= ruleDType ) )* otherlv_19= '}'
            {
            // InternalDim.g:2241:3: ( (lv_kind_0_0= ruleDServiceKind ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=85 && LA54_0<=86)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDim.g:2242:4: (lv_kind_0_0= ruleDServiceKind )
                    {
                    // InternalDim.g:2242:4: (lv_kind_0_0= ruleDServiceKind )
                    // InternalDim.g:2243:5: lv_kind_0_0= ruleDServiceKind
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getKindDServiceKindEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
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

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getServiceKeyword_1());
              		
            }
            // InternalDim.g:2264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDim.g:2265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDim.g:2265:4: (lv_name_2_0= RULE_ID )
            // InternalDim.g:2266:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
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

            // InternalDim.g:2282:3: (otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDim.g:2283:4: otherlv_3= '(' ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalDim.g:2287:4: ( ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=87 && LA56_0<=88)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalDim.g:2288:5: ( (lv_parameters_4_0= ruleDServiceParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            {
                            // InternalDim.g:2288:5: ( (lv_parameters_4_0= ruleDServiceParameter ) )
                            // InternalDim.g:2289:6: (lv_parameters_4_0= ruleDServiceParameter )
                            {
                            // InternalDim.g:2289:6: (lv_parameters_4_0= ruleDServiceParameter )
                            // InternalDim.g:2290:7: lv_parameters_4_0= ruleDServiceParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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

                            // InternalDim.g:2307:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==32) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalDim.g:2308:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_44); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDServiceAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDim.g:2312:6: ( (lv_parameters_6_0= ruleDServiceParameter ) )
                            	    // InternalDim.g:2313:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    {
                            	    // InternalDim.g:2313:7: (lv_parameters_6_0= ruleDServiceParameter )
                            	    // InternalDim.g:2314:8: lv_parameters_6_0= ruleDServiceParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_37);
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
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDServiceAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:2338:3: (otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDim.g:2339:4: otherlv_8= 'raises' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDServiceAccess().getRaisesKeyword_4_0());
                      			
                    }
                    // InternalDim.g:2343:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDim.g:2344:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDim.g:2344:5: (otherlv_9= RULE_ID )
                    // InternalDim.g:2345:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDServiceRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalDim.g:2356:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==32) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDim.g:2357:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getDServiceAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalDim.g:2361:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalDim.g:2362:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalDim.g:2362:6: (otherlv_11= RULE_ID )
                    	    // InternalDim.g:2363:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDServiceRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_4_2_1_0());
                    	      						
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
                    break;

            }

            // InternalDim.g:2376:3: ( (lv_description_12_0= ruleDRichText ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_PLAIN_TEXT_ONLY && LA60_0<=RULE_PLAIN_TEXT_START)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDim.g:2377:4: (lv_description_12_0= ruleDRichText )
                    {
                    // InternalDim.g:2377:4: (lv_description_12_0= ruleDRichText )
                    // InternalDim.g:2378:5: lv_description_12_0= ruleDRichText
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

            otherlv_13=(Token)match(input,25,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDServiceAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDim.g:2399:3: (otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==46) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalDim.g:2400:4: otherlv_14= 'guard' ( (lv_guards_15_0= ruleDExpression ) )
            	    {
            	    otherlv_14=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_14, grammarAccess.getDServiceAccess().getGuardKeyword_7_0());
            	      			
            	    }
            	    // InternalDim.g:2404:4: ( (lv_guards_15_0= ruleDExpression ) )
            	    // InternalDim.g:2405:5: (lv_guards_15_0= ruleDExpression )
            	    {
            	    // InternalDim.g:2405:5: (lv_guards_15_0= ruleDExpression )
            	    // InternalDim.g:2406:6: lv_guards_15_0= ruleDExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDServiceAccess().getGuardsDExpressionParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_guards_15_0=ruleDExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDServiceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"guards",
            	      							lv_guards_15_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalDim.g:2424:3: (otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==47) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDim.g:2425:4: otherlv_16= 'effect' ( (lv_effects_17_0= ruleDExpression ) )
            	    {
            	    otherlv_16=(Token)match(input,47,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_16, grammarAccess.getDServiceAccess().getEffectKeyword_8_0());
            	      			
            	    }
            	    // InternalDim.g:2429:4: ( (lv_effects_17_0= ruleDExpression ) )
            	    // InternalDim.g:2430:5: (lv_effects_17_0= ruleDExpression )
            	    {
            	    // InternalDim.g:2430:5: (lv_effects_17_0= ruleDExpression )
            	    // InternalDim.g:2431:6: lv_effects_17_0= ruleDExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDServiceAccess().getEffectsDExpressionParserRuleCall_8_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_effects_17_0=ruleDExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDServiceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"effects",
            	      							lv_effects_17_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
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

            // InternalDim.g:2449:3: ( (lv_types_18_0= ruleDType ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==28||(LA63_0>=30 && LA63_0<=31)||(LA63_0>=33 && LA63_0<=37)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDim.g:2450:4: (lv_types_18_0= ruleDType )
            	    {
            	    // InternalDim.g:2450:4: (lv_types_18_0= ruleDType )
            	    // InternalDim.g:2451:5: lv_types_18_0= ruleDType
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
            	    break loop63;
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
    // InternalDim.g:2476:1: entryRuleDServiceParameter returns [EObject current=null] : iv_ruleDServiceParameter= ruleDServiceParameter EOF ;
    public final EObject entryRuleDServiceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDServiceParameter = null;


        try {
            // InternalDim.g:2476:58: (iv_ruleDServiceParameter= ruleDServiceParameter EOF )
            // InternalDim.g:2477:2: iv_ruleDServiceParameter= ruleDServiceParameter EOF
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
    // InternalDim.g:2483:1: ruleDServiceParameter returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
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
            // InternalDim.g:2489:2: ( ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDim.g:2490:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2490:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDim.g:2491:3: ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDim.g:2491:3: ( (lv_direction_0_0= ruleDDirection ) )
            // InternalDim.g:2492:4: (lv_direction_0_0= ruleDDirection )
            {
            // InternalDim.g:2492:4: (lv_direction_0_0= ruleDDirection )
            // InternalDim.g:2493:5: lv_direction_0_0= ruleDDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDirectionDDirectionEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalDim.g:2510:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2511:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2511:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2512:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDServiceParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDim.g:2532:3: ( (otherlv_3= RULE_ID ) )
            // InternalDim.g:2533:4: (otherlv_3= RULE_ID )
            {
            // InternalDim.g:2533:4: (otherlv_3= RULE_ID )
            // InternalDim.g:2534:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDServiceParameterAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDim.g:2545:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==21) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDim.g:2546:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDim.g:2546:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDim.g:2547:5: lv_multiplicity_4_0= ruleDMultiplicity
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

            // InternalDim.g:2564:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_PLAIN_TEXT_ONLY && LA65_0<=RULE_PLAIN_TEXT_START)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDim.g:2565:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDim.g:2565:4: (lv_description_5_0= ruleDRichText )
                    // InternalDim.g:2566:5: lv_description_5_0= ruleDRichText
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
    // InternalDim.g:2587:1: entryRuleDException returns [EObject current=null] : iv_ruleDException= ruleDException EOF ;
    public final EObject entryRuleDException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDException = null;


        try {
            // InternalDim.g:2587:51: (iv_ruleDException= ruleDException EOF )
            // InternalDim.g:2588:2: iv_ruleDException= ruleDException EOF
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
    // InternalDim.g:2594:1: ruleDException returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) ;
    public final EObject ruleDException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalDim.g:2600:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) )
            // InternalDim.g:2601:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            {
            // InternalDim.g:2601:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            // InternalDim.g:2602:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExceptionAccess().getExceptionKeyword_0());
              		
            }
            // InternalDim.g:2606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDim.g:2607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDim.g:2607:4: (lv_name_1_0= RULE_ID )
            // InternalDim.g:2608:5: lv_name_1_0= RULE_ID
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

            // InternalDim.g:2624:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_PLAIN_TEXT_ONLY && LA66_0<=RULE_PLAIN_TEXT_START)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDim.g:2625:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDim.g:2625:4: (lv_description_2_0= ruleDRichText )
                    // InternalDim.g:2626:5: lv_description_2_0= ruleDRichText
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


    // $ANTLR start "entryRuleDExpression"
    // InternalDim.g:2647:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDim.g:2647:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDim.g:2648:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDim.g:2654:1: ruleDExpression returns [EObject current=null] : (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;

        EObject this_DRichText_1 = null;



        	enterRule();

        try {
            // InternalDim.g:2660:2: ( (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) )
            // InternalDim.g:2661:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            {
            // InternalDim.g:2661:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||(LA67_0>=RULE_NATURAL && LA67_0<=RULE_STRING)||LA67_0==21||(LA67_0>=56 && LA67_0<=64)||LA67_0==68||(LA67_0>=72 && LA67_0<=77)||(LA67_0>=80 && LA67_0<=81)||(LA67_0>=109 && LA67_0<=111)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_PLAIN_TEXT_ONLY && LA67_0<=RULE_PLAIN_TEXT_START)) ) {
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
                    // InternalDim.g:2662:3: this_DAssignment_0= ruleDAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalDim.g:2671:3: this_DRichText_1= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRichText_1=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRichText_1;
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
    // InternalDim.g:2683:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDim.g:2683:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDim.g:2684:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDim.g:2690:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) ;
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
            // InternalDim.g:2696:2: ( ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDim.g:2697:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDim.g:2697:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_PLAIN_TEXT_START) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalDim.g:2698:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    {
                    // InternalDim.g:2698:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    // InternalDim.g:2699:4: (lv_segments_0_0= ruleDTextOnly )
                    {
                    // InternalDim.g:2699:4: (lv_segments_0_0= ruleDTextOnly )
                    // InternalDim.g:2700:5: lv_segments_0_0= ruleDTextOnly
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextOnlyParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_0_0=ruleDTextOnly();

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
                      						"com.mimacom.ddd.dm.dmx.Dmx.DTextOnly");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:2718:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDim.g:2718:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    // InternalDim.g:2719:4: ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) )
                    {
                    // InternalDim.g:2719:4: ( (lv_segments_1_0= ruleDTextStart ) )
                    // InternalDim.g:2720:5: (lv_segments_1_0= ruleDTextStart )
                    {
                    // InternalDim.g:2720:5: (lv_segments_1_0= ruleDTextStart )
                    // InternalDim.g:2721:6: lv_segments_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_segments_1_0=ruleDTextStart();

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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextStart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:2738:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDim.g:2739:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDim.g:2739:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDim.g:2740:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    // InternalDim.g:2757:4: ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalDim.g:2758:5: ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDim.g:2758:5: ( (lv_segments_3_0= ruleDTextMiddle ) )
                    	    // InternalDim.g:2759:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDim.g:2759:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    // InternalDim.g:2760:7: lv_segments_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_segments_3_0=ruleDTextMiddle();

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
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DTextMiddle");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalDim.g:2777:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDim.g:2778:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:2778:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDim.g:2779:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop68;
                        }
                    } while (true);

                    // InternalDim.g:2797:4: ( (lv_segments_5_0= ruleDTextEnd ) )
                    // InternalDim.g:2798:5: (lv_segments_5_0= ruleDTextEnd )
                    {
                    // InternalDim.g:2798:5: (lv_segments_5_0= ruleDTextEnd )
                    // InternalDim.g:2799:6: lv_segments_5_0= ruleDTextEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_5_0=ruleDTextEnd();

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
    // InternalDim.g:2821:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDim.g:2821:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDim.g:2822:2: iv_ruleDTextOnly= ruleDTextOnly EOF
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
    // InternalDim.g:2828:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2834:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDim.g:2835:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDim.g:2835:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDim.g:2836:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDim.g:2836:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDim.g:2837:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDim.g:2856:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDim.g:2856:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDim.g:2857:2: iv_ruleDTextStart= ruleDTextStart EOF
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
    // InternalDim.g:2863:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2869:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDim.g:2870:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDim.g:2870:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDim.g:2871:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDim.g:2871:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDim.g:2872:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalDim.g:2891:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDim.g:2891:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDim.g:2892:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
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
    // InternalDim.g:2898:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2904:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDim.g:2905:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDim.g:2905:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDim.g:2906:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDim.g:2906:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDim.g:2907:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDim.g:2926:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDim.g:2926:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDim.g:2927:2: iv_ruleDTextEnd= ruleDTextEnd EOF
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
    // InternalDim.g:2933:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDim.g:2939:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDim.g:2940:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDim.g:2940:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDim.g:2941:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDim.g:2941:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDim.g:2942:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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


    // $ANTLR start "entryRuleDAssignment"
    // InternalDim.g:2961:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDim.g:2961:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDim.g:2962:2: iv_ruleDAssignment= ruleDAssignment EOF
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
    // InternalDim.g:2968:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDim.g:2974:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDim.g:2975:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDim.g:2975:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==EOF||(LA70_1>=RULE_ID && LA70_1<=RULE_PLAIN_TEXT_END)||(LA70_1>=21 && LA70_1<=22)||(LA70_1>=26 && LA70_1<=28)||(LA70_1>=30 && LA70_1<=37)||(LA70_1>=39 && LA70_1<=40)||(LA70_1>=46 && LA70_1<=47)||(LA70_1>=50 && LA70_1<=55)||(LA70_1>=65 && LA70_1<=67)||(LA70_1>=69 && LA70_1<=71)||(LA70_1>=80 && LA70_1<=81)||(LA70_1>=83 && LA70_1<=84)||(LA70_1>=89 && LA70_1<=108)) ) {
                    alt70=2;
                }
                else if ( (LA70_1==49) ) {
                    alt70=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA70_0>=RULE_NATURAL && LA70_0<=RULE_STRING)||LA70_0==21||(LA70_0>=56 && LA70_0<=64)||LA70_0==68||(LA70_0>=72 && LA70_0<=77)||(LA70_0>=80 && LA70_0<=81)||(LA70_0>=109 && LA70_0<=111)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalDim.g:2976:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDim.g:2976:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDim.g:2977:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDim.g:2977:4: ()
                    // InternalDim.g:2978:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:2984:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDim.g:2985:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDim.g:2985:5: (otherlv_1= RULE_ID )
                    // InternalDim.g:2986:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDNavigableMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDim.g:3004:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDim.g:3005:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDim.g:3005:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDim.g:3006:6: lv_value_3_0= ruleDAssignment
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
                    // InternalDim.g:3025:3: this_DOrExpression_4= ruleDOrExpression
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
    // InternalDim.g:3037:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDim.g:3037:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDim.g:3038:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // InternalDim.g:3044:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3050:2: (kw= ':=' )
            // InternalDim.g:3051:2: kw= ':='
            {
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3059:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDim.g:3059:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDim.g:3060:2: iv_ruleDOrExpression= ruleDOrExpression EOF
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
    // InternalDim.g:3066:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3072:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDim.g:3073:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDim.g:3073:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDim.g:3074:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3082:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                switch ( input.LA(1) ) {
                case 89:
                    {
                    int LA71_2 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt71=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA71_3 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt71=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA71_4 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt71=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA71_5 = input.LA(2);

                    if ( (synpred1_InternalDim()) ) {
                        alt71=1;
                    }


                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // InternalDim.g:3083:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDim.g:3083:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDim.g:3084:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDim.g:3094:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDim.g:3095:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDim.g:3095:6: ()
            	    // InternalDim.g:3096:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3102:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDim.g:3103:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDim.g:3103:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDim.g:3104:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3123:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDim.g:3124:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDim.g:3124:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDim.g:3125:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleDOrExpression"


    // $ANTLR start "entryRuleDAndExpression"
    // InternalDim.g:3147:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDim.g:3147:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDim.g:3148:2: iv_ruleDAndExpression= ruleDAndExpression EOF
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
    // InternalDim.g:3154:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3160:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDim.g:3161:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDim.g:3161:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDim.g:3162:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3170:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==93) ) {
                    int LA72_2 = input.LA(2);

                    if ( (synpred2_InternalDim()) ) {
                        alt72=1;
                    }


                }
                else if ( (LA72_0==94) ) {
                    int LA72_3 = input.LA(2);

                    if ( (synpred2_InternalDim()) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // InternalDim.g:3171:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDim.g:3171:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDim.g:3172:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDim.g:3182:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDim.g:3183:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDim.g:3183:6: ()
            	    // InternalDim.g:3184:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3190:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDim.g:3191:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDim.g:3191:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDim.g:3192:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3211:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDim.g:3212:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDim.g:3212:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDim.g:3213:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    break loop72;
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
    // InternalDim.g:3235:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDim.g:3235:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDim.g:3236:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
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
    // InternalDim.g:3242:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3248:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDim.g:3249:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDim.g:3249:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDim.g:3250:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3258:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                switch ( input.LA(1) ) {
                case 95:
                    {
                    int LA73_2 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA73_3 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;
                case 97:
                    {
                    int LA73_4 = input.LA(2);

                    if ( (synpred3_InternalDim()) ) {
                        alt73=1;
                    }


                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // InternalDim.g:3259:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDim.g:3259:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDim.g:3260:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDim.g:3270:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDim.g:3271:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDim.g:3271:6: ()
            	    // InternalDim.g:3272:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3278:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDim.g:3279:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDim.g:3279:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDim.g:3280:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3299:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDim.g:3300:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDim.g:3300:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDim.g:3301:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleDEqualityExpression"


    // $ANTLR start "entryRuleDRelationalExpression"
    // InternalDim.g:3323:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDim.g:3323:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDim.g:3324:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
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
    // InternalDim.g:3330:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3336:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDim.g:3337:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDim.g:3337:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDim.g:3338:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3346:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop74:
            do {
                int alt74=3;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // InternalDim.g:3347:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDim.g:3347:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDim.g:3348:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDim.g:3348:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDim.g:3349:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDim.g:3355:6: ( () ruleOpInstanceOf )
            	    // InternalDim.g:3356:7: () ruleOpInstanceOf
            	    {
            	    // InternalDim.g:3356:7: ()
            	    // InternalDim.g:3357:8: 
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
            	    pushFollow(FOLLOW_4);
            	    ruleOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3372:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3373:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3373:6: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3374:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDim.g:3387:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDim.g:3387:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDim.g:3388:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDim.g:3388:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDim.g:3389:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDim.g:3399:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDim.g:3400:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDim.g:3400:7: ()
            	    // InternalDim.g:3401:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDim.g:3407:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDim.g:3408:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDim.g:3408:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDim.g:3409:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3428:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDim.g:3429:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDim.g:3429:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDim.g:3430:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalDim.g:3453:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDim.g:3453:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDim.g:3454:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
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
    // InternalDim.g:3460:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3466:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDim.g:3467:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDim.g:3467:2: (kw= 'ISA' | kw= 'isa' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==50) ) {
                alt75=1;
            }
            else if ( (LA75_0==51) ) {
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
                    // InternalDim.g:3468:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:3474:3: kw= 'isa'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:3483:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDim.g:3483:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDim.g:3484:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
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
    // InternalDim.g:3490:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3496:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDim.g:3497:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDim.g:3497:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDim.g:3498:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3506:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop76:
            do {
                int alt76=2;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    int LA76_2 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt76=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA76_3 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt76=1;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA76_4 = input.LA(2);

                    if ( (synpred6_InternalDim()) ) {
                        alt76=1;
                    }


                    }
                    break;

                }

                switch (alt76) {
            	case 1 :
            	    // InternalDim.g:3507:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDim.g:3507:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDim.g:3508:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDim.g:3518:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDim.g:3519:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDim.g:3519:6: ()
            	    // InternalDim.g:3520:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3526:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDim.g:3527:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDim.g:3527:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDim.g:3528:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3547:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDim.g:3548:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDim.g:3548:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDim.g:3549:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
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
            	    break loop76;
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
    // InternalDim.g:3571:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDim.g:3571:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDim.g:3572:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
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
    // InternalDim.g:3578:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3584:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDim.g:3585:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDim.g:3585:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDim.g:3586:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3594:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==80) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred7_InternalDim()) ) {
                        alt77=1;
                    }


                }
                else if ( (LA77_0==81) ) {
                    int LA77_3 = input.LA(2);

                    if ( (synpred7_InternalDim()) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // InternalDim.g:3595:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDim.g:3595:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDim.g:3596:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDim.g:3606:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDim.g:3607:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDim.g:3607:6: ()
            	    // InternalDim.g:3608:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3614:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDim.g:3615:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDim.g:3615:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDim.g:3616:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3635:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDim.g:3636:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDim.g:3636:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDim.g:3637:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
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
            	    break loop77;
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
    // InternalDim.g:3659:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDim.g:3659:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDim.g:3660:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
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
    // InternalDim.g:3666:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3672:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDim.g:3673:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDim.g:3673:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDim.g:3674:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3682:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop78:
            do {
                int alt78=2;
                switch ( input.LA(1) ) {
                case 71:
                    {
                    int LA78_2 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA78_3 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA78_4 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA78_5 = input.LA(2);

                    if ( (synpred8_InternalDim()) ) {
                        alt78=1;
                    }


                    }
                    break;

                }

                switch (alt78) {
            	case 1 :
            	    // InternalDim.g:3683:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDim.g:3683:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDim.g:3684:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDim.g:3694:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDim.g:3695:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDim.g:3695:6: ()
            	    // InternalDim.g:3696:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDim.g:3702:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDim.g:3703:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDim.g:3703:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDim.g:3704:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_51);
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

            	    // InternalDim.g:3723:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDim.g:3724:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDim.g:3724:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDim.g:3725:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    break loop78;
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
    // InternalDim.g:3747:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDim.g:3747:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDim.g:3748:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
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
    // InternalDim.g:3754:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDim.g:3760:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDim.g:3761:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDim.g:3761:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=80 && LA79_0<=81)||(LA79_0>=109 && LA79_0<=111)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_ID||(LA79_0>=RULE_NATURAL && LA79_0<=RULE_STRING)||LA79_0==21||(LA79_0>=56 && LA79_0<=64)||LA79_0==68||(LA79_0>=72 && LA79_0<=77)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalDim.g:3762:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDim.g:3762:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDim.g:3763:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDim.g:3763:4: ()
                    // InternalDim.g:3764:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDim.g:3770:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDim.g:3771:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDim.g:3771:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDim.g:3772:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
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

                    // InternalDim.g:3789:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDim.g:3790:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDim.g:3790:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDim.g:3791:6: lv_operand_2_0= ruleDUnaryOperation
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
                    // InternalDim.g:3810:3: this_DCastExpression_3= ruleDCastExpression
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
    // InternalDim.g:3822:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDim.g:3822:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDim.g:3823:2: iv_ruleDCastExpression= ruleDCastExpression EOF
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
    // InternalDim.g:3829:1: ruleDCastExpression returns [EObject current=null] : (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDim.g:3835:2: ( (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDim.g:3836:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDim.g:3836:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDim.g:3837:3: this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DNavigableMemberReference_0=ruleDNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3845:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==52) ) {
                int LA80_1 = input.LA(2);

                if ( (synpred9_InternalDim()) ) {
                    alt80=1;
                }
            }
            else if ( (LA80_0==53) ) {
                int LA80_2 = input.LA(2);

                if ( (synpred9_InternalDim()) ) {
                    alt80=1;
                }
            }
            switch (alt80) {
                case 1 :
                    // InternalDim.g:3846:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDim.g:3846:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDim.g:3847:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDim.g:3853:5: ( () ruleOpCast )
                    // InternalDim.g:3854:6: () ruleOpCast
                    {
                    // InternalDim.g:3854:6: ()
                    // InternalDim.g:3855:7: 
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
                    pushFollow(FOLLOW_4);
                    ruleOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDim.g:3870:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDim.g:3871:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDim.g:3871:5: (otherlv_3= RULE_ID )
                    // InternalDim.g:3872:6: otherlv_3= RULE_ID
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
    // InternalDim.g:3888:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDim.g:3888:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDim.g:3889:2: iv_ruleOpCast= ruleOpCast EOF
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
    // InternalDim.g:3895:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:3901:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDim.g:3902:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDim.g:3902:2: (kw= 'AS' | kw= 'as' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==52) ) {
                alt81=1;
            }
            else if ( (LA81_0==53) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalDim.g:3903:3: kw= 'AS'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:3909:3: kw= 'as'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDNavigableMemberReference"
    // InternalDim.g:3918:1: entryRuleDNavigableMemberReference returns [EObject current=null] : iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF ;
    public final EObject entryRuleDNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNavigableMemberReference = null;


        try {
            // InternalDim.g:3918:66: (iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF )
            // InternalDim.g:3919:2: iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNavigableMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNavigableMemberReference=ruleDNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNavigableMemberReference; 
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
    // $ANTLR end "entryRuleDNavigableMemberReference"


    // $ANTLR start "ruleDNavigableMemberReference"
    // InternalDim.g:3925:1: ruleDNavigableMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
    public final EObject ruleDNavigableMemberReference() throws RecognitionException {
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
            // InternalDim.g:3931:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalDim.g:3932:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalDim.g:3932:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalDim.g:3933:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:3941:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop85:
            do {
                int alt85=3;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==54) ) {
                    int LA85_2 = input.LA(2);

                    if ( (synpred10_InternalDim()) ) {
                        alt85=1;
                    }
                    else if ( (synpred11_InternalDim()) ) {
                        alt85=2;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // InternalDim.g:3942:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDim.g:3942:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDim.g:3943:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDim.g:3943:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDim.g:3944:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDim.g:3956:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDim.g:3957:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDim.g:3957:7: ()
            	    // InternalDim.g:3958:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDim.g:3968:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDim.g:3969:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDim.g:3969:8: (otherlv_3= RULE_ID )
            	    // InternalDim.g:3970:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_51);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:3990:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDim.g:3991:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDim.g:3991:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDim.g:3992:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_value_5_0=ruleDAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
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
            	    // InternalDim.g:4011:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalDim.g:4011:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalDim.g:4012:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalDim.g:4012:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDim.g:4013:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDim.g:4019:6: ( () otherlv_7= '.' )
            	    // InternalDim.g:4020:7: () otherlv_7= '.'
            	    {
            	    // InternalDim.g:4020:7: ()
            	    // InternalDim.g:4021:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDNavigableMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:4033:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDim.g:4034:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDim.g:4034:6: (otherlv_8= RULE_ID )
            	    // InternalDim.g:4035:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDim.g:4046:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt84=3;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==21) && (synpred12_InternalDim())) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==55) ) {
            	        alt84=2;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // InternalDim.g:4047:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalDim.g:4047:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalDim.g:4048:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDim.g:4048:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDim.g:4049:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDim.g:4053:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDim.g:4054:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,21,FOLLOW_62); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDNavigableMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	              									}
            	              									setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              								
            	            }

            	            }


            	            }

            	            // InternalDim.g:4066:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt83=2;
            	            int LA83_0 = input.LA(1);

            	            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_PLAIN_TEXT_START)||(LA83_0>=RULE_NATURAL && LA83_0<=RULE_STRING)||LA83_0==21||(LA83_0>=56 && LA83_0<=64)||LA83_0==68||(LA83_0>=72 && LA83_0<=77)||(LA83_0>=80 && LA83_0<=81)||(LA83_0>=109 && LA83_0<=111)) ) {
            	                alt83=1;
            	            }
            	            switch (alt83) {
            	                case 1 :
            	                    // InternalDim.g:4067:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDim.g:4067:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDim.g:4068:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDim.g:4068:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDim.g:4069:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_37);
            	                    lv_memberCallArguments_10_0=ruleDExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
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

            	                    // InternalDim.g:4086:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop82:
            	                    do {
            	                        int alt82=2;
            	                        int LA82_0 = input.LA(1);

            	                        if ( (LA82_0==32) ) {
            	                            alt82=1;
            	                        }


            	                        switch (alt82) {
            	                    	case 1 :
            	                    	    // InternalDim.g:4087:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDNavigableMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalDim.g:4091:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDim.g:4092:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDim.g:4092:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDim.g:4093:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_37);
            	                    	    lv_memberCallArguments_12_0=ruleDExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											if (current==null) {
            	                    	      												current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
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
            	                    	    break loop82;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDim.g:4118:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalDim.g:4118:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalDim.g:4119:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalDim.g:4119:7: (lv_before_14_0= '@before' )
            	            // InternalDim.g:4120:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,55,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_before_14_0, grammarAccess.getDNavigableMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
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
            	    break loop85;
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
    // $ANTLR end "ruleDNavigableMemberReference"


    // $ANTLR start "entryRuleDPrimaryExpression"
    // InternalDim.g:4139:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDim.g:4139:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDim.g:4140:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
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
    // InternalDim.g:4146:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
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
            // InternalDim.g:4152:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDim.g:4153:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDim.g:4153:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt86=10;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalDim.g:4154:3: this_DLiteralExpression_0= ruleDLiteralExpression
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
                    // InternalDim.g:4163:3: this_DSelfExpression_1= ruleDSelfExpression
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
                    // InternalDim.g:4172:3: this_DReturnExpression_2= ruleDReturnExpression
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
                    // InternalDim.g:4181:3: this_DRaiseExpression_3= ruleDRaiseExpression
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
                    // InternalDim.g:4190:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
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
                    // InternalDim.g:4199:3: this_DFunctionCall_5= ruleDFunctionCall
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
                    // InternalDim.g:4208:3: this_DConstructorCall_6= ruleDConstructorCall
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
                    // InternalDim.g:4217:3: this_DContextReference_7= ruleDContextReference
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
                    // InternalDim.g:4226:3: this_DIfExpression_8= ruleDIfExpression
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
                    // InternalDim.g:4235:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDim.g:4235:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDim.g:4236:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
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
    // InternalDim.g:4261:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDim.g:4261:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDim.g:4262:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
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
    // InternalDim.g:4268:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDim.g:4274:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDim.g:4275:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDim.g:4275:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt87=5;
            switch ( input.LA(1) ) {
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt87=1;
                }
                break;
            case RULE_STRING:
                {
                alt87=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA87_3 = input.LA(2);

                if ( (LA87_3==54) ) {
                    int LA87_5 = input.LA(3);

                    if ( (LA87_5==RULE_ID) ) {
                        alt87=3;
                    }
                    else if ( (LA87_5==RULE_NATURAL) ) {
                        alt87=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA87_3==EOF||(LA87_3>=RULE_ID && LA87_3<=RULE_PLAIN_TEXT_END)||LA87_3==22||(LA87_3>=26 && LA87_3<=28)||(LA87_3>=30 && LA87_3<=37)||(LA87_3>=39 && LA87_3<=40)||(LA87_3>=46 && LA87_3<=47)||(LA87_3>=50 && LA87_3<=53)||(LA87_3>=65 && LA87_3<=67)||(LA87_3>=69 && LA87_3<=71)||(LA87_3>=80 && LA87_3<=81)||(LA87_3>=83 && LA87_3<=84)||(LA87_3>=89 && LA87_3<=108)) ) {
                    alt87=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 3, input);

                    throw nvae;
                }
                }
                break;
            case 76:
            case 77:
                {
                alt87=5;
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
                    // InternalDim.g:4276:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
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
                    // InternalDim.g:4285:3: this_DStringLiteral_1= ruleDStringLiteral
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
                    // InternalDim.g:4294:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
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
                    // InternalDim.g:4303:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
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
                    // InternalDim.g:4312:3: this_DNilLiteral_4= ruleDNilLiteral
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
    // InternalDim.g:4324:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDim.g:4324:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDim.g:4325:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
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
    // InternalDim.g:4331:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:4337:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDim.g:4338:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDim.g:4338:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDim.g:4339:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDim.g:4339:3: ()
            // InternalDim.g:4340:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4346:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==56) ) {
                alt88=1;
            }
            else if ( (LA88_0==57) ) {
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
                    // InternalDim.g:4347:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4352:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4361:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDim.g:4361:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDim.g:4362:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
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
    // InternalDim.g:4368:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4374:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDim.g:4375:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDim.g:4375:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDim.g:4376:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDim.g:4376:3: ()
            // InternalDim.g:4377:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4383:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==58) ) {
                alt89=1;
            }
            else if ( (LA89_0==59) ) {
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
                    // InternalDim.g:4384:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4389:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:4394:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalDim.g:4395:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDim.g:4396:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDim.g:4397:5: lv_expression_3_0= ruleDExpression
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
    // InternalDim.g:4418:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDim.g:4418:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDim.g:4419:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
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
    // InternalDim.g:4425:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:4431:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDim.g:4432:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDim.g:4432:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDim.g:4433:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDim.g:4433:3: ()
            // InternalDim.g:4434:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4440:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==60) ) {
                alt91=1;
            }
            else if ( (LA91_0==61) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalDim.g:4441:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4446:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDim.g:4451:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDim.g:4452:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDim.g:4452:4: (lv_expression_3_0= ruleDExpression )
            // InternalDim.g:4453:5: lv_expression_3_0= ruleDExpression
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
    // InternalDim.g:4474:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDim.g:4474:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDim.g:4475:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
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
    // InternalDim.g:4481:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDim.g:4487:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDim.g:4488:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDim.g:4488:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDim.g:4489:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
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
    // InternalDim.g:4509:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDim.g:4509:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDim.g:4510:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
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
    // InternalDim.g:4516:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDim.g:4522:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDim.g:4523:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDim.g:4523:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDim.g:4524:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDim.g:4524:3: ()
            // InternalDim.g:4525:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4531:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:4532:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:4532:4: (otherlv_1= RULE_ID )
            // InternalDim.g:4533:5: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,21,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDim.g:4548:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=RULE_ID && LA93_0<=RULE_PLAIN_TEXT_START)||(LA93_0>=RULE_NATURAL && LA93_0<=RULE_STRING)||LA93_0==21||(LA93_0>=56 && LA93_0<=64)||LA93_0==68||(LA93_0>=72 && LA93_0<=77)||(LA93_0>=80 && LA93_0<=81)||(LA93_0>=109 && LA93_0<=111)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDim.g:4549:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDim.g:4549:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDim.g:4550:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDim.g:4550:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDim.g:4551:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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

                    // InternalDim.g:4568:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==32) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalDim.g:4569:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDim.g:4573:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDim.g:4574:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDim.g:4574:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDim.g:4575:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop92;
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
    // InternalDim.g:4602:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDim.g:4602:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDim.g:4603:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
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
    // InternalDim.g:4609:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalDim.g:4615:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDim.g:4616:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDim.g:4616:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDim.g:4617:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDim.g:4617:3: ()
            // InternalDim.g:4618:4: 
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
            pushFollow(FOLLOW_4);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:4631:3: ( (otherlv_2= RULE_ID ) )
            // InternalDim.g:4632:4: (otherlv_2= RULE_ID )
            {
            // InternalDim.g:4632:4: (otherlv_2= RULE_ID )
            // InternalDim.g:4633:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDComplexTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDim.g:4644:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==21) && (synpred15_InternalDim())) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDim.g:4645:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDim.g:4645:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDim.g:4646:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDim.g:4650:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDim.g:4651:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,21,FOLLOW_62); if (state.failed) return current;
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

                    // InternalDim.g:4663:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=RULE_ID && LA95_0<=RULE_PLAIN_TEXT_START)||(LA95_0>=RULE_NATURAL && LA95_0<=RULE_STRING)||LA95_0==21||(LA95_0>=56 && LA95_0<=64)||LA95_0==68||(LA95_0>=72 && LA95_0<=77)||(LA95_0>=80 && LA95_0<=81)||(LA95_0>=109 && LA95_0<=111)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalDim.g:4664:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDim.g:4664:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDim.g:4665:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDim.g:4665:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDim.g:4666:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_37);
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

                            // InternalDim.g:4683:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==32) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // InternalDim.g:4684:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDim.g:4688:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDim.g:4689:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDim.g:4689:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDim.g:4690:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_37);
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
                            	    break loop94;
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
    // InternalDim.g:4718:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDim.g:4718:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDim.g:4719:2: iv_ruleOpConstructor= ruleOpConstructor EOF
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
    // InternalDim.g:4725:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:4731:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDim.g:4732:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDim.g:4732:2: (kw= 'NEW' | kw= 'new' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==62) ) {
                alt97=1;
            }
            else if ( (LA97_0==63) ) {
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
                    // InternalDim.g:4733:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:4739:3: kw= 'new'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4748:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDim.g:4748:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDim.g:4749:2: iv_ruleDContextReference= ruleDContextReference EOF
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
    // InternalDim.g:4755:1: ruleDContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;


        	enterRule();

        try {
            // InternalDim.g:4761:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) )
            // InternalDim.g:4762:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            {
            // InternalDim.g:4762:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
            // InternalDim.g:4763:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
            {
            // InternalDim.g:4763:3: ()
            // InternalDim.g:4764:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:4770:3: ( (otherlv_1= RULE_ID ) )
            // InternalDim.g:4771:4: (otherlv_1= RULE_ID )
            {
            // InternalDim.g:4771:4: (otherlv_1= RULE_ID )
            // InternalDim.g:4772:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDim.g:4783:3: ( (lv_before_2_0= '@before' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==55) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDim.g:4784:4: (lv_before_2_0= '@before' )
                    {
                    // InternalDim.g:4784:4: (lv_before_2_0= '@before' )
                    // InternalDim.g:4785:5: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4801:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDim.g:4801:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDim.g:4802:2: iv_ruleDIfExpression= ruleDIfExpression EOF
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
    // InternalDim.g:4808:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDim.g:4814:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDim.g:4815:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDim.g:4815:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDim.g:4816:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDim.g:4816:3: ()
            // InternalDim.g:4817:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDim.g:4827:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDim.g:4828:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDim.g:4828:4: (lv_if_2_0= ruleDExpression )
            // InternalDim.g:4829:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,65,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDim.g:4850:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDim.g:4851:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDim.g:4851:4: (lv_then_4_0= ruleDExpression )
            // InternalDim.g:4852:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_66);
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

            // InternalDim.g:4869:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==66) && (synpred16_InternalDim())) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDim.g:4870:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDim.g:4870:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDim.g:4871:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDim.g:4877:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDim.g:4878:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDim.g:4878:5: (lv_else_6_0= ruleDExpression )
                    // InternalDim.g:4879:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_67);
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

            otherlv_7=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:4905:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDim.g:4905:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDim.g:4906:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
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
    // InternalDim.g:4912:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
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
            // InternalDim.g:4918:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDim.g:4919:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDim.g:4919:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDim.g:4920:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDim.g:4920:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDim.g:4921:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDim.g:4933:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDim.g:4934:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDim.g:4934:5: ()
            // InternalDim.g:4935:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDim.g:4945:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDim.g:4946:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDim.g:4946:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDim.g:4947:7: lv_declaredParam_2_0= RULE_ID
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

            // InternalDim.g:4969:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDim.g:4970:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDim.g:4970:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDim.g:4971:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_68);
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

            otherlv_5=(Token)match(input,69,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDim.g:4992:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDim.g:4993:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDim.g:4993:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDim.g:4994:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            otherlv_7=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5019:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDim.g:5019:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDim.g:5020:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDim.g:5026:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5032:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalDim.g:5033:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalDim.g:5033:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalDim.g:5034:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDim.g:5038:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalDim.g:5039:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalDim.g:5039:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalDim.g:5040:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_70); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,70,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalDim.g:5060:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalDim.g:5061:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalDim.g:5061:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalDim.g:5062:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
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
    // InternalDim.g:5087:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDim.g:5087:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDim.g:5088:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDim.g:5094:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDim.g:5100:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDim.g:5101:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDim.g:5101:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_NATURAL) ) {
                alt100=1;
            }
            else if ( (LA100_0==71) ) {
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
                    // InternalDim.g:5102:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDim.g:5110:3: kw= '*'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5119:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDim.g:5119:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDim.g:5120:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
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
    // InternalDim.g:5126:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDim.g:5132:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDim.g:5133:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDim.g:5133:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDim.g:5134:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDim.g:5134:3: ()
            // InternalDim.g:5135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5141:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt101=1;
                }
                break;
            case 73:
                {
                alt101=2;
                }
                break;
            case 74:
                {
                alt101=3;
                }
                break;
            case 75:
                {
                alt101=4;
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
                    // InternalDim.g:5142:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDim.g:5142:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDim.g:5143:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDim.g:5143:5: (lv_value_1_0= 'TRUE' )
                    // InternalDim.g:5144:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5157:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDim.g:5157:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDim.g:5158:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDim.g:5158:5: (lv_value_2_0= 'true' )
                    // InternalDim.g:5159:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDim.g:5172:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDim.g:5177:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5186:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDim.g:5186:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDim.g:5187:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
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
    // InternalDim.g:5193:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5199:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDim.g:5200:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDim.g:5200:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDim.g:5201:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDim.g:5201:3: ()
            // InternalDim.g:5202:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5208:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDim.g:5209:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDim.g:5209:4: (lv_value_1_0= RULE_STRING )
            // InternalDim.g:5210:5: lv_value_1_0= RULE_STRING
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
    // InternalDim.g:5230:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDim.g:5230:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDim.g:5231:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
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
    // InternalDim.g:5237:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDim.g:5243:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDim.g:5244:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDim.g:5244:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDim.g:5245:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDim.g:5245:3: ()
            // InternalDim.g:5246:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5252:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDim.g:5253:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDim.g:5253:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDim.g:5254:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDim.g:5274:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDim.g:5274:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDim.g:5275:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
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
    // InternalDim.g:5281:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5287:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDim.g:5288:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDim.g:5288:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDim.g:5289:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDim.g:5289:3: ()
            // InternalDim.g:5290:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5296:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDim.g:5297:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDim.g:5297:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDim.g:5298:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDim.g:5319:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDim.g:5319:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDim.g:5320:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
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
    // InternalDim.g:5326:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDim.g:5332:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDim.g:5333:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDim.g:5333:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDim.g:5334:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDim.g:5334:3: ()
            // InternalDim.g:5335:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDim.g:5341:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
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
                    // InternalDim.g:5342:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDim.g:5347:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5356:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDim.g:5356:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDim.g:5357:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDim.g:5363:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDim.g:5369:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDim.g:5370:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDim.g:5370:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDim.g:5371:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,54,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDim.g:5390:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=78 && LA105_0<=79)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalDim.g:5391:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDim.g:5391:4: (kw= 'E' | kw= 'e' )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==78) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==79) ) {
                        alt103=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalDim.g:5392:5: kw= 'E'
                            {
                            kw=(Token)match(input,78,FOLLOW_74); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5398:5: kw= 'e'
                            {
                            kw=(Token)match(input,79,FOLLOW_74); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDim.g:5404:4: (kw= '+' | kw= '-' )?
                    int alt104=3;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==80) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==81) ) {
                        alt104=2;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalDim.g:5405:5: kw= '+'
                            {
                            kw=(Token)match(input,80,FOLLOW_69); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDim.g:5411:5: kw= '-'
                            {
                            kw=(Token)match(input,81,FOLLOW_69); if (state.failed) return current;
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
    // InternalDim.g:5429:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDim.g:5429:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDim.g:5430:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDim.g:5436:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDim.g:5442:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDim.g:5443:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDim.g:5443:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDim.g:5444:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_75);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDim.g:5454:3: (kw= '.*' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==82) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalDim.g:5455:4: kw= '.*'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5465:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDim.g:5465:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDim.g:5466:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDim.g:5472:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDim.g:5478:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDim.g:5479:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDim.g:5479:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDim.g:5480:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDim.g:5487:3: (kw= '.' this_ID_2= RULE_ID )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==54) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalDim.g:5488:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop107;
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
    // InternalDim.g:5505:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5511:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalDim.g:5512:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalDim.g:5512:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==83) ) {
                alt108=1;
            }
            else if ( (LA108_0==40) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalDim.g:5513:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalDim.g:5513:3: (enumLiteral_0= 'reference' )
                    // InternalDim.g:5514:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5521:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalDim.g:5521:3: (enumLiteral_1= 'composite' )
                    // InternalDim.g:5522:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5532:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDim.g:5538:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDim.g:5539:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDim.g:5539:2: (enumLiteral_0= 'inverse' )
            // InternalDim.g:5540:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5549:1: ruleDServiceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleDServiceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5555:2: ( ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) ) )
            // InternalDim.g:5556:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalDim.g:5556:2: ( (enumLiteral_0= 'synchronous' ) | (enumLiteral_1= 'async' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==85) ) {
                alt109=1;
            }
            else if ( (LA109_0==86) ) {
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
                    // InternalDim.g:5557:3: (enumLiteral_0= 'synchronous' )
                    {
                    // InternalDim.g:5557:3: (enumLiteral_0= 'synchronous' )
                    // InternalDim.g:5558:4: enumLiteral_0= 'synchronous'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5565:3: (enumLiteral_1= 'async' )
                    {
                    // InternalDim.g:5565:3: (enumLiteral_1= 'async' )
                    // InternalDim.g:5566:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5576:1: ruleDDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5582:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalDim.g:5583:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalDim.g:5583:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==87) ) {
                alt110=1;
            }
            else if ( (LA110_0==88) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalDim.g:5584:3: (enumLiteral_0= 'in' )
                    {
                    // InternalDim.g:5584:3: (enumLiteral_0= 'in' )
                    // InternalDim.g:5585:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5592:3: (enumLiteral_1= 'out' )
                    {
                    // InternalDim.g:5592:3: (enumLiteral_1= 'out' )
                    // InternalDim.g:5593:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5603:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:5609:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDim.g:5610:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDim.g:5610:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt111=1;
                }
                break;
            case 90:
                {
                alt111=2;
                }
                break;
            case 91:
                {
                alt111=3;
                }
                break;
            case 92:
                {
                alt111=4;
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
                    // InternalDim.g:5611:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDim.g:5611:3: (enumLiteral_0= 'OR' )
                    // InternalDim.g:5612:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5619:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDim.g:5619:3: (enumLiteral_1= 'or' )
                    // InternalDim.g:5620:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5627:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDim.g:5627:3: (enumLiteral_2= 'XOR' )
                    // InternalDim.g:5628:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5635:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDim.g:5635:3: (enumLiteral_3= 'xor' )
                    // InternalDim.g:5636:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5646:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5652:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDim.g:5653:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDim.g:5653:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==93) ) {
                alt112=1;
            }
            else if ( (LA112_0==94) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalDim.g:5654:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDim.g:5654:3: (enumLiteral_0= 'AND' )
                    // InternalDim.g:5655:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5662:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDim.g:5662:3: (enumLiteral_1= 'and' )
                    // InternalDim.g:5663:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5673:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:5679:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDim.g:5680:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDim.g:5680:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt113=1;
                }
                break;
            case 96:
                {
                alt113=2;
                }
                break;
            case 97:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalDim.g:5681:3: (enumLiteral_0= '=' )
                    {
                    // InternalDim.g:5681:3: (enumLiteral_0= '=' )
                    // InternalDim.g:5682:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5689:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDim.g:5689:3: (enumLiteral_1= '!=' )
                    // InternalDim.g:5690:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5697:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDim.g:5697:3: (enumLiteral_2= '<>' )
                    // InternalDim.g:5698:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5708:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDim.g:5714:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDim.g:5715:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDim.g:5715:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt114=6;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt114=1;
                }
                break;
            case 99:
                {
                alt114=2;
                }
                break;
            case 100:
                {
                alt114=3;
                }
                break;
            case 101:
                {
                alt114=4;
                }
                break;
            case 102:
                {
                alt114=5;
                }
                break;
            case 103:
                {
                alt114=6;
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
                    // InternalDim.g:5716:3: (enumLiteral_0= '<' )
                    {
                    // InternalDim.g:5716:3: (enumLiteral_0= '<' )
                    // InternalDim.g:5717:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5724:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDim.g:5724:3: (enumLiteral_1= '<=' )
                    // InternalDim.g:5725:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5732:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDim.g:5732:3: (enumLiteral_2= '\\u2264' )
                    // InternalDim.g:5733:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5740:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDim.g:5740:3: (enumLiteral_3= '>=' )
                    // InternalDim.g:5741:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:5748:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDim.g:5748:3: (enumLiteral_4= '\\u2265' )
                    // InternalDim.g:5749:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDim.g:5756:3: (enumLiteral_5= '>' )
                    {
                    // InternalDim.g:5756:3: (enumLiteral_5= '>' )
                    // InternalDim.g:5757:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5767:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDim.g:5773:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDim.g:5774:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDim.g:5774:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt115=1;
                }
                break;
            case 104:
                {
                alt115=2;
                }
                break;
            case 105:
                {
                alt115=3;
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
                    // InternalDim.g:5775:3: (enumLiteral_0= '..' )
                    {
                    // InternalDim.g:5775:3: (enumLiteral_0= '..' )
                    // InternalDim.g:5776:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5783:3: (enumLiteral_1= '->' )
                    {
                    // InternalDim.g:5783:3: (enumLiteral_1= '->' )
                    // InternalDim.g:5784:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5791:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDim.g:5791:3: (enumLiteral_2= '=>' )
                    // InternalDim.g:5792:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5802:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDim.g:5808:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDim.g:5809:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDim.g:5809:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==80) ) {
                alt116=1;
            }
            else if ( (LA116_0==81) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalDim.g:5810:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:5810:3: (enumLiteral_0= '+' )
                    // InternalDim.g:5811:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5818:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:5818:3: (enumLiteral_1= '-' )
                    // InternalDim.g:5819:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5829:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDim.g:5835:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDim.g:5836:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDim.g:5836:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt117=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt117=1;
                }
                break;
            case 106:
                {
                alt117=2;
                }
                break;
            case 107:
                {
                alt117=3;
                }
                break;
            case 108:
                {
                alt117=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalDim.g:5837:3: (enumLiteral_0= '*' )
                    {
                    // InternalDim.g:5837:3: (enumLiteral_0= '*' )
                    // InternalDim.g:5838:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5845:3: (enumLiteral_1= '/' )
                    {
                    // InternalDim.g:5845:3: (enumLiteral_1= '/' )
                    // InternalDim.g:5846:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5853:3: (enumLiteral_2= '**' )
                    {
                    // InternalDim.g:5853:3: (enumLiteral_2= '**' )
                    // InternalDim.g:5854:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5861:3: (enumLiteral_3= '%' )
                    {
                    // InternalDim.g:5861:3: (enumLiteral_3= '%' )
                    // InternalDim.g:5862:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
    // InternalDim.g:5872:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDim.g:5878:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDim.g:5879:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDim.g:5879:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt118=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt118=1;
                }
                break;
            case 81:
                {
                alt118=2;
                }
                break;
            case 109:
                {
                alt118=3;
                }
                break;
            case 110:
                {
                alt118=4;
                }
                break;
            case 111:
                {
                alt118=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalDim.g:5880:3: (enumLiteral_0= '+' )
                    {
                    // InternalDim.g:5880:3: (enumLiteral_0= '+' )
                    // InternalDim.g:5881:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDim.g:5888:3: (enumLiteral_1= '-' )
                    {
                    // InternalDim.g:5888:3: (enumLiteral_1= '-' )
                    // InternalDim.g:5889:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDim.g:5896:3: (enumLiteral_2= '!' )
                    {
                    // InternalDim.g:5896:3: (enumLiteral_2= '!' )
                    // InternalDim.g:5897:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDim.g:5904:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDim.g:5904:3: (enumLiteral_3= 'NOT' )
                    // InternalDim.g:5905:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDim.g:5912:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDim.g:5912:3: (enumLiteral_4= 'not' )
                    // InternalDim.g:5913:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
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
        // InternalDim.g:3084:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDim.g:3084:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDim.g:3084:6: ( () ( ( ruleOpOr ) ) )
        // InternalDim.g:3085:6: () ( ( ruleOpOr ) )
        {
        // InternalDim.g:3085:6: ()
        // InternalDim.g:3086:6: 
        {
        }

        // InternalDim.g:3087:6: ( ( ruleOpOr ) )
        // InternalDim.g:3088:7: ( ruleOpOr )
        {
        // InternalDim.g:3088:7: ( ruleOpOr )
        // InternalDim.g:3089:8: ruleOpOr
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
        // InternalDim.g:3172:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDim.g:3172:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDim.g:3172:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDim.g:3173:6: () ( ( ruleOpAnd ) )
        {
        // InternalDim.g:3173:6: ()
        // InternalDim.g:3174:6: 
        {
        }

        // InternalDim.g:3175:6: ( ( ruleOpAnd ) )
        // InternalDim.g:3176:7: ( ruleOpAnd )
        {
        // InternalDim.g:3176:7: ( ruleOpAnd )
        // InternalDim.g:3177:8: ruleOpAnd
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
        // InternalDim.g:3260:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDim.g:3260:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDim.g:3260:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDim.g:3261:6: () ( ( ruleOpEquality ) )
        {
        // InternalDim.g:3261:6: ()
        // InternalDim.g:3262:6: 
        {
        }

        // InternalDim.g:3263:6: ( ( ruleOpEquality ) )
        // InternalDim.g:3264:7: ( ruleOpEquality )
        {
        // InternalDim.g:3264:7: ( ruleOpEquality )
        // InternalDim.g:3265:8: ruleOpEquality
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
        // InternalDim.g:3349:6: ( ( () ruleOpInstanceOf ) )
        // InternalDim.g:3349:7: ( () ruleOpInstanceOf )
        {
        // InternalDim.g:3349:7: ( () ruleOpInstanceOf )
        // InternalDim.g:3350:7: () ruleOpInstanceOf
        {
        // InternalDim.g:3350:7: ()
        // InternalDim.g:3351:7: 
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
        // InternalDim.g:3389:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDim.g:3389:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDim.g:3389:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDim.g:3390:7: () ( ( ruleOpCompare ) )
        {
        // InternalDim.g:3390:7: ()
        // InternalDim.g:3391:7: 
        {
        }

        // InternalDim.g:3392:7: ( ( ruleOpCompare ) )
        // InternalDim.g:3393:8: ( ruleOpCompare )
        {
        // InternalDim.g:3393:8: ( ruleOpCompare )
        // InternalDim.g:3394:9: ruleOpCompare
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
        // InternalDim.g:3508:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDim.g:3508:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDim.g:3508:6: ( () ( ( ruleOpOther ) ) )
        // InternalDim.g:3509:6: () ( ( ruleOpOther ) )
        {
        // InternalDim.g:3509:6: ()
        // InternalDim.g:3510:6: 
        {
        }

        // InternalDim.g:3511:6: ( ( ruleOpOther ) )
        // InternalDim.g:3512:7: ( ruleOpOther )
        {
        // InternalDim.g:3512:7: ( ruleOpOther )
        // InternalDim.g:3513:8: ruleOpOther
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
        // InternalDim.g:3596:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDim.g:3596:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDim.g:3596:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDim.g:3597:6: () ( ( ruleOpAdd ) )
        {
        // InternalDim.g:3597:6: ()
        // InternalDim.g:3598:6: 
        {
        }

        // InternalDim.g:3599:6: ( ( ruleOpAdd ) )
        // InternalDim.g:3600:7: ( ruleOpAdd )
        {
        // InternalDim.g:3600:7: ( ruleOpAdd )
        // InternalDim.g:3601:8: ruleOpAdd
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
        // InternalDim.g:3684:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDim.g:3684:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDim.g:3684:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDim.g:3685:6: () ( ( ruleOpMulti ) )
        {
        // InternalDim.g:3685:6: ()
        // InternalDim.g:3686:6: 
        {
        }

        // InternalDim.g:3687:6: ( ( ruleOpMulti ) )
        // InternalDim.g:3688:7: ( ruleOpMulti )
        {
        // InternalDim.g:3688:7: ( ruleOpMulti )
        // InternalDim.g:3689:8: ruleOpMulti
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
        // InternalDim.g:3847:5: ( ( () ruleOpCast ) )
        // InternalDim.g:3847:6: ( () ruleOpCast )
        {
        // InternalDim.g:3847:6: ( () ruleOpCast )
        // InternalDim.g:3848:6: () ruleOpCast
        {
        // InternalDim.g:3848:6: ()
        // InternalDim.g:3849:6: 
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
        // InternalDim.g:3944:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDim.g:3944:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDim.g:3944:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDim.g:3945:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDim.g:3945:7: ()
        // InternalDim.g:3946:7: 
        {
        }

        match(input,54,FOLLOW_4); if (state.failed) return ;
        // InternalDim.g:3948:7: ( ( RULE_ID ) )
        // InternalDim.g:3949:8: ( RULE_ID )
        {
        // InternalDim.g:3949:8: ( RULE_ID )
        // InternalDim.g:3950:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_50); if (state.failed) return ;

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
        // InternalDim.g:4013:6: ( ( () '.' ) )
        // InternalDim.g:4013:7: ( () '.' )
        {
        // InternalDim.g:4013:7: ( () '.' )
        // InternalDim.g:4014:7: () '.'
        {
        // InternalDim.g:4014:7: ()
        // InternalDim.g:4015:7: 
        {
        }

        match(input,54,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDim

    // $ANTLR start synpred12_InternalDim
    public final void synpred12_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4049:8: ( ( '(' ) )
        // InternalDim.g:4049:9: ( '(' )
        {
        // InternalDim.g:4049:9: ( '(' )
        // InternalDim.g:4050:9: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDim

    // $ANTLR start synpred13_InternalDim
    public final void synpred13_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4236:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDim.g:4236:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDim.g:4236:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDim.g:4237:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDim.g:4237:5: ()
        // InternalDim.g:4238:5: 
        {
        }

        match(input,68,FOLLOW_4); if (state.failed) return ;
        // InternalDim.g:4240:5: ( ( RULE_ID ) )
        // InternalDim.g:4241:6: ( RULE_ID )
        {
        // InternalDim.g:4241:6: ( RULE_ID )
        // InternalDim.g:4242:7: RULE_ID
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
        // InternalDim.g:4395:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )
        // InternalDim.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_PLAIN_TEXT_START)||(input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_STRING)||input.LA(1)==21||(input.LA(1)>=56 && input.LA(1)<=64)||input.LA(1)==68||(input.LA(1)>=72 && input.LA(1)<=77)||(input.LA(1)>=80 && input.LA(1)<=81)||(input.LA(1)>=109 && input.LA(1)<=111) ) {
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
        // InternalDim.g:4646:5: ( ( '(' ) )
        // InternalDim.g:4646:6: ( '(' )
        {
        // InternalDim.g:4646:6: ( '(' )
        // InternalDim.g:4647:6: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDim

    // $ANTLR start synpred16_InternalDim
    public final void synpred16_InternalDim_fragment() throws RecognitionException {   
        // InternalDim.g:4871:5: ( 'else' )
        // InternalDim.g:4871:6: 'else'
        {
        match(input,66,FOLLOW_2); if (state.failed) return ;

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


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\22\1\4\1\uffff\1\22";
    static final String dfa_3s = "\1\124\2\uffff\1\27\1\4\1\uffff\1\27";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\40\uffff\1\2\1\uffff\2\1\52\uffff\2\1",
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1456:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\154\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\6\1\4\1\3\1\0\1\7\1\5\2\uffff}>";
    static final String[] dfa_13s = {
            "\5\1\15\uffff\1\1\3\uffff\3\1\1\uffff\10\1\1\uffff\2\1\5\uffff\2\1\2\uffff\1\2\1\3\3\1\12\uffff\3\1\1\uffff\3\1\10\uffff\2\1\1\uffff\2\1\4\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 3346:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDim()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDim()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\6\uffff\1\13\5\uffff";
    static final String dfa_15s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_16s = "\1\115\5\uffff\1\154\5\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\10";
    static final String dfa_18s = "\1\0\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\4\uffff\2\1\12\uffff\1\5\42\uffff\2\2\2\3\2\4\2\7\1\10\3\uffff\1\11\3\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\5\13\14\uffff\1\12\1\13\3\uffff\3\13\1\uffff\10\13\1\uffff\2\13\5\uffff\2\13\2\uffff\6\13\11\uffff\3\13\1\uffff\3\13\10\uffff\2\13\1\uffff\2\13\4\uffff\24\13",
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

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_7;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "4153:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_0 = input.LA(1);

                         
                        int index86_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA86_0>=RULE_NATURAL && LA86_0<=RULE_STRING)||(LA86_0>=72 && LA86_0<=77)) ) {s = 1;}

                        else if ( ((LA86_0>=56 && LA86_0<=57)) ) {s = 2;}

                        else if ( ((LA86_0>=58 && LA86_0<=59)) ) {s = 3;}

                        else if ( ((LA86_0>=60 && LA86_0<=61)) ) {s = 4;}

                        else if ( (LA86_0==21) ) {s = 5;}

                        else if ( (LA86_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA86_0>=62 && LA86_0<=63)) ) {s = 7;}

                        else if ( (LA86_0==64) ) {s = 8;}

                        else if ( (LA86_0==68) && (synpred13_InternalDim())) {s = 9;}

                         
                        input.seek(index86_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\120\uffff";
    static final String dfa_21s = "\1\34\117\uffff";
    static final String dfa_22s = "\1\4\3\0\26\uffff\2\0\64\uffff";
    static final String dfa_23s = "\1\157\3\0\26\uffff\2\0\64\uffff";
    static final String dfa_24s = "\4\uffff\26\1\2\uffff\1\2\63\uffff";
    static final String dfa_25s = "\1\0\1\1\1\2\1\3\26\uffff\1\4\1\5\64\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\1\32\1\33\2\34\1\14\1\13\12\uffff\1\25\1\34\3\uffff\3\34\1\uffff\10\34\1\uffff\2\34\5\uffff\2\34\2\uffff\5\34\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\3\34\1\31\3\34\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\1\uffff\2\34\4\uffff\24\34\1\4\1\5\1\6",
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
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4394:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_0 = input.LA(1);

                         
                        int index90_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA90_0==RULE_ID) ) {s = 1;}

                        else if ( (LA90_0==80) ) {s = 2;}

                        else if ( (LA90_0==81) ) {s = 3;}

                        else if ( (LA90_0==109) && (synpred14_InternalDim())) {s = 4;}

                        else if ( (LA90_0==110) && (synpred14_InternalDim())) {s = 5;}

                        else if ( (LA90_0==111) && (synpred14_InternalDim())) {s = 6;}

                        else if ( (LA90_0==72) && (synpred14_InternalDim())) {s = 7;}

                        else if ( (LA90_0==73) && (synpred14_InternalDim())) {s = 8;}

                        else if ( (LA90_0==74) && (synpred14_InternalDim())) {s = 9;}

                        else if ( (LA90_0==75) && (synpred14_InternalDim())) {s = 10;}

                        else if ( (LA90_0==RULE_STRING) && (synpred14_InternalDim())) {s = 11;}

                        else if ( (LA90_0==RULE_NATURAL) && (synpred14_InternalDim())) {s = 12;}

                        else if ( (LA90_0==76) && (synpred14_InternalDim())) {s = 13;}

                        else if ( (LA90_0==77) && (synpred14_InternalDim())) {s = 14;}

                        else if ( (LA90_0==56) && (synpred14_InternalDim())) {s = 15;}

                        else if ( (LA90_0==57) && (synpred14_InternalDim())) {s = 16;}

                        else if ( (LA90_0==58) && (synpred14_InternalDim())) {s = 17;}

                        else if ( (LA90_0==59) && (synpred14_InternalDim())) {s = 18;}

                        else if ( (LA90_0==60) && (synpred14_InternalDim())) {s = 19;}

                        else if ( (LA90_0==61) && (synpred14_InternalDim())) {s = 20;}

                        else if ( (LA90_0==21) && (synpred14_InternalDim())) {s = 21;}

                        else if ( (LA90_0==62) && (synpred14_InternalDim())) {s = 22;}

                        else if ( (LA90_0==63) && (synpred14_InternalDim())) {s = 23;}

                        else if ( (LA90_0==64) && (synpred14_InternalDim())) {s = 24;}

                        else if ( (LA90_0==68) && (synpred14_InternalDim())) {s = 25;}

                        else if ( (LA90_0==RULE_PLAIN_TEXT_ONLY) ) {s = 26;}

                        else if ( (LA90_0==RULE_PLAIN_TEXT_START) ) {s = 27;}

                        else if ( (LA90_0==EOF||(LA90_0>=RULE_PLAIN_TEXT_MIDDLE && LA90_0<=RULE_PLAIN_TEXT_END)||LA90_0==22||(LA90_0>=26 && LA90_0<=28)||(LA90_0>=30 && LA90_0<=37)||(LA90_0>=39 && LA90_0<=40)||(LA90_0>=46 && LA90_0<=47)||(LA90_0>=50 && LA90_0<=54)||(LA90_0>=65 && LA90_0<=67)||(LA90_0>=69 && LA90_0<=71)||(LA90_0>=83 && LA90_0<=84)||(LA90_0>=89 && LA90_0<=108)) ) {s = 28;}

                         
                        input.seek(index90_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_2 = input.LA(1);

                         
                        int index90_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index90_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDim()) ) {s = 25;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000183ED1140062L,0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000183ED1100002L,0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003ED4000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFF00000000200670L,0x0000E00000033F11L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002040060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000010C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004002040060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001A00C000010L,0x0000000000180000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000200062L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000062L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000200062L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000062L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001183ED5100000L,0x0000000000600000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200002200060L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000400000L,0x0000000001800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200002000060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000102000060L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000C03ED4000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000803ED4000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xFF00000000200610L,0x0000E00000033F11L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x000000001E000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000C000000000002L,0x000000FC00000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x00001C0000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00C0000000200002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xFF00000000600670L,0x0000E00000033F11L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xFF00000000200672L,0x0000E00000033F11L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000200L,0x0000000000030000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});

}