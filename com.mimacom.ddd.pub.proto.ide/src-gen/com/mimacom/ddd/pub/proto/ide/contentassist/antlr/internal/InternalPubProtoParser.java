package com.mimacom.ddd.pub.proto.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.mimacom.ddd.pub.proto.services.PubProtoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPubProtoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'", "'publication'", "'class'", "'nature:'", "'segments:'", "'divisions:'", "'title:'", "'symbols:'", "'optional:'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'parts:'", "'appendix:'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'true'"
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


        public InternalPubProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPubProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPubProtoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPubProto.g"; }


    	private PubProtoGrammarAccess grammarAccess;

    	public void setGrammarAccess(PubProtoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePublicationClass"
    // InternalPubProto.g:53:1: entryRulePublicationClass : rulePublicationClass EOF ;
    public final void entryRulePublicationClass() throws RecognitionException {
        try {
            // InternalPubProto.g:54:1: ( rulePublicationClass EOF )
            // InternalPubProto.g:55:1: rulePublicationClass EOF
            {
             before(grammarAccess.getPublicationClassRule()); 
            pushFollow(FOLLOW_1);
            rulePublicationClass();

            state._fsp--;

             after(grammarAccess.getPublicationClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublicationClass"


    // $ANTLR start "rulePublicationClass"
    // InternalPubProto.g:62:1: rulePublicationClass : ( ( rule__PublicationClass__Group__0 ) ) ;
    public final void rulePublicationClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:66:2: ( ( ( rule__PublicationClass__Group__0 ) ) )
            // InternalPubProto.g:67:2: ( ( rule__PublicationClass__Group__0 ) )
            {
            // InternalPubProto.g:67:2: ( ( rule__PublicationClass__Group__0 ) )
            // InternalPubProto.g:68:3: ( rule__PublicationClass__Group__0 )
            {
             before(grammarAccess.getPublicationClassAccess().getGroup()); 
            // InternalPubProto.g:69:3: ( rule__PublicationClass__Group__0 )
            // InternalPubProto.g:69:4: rule__PublicationClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublicationClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicationClass"


    // $ANTLR start "entryRuleProtoDocumentSegment"
    // InternalPubProto.g:78:1: entryRuleProtoDocumentSegment : ruleProtoDocumentSegment EOF ;
    public final void entryRuleProtoDocumentSegment() throws RecognitionException {
        try {
            // InternalPubProto.g:79:1: ( ruleProtoDocumentSegment EOF )
            // InternalPubProto.g:80:1: ruleProtoDocumentSegment EOF
            {
             before(grammarAccess.getProtoDocumentSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoDocumentSegment();

            state._fsp--;

             after(grammarAccess.getProtoDocumentSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoDocumentSegment"


    // $ANTLR start "ruleProtoDocumentSegment"
    // InternalPubProto.g:87:1: ruleProtoDocumentSegment : ( ( rule__ProtoDocumentSegment__Alternatives ) ) ;
    public final void ruleProtoDocumentSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:91:2: ( ( ( rule__ProtoDocumentSegment__Alternatives ) ) )
            // InternalPubProto.g:92:2: ( ( rule__ProtoDocumentSegment__Alternatives ) )
            {
            // InternalPubProto.g:92:2: ( ( rule__ProtoDocumentSegment__Alternatives ) )
            // InternalPubProto.g:93:3: ( rule__ProtoDocumentSegment__Alternatives )
            {
             before(grammarAccess.getProtoDocumentSegmentAccess().getAlternatives()); 
            // InternalPubProto.g:94:3: ( rule__ProtoDocumentSegment__Alternatives )
            // InternalPubProto.g:94:4: rule__ProtoDocumentSegment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProtoDocumentSegment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtoDocumentSegmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoDocumentSegment"


    // $ANTLR start "ruleSegmentBody"
    // InternalPubProto.g:104:1: ruleSegmentBody : ( ( rule__SegmentBody__Group__0 ) ) ;
    public final void ruleSegmentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:108:2: ( ( ( rule__SegmentBody__Group__0 ) ) )
            // InternalPubProto.g:109:2: ( ( rule__SegmentBody__Group__0 ) )
            {
            // InternalPubProto.g:109:2: ( ( rule__SegmentBody__Group__0 ) )
            // InternalPubProto.g:110:3: ( rule__SegmentBody__Group__0 )
            {
             before(grammarAccess.getSegmentBodyAccess().getGroup()); 
            // InternalPubProto.g:111:3: ( rule__SegmentBody__Group__0 )
            // InternalPubProto.g:111:4: rule__SegmentBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSegmentBody"


    // $ANTLR start "entryRuleProtoAbstract"
    // InternalPubProto.g:120:1: entryRuleProtoAbstract : ruleProtoAbstract EOF ;
    public final void entryRuleProtoAbstract() throws RecognitionException {
        try {
            // InternalPubProto.g:121:1: ( ruleProtoAbstract EOF )
            // InternalPubProto.g:122:1: ruleProtoAbstract EOF
            {
             before(grammarAccess.getProtoAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoAbstract();

            state._fsp--;

             after(grammarAccess.getProtoAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoAbstract"


    // $ANTLR start "ruleProtoAbstract"
    // InternalPubProto.g:129:1: ruleProtoAbstract : ( ( rule__ProtoAbstract__Group__0 ) ) ;
    public final void ruleProtoAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:133:2: ( ( ( rule__ProtoAbstract__Group__0 ) ) )
            // InternalPubProto.g:134:2: ( ( rule__ProtoAbstract__Group__0 ) )
            {
            // InternalPubProto.g:134:2: ( ( rule__ProtoAbstract__Group__0 ) )
            // InternalPubProto.g:135:3: ( rule__ProtoAbstract__Group__0 )
            {
             before(grammarAccess.getProtoAbstractAccess().getGroup()); 
            // InternalPubProto.g:136:3: ( rule__ProtoAbstract__Group__0 )
            // InternalPubProto.g:136:4: rule__ProtoAbstract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoAbstractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoAbstract"


    // $ANTLR start "entryRuleProtoPreface"
    // InternalPubProto.g:145:1: entryRuleProtoPreface : ruleProtoPreface EOF ;
    public final void entryRuleProtoPreface() throws RecognitionException {
        try {
            // InternalPubProto.g:146:1: ( ruleProtoPreface EOF )
            // InternalPubProto.g:147:1: ruleProtoPreface EOF
            {
             before(grammarAccess.getProtoPrefaceRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoPreface();

            state._fsp--;

             after(grammarAccess.getProtoPrefaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoPreface"


    // $ANTLR start "ruleProtoPreface"
    // InternalPubProto.g:154:1: ruleProtoPreface : ( ( rule__ProtoPreface__Group__0 ) ) ;
    public final void ruleProtoPreface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:158:2: ( ( ( rule__ProtoPreface__Group__0 ) ) )
            // InternalPubProto.g:159:2: ( ( rule__ProtoPreface__Group__0 ) )
            {
            // InternalPubProto.g:159:2: ( ( rule__ProtoPreface__Group__0 ) )
            // InternalPubProto.g:160:3: ( rule__ProtoPreface__Group__0 )
            {
             before(grammarAccess.getProtoPrefaceAccess().getGroup()); 
            // InternalPubProto.g:161:3: ( rule__ProtoPreface__Group__0 )
            // InternalPubProto.g:161:4: rule__ProtoPreface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoPrefaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoPreface"


    // $ANTLR start "entryRuleProtoEpilogue"
    // InternalPubProto.g:170:1: entryRuleProtoEpilogue : ruleProtoEpilogue EOF ;
    public final void entryRuleProtoEpilogue() throws RecognitionException {
        try {
            // InternalPubProto.g:171:1: ( ruleProtoEpilogue EOF )
            // InternalPubProto.g:172:1: ruleProtoEpilogue EOF
            {
             before(grammarAccess.getProtoEpilogueRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoEpilogue();

            state._fsp--;

             after(grammarAccess.getProtoEpilogueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoEpilogue"


    // $ANTLR start "ruleProtoEpilogue"
    // InternalPubProto.g:179:1: ruleProtoEpilogue : ( ( rule__ProtoEpilogue__Group__0 ) ) ;
    public final void ruleProtoEpilogue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:183:2: ( ( ( rule__ProtoEpilogue__Group__0 ) ) )
            // InternalPubProto.g:184:2: ( ( rule__ProtoEpilogue__Group__0 ) )
            {
            // InternalPubProto.g:184:2: ( ( rule__ProtoEpilogue__Group__0 ) )
            // InternalPubProto.g:185:3: ( rule__ProtoEpilogue__Group__0 )
            {
             before(grammarAccess.getProtoEpilogueAccess().getGroup()); 
            // InternalPubProto.g:186:3: ( rule__ProtoEpilogue__Group__0 )
            // InternalPubProto.g:186:4: rule__ProtoEpilogue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoEpilogueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoEpilogue"


    // $ANTLR start "entryRuleProtoPublicationBody"
    // InternalPubProto.g:195:1: entryRuleProtoPublicationBody : ruleProtoPublicationBody EOF ;
    public final void entryRuleProtoPublicationBody() throws RecognitionException {
        try {
            // InternalPubProto.g:196:1: ( ruleProtoPublicationBody EOF )
            // InternalPubProto.g:197:1: ruleProtoPublicationBody EOF
            {
             before(grammarAccess.getProtoPublicationBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoPublicationBody();

            state._fsp--;

             after(grammarAccess.getProtoPublicationBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoPublicationBody"


    // $ANTLR start "ruleProtoPublicationBody"
    // InternalPubProto.g:204:1: ruleProtoPublicationBody : ( ( rule__ProtoPublicationBody__Group__0 ) ) ;
    public final void ruleProtoPublicationBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:208:2: ( ( ( rule__ProtoPublicationBody__Group__0 ) ) )
            // InternalPubProto.g:209:2: ( ( rule__ProtoPublicationBody__Group__0 ) )
            {
            // InternalPubProto.g:209:2: ( ( rule__ProtoPublicationBody__Group__0 ) )
            // InternalPubProto.g:210:3: ( rule__ProtoPublicationBody__Group__0 )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getGroup()); 
            // InternalPubProto.g:211:3: ( rule__ProtoPublicationBody__Group__0 )
            // InternalPubProto.g:211:4: rule__ProtoPublicationBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoPublicationBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoPublicationBody"


    // $ANTLR start "entryRuleProtoChangeHistory"
    // InternalPubProto.g:220:1: entryRuleProtoChangeHistory : ruleProtoChangeHistory EOF ;
    public final void entryRuleProtoChangeHistory() throws RecognitionException {
        try {
            // InternalPubProto.g:221:1: ( ruleProtoChangeHistory EOF )
            // InternalPubProto.g:222:1: ruleProtoChangeHistory EOF
            {
             before(grammarAccess.getProtoChangeHistoryRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoChangeHistory();

            state._fsp--;

             after(grammarAccess.getProtoChangeHistoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoChangeHistory"


    // $ANTLR start "ruleProtoChangeHistory"
    // InternalPubProto.g:229:1: ruleProtoChangeHistory : ( ( rule__ProtoChangeHistory__Group__0 ) ) ;
    public final void ruleProtoChangeHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:233:2: ( ( ( rule__ProtoChangeHistory__Group__0 ) ) )
            // InternalPubProto.g:234:2: ( ( rule__ProtoChangeHistory__Group__0 ) )
            {
            // InternalPubProto.g:234:2: ( ( rule__ProtoChangeHistory__Group__0 ) )
            // InternalPubProto.g:235:3: ( rule__ProtoChangeHistory__Group__0 )
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getGroup()); 
            // InternalPubProto.g:236:3: ( rule__ProtoChangeHistory__Group__0 )
            // InternalPubProto.g:236:4: rule__ProtoChangeHistory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoChangeHistoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoChangeHistory"


    // $ANTLR start "entryRuleProtoTOC"
    // InternalPubProto.g:245:1: entryRuleProtoTOC : ruleProtoTOC EOF ;
    public final void entryRuleProtoTOC() throws RecognitionException {
        try {
            // InternalPubProto.g:246:1: ( ruleProtoTOC EOF )
            // InternalPubProto.g:247:1: ruleProtoTOC EOF
            {
             before(grammarAccess.getProtoTOCRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoTOC();

            state._fsp--;

             after(grammarAccess.getProtoTOCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoTOC"


    // $ANTLR start "ruleProtoTOC"
    // InternalPubProto.g:254:1: ruleProtoTOC : ( ( rule__ProtoTOC__Group__0 ) ) ;
    public final void ruleProtoTOC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:258:2: ( ( ( rule__ProtoTOC__Group__0 ) ) )
            // InternalPubProto.g:259:2: ( ( rule__ProtoTOC__Group__0 ) )
            {
            // InternalPubProto.g:259:2: ( ( rule__ProtoTOC__Group__0 ) )
            // InternalPubProto.g:260:3: ( rule__ProtoTOC__Group__0 )
            {
             before(grammarAccess.getProtoTOCAccess().getGroup()); 
            // InternalPubProto.g:261:3: ( rule__ProtoTOC__Group__0 )
            // InternalPubProto.g:261:4: rule__ProtoTOC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoTOCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoTOC"


    // $ANTLR start "entryRuleProtoAbbreviations"
    // InternalPubProto.g:270:1: entryRuleProtoAbbreviations : ruleProtoAbbreviations EOF ;
    public final void entryRuleProtoAbbreviations() throws RecognitionException {
        try {
            // InternalPubProto.g:271:1: ( ruleProtoAbbreviations EOF )
            // InternalPubProto.g:272:1: ruleProtoAbbreviations EOF
            {
             before(grammarAccess.getProtoAbbreviationsRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoAbbreviations();

            state._fsp--;

             after(grammarAccess.getProtoAbbreviationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoAbbreviations"


    // $ANTLR start "ruleProtoAbbreviations"
    // InternalPubProto.g:279:1: ruleProtoAbbreviations : ( ( rule__ProtoAbbreviations__Group__0 ) ) ;
    public final void ruleProtoAbbreviations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:283:2: ( ( ( rule__ProtoAbbreviations__Group__0 ) ) )
            // InternalPubProto.g:284:2: ( ( rule__ProtoAbbreviations__Group__0 ) )
            {
            // InternalPubProto.g:284:2: ( ( rule__ProtoAbbreviations__Group__0 ) )
            // InternalPubProto.g:285:3: ( rule__ProtoAbbreviations__Group__0 )
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getGroup()); 
            // InternalPubProto.g:286:3: ( rule__ProtoAbbreviations__Group__0 )
            // InternalPubProto.g:286:4: rule__ProtoAbbreviations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoAbbreviationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoAbbreviations"


    // $ANTLR start "entryRuleProtoListOfTables"
    // InternalPubProto.g:295:1: entryRuleProtoListOfTables : ruleProtoListOfTables EOF ;
    public final void entryRuleProtoListOfTables() throws RecognitionException {
        try {
            // InternalPubProto.g:296:1: ( ruleProtoListOfTables EOF )
            // InternalPubProto.g:297:1: ruleProtoListOfTables EOF
            {
             before(grammarAccess.getProtoListOfTablesRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoListOfTables();

            state._fsp--;

             after(grammarAccess.getProtoListOfTablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoListOfTables"


    // $ANTLR start "ruleProtoListOfTables"
    // InternalPubProto.g:304:1: ruleProtoListOfTables : ( ( rule__ProtoListOfTables__Group__0 ) ) ;
    public final void ruleProtoListOfTables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:308:2: ( ( ( rule__ProtoListOfTables__Group__0 ) ) )
            // InternalPubProto.g:309:2: ( ( rule__ProtoListOfTables__Group__0 ) )
            {
            // InternalPubProto.g:309:2: ( ( rule__ProtoListOfTables__Group__0 ) )
            // InternalPubProto.g:310:3: ( rule__ProtoListOfTables__Group__0 )
            {
             before(grammarAccess.getProtoListOfTablesAccess().getGroup()); 
            // InternalPubProto.g:311:3: ( rule__ProtoListOfTables__Group__0 )
            // InternalPubProto.g:311:4: rule__ProtoListOfTables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoListOfTablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoListOfTables"


    // $ANTLR start "entryRuleProtoListOfFigures"
    // InternalPubProto.g:320:1: entryRuleProtoListOfFigures : ruleProtoListOfFigures EOF ;
    public final void entryRuleProtoListOfFigures() throws RecognitionException {
        try {
            // InternalPubProto.g:321:1: ( ruleProtoListOfFigures EOF )
            // InternalPubProto.g:322:1: ruleProtoListOfFigures EOF
            {
             before(grammarAccess.getProtoListOfFiguresRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoListOfFigures();

            state._fsp--;

             after(grammarAccess.getProtoListOfFiguresRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoListOfFigures"


    // $ANTLR start "ruleProtoListOfFigures"
    // InternalPubProto.g:329:1: ruleProtoListOfFigures : ( ( rule__ProtoListOfFigures__Group__0 ) ) ;
    public final void ruleProtoListOfFigures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:333:2: ( ( ( rule__ProtoListOfFigures__Group__0 ) ) )
            // InternalPubProto.g:334:2: ( ( rule__ProtoListOfFigures__Group__0 ) )
            {
            // InternalPubProto.g:334:2: ( ( rule__ProtoListOfFigures__Group__0 ) )
            // InternalPubProto.g:335:3: ( rule__ProtoListOfFigures__Group__0 )
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getGroup()); 
            // InternalPubProto.g:336:3: ( rule__ProtoListOfFigures__Group__0 )
            // InternalPubProto.g:336:4: rule__ProtoListOfFigures__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoListOfFiguresAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoListOfFigures"


    // $ANTLR start "entryRuleProtoBibliography"
    // InternalPubProto.g:345:1: entryRuleProtoBibliography : ruleProtoBibliography EOF ;
    public final void entryRuleProtoBibliography() throws RecognitionException {
        try {
            // InternalPubProto.g:346:1: ( ruleProtoBibliography EOF )
            // InternalPubProto.g:347:1: ruleProtoBibliography EOF
            {
             before(grammarAccess.getProtoBibliographyRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoBibliography();

            state._fsp--;

             after(grammarAccess.getProtoBibliographyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoBibliography"


    // $ANTLR start "ruleProtoBibliography"
    // InternalPubProto.g:354:1: ruleProtoBibliography : ( ( rule__ProtoBibliography__Group__0 ) ) ;
    public final void ruleProtoBibliography() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:358:2: ( ( ( rule__ProtoBibliography__Group__0 ) ) )
            // InternalPubProto.g:359:2: ( ( rule__ProtoBibliography__Group__0 ) )
            {
            // InternalPubProto.g:359:2: ( ( rule__ProtoBibliography__Group__0 ) )
            // InternalPubProto.g:360:3: ( rule__ProtoBibliography__Group__0 )
            {
             before(grammarAccess.getProtoBibliographyAccess().getGroup()); 
            // InternalPubProto.g:361:3: ( rule__ProtoBibliography__Group__0 )
            // InternalPubProto.g:361:4: rule__ProtoBibliography__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoBibliographyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoBibliography"


    // $ANTLR start "entryRuleProtoGlossary"
    // InternalPubProto.g:370:1: entryRuleProtoGlossary : ruleProtoGlossary EOF ;
    public final void entryRuleProtoGlossary() throws RecognitionException {
        try {
            // InternalPubProto.g:371:1: ( ruleProtoGlossary EOF )
            // InternalPubProto.g:372:1: ruleProtoGlossary EOF
            {
             before(grammarAccess.getProtoGlossaryRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoGlossary();

            state._fsp--;

             after(grammarAccess.getProtoGlossaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoGlossary"


    // $ANTLR start "ruleProtoGlossary"
    // InternalPubProto.g:379:1: ruleProtoGlossary : ( ( rule__ProtoGlossary__Group__0 ) ) ;
    public final void ruleProtoGlossary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:383:2: ( ( ( rule__ProtoGlossary__Group__0 ) ) )
            // InternalPubProto.g:384:2: ( ( rule__ProtoGlossary__Group__0 ) )
            {
            // InternalPubProto.g:384:2: ( ( rule__ProtoGlossary__Group__0 ) )
            // InternalPubProto.g:385:3: ( rule__ProtoGlossary__Group__0 )
            {
             before(grammarAccess.getProtoGlossaryAccess().getGroup()); 
            // InternalPubProto.g:386:3: ( rule__ProtoGlossary__Group__0 )
            // InternalPubProto.g:386:4: rule__ProtoGlossary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoGlossaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoGlossary"


    // $ANTLR start "entryRuleProtoIndex"
    // InternalPubProto.g:395:1: entryRuleProtoIndex : ruleProtoIndex EOF ;
    public final void entryRuleProtoIndex() throws RecognitionException {
        try {
            // InternalPubProto.g:396:1: ( ruleProtoIndex EOF )
            // InternalPubProto.g:397:1: ruleProtoIndex EOF
            {
             before(grammarAccess.getProtoIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoIndex();

            state._fsp--;

             after(grammarAccess.getProtoIndexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoIndex"


    // $ANTLR start "ruleProtoIndex"
    // InternalPubProto.g:404:1: ruleProtoIndex : ( ( rule__ProtoIndex__Group__0 ) ) ;
    public final void ruleProtoIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:408:2: ( ( ( rule__ProtoIndex__Group__0 ) ) )
            // InternalPubProto.g:409:2: ( ( rule__ProtoIndex__Group__0 ) )
            {
            // InternalPubProto.g:409:2: ( ( rule__ProtoIndex__Group__0 ) )
            // InternalPubProto.g:410:3: ( rule__ProtoIndex__Group__0 )
            {
             before(grammarAccess.getProtoIndexAccess().getGroup()); 
            // InternalPubProto.g:411:3: ( rule__ProtoIndex__Group__0 )
            // InternalPubProto.g:411:4: rule__ProtoIndex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoIndexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoIndex"


    // $ANTLR start "entryRuleProtoDivision"
    // InternalPubProto.g:420:1: entryRuleProtoDivision : ruleProtoDivision EOF ;
    public final void entryRuleProtoDivision() throws RecognitionException {
        try {
            // InternalPubProto.g:421:1: ( ruleProtoDivision EOF )
            // InternalPubProto.g:422:1: ruleProtoDivision EOF
            {
             before(grammarAccess.getProtoDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoDivision();

            state._fsp--;

             after(grammarAccess.getProtoDivisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoDivision"


    // $ANTLR start "ruleProtoDivision"
    // InternalPubProto.g:429:1: ruleProtoDivision : ( ( rule__ProtoDivision__Alternatives ) ) ;
    public final void ruleProtoDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:433:2: ( ( ( rule__ProtoDivision__Alternatives ) ) )
            // InternalPubProto.g:434:2: ( ( rule__ProtoDivision__Alternatives ) )
            {
            // InternalPubProto.g:434:2: ( ( rule__ProtoDivision__Alternatives ) )
            // InternalPubProto.g:435:3: ( rule__ProtoDivision__Alternatives )
            {
             before(grammarAccess.getProtoDivisionAccess().getAlternatives()); 
            // InternalPubProto.g:436:3: ( rule__ProtoDivision__Alternatives )
            // InternalPubProto.g:436:4: rule__ProtoDivision__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProtoDivision__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtoDivisionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoDivision"


    // $ANTLR start "ruleProtoDivisionBody"
    // InternalPubProto.g:446:1: ruleProtoDivisionBody : ( ( rule__ProtoDivisionBody__Group__0 )? ) ;
    public final void ruleProtoDivisionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:450:2: ( ( ( rule__ProtoDivisionBody__Group__0 )? ) )
            // InternalPubProto.g:451:2: ( ( rule__ProtoDivisionBody__Group__0 )? )
            {
            // InternalPubProto.g:451:2: ( ( rule__ProtoDivisionBody__Group__0 )? )
            // InternalPubProto.g:452:3: ( rule__ProtoDivisionBody__Group__0 )?
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getGroup()); 
            // InternalPubProto.g:453:3: ( rule__ProtoDivisionBody__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPubProto.g:453:4: rule__ProtoDivisionBody__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoDivisionBody__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtoDivisionBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoDivisionBody"


    // $ANTLR start "entryRuleProtoPart"
    // InternalPubProto.g:462:1: entryRuleProtoPart : ruleProtoPart EOF ;
    public final void entryRuleProtoPart() throws RecognitionException {
        try {
            // InternalPubProto.g:463:1: ( ruleProtoPart EOF )
            // InternalPubProto.g:464:1: ruleProtoPart EOF
            {
             before(grammarAccess.getProtoPartRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoPart();

            state._fsp--;

             after(grammarAccess.getProtoPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoPart"


    // $ANTLR start "ruleProtoPart"
    // InternalPubProto.g:471:1: ruleProtoPart : ( ( rule__ProtoPart__Group__0 ) ) ;
    public final void ruleProtoPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:475:2: ( ( ( rule__ProtoPart__Group__0 ) ) )
            // InternalPubProto.g:476:2: ( ( rule__ProtoPart__Group__0 ) )
            {
            // InternalPubProto.g:476:2: ( ( rule__ProtoPart__Group__0 ) )
            // InternalPubProto.g:477:3: ( rule__ProtoPart__Group__0 )
            {
             before(grammarAccess.getProtoPartAccess().getGroup()); 
            // InternalPubProto.g:478:3: ( rule__ProtoPart__Group__0 )
            // InternalPubProto.g:478:4: rule__ProtoPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoPart"


    // $ANTLR start "entryRuleProtoAppendix"
    // InternalPubProto.g:487:1: entryRuleProtoAppendix : ruleProtoAppendix EOF ;
    public final void entryRuleProtoAppendix() throws RecognitionException {
        try {
            // InternalPubProto.g:488:1: ( ruleProtoAppendix EOF )
            // InternalPubProto.g:489:1: ruleProtoAppendix EOF
            {
             before(grammarAccess.getProtoAppendixRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoAppendix();

            state._fsp--;

             after(grammarAccess.getProtoAppendixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoAppendix"


    // $ANTLR start "ruleProtoAppendix"
    // InternalPubProto.g:496:1: ruleProtoAppendix : ( ( rule__ProtoAppendix__Group__0 ) ) ;
    public final void ruleProtoAppendix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:500:2: ( ( ( rule__ProtoAppendix__Group__0 ) ) )
            // InternalPubProto.g:501:2: ( ( rule__ProtoAppendix__Group__0 ) )
            {
            // InternalPubProto.g:501:2: ( ( rule__ProtoAppendix__Group__0 ) )
            // InternalPubProto.g:502:3: ( rule__ProtoAppendix__Group__0 )
            {
             before(grammarAccess.getProtoAppendixAccess().getGroup()); 
            // InternalPubProto.g:503:3: ( rule__ProtoAppendix__Group__0 )
            // InternalPubProto.g:503:4: rule__ProtoAppendix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoAppendixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoAppendix"


    // $ANTLR start "entryRuleProtoChapter"
    // InternalPubProto.g:512:1: entryRuleProtoChapter : ruleProtoChapter EOF ;
    public final void entryRuleProtoChapter() throws RecognitionException {
        try {
            // InternalPubProto.g:513:1: ( ruleProtoChapter EOF )
            // InternalPubProto.g:514:1: ruleProtoChapter EOF
            {
             before(grammarAccess.getProtoChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoChapter();

            state._fsp--;

             after(grammarAccess.getProtoChapterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoChapter"


    // $ANTLR start "ruleProtoChapter"
    // InternalPubProto.g:521:1: ruleProtoChapter : ( ( rule__ProtoChapter__Group__0 ) ) ;
    public final void ruleProtoChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:525:2: ( ( ( rule__ProtoChapter__Group__0 ) ) )
            // InternalPubProto.g:526:2: ( ( rule__ProtoChapter__Group__0 ) )
            {
            // InternalPubProto.g:526:2: ( ( rule__ProtoChapter__Group__0 ) )
            // InternalPubProto.g:527:3: ( rule__ProtoChapter__Group__0 )
            {
             before(grammarAccess.getProtoChapterAccess().getGroup()); 
            // InternalPubProto.g:528:3: ( rule__ProtoChapter__Group__0 )
            // InternalPubProto.g:528:4: rule__ProtoChapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoChapter"


    // $ANTLR start "entryRuleProtoSection"
    // InternalPubProto.g:537:1: entryRuleProtoSection : ruleProtoSection EOF ;
    public final void entryRuleProtoSection() throws RecognitionException {
        try {
            // InternalPubProto.g:538:1: ( ruleProtoSection EOF )
            // InternalPubProto.g:539:1: ruleProtoSection EOF
            {
             before(grammarAccess.getProtoSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoSection();

            state._fsp--;

             after(grammarAccess.getProtoSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoSection"


    // $ANTLR start "ruleProtoSection"
    // InternalPubProto.g:546:1: ruleProtoSection : ( ( rule__ProtoSection__Group__0 ) ) ;
    public final void ruleProtoSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:550:2: ( ( ( rule__ProtoSection__Group__0 ) ) )
            // InternalPubProto.g:551:2: ( ( rule__ProtoSection__Group__0 ) )
            {
            // InternalPubProto.g:551:2: ( ( rule__ProtoSection__Group__0 ) )
            // InternalPubProto.g:552:3: ( rule__ProtoSection__Group__0 )
            {
             before(grammarAccess.getProtoSectionAccess().getGroup()); 
            // InternalPubProto.g:553:3: ( rule__ProtoSection__Group__0 )
            // InternalPubProto.g:553:4: rule__ProtoSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoSection"


    // $ANTLR start "entryRuleProtoSubsection"
    // InternalPubProto.g:562:1: entryRuleProtoSubsection : ruleProtoSubsection EOF ;
    public final void entryRuleProtoSubsection() throws RecognitionException {
        try {
            // InternalPubProto.g:563:1: ( ruleProtoSubsection EOF )
            // InternalPubProto.g:564:1: ruleProtoSubsection EOF
            {
             before(grammarAccess.getProtoSubsectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoSubsection();

            state._fsp--;

             after(grammarAccess.getProtoSubsectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoSubsection"


    // $ANTLR start "ruleProtoSubsection"
    // InternalPubProto.g:571:1: ruleProtoSubsection : ( ( rule__ProtoSubsection__Group__0 ) ) ;
    public final void ruleProtoSubsection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:575:2: ( ( ( rule__ProtoSubsection__Group__0 ) ) )
            // InternalPubProto.g:576:2: ( ( rule__ProtoSubsection__Group__0 ) )
            {
            // InternalPubProto.g:576:2: ( ( rule__ProtoSubsection__Group__0 ) )
            // InternalPubProto.g:577:3: ( rule__ProtoSubsection__Group__0 )
            {
             before(grammarAccess.getProtoSubsectionAccess().getGroup()); 
            // InternalPubProto.g:578:3: ( rule__ProtoSubsection__Group__0 )
            // InternalPubProto.g:578:4: rule__ProtoSubsection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoSubsectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoSubsection"


    // $ANTLR start "entryRuleProtoSubsubsection"
    // InternalPubProto.g:587:1: entryRuleProtoSubsubsection : ruleProtoSubsubsection EOF ;
    public final void entryRuleProtoSubsubsection() throws RecognitionException {
        try {
            // InternalPubProto.g:588:1: ( ruleProtoSubsubsection EOF )
            // InternalPubProto.g:589:1: ruleProtoSubsubsection EOF
            {
             before(grammarAccess.getProtoSubsubsectionRule()); 
            pushFollow(FOLLOW_1);
            ruleProtoSubsubsection();

            state._fsp--;

             after(grammarAccess.getProtoSubsubsectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtoSubsubsection"


    // $ANTLR start "ruleProtoSubsubsection"
    // InternalPubProto.g:596:1: ruleProtoSubsubsection : ( ( rule__ProtoSubsubsection__Group__0 ) ) ;
    public final void ruleProtoSubsubsection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:600:2: ( ( ( rule__ProtoSubsubsection__Group__0 ) ) )
            // InternalPubProto.g:601:2: ( ( rule__ProtoSubsubsection__Group__0 ) )
            {
            // InternalPubProto.g:601:2: ( ( rule__ProtoSubsubsection__Group__0 ) )
            // InternalPubProto.g:602:3: ( rule__ProtoSubsubsection__Group__0 )
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getGroup()); 
            // InternalPubProto.g:603:3: ( rule__ProtoSubsubsection__Group__0 )
            // InternalPubProto.g:603:4: rule__ProtoSubsubsection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtoSubsubsectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoSubsubsection"


    // $ANTLR start "rulePublicationNature"
    // InternalPubProto.g:612:1: rulePublicationNature : ( ( rule__PublicationNature__Alternatives ) ) ;
    public final void rulePublicationNature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:616:1: ( ( ( rule__PublicationNature__Alternatives ) ) )
            // InternalPubProto.g:617:2: ( ( rule__PublicationNature__Alternatives ) )
            {
            // InternalPubProto.g:617:2: ( ( rule__PublicationNature__Alternatives ) )
            // InternalPubProto.g:618:3: ( rule__PublicationNature__Alternatives )
            {
             before(grammarAccess.getPublicationNatureAccess().getAlternatives()); 
            // InternalPubProto.g:619:3: ( rule__PublicationNature__Alternatives )
            // InternalPubProto.g:619:4: rule__PublicationNature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PublicationNature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPublicationNatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicationNature"


    // $ANTLR start "ruleProtoSequenceNumberStyle"
    // InternalPubProto.g:628:1: ruleProtoSequenceNumberStyle : ( ( rule__ProtoSequenceNumberStyle__Alternatives ) ) ;
    public final void ruleProtoSequenceNumberStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:632:1: ( ( ( rule__ProtoSequenceNumberStyle__Alternatives ) ) )
            // InternalPubProto.g:633:2: ( ( rule__ProtoSequenceNumberStyle__Alternatives ) )
            {
            // InternalPubProto.g:633:2: ( ( rule__ProtoSequenceNumberStyle__Alternatives ) )
            // InternalPubProto.g:634:3: ( rule__ProtoSequenceNumberStyle__Alternatives )
            {
             before(grammarAccess.getProtoSequenceNumberStyleAccess().getAlternatives()); 
            // InternalPubProto.g:635:3: ( rule__ProtoSequenceNumberStyle__Alternatives )
            // InternalPubProto.g:635:4: rule__ProtoSequenceNumberStyle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSequenceNumberStyle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtoSequenceNumberStyleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtoSequenceNumberStyle"


    // $ANTLR start "rule__ProtoDocumentSegment__Alternatives"
    // InternalPubProto.g:643:1: rule__ProtoDocumentSegment__Alternatives : ( ( ruleProtoAbstract ) | ( ruleProtoPreface ) | ( ruleProtoPublicationBody ) | ( ruleProtoEpilogue ) | ( ruleProtoChangeHistory ) | ( ruleProtoTOC ) | ( ruleProtoAbbreviations ) | ( ruleProtoListOfTables ) | ( ruleProtoListOfFigures ) | ( ruleProtoBibliography ) | ( ruleProtoGlossary ) | ( ruleProtoIndex ) );
    public final void rule__ProtoDocumentSegment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:647:1: ( ( ruleProtoAbstract ) | ( ruleProtoPreface ) | ( ruleProtoPublicationBody ) | ( ruleProtoEpilogue ) | ( ruleProtoChangeHistory ) | ( ruleProtoTOC ) | ( ruleProtoAbbreviations ) | ( ruleProtoListOfTables ) | ( ruleProtoListOfFigures ) | ( ruleProtoBibliography ) | ( ruleProtoGlossary ) | ( ruleProtoIndex ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            case 40:
                {
                alt2=8;
                }
                break;
            case 41:
                {
                alt2=9;
                }
                break;
            case 42:
                {
                alt2=10;
                }
                break;
            case 43:
                {
                alt2=11;
                }
                break;
            case 44:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPubProto.g:648:2: ( ruleProtoAbstract )
                    {
                    // InternalPubProto.g:648:2: ( ruleProtoAbstract )
                    // InternalPubProto.g:649:3: ruleProtoAbstract
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbstractParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoAbstract();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbstractParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:654:2: ( ruleProtoPreface )
                    {
                    // InternalPubProto.g:654:2: ( ruleProtoPreface )
                    // InternalPubProto.g:655:3: ruleProtoPreface
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoPrefaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoPreface();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoPrefaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:660:2: ( ruleProtoPublicationBody )
                    {
                    // InternalPubProto.g:660:2: ( ruleProtoPublicationBody )
                    // InternalPubProto.g:661:3: ruleProtoPublicationBody
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoPublicationBodyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoPublicationBody();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoPublicationBodyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:666:2: ( ruleProtoEpilogue )
                    {
                    // InternalPubProto.g:666:2: ( ruleProtoEpilogue )
                    // InternalPubProto.g:667:3: ruleProtoEpilogue
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoEpilogueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoEpilogue();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoEpilogueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:672:2: ( ruleProtoChangeHistory )
                    {
                    // InternalPubProto.g:672:2: ( ruleProtoChangeHistory )
                    // InternalPubProto.g:673:3: ruleProtoChangeHistory
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoChangeHistoryParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoChangeHistory();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoChangeHistoryParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:678:2: ( ruleProtoTOC )
                    {
                    // InternalPubProto.g:678:2: ( ruleProtoTOC )
                    // InternalPubProto.g:679:3: ruleProtoTOC
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoTOCParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoTOC();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoTOCParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPubProto.g:684:2: ( ruleProtoAbbreviations )
                    {
                    // InternalPubProto.g:684:2: ( ruleProtoAbbreviations )
                    // InternalPubProto.g:685:3: ruleProtoAbbreviations
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbbreviationsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoAbbreviations();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoAbbreviationsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPubProto.g:690:2: ( ruleProtoListOfTables )
                    {
                    // InternalPubProto.g:690:2: ( ruleProtoListOfTables )
                    // InternalPubProto.g:691:3: ruleProtoListOfTables
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfTablesParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoListOfTables();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfTablesParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPubProto.g:696:2: ( ruleProtoListOfFigures )
                    {
                    // InternalPubProto.g:696:2: ( ruleProtoListOfFigures )
                    // InternalPubProto.g:697:3: ruleProtoListOfFigures
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfFiguresParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoListOfFigures();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoListOfFiguresParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPubProto.g:702:2: ( ruleProtoBibliography )
                    {
                    // InternalPubProto.g:702:2: ( ruleProtoBibliography )
                    // InternalPubProto.g:703:3: ruleProtoBibliography
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoBibliographyParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoBibliography();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoBibliographyParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalPubProto.g:708:2: ( ruleProtoGlossary )
                    {
                    // InternalPubProto.g:708:2: ( ruleProtoGlossary )
                    // InternalPubProto.g:709:3: ruleProtoGlossary
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoGlossaryParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoGlossary();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoGlossaryParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalPubProto.g:714:2: ( ruleProtoIndex )
                    {
                    // InternalPubProto.g:714:2: ( ruleProtoIndex )
                    // InternalPubProto.g:715:3: ruleProtoIndex
                    {
                     before(grammarAccess.getProtoDocumentSegmentAccess().getProtoIndexParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoIndex();

                    state._fsp--;

                     after(grammarAccess.getProtoDocumentSegmentAccess().getProtoIndexParserRuleCall_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDocumentSegment__Alternatives"


    // $ANTLR start "rule__SegmentBody__Alternatives_1_1"
    // InternalPubProto.g:724:1: rule__SegmentBody__Alternatives_1_1 : ( ( ( rule__SegmentBody__OptionalAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__SegmentBody__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:728:1: ( ( ( rule__SegmentBody__OptionalAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPubProto.g:729:2: ( ( rule__SegmentBody__OptionalAssignment_1_1_0 ) )
                    {
                    // InternalPubProto.g:729:2: ( ( rule__SegmentBody__OptionalAssignment_1_1_0 ) )
                    // InternalPubProto.g:730:3: ( rule__SegmentBody__OptionalAssignment_1_1_0 )
                    {
                     before(grammarAccess.getSegmentBodyAccess().getOptionalAssignment_1_1_0()); 
                    // InternalPubProto.g:731:3: ( rule__SegmentBody__OptionalAssignment_1_1_0 )
                    // InternalPubProto.g:731:4: rule__SegmentBody__OptionalAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SegmentBody__OptionalAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSegmentBodyAccess().getOptionalAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:735:2: ( 'false' )
                    {
                    // InternalPubProto.g:735:2: ( 'false' )
                    // InternalPubProto.g:736:3: 'false'
                    {
                     before(grammarAccess.getSegmentBodyAccess().getFalseKeyword_1_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSegmentBodyAccess().getFalseKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Alternatives_1_1"


    // $ANTLR start "rule__ProtoPublicationBody__Alternatives_3_1"
    // InternalPubProto.g:745:1: rule__ProtoPublicationBody__Alternatives_3_1 : ( ( ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__ProtoPublicationBody__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:749:1: ( ( ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPubProto.g:750:2: ( ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 ) )
                    {
                    // InternalPubProto.g:750:2: ( ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 ) )
                    // InternalPubProto.g:751:3: ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 )
                    {
                     before(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsAssignment_3_1_0()); 
                    // InternalPubProto.g:752:3: ( rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 )
                    // InternalPubProto.g:752:4: rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:756:2: ( 'false' )
                    {
                    // InternalPubProto.g:756:2: ( 'false' )
                    // InternalPubProto.g:757:3: 'false'
                    {
                     before(grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Alternatives_3_1"


    // $ANTLR start "rule__ProtoPublicationBody__Alternatives_4_1"
    // InternalPubProto.g:766:1: rule__ProtoPublicationBody__Alternatives_4_1 : ( ( ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 ) ) | ( 'false' ) );
    public final void rule__ProtoPublicationBody__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:770:1: ( ( ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPubProto.g:771:2: ( ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 ) )
                    {
                    // InternalPubProto.g:771:2: ( ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 ) )
                    // InternalPubProto.g:772:3: ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 )
                    {
                     before(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixAssignment_4_1_0()); 
                    // InternalPubProto.g:773:3: ( rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 )
                    // InternalPubProto.g:773:4: rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:777:2: ( 'false' )
                    {
                    // InternalPubProto.g:777:2: ( 'false' )
                    // InternalPubProto.g:778:3: 'false'
                    {
                     before(grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Alternatives_4_1"


    // $ANTLR start "rule__ProtoDivision__Alternatives"
    // InternalPubProto.g:787:1: rule__ProtoDivision__Alternatives : ( ( ruleProtoPart ) | ( ruleProtoAppendix ) | ( ruleProtoChapter ) | ( ruleProtoSection ) | ( ruleProtoSubsection ) | ( ruleProtoSubsubsection ) );
    public final void rule__ProtoDivision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:791:1: ( ( ruleProtoPart ) | ( ruleProtoAppendix ) | ( ruleProtoChapter ) | ( ruleProtoSection ) | ( ruleProtoSubsection ) | ( ruleProtoSubsubsection ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            case 49:
                {
                alt6=4;
                }
                break;
            case 50:
                {
                alt6=5;
                }
                break;
            case 51:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPubProto.g:792:2: ( ruleProtoPart )
                    {
                    // InternalPubProto.g:792:2: ( ruleProtoPart )
                    // InternalPubProto.g:793:3: ruleProtoPart
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoPartParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoPart();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoPartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:798:2: ( ruleProtoAppendix )
                    {
                    // InternalPubProto.g:798:2: ( ruleProtoAppendix )
                    // InternalPubProto.g:799:3: ruleProtoAppendix
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoAppendixParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoAppendix();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoAppendixParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:804:2: ( ruleProtoChapter )
                    {
                    // InternalPubProto.g:804:2: ( ruleProtoChapter )
                    // InternalPubProto.g:805:3: ruleProtoChapter
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoChapterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoChapter();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoChapterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:810:2: ( ruleProtoSection )
                    {
                    // InternalPubProto.g:810:2: ( ruleProtoSection )
                    // InternalPubProto.g:811:3: ruleProtoSection
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoSectionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoSection();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoSectionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:816:2: ( ruleProtoSubsection )
                    {
                    // InternalPubProto.g:816:2: ( ruleProtoSubsection )
                    // InternalPubProto.g:817:3: ruleProtoSubsection
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoSubsectionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoSubsection();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoSubsectionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:822:2: ( ruleProtoSubsubsection )
                    {
                    // InternalPubProto.g:822:2: ( ruleProtoSubsubsection )
                    // InternalPubProto.g:823:3: ruleProtoSubsubsection
                    {
                     before(grammarAccess.getProtoDivisionAccess().getProtoSubsubsectionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleProtoSubsubsection();

                    state._fsp--;

                     after(grammarAccess.getProtoDivisionAccess().getProtoSubsubsectionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivision__Alternatives"


    // $ANTLR start "rule__PublicationNature__Alternatives"
    // InternalPubProto.g:832:1: rule__PublicationNature__Alternatives : ( ( ( 'Print' ) ) | ( ( 'Web' ) ) );
    public final void rule__PublicationNature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:836:1: ( ( ( 'Print' ) ) | ( ( 'Web' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPubProto.g:837:2: ( ( 'Print' ) )
                    {
                    // InternalPubProto.g:837:2: ( ( 'Print' ) )
                    // InternalPubProto.g:838:3: ( 'Print' )
                    {
                     before(grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0()); 
                    // InternalPubProto.g:839:3: ( 'Print' )
                    // InternalPubProto.g:839:4: 'Print'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicationNatureAccess().getPrintEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:843:2: ( ( 'Web' ) )
                    {
                    // InternalPubProto.g:843:2: ( ( 'Web' ) )
                    // InternalPubProto.g:844:3: ( 'Web' )
                    {
                     before(grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1()); 
                    // InternalPubProto.g:845:3: ( 'Web' )
                    // InternalPubProto.g:845:4: 'Web'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPublicationNatureAccess().getWebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationNature__Alternatives"


    // $ANTLR start "rule__ProtoSequenceNumberStyle__Alternatives"
    // InternalPubProto.g:853:1: rule__ProtoSequenceNumberStyle__Alternatives : ( ( ( 'arabic' ) ) | ( ( 'capitalLetter' ) ) | ( ( 'smallLetter' ) ) | ( ( 'capitalRoman' ) ) | ( ( 'smallRoman' ) ) | ( ( 'none' ) ) );
    public final void rule__ProtoSequenceNumberStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:857:1: ( ( ( 'arabic' ) ) | ( ( 'capitalLetter' ) ) | ( ( 'smallLetter' ) ) | ( ( 'capitalRoman' ) ) | ( ( 'smallRoman' ) ) | ( ( 'none' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPubProto.g:858:2: ( ( 'arabic' ) )
                    {
                    // InternalPubProto.g:858:2: ( ( 'arabic' ) )
                    // InternalPubProto.g:859:3: ( 'arabic' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0()); 
                    // InternalPubProto.g:860:3: ( 'arabic' )
                    // InternalPubProto.g:860:4: 'arabic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getArabicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPubProto.g:864:2: ( ( 'capitalLetter' ) )
                    {
                    // InternalPubProto.g:864:2: ( ( 'capitalLetter' ) )
                    // InternalPubProto.g:865:3: ( 'capitalLetter' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1()); 
                    // InternalPubProto.g:866:3: ( 'capitalLetter' )
                    // InternalPubProto.g:866:4: 'capitalLetter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalLetterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPubProto.g:870:2: ( ( 'smallLetter' ) )
                    {
                    // InternalPubProto.g:870:2: ( ( 'smallLetter' ) )
                    // InternalPubProto.g:871:3: ( 'smallLetter' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2()); 
                    // InternalPubProto.g:872:3: ( 'smallLetter' )
                    // InternalPubProto.g:872:4: 'smallLetter'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getSmallLetterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPubProto.g:876:2: ( ( 'capitalRoman' ) )
                    {
                    // InternalPubProto.g:876:2: ( ( 'capitalRoman' ) )
                    // InternalPubProto.g:877:3: ( 'capitalRoman' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3()); 
                    // InternalPubProto.g:878:3: ( 'capitalRoman' )
                    // InternalPubProto.g:878:4: 'capitalRoman'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getCapitalRomanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPubProto.g:882:2: ( ( 'smallRoman' ) )
                    {
                    // InternalPubProto.g:882:2: ( ( 'smallRoman' ) )
                    // InternalPubProto.g:883:3: ( 'smallRoman' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4()); 
                    // InternalPubProto.g:884:3: ( 'smallRoman' )
                    // InternalPubProto.g:884:4: 'smallRoman'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getSmallRomanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPubProto.g:888:2: ( ( 'none' ) )
                    {
                    // InternalPubProto.g:888:2: ( ( 'none' ) )
                    // InternalPubProto.g:889:3: ( 'none' )
                    {
                     before(grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5()); 
                    // InternalPubProto.g:890:3: ( 'none' )
                    // InternalPubProto.g:890:4: 'none'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtoSequenceNumberStyleAccess().getNoneEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSequenceNumberStyle__Alternatives"


    // $ANTLR start "rule__PublicationClass__Group__0"
    // InternalPubProto.g:898:1: rule__PublicationClass__Group__0 : rule__PublicationClass__Group__0__Impl rule__PublicationClass__Group__1 ;
    public final void rule__PublicationClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:902:1: ( rule__PublicationClass__Group__0__Impl rule__PublicationClass__Group__1 )
            // InternalPubProto.g:903:2: rule__PublicationClass__Group__0__Impl rule__PublicationClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PublicationClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__0"


    // $ANTLR start "rule__PublicationClass__Group__0__Impl"
    // InternalPubProto.g:910:1: rule__PublicationClass__Group__0__Impl : ( () ) ;
    public final void rule__PublicationClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:914:1: ( ( () ) )
            // InternalPubProto.g:915:1: ( () )
            {
            // InternalPubProto.g:915:1: ( () )
            // InternalPubProto.g:916:2: ()
            {
             before(grammarAccess.getPublicationClassAccess().getPublicationClassAction_0()); 
            // InternalPubProto.g:917:2: ()
            // InternalPubProto.g:917:3: 
            {
            }

             after(grammarAccess.getPublicationClassAccess().getPublicationClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__0__Impl"


    // $ANTLR start "rule__PublicationClass__Group__1"
    // InternalPubProto.g:925:1: rule__PublicationClass__Group__1 : rule__PublicationClass__Group__1__Impl rule__PublicationClass__Group__2 ;
    public final void rule__PublicationClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:929:1: ( rule__PublicationClass__Group__1__Impl rule__PublicationClass__Group__2 )
            // InternalPubProto.g:930:2: rule__PublicationClass__Group__1__Impl rule__PublicationClass__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PublicationClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__1"


    // $ANTLR start "rule__PublicationClass__Group__1__Impl"
    // InternalPubProto.g:937:1: rule__PublicationClass__Group__1__Impl : ( 'publication' ) ;
    public final void rule__PublicationClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:941:1: ( ( 'publication' ) )
            // InternalPubProto.g:942:1: ( 'publication' )
            {
            // InternalPubProto.g:942:1: ( 'publication' )
            // InternalPubProto.g:943:2: 'publication'
            {
             before(grammarAccess.getPublicationClassAccess().getPublicationKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getPublicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__1__Impl"


    // $ANTLR start "rule__PublicationClass__Group__2"
    // InternalPubProto.g:952:1: rule__PublicationClass__Group__2 : rule__PublicationClass__Group__2__Impl rule__PublicationClass__Group__3 ;
    public final void rule__PublicationClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:956:1: ( rule__PublicationClass__Group__2__Impl rule__PublicationClass__Group__3 )
            // InternalPubProto.g:957:2: rule__PublicationClass__Group__2__Impl rule__PublicationClass__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PublicationClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__2"


    // $ANTLR start "rule__PublicationClass__Group__2__Impl"
    // InternalPubProto.g:964:1: rule__PublicationClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__PublicationClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:968:1: ( ( 'class' ) )
            // InternalPubProto.g:969:1: ( 'class' )
            {
            // InternalPubProto.g:969:1: ( 'class' )
            // InternalPubProto.g:970:2: 'class'
            {
             before(grammarAccess.getPublicationClassAccess().getClassKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__2__Impl"


    // $ANTLR start "rule__PublicationClass__Group__3"
    // InternalPubProto.g:979:1: rule__PublicationClass__Group__3 : rule__PublicationClass__Group__3__Impl rule__PublicationClass__Group__4 ;
    public final void rule__PublicationClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:983:1: ( rule__PublicationClass__Group__3__Impl rule__PublicationClass__Group__4 )
            // InternalPubProto.g:984:2: rule__PublicationClass__Group__3__Impl rule__PublicationClass__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PublicationClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__3"


    // $ANTLR start "rule__PublicationClass__Group__3__Impl"
    // InternalPubProto.g:991:1: rule__PublicationClass__Group__3__Impl : ( ( rule__PublicationClass__NameAssignment_3 ) ) ;
    public final void rule__PublicationClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:995:1: ( ( ( rule__PublicationClass__NameAssignment_3 ) ) )
            // InternalPubProto.g:996:1: ( ( rule__PublicationClass__NameAssignment_3 ) )
            {
            // InternalPubProto.g:996:1: ( ( rule__PublicationClass__NameAssignment_3 ) )
            // InternalPubProto.g:997:2: ( rule__PublicationClass__NameAssignment_3 )
            {
             before(grammarAccess.getPublicationClassAccess().getNameAssignment_3()); 
            // InternalPubProto.g:998:2: ( rule__PublicationClass__NameAssignment_3 )
            // InternalPubProto.g:998:3: rule__PublicationClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPublicationClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__3__Impl"


    // $ANTLR start "rule__PublicationClass__Group__4"
    // InternalPubProto.g:1006:1: rule__PublicationClass__Group__4 : rule__PublicationClass__Group__4__Impl rule__PublicationClass__Group__5 ;
    public final void rule__PublicationClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1010:1: ( rule__PublicationClass__Group__4__Impl rule__PublicationClass__Group__5 )
            // InternalPubProto.g:1011:2: rule__PublicationClass__Group__4__Impl rule__PublicationClass__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__PublicationClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__4"


    // $ANTLR start "rule__PublicationClass__Group__4__Impl"
    // InternalPubProto.g:1018:1: rule__PublicationClass__Group__4__Impl : ( ( rule__PublicationClass__Group_4__0 )? ) ;
    public final void rule__PublicationClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1022:1: ( ( ( rule__PublicationClass__Group_4__0 )? ) )
            // InternalPubProto.g:1023:1: ( ( rule__PublicationClass__Group_4__0 )? )
            {
            // InternalPubProto.g:1023:1: ( ( rule__PublicationClass__Group_4__0 )? )
            // InternalPubProto.g:1024:2: ( rule__PublicationClass__Group_4__0 )?
            {
             before(grammarAccess.getPublicationClassAccess().getGroup_4()); 
            // InternalPubProto.g:1025:2: ( rule__PublicationClass__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPubProto.g:1025:3: rule__PublicationClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicationClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicationClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__4__Impl"


    // $ANTLR start "rule__PublicationClass__Group__5"
    // InternalPubProto.g:1033:1: rule__PublicationClass__Group__5 : rule__PublicationClass__Group__5__Impl rule__PublicationClass__Group__6 ;
    public final void rule__PublicationClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1037:1: ( rule__PublicationClass__Group__5__Impl rule__PublicationClass__Group__6 )
            // InternalPubProto.g:1038:2: rule__PublicationClass__Group__5__Impl rule__PublicationClass__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__PublicationClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__5"


    // $ANTLR start "rule__PublicationClass__Group__5__Impl"
    // InternalPubProto.g:1045:1: rule__PublicationClass__Group__5__Impl : ( 'nature:' ) ;
    public final void rule__PublicationClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1049:1: ( ( 'nature:' ) )
            // InternalPubProto.g:1050:1: ( 'nature:' )
            {
            // InternalPubProto.g:1050:1: ( 'nature:' )
            // InternalPubProto.g:1051:2: 'nature:'
            {
             before(grammarAccess.getPublicationClassAccess().getNatureKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getNatureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__5__Impl"


    // $ANTLR start "rule__PublicationClass__Group__6"
    // InternalPubProto.g:1060:1: rule__PublicationClass__Group__6 : rule__PublicationClass__Group__6__Impl rule__PublicationClass__Group__7 ;
    public final void rule__PublicationClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1064:1: ( rule__PublicationClass__Group__6__Impl rule__PublicationClass__Group__7 )
            // InternalPubProto.g:1065:2: rule__PublicationClass__Group__6__Impl rule__PublicationClass__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__PublicationClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__6"


    // $ANTLR start "rule__PublicationClass__Group__6__Impl"
    // InternalPubProto.g:1072:1: rule__PublicationClass__Group__6__Impl : ( ( rule__PublicationClass__NatureAssignment_6 ) ) ;
    public final void rule__PublicationClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1076:1: ( ( ( rule__PublicationClass__NatureAssignment_6 ) ) )
            // InternalPubProto.g:1077:1: ( ( rule__PublicationClass__NatureAssignment_6 ) )
            {
            // InternalPubProto.g:1077:1: ( ( rule__PublicationClass__NatureAssignment_6 ) )
            // InternalPubProto.g:1078:2: ( rule__PublicationClass__NatureAssignment_6 )
            {
             before(grammarAccess.getPublicationClassAccess().getNatureAssignment_6()); 
            // InternalPubProto.g:1079:2: ( rule__PublicationClass__NatureAssignment_6 )
            // InternalPubProto.g:1079:3: rule__PublicationClass__NatureAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__NatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPublicationClassAccess().getNatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__6__Impl"


    // $ANTLR start "rule__PublicationClass__Group__7"
    // InternalPubProto.g:1087:1: rule__PublicationClass__Group__7 : rule__PublicationClass__Group__7__Impl rule__PublicationClass__Group__8 ;
    public final void rule__PublicationClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1091:1: ( rule__PublicationClass__Group__7__Impl rule__PublicationClass__Group__8 )
            // InternalPubProto.g:1092:2: rule__PublicationClass__Group__7__Impl rule__PublicationClass__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__PublicationClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__7"


    // $ANTLR start "rule__PublicationClass__Group__7__Impl"
    // InternalPubProto.g:1099:1: rule__PublicationClass__Group__7__Impl : ( ( rule__PublicationClass__Group_7__0 )? ) ;
    public final void rule__PublicationClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1103:1: ( ( ( rule__PublicationClass__Group_7__0 )? ) )
            // InternalPubProto.g:1104:1: ( ( rule__PublicationClass__Group_7__0 )? )
            {
            // InternalPubProto.g:1104:1: ( ( rule__PublicationClass__Group_7__0 )? )
            // InternalPubProto.g:1105:2: ( rule__PublicationClass__Group_7__0 )?
            {
             before(grammarAccess.getPublicationClassAccess().getGroup_7()); 
            // InternalPubProto.g:1106:2: ( rule__PublicationClass__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPubProto.g:1106:3: rule__PublicationClass__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicationClass__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicationClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__7__Impl"


    // $ANTLR start "rule__PublicationClass__Group__8"
    // InternalPubProto.g:1114:1: rule__PublicationClass__Group__8 : rule__PublicationClass__Group__8__Impl rule__PublicationClass__Group__9 ;
    public final void rule__PublicationClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1118:1: ( rule__PublicationClass__Group__8__Impl rule__PublicationClass__Group__9 )
            // InternalPubProto.g:1119:2: rule__PublicationClass__Group__8__Impl rule__PublicationClass__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__PublicationClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__8"


    // $ANTLR start "rule__PublicationClass__Group__8__Impl"
    // InternalPubProto.g:1126:1: rule__PublicationClass__Group__8__Impl : ( 'segments:' ) ;
    public final void rule__PublicationClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1130:1: ( ( 'segments:' ) )
            // InternalPubProto.g:1131:1: ( 'segments:' )
            {
            // InternalPubProto.g:1131:1: ( 'segments:' )
            // InternalPubProto.g:1132:2: 'segments:'
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getSegmentsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__8__Impl"


    // $ANTLR start "rule__PublicationClass__Group__9"
    // InternalPubProto.g:1141:1: rule__PublicationClass__Group__9 : rule__PublicationClass__Group__9__Impl rule__PublicationClass__Group__10 ;
    public final void rule__PublicationClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1145:1: ( rule__PublicationClass__Group__9__Impl rule__PublicationClass__Group__10 )
            // InternalPubProto.g:1146:2: rule__PublicationClass__Group__9__Impl rule__PublicationClass__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__PublicationClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__9"


    // $ANTLR start "rule__PublicationClass__Group__9__Impl"
    // InternalPubProto.g:1153:1: rule__PublicationClass__Group__9__Impl : ( ( rule__PublicationClass__SegmentsAssignment_9 )* ) ;
    public final void rule__PublicationClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1157:1: ( ( ( rule__PublicationClass__SegmentsAssignment_9 )* ) )
            // InternalPubProto.g:1158:1: ( ( rule__PublicationClass__SegmentsAssignment_9 )* )
            {
            // InternalPubProto.g:1158:1: ( ( rule__PublicationClass__SegmentsAssignment_9 )* )
            // InternalPubProto.g:1159:2: ( rule__PublicationClass__SegmentsAssignment_9 )*
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsAssignment_9()); 
            // InternalPubProto.g:1160:2: ( rule__PublicationClass__SegmentsAssignment_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||(LA11_0>=31 && LA11_0<=33)||(LA11_0>=36 && LA11_0<=37)||(LA11_0>=39 && LA11_0<=44)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPubProto.g:1160:3: rule__PublicationClass__SegmentsAssignment_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PublicationClass__SegmentsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPublicationClassAccess().getSegmentsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__9__Impl"


    // $ANTLR start "rule__PublicationClass__Group__10"
    // InternalPubProto.g:1168:1: rule__PublicationClass__Group__10 : rule__PublicationClass__Group__10__Impl rule__PublicationClass__Group__11 ;
    public final void rule__PublicationClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1172:1: ( rule__PublicationClass__Group__10__Impl rule__PublicationClass__Group__11 )
            // InternalPubProto.g:1173:2: rule__PublicationClass__Group__10__Impl rule__PublicationClass__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__PublicationClass__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__10"


    // $ANTLR start "rule__PublicationClass__Group__10__Impl"
    // InternalPubProto.g:1180:1: rule__PublicationClass__Group__10__Impl : ( 'divisions:' ) ;
    public final void rule__PublicationClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1184:1: ( ( 'divisions:' ) )
            // InternalPubProto.g:1185:1: ( 'divisions:' )
            {
            // InternalPubProto.g:1185:1: ( 'divisions:' )
            // InternalPubProto.g:1186:2: 'divisions:'
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getDivisionsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__10__Impl"


    // $ANTLR start "rule__PublicationClass__Group__11"
    // InternalPubProto.g:1195:1: rule__PublicationClass__Group__11 : rule__PublicationClass__Group__11__Impl ;
    public final void rule__PublicationClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1199:1: ( rule__PublicationClass__Group__11__Impl )
            // InternalPubProto.g:1200:2: rule__PublicationClass__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__11"


    // $ANTLR start "rule__PublicationClass__Group__11__Impl"
    // InternalPubProto.g:1206:1: rule__PublicationClass__Group__11__Impl : ( ( rule__PublicationClass__DivisionsAssignment_11 )* ) ;
    public final void rule__PublicationClass__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1210:1: ( ( ( rule__PublicationClass__DivisionsAssignment_11 )* ) )
            // InternalPubProto.g:1211:1: ( ( rule__PublicationClass__DivisionsAssignment_11 )* )
            {
            // InternalPubProto.g:1211:1: ( ( rule__PublicationClass__DivisionsAssignment_11 )* )
            // InternalPubProto.g:1212:2: ( rule__PublicationClass__DivisionsAssignment_11 )*
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsAssignment_11()); 
            // InternalPubProto.g:1213:2: ( rule__PublicationClass__DivisionsAssignment_11 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=46 && LA12_0<=51)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPubProto.g:1213:3: rule__PublicationClass__DivisionsAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PublicationClass__DivisionsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPublicationClassAccess().getDivisionsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group__11__Impl"


    // $ANTLR start "rule__PublicationClass__Group_4__0"
    // InternalPubProto.g:1222:1: rule__PublicationClass__Group_4__0 : rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1 ;
    public final void rule__PublicationClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1226:1: ( rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1 )
            // InternalPubProto.g:1227:2: rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__PublicationClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_4__0"


    // $ANTLR start "rule__PublicationClass__Group_4__0__Impl"
    // InternalPubProto.g:1234:1: rule__PublicationClass__Group_4__0__Impl : ( 'title:' ) ;
    public final void rule__PublicationClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1238:1: ( ( 'title:' ) )
            // InternalPubProto.g:1239:1: ( 'title:' )
            {
            // InternalPubProto.g:1239:1: ( 'title:' )
            // InternalPubProto.g:1240:2: 'title:'
            {
             before(grammarAccess.getPublicationClassAccess().getTitleKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_4__0__Impl"


    // $ANTLR start "rule__PublicationClass__Group_4__1"
    // InternalPubProto.g:1249:1: rule__PublicationClass__Group_4__1 : rule__PublicationClass__Group_4__1__Impl ;
    public final void rule__PublicationClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1253:1: ( rule__PublicationClass__Group_4__1__Impl )
            // InternalPubProto.g:1254:2: rule__PublicationClass__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_4__1"


    // $ANTLR start "rule__PublicationClass__Group_4__1__Impl"
    // InternalPubProto.g:1260:1: rule__PublicationClass__Group_4__1__Impl : ( ( rule__PublicationClass__TitleAssignment_4_1 ) ) ;
    public final void rule__PublicationClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1264:1: ( ( ( rule__PublicationClass__TitleAssignment_4_1 ) ) )
            // InternalPubProto.g:1265:1: ( ( rule__PublicationClass__TitleAssignment_4_1 ) )
            {
            // InternalPubProto.g:1265:1: ( ( rule__PublicationClass__TitleAssignment_4_1 ) )
            // InternalPubProto.g:1266:2: ( rule__PublicationClass__TitleAssignment_4_1 )
            {
             before(grammarAccess.getPublicationClassAccess().getTitleAssignment_4_1()); 
            // InternalPubProto.g:1267:2: ( rule__PublicationClass__TitleAssignment_4_1 )
            // InternalPubProto.g:1267:3: rule__PublicationClass__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicationClassAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_4__1__Impl"


    // $ANTLR start "rule__PublicationClass__Group_7__0"
    // InternalPubProto.g:1276:1: rule__PublicationClass__Group_7__0 : rule__PublicationClass__Group_7__0__Impl rule__PublicationClass__Group_7__1 ;
    public final void rule__PublicationClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1280:1: ( rule__PublicationClass__Group_7__0__Impl rule__PublicationClass__Group_7__1 )
            // InternalPubProto.g:1281:2: rule__PublicationClass__Group_7__0__Impl rule__PublicationClass__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__PublicationClass__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_7__0"


    // $ANTLR start "rule__PublicationClass__Group_7__0__Impl"
    // InternalPubProto.g:1288:1: rule__PublicationClass__Group_7__0__Impl : ( 'symbols:' ) ;
    public final void rule__PublicationClass__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1292:1: ( ( 'symbols:' ) )
            // InternalPubProto.g:1293:1: ( 'symbols:' )
            {
            // InternalPubProto.g:1293:1: ( 'symbols:' )
            // InternalPubProto.g:1294:2: 'symbols:'
            {
             before(grammarAccess.getPublicationClassAccess().getSymbolsKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getSymbolsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_7__0__Impl"


    // $ANTLR start "rule__PublicationClass__Group_7__1"
    // InternalPubProto.g:1303:1: rule__PublicationClass__Group_7__1 : rule__PublicationClass__Group_7__1__Impl ;
    public final void rule__PublicationClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1307:1: ( rule__PublicationClass__Group_7__1__Impl )
            // InternalPubProto.g:1308:2: rule__PublicationClass__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_7__1"


    // $ANTLR start "rule__PublicationClass__Group_7__1__Impl"
    // InternalPubProto.g:1314:1: rule__PublicationClass__Group_7__1__Impl : ( ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) ) ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* ) ) ;
    public final void rule__PublicationClass__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1318:1: ( ( ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) ) ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* ) ) )
            // InternalPubProto.g:1319:1: ( ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) ) ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* ) )
            {
            // InternalPubProto.g:1319:1: ( ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) ) ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* ) )
            // InternalPubProto.g:1320:2: ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) ) ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* )
            {
            // InternalPubProto.g:1320:2: ( ( rule__PublicationClass__SymbolsAssignment_7_1 ) )
            // InternalPubProto.g:1321:3: ( rule__PublicationClass__SymbolsAssignment_7_1 )
            {
             before(grammarAccess.getPublicationClassAccess().getSymbolsAssignment_7_1()); 
            // InternalPubProto.g:1322:3: ( rule__PublicationClass__SymbolsAssignment_7_1 )
            // InternalPubProto.g:1322:4: rule__PublicationClass__SymbolsAssignment_7_1
            {
            pushFollow(FOLLOW_14);
            rule__PublicationClass__SymbolsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicationClassAccess().getSymbolsAssignment_7_1()); 

            }

            // InternalPubProto.g:1325:2: ( ( rule__PublicationClass__SymbolsAssignment_7_1 )* )
            // InternalPubProto.g:1326:3: ( rule__PublicationClass__SymbolsAssignment_7_1 )*
            {
             before(grammarAccess.getPublicationClassAccess().getSymbolsAssignment_7_1()); 
            // InternalPubProto.g:1327:3: ( rule__PublicationClass__SymbolsAssignment_7_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPubProto.g:1327:4: rule__PublicationClass__SymbolsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PublicationClass__SymbolsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPublicationClassAccess().getSymbolsAssignment_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__Group_7__1__Impl"


    // $ANTLR start "rule__SegmentBody__Group__0"
    // InternalPubProto.g:1337:1: rule__SegmentBody__Group__0 : rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1 ;
    public final void rule__SegmentBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1341:1: ( rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1 )
            // InternalPubProto.g:1342:2: rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SegmentBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group__0"


    // $ANTLR start "rule__SegmentBody__Group__0__Impl"
    // InternalPubProto.g:1349:1: rule__SegmentBody__Group__0__Impl : ( ( rule__SegmentBody__Group_0__0 )? ) ;
    public final void rule__SegmentBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1353:1: ( ( ( rule__SegmentBody__Group_0__0 )? ) )
            // InternalPubProto.g:1354:1: ( ( rule__SegmentBody__Group_0__0 )? )
            {
            // InternalPubProto.g:1354:1: ( ( rule__SegmentBody__Group_0__0 )? )
            // InternalPubProto.g:1355:2: ( rule__SegmentBody__Group_0__0 )?
            {
             before(grammarAccess.getSegmentBodyAccess().getGroup_0()); 
            // InternalPubProto.g:1356:2: ( rule__SegmentBody__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:1356:3: rule__SegmentBody__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SegmentBody__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentBodyAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group__0__Impl"


    // $ANTLR start "rule__SegmentBody__Group__1"
    // InternalPubProto.g:1364:1: rule__SegmentBody__Group__1 : rule__SegmentBody__Group__1__Impl ;
    public final void rule__SegmentBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1368:1: ( rule__SegmentBody__Group__1__Impl )
            // InternalPubProto.g:1369:2: rule__SegmentBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group__1"


    // $ANTLR start "rule__SegmentBody__Group__1__Impl"
    // InternalPubProto.g:1375:1: rule__SegmentBody__Group__1__Impl : ( ( rule__SegmentBody__Group_1__0 )? ) ;
    public final void rule__SegmentBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1379:1: ( ( ( rule__SegmentBody__Group_1__0 )? ) )
            // InternalPubProto.g:1380:1: ( ( rule__SegmentBody__Group_1__0 )? )
            {
            // InternalPubProto.g:1380:1: ( ( rule__SegmentBody__Group_1__0 )? )
            // InternalPubProto.g:1381:2: ( rule__SegmentBody__Group_1__0 )?
            {
             before(grammarAccess.getSegmentBodyAccess().getGroup_1()); 
            // InternalPubProto.g:1382:2: ( rule__SegmentBody__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPubProto.g:1382:3: rule__SegmentBody__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SegmentBody__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSegmentBodyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group__1__Impl"


    // $ANTLR start "rule__SegmentBody__Group_0__0"
    // InternalPubProto.g:1391:1: rule__SegmentBody__Group_0__0 : rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1 ;
    public final void rule__SegmentBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1395:1: ( rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1 )
            // InternalPubProto.g:1396:2: rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__SegmentBody__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_0__0"


    // $ANTLR start "rule__SegmentBody__Group_0__0__Impl"
    // InternalPubProto.g:1403:1: rule__SegmentBody__Group_0__0__Impl : ( 'title:' ) ;
    public final void rule__SegmentBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1407:1: ( ( 'title:' ) )
            // InternalPubProto.g:1408:1: ( 'title:' )
            {
            // InternalPubProto.g:1408:1: ( 'title:' )
            // InternalPubProto.g:1409:2: 'title:'
            {
             before(grammarAccess.getSegmentBodyAccess().getTitleKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSegmentBodyAccess().getTitleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_0__0__Impl"


    // $ANTLR start "rule__SegmentBody__Group_0__1"
    // InternalPubProto.g:1418:1: rule__SegmentBody__Group_0__1 : rule__SegmentBody__Group_0__1__Impl ;
    public final void rule__SegmentBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1422:1: ( rule__SegmentBody__Group_0__1__Impl )
            // InternalPubProto.g:1423:2: rule__SegmentBody__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_0__1"


    // $ANTLR start "rule__SegmentBody__Group_0__1__Impl"
    // InternalPubProto.g:1429:1: rule__SegmentBody__Group_0__1__Impl : ( ( rule__SegmentBody__TitleAssignment_0_1 ) ) ;
    public final void rule__SegmentBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1433:1: ( ( ( rule__SegmentBody__TitleAssignment_0_1 ) ) )
            // InternalPubProto.g:1434:1: ( ( rule__SegmentBody__TitleAssignment_0_1 ) )
            {
            // InternalPubProto.g:1434:1: ( ( rule__SegmentBody__TitleAssignment_0_1 ) )
            // InternalPubProto.g:1435:2: ( rule__SegmentBody__TitleAssignment_0_1 )
            {
             before(grammarAccess.getSegmentBodyAccess().getTitleAssignment_0_1()); 
            // InternalPubProto.g:1436:2: ( rule__SegmentBody__TitleAssignment_0_1 )
            // InternalPubProto.g:1436:3: rule__SegmentBody__TitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__TitleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentBodyAccess().getTitleAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_0__1__Impl"


    // $ANTLR start "rule__SegmentBody__Group_1__0"
    // InternalPubProto.g:1445:1: rule__SegmentBody__Group_1__0 : rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1 ;
    public final void rule__SegmentBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1449:1: ( rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1 )
            // InternalPubProto.g:1450:2: rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__SegmentBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_1__0"


    // $ANTLR start "rule__SegmentBody__Group_1__0__Impl"
    // InternalPubProto.g:1457:1: rule__SegmentBody__Group_1__0__Impl : ( 'optional:' ) ;
    public final void rule__SegmentBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1461:1: ( ( 'optional:' ) )
            // InternalPubProto.g:1462:1: ( 'optional:' )
            {
            // InternalPubProto.g:1462:1: ( 'optional:' )
            // InternalPubProto.g:1463:2: 'optional:'
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_1__0__Impl"


    // $ANTLR start "rule__SegmentBody__Group_1__1"
    // InternalPubProto.g:1472:1: rule__SegmentBody__Group_1__1 : rule__SegmentBody__Group_1__1__Impl ;
    public final void rule__SegmentBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1476:1: ( rule__SegmentBody__Group_1__1__Impl )
            // InternalPubProto.g:1477:2: rule__SegmentBody__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_1__1"


    // $ANTLR start "rule__SegmentBody__Group_1__1__Impl"
    // InternalPubProto.g:1483:1: rule__SegmentBody__Group_1__1__Impl : ( ( rule__SegmentBody__Alternatives_1_1 ) ) ;
    public final void rule__SegmentBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1487:1: ( ( ( rule__SegmentBody__Alternatives_1_1 ) ) )
            // InternalPubProto.g:1488:1: ( ( rule__SegmentBody__Alternatives_1_1 ) )
            {
            // InternalPubProto.g:1488:1: ( ( rule__SegmentBody__Alternatives_1_1 ) )
            // InternalPubProto.g:1489:2: ( rule__SegmentBody__Alternatives_1_1 )
            {
             before(grammarAccess.getSegmentBodyAccess().getAlternatives_1_1()); 
            // InternalPubProto.g:1490:2: ( rule__SegmentBody__Alternatives_1_1 )
            // InternalPubProto.g:1490:3: rule__SegmentBody__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SegmentBody__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentBodyAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__Group_1__1__Impl"


    // $ANTLR start "rule__ProtoAbstract__Group__0"
    // InternalPubProto.g:1499:1: rule__ProtoAbstract__Group__0 : rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1 ;
    public final void rule__ProtoAbstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1503:1: ( rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1 )
            // InternalPubProto.g:1504:2: rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ProtoAbstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__0"


    // $ANTLR start "rule__ProtoAbstract__Group__0__Impl"
    // InternalPubProto.g:1511:1: rule__ProtoAbstract__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAbstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1515:1: ( ( () ) )
            // InternalPubProto.g:1516:1: ( () )
            {
            // InternalPubProto.g:1516:1: ( () )
            // InternalPubProto.g:1517:2: ()
            {
             before(grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0()); 
            // InternalPubProto.g:1518:2: ()
            // InternalPubProto.g:1518:3: 
            {
            }

             after(grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__0__Impl"


    // $ANTLR start "rule__ProtoAbstract__Group__1"
    // InternalPubProto.g:1526:1: rule__ProtoAbstract__Group__1 : rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2 ;
    public final void rule__ProtoAbstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1530:1: ( rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2 )
            // InternalPubProto.g:1531:2: rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoAbstract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__1"


    // $ANTLR start "rule__ProtoAbstract__Group__1__Impl"
    // InternalPubProto.g:1538:1: rule__ProtoAbstract__Group__1__Impl : ( 'Abstract' ) ;
    public final void rule__ProtoAbstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1542:1: ( ( 'Abstract' ) )
            // InternalPubProto.g:1543:1: ( 'Abstract' )
            {
            // InternalPubProto.g:1543:1: ( 'Abstract' )
            // InternalPubProto.g:1544:2: 'Abstract'
            {
             before(grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__1__Impl"


    // $ANTLR start "rule__ProtoAbstract__Group__2"
    // InternalPubProto.g:1553:1: rule__ProtoAbstract__Group__2 : rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3 ;
    public final void rule__ProtoAbstract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1557:1: ( rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3 )
            // InternalPubProto.g:1558:2: rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoAbstract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__2"


    // $ANTLR start "rule__ProtoAbstract__Group__2__Impl"
    // InternalPubProto.g:1565:1: rule__ProtoAbstract__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAbstract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1569:1: ( ( '{' ) )
            // InternalPubProto.g:1570:1: ( '{' )
            {
            // InternalPubProto.g:1570:1: ( '{' )
            // InternalPubProto.g:1571:2: '{'
            {
             before(grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__2__Impl"


    // $ANTLR start "rule__ProtoAbstract__Group__3"
    // InternalPubProto.g:1580:1: rule__ProtoAbstract__Group__3 : rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4 ;
    public final void rule__ProtoAbstract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1584:1: ( rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4 )
            // InternalPubProto.g:1585:2: rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoAbstract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__3"


    // $ANTLR start "rule__ProtoAbstract__Group__3__Impl"
    // InternalPubProto.g:1592:1: rule__ProtoAbstract__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoAbstract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1596:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1597:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1597:1: ( ruleSegmentBody )
            // InternalPubProto.g:1598:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoAbstractAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoAbstractAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__3__Impl"


    // $ANTLR start "rule__ProtoAbstract__Group__4"
    // InternalPubProto.g:1607:1: rule__ProtoAbstract__Group__4 : rule__ProtoAbstract__Group__4__Impl ;
    public final void rule__ProtoAbstract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1611:1: ( rule__ProtoAbstract__Group__4__Impl )
            // InternalPubProto.g:1612:2: rule__ProtoAbstract__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAbstract__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__4"


    // $ANTLR start "rule__ProtoAbstract__Group__4__Impl"
    // InternalPubProto.g:1618:1: rule__ProtoAbstract__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAbstract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1622:1: ( ( '}' ) )
            // InternalPubProto.g:1623:1: ( '}' )
            {
            // InternalPubProto.g:1623:1: ( '}' )
            // InternalPubProto.g:1624:2: '}'
            {
             before(grammarAccess.getProtoAbstractAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoAbstractAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbstract__Group__4__Impl"


    // $ANTLR start "rule__ProtoPreface__Group__0"
    // InternalPubProto.g:1634:1: rule__ProtoPreface__Group__0 : rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1 ;
    public final void rule__ProtoPreface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1638:1: ( rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1 )
            // InternalPubProto.g:1639:2: rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ProtoPreface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__0"


    // $ANTLR start "rule__ProtoPreface__Group__0__Impl"
    // InternalPubProto.g:1646:1: rule__ProtoPreface__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPreface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1650:1: ( ( () ) )
            // InternalPubProto.g:1651:1: ( () )
            {
            // InternalPubProto.g:1651:1: ( () )
            // InternalPubProto.g:1652:2: ()
            {
             before(grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0()); 
            // InternalPubProto.g:1653:2: ()
            // InternalPubProto.g:1653:3: 
            {
            }

             after(grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__0__Impl"


    // $ANTLR start "rule__ProtoPreface__Group__1"
    // InternalPubProto.g:1661:1: rule__ProtoPreface__Group__1 : rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2 ;
    public final void rule__ProtoPreface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1665:1: ( rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2 )
            // InternalPubProto.g:1666:2: rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoPreface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__1"


    // $ANTLR start "rule__ProtoPreface__Group__1__Impl"
    // InternalPubProto.g:1673:1: rule__ProtoPreface__Group__1__Impl : ( 'Preface' ) ;
    public final void rule__ProtoPreface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1677:1: ( ( 'Preface' ) )
            // InternalPubProto.g:1678:1: ( 'Preface' )
            {
            // InternalPubProto.g:1678:1: ( 'Preface' )
            // InternalPubProto.g:1679:2: 'Preface'
            {
             before(grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__1__Impl"


    // $ANTLR start "rule__ProtoPreface__Group__2"
    // InternalPubProto.g:1688:1: rule__ProtoPreface__Group__2 : rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3 ;
    public final void rule__ProtoPreface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1692:1: ( rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3 )
            // InternalPubProto.g:1693:2: rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoPreface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__2"


    // $ANTLR start "rule__ProtoPreface__Group__2__Impl"
    // InternalPubProto.g:1700:1: rule__ProtoPreface__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPreface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1704:1: ( ( '{' ) )
            // InternalPubProto.g:1705:1: ( '{' )
            {
            // InternalPubProto.g:1705:1: ( '{' )
            // InternalPubProto.g:1706:2: '{'
            {
             before(grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__2__Impl"


    // $ANTLR start "rule__ProtoPreface__Group__3"
    // InternalPubProto.g:1715:1: rule__ProtoPreface__Group__3 : rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4 ;
    public final void rule__ProtoPreface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1719:1: ( rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4 )
            // InternalPubProto.g:1720:2: rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoPreface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__3"


    // $ANTLR start "rule__ProtoPreface__Group__3__Impl"
    // InternalPubProto.g:1727:1: rule__ProtoPreface__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoPreface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1731:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1732:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1732:1: ( ruleSegmentBody )
            // InternalPubProto.g:1733:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoPrefaceAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoPrefaceAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__3__Impl"


    // $ANTLR start "rule__ProtoPreface__Group__4"
    // InternalPubProto.g:1742:1: rule__ProtoPreface__Group__4 : rule__ProtoPreface__Group__4__Impl ;
    public final void rule__ProtoPreface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1746:1: ( rule__ProtoPreface__Group__4__Impl )
            // InternalPubProto.g:1747:2: rule__ProtoPreface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPreface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__4"


    // $ANTLR start "rule__ProtoPreface__Group__4__Impl"
    // InternalPubProto.g:1753:1: rule__ProtoPreface__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoPreface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1757:1: ( ( '}' ) )
            // InternalPubProto.g:1758:1: ( '}' )
            {
            // InternalPubProto.g:1758:1: ( '}' )
            // InternalPubProto.g:1759:2: '}'
            {
             before(grammarAccess.getProtoPrefaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoPrefaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPreface__Group__4__Impl"


    // $ANTLR start "rule__ProtoEpilogue__Group__0"
    // InternalPubProto.g:1769:1: rule__ProtoEpilogue__Group__0 : rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1 ;
    public final void rule__ProtoEpilogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1773:1: ( rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1 )
            // InternalPubProto.g:1774:2: rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ProtoEpilogue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__0"


    // $ANTLR start "rule__ProtoEpilogue__Group__0__Impl"
    // InternalPubProto.g:1781:1: rule__ProtoEpilogue__Group__0__Impl : ( () ) ;
    public final void rule__ProtoEpilogue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1785:1: ( ( () ) )
            // InternalPubProto.g:1786:1: ( () )
            {
            // InternalPubProto.g:1786:1: ( () )
            // InternalPubProto.g:1787:2: ()
            {
             before(grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0()); 
            // InternalPubProto.g:1788:2: ()
            // InternalPubProto.g:1788:3: 
            {
            }

             after(grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__0__Impl"


    // $ANTLR start "rule__ProtoEpilogue__Group__1"
    // InternalPubProto.g:1796:1: rule__ProtoEpilogue__Group__1 : rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2 ;
    public final void rule__ProtoEpilogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1800:1: ( rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2 )
            // InternalPubProto.g:1801:2: rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoEpilogue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__1"


    // $ANTLR start "rule__ProtoEpilogue__Group__1__Impl"
    // InternalPubProto.g:1808:1: rule__ProtoEpilogue__Group__1__Impl : ( 'Epilogue' ) ;
    public final void rule__ProtoEpilogue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1812:1: ( ( 'Epilogue' ) )
            // InternalPubProto.g:1813:1: ( 'Epilogue' )
            {
            // InternalPubProto.g:1813:1: ( 'Epilogue' )
            // InternalPubProto.g:1814:2: 'Epilogue'
            {
             before(grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__1__Impl"


    // $ANTLR start "rule__ProtoEpilogue__Group__2"
    // InternalPubProto.g:1823:1: rule__ProtoEpilogue__Group__2 : rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3 ;
    public final void rule__ProtoEpilogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1827:1: ( rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3 )
            // InternalPubProto.g:1828:2: rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoEpilogue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__2"


    // $ANTLR start "rule__ProtoEpilogue__Group__2__Impl"
    // InternalPubProto.g:1835:1: rule__ProtoEpilogue__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoEpilogue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1839:1: ( ( '{' ) )
            // InternalPubProto.g:1840:1: ( '{' )
            {
            // InternalPubProto.g:1840:1: ( '{' )
            // InternalPubProto.g:1841:2: '{'
            {
             before(grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__2__Impl"


    // $ANTLR start "rule__ProtoEpilogue__Group__3"
    // InternalPubProto.g:1850:1: rule__ProtoEpilogue__Group__3 : rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4 ;
    public final void rule__ProtoEpilogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1854:1: ( rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4 )
            // InternalPubProto.g:1855:2: rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoEpilogue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__3"


    // $ANTLR start "rule__ProtoEpilogue__Group__3__Impl"
    // InternalPubProto.g:1862:1: rule__ProtoEpilogue__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoEpilogue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1866:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1867:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1867:1: ( ruleSegmentBody )
            // InternalPubProto.g:1868:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoEpilogueAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoEpilogueAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__3__Impl"


    // $ANTLR start "rule__ProtoEpilogue__Group__4"
    // InternalPubProto.g:1877:1: rule__ProtoEpilogue__Group__4 : rule__ProtoEpilogue__Group__4__Impl ;
    public final void rule__ProtoEpilogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1881:1: ( rule__ProtoEpilogue__Group__4__Impl )
            // InternalPubProto.g:1882:2: rule__ProtoEpilogue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoEpilogue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__4"


    // $ANTLR start "rule__ProtoEpilogue__Group__4__Impl"
    // InternalPubProto.g:1888:1: rule__ProtoEpilogue__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoEpilogue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1892:1: ( ( '}' ) )
            // InternalPubProto.g:1893:1: ( '}' )
            {
            // InternalPubProto.g:1893:1: ( '}' )
            // InternalPubProto.g:1894:2: '}'
            {
             before(grammarAccess.getProtoEpilogueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoEpilogueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoEpilogue__Group__4__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__0"
    // InternalPubProto.g:1904:1: rule__ProtoPublicationBody__Group__0 : rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1 ;
    public final void rule__ProtoPublicationBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1908:1: ( rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1 )
            // InternalPubProto.g:1909:2: rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ProtoPublicationBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__0"


    // $ANTLR start "rule__ProtoPublicationBody__Group__0__Impl"
    // InternalPubProto.g:1916:1: rule__ProtoPublicationBody__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPublicationBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1920:1: ( ( () ) )
            // InternalPubProto.g:1921:1: ( () )
            {
            // InternalPubProto.g:1921:1: ( () )
            // InternalPubProto.g:1922:2: ()
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0()); 
            // InternalPubProto.g:1923:2: ()
            // InternalPubProto.g:1923:3: 
            {
            }

             after(grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__0__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__1"
    // InternalPubProto.g:1931:1: rule__ProtoPublicationBody__Group__1 : rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2 ;
    public final void rule__ProtoPublicationBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1935:1: ( rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2 )
            // InternalPubProto.g:1936:2: rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoPublicationBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__1"


    // $ANTLR start "rule__ProtoPublicationBody__Group__1__Impl"
    // InternalPubProto.g:1943:1: rule__ProtoPublicationBody__Group__1__Impl : ( 'Body' ) ;
    public final void rule__ProtoPublicationBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1947:1: ( ( 'Body' ) )
            // InternalPubProto.g:1948:1: ( 'Body' )
            {
            // InternalPubProto.g:1948:1: ( 'Body' )
            // InternalPubProto.g:1949:2: 'Body'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__1__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__2"
    // InternalPubProto.g:1958:1: rule__ProtoPublicationBody__Group__2 : rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3 ;
    public final void rule__ProtoPublicationBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1962:1: ( rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3 )
            // InternalPubProto.g:1963:2: rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ProtoPublicationBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__2"


    // $ANTLR start "rule__ProtoPublicationBody__Group__2__Impl"
    // InternalPubProto.g:1970:1: rule__ProtoPublicationBody__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPublicationBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1974:1: ( ( '{' ) )
            // InternalPubProto.g:1975:1: ( '{' )
            {
            // InternalPubProto.g:1975:1: ( '{' )
            // InternalPubProto.g:1976:2: '{'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__2__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__3"
    // InternalPubProto.g:1985:1: rule__ProtoPublicationBody__Group__3 : rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4 ;
    public final void rule__ProtoPublicationBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1989:1: ( rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4 )
            // InternalPubProto.g:1990:2: rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ProtoPublicationBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__3"


    // $ANTLR start "rule__ProtoPublicationBody__Group__3__Impl"
    // InternalPubProto.g:1997:1: rule__ProtoPublicationBody__Group__3__Impl : ( ( rule__ProtoPublicationBody__Group_3__0 )? ) ;
    public final void rule__ProtoPublicationBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2001:1: ( ( ( rule__ProtoPublicationBody__Group_3__0 )? ) )
            // InternalPubProto.g:2002:1: ( ( rule__ProtoPublicationBody__Group_3__0 )? )
            {
            // InternalPubProto.g:2002:1: ( ( rule__ProtoPublicationBody__Group_3__0 )? )
            // InternalPubProto.g:2003:2: ( rule__ProtoPublicationBody__Group_3__0 )?
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getGroup_3()); 
            // InternalPubProto.g:2004:2: ( rule__ProtoPublicationBody__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPubProto.g:2004:3: rule__ProtoPublicationBody__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoPublicationBody__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtoPublicationBodyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__3__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__4"
    // InternalPubProto.g:2012:1: rule__ProtoPublicationBody__Group__4 : rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5 ;
    public final void rule__ProtoPublicationBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2016:1: ( rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5 )
            // InternalPubProto.g:2017:2: rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ProtoPublicationBody__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__4"


    // $ANTLR start "rule__ProtoPublicationBody__Group__4__Impl"
    // InternalPubProto.g:2024:1: rule__ProtoPublicationBody__Group__4__Impl : ( ( rule__ProtoPublicationBody__Group_4__0 )? ) ;
    public final void rule__ProtoPublicationBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2028:1: ( ( ( rule__ProtoPublicationBody__Group_4__0 )? ) )
            // InternalPubProto.g:2029:1: ( ( rule__ProtoPublicationBody__Group_4__0 )? )
            {
            // InternalPubProto.g:2029:1: ( ( rule__ProtoPublicationBody__Group_4__0 )? )
            // InternalPubProto.g:2030:2: ( rule__ProtoPublicationBody__Group_4__0 )?
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getGroup_4()); 
            // InternalPubProto.g:2031:2: ( rule__ProtoPublicationBody__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPubProto.g:2031:3: rule__ProtoPublicationBody__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoPublicationBody__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtoPublicationBodyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__4__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group__5"
    // InternalPubProto.g:2039:1: rule__ProtoPublicationBody__Group__5 : rule__ProtoPublicationBody__Group__5__Impl ;
    public final void rule__ProtoPublicationBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2043:1: ( rule__ProtoPublicationBody__Group__5__Impl )
            // InternalPubProto.g:2044:2: rule__ProtoPublicationBody__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__5"


    // $ANTLR start "rule__ProtoPublicationBody__Group__5__Impl"
    // InternalPubProto.g:2050:1: rule__ProtoPublicationBody__Group__5__Impl : ( '}' ) ;
    public final void rule__ProtoPublicationBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2054:1: ( ( '}' ) )
            // InternalPubProto.g:2055:1: ( '}' )
            {
            // InternalPubProto.g:2055:1: ( '}' )
            // InternalPubProto.g:2056:2: '}'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group__5__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group_3__0"
    // InternalPubProto.g:2066:1: rule__ProtoPublicationBody__Group_3__0 : rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1 ;
    public final void rule__ProtoPublicationBody__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2070:1: ( rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1 )
            // InternalPubProto.g:2071:2: rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ProtoPublicationBody__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_3__0"


    // $ANTLR start "rule__ProtoPublicationBody__Group_3__0__Impl"
    // InternalPubProto.g:2078:1: rule__ProtoPublicationBody__Group_3__0__Impl : ( 'parts:' ) ;
    public final void rule__ProtoPublicationBody__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2082:1: ( ( 'parts:' ) )
            // InternalPubProto.g:2083:1: ( 'parts:' )
            {
            // InternalPubProto.g:2083:1: ( 'parts:' )
            // InternalPubProto.g:2084:2: 'parts:'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_3__0__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group_3__1"
    // InternalPubProto.g:2093:1: rule__ProtoPublicationBody__Group_3__1 : rule__ProtoPublicationBody__Group_3__1__Impl ;
    public final void rule__ProtoPublicationBody__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2097:1: ( rule__ProtoPublicationBody__Group_3__1__Impl )
            // InternalPubProto.g:2098:2: rule__ProtoPublicationBody__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_3__1"


    // $ANTLR start "rule__ProtoPublicationBody__Group_3__1__Impl"
    // InternalPubProto.g:2104:1: rule__ProtoPublicationBody__Group_3__1__Impl : ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) ) ;
    public final void rule__ProtoPublicationBody__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2108:1: ( ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) ) )
            // InternalPubProto.g:2109:1: ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) )
            {
            // InternalPubProto.g:2109:1: ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) )
            // InternalPubProto.g:2110:2: ( rule__ProtoPublicationBody__Alternatives_3_1 )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_3_1()); 
            // InternalPubProto.g:2111:2: ( rule__ProtoPublicationBody__Alternatives_3_1 )
            // InternalPubProto.g:2111:3: rule__ProtoPublicationBody__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_3__1__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group_4__0"
    // InternalPubProto.g:2120:1: rule__ProtoPublicationBody__Group_4__0 : rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1 ;
    public final void rule__ProtoPublicationBody__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2124:1: ( rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1 )
            // InternalPubProto.g:2125:2: rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ProtoPublicationBody__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_4__0"


    // $ANTLR start "rule__ProtoPublicationBody__Group_4__0__Impl"
    // InternalPubProto.g:2132:1: rule__ProtoPublicationBody__Group_4__0__Impl : ( 'appendix:' ) ;
    public final void rule__ProtoPublicationBody__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2136:1: ( ( 'appendix:' ) )
            // InternalPubProto.g:2137:1: ( 'appendix:' )
            {
            // InternalPubProto.g:2137:1: ( 'appendix:' )
            // InternalPubProto.g:2138:2: 'appendix:'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_4__0__Impl"


    // $ANTLR start "rule__ProtoPublicationBody__Group_4__1"
    // InternalPubProto.g:2147:1: rule__ProtoPublicationBody__Group_4__1 : rule__ProtoPublicationBody__Group_4__1__Impl ;
    public final void rule__ProtoPublicationBody__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2151:1: ( rule__ProtoPublicationBody__Group_4__1__Impl )
            // InternalPubProto.g:2152:2: rule__ProtoPublicationBody__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_4__1"


    // $ANTLR start "rule__ProtoPublicationBody__Group_4__1__Impl"
    // InternalPubProto.g:2158:1: rule__ProtoPublicationBody__Group_4__1__Impl : ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) ) ;
    public final void rule__ProtoPublicationBody__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2162:1: ( ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) ) )
            // InternalPubProto.g:2163:1: ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) )
            {
            // InternalPubProto.g:2163:1: ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) )
            // InternalPubProto.g:2164:2: ( rule__ProtoPublicationBody__Alternatives_4_1 )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_4_1()); 
            // InternalPubProto.g:2165:2: ( rule__ProtoPublicationBody__Alternatives_4_1 )
            // InternalPubProto.g:2165:3: rule__ProtoPublicationBody__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPublicationBody__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__Group_4__1__Impl"


    // $ANTLR start "rule__ProtoChangeHistory__Group__0"
    // InternalPubProto.g:2174:1: rule__ProtoChangeHistory__Group__0 : rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1 ;
    public final void rule__ProtoChangeHistory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2178:1: ( rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1 )
            // InternalPubProto.g:2179:2: rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ProtoChangeHistory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__0"


    // $ANTLR start "rule__ProtoChangeHistory__Group__0__Impl"
    // InternalPubProto.g:2186:1: rule__ProtoChangeHistory__Group__0__Impl : ( () ) ;
    public final void rule__ProtoChangeHistory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2190:1: ( ( () ) )
            // InternalPubProto.g:2191:1: ( () )
            {
            // InternalPubProto.g:2191:1: ( () )
            // InternalPubProto.g:2192:2: ()
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0()); 
            // InternalPubProto.g:2193:2: ()
            // InternalPubProto.g:2193:3: 
            {
            }

             after(grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__0__Impl"


    // $ANTLR start "rule__ProtoChangeHistory__Group__1"
    // InternalPubProto.g:2201:1: rule__ProtoChangeHistory__Group__1 : rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2 ;
    public final void rule__ProtoChangeHistory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2205:1: ( rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2 )
            // InternalPubProto.g:2206:2: rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoChangeHistory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__1"


    // $ANTLR start "rule__ProtoChangeHistory__Group__1__Impl"
    // InternalPubProto.g:2213:1: rule__ProtoChangeHistory__Group__1__Impl : ( 'ChangeHistory' ) ;
    public final void rule__ProtoChangeHistory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2217:1: ( ( 'ChangeHistory' ) )
            // InternalPubProto.g:2218:1: ( 'ChangeHistory' )
            {
            // InternalPubProto.g:2218:1: ( 'ChangeHistory' )
            // InternalPubProto.g:2219:2: 'ChangeHistory'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__1__Impl"


    // $ANTLR start "rule__ProtoChangeHistory__Group__2"
    // InternalPubProto.g:2228:1: rule__ProtoChangeHistory__Group__2 : rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3 ;
    public final void rule__ProtoChangeHistory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2232:1: ( rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3 )
            // InternalPubProto.g:2233:2: rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoChangeHistory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__2"


    // $ANTLR start "rule__ProtoChangeHistory__Group__2__Impl"
    // InternalPubProto.g:2240:1: rule__ProtoChangeHistory__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoChangeHistory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2244:1: ( ( '{' ) )
            // InternalPubProto.g:2245:1: ( '{' )
            {
            // InternalPubProto.g:2245:1: ( '{' )
            // InternalPubProto.g:2246:2: '{'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__2__Impl"


    // $ANTLR start "rule__ProtoChangeHistory__Group__3"
    // InternalPubProto.g:2255:1: rule__ProtoChangeHistory__Group__3 : rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4 ;
    public final void rule__ProtoChangeHistory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2259:1: ( rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4 )
            // InternalPubProto.g:2260:2: rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoChangeHistory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__3"


    // $ANTLR start "rule__ProtoChangeHistory__Group__3__Impl"
    // InternalPubProto.g:2267:1: rule__ProtoChangeHistory__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoChangeHistory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2271:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2272:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2272:1: ( ruleSegmentBody )
            // InternalPubProto.g:2273:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoChangeHistoryAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__3__Impl"


    // $ANTLR start "rule__ProtoChangeHistory__Group__4"
    // InternalPubProto.g:2282:1: rule__ProtoChangeHistory__Group__4 : rule__ProtoChangeHistory__Group__4__Impl ;
    public final void rule__ProtoChangeHistory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2286:1: ( rule__ProtoChangeHistory__Group__4__Impl )
            // InternalPubProto.g:2287:2: rule__ProtoChangeHistory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoChangeHistory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__4"


    // $ANTLR start "rule__ProtoChangeHistory__Group__4__Impl"
    // InternalPubProto.g:2293:1: rule__ProtoChangeHistory__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoChangeHistory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2297:1: ( ( '}' ) )
            // InternalPubProto.g:2298:1: ( '}' )
            {
            // InternalPubProto.g:2298:1: ( '}' )
            // InternalPubProto.g:2299:2: '}'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoChangeHistoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChangeHistory__Group__4__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__0"
    // InternalPubProto.g:2309:1: rule__ProtoTOC__Group__0 : rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1 ;
    public final void rule__ProtoTOC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2313:1: ( rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1 )
            // InternalPubProto.g:2314:2: rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ProtoTOC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__0"


    // $ANTLR start "rule__ProtoTOC__Group__0__Impl"
    // InternalPubProto.g:2321:1: rule__ProtoTOC__Group__0__Impl : ( () ) ;
    public final void rule__ProtoTOC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2325:1: ( ( () ) )
            // InternalPubProto.g:2326:1: ( () )
            {
            // InternalPubProto.g:2326:1: ( () )
            // InternalPubProto.g:2327:2: ()
            {
             before(grammarAccess.getProtoTOCAccess().getProtoTOCAction_0()); 
            // InternalPubProto.g:2328:2: ()
            // InternalPubProto.g:2328:3: 
            {
            }

             after(grammarAccess.getProtoTOCAccess().getProtoTOCAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__0__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__1"
    // InternalPubProto.g:2336:1: rule__ProtoTOC__Group__1 : rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2 ;
    public final void rule__ProtoTOC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2340:1: ( rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2 )
            // InternalPubProto.g:2341:2: rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoTOC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__1"


    // $ANTLR start "rule__ProtoTOC__Group__1__Impl"
    // InternalPubProto.g:2348:1: rule__ProtoTOC__Group__1__Impl : ( 'TableOfContents' ) ;
    public final void rule__ProtoTOC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2352:1: ( ( 'TableOfContents' ) )
            // InternalPubProto.g:2353:1: ( 'TableOfContents' )
            {
            // InternalPubProto.g:2353:1: ( 'TableOfContents' )
            // InternalPubProto.g:2354:2: 'TableOfContents'
            {
             before(grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__1__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__2"
    // InternalPubProto.g:2363:1: rule__ProtoTOC__Group__2 : rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3 ;
    public final void rule__ProtoTOC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2367:1: ( rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3 )
            // InternalPubProto.g:2368:2: rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoTOC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__2"


    // $ANTLR start "rule__ProtoTOC__Group__2__Impl"
    // InternalPubProto.g:2375:1: rule__ProtoTOC__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoTOC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2379:1: ( ( '{' ) )
            // InternalPubProto.g:2380:1: ( '{' )
            {
            // InternalPubProto.g:2380:1: ( '{' )
            // InternalPubProto.g:2381:2: '{'
            {
             before(grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__2__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__3"
    // InternalPubProto.g:2390:1: rule__ProtoTOC__Group__3 : rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4 ;
    public final void rule__ProtoTOC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2394:1: ( rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4 )
            // InternalPubProto.g:2395:2: rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ProtoTOC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__3"


    // $ANTLR start "rule__ProtoTOC__Group__3__Impl"
    // InternalPubProto.g:2402:1: rule__ProtoTOC__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoTOC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2406:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2407:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2407:1: ( ruleSegmentBody )
            // InternalPubProto.g:2408:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoTOCAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoTOCAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__3__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__4"
    // InternalPubProto.g:2417:1: rule__ProtoTOC__Group__4 : rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5 ;
    public final void rule__ProtoTOC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2421:1: ( rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5 )
            // InternalPubProto.g:2422:2: rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__ProtoTOC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__4"


    // $ANTLR start "rule__ProtoTOC__Group__4__Impl"
    // InternalPubProto.g:2429:1: rule__ProtoTOC__Group__4__Impl : ( ( rule__ProtoTOC__Group_4__0 )? ) ;
    public final void rule__ProtoTOC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2433:1: ( ( ( rule__ProtoTOC__Group_4__0 )? ) )
            // InternalPubProto.g:2434:1: ( ( rule__ProtoTOC__Group_4__0 )? )
            {
            // InternalPubProto.g:2434:1: ( ( rule__ProtoTOC__Group_4__0 )? )
            // InternalPubProto.g:2435:2: ( rule__ProtoTOC__Group_4__0 )?
            {
             before(grammarAccess.getProtoTOCAccess().getGroup_4()); 
            // InternalPubProto.g:2436:2: ( rule__ProtoTOC__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPubProto.g:2436:3: rule__ProtoTOC__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtoTOC__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtoTOCAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__4__Impl"


    // $ANTLR start "rule__ProtoTOC__Group__5"
    // InternalPubProto.g:2444:1: rule__ProtoTOC__Group__5 : rule__ProtoTOC__Group__5__Impl ;
    public final void rule__ProtoTOC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2448:1: ( rule__ProtoTOC__Group__5__Impl )
            // InternalPubProto.g:2449:2: rule__ProtoTOC__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__5"


    // $ANTLR start "rule__ProtoTOC__Group__5__Impl"
    // InternalPubProto.g:2455:1: rule__ProtoTOC__Group__5__Impl : ( '}' ) ;
    public final void rule__ProtoTOC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2459:1: ( ( '}' ) )
            // InternalPubProto.g:2460:1: ( '}' )
            {
            // InternalPubProto.g:2460:1: ( '}' )
            // InternalPubProto.g:2461:2: '}'
            {
             before(grammarAccess.getProtoTOCAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoTOCAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group__5__Impl"


    // $ANTLR start "rule__ProtoTOC__Group_4__0"
    // InternalPubProto.g:2471:1: rule__ProtoTOC__Group_4__0 : rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1 ;
    public final void rule__ProtoTOC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2475:1: ( rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1 )
            // InternalPubProto.g:2476:2: rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__ProtoTOC__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group_4__0"


    // $ANTLR start "rule__ProtoTOC__Group_4__0__Impl"
    // InternalPubProto.g:2483:1: rule__ProtoTOC__Group_4__0__Impl : ( 'maxLevel:' ) ;
    public final void rule__ProtoTOC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2487:1: ( ( 'maxLevel:' ) )
            // InternalPubProto.g:2488:1: ( 'maxLevel:' )
            {
            // InternalPubProto.g:2488:1: ( 'maxLevel:' )
            // InternalPubProto.g:2489:2: 'maxLevel:'
            {
             before(grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group_4__0__Impl"


    // $ANTLR start "rule__ProtoTOC__Group_4__1"
    // InternalPubProto.g:2498:1: rule__ProtoTOC__Group_4__1 : rule__ProtoTOC__Group_4__1__Impl ;
    public final void rule__ProtoTOC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2502:1: ( rule__ProtoTOC__Group_4__1__Impl )
            // InternalPubProto.g:2503:2: rule__ProtoTOC__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoTOC__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group_4__1"


    // $ANTLR start "rule__ProtoTOC__Group_4__1__Impl"
    // InternalPubProto.g:2509:1: rule__ProtoTOC__Group_4__1__Impl : ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) ) ;
    public final void rule__ProtoTOC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2513:1: ( ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) ) )
            // InternalPubProto.g:2514:1: ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) )
            {
            // InternalPubProto.g:2514:1: ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) )
            // InternalPubProto.g:2515:2: ( rule__ProtoTOC__MaxLevelAssignment_4_1 )
            {
             before(grammarAccess.getProtoTOCAccess().getMaxLevelAssignment_4_1()); 
            // InternalPubProto.g:2516:2: ( rule__ProtoTOC__MaxLevelAssignment_4_1 )
            // InternalPubProto.g:2516:3: rule__ProtoTOC__MaxLevelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtoTOC__MaxLevelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProtoTOCAccess().getMaxLevelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__Group_4__1__Impl"


    // $ANTLR start "rule__ProtoAbbreviations__Group__0"
    // InternalPubProto.g:2525:1: rule__ProtoAbbreviations__Group__0 : rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1 ;
    public final void rule__ProtoAbbreviations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2529:1: ( rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1 )
            // InternalPubProto.g:2530:2: rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ProtoAbbreviations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__0"


    // $ANTLR start "rule__ProtoAbbreviations__Group__0__Impl"
    // InternalPubProto.g:2537:1: rule__ProtoAbbreviations__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAbbreviations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2541:1: ( ( () ) )
            // InternalPubProto.g:2542:1: ( () )
            {
            // InternalPubProto.g:2542:1: ( () )
            // InternalPubProto.g:2543:2: ()
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0()); 
            // InternalPubProto.g:2544:2: ()
            // InternalPubProto.g:2544:3: 
            {
            }

             after(grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__0__Impl"


    // $ANTLR start "rule__ProtoAbbreviations__Group__1"
    // InternalPubProto.g:2552:1: rule__ProtoAbbreviations__Group__1 : rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2 ;
    public final void rule__ProtoAbbreviations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2556:1: ( rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2 )
            // InternalPubProto.g:2557:2: rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoAbbreviations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__1"


    // $ANTLR start "rule__ProtoAbbreviations__Group__1__Impl"
    // InternalPubProto.g:2564:1: rule__ProtoAbbreviations__Group__1__Impl : ( 'Abbreviations' ) ;
    public final void rule__ProtoAbbreviations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2568:1: ( ( 'Abbreviations' ) )
            // InternalPubProto.g:2569:1: ( 'Abbreviations' )
            {
            // InternalPubProto.g:2569:1: ( 'Abbreviations' )
            // InternalPubProto.g:2570:2: 'Abbreviations'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__1__Impl"


    // $ANTLR start "rule__ProtoAbbreviations__Group__2"
    // InternalPubProto.g:2579:1: rule__ProtoAbbreviations__Group__2 : rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3 ;
    public final void rule__ProtoAbbreviations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2583:1: ( rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3 )
            // InternalPubProto.g:2584:2: rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoAbbreviations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__2"


    // $ANTLR start "rule__ProtoAbbreviations__Group__2__Impl"
    // InternalPubProto.g:2591:1: rule__ProtoAbbreviations__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAbbreviations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2595:1: ( ( '{' ) )
            // InternalPubProto.g:2596:1: ( '{' )
            {
            // InternalPubProto.g:2596:1: ( '{' )
            // InternalPubProto.g:2597:2: '{'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__2__Impl"


    // $ANTLR start "rule__ProtoAbbreviations__Group__3"
    // InternalPubProto.g:2606:1: rule__ProtoAbbreviations__Group__3 : rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4 ;
    public final void rule__ProtoAbbreviations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2610:1: ( rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4 )
            // InternalPubProto.g:2611:2: rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoAbbreviations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__3"


    // $ANTLR start "rule__ProtoAbbreviations__Group__3__Impl"
    // InternalPubProto.g:2618:1: rule__ProtoAbbreviations__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoAbbreviations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2622:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2623:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2623:1: ( ruleSegmentBody )
            // InternalPubProto.g:2624:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoAbbreviationsAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__3__Impl"


    // $ANTLR start "rule__ProtoAbbreviations__Group__4"
    // InternalPubProto.g:2633:1: rule__ProtoAbbreviations__Group__4 : rule__ProtoAbbreviations__Group__4__Impl ;
    public final void rule__ProtoAbbreviations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2637:1: ( rule__ProtoAbbreviations__Group__4__Impl )
            // InternalPubProto.g:2638:2: rule__ProtoAbbreviations__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAbbreviations__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__4"


    // $ANTLR start "rule__ProtoAbbreviations__Group__4__Impl"
    // InternalPubProto.g:2644:1: rule__ProtoAbbreviations__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAbbreviations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2648:1: ( ( '}' ) )
            // InternalPubProto.g:2649:1: ( '}' )
            {
            // InternalPubProto.g:2649:1: ( '}' )
            // InternalPubProto.g:2650:2: '}'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoAbbreviationsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAbbreviations__Group__4__Impl"


    // $ANTLR start "rule__ProtoListOfTables__Group__0"
    // InternalPubProto.g:2660:1: rule__ProtoListOfTables__Group__0 : rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1 ;
    public final void rule__ProtoListOfTables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2664:1: ( rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1 )
            // InternalPubProto.g:2665:2: rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ProtoListOfTables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__0"


    // $ANTLR start "rule__ProtoListOfTables__Group__0__Impl"
    // InternalPubProto.g:2672:1: rule__ProtoListOfTables__Group__0__Impl : ( () ) ;
    public final void rule__ProtoListOfTables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2676:1: ( ( () ) )
            // InternalPubProto.g:2677:1: ( () )
            {
            // InternalPubProto.g:2677:1: ( () )
            // InternalPubProto.g:2678:2: ()
            {
             before(grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0()); 
            // InternalPubProto.g:2679:2: ()
            // InternalPubProto.g:2679:3: 
            {
            }

             after(grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__0__Impl"


    // $ANTLR start "rule__ProtoListOfTables__Group__1"
    // InternalPubProto.g:2687:1: rule__ProtoListOfTables__Group__1 : rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2 ;
    public final void rule__ProtoListOfTables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2691:1: ( rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2 )
            // InternalPubProto.g:2692:2: rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoListOfTables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__1"


    // $ANTLR start "rule__ProtoListOfTables__Group__1__Impl"
    // InternalPubProto.g:2699:1: rule__ProtoListOfTables__Group__1__Impl : ( 'ListOfTables' ) ;
    public final void rule__ProtoListOfTables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2703:1: ( ( 'ListOfTables' ) )
            // InternalPubProto.g:2704:1: ( 'ListOfTables' )
            {
            // InternalPubProto.g:2704:1: ( 'ListOfTables' )
            // InternalPubProto.g:2705:2: 'ListOfTables'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__1__Impl"


    // $ANTLR start "rule__ProtoListOfTables__Group__2"
    // InternalPubProto.g:2714:1: rule__ProtoListOfTables__Group__2 : rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3 ;
    public final void rule__ProtoListOfTables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2718:1: ( rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3 )
            // InternalPubProto.g:2719:2: rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoListOfTables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__2"


    // $ANTLR start "rule__ProtoListOfTables__Group__2__Impl"
    // InternalPubProto.g:2726:1: rule__ProtoListOfTables__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoListOfTables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2730:1: ( ( '{' ) )
            // InternalPubProto.g:2731:1: ( '{' )
            {
            // InternalPubProto.g:2731:1: ( '{' )
            // InternalPubProto.g:2732:2: '{'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__2__Impl"


    // $ANTLR start "rule__ProtoListOfTables__Group__3"
    // InternalPubProto.g:2741:1: rule__ProtoListOfTables__Group__3 : rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4 ;
    public final void rule__ProtoListOfTables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2745:1: ( rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4 )
            // InternalPubProto.g:2746:2: rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoListOfTables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__3"


    // $ANTLR start "rule__ProtoListOfTables__Group__3__Impl"
    // InternalPubProto.g:2753:1: rule__ProtoListOfTables__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoListOfTables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2757:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2758:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2758:1: ( ruleSegmentBody )
            // InternalPubProto.g:2759:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoListOfTablesAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoListOfTablesAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__3__Impl"


    // $ANTLR start "rule__ProtoListOfTables__Group__4"
    // InternalPubProto.g:2768:1: rule__ProtoListOfTables__Group__4 : rule__ProtoListOfTables__Group__4__Impl ;
    public final void rule__ProtoListOfTables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2772:1: ( rule__ProtoListOfTables__Group__4__Impl )
            // InternalPubProto.g:2773:2: rule__ProtoListOfTables__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoListOfTables__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__4"


    // $ANTLR start "rule__ProtoListOfTables__Group__4__Impl"
    // InternalPubProto.g:2779:1: rule__ProtoListOfTables__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoListOfTables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2783:1: ( ( '}' ) )
            // InternalPubProto.g:2784:1: ( '}' )
            {
            // InternalPubProto.g:2784:1: ( '}' )
            // InternalPubProto.g:2785:2: '}'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoListOfTablesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfTables__Group__4__Impl"


    // $ANTLR start "rule__ProtoListOfFigures__Group__0"
    // InternalPubProto.g:2795:1: rule__ProtoListOfFigures__Group__0 : rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1 ;
    public final void rule__ProtoListOfFigures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2799:1: ( rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1 )
            // InternalPubProto.g:2800:2: rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ProtoListOfFigures__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__0"


    // $ANTLR start "rule__ProtoListOfFigures__Group__0__Impl"
    // InternalPubProto.g:2807:1: rule__ProtoListOfFigures__Group__0__Impl : ( () ) ;
    public final void rule__ProtoListOfFigures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2811:1: ( ( () ) )
            // InternalPubProto.g:2812:1: ( () )
            {
            // InternalPubProto.g:2812:1: ( () )
            // InternalPubProto.g:2813:2: ()
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0()); 
            // InternalPubProto.g:2814:2: ()
            // InternalPubProto.g:2814:3: 
            {
            }

             after(grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__0__Impl"


    // $ANTLR start "rule__ProtoListOfFigures__Group__1"
    // InternalPubProto.g:2822:1: rule__ProtoListOfFigures__Group__1 : rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2 ;
    public final void rule__ProtoListOfFigures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2826:1: ( rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2 )
            // InternalPubProto.g:2827:2: rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoListOfFigures__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__1"


    // $ANTLR start "rule__ProtoListOfFigures__Group__1__Impl"
    // InternalPubProto.g:2834:1: rule__ProtoListOfFigures__Group__1__Impl : ( 'ListOfFigures' ) ;
    public final void rule__ProtoListOfFigures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2838:1: ( ( 'ListOfFigures' ) )
            // InternalPubProto.g:2839:1: ( 'ListOfFigures' )
            {
            // InternalPubProto.g:2839:1: ( 'ListOfFigures' )
            // InternalPubProto.g:2840:2: 'ListOfFigures'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__1__Impl"


    // $ANTLR start "rule__ProtoListOfFigures__Group__2"
    // InternalPubProto.g:2849:1: rule__ProtoListOfFigures__Group__2 : rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3 ;
    public final void rule__ProtoListOfFigures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2853:1: ( rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3 )
            // InternalPubProto.g:2854:2: rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoListOfFigures__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__2"


    // $ANTLR start "rule__ProtoListOfFigures__Group__2__Impl"
    // InternalPubProto.g:2861:1: rule__ProtoListOfFigures__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoListOfFigures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2865:1: ( ( '{' ) )
            // InternalPubProto.g:2866:1: ( '{' )
            {
            // InternalPubProto.g:2866:1: ( '{' )
            // InternalPubProto.g:2867:2: '{'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__2__Impl"


    // $ANTLR start "rule__ProtoListOfFigures__Group__3"
    // InternalPubProto.g:2876:1: rule__ProtoListOfFigures__Group__3 : rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4 ;
    public final void rule__ProtoListOfFigures__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2880:1: ( rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4 )
            // InternalPubProto.g:2881:2: rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoListOfFigures__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__3"


    // $ANTLR start "rule__ProtoListOfFigures__Group__3__Impl"
    // InternalPubProto.g:2888:1: rule__ProtoListOfFigures__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoListOfFigures__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2892:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2893:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2893:1: ( ruleSegmentBody )
            // InternalPubProto.g:2894:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoListOfFiguresAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__3__Impl"


    // $ANTLR start "rule__ProtoListOfFigures__Group__4"
    // InternalPubProto.g:2903:1: rule__ProtoListOfFigures__Group__4 : rule__ProtoListOfFigures__Group__4__Impl ;
    public final void rule__ProtoListOfFigures__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2907:1: ( rule__ProtoListOfFigures__Group__4__Impl )
            // InternalPubProto.g:2908:2: rule__ProtoListOfFigures__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoListOfFigures__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__4"


    // $ANTLR start "rule__ProtoListOfFigures__Group__4__Impl"
    // InternalPubProto.g:2914:1: rule__ProtoListOfFigures__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoListOfFigures__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2918:1: ( ( '}' ) )
            // InternalPubProto.g:2919:1: ( '}' )
            {
            // InternalPubProto.g:2919:1: ( '}' )
            // InternalPubProto.g:2920:2: '}'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoListOfFiguresAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoListOfFigures__Group__4__Impl"


    // $ANTLR start "rule__ProtoBibliography__Group__0"
    // InternalPubProto.g:2930:1: rule__ProtoBibliography__Group__0 : rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1 ;
    public final void rule__ProtoBibliography__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2934:1: ( rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1 )
            // InternalPubProto.g:2935:2: rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ProtoBibliography__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__0"


    // $ANTLR start "rule__ProtoBibliography__Group__0__Impl"
    // InternalPubProto.g:2942:1: rule__ProtoBibliography__Group__0__Impl : ( () ) ;
    public final void rule__ProtoBibliography__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2946:1: ( ( () ) )
            // InternalPubProto.g:2947:1: ( () )
            {
            // InternalPubProto.g:2947:1: ( () )
            // InternalPubProto.g:2948:2: ()
            {
             before(grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0()); 
            // InternalPubProto.g:2949:2: ()
            // InternalPubProto.g:2949:3: 
            {
            }

             after(grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__0__Impl"


    // $ANTLR start "rule__ProtoBibliography__Group__1"
    // InternalPubProto.g:2957:1: rule__ProtoBibliography__Group__1 : rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2 ;
    public final void rule__ProtoBibliography__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2961:1: ( rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2 )
            // InternalPubProto.g:2962:2: rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoBibliography__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__1"


    // $ANTLR start "rule__ProtoBibliography__Group__1__Impl"
    // InternalPubProto.g:2969:1: rule__ProtoBibliography__Group__1__Impl : ( 'Bibliography' ) ;
    public final void rule__ProtoBibliography__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2973:1: ( ( 'Bibliography' ) )
            // InternalPubProto.g:2974:1: ( 'Bibliography' )
            {
            // InternalPubProto.g:2974:1: ( 'Bibliography' )
            // InternalPubProto.g:2975:2: 'Bibliography'
            {
             before(grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__1__Impl"


    // $ANTLR start "rule__ProtoBibliography__Group__2"
    // InternalPubProto.g:2984:1: rule__ProtoBibliography__Group__2 : rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3 ;
    public final void rule__ProtoBibliography__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2988:1: ( rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3 )
            // InternalPubProto.g:2989:2: rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoBibliography__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__2"


    // $ANTLR start "rule__ProtoBibliography__Group__2__Impl"
    // InternalPubProto.g:2996:1: rule__ProtoBibliography__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoBibliography__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3000:1: ( ( '{' ) )
            // InternalPubProto.g:3001:1: ( '{' )
            {
            // InternalPubProto.g:3001:1: ( '{' )
            // InternalPubProto.g:3002:2: '{'
            {
             before(grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__2__Impl"


    // $ANTLR start "rule__ProtoBibliography__Group__3"
    // InternalPubProto.g:3011:1: rule__ProtoBibliography__Group__3 : rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4 ;
    public final void rule__ProtoBibliography__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3015:1: ( rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4 )
            // InternalPubProto.g:3016:2: rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoBibliography__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__3"


    // $ANTLR start "rule__ProtoBibliography__Group__3__Impl"
    // InternalPubProto.g:3023:1: rule__ProtoBibliography__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoBibliography__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3027:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:3028:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:3028:1: ( ruleSegmentBody )
            // InternalPubProto.g:3029:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoBibliographyAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoBibliographyAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__3__Impl"


    // $ANTLR start "rule__ProtoBibliography__Group__4"
    // InternalPubProto.g:3038:1: rule__ProtoBibliography__Group__4 : rule__ProtoBibliography__Group__4__Impl ;
    public final void rule__ProtoBibliography__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3042:1: ( rule__ProtoBibliography__Group__4__Impl )
            // InternalPubProto.g:3043:2: rule__ProtoBibliography__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoBibliography__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__4"


    // $ANTLR start "rule__ProtoBibliography__Group__4__Impl"
    // InternalPubProto.g:3049:1: rule__ProtoBibliography__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoBibliography__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3053:1: ( ( '}' ) )
            // InternalPubProto.g:3054:1: ( '}' )
            {
            // InternalPubProto.g:3054:1: ( '}' )
            // InternalPubProto.g:3055:2: '}'
            {
             before(grammarAccess.getProtoBibliographyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoBibliographyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoBibliography__Group__4__Impl"


    // $ANTLR start "rule__ProtoGlossary__Group__0"
    // InternalPubProto.g:3065:1: rule__ProtoGlossary__Group__0 : rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1 ;
    public final void rule__ProtoGlossary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3069:1: ( rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1 )
            // InternalPubProto.g:3070:2: rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ProtoGlossary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__0"


    // $ANTLR start "rule__ProtoGlossary__Group__0__Impl"
    // InternalPubProto.g:3077:1: rule__ProtoGlossary__Group__0__Impl : ( () ) ;
    public final void rule__ProtoGlossary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3081:1: ( ( () ) )
            // InternalPubProto.g:3082:1: ( () )
            {
            // InternalPubProto.g:3082:1: ( () )
            // InternalPubProto.g:3083:2: ()
            {
             before(grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0()); 
            // InternalPubProto.g:3084:2: ()
            // InternalPubProto.g:3084:3: 
            {
            }

             after(grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__0__Impl"


    // $ANTLR start "rule__ProtoGlossary__Group__1"
    // InternalPubProto.g:3092:1: rule__ProtoGlossary__Group__1 : rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2 ;
    public final void rule__ProtoGlossary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3096:1: ( rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2 )
            // InternalPubProto.g:3097:2: rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoGlossary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__1"


    // $ANTLR start "rule__ProtoGlossary__Group__1__Impl"
    // InternalPubProto.g:3104:1: rule__ProtoGlossary__Group__1__Impl : ( 'Glossary' ) ;
    public final void rule__ProtoGlossary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3108:1: ( ( 'Glossary' ) )
            // InternalPubProto.g:3109:1: ( 'Glossary' )
            {
            // InternalPubProto.g:3109:1: ( 'Glossary' )
            // InternalPubProto.g:3110:2: 'Glossary'
            {
             before(grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__1__Impl"


    // $ANTLR start "rule__ProtoGlossary__Group__2"
    // InternalPubProto.g:3119:1: rule__ProtoGlossary__Group__2 : rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3 ;
    public final void rule__ProtoGlossary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3123:1: ( rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3 )
            // InternalPubProto.g:3124:2: rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoGlossary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__2"


    // $ANTLR start "rule__ProtoGlossary__Group__2__Impl"
    // InternalPubProto.g:3131:1: rule__ProtoGlossary__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoGlossary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3135:1: ( ( '{' ) )
            // InternalPubProto.g:3136:1: ( '{' )
            {
            // InternalPubProto.g:3136:1: ( '{' )
            // InternalPubProto.g:3137:2: '{'
            {
             before(grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__2__Impl"


    // $ANTLR start "rule__ProtoGlossary__Group__3"
    // InternalPubProto.g:3146:1: rule__ProtoGlossary__Group__3 : rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4 ;
    public final void rule__ProtoGlossary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3150:1: ( rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4 )
            // InternalPubProto.g:3151:2: rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoGlossary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__3"


    // $ANTLR start "rule__ProtoGlossary__Group__3__Impl"
    // InternalPubProto.g:3158:1: rule__ProtoGlossary__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoGlossary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3162:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:3163:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:3163:1: ( ruleSegmentBody )
            // InternalPubProto.g:3164:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoGlossaryAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoGlossaryAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__3__Impl"


    // $ANTLR start "rule__ProtoGlossary__Group__4"
    // InternalPubProto.g:3173:1: rule__ProtoGlossary__Group__4 : rule__ProtoGlossary__Group__4__Impl ;
    public final void rule__ProtoGlossary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3177:1: ( rule__ProtoGlossary__Group__4__Impl )
            // InternalPubProto.g:3178:2: rule__ProtoGlossary__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoGlossary__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__4"


    // $ANTLR start "rule__ProtoGlossary__Group__4__Impl"
    // InternalPubProto.g:3184:1: rule__ProtoGlossary__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoGlossary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3188:1: ( ( '}' ) )
            // InternalPubProto.g:3189:1: ( '}' )
            {
            // InternalPubProto.g:3189:1: ( '}' )
            // InternalPubProto.g:3190:2: '}'
            {
             before(grammarAccess.getProtoGlossaryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoGlossaryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoGlossary__Group__4__Impl"


    // $ANTLR start "rule__ProtoIndex__Group__0"
    // InternalPubProto.g:3200:1: rule__ProtoIndex__Group__0 : rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1 ;
    public final void rule__ProtoIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3204:1: ( rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1 )
            // InternalPubProto.g:3205:2: rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ProtoIndex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__0"


    // $ANTLR start "rule__ProtoIndex__Group__0__Impl"
    // InternalPubProto.g:3212:1: rule__ProtoIndex__Group__0__Impl : ( () ) ;
    public final void rule__ProtoIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3216:1: ( ( () ) )
            // InternalPubProto.g:3217:1: ( () )
            {
            // InternalPubProto.g:3217:1: ( () )
            // InternalPubProto.g:3218:2: ()
            {
             before(grammarAccess.getProtoIndexAccess().getProtoIndexAction_0()); 
            // InternalPubProto.g:3219:2: ()
            // InternalPubProto.g:3219:3: 
            {
            }

             after(grammarAccess.getProtoIndexAccess().getProtoIndexAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__0__Impl"


    // $ANTLR start "rule__ProtoIndex__Group__1"
    // InternalPubProto.g:3227:1: rule__ProtoIndex__Group__1 : rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2 ;
    public final void rule__ProtoIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3231:1: ( rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2 )
            // InternalPubProto.g:3232:2: rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoIndex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__1"


    // $ANTLR start "rule__ProtoIndex__Group__1__Impl"
    // InternalPubProto.g:3239:1: rule__ProtoIndex__Group__1__Impl : ( 'Index' ) ;
    public final void rule__ProtoIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3243:1: ( ( 'Index' ) )
            // InternalPubProto.g:3244:1: ( 'Index' )
            {
            // InternalPubProto.g:3244:1: ( 'Index' )
            // InternalPubProto.g:3245:2: 'Index'
            {
             before(grammarAccess.getProtoIndexAccess().getIndexKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProtoIndexAccess().getIndexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__1__Impl"


    // $ANTLR start "rule__ProtoIndex__Group__2"
    // InternalPubProto.g:3254:1: rule__ProtoIndex__Group__2 : rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3 ;
    public final void rule__ProtoIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3258:1: ( rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3 )
            // InternalPubProto.g:3259:2: rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ProtoIndex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__2"


    // $ANTLR start "rule__ProtoIndex__Group__2__Impl"
    // InternalPubProto.g:3266:1: rule__ProtoIndex__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3270:1: ( ( '{' ) )
            // InternalPubProto.g:3271:1: ( '{' )
            {
            // InternalPubProto.g:3271:1: ( '{' )
            // InternalPubProto.g:3272:2: '{'
            {
             before(grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__2__Impl"


    // $ANTLR start "rule__ProtoIndex__Group__3"
    // InternalPubProto.g:3281:1: rule__ProtoIndex__Group__3 : rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4 ;
    public final void rule__ProtoIndex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3285:1: ( rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4 )
            // InternalPubProto.g:3286:2: rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoIndex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__3"


    // $ANTLR start "rule__ProtoIndex__Group__3__Impl"
    // InternalPubProto.g:3293:1: rule__ProtoIndex__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoIndex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3297:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:3298:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:3298:1: ( ruleSegmentBody )
            // InternalPubProto.g:3299:2: ruleSegmentBody
            {
             before(grammarAccess.getProtoIndexAccess().getSegmentBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleSegmentBody();

            state._fsp--;

             after(grammarAccess.getProtoIndexAccess().getSegmentBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__3__Impl"


    // $ANTLR start "rule__ProtoIndex__Group__4"
    // InternalPubProto.g:3308:1: rule__ProtoIndex__Group__4 : rule__ProtoIndex__Group__4__Impl ;
    public final void rule__ProtoIndex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3312:1: ( rule__ProtoIndex__Group__4__Impl )
            // InternalPubProto.g:3313:2: rule__ProtoIndex__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoIndex__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__4"


    // $ANTLR start "rule__ProtoIndex__Group__4__Impl"
    // InternalPubProto.g:3319:1: rule__ProtoIndex__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoIndex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3323:1: ( ( '}' ) )
            // InternalPubProto.g:3324:1: ( '}' )
            {
            // InternalPubProto.g:3324:1: ( '}' )
            // InternalPubProto.g:3325:2: '}'
            {
             before(grammarAccess.getProtoIndexAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoIndexAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoIndex__Group__4__Impl"


    // $ANTLR start "rule__ProtoDivisionBody__Group__0"
    // InternalPubProto.g:3335:1: rule__ProtoDivisionBody__Group__0 : rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1 ;
    public final void rule__ProtoDivisionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3339:1: ( rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1 )
            // InternalPubProto.g:3340:2: rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ProtoDivisionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoDivisionBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivisionBody__Group__0"


    // $ANTLR start "rule__ProtoDivisionBody__Group__0__Impl"
    // InternalPubProto.g:3347:1: rule__ProtoDivisionBody__Group__0__Impl : ( 'numbering:' ) ;
    public final void rule__ProtoDivisionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3351:1: ( ( 'numbering:' ) )
            // InternalPubProto.g:3352:1: ( 'numbering:' )
            {
            // InternalPubProto.g:3352:1: ( 'numbering:' )
            // InternalPubProto.g:3353:2: 'numbering:'
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivisionBody__Group__0__Impl"


    // $ANTLR start "rule__ProtoDivisionBody__Group__1"
    // InternalPubProto.g:3362:1: rule__ProtoDivisionBody__Group__1 : rule__ProtoDivisionBody__Group__1__Impl ;
    public final void rule__ProtoDivisionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3366:1: ( rule__ProtoDivisionBody__Group__1__Impl )
            // InternalPubProto.g:3367:2: rule__ProtoDivisionBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoDivisionBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivisionBody__Group__1"


    // $ANTLR start "rule__ProtoDivisionBody__Group__1__Impl"
    // InternalPubProto.g:3373:1: rule__ProtoDivisionBody__Group__1__Impl : ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) ) ;
    public final void rule__ProtoDivisionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3377:1: ( ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) ) )
            // InternalPubProto.g:3378:1: ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) )
            {
            // InternalPubProto.g:3378:1: ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) )
            // InternalPubProto.g:3379:2: ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 )
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleAssignment_1()); 
            // InternalPubProto.g:3380:2: ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 )
            // InternalPubProto.g:3380:3: rule__ProtoDivisionBody__NumberingStyleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtoDivisionBody__NumberingStyleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivisionBody__Group__1__Impl"


    // $ANTLR start "rule__ProtoPart__Group__0"
    // InternalPubProto.g:3389:1: rule__ProtoPart__Group__0 : rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1 ;
    public final void rule__ProtoPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3393:1: ( rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1 )
            // InternalPubProto.g:3394:2: rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ProtoPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__0"


    // $ANTLR start "rule__ProtoPart__Group__0__Impl"
    // InternalPubProto.g:3401:1: rule__ProtoPart__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3405:1: ( ( () ) )
            // InternalPubProto.g:3406:1: ( () )
            {
            // InternalPubProto.g:3406:1: ( () )
            // InternalPubProto.g:3407:2: ()
            {
             before(grammarAccess.getProtoPartAccess().getProtoPartAction_0()); 
            // InternalPubProto.g:3408:2: ()
            // InternalPubProto.g:3408:3: 
            {
            }

             after(grammarAccess.getProtoPartAccess().getProtoPartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__0__Impl"


    // $ANTLR start "rule__ProtoPart__Group__1"
    // InternalPubProto.g:3416:1: rule__ProtoPart__Group__1 : rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2 ;
    public final void rule__ProtoPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3420:1: ( rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2 )
            // InternalPubProto.g:3421:2: rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__1"


    // $ANTLR start "rule__ProtoPart__Group__1__Impl"
    // InternalPubProto.g:3428:1: rule__ProtoPart__Group__1__Impl : ( 'Part' ) ;
    public final void rule__ProtoPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3432:1: ( ( 'Part' ) )
            // InternalPubProto.g:3433:1: ( 'Part' )
            {
            // InternalPubProto.g:3433:1: ( 'Part' )
            // InternalPubProto.g:3434:2: 'Part'
            {
             before(grammarAccess.getProtoPartAccess().getPartKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getProtoPartAccess().getPartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__1__Impl"


    // $ANTLR start "rule__ProtoPart__Group__2"
    // InternalPubProto.g:3443:1: rule__ProtoPart__Group__2 : rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3 ;
    public final void rule__ProtoPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3447:1: ( rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3 )
            // InternalPubProto.g:3448:2: rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoPart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__2"


    // $ANTLR start "rule__ProtoPart__Group__2__Impl"
    // InternalPubProto.g:3455:1: rule__ProtoPart__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3459:1: ( ( '{' ) )
            // InternalPubProto.g:3460:1: ( '{' )
            {
            // InternalPubProto.g:3460:1: ( '{' )
            // InternalPubProto.g:3461:2: '{'
            {
             before(grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__2__Impl"


    // $ANTLR start "rule__ProtoPart__Group__3"
    // InternalPubProto.g:3470:1: rule__ProtoPart__Group__3 : rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4 ;
    public final void rule__ProtoPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3474:1: ( rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4 )
            // InternalPubProto.g:3475:2: rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoPart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__3"


    // $ANTLR start "rule__ProtoPart__Group__3__Impl"
    // InternalPubProto.g:3482:1: rule__ProtoPart__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3486:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3487:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3487:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3488:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoPartAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoPartAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__3__Impl"


    // $ANTLR start "rule__ProtoPart__Group__4"
    // InternalPubProto.g:3497:1: rule__ProtoPart__Group__4 : rule__ProtoPart__Group__4__Impl ;
    public final void rule__ProtoPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3501:1: ( rule__ProtoPart__Group__4__Impl )
            // InternalPubProto.g:3502:2: rule__ProtoPart__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoPart__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__4"


    // $ANTLR start "rule__ProtoPart__Group__4__Impl"
    // InternalPubProto.g:3508:1: rule__ProtoPart__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3512:1: ( ( '}' ) )
            // InternalPubProto.g:3513:1: ( '}' )
            {
            // InternalPubProto.g:3513:1: ( '}' )
            // InternalPubProto.g:3514:2: '}'
            {
             before(grammarAccess.getProtoPartAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoPartAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPart__Group__4__Impl"


    // $ANTLR start "rule__ProtoAppendix__Group__0"
    // InternalPubProto.g:3524:1: rule__ProtoAppendix__Group__0 : rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1 ;
    public final void rule__ProtoAppendix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3528:1: ( rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1 )
            // InternalPubProto.g:3529:2: rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ProtoAppendix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__0"


    // $ANTLR start "rule__ProtoAppendix__Group__0__Impl"
    // InternalPubProto.g:3536:1: rule__ProtoAppendix__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAppendix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3540:1: ( ( () ) )
            // InternalPubProto.g:3541:1: ( () )
            {
            // InternalPubProto.g:3541:1: ( () )
            // InternalPubProto.g:3542:2: ()
            {
             before(grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0()); 
            // InternalPubProto.g:3543:2: ()
            // InternalPubProto.g:3543:3: 
            {
            }

             after(grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__0__Impl"


    // $ANTLR start "rule__ProtoAppendix__Group__1"
    // InternalPubProto.g:3551:1: rule__ProtoAppendix__Group__1 : rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2 ;
    public final void rule__ProtoAppendix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3555:1: ( rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2 )
            // InternalPubProto.g:3556:2: rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoAppendix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__1"


    // $ANTLR start "rule__ProtoAppendix__Group__1__Impl"
    // InternalPubProto.g:3563:1: rule__ProtoAppendix__Group__1__Impl : ( 'Appendix' ) ;
    public final void rule__ProtoAppendix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3567:1: ( ( 'Appendix' ) )
            // InternalPubProto.g:3568:1: ( 'Appendix' )
            {
            // InternalPubProto.g:3568:1: ( 'Appendix' )
            // InternalPubProto.g:3569:2: 'Appendix'
            {
             before(grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__1__Impl"


    // $ANTLR start "rule__ProtoAppendix__Group__2"
    // InternalPubProto.g:3578:1: rule__ProtoAppendix__Group__2 : rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3 ;
    public final void rule__ProtoAppendix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3582:1: ( rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3 )
            // InternalPubProto.g:3583:2: rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoAppendix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__2"


    // $ANTLR start "rule__ProtoAppendix__Group__2__Impl"
    // InternalPubProto.g:3590:1: rule__ProtoAppendix__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAppendix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3594:1: ( ( '{' ) )
            // InternalPubProto.g:3595:1: ( '{' )
            {
            // InternalPubProto.g:3595:1: ( '{' )
            // InternalPubProto.g:3596:2: '{'
            {
             before(grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__2__Impl"


    // $ANTLR start "rule__ProtoAppendix__Group__3"
    // InternalPubProto.g:3605:1: rule__ProtoAppendix__Group__3 : rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4 ;
    public final void rule__ProtoAppendix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3609:1: ( rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4 )
            // InternalPubProto.g:3610:2: rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoAppendix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__3"


    // $ANTLR start "rule__ProtoAppendix__Group__3__Impl"
    // InternalPubProto.g:3617:1: rule__ProtoAppendix__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoAppendix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3621:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3622:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3622:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3623:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoAppendixAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoAppendixAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__3__Impl"


    // $ANTLR start "rule__ProtoAppendix__Group__4"
    // InternalPubProto.g:3632:1: rule__ProtoAppendix__Group__4 : rule__ProtoAppendix__Group__4__Impl ;
    public final void rule__ProtoAppendix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3636:1: ( rule__ProtoAppendix__Group__4__Impl )
            // InternalPubProto.g:3637:2: rule__ProtoAppendix__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoAppendix__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__4"


    // $ANTLR start "rule__ProtoAppendix__Group__4__Impl"
    // InternalPubProto.g:3643:1: rule__ProtoAppendix__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAppendix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3647:1: ( ( '}' ) )
            // InternalPubProto.g:3648:1: ( '}' )
            {
            // InternalPubProto.g:3648:1: ( '}' )
            // InternalPubProto.g:3649:2: '}'
            {
             before(grammarAccess.getProtoAppendixAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoAppendixAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoAppendix__Group__4__Impl"


    // $ANTLR start "rule__ProtoChapter__Group__0"
    // InternalPubProto.g:3659:1: rule__ProtoChapter__Group__0 : rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1 ;
    public final void rule__ProtoChapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3663:1: ( rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1 )
            // InternalPubProto.g:3664:2: rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ProtoChapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__0"


    // $ANTLR start "rule__ProtoChapter__Group__0__Impl"
    // InternalPubProto.g:3671:1: rule__ProtoChapter__Group__0__Impl : ( () ) ;
    public final void rule__ProtoChapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3675:1: ( ( () ) )
            // InternalPubProto.g:3676:1: ( () )
            {
            // InternalPubProto.g:3676:1: ( () )
            // InternalPubProto.g:3677:2: ()
            {
             before(grammarAccess.getProtoChapterAccess().getProtoChapterAction_0()); 
            // InternalPubProto.g:3678:2: ()
            // InternalPubProto.g:3678:3: 
            {
            }

             after(grammarAccess.getProtoChapterAccess().getProtoChapterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__0__Impl"


    // $ANTLR start "rule__ProtoChapter__Group__1"
    // InternalPubProto.g:3686:1: rule__ProtoChapter__Group__1 : rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2 ;
    public final void rule__ProtoChapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3690:1: ( rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2 )
            // InternalPubProto.g:3691:2: rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoChapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__1"


    // $ANTLR start "rule__ProtoChapter__Group__1__Impl"
    // InternalPubProto.g:3698:1: rule__ProtoChapter__Group__1__Impl : ( 'Chapter' ) ;
    public final void rule__ProtoChapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3702:1: ( ( 'Chapter' ) )
            // InternalPubProto.g:3703:1: ( 'Chapter' )
            {
            // InternalPubProto.g:3703:1: ( 'Chapter' )
            // InternalPubProto.g:3704:2: 'Chapter'
            {
             before(grammarAccess.getProtoChapterAccess().getChapterKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getProtoChapterAccess().getChapterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__1__Impl"


    // $ANTLR start "rule__ProtoChapter__Group__2"
    // InternalPubProto.g:3713:1: rule__ProtoChapter__Group__2 : rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3 ;
    public final void rule__ProtoChapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3717:1: ( rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3 )
            // InternalPubProto.g:3718:2: rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoChapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__2"


    // $ANTLR start "rule__ProtoChapter__Group__2__Impl"
    // InternalPubProto.g:3725:1: rule__ProtoChapter__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoChapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3729:1: ( ( '{' ) )
            // InternalPubProto.g:3730:1: ( '{' )
            {
            // InternalPubProto.g:3730:1: ( '{' )
            // InternalPubProto.g:3731:2: '{'
            {
             before(grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__2__Impl"


    // $ANTLR start "rule__ProtoChapter__Group__3"
    // InternalPubProto.g:3740:1: rule__ProtoChapter__Group__3 : rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4 ;
    public final void rule__ProtoChapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3744:1: ( rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4 )
            // InternalPubProto.g:3745:2: rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoChapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__3"


    // $ANTLR start "rule__ProtoChapter__Group__3__Impl"
    // InternalPubProto.g:3752:1: rule__ProtoChapter__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoChapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3756:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3757:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3757:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3758:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoChapterAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoChapterAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__3__Impl"


    // $ANTLR start "rule__ProtoChapter__Group__4"
    // InternalPubProto.g:3767:1: rule__ProtoChapter__Group__4 : rule__ProtoChapter__Group__4__Impl ;
    public final void rule__ProtoChapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3771:1: ( rule__ProtoChapter__Group__4__Impl )
            // InternalPubProto.g:3772:2: rule__ProtoChapter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoChapter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__4"


    // $ANTLR start "rule__ProtoChapter__Group__4__Impl"
    // InternalPubProto.g:3778:1: rule__ProtoChapter__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoChapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3782:1: ( ( '}' ) )
            // InternalPubProto.g:3783:1: ( '}' )
            {
            // InternalPubProto.g:3783:1: ( '}' )
            // InternalPubProto.g:3784:2: '}'
            {
             before(grammarAccess.getProtoChapterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoChapterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoChapter__Group__4__Impl"


    // $ANTLR start "rule__ProtoSection__Group__0"
    // InternalPubProto.g:3794:1: rule__ProtoSection__Group__0 : rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1 ;
    public final void rule__ProtoSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3798:1: ( rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1 )
            // InternalPubProto.g:3799:2: rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ProtoSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__0"


    // $ANTLR start "rule__ProtoSection__Group__0__Impl"
    // InternalPubProto.g:3806:1: rule__ProtoSection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3810:1: ( ( () ) )
            // InternalPubProto.g:3811:1: ( () )
            {
            // InternalPubProto.g:3811:1: ( () )
            // InternalPubProto.g:3812:2: ()
            {
             before(grammarAccess.getProtoSectionAccess().getProtoSectionAction_0()); 
            // InternalPubProto.g:3813:2: ()
            // InternalPubProto.g:3813:3: 
            {
            }

             after(grammarAccess.getProtoSectionAccess().getProtoSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__0__Impl"


    // $ANTLR start "rule__ProtoSection__Group__1"
    // InternalPubProto.g:3821:1: rule__ProtoSection__Group__1 : rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2 ;
    public final void rule__ProtoSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3825:1: ( rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2 )
            // InternalPubProto.g:3826:2: rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__1"


    // $ANTLR start "rule__ProtoSection__Group__1__Impl"
    // InternalPubProto.g:3833:1: rule__ProtoSection__Group__1__Impl : ( 'Section' ) ;
    public final void rule__ProtoSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3837:1: ( ( 'Section' ) )
            // InternalPubProto.g:3838:1: ( 'Section' )
            {
            // InternalPubProto.g:3838:1: ( 'Section' )
            // InternalPubProto.g:3839:2: 'Section'
            {
             before(grammarAccess.getProtoSectionAccess().getSectionKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getProtoSectionAccess().getSectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__1__Impl"


    // $ANTLR start "rule__ProtoSection__Group__2"
    // InternalPubProto.g:3848:1: rule__ProtoSection__Group__2 : rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3 ;
    public final void rule__ProtoSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3852:1: ( rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3 )
            // InternalPubProto.g:3853:2: rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__2"


    // $ANTLR start "rule__ProtoSection__Group__2__Impl"
    // InternalPubProto.g:3860:1: rule__ProtoSection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3864:1: ( ( '{' ) )
            // InternalPubProto.g:3865:1: ( '{' )
            {
            // InternalPubProto.g:3865:1: ( '{' )
            // InternalPubProto.g:3866:2: '{'
            {
             before(grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__2__Impl"


    // $ANTLR start "rule__ProtoSection__Group__3"
    // InternalPubProto.g:3875:1: rule__ProtoSection__Group__3 : rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4 ;
    public final void rule__ProtoSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3879:1: ( rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4 )
            // InternalPubProto.g:3880:2: rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__3"


    // $ANTLR start "rule__ProtoSection__Group__3__Impl"
    // InternalPubProto.g:3887:1: rule__ProtoSection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3891:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3892:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3892:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3893:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoSectionAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoSectionAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__3__Impl"


    // $ANTLR start "rule__ProtoSection__Group__4"
    // InternalPubProto.g:3902:1: rule__ProtoSection__Group__4 : rule__ProtoSection__Group__4__Impl ;
    public final void rule__ProtoSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3906:1: ( rule__ProtoSection__Group__4__Impl )
            // InternalPubProto.g:3907:2: rule__ProtoSection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__4"


    // $ANTLR start "rule__ProtoSection__Group__4__Impl"
    // InternalPubProto.g:3913:1: rule__ProtoSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3917:1: ( ( '}' ) )
            // InternalPubProto.g:3918:1: ( '}' )
            {
            // InternalPubProto.g:3918:1: ( '}' )
            // InternalPubProto.g:3919:2: '}'
            {
             before(grammarAccess.getProtoSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSection__Group__4__Impl"


    // $ANTLR start "rule__ProtoSubsection__Group__0"
    // InternalPubProto.g:3929:1: rule__ProtoSubsection__Group__0 : rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1 ;
    public final void rule__ProtoSubsection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3933:1: ( rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1 )
            // InternalPubProto.g:3934:2: rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ProtoSubsection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__0"


    // $ANTLR start "rule__ProtoSubsection__Group__0__Impl"
    // InternalPubProto.g:3941:1: rule__ProtoSubsection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSubsection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3945:1: ( ( () ) )
            // InternalPubProto.g:3946:1: ( () )
            {
            // InternalPubProto.g:3946:1: ( () )
            // InternalPubProto.g:3947:2: ()
            {
             before(grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0()); 
            // InternalPubProto.g:3948:2: ()
            // InternalPubProto.g:3948:3: 
            {
            }

             after(grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__0__Impl"


    // $ANTLR start "rule__ProtoSubsection__Group__1"
    // InternalPubProto.g:3956:1: rule__ProtoSubsection__Group__1 : rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2 ;
    public final void rule__ProtoSubsection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3960:1: ( rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2 )
            // InternalPubProto.g:3961:2: rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoSubsection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__1"


    // $ANTLR start "rule__ProtoSubsection__Group__1__Impl"
    // InternalPubProto.g:3968:1: rule__ProtoSubsection__Group__1__Impl : ( 'Sub' ) ;
    public final void rule__ProtoSubsection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3972:1: ( ( 'Sub' ) )
            // InternalPubProto.g:3973:1: ( 'Sub' )
            {
            // InternalPubProto.g:3973:1: ( 'Sub' )
            // InternalPubProto.g:3974:2: 'Sub'
            {
             before(grammarAccess.getProtoSubsectionAccess().getSubKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getProtoSubsectionAccess().getSubKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__1__Impl"


    // $ANTLR start "rule__ProtoSubsection__Group__2"
    // InternalPubProto.g:3983:1: rule__ProtoSubsection__Group__2 : rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3 ;
    public final void rule__ProtoSubsection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3987:1: ( rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3 )
            // InternalPubProto.g:3988:2: rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoSubsection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__2"


    // $ANTLR start "rule__ProtoSubsection__Group__2__Impl"
    // InternalPubProto.g:3995:1: rule__ProtoSubsection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSubsection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3999:1: ( ( '{' ) )
            // InternalPubProto.g:4000:1: ( '{' )
            {
            // InternalPubProto.g:4000:1: ( '{' )
            // InternalPubProto.g:4001:2: '{'
            {
             before(grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__2__Impl"


    // $ANTLR start "rule__ProtoSubsection__Group__3"
    // InternalPubProto.g:4010:1: rule__ProtoSubsection__Group__3 : rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4 ;
    public final void rule__ProtoSubsection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4014:1: ( rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4 )
            // InternalPubProto.g:4015:2: rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoSubsection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__3"


    // $ANTLR start "rule__ProtoSubsection__Group__3__Impl"
    // InternalPubProto.g:4022:1: rule__ProtoSubsection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSubsection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4026:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:4027:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:4027:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:4028:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoSubsectionAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoSubsectionAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__3__Impl"


    // $ANTLR start "rule__ProtoSubsection__Group__4"
    // InternalPubProto.g:4037:1: rule__ProtoSubsection__Group__4 : rule__ProtoSubsection__Group__4__Impl ;
    public final void rule__ProtoSubsection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4041:1: ( rule__ProtoSubsection__Group__4__Impl )
            // InternalPubProto.g:4042:2: rule__ProtoSubsection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSubsection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__4"


    // $ANTLR start "rule__ProtoSubsection__Group__4__Impl"
    // InternalPubProto.g:4048:1: rule__ProtoSubsection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSubsection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4052:1: ( ( '}' ) )
            // InternalPubProto.g:4053:1: ( '}' )
            {
            // InternalPubProto.g:4053:1: ( '}' )
            // InternalPubProto.g:4054:2: '}'
            {
             before(grammarAccess.getProtoSubsectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoSubsectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsection__Group__4__Impl"


    // $ANTLR start "rule__ProtoSubsubsection__Group__0"
    // InternalPubProto.g:4064:1: rule__ProtoSubsubsection__Group__0 : rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1 ;
    public final void rule__ProtoSubsubsection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4068:1: ( rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1 )
            // InternalPubProto.g:4069:2: rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ProtoSubsubsection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__0"


    // $ANTLR start "rule__ProtoSubsubsection__Group__0__Impl"
    // InternalPubProto.g:4076:1: rule__ProtoSubsubsection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSubsubsection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4080:1: ( ( () ) )
            // InternalPubProto.g:4081:1: ( () )
            {
            // InternalPubProto.g:4081:1: ( () )
            // InternalPubProto.g:4082:2: ()
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0()); 
            // InternalPubProto.g:4083:2: ()
            // InternalPubProto.g:4083:3: 
            {
            }

             after(grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__0__Impl"


    // $ANTLR start "rule__ProtoSubsubsection__Group__1"
    // InternalPubProto.g:4091:1: rule__ProtoSubsubsection__Group__1 : rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2 ;
    public final void rule__ProtoSubsubsection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4095:1: ( rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2 )
            // InternalPubProto.g:4096:2: rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ProtoSubsubsection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__1"


    // $ANTLR start "rule__ProtoSubsubsection__Group__1__Impl"
    // InternalPubProto.g:4103:1: rule__ProtoSubsubsection__Group__1__Impl : ( 'Subsub' ) ;
    public final void rule__ProtoSubsubsection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4107:1: ( ( 'Subsub' ) )
            // InternalPubProto.g:4108:1: ( 'Subsub' )
            {
            // InternalPubProto.g:4108:1: ( 'Subsub' )
            // InternalPubProto.g:4109:2: 'Subsub'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__1__Impl"


    // $ANTLR start "rule__ProtoSubsubsection__Group__2"
    // InternalPubProto.g:4118:1: rule__ProtoSubsubsection__Group__2 : rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3 ;
    public final void rule__ProtoSubsubsection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4122:1: ( rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3 )
            // InternalPubProto.g:4123:2: rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ProtoSubsubsection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__2"


    // $ANTLR start "rule__ProtoSubsubsection__Group__2__Impl"
    // InternalPubProto.g:4130:1: rule__ProtoSubsubsection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSubsubsection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4134:1: ( ( '{' ) )
            // InternalPubProto.g:4135:1: ( '{' )
            {
            // InternalPubProto.g:4135:1: ( '{' )
            // InternalPubProto.g:4136:2: '{'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__2__Impl"


    // $ANTLR start "rule__ProtoSubsubsection__Group__3"
    // InternalPubProto.g:4145:1: rule__ProtoSubsubsection__Group__3 : rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4 ;
    public final void rule__ProtoSubsubsection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4149:1: ( rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4 )
            // InternalPubProto.g:4150:2: rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ProtoSubsubsection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__3"


    // $ANTLR start "rule__ProtoSubsubsection__Group__3__Impl"
    // InternalPubProto.g:4157:1: rule__ProtoSubsubsection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSubsubsection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4161:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:4162:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:4162:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:4163:2: ruleProtoDivisionBody
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getProtoDivisionBodyParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivisionBody();

            state._fsp--;

             after(grammarAccess.getProtoSubsubsectionAccess().getProtoDivisionBodyParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__3__Impl"


    // $ANTLR start "rule__ProtoSubsubsection__Group__4"
    // InternalPubProto.g:4172:1: rule__ProtoSubsubsection__Group__4 : rule__ProtoSubsubsection__Group__4__Impl ;
    public final void rule__ProtoSubsubsection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4176:1: ( rule__ProtoSubsubsection__Group__4__Impl )
            // InternalPubProto.g:4177:2: rule__ProtoSubsubsection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtoSubsubsection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__4"


    // $ANTLR start "rule__ProtoSubsubsection__Group__4__Impl"
    // InternalPubProto.g:4183:1: rule__ProtoSubsubsection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSubsubsection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4187:1: ( ( '}' ) )
            // InternalPubProto.g:4188:1: ( '}' )
            {
            // InternalPubProto.g:4188:1: ( '}' )
            // InternalPubProto.g:4189:2: '}'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProtoSubsubsectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoSubsubsection__Group__4__Impl"


    // $ANTLR start "rule__PublicationClass__NameAssignment_3"
    // InternalPubProto.g:4199:1: rule__PublicationClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PublicationClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4203:1: ( ( RULE_ID ) )
            // InternalPubProto.g:4204:2: ( RULE_ID )
            {
            // InternalPubProto.g:4204:2: ( RULE_ID )
            // InternalPubProto.g:4205:3: RULE_ID
            {
             before(grammarAccess.getPublicationClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__NameAssignment_3"


    // $ANTLR start "rule__PublicationClass__TitleAssignment_4_1"
    // InternalPubProto.g:4214:1: rule__PublicationClass__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__PublicationClass__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4218:1: ( ( RULE_STRING ) )
            // InternalPubProto.g:4219:2: ( RULE_STRING )
            {
            // InternalPubProto.g:4219:2: ( RULE_STRING )
            // InternalPubProto.g:4220:3: RULE_STRING
            {
             before(grammarAccess.getPublicationClassAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__TitleAssignment_4_1"


    // $ANTLR start "rule__PublicationClass__NatureAssignment_6"
    // InternalPubProto.g:4229:1: rule__PublicationClass__NatureAssignment_6 : ( rulePublicationNature ) ;
    public final void rule__PublicationClass__NatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4233:1: ( ( rulePublicationNature ) )
            // InternalPubProto.g:4234:2: ( rulePublicationNature )
            {
            // InternalPubProto.g:4234:2: ( rulePublicationNature )
            // InternalPubProto.g:4235:3: rulePublicationNature
            {
             before(grammarAccess.getPublicationClassAccess().getNaturePublicationNatureEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePublicationNature();

            state._fsp--;

             after(grammarAccess.getPublicationClassAccess().getNaturePublicationNatureEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__NatureAssignment_6"


    // $ANTLR start "rule__PublicationClass__SymbolsAssignment_7_1"
    // InternalPubProto.g:4244:1: rule__PublicationClass__SymbolsAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__PublicationClass__SymbolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4248:1: ( ( RULE_ID ) )
            // InternalPubProto.g:4249:2: ( RULE_ID )
            {
            // InternalPubProto.g:4249:2: ( RULE_ID )
            // InternalPubProto.g:4250:3: RULE_ID
            {
             before(grammarAccess.getPublicationClassAccess().getSymbolsIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getSymbolsIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__SymbolsAssignment_7_1"


    // $ANTLR start "rule__PublicationClass__SegmentsAssignment_9"
    // InternalPubProto.g:4259:1: rule__PublicationClass__SegmentsAssignment_9 : ( ruleProtoDocumentSegment ) ;
    public final void rule__PublicationClass__SegmentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4263:1: ( ( ruleProtoDocumentSegment ) )
            // InternalPubProto.g:4264:2: ( ruleProtoDocumentSegment )
            {
            // InternalPubProto.g:4264:2: ( ruleProtoDocumentSegment )
            // InternalPubProto.g:4265:3: ruleProtoDocumentSegment
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleProtoDocumentSegment();

            state._fsp--;

             after(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__SegmentsAssignment_9"


    // $ANTLR start "rule__PublicationClass__DivisionsAssignment_11"
    // InternalPubProto.g:4274:1: rule__PublicationClass__DivisionsAssignment_11 : ( ruleProtoDivision ) ;
    public final void rule__PublicationClass__DivisionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4278:1: ( ( ruleProtoDivision ) )
            // InternalPubProto.g:4279:2: ( ruleProtoDivision )
            {
            // InternalPubProto.g:4279:2: ( ruleProtoDivision )
            // InternalPubProto.g:4280:3: ruleProtoDivision
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivision();

            state._fsp--;

             after(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicationClass__DivisionsAssignment_11"


    // $ANTLR start "rule__SegmentBody__TitleAssignment_0_1"
    // InternalPubProto.g:4289:1: rule__SegmentBody__TitleAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__SegmentBody__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4293:1: ( ( RULE_STRING ) )
            // InternalPubProto.g:4294:2: ( RULE_STRING )
            {
            // InternalPubProto.g:4294:2: ( RULE_STRING )
            // InternalPubProto.g:4295:3: RULE_STRING
            {
             before(grammarAccess.getSegmentBodyAccess().getTitleSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSegmentBodyAccess().getTitleSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__TitleAssignment_0_1"


    // $ANTLR start "rule__SegmentBody__OptionalAssignment_1_1_0"
    // InternalPubProto.g:4304:1: rule__SegmentBody__OptionalAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__SegmentBody__OptionalAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4308:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4309:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4309:2: ( ( 'true' ) )
            // InternalPubProto.g:4310:3: ( 'true' )
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 
            // InternalPubProto.g:4311:3: ( 'true' )
            // InternalPubProto.g:4312:4: 'true'
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 

            }

             after(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentBody__OptionalAssignment_1_1_0"


    // $ANTLR start "rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0"
    // InternalPubProto.g:4323:1: rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4327:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4328:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4328:2: ( ( 'true' ) )
            // InternalPubProto.g:4329:3: ( 'true' )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 
            // InternalPubProto.g:4330:3: ( 'true' )
            // InternalPubProto.g:4331:4: 'true'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0"


    // $ANTLR start "rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0"
    // InternalPubProto.g:4342:1: rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4346:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4347:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4347:2: ( ( 'true' ) )
            // InternalPubProto.g:4348:3: ( 'true' )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 
            // InternalPubProto.g:4349:3: ( 'true' )
            // InternalPubProto.g:4350:4: 'true'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 

            }

             after(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0"


    // $ANTLR start "rule__ProtoTOC__MaxLevelAssignment_4_1"
    // InternalPubProto.g:4361:1: rule__ProtoTOC__MaxLevelAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ProtoTOC__MaxLevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4365:1: ( ( RULE_INT ) )
            // InternalPubProto.g:4366:2: ( RULE_INT )
            {
            // InternalPubProto.g:4366:2: ( RULE_INT )
            // InternalPubProto.g:4367:3: RULE_INT
            {
             before(grammarAccess.getProtoTOCAccess().getMaxLevelINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProtoTOCAccess().getMaxLevelINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoTOC__MaxLevelAssignment_4_1"


    // $ANTLR start "rule__ProtoDivisionBody__NumberingStyleAssignment_1"
    // InternalPubProto.g:4376:1: rule__ProtoDivisionBody__NumberingStyleAssignment_1 : ( ruleProtoSequenceNumberStyle ) ;
    public final void rule__ProtoDivisionBody__NumberingStyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4380:1: ( ( ruleProtoSequenceNumberStyle ) )
            // InternalPubProto.g:4381:2: ( ruleProtoSequenceNumberStyle )
            {
            // InternalPubProto.g:4381:2: ( ruleProtoSequenceNumberStyle )
            // InternalPubProto.g:4382:3: ruleProtoSequenceNumberStyle
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleProtoSequenceNumberStyleEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtoSequenceNumberStyle();

            state._fsp--;

             after(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleProtoSequenceNumberStyleEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtoDivisionBody__NumberingStyleAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00001FB391000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001FB390000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000FC00000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001FB390000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});

}