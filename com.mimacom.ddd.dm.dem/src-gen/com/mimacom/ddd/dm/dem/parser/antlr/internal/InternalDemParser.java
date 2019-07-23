package com.mimacom.ddd.dm.dem.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'import'", "'event'", "'{'", "'context'", "'triggered'", "'by'", "'notifications'", "'before'", "'conditions'", "'after'", "'}'", "':'", "'sent'", "'to'", "'human'", "'actor'", "'time'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'.'", "'('", "','", "')'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'['", "'#'", "'|'", "'*'", "']'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDem.g"; }



     	private DemGrammarAccess grammarAccess;

        public InternalDemParser(TokenStream input, DemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DDomain";
       	}

       	@Override
       	protected DemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDDomain"
    // InternalDem.g:65:1: entryRuleDDomain returns [EObject current=null] : iv_ruleDDomain= ruleDDomain EOF ;
    public final EObject entryRuleDDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomain = null;


        try {
            // InternalDem.g:65:48: (iv_ruleDDomain= ruleDDomain EOF )
            // InternalDem.g:66:2: iv_ruleDDomain= ruleDDomain EOF
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
    // InternalDem.g:72:1: ruleDDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_events_6_0 = null;

        EObject lv_actors_7_0 = null;



        	enterRule();

        try {
            // InternalDem.g:78:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* ) )
            // InternalDem.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* )
            {
            // InternalDem.g:79:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* )
            // InternalDem.g:80:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleDQualifiedName ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? ( (lv_imports_5_0= ruleDImport ) )* ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainAccess().getDomainKeyword_0());
              		
            }
            // InternalDem.g:84:3: ( (lv_name_1_0= ruleDQualifiedName ) )
            // InternalDem.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            {
            // InternalDem.g:85:4: (lv_name_1_0= ruleDQualifiedName )
            // InternalDem.g:86:5: lv_name_1_0= ruleDQualifiedName
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

            // InternalDem.g:103:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDem.g:104:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDDomainAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDem.g:108:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDem.g:109:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDem.g:109:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDem.g:110:6: lv_aliases_3_0= RULE_ID
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

            // InternalDem.g:127:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLAIN_TEXT_ONLY && LA2_0<=RULE_PLAIN_TEXT_START)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDem.g:128:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDem.g:128:4: (lv_description_4_0= ruleDRichText )
                    // InternalDem.g:129:5: lv_description_4_0= ruleDRichText
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

            // InternalDem.g:146:3: ( (lv_imports_5_0= ruleDImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDem.g:147:4: (lv_imports_5_0= ruleDImport )
            	    {
            	    // InternalDem.g:147:4: (lv_imports_5_0= ruleDImport )
            	    // InternalDem.g:148:5: lv_imports_5_0= ruleDImport
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
            	      						"com.mimacom.ddd.dm.dem.Dem.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDem.g:165:3: ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }
                else if ( (LA4_0==33||LA4_0==35) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDem.g:166:4: ( (lv_events_6_0= ruleDDomainEvent ) )
            	    {
            	    // InternalDem.g:166:4: ( (lv_events_6_0= ruleDDomainEvent ) )
            	    // InternalDem.g:167:5: (lv_events_6_0= ruleDDomainEvent )
            	    {
            	    // InternalDem.g:167:5: (lv_events_6_0= ruleDDomainEvent )
            	    // InternalDem.g:168:6: lv_events_6_0= ruleDDomainEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getEventsDDomainEventParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_events_6_0=ruleDDomainEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"events",
            	      							lv_events_6_0,
            	      							"com.mimacom.ddd.dm.dem.Dem.DDomainEvent");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:186:4: ( (lv_actors_7_0= ruleDActor ) )
            	    {
            	    // InternalDem.g:186:4: ( (lv_actors_7_0= ruleDActor ) )
            	    // InternalDem.g:187:5: (lv_actors_7_0= ruleDActor )
            	    {
            	    // InternalDem.g:187:5: (lv_actors_7_0= ruleDActor )
            	    // InternalDem.g:188:6: lv_actors_7_0= ruleDActor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getActorsDActorParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_actors_7_0=ruleDActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actors",
            	      							lv_actors_7_0,
            	      							"com.mimacom.ddd.dm.dem.Dem.DActor");
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
    // InternalDem.g:210:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDem.g:210:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDem.g:211:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDem.g:217:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:223:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDem.g:224:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDem.g:224:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDem.g:225:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDem.g:229:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDem.g:230:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDem.g:230:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDem.g:231:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleDDomainEvent"
    // InternalDem.g:252:1: entryRuleDDomainEvent returns [EObject current=null] : iv_ruleDDomainEvent= ruleDDomainEvent EOF ;
    public final EObject entryRuleDDomainEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomainEvent = null;


        try {
            // InternalDem.g:252:53: (iv_ruleDDomainEvent= ruleDDomainEvent EOF )
            // InternalDem.g:253:2: iv_ruleDDomainEvent= ruleDDomainEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDomainEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDomainEvent=ruleDDomainEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDomainEvent; 
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
    // $ANTLR end "entryRuleDDomainEvent"


    // $ANTLR start "ruleDDomainEvent"
    // InternalDem.g:259:1: ruleDDomainEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )? (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )? otherlv_19= '}' ) ;
    public final EObject ruleDDomainEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_description_4_0 = null;

        EObject lv_context_7_0 = null;

        EObject lv_notifications_12_0 = null;

        EObject lv_before_15_0 = null;

        EObject lv_after_18_0 = null;



        	enterRule();

        try {
            // InternalDem.g:265:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )? (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )? otherlv_19= '}' ) )
            // InternalDem.g:266:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )? (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )? otherlv_19= '}' )
            {
            // InternalDem.g:266:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )? (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )? otherlv_19= '}' )
            // InternalDem.g:267:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )? (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainEventAccess().getEventKeyword_0());
              		
            }
            // InternalDem.g:271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:272:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDDomainEventAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:289:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDem.g:290:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDDomainEventAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDem.g:294:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDem.g:295:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDem.g:295:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDem.g:296:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDDomainEventAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainEventRule());
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
            	    break loop5;
                }
            } while (true);

            // InternalDem.g:313:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PLAIN_TEXT_ONLY && LA6_0<=RULE_PLAIN_TEXT_START)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDem.g:314:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDem.g:314:4: (lv_description_4_0= ruleDRichText )
                    // InternalDem.g:315:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainEventAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
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

            otherlv_5=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDDomainEventAccess().getContextKeyword_5());
              		
            }
            // InternalDem.g:340:3: ( (lv_context_7_0= ruleDContext ) )+
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
            	    // InternalDem.g:341:4: (lv_context_7_0= ruleDContext )
            	    {
            	    // InternalDem.g:341:4: (lv_context_7_0= ruleDContext )
            	    // InternalDem.g:342:5: lv_context_7_0= ruleDContext
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getContextDContextParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_context_7_0=ruleDContext();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
            	      					}
            	      					add(
            	      						current,
            	      						"context",
            	      						lv_context_7_0,
            	      						"com.mimacom.ddd.dm.dem.Dem.DContext");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDDomainEventAccess().getTriggeredKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDDomainEventAccess().getByKeyword_8());
              		
            }
            // InternalDem.g:367:3: ( (otherlv_10= RULE_ID ) )
            // InternalDem.g:368:4: (otherlv_10= RULE_ID )
            {
            // InternalDem.g:368:4: (otherlv_10= RULE_ID )
            // InternalDem.g:369:5: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainEventRule());
              					}
              				
            }
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_10, grammarAccess.getDDomainEventAccess().getTriggerDActorCrossReference_9_0());
              				
            }

            }


            }

            // InternalDem.g:380:3: (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDem.g:381:4: otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDDomainEventAccess().getNotificationsKeyword_10_0());
                      			
                    }
                    // InternalDem.g:385:4: ( (lv_notifications_12_0= ruleDNotification ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDem.g:386:5: (lv_notifications_12_0= ruleDNotification )
                    	    {
                    	    // InternalDem.g:386:5: (lv_notifications_12_0= ruleDNotification )
                    	    // InternalDem.g:387:6: lv_notifications_12_0= ruleDNotification
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getNotificationsDNotificationParserRuleCall_10_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_notifications_12_0=ruleDNotification();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"notifications",
                    	      							lv_notifications_12_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DNotification");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            // InternalDem.g:405:3: (otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDem.g:406:4: otherlv_13= 'before' otherlv_14= 'conditions' ( (lv_before_15_0= ruleDCondition ) )+
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDDomainEventAccess().getBeforeKeyword_11_0());
                      			
                    }
                    otherlv_14=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDDomainEventAccess().getConditionsKeyword_11_1());
                      			
                    }
                    // InternalDem.g:414:4: ( (lv_before_15_0= ruleDCondition ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDem.g:415:5: (lv_before_15_0= ruleDCondition )
                    	    {
                    	    // InternalDem.g:415:5: (lv_before_15_0= ruleDCondition )
                    	    // InternalDem.g:416:6: lv_before_15_0= ruleDCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getBeforeDConditionParserRuleCall_11_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_before_15_0=ruleDCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"before",
                    	      							lv_before_15_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DCondition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
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


                    }
                    break;

            }

            // InternalDem.g:434:3: (otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDem.g:435:4: otherlv_16= 'after' otherlv_17= 'conditions' ( (lv_after_18_0= ruleDCondition ) )+
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getDDomainEventAccess().getAfterKeyword_12_0());
                      			
                    }
                    otherlv_17=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getDDomainEventAccess().getConditionsKeyword_12_1());
                      			
                    }
                    // InternalDem.g:443:4: ( (lv_after_18_0= ruleDCondition ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDem.g:444:5: (lv_after_18_0= ruleDCondition )
                    	    {
                    	    // InternalDem.g:444:5: (lv_after_18_0= ruleDCondition )
                    	    // InternalDem.g:445:6: lv_after_18_0= ruleDCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getAfterDConditionParserRuleCall_12_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_after_18_0=ruleDCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"after",
                    	      							lv_after_18_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DCondition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_13());
              		
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
    // $ANTLR end "ruleDDomainEvent"


    // $ANTLR start "entryRuleDCondition"
    // InternalDem.g:471:1: entryRuleDCondition returns [EObject current=null] : iv_ruleDCondition= ruleDCondition EOF ;
    public final EObject entryRuleDCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCondition = null;


        try {
            // InternalDem.g:471:51: (iv_ruleDCondition= ruleDCondition EOF )
            // InternalDem.g:472:2: iv_ruleDCondition= ruleDCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDCondition=ruleDCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCondition; 
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
    // $ANTLR end "entryRuleDCondition"


    // $ANTLR start "ruleDCondition"
    // InternalDem.g:478:1: ruleDCondition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_condition_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        EObject lv_condition_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:484:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_condition_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:485:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_condition_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:485:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_condition_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:486:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_condition_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDem.g:486:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:487:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:487:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:488:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDConditionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConditionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:504:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDem.g:505:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDConditionAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:509:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:510:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:510:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:511:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDConditionAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDConditionRule());
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
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDConditionAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:532:3: ( (lv_condition_4_0= ruleDExpression ) )
            // InternalDem.g:533:4: (lv_condition_4_0= ruleDExpression )
            {
            // InternalDem.g:533:4: (lv_condition_4_0= ruleDExpression )
            // InternalDem.g:534:5: lv_condition_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConditionAccess().getConditionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_condition_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConditionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:551:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLAIN_TEXT_ONLY && LA15_0<=RULE_PLAIN_TEXT_START)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDem.g:552:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:552:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:553:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConditionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConditionRule());
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
    // $ANTLR end "ruleDCondition"


    // $ANTLR start "entryRuleDNotification"
    // InternalDem.g:574:1: entryRuleDNotification returns [EObject current=null] : iv_ruleDNotification= ruleDNotification EOF ;
    public final EObject entryRuleDNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNotification = null;


        try {
            // InternalDem.g:574:54: (iv_ruleDNotification= ruleDNotification EOF )
            // InternalDem.g:575:2: iv_ruleDNotification= ruleDNotification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNotificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNotification=ruleDNotification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNotification; 
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
    // $ANTLR end "entryRuleDNotification"


    // $ANTLR start "ruleDNotification"
    // InternalDem.g:581:1: ruleDNotification returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? otherlv_6= 'sent' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDNotification() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_multiplicity_5_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalDem.g:587:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? otherlv_6= 'sent' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDem.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? otherlv_6= 'sent' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDem.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? otherlv_6= 'sent' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDem.g:589:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? otherlv_6= 'sent' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDem.g:589:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:590:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:590:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:591:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDNotificationAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:607:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDem.g:608:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDNotificationAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:612:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:613:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:613:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:614:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDNotificationAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDNotificationRule());
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
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDNotificationAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:635:3: ( (otherlv_4= RULE_ID ) )
            // InternalDem.g:636:4: (otherlv_4= RULE_ID )
            {
            // InternalDem.g:636:4: (otherlv_4= RULE_ID )
            // InternalDem.g:637:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDNotificationAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDem.g:648:3: ( (lv_multiplicity_5_0= ruleDMultiplicity ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDem.g:649:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:649:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    // InternalDem.g:650:5: lv_multiplicity_5_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNotificationAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_multiplicity_5_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNotificationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDNotificationAccess().getSentKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDNotificationAccess().getToKeyword_6());
              		
            }
            // InternalDem.g:675:3: ( (otherlv_8= RULE_ID ) )
            // InternalDem.g:676:4: (otherlv_8= RULE_ID )
            {
            // InternalDem.g:676:4: (otherlv_8= RULE_ID )
            // InternalDem.g:677:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getDNotificationAccess().getNotifiedDActorCrossReference_7_0());
              				
            }

            }


            }

            // InternalDem.g:688:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_PLAIN_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDem.g:689:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDem.g:689:4: (lv_description_9_0= ruleDRichText )
                    // InternalDem.g:690:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNotificationAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNotificationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_9_0,
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
    // $ANTLR end "ruleDNotification"


    // $ANTLR start "entryRuleDContext"
    // InternalDem.g:711:1: entryRuleDContext returns [EObject current=null] : iv_ruleDContext= ruleDContext EOF ;
    public final EObject entryRuleDContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContext = null;


        try {
            // InternalDem.g:711:49: (iv_ruleDContext= ruleDContext EOF )
            // InternalDem.g:712:2: iv_ruleDContext= ruleDContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDContextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDContext=ruleDContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDContext; 
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
    // $ANTLR end "entryRuleDContext"


    // $ANTLR start "ruleDContext"
    // InternalDem.g:718:1: ruleDContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_multiplicity_5_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:724:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDem.g:725:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDem.g:725:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDem.g:726:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )?
            {
            // InternalDem.g:726:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:727:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:727:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:728:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDContextAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:744:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDem.g:745:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDContextAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:749:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:750:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:750:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:751:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDContextAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDContextRule());
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
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDContextAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:772:3: ( (otherlv_4= RULE_ID ) )
            // InternalDem.g:773:4: (otherlv_4= RULE_ID )
            {
            // InternalDem.g:773:4: (otherlv_4= RULE_ID )
            // InternalDem.g:774:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDContextAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDem.g:785:3: ( (lv_multiplicity_5_0= ruleDMultiplicity ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDem.g:786:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:786:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    // InternalDem.g:787:5: lv_multiplicity_5_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_multiplicity_5_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDem.g:804:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_PLAIN_TEXT_ONLY && LA21_0<=RULE_PLAIN_TEXT_START)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDem.g:805:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDem.g:805:4: (lv_description_6_0= ruleDRichText )
                    // InternalDem.g:806:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
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
    // $ANTLR end "ruleDContext"


    // $ANTLR start "entryRuleDActor"
    // InternalDem.g:827:1: entryRuleDActor returns [EObject current=null] : iv_ruleDActor= ruleDActor EOF ;
    public final EObject entryRuleDActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDActor = null;


        try {
            // InternalDem.g:827:47: (iv_ruleDActor= ruleDActor EOF )
            // InternalDem.g:828:2: iv_ruleDActor= ruleDActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDActorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDActor=ruleDActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDActor; 
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
    // $ANTLR end "entryRuleDActor"


    // $ANTLR start "ruleDActor"
    // InternalDem.g:834:1: ruleDActor returns [EObject current=null] : (this_DHuman_0= ruleDHuman | this_DTime_1= ruleDTime ) ;
    public final EObject ruleDActor() throws RecognitionException {
        EObject current = null;

        EObject this_DHuman_0 = null;

        EObject this_DTime_1 = null;



        	enterRule();

        try {
            // InternalDem.g:840:2: ( (this_DHuman_0= ruleDHuman | this_DTime_1= ruleDTime ) )
            // InternalDem.g:841:2: (this_DHuman_0= ruleDHuman | this_DTime_1= ruleDTime )
            {
            // InternalDem.g:841:2: (this_DHuman_0= ruleDHuman | this_DTime_1= ruleDTime )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==35) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDem.g:842:3: this_DHuman_0= ruleDHuman
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDHumanParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DHuman_0=ruleDHuman();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DHuman_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:851:3: this_DTime_1= ruleDTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDTimeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DTime_1=ruleDTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DTime_1;
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
    // $ANTLR end "ruleDActor"


    // $ANTLR start "entryRuleDHuman"
    // InternalDem.g:863:1: entryRuleDHuman returns [EObject current=null] : iv_ruleDHuman= ruleDHuman EOF ;
    public final EObject entryRuleDHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHuman = null;


        try {
            // InternalDem.g:863:47: (iv_ruleDHuman= ruleDHuman EOF )
            // InternalDem.g:864:2: iv_ruleDHuman= ruleDHuman EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDHumanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDHuman=ruleDHuman();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDHuman; 
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
    // $ANTLR end "entryRuleDHuman"


    // $ANTLR start "ruleDHuman"
    // InternalDem.g:870:1: ruleDHuman returns [EObject current=null] : (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDHuman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:876:2: ( (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:877:2: (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:877:2: (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:878:3: otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHumanAccess().getHumanKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHumanAccess().getActorKeyword_1());
              		
            }
            // InternalDem.g:886:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDem.g:887:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDem.g:887:4: (lv_name_2_0= RULE_ID )
            // InternalDem.g:888:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDHumanAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHumanRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:904:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDem.g:905:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDHumanAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDem.g:909:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDem.g:910:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDem.g:910:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDem.g:911:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDHumanAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDHumanRule());
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
            	    break loop23;
                }
            } while (true);

            // InternalDem.g:928:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_PLAIN_TEXT_ONLY && LA24_0<=RULE_PLAIN_TEXT_START)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDem.g:929:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:929:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:930:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDHumanAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDHumanRule());
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
    // $ANTLR end "ruleDHuman"


    // $ANTLR start "entryRuleDTime"
    // InternalDem.g:951:1: entryRuleDTime returns [EObject current=null] : iv_ruleDTime= ruleDTime EOF ;
    public final EObject entryRuleDTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTime = null;


        try {
            // InternalDem.g:951:46: (iv_ruleDTime= ruleDTime EOF )
            // InternalDem.g:952:2: iv_ruleDTime= ruleDTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTime=ruleDTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTime; 
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
    // $ANTLR end "entryRuleDTime"


    // $ANTLR start "ruleDTime"
    // InternalDem.g:958:1: ruleDTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:964:2: ( (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:965:2: (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:965:2: (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:966:3: otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTimeAccess().getTimeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTimeAccess().getActorKeyword_1());
              		
            }
            // InternalDem.g:974:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDem.g:975:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDem.g:975:4: (lv_name_2_0= RULE_ID )
            // InternalDem.g:976:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDTimeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:992:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDem.g:993:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDTimeAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDem.g:997:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDem.g:998:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDem.g:998:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDem.g:999:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDTimeAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDTimeRule());
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
            	    break loop25;
                }
            } while (true);

            // InternalDem.g:1016:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_PLAIN_TEXT_ONLY && LA26_0<=RULE_PLAIN_TEXT_START)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDem.g:1017:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:1017:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:1018:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDTimeAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDTimeRule());
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
    // $ANTLR end "ruleDTime"


    // $ANTLR start "entryRuleDExpression"
    // InternalDem.g:1039:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDem.g:1039:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDem.g:1040:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDem.g:1046:1: ruleDExpression returns [EObject current=null] : (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;

        EObject this_DRichText_1 = null;



        	enterRule();

        try {
            // InternalDem.g:1052:2: ( (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) )
            // InternalDem.g:1053:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            {
            // InternalDem.g:1053:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=RULE_NATURAL && LA27_0<=RULE_STRING)||LA27_0==42||(LA27_0>=46 && LA27_0<=54)||LA27_0==59||LA27_0==63||(LA27_0>=66 && LA27_0<=71)||(LA27_0>=74 && LA27_0<=75)||(LA27_0>=97 && LA27_0<=99)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_PLAIN_TEXT_START)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDem.g:1054:3: this_DAssignment_0= ruleDAssignment
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
                    // InternalDem.g:1063:3: this_DRichText_1= ruleDRichText
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
    // InternalDem.g:1075:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDem.g:1075:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDem.g:1076:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDem.g:1082:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) ;
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
            // InternalDem.g:1088:2: ( ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDem.g:1089:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDem.g:1089:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_PLAIN_TEXT_START) ) {
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
                    // InternalDem.g:1090:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    {
                    // InternalDem.g:1090:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    // InternalDem.g:1091:4: (lv_segments_0_0= ruleDTextOnly )
                    {
                    // InternalDem.g:1091:4: (lv_segments_0_0= ruleDTextOnly )
                    // InternalDem.g:1092:5: lv_segments_0_0= ruleDTextOnly
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
                    // InternalDem.g:1110:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDem.g:1110:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    // InternalDem.g:1111:4: ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) )
                    {
                    // InternalDem.g:1111:4: ( (lv_segments_1_0= ruleDTextStart ) )
                    // InternalDem.g:1112:5: (lv_segments_1_0= ruleDTextStart )
                    {
                    // InternalDem.g:1112:5: (lv_segments_1_0= ruleDTextStart )
                    // InternalDem.g:1113:6: lv_segments_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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

                    // InternalDem.g:1130:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDem.g:1131:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDem.g:1131:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDem.g:1132:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

                    // InternalDem.g:1149:4: ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDem.g:1150:5: ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDem.g:1150:5: ( (lv_segments_3_0= ruleDTextMiddle ) )
                    	    // InternalDem.g:1151:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDem.g:1151:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    // InternalDem.g:1152:7: lv_segments_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
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

                    	    // InternalDem.g:1169:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDem.g:1170:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:1170:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDem.g:1171:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop28;
                        }
                    } while (true);

                    // InternalDem.g:1189:4: ( (lv_segments_5_0= ruleDTextEnd ) )
                    // InternalDem.g:1190:5: (lv_segments_5_0= ruleDTextEnd )
                    {
                    // InternalDem.g:1190:5: (lv_segments_5_0= ruleDTextEnd )
                    // InternalDem.g:1191:6: lv_segments_5_0= ruleDTextEnd
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
    // InternalDem.g:1213:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDem.g:1213:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDem.g:1214:2: iv_ruleDTextOnly= ruleDTextOnly EOF
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
    // InternalDem.g:1220:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:1226:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDem.g:1227:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDem.g:1227:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDem.g:1228:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDem.g:1228:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDem.g:1229:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDem.g:1248:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDem.g:1248:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDem.g:1249:2: iv_ruleDTextStart= ruleDTextStart EOF
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
    // InternalDem.g:1255:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:1261:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDem.g:1262:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDem.g:1262:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDem.g:1263:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDem.g:1263:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDem.g:1264:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalDem.g:1283:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDem.g:1283:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDem.g:1284:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
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
    // InternalDem.g:1290:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:1296:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDem.g:1297:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDem.g:1297:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDem.g:1298:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDem.g:1298:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDem.g:1299:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDem.g:1318:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDem.g:1318:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDem.g:1319:2: iv_ruleDTextEnd= ruleDTextEnd EOF
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
    // InternalDem.g:1325:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:1331:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDem.g:1332:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDem.g:1332:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDem.g:1333:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDem.g:1333:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDem.g:1334:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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
    // InternalDem.g:1353:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDem.g:1353:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDem.g:1354:2: iv_ruleDAssignment= ruleDAssignment EOF
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
    // InternalDem.g:1360:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDem.g:1366:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDem.g:1367:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDem.g:1367:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||(LA30_1>=RULE_ID && LA30_1<=RULE_PLAIN_TEXT_END)||(LA30_1>=28 && LA30_1<=29)||(LA30_1>=37 && LA30_1<=45)||LA30_1==57||(LA30_1>=60 && LA30_1<=62)||(LA30_1>=64 && LA30_1<=65)||(LA30_1>=74 && LA30_1<=75)||(LA30_1>=77 && LA30_1<=96)) ) {
                    alt30=2;
                }
                else if ( (LA30_1==36) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA30_0>=RULE_NATURAL && LA30_0<=RULE_STRING)||LA30_0==42||(LA30_0>=46 && LA30_0<=54)||LA30_0==59||LA30_0==63||(LA30_0>=66 && LA30_0<=71)||(LA30_0>=74 && LA30_0<=75)||(LA30_0>=97 && LA30_0<=99)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDem.g:1368:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDem.g:1368:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDem.g:1369:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDem.g:1369:4: ()
                    // InternalDem.g:1370:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:1376:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDem.g:1377:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDem.g:1377:5: (otherlv_1= RULE_ID )
                    // InternalDem.g:1378:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDNavigableMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDem.g:1396:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDem.g:1397:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDem.g:1397:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDem.g:1398:6: lv_value_3_0= ruleDAssignment
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
                    // InternalDem.g:1417:3: this_DOrExpression_4= ruleDOrExpression
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
    // InternalDem.g:1429:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDem.g:1429:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDem.g:1430:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // InternalDem.g:1436:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:1442:2: (kw= ':=' )
            // InternalDem.g:1443:2: kw= ':='
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:1451:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDem.g:1451:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDem.g:1452:2: iv_ruleDOrExpression= ruleDOrExpression EOF
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
    // InternalDem.g:1458:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1464:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDem.g:1465:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDem.g:1465:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDem.g:1466:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1474:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 77:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt31=1;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalDem.g:1475:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDem.g:1475:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDem.g:1476:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDem.g:1486:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDem.g:1487:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDem.g:1487:6: ()
            	    // InternalDem.g:1488:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:1494:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDem.g:1495:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDem.g:1495:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDem.g:1496:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:1515:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDem.g:1516:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDem.g:1516:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDem.g:1517:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleDOrExpression"


    // $ANTLR start "entryRuleDAndExpression"
    // InternalDem.g:1539:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDem.g:1539:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDem.g:1540:2: iv_ruleDAndExpression= ruleDAndExpression EOF
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
    // InternalDem.g:1546:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1552:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDem.g:1553:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDem.g:1553:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDem.g:1554:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1562:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==81) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred2_InternalDem()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==82) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred2_InternalDem()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalDem.g:1563:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDem.g:1563:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDem.g:1564:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDem.g:1574:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDem.g:1575:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDem.g:1575:6: ()
            	    // InternalDem.g:1576:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:1582:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDem.g:1583:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDem.g:1583:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDem.g:1584:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:1603:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDem.g:1604:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDem.g:1604:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDem.g:1605:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleDAndExpression"


    // $ANTLR start "entryRuleDEqualityExpression"
    // InternalDem.g:1627:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDem.g:1627:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDem.g:1628:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
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
    // InternalDem.g:1634:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1640:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDem.g:1641:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDem.g:1641:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDem.g:1642:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1650:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 83:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred3_InternalDem()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 84:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred3_InternalDem()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 85:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred3_InternalDem()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // InternalDem.g:1651:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDem.g:1651:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDem.g:1652:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDem.g:1662:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDem.g:1663:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDem.g:1663:6: ()
            	    // InternalDem.g:1664:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:1670:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDem.g:1671:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDem.g:1671:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDem.g:1672:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:1691:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDem.g:1692:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDem.g:1692:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDem.g:1693:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop33;
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
    // InternalDem.g:1715:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDem.g:1715:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDem.g:1716:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
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
    // InternalDem.g:1722:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1728:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDem.g:1729:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDem.g:1729:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDem.g:1730:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1738:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop34:
            do {
                int alt34=3;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalDem.g:1739:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDem.g:1739:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDem.g:1740:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDem.g:1740:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDem.g:1741:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDem.g:1747:6: ( () ruleOpInstanceOf )
            	    // InternalDem.g:1748:7: () ruleOpInstanceOf
            	    {
            	    // InternalDem.g:1748:7: ()
            	    // InternalDem.g:1749:8: 
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

            	    // InternalDem.g:1764:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:1765:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:1765:6: (otherlv_3= RULE_ID )
            	    // InternalDem.g:1766:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:1779:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDem.g:1779:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDem.g:1780:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDem.g:1780:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDem.g:1781:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDem.g:1791:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDem.g:1792:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDem.g:1792:7: ()
            	    // InternalDem.g:1793:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDem.g:1799:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDem.g:1800:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDem.g:1800:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDem.g:1801:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:1820:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDem.g:1821:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDem.g:1821:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDem.g:1822:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop34;
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
    // InternalDem.g:1845:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDem.g:1845:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDem.g:1846:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
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
    // InternalDem.g:1852:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:1858:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDem.g:1859:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDem.g:1859:2: (kw= 'ISA' | kw= 'isa' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            else if ( (LA35_0==38) ) {
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
                    // InternalDem.g:1860:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:1866:3: kw= 'isa'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:1875:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDem.g:1875:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDem.g:1876:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
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
    // InternalDem.g:1882:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1888:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDem.g:1889:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDem.g:1889:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDem.g:1890:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1898:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 65:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalDem.g:1899:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDem.g:1899:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDem.g:1900:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDem.g:1910:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDem.g:1911:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDem.g:1911:6: ()
            	    // InternalDem.g:1912:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:1918:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDem.g:1919:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDem.g:1919:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDem.g:1920:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:1939:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDem.g:1940:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDem.g:1940:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDem.g:1941:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop36;
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
    // InternalDem.g:1963:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDem.g:1963:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDem.g:1964:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
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
    // InternalDem.g:1970:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1976:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDem.g:1977:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDem.g:1977:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDem.g:1978:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:1986:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==74) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred7_InternalDem()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==75) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred7_InternalDem()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalDem.g:1987:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDem.g:1987:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDem.g:1988:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDem.g:1998:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDem.g:1999:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDem.g:1999:6: ()
            	    // InternalDem.g:2000:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2006:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDem.g:2007:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDem.g:2007:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDem.g:2008:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:2027:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDem.g:2028:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDem.g:2028:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDem.g:2029:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    break loop37;
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
    // InternalDem.g:2051:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDem.g:2051:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDem.g:2052:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
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
    // InternalDem.g:2058:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2064:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDem.g:2065:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDem.g:2065:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDem.g:2066:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2074:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred8_InternalDem()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred8_InternalDem()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred8_InternalDem()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA38_5 = input.LA(2);

                    if ( (synpred8_InternalDem()) ) {
                        alt38=1;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalDem.g:2075:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDem.g:2075:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDem.g:2076:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDem.g:2086:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDem.g:2087:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDem.g:2087:6: ()
            	    // InternalDem.g:2088:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2094:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDem.g:2095:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDem.g:2095:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDem.g:2096:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_28);
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

            	    // InternalDem.g:2115:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDem.g:2116:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDem.g:2116:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDem.g:2117:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop38;
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
    // InternalDem.g:2139:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDem.g:2139:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDem.g:2140:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
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
    // InternalDem.g:2146:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDem.g:2152:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDem.g:2153:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDem.g:2153:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=74 && LA39_0<=75)||(LA39_0>=97 && LA39_0<=99)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID||(LA39_0>=RULE_NATURAL && LA39_0<=RULE_STRING)||LA39_0==42||(LA39_0>=46 && LA39_0<=54)||LA39_0==59||LA39_0==63||(LA39_0>=66 && LA39_0<=71)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDem.g:2154:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDem.g:2154:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDem.g:2155:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDem.g:2155:4: ()
                    // InternalDem.g:2156:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:2162:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDem.g:2163:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDem.g:2163:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDem.g:2164:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
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

                    // InternalDem.g:2181:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDem.g:2182:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDem.g:2182:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDem.g:2183:6: lv_operand_2_0= ruleDUnaryOperation
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
                    // InternalDem.g:2202:3: this_DCastExpression_3= ruleDCastExpression
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
    // InternalDem.g:2214:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDem.g:2214:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDem.g:2215:2: iv_ruleDCastExpression= ruleDCastExpression EOF
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
    // InternalDem.g:2221:1: ruleDCastExpression returns [EObject current=null] : (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2227:2: ( (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDem.g:2228:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDem.g:2228:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDem.g:2229:3: this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_DNavigableMemberReference_0=ruleDNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2237:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred9_InternalDem()) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==40) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred9_InternalDem()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalDem.g:2238:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDem.g:2238:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDem.g:2239:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDem.g:2245:5: ( () ruleOpCast )
                    // InternalDem.g:2246:6: () ruleOpCast
                    {
                    // InternalDem.g:2246:6: ()
                    // InternalDem.g:2247:7: 
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

                    // InternalDem.g:2262:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDem.g:2263:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDem.g:2263:5: (otherlv_3= RULE_ID )
                    // InternalDem.g:2264:6: otherlv_3= RULE_ID
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
    // InternalDem.g:2280:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDem.g:2280:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDem.g:2281:2: iv_ruleOpCast= ruleOpCast EOF
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
    // InternalDem.g:2287:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:2293:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDem.g:2294:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDem.g:2294:2: (kw= 'AS' | kw= 'as' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            else if ( (LA41_0==40) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDem.g:2295:3: kw= 'AS'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:2301:3: kw= 'as'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:2310:1: entryRuleDNavigableMemberReference returns [EObject current=null] : iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF ;
    public final EObject entryRuleDNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNavigableMemberReference = null;


        try {
            // InternalDem.g:2310:66: (iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF )
            // InternalDem.g:2311:2: iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF
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
    // InternalDem.g:2317:1: ruleDNavigableMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
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
            // InternalDem.g:2323:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalDem.g:2324:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalDem.g:2324:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalDem.g:2325:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2333:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==41) ) {
                    int LA45_2 = input.LA(2);

                    if ( (synpred10_InternalDem()) ) {
                        alt45=1;
                    }
                    else if ( (synpred11_InternalDem()) ) {
                        alt45=2;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalDem.g:2334:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDem.g:2334:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDem.g:2335:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDem.g:2335:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDem.g:2336:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDem.g:2348:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDem.g:2349:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDem.g:2349:7: ()
            	    // InternalDem.g:2350:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDem.g:2360:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:2361:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:2361:8: (otherlv_3= RULE_ID )
            	    // InternalDem.g:2362:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2382:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDem.g:2383:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDem.g:2383:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDem.g:2384:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    // InternalDem.g:2403:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalDem.g:2403:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalDem.g:2404:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalDem.g:2404:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDem.g:2405:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDem.g:2411:6: ( () otherlv_7= '.' )
            	    // InternalDem.g:2412:7: () otherlv_7= '.'
            	    {
            	    // InternalDem.g:2412:7: ()
            	    // InternalDem.g:2413:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDNavigableMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2425:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDem.g:2426:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDem.g:2426:6: (otherlv_8= RULE_ID )
            	    // InternalDem.g:2427:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2438:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt44=3;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==42) && (synpred12_InternalDem())) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==45) ) {
            	        alt44=2;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalDem.g:2439:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalDem.g:2439:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalDem.g:2440:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDem.g:2440:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDem.g:2441:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDem.g:2445:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDem.g:2446:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,42,FOLLOW_39); if (state.failed) return current;
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

            	            // InternalDem.g:2458:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt43=2;
            	            int LA43_0 = input.LA(1);

            	            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_PLAIN_TEXT_START)||(LA43_0>=RULE_NATURAL && LA43_0<=RULE_STRING)||LA43_0==42||(LA43_0>=46 && LA43_0<=54)||LA43_0==59||LA43_0==63||(LA43_0>=66 && LA43_0<=71)||(LA43_0>=74 && LA43_0<=75)||(LA43_0>=97 && LA43_0<=99)) ) {
            	                alt43=1;
            	            }
            	            switch (alt43) {
            	                case 1 :
            	                    // InternalDem.g:2459:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDem.g:2459:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDem.g:2460:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDem.g:2460:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDem.g:2461:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_40);
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

            	                    // InternalDem.g:2478:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop42:
            	                    do {
            	                        int alt42=2;
            	                        int LA42_0 = input.LA(1);

            	                        if ( (LA42_0==43) ) {
            	                            alt42=1;
            	                        }


            	                        switch (alt42) {
            	                    	case 1 :
            	                    	    // InternalDem.g:2479:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDNavigableMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalDem.g:2483:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDem.g:2484:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDem.g:2484:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDem.g:2485:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_40);
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
            	                    	    break loop42;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,44,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDem.g:2510:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalDem.g:2510:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalDem.g:2511:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalDem.g:2511:7: (lv_before_14_0= '@before' )
            	            // InternalDem.g:2512:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,45,FOLLOW_37); if (state.failed) return current;
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
            	    break loop45;
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
    // InternalDem.g:2531:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDem.g:2531:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDem.g:2532:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
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
    // InternalDem.g:2538:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
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
            // InternalDem.g:2544:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDem.g:2545:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDem.g:2545:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt46=10;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalDem.g:2546:3: this_DLiteralExpression_0= ruleDLiteralExpression
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
                    // InternalDem.g:2555:3: this_DSelfExpression_1= ruleDSelfExpression
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
                    // InternalDem.g:2564:3: this_DReturnExpression_2= ruleDReturnExpression
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
                    // InternalDem.g:2573:3: this_DRaiseExpression_3= ruleDRaiseExpression
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
                    // InternalDem.g:2582:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
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
                    // InternalDem.g:2591:3: this_DFunctionCall_5= ruleDFunctionCall
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
                    // InternalDem.g:2600:3: this_DConstructorCall_6= ruleDConstructorCall
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
                    // InternalDem.g:2609:3: this_DContextReference_7= ruleDContextReference
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
                    // InternalDem.g:2618:3: this_DIfExpression_8= ruleDIfExpression
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
                    // InternalDem.g:2627:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDem.g:2627:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDem.g:2628:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
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
    // InternalDem.g:2653:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDem.g:2653:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDem.g:2654:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
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
    // InternalDem.g:2660:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDem.g:2666:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDem.g:2667:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDem.g:2667:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt47=1;
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA47_3 = input.LA(2);

                if ( (LA47_3==41) ) {
                    int LA47_5 = input.LA(3);

                    if ( (LA47_5==RULE_NATURAL) ) {
                        alt47=4;
                    }
                    else if ( (LA47_5==RULE_ID) ) {
                        alt47=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA47_3==EOF||(LA47_3>=RULE_ID && LA47_3<=RULE_PLAIN_TEXT_END)||(LA47_3>=28 && LA47_3<=29)||(LA47_3>=37 && LA47_3<=40)||(LA47_3>=43 && LA47_3<=44)||LA47_3==57||(LA47_3>=60 && LA47_3<=62)||(LA47_3>=64 && LA47_3<=65)||(LA47_3>=74 && LA47_3<=75)||(LA47_3>=77 && LA47_3<=96)) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 3, input);

                    throw nvae;
                }
                }
                break;
            case 70:
            case 71:
                {
                alt47=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDem.g:2668:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
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
                    // InternalDem.g:2677:3: this_DStringLiteral_1= ruleDStringLiteral
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
                    // InternalDem.g:2686:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
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
                    // InternalDem.g:2695:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
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
                    // InternalDem.g:2704:3: this_DNilLiteral_4= ruleDNilLiteral
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
    // InternalDem.g:2716:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDem.g:2716:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDem.g:2717:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
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
    // InternalDem.g:2723:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDem.g:2729:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDem.g:2730:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDem.g:2730:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDem.g:2731:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDem.g:2731:3: ()
            // InternalDem.g:2732:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2738:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            else if ( (LA48_0==47) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDem.g:2739:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:2744:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:2753:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDem.g:2753:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDem.g:2754:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
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
    // InternalDem.g:2760:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2766:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDem.g:2767:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDem.g:2767:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDem.g:2768:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDem.g:2768:3: ()
            // InternalDem.g:2769:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2775:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            else if ( (LA49_0==49) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDem.g:2776:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:2781:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDem.g:2786:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalDem.g:2787:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDem.g:2788:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDem.g:2789:5: lv_expression_3_0= ruleDExpression
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
    // InternalDem.g:2810:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDem.g:2810:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDem.g:2811:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
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
    // InternalDem.g:2817:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2823:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDem.g:2824:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDem.g:2824:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDem.g:2825:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDem.g:2825:3: ()
            // InternalDem.g:2826:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2832:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            else if ( (LA51_0==51) ) {
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
                    // InternalDem.g:2833:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:2838:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDem.g:2843:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDem.g:2844:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDem.g:2844:4: (lv_expression_3_0= ruleDExpression )
            // InternalDem.g:2845:5: lv_expression_3_0= ruleDExpression
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
    // InternalDem.g:2866:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDem.g:2866:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDem.g:2867:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
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
    // InternalDem.g:2873:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDem.g:2879:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDem.g:2880:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDem.g:2880:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDem.g:2881:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_42);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:2901:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDem.g:2901:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDem.g:2902:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
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
    // InternalDem.g:2908:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDem.g:2914:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDem.g:2915:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDem.g:2915:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDem.g:2916:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDem.g:2916:3: ()
            // InternalDem.g:2917:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2923:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:2924:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:2924:4: (otherlv_1= RULE_ID )
            // InternalDem.g:2925:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:2940:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_PLAIN_TEXT_START)||(LA53_0>=RULE_NATURAL && LA53_0<=RULE_STRING)||LA53_0==42||(LA53_0>=46 && LA53_0<=54)||LA53_0==59||LA53_0==63||(LA53_0>=66 && LA53_0<=71)||(LA53_0>=74 && LA53_0<=75)||(LA53_0>=97 && LA53_0<=99)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDem.g:2941:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDem.g:2941:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDem.g:2942:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDem.g:2942:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDem.g:2943:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalDem.g:2960:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==43) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDem.g:2961:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:2965:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDem.g:2966:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:2966:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDem.g:2967:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:2994:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDem.g:2994:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDem.g:2995:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
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
    // InternalDem.g:3001:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalDem.g:3007:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDem.g:3008:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDem.g:3008:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDem.g:3009:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDem.g:3009:3: ()
            // InternalDem.g:3010:4: 
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
            // InternalDem.g:3023:3: ( (otherlv_2= RULE_ID ) )
            // InternalDem.g:3024:4: (otherlv_2= RULE_ID )
            {
            // InternalDem.g:3024:4: (otherlv_2= RULE_ID )
            // InternalDem.g:3025:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDComplexTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDem.g:3036:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42) && (synpred15_InternalDem())) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDem.g:3037:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDem.g:3037:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDem.g:3038:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDem.g:3042:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDem.g:3043:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,42,FOLLOW_39); if (state.failed) return current;
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

                    // InternalDem.g:3055:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_PLAIN_TEXT_START)||(LA55_0>=RULE_NATURAL && LA55_0<=RULE_STRING)||LA55_0==42||(LA55_0>=46 && LA55_0<=54)||LA55_0==59||LA55_0==63||(LA55_0>=66 && LA55_0<=71)||(LA55_0>=74 && LA55_0<=75)||(LA55_0>=97 && LA55_0<=99)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalDem.g:3056:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDem.g:3056:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDem.g:3057:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDem.g:3057:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDem.g:3058:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_40);
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

                            // InternalDem.g:3075:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==43) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalDem.g:3076:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDem.g:3080:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDem.g:3081:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDem.g:3081:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDem.g:3082:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_40);
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
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3110:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDem.g:3110:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDem.g:3111:2: iv_ruleOpConstructor= ruleOpConstructor EOF
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
    // InternalDem.g:3117:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3123:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDem.g:3124:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDem.g:3124:2: (kw= 'NEW' | kw= 'new' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            else if ( (LA57_0==53) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalDem.g:3125:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3131:3: kw= 'new'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3140:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDem.g:3140:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDem.g:3141:2: iv_ruleDContextReference= ruleDContextReference EOF
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
    // InternalDem.g:3147:1: ruleDContextReference returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_displayName_8_0=null;
        Token lv_plural_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDem.g:3153:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) ) )
            // InternalDem.g:3154:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) )
            {
            // InternalDem.g:3154:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) )
            // InternalDem.g:3155:3: () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) )
            {
            // InternalDem.g:3155:3: ()
            // InternalDem.g:3156:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3162:3: ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==54) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalDem.g:3163:4: ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
                    {
                    // InternalDem.g:3163:4: ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
                    // InternalDem.g:3164:5: ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
                    {
                    // InternalDem.g:3164:5: ( (otherlv_1= RULE_ID ) )
                    // InternalDem.g:3165:6: (otherlv_1= RULE_ID )
                    {
                    // InternalDem.g:3165:6: (otherlv_1= RULE_ID )
                    // InternalDem.g:3166:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDContextReferenceRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalDem.g:3177:5: ( (lv_before_2_0= '@before' ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==45) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalDem.g:3178:6: (lv_before_2_0= '@before' )
                            {
                            // InternalDem.g:3178:6: (lv_before_2_0= '@before' )
                            // InternalDem.g:3179:7: lv_before_2_0= '@before'
                            {
                            lv_before_2_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_before_2_0, grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_1_0_1_0());
                              						
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
                    break;
                case 2 :
                    // InternalDem.g:3193:4: (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) )
                    {
                    // InternalDem.g:3193:4: (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) )
                    // InternalDem.g:3194:5: otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDContextReferenceAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalDem.g:3198:5: ( ( ruleDQualifiedName ) )
                    // InternalDem.g:3199:6: ( ruleDQualifiedName )
                    {
                    // InternalDem.g:3199:6: ( ruleDQualifiedName )
                    // InternalDem.g:3200:7: ruleDQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDContextReferenceRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDContextReferenceAccess().getTargetIPrimaryNavigationTargetCrossReference_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    ruleDQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDem.g:3214:5: (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==55) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalDem.g:3215:6: otherlv_5= '#' ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getDContextReferenceAccess().getNumberSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalDem.g:3219:6: ( (otherlv_6= RULE_ID ) )
                            // InternalDem.g:3220:7: (otherlv_6= RULE_ID )
                            {
                            // InternalDem.g:3220:7: (otherlv_6= RULE_ID )
                            // InternalDem.g:3221:8: otherlv_6= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getDContextReferenceRule());
                              								}
                              							
                            }
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_6, grammarAccess.getDContextReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_2_1_0());
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDem.g:3233:5: (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==56) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalDem.g:3234:6: otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) )
                            {
                            otherlv_7=(Token)match(input,56,FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getDContextReferenceAccess().getVerticalLineKeyword_1_1_3_0());
                              					
                            }
                            // InternalDem.g:3238:6: ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) )
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==RULE_ID) ) {
                                alt60=1;
                            }
                            else if ( (LA60_0==57) ) {
                                alt60=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalDem.g:3239:7: ( (lv_displayName_8_0= RULE_ID ) )
                                    {
                                    // InternalDem.g:3239:7: ( (lv_displayName_8_0= RULE_ID ) )
                                    // InternalDem.g:3240:8: (lv_displayName_8_0= RULE_ID )
                                    {
                                    // InternalDem.g:3240:8: (lv_displayName_8_0= RULE_ID )
                                    // InternalDem.g:3241:9: lv_displayName_8_0= RULE_ID
                                    {
                                    lv_displayName_8_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_displayName_8_0, grammarAccess.getDContextReferenceAccess().getDisplayNameIDTerminalRuleCall_1_1_3_1_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getDContextReferenceRule());
                                      									}
                                      									setWithLastConsumed(
                                      										current,
                                      										"displayName",
                                      										lv_displayName_8_0,
                                      										"com.mimacom.ddd.dm.dmx.Dmx.ID");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalDem.g:3258:7: ( (lv_plural_9_0= '*' ) )
                                    {
                                    // InternalDem.g:3258:7: ( (lv_plural_9_0= '*' ) )
                                    // InternalDem.g:3259:8: (lv_plural_9_0= '*' )
                                    {
                                    // InternalDem.g:3259:8: (lv_plural_9_0= '*' )
                                    // InternalDem.g:3260:9: lv_plural_9_0= '*'
                                    {
                                    lv_plural_9_0=(Token)match(input,57,FOLLOW_49); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_plural_9_0, grammarAccess.getDContextReferenceAccess().getPluralAsteriskKeyword_1_1_3_1_1_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getDContextReferenceRule());
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

                    // InternalDem.g:3274:5: ( ( ']' )=>otherlv_10= ']' )
                    // InternalDem.g:3275:6: ( ']' )=>otherlv_10= ']'
                    {
                    otherlv_10=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getDContextReferenceAccess().getRightSquareBracketKeyword_1_1_4());
                      					
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
    // $ANTLR end "ruleDContextReference"


    // $ANTLR start "entryRuleDIfExpression"
    // InternalDem.g:3287:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDem.g:3287:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDem.g:3288:2: iv_ruleDIfExpression= ruleDIfExpression EOF
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
    // InternalDem.g:3294:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDem.g:3300:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDem.g:3301:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDem.g:3301:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDem.g:3302:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDem.g:3302:3: ()
            // InternalDem.g:3303:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDem.g:3313:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDem.g:3314:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDem.g:3314:4: (lv_if_2_0= ruleDExpression )
            // InternalDem.g:3315:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_50);
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

            otherlv_3=(Token)match(input,60,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDem.g:3336:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDem.g:3337:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDem.g:3337:4: (lv_then_4_0= ruleDExpression )
            // InternalDem.g:3338:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalDem.g:3355:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==61) && (synpred17_InternalDem())) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDem.g:3356:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDem.g:3356:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDem.g:3357:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDem.g:3363:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDem.g:3364:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDem.g:3364:5: (lv_else_6_0= ruleDExpression )
                    // InternalDem.g:3365:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
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

            otherlv_7=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3391:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDem.g:3391:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDem.g:3392:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
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
    // InternalDem.g:3398:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
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
            // InternalDem.g:3404:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDem.g:3405:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDem.g:3405:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDem.g:3406:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDem.g:3406:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDem.g:3407:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDem.g:3419:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDem.g:3420:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDem.g:3420:5: ()
            // InternalDem.g:3421:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDem.g:3431:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDem.g:3432:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDem.g:3432:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDem.g:3433:7: lv_declaredParam_2_0= RULE_ID
            {
            lv_declaredParam_2_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalDem.g:3455:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDem.g:3456:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDem.g:3456:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDem.g:3457:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_54);
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

            otherlv_5=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDem.g:3478:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDem.g:3479:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDem.g:3479:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDem.g:3480:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            otherlv_7=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3505:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDem.g:3505:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDem.g:3506:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDem.g:3512:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3518:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalDem.g:3519:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalDem.g:3519:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalDem.g:3520:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDem.g:3524:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalDem.g:3525:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalDem.g:3525:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalDem.g:3526:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_56); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,65,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalDem.g:3546:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalDem.g:3547:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalDem.g:3547:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalDem.g:3548:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            otherlv_4=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3573:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDem.g:3573:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDem.g:3574:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDem.g:3580:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3586:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDem.g:3587:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDem.g:3587:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_NATURAL) ) {
                alt64=1;
            }
            else if ( (LA64_0==57) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalDem.g:3588:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDem.g:3596:3: kw= '*'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3605:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDem.g:3605:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDem.g:3606:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
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
    // InternalDem.g:3612:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDem.g:3618:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDem.g:3619:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDem.g:3619:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDem.g:3620:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDem.g:3620:3: ()
            // InternalDem.g:3621:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3627:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt65=1;
                }
                break;
            case 67:
                {
                alt65=2;
                }
                break;
            case 68:
                {
                alt65=3;
                }
                break;
            case 69:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalDem.g:3628:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDem.g:3628:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDem.g:3629:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDem.g:3629:5: (lv_value_1_0= 'TRUE' )
                    // InternalDem.g:3630:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDem.g:3643:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDem.g:3643:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDem.g:3644:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDem.g:3644:5: (lv_value_2_0= 'true' )
                    // InternalDem.g:3645:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDem.g:3658:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDem.g:3663:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3672:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDem.g:3672:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDem.g:3673:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
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
    // InternalDem.g:3679:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:3685:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDem.g:3686:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDem.g:3686:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDem.g:3687:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDem.g:3687:3: ()
            // InternalDem.g:3688:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3694:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDem.g:3695:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDem.g:3695:4: (lv_value_1_0= RULE_STRING )
            // InternalDem.g:3696:5: lv_value_1_0= RULE_STRING
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
    // InternalDem.g:3716:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDem.g:3716:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDem.g:3717:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
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
    // InternalDem.g:3723:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:3729:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDem.g:3730:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDem.g:3730:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDem.g:3731:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDem.g:3731:3: ()
            // InternalDem.g:3732:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3738:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDem.g:3739:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDem.g:3739:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDem.g:3740:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDem.g:3760:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDem.g:3760:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDem.g:3761:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
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
    // InternalDem.g:3767:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3773:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDem.g:3774:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDem.g:3774:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDem.g:3775:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDem.g:3775:3: ()
            // InternalDem.g:3776:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3782:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDem.g:3783:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDem.g:3783:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDem.g:3784:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDem.g:3805:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDem.g:3805:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDem.g:3806:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
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
    // InternalDem.g:3812:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDem.g:3818:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDem.g:3819:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDem.g:3819:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDem.g:3820:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDem.g:3820:3: ()
            // InternalDem.g:3821:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3827:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==70) ) {
                alt66=1;
            }
            else if ( (LA66_0==71) ) {
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
                    // InternalDem.g:3828:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3833:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3842:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDem.g:3842:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDem.g:3843:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDem.g:3849:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDem.g:3855:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDem.g:3856:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDem.g:3856:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDem.g:3857:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,41,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDem.g:3876:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=72 && LA69_0<=73)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDem.g:3877:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDem.g:3877:4: (kw= 'E' | kw= 'e' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==72) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==73) ) {
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
                            // InternalDem.g:3878:5: kw= 'E'
                            {
                            kw=(Token)match(input,72,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:3884:5: kw= 'e'
                            {
                            kw=(Token)match(input,73,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDem.g:3890:4: (kw= '+' | kw= '-' )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==74) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==75) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalDem.g:3891:5: kw= '+'
                            {
                            kw=(Token)match(input,74,FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:3897:5: kw= '-'
                            {
                            kw=(Token)match(input,75,FOLLOW_55); if (state.failed) return current;
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
    // InternalDem.g:3915:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDem.g:3915:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDem.g:3916:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDem.g:3922:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3928:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDem.g:3929:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDem.g:3929:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDem.g:3930:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3940:3: (kw= '.*' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==76) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDem.g:3941:4: kw= '.*'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:3951:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDem.g:3951:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDem.g:3952:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDem.g:3958:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDem.g:3964:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDem.g:3965:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDem.g:3965:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDem.g:3966:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDem.g:3973:3: (kw= '.' this_ID_2= RULE_ID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==41) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalDem.g:3974:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleOpOr"
    // InternalDem.g:3991:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:3997:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDem.g:3998:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDem.g:3998:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt72=1;
                }
                break;
            case 78:
                {
                alt72=2;
                }
                break;
            case 79:
                {
                alt72=3;
                }
                break;
            case 80:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalDem.g:3999:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDem.g:3999:3: (enumLiteral_0= 'OR' )
                    // InternalDem.g:4000:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4007:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDem.g:4007:3: (enumLiteral_1= 'or' )
                    // InternalDem.g:4008:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4015:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDem.g:4015:3: (enumLiteral_2= 'XOR' )
                    // InternalDem.g:4016:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4023:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDem.g:4023:3: (enumLiteral_3= 'xor' )
                    // InternalDem.g:4024:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4034:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:4040:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDem.g:4041:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDem.g:4041:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==81) ) {
                alt73=1;
            }
            else if ( (LA73_0==82) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalDem.g:4042:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDem.g:4042:3: (enumLiteral_0= 'AND' )
                    // InternalDem.g:4043:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4050:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDem.g:4050:3: (enumLiteral_1= 'and' )
                    // InternalDem.g:4051:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4061:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:4067:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDem.g:4068:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDem.g:4068:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt74=1;
                }
                break;
            case 84:
                {
                alt74=2;
                }
                break;
            case 85:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalDem.g:4069:3: (enumLiteral_0= '=' )
                    {
                    // InternalDem.g:4069:3: (enumLiteral_0= '=' )
                    // InternalDem.g:4070:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4077:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDem.g:4077:3: (enumLiteral_1= '!=' )
                    // InternalDem.g:4078:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4085:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDem.g:4085:3: (enumLiteral_2= '<>' )
                    // InternalDem.g:4086:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4096:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDem.g:4102:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDem.g:4103:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDem.g:4103:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt75=1;
                }
                break;
            case 87:
                {
                alt75=2;
                }
                break;
            case 88:
                {
                alt75=3;
                }
                break;
            case 89:
                {
                alt75=4;
                }
                break;
            case 90:
                {
                alt75=5;
                }
                break;
            case 91:
                {
                alt75=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalDem.g:4104:3: (enumLiteral_0= '<' )
                    {
                    // InternalDem.g:4104:3: (enumLiteral_0= '<' )
                    // InternalDem.g:4105:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4112:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDem.g:4112:3: (enumLiteral_1= '<=' )
                    // InternalDem.g:4113:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4120:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDem.g:4120:3: (enumLiteral_2= '\\u2264' )
                    // InternalDem.g:4121:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4128:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDem.g:4128:3: (enumLiteral_3= '>=' )
                    // InternalDem.g:4129:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:4136:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDem.g:4136:3: (enumLiteral_4= '\\u2265' )
                    // InternalDem.g:4137:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDem.g:4144:3: (enumLiteral_5= '>' )
                    {
                    // InternalDem.g:4144:3: (enumLiteral_5= '>' )
                    // InternalDem.g:4145:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4155:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:4161:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDem.g:4162:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDem.g:4162:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt76=1;
                }
                break;
            case 92:
                {
                alt76=2;
                }
                break;
            case 93:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalDem.g:4163:3: (enumLiteral_0= '..' )
                    {
                    // InternalDem.g:4163:3: (enumLiteral_0= '..' )
                    // InternalDem.g:4164:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4171:3: (enumLiteral_1= '->' )
                    {
                    // InternalDem.g:4171:3: (enumLiteral_1= '->' )
                    // InternalDem.g:4172:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4179:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDem.g:4179:3: (enumLiteral_2= '=>' )
                    // InternalDem.g:4180:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4190:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:4196:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDem.g:4197:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDem.g:4197:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==74) ) {
                alt77=1;
            }
            else if ( (LA77_0==75) ) {
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
                    // InternalDem.g:4198:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:4198:3: (enumLiteral_0= '+' )
                    // InternalDem.g:4199:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4206:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:4206:3: (enumLiteral_1= '-' )
                    // InternalDem.g:4207:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4217:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:4223:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDem.g:4224:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDem.g:4224:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt78=1;
                }
                break;
            case 94:
                {
                alt78=2;
                }
                break;
            case 95:
                {
                alt78=3;
                }
                break;
            case 96:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalDem.g:4225:3: (enumLiteral_0= '*' )
                    {
                    // InternalDem.g:4225:3: (enumLiteral_0= '*' )
                    // InternalDem.g:4226:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4233:3: (enumLiteral_1= '/' )
                    {
                    // InternalDem.g:4233:3: (enumLiteral_1= '/' )
                    // InternalDem.g:4234:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4241:3: (enumLiteral_2= '**' )
                    {
                    // InternalDem.g:4241:3: (enumLiteral_2= '**' )
                    // InternalDem.g:4242:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4249:3: (enumLiteral_3= '%' )
                    {
                    // InternalDem.g:4249:3: (enumLiteral_3= '%' )
                    // InternalDem.g:4250:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:4260:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDem.g:4266:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDem.g:4267:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDem.g:4267:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt79=1;
                }
                break;
            case 75:
                {
                alt79=2;
                }
                break;
            case 97:
                {
                alt79=3;
                }
                break;
            case 98:
                {
                alt79=4;
                }
                break;
            case 99:
                {
                alt79=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalDem.g:4268:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:4268:3: (enumLiteral_0= '+' )
                    // InternalDem.g:4269:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4276:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:4276:3: (enumLiteral_1= '-' )
                    // InternalDem.g:4277:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4284:3: (enumLiteral_2= '!' )
                    {
                    // InternalDem.g:4284:3: (enumLiteral_2= '!' )
                    // InternalDem.g:4285:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4292:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDem.g:4292:3: (enumLiteral_3= 'NOT' )
                    // InternalDem.g:4293:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:4300:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDem.g:4300:3: (enumLiteral_4= 'not' )
                    // InternalDem.g:4301:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDem
    public final void synpred1_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1476:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDem.g:1476:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDem.g:1476:6: ( () ( ( ruleOpOr ) ) )
        // InternalDem.g:1477:6: () ( ( ruleOpOr ) )
        {
        // InternalDem.g:1477:6: ()
        // InternalDem.g:1478:6: 
        {
        }

        // InternalDem.g:1479:6: ( ( ruleOpOr ) )
        // InternalDem.g:1480:7: ( ruleOpOr )
        {
        // InternalDem.g:1480:7: ( ruleOpOr )
        // InternalDem.g:1481:8: ruleOpOr
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
    // $ANTLR end synpred1_InternalDem

    // $ANTLR start synpred2_InternalDem
    public final void synpred2_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1564:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDem.g:1564:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDem.g:1564:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDem.g:1565:6: () ( ( ruleOpAnd ) )
        {
        // InternalDem.g:1565:6: ()
        // InternalDem.g:1566:6: 
        {
        }

        // InternalDem.g:1567:6: ( ( ruleOpAnd ) )
        // InternalDem.g:1568:7: ( ruleOpAnd )
        {
        // InternalDem.g:1568:7: ( ruleOpAnd )
        // InternalDem.g:1569:8: ruleOpAnd
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
    // $ANTLR end synpred2_InternalDem

    // $ANTLR start synpred3_InternalDem
    public final void synpred3_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1652:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDem.g:1652:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDem.g:1652:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDem.g:1653:6: () ( ( ruleOpEquality ) )
        {
        // InternalDem.g:1653:6: ()
        // InternalDem.g:1654:6: 
        {
        }

        // InternalDem.g:1655:6: ( ( ruleOpEquality ) )
        // InternalDem.g:1656:7: ( ruleOpEquality )
        {
        // InternalDem.g:1656:7: ( ruleOpEquality )
        // InternalDem.g:1657:8: ruleOpEquality
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
    // $ANTLR end synpred3_InternalDem

    // $ANTLR start synpred4_InternalDem
    public final void synpred4_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1741:6: ( ( () ruleOpInstanceOf ) )
        // InternalDem.g:1741:7: ( () ruleOpInstanceOf )
        {
        // InternalDem.g:1741:7: ( () ruleOpInstanceOf )
        // InternalDem.g:1742:7: () ruleOpInstanceOf
        {
        // InternalDem.g:1742:7: ()
        // InternalDem.g:1743:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDem

    // $ANTLR start synpred5_InternalDem
    public final void synpred5_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1781:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDem.g:1781:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDem.g:1781:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDem.g:1782:7: () ( ( ruleOpCompare ) )
        {
        // InternalDem.g:1782:7: ()
        // InternalDem.g:1783:7: 
        {
        }

        // InternalDem.g:1784:7: ( ( ruleOpCompare ) )
        // InternalDem.g:1785:8: ( ruleOpCompare )
        {
        // InternalDem.g:1785:8: ( ruleOpCompare )
        // InternalDem.g:1786:9: ruleOpCompare
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
    // $ANTLR end synpred5_InternalDem

    // $ANTLR start synpred6_InternalDem
    public final void synpred6_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1900:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDem.g:1900:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDem.g:1900:6: ( () ( ( ruleOpOther ) ) )
        // InternalDem.g:1901:6: () ( ( ruleOpOther ) )
        {
        // InternalDem.g:1901:6: ()
        // InternalDem.g:1902:6: 
        {
        }

        // InternalDem.g:1903:6: ( ( ruleOpOther ) )
        // InternalDem.g:1904:7: ( ruleOpOther )
        {
        // InternalDem.g:1904:7: ( ruleOpOther )
        // InternalDem.g:1905:8: ruleOpOther
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
    // $ANTLR end synpred6_InternalDem

    // $ANTLR start synpred7_InternalDem
    public final void synpred7_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:1988:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDem.g:1988:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDem.g:1988:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDem.g:1989:6: () ( ( ruleOpAdd ) )
        {
        // InternalDem.g:1989:6: ()
        // InternalDem.g:1990:6: 
        {
        }

        // InternalDem.g:1991:6: ( ( ruleOpAdd ) )
        // InternalDem.g:1992:7: ( ruleOpAdd )
        {
        // InternalDem.g:1992:7: ( ruleOpAdd )
        // InternalDem.g:1993:8: ruleOpAdd
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
    // $ANTLR end synpred7_InternalDem

    // $ANTLR start synpred8_InternalDem
    public final void synpred8_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2076:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDem.g:2076:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDem.g:2076:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDem.g:2077:6: () ( ( ruleOpMulti ) )
        {
        // InternalDem.g:2077:6: ()
        // InternalDem.g:2078:6: 
        {
        }

        // InternalDem.g:2079:6: ( ( ruleOpMulti ) )
        // InternalDem.g:2080:7: ( ruleOpMulti )
        {
        // InternalDem.g:2080:7: ( ruleOpMulti )
        // InternalDem.g:2081:8: ruleOpMulti
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
    // $ANTLR end synpred8_InternalDem

    // $ANTLR start synpred9_InternalDem
    public final void synpred9_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2239:5: ( ( () ruleOpCast ) )
        // InternalDem.g:2239:6: ( () ruleOpCast )
        {
        // InternalDem.g:2239:6: ( () ruleOpCast )
        // InternalDem.g:2240:6: () ruleOpCast
        {
        // InternalDem.g:2240:6: ()
        // InternalDem.g:2241:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalDem

    // $ANTLR start synpred10_InternalDem
    public final void synpred10_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2336:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDem.g:2336:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDem.g:2336:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDem.g:2337:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDem.g:2337:7: ()
        // InternalDem.g:2338:7: 
        {
        }

        match(input,41,FOLLOW_3); if (state.failed) return ;
        // InternalDem.g:2340:7: ( ( RULE_ID ) )
        // InternalDem.g:2341:8: ( RULE_ID )
        {
        // InternalDem.g:2341:8: ( RULE_ID )
        // InternalDem.g:2342:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_27); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDem

    // $ANTLR start synpred11_InternalDem
    public final void synpred11_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2405:6: ( ( () '.' ) )
        // InternalDem.g:2405:7: ( () '.' )
        {
        // InternalDem.g:2405:7: ( () '.' )
        // InternalDem.g:2406:7: () '.'
        {
        // InternalDem.g:2406:7: ()
        // InternalDem.g:2407:7: 
        {
        }

        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDem

    // $ANTLR start synpred12_InternalDem
    public final void synpred12_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2441:8: ( ( '(' ) )
        // InternalDem.g:2441:9: ( '(' )
        {
        // InternalDem.g:2441:9: ( '(' )
        // InternalDem.g:2442:9: '('
        {
        match(input,42,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDem

    // $ANTLR start synpred13_InternalDem
    public final void synpred13_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2628:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDem.g:2628:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDem.g:2628:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDem.g:2629:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDem.g:2629:5: ()
        // InternalDem.g:2630:5: 
        {
        }

        match(input,63,FOLLOW_3); if (state.failed) return ;
        // InternalDem.g:2632:5: ( ( RULE_ID ) )
        // InternalDem.g:2633:6: ( RULE_ID )
        {
        // InternalDem.g:2633:6: ( RULE_ID )
        // InternalDem.g:2634:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_53); if (state.failed) return ;

        }


        }

        match(input,30,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDem

    // $ANTLR start synpred14_InternalDem
    public final void synpred14_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2787:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )
        // InternalDem.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_PLAIN_TEXT_START)||(input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_STRING)||input.LA(1)==42||(input.LA(1)>=46 && input.LA(1)<=54)||input.LA(1)==59||input.LA(1)==63||(input.LA(1)>=66 && input.LA(1)<=71)||(input.LA(1)>=74 && input.LA(1)<=75)||(input.LA(1)>=97 && input.LA(1)<=99) ) {
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
    // $ANTLR end synpred14_InternalDem

    // $ANTLR start synpred15_InternalDem
    public final void synpred15_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3038:5: ( ( '(' ) )
        // InternalDem.g:3038:6: ( '(' )
        {
        // InternalDem.g:3038:6: ( '(' )
        // InternalDem.g:3039:6: '('
        {
        match(input,42,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDem

    // $ANTLR start synpred16_InternalDem
    public final void synpred16_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3275:6: ( ']' )
        // InternalDem.g:3275:7: ']'
        {
        match(input,58,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalDem

    // $ANTLR start synpred17_InternalDem
    public final void synpred17_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3357:5: ( 'else' )
        // InternalDem.g:3357:6: 'else'
        {
        match(input,61,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalDem

    // Delegated rules

    public final boolean synpred9_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\140\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\2\1\3\1\0\1\4\1\6\1\7\1\1\1\5\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\1\23\uffff\2\1\7\uffff\1\2\1\3\3\1\1\uffff\2\1\14\uffff\1\1\2\uffff\3\1\1\uffff\2\1\10\uffff\2\1\1\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1738:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\6\uffff\1\10\5\uffff";
    static final String dfa_9s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_10s = "\1\107\5\uffff\1\140\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\6";
    static final String dfa_12s = "\1\0\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\4\uffff\2\1\37\uffff\1\5\3\uffff\2\2\2\3\2\4\2\7\1\10\4\uffff\1\11\3\uffff\1\12\2\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\5\10\23\uffff\2\10\7\uffff\5\10\1\13\3\10\13\uffff\1\10\2\uffff\3\10\1\uffff\2\10\10\uffff\2\10\1\uffff\24\10",
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

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2545:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_0 = input.LA(1);

                         
                        int index46_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA46_0>=RULE_NATURAL && LA46_0<=RULE_STRING)||(LA46_0>=66 && LA46_0<=71)) ) {s = 1;}

                        else if ( ((LA46_0>=46 && LA46_0<=47)) ) {s = 2;}

                        else if ( ((LA46_0>=48 && LA46_0<=49)) ) {s = 3;}

                        else if ( ((LA46_0>=50 && LA46_0<=51)) ) {s = 4;}

                        else if ( (LA46_0==42) ) {s = 5;}

                        else if ( (LA46_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA46_0>=52 && LA46_0<=53)) ) {s = 7;}

                        else if ( (LA46_0==54) ) {s = 8;}

                        else if ( (LA46_0==59) ) {s = 9;}

                        else if ( (LA46_0==63) && (synpred13_InternalDem())) {s = 10;}

                         
                        input.seek(index46_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\103\uffff";
    static final String dfa_15s = "\1\35\102\uffff";
    static final String dfa_16s = "\1\4\3\0\27\uffff\2\0\46\uffff";
    static final String dfa_17s = "\1\143\3\0\27\uffff\2\0\46\uffff";
    static final String dfa_18s = "\4\uffff\27\1\2\uffff\1\2\45\uffff";
    static final String dfa_19s = "\1\0\1\1\1\2\1\3\27\uffff\1\4\1\5\46\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\33\1\34\2\35\1\14\1\13\21\uffff\2\35\7\uffff\5\35\1\25\2\35\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\2\uffff\1\35\1\uffff\1\31\3\35\1\32\2\35\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\1\uffff\24\35\1\4\1\5\1\6",
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
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2786:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==RULE_ID) ) {s = 1;}

                        else if ( (LA50_0==74) ) {s = 2;}

                        else if ( (LA50_0==75) ) {s = 3;}

                        else if ( (LA50_0==97) && (synpred14_InternalDem())) {s = 4;}

                        else if ( (LA50_0==98) && (synpred14_InternalDem())) {s = 5;}

                        else if ( (LA50_0==99) && (synpred14_InternalDem())) {s = 6;}

                        else if ( (LA50_0==66) && (synpred14_InternalDem())) {s = 7;}

                        else if ( (LA50_0==67) && (synpred14_InternalDem())) {s = 8;}

                        else if ( (LA50_0==68) && (synpred14_InternalDem())) {s = 9;}

                        else if ( (LA50_0==69) && (synpred14_InternalDem())) {s = 10;}

                        else if ( (LA50_0==RULE_STRING) && (synpred14_InternalDem())) {s = 11;}

                        else if ( (LA50_0==RULE_NATURAL) && (synpred14_InternalDem())) {s = 12;}

                        else if ( (LA50_0==70) && (synpred14_InternalDem())) {s = 13;}

                        else if ( (LA50_0==71) && (synpred14_InternalDem())) {s = 14;}

                        else if ( (LA50_0==46) && (synpred14_InternalDem())) {s = 15;}

                        else if ( (LA50_0==47) && (synpred14_InternalDem())) {s = 16;}

                        else if ( (LA50_0==48) && (synpred14_InternalDem())) {s = 17;}

                        else if ( (LA50_0==49) && (synpred14_InternalDem())) {s = 18;}

                        else if ( (LA50_0==50) && (synpred14_InternalDem())) {s = 19;}

                        else if ( (LA50_0==51) && (synpred14_InternalDem())) {s = 20;}

                        else if ( (LA50_0==42) && (synpred14_InternalDem())) {s = 21;}

                        else if ( (LA50_0==52) && (synpred14_InternalDem())) {s = 22;}

                        else if ( (LA50_0==53) && (synpred14_InternalDem())) {s = 23;}

                        else if ( (LA50_0==54) && (synpred14_InternalDem())) {s = 24;}

                        else if ( (LA50_0==59) && (synpred14_InternalDem())) {s = 25;}

                        else if ( (LA50_0==63) && (synpred14_InternalDem())) {s = 26;}

                        else if ( (LA50_0==RULE_PLAIN_TEXT_ONLY) ) {s = 27;}

                        else if ( (LA50_0==RULE_PLAIN_TEXT_START) ) {s = 28;}

                        else if ( (LA50_0==EOF||(LA50_0>=RULE_PLAIN_TEXT_MIDDLE && LA50_0<=RULE_PLAIN_TEXT_END)||(LA50_0>=28 && LA50_0<=29)||(LA50_0>=37 && LA50_0<=41)||(LA50_0>=43 && LA50_0<=44)||LA50_0==57||(LA50_0>=60 && LA50_0<=62)||(LA50_0>=64 && LA50_0<=65)||(LA50_0>=77 && LA50_0<=96)) ) {s = 29;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDem()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDem()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDem()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_27 = input.LA(1);

                         
                        int index50_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDem()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_27);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_28 = input.LA(1);

                         
                        int index50_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDem()) ) {s = 26;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000A001C0062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00180002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000A00100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000240060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000036000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000034000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x887FC40000000670L,0x0000000E00000CFCL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000062L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x887FC40000000610L,0x0000000E00000CFCL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000260000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x887FD40000000670L,0x0000000E00000CFCL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x887FC40000000672L,0x0000000E00000CFCL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0580000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000C00L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}