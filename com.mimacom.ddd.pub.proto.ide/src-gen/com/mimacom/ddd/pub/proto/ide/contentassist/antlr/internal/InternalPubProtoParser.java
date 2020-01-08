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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'Print'", "'Web'", "'arabic'", "'capitalLetter'", "'smallLetter'", "'capitalRoman'", "'smallRoman'", "'none'", "'publication'", "'class'", "'nature:'", "'segments:'", "'divisions:'", "'title:'", "'optional:'", "'Abstract'", "'{'", "'}'", "'Preface'", "'Epilogue'", "'Body'", "'parts:'", "'appendix:'", "'ChangeHistory'", "'TableOfContents'", "'maxLevel:'", "'Abbreviations'", "'ListOfTables'", "'ListOfFigures'", "'Bibliography'", "'Glossary'", "'Index'", "'numbering:'", "'Part'", "'Appendix'", "'Chapter'", "'Section'", "'Sub'", "'Subsub'", "'true'"
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

            if ( (LA1_0==44) ) {
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
            case 27:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 38:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 41:
                {
                alt2=10;
                }
                break;
            case 42:
                {
                alt2=11;
                }
                break;
            case 43:
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

            if ( (LA3_0==51) ) {
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

            if ( (LA4_0==51) ) {
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

            if ( (LA5_0==51) ) {
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
            case 45:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 47:
                {
                alt6=3;
                }
                break;
            case 48:
                {
                alt6=4;
                }
                break;
            case 49:
                {
                alt6=5;
                }
                break;
            case 50:
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
            pushFollow(FOLLOW_9);
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
    // InternalPubProto.g:1099:1: rule__PublicationClass__Group__7__Impl : ( 'segments:' ) ;
    public final void rule__PublicationClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1103:1: ( ( 'segments:' ) )
            // InternalPubProto.g:1104:1: ( 'segments:' )
            {
            // InternalPubProto.g:1104:1: ( 'segments:' )
            // InternalPubProto.g:1105:2: 'segments:'
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getSegmentsKeyword_7()); 

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
    // InternalPubProto.g:1126:1: rule__PublicationClass__Group__8__Impl : ( ( rule__PublicationClass__SegmentsAssignment_8 )* ) ;
    public final void rule__PublicationClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1130:1: ( ( ( rule__PublicationClass__SegmentsAssignment_8 )* ) )
            // InternalPubProto.g:1131:1: ( ( rule__PublicationClass__SegmentsAssignment_8 )* )
            {
            // InternalPubProto.g:1131:1: ( ( rule__PublicationClass__SegmentsAssignment_8 )* )
            // InternalPubProto.g:1132:2: ( rule__PublicationClass__SegmentsAssignment_8 )*
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsAssignment_8()); 
            // InternalPubProto.g:1133:2: ( rule__PublicationClass__SegmentsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||(LA10_0>=30 && LA10_0<=32)||(LA10_0>=35 && LA10_0<=36)||(LA10_0>=38 && LA10_0<=43)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPubProto.g:1133:3: rule__PublicationClass__SegmentsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PublicationClass__SegmentsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPublicationClassAccess().getSegmentsAssignment_8()); 

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
            pushFollow(FOLLOW_11);
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
    // InternalPubProto.g:1153:1: rule__PublicationClass__Group__9__Impl : ( 'divisions:' ) ;
    public final void rule__PublicationClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1157:1: ( ( 'divisions:' ) )
            // InternalPubProto.g:1158:1: ( 'divisions:' )
            {
            // InternalPubProto.g:1158:1: ( 'divisions:' )
            // InternalPubProto.g:1159:2: 'divisions:'
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPublicationClassAccess().getDivisionsKeyword_9()); 

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
    // InternalPubProto.g:1168:1: rule__PublicationClass__Group__10 : rule__PublicationClass__Group__10__Impl ;
    public final void rule__PublicationClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1172:1: ( rule__PublicationClass__Group__10__Impl )
            // InternalPubProto.g:1173:2: rule__PublicationClass__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicationClass__Group__10__Impl();

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
    // InternalPubProto.g:1179:1: rule__PublicationClass__Group__10__Impl : ( ( rule__PublicationClass__DivisionsAssignment_10 )* ) ;
    public final void rule__PublicationClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1183:1: ( ( ( rule__PublicationClass__DivisionsAssignment_10 )* ) )
            // InternalPubProto.g:1184:1: ( ( rule__PublicationClass__DivisionsAssignment_10 )* )
            {
            // InternalPubProto.g:1184:1: ( ( rule__PublicationClass__DivisionsAssignment_10 )* )
            // InternalPubProto.g:1185:2: ( rule__PublicationClass__DivisionsAssignment_10 )*
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsAssignment_10()); 
            // InternalPubProto.g:1186:2: ( rule__PublicationClass__DivisionsAssignment_10 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=45 && LA11_0<=50)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPubProto.g:1186:3: rule__PublicationClass__DivisionsAssignment_10
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PublicationClass__DivisionsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPublicationClassAccess().getDivisionsAssignment_10()); 

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


    // $ANTLR start "rule__PublicationClass__Group_4__0"
    // InternalPubProto.g:1195:1: rule__PublicationClass__Group_4__0 : rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1 ;
    public final void rule__PublicationClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1199:1: ( rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1 )
            // InternalPubProto.g:1200:2: rule__PublicationClass__Group_4__0__Impl rule__PublicationClass__Group_4__1
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
    // InternalPubProto.g:1207:1: rule__PublicationClass__Group_4__0__Impl : ( 'title:' ) ;
    public final void rule__PublicationClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1211:1: ( ( 'title:' ) )
            // InternalPubProto.g:1212:1: ( 'title:' )
            {
            // InternalPubProto.g:1212:1: ( 'title:' )
            // InternalPubProto.g:1213:2: 'title:'
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
    // InternalPubProto.g:1222:1: rule__PublicationClass__Group_4__1 : rule__PublicationClass__Group_4__1__Impl ;
    public final void rule__PublicationClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1226:1: ( rule__PublicationClass__Group_4__1__Impl )
            // InternalPubProto.g:1227:2: rule__PublicationClass__Group_4__1__Impl
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
    // InternalPubProto.g:1233:1: rule__PublicationClass__Group_4__1__Impl : ( ( rule__PublicationClass__TitleAssignment_4_1 ) ) ;
    public final void rule__PublicationClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1237:1: ( ( ( rule__PublicationClass__TitleAssignment_4_1 ) ) )
            // InternalPubProto.g:1238:1: ( ( rule__PublicationClass__TitleAssignment_4_1 ) )
            {
            // InternalPubProto.g:1238:1: ( ( rule__PublicationClass__TitleAssignment_4_1 ) )
            // InternalPubProto.g:1239:2: ( rule__PublicationClass__TitleAssignment_4_1 )
            {
             before(grammarAccess.getPublicationClassAccess().getTitleAssignment_4_1()); 
            // InternalPubProto.g:1240:2: ( rule__PublicationClass__TitleAssignment_4_1 )
            // InternalPubProto.g:1240:3: rule__PublicationClass__TitleAssignment_4_1
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


    // $ANTLR start "rule__SegmentBody__Group__0"
    // InternalPubProto.g:1249:1: rule__SegmentBody__Group__0 : rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1 ;
    public final void rule__SegmentBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1253:1: ( rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1 )
            // InternalPubProto.g:1254:2: rule__SegmentBody__Group__0__Impl rule__SegmentBody__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPubProto.g:1261:1: rule__SegmentBody__Group__0__Impl : ( ( rule__SegmentBody__Group_0__0 )? ) ;
    public final void rule__SegmentBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1265:1: ( ( ( rule__SegmentBody__Group_0__0 )? ) )
            // InternalPubProto.g:1266:1: ( ( rule__SegmentBody__Group_0__0 )? )
            {
            // InternalPubProto.g:1266:1: ( ( rule__SegmentBody__Group_0__0 )? )
            // InternalPubProto.g:1267:2: ( rule__SegmentBody__Group_0__0 )?
            {
             before(grammarAccess.getSegmentBodyAccess().getGroup_0()); 
            // InternalPubProto.g:1268:2: ( rule__SegmentBody__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPubProto.g:1268:3: rule__SegmentBody__Group_0__0
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
    // InternalPubProto.g:1276:1: rule__SegmentBody__Group__1 : rule__SegmentBody__Group__1__Impl ;
    public final void rule__SegmentBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1280:1: ( rule__SegmentBody__Group__1__Impl )
            // InternalPubProto.g:1281:2: rule__SegmentBody__Group__1__Impl
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
    // InternalPubProto.g:1287:1: rule__SegmentBody__Group__1__Impl : ( ( rule__SegmentBody__Group_1__0 )? ) ;
    public final void rule__SegmentBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1291:1: ( ( ( rule__SegmentBody__Group_1__0 )? ) )
            // InternalPubProto.g:1292:1: ( ( rule__SegmentBody__Group_1__0 )? )
            {
            // InternalPubProto.g:1292:1: ( ( rule__SegmentBody__Group_1__0 )? )
            // InternalPubProto.g:1293:2: ( rule__SegmentBody__Group_1__0 )?
            {
             before(grammarAccess.getSegmentBodyAccess().getGroup_1()); 
            // InternalPubProto.g:1294:2: ( rule__SegmentBody__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPubProto.g:1294:3: rule__SegmentBody__Group_1__0
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
    // InternalPubProto.g:1303:1: rule__SegmentBody__Group_0__0 : rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1 ;
    public final void rule__SegmentBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1307:1: ( rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1 )
            // InternalPubProto.g:1308:2: rule__SegmentBody__Group_0__0__Impl rule__SegmentBody__Group_0__1
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
    // InternalPubProto.g:1315:1: rule__SegmentBody__Group_0__0__Impl : ( 'title:' ) ;
    public final void rule__SegmentBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1319:1: ( ( 'title:' ) )
            // InternalPubProto.g:1320:1: ( 'title:' )
            {
            // InternalPubProto.g:1320:1: ( 'title:' )
            // InternalPubProto.g:1321:2: 'title:'
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
    // InternalPubProto.g:1330:1: rule__SegmentBody__Group_0__1 : rule__SegmentBody__Group_0__1__Impl ;
    public final void rule__SegmentBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1334:1: ( rule__SegmentBody__Group_0__1__Impl )
            // InternalPubProto.g:1335:2: rule__SegmentBody__Group_0__1__Impl
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
    // InternalPubProto.g:1341:1: rule__SegmentBody__Group_0__1__Impl : ( ( rule__SegmentBody__TitleAssignment_0_1 ) ) ;
    public final void rule__SegmentBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1345:1: ( ( ( rule__SegmentBody__TitleAssignment_0_1 ) ) )
            // InternalPubProto.g:1346:1: ( ( rule__SegmentBody__TitleAssignment_0_1 ) )
            {
            // InternalPubProto.g:1346:1: ( ( rule__SegmentBody__TitleAssignment_0_1 ) )
            // InternalPubProto.g:1347:2: ( rule__SegmentBody__TitleAssignment_0_1 )
            {
             before(grammarAccess.getSegmentBodyAccess().getTitleAssignment_0_1()); 
            // InternalPubProto.g:1348:2: ( rule__SegmentBody__TitleAssignment_0_1 )
            // InternalPubProto.g:1348:3: rule__SegmentBody__TitleAssignment_0_1
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
    // InternalPubProto.g:1357:1: rule__SegmentBody__Group_1__0 : rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1 ;
    public final void rule__SegmentBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1361:1: ( rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1 )
            // InternalPubProto.g:1362:2: rule__SegmentBody__Group_1__0__Impl rule__SegmentBody__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPubProto.g:1369:1: rule__SegmentBody__Group_1__0__Impl : ( 'optional:' ) ;
    public final void rule__SegmentBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1373:1: ( ( 'optional:' ) )
            // InternalPubProto.g:1374:1: ( 'optional:' )
            {
            // InternalPubProto.g:1374:1: ( 'optional:' )
            // InternalPubProto.g:1375:2: 'optional:'
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPubProto.g:1384:1: rule__SegmentBody__Group_1__1 : rule__SegmentBody__Group_1__1__Impl ;
    public final void rule__SegmentBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1388:1: ( rule__SegmentBody__Group_1__1__Impl )
            // InternalPubProto.g:1389:2: rule__SegmentBody__Group_1__1__Impl
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
    // InternalPubProto.g:1395:1: rule__SegmentBody__Group_1__1__Impl : ( ( rule__SegmentBody__Alternatives_1_1 ) ) ;
    public final void rule__SegmentBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1399:1: ( ( ( rule__SegmentBody__Alternatives_1_1 ) ) )
            // InternalPubProto.g:1400:1: ( ( rule__SegmentBody__Alternatives_1_1 ) )
            {
            // InternalPubProto.g:1400:1: ( ( rule__SegmentBody__Alternatives_1_1 ) )
            // InternalPubProto.g:1401:2: ( rule__SegmentBody__Alternatives_1_1 )
            {
             before(grammarAccess.getSegmentBodyAccess().getAlternatives_1_1()); 
            // InternalPubProto.g:1402:2: ( rule__SegmentBody__Alternatives_1_1 )
            // InternalPubProto.g:1402:3: rule__SegmentBody__Alternatives_1_1
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
    // InternalPubProto.g:1411:1: rule__ProtoAbstract__Group__0 : rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1 ;
    public final void rule__ProtoAbstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1415:1: ( rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1 )
            // InternalPubProto.g:1416:2: rule__ProtoAbstract__Group__0__Impl rule__ProtoAbstract__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPubProto.g:1423:1: rule__ProtoAbstract__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAbstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1427:1: ( ( () ) )
            // InternalPubProto.g:1428:1: ( () )
            {
            // InternalPubProto.g:1428:1: ( () )
            // InternalPubProto.g:1429:2: ()
            {
             before(grammarAccess.getProtoAbstractAccess().getProtoAbstractAction_0()); 
            // InternalPubProto.g:1430:2: ()
            // InternalPubProto.g:1430:3: 
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
    // InternalPubProto.g:1438:1: rule__ProtoAbstract__Group__1 : rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2 ;
    public final void rule__ProtoAbstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1442:1: ( rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2 )
            // InternalPubProto.g:1443:2: rule__ProtoAbstract__Group__1__Impl rule__ProtoAbstract__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:1450:1: rule__ProtoAbstract__Group__1__Impl : ( 'Abstract' ) ;
    public final void rule__ProtoAbstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1454:1: ( ( 'Abstract' ) )
            // InternalPubProto.g:1455:1: ( 'Abstract' )
            {
            // InternalPubProto.g:1455:1: ( 'Abstract' )
            // InternalPubProto.g:1456:2: 'Abstract'
            {
             before(grammarAccess.getProtoAbstractAccess().getAbstractKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPubProto.g:1465:1: rule__ProtoAbstract__Group__2 : rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3 ;
    public final void rule__ProtoAbstract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1469:1: ( rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3 )
            // InternalPubProto.g:1470:2: rule__ProtoAbstract__Group__2__Impl rule__ProtoAbstract__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:1477:1: rule__ProtoAbstract__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAbstract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1481:1: ( ( '{' ) )
            // InternalPubProto.g:1482:1: ( '{' )
            {
            // InternalPubProto.g:1482:1: ( '{' )
            // InternalPubProto.g:1483:2: '{'
            {
             before(grammarAccess.getProtoAbstractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:1492:1: rule__ProtoAbstract__Group__3 : rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4 ;
    public final void rule__ProtoAbstract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1496:1: ( rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4 )
            // InternalPubProto.g:1497:2: rule__ProtoAbstract__Group__3__Impl rule__ProtoAbstract__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:1504:1: rule__ProtoAbstract__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoAbstract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1508:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1509:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1509:1: ( ruleSegmentBody )
            // InternalPubProto.g:1510:2: ruleSegmentBody
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
    // InternalPubProto.g:1519:1: rule__ProtoAbstract__Group__4 : rule__ProtoAbstract__Group__4__Impl ;
    public final void rule__ProtoAbstract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1523:1: ( rule__ProtoAbstract__Group__4__Impl )
            // InternalPubProto.g:1524:2: rule__ProtoAbstract__Group__4__Impl
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
    // InternalPubProto.g:1530:1: rule__ProtoAbstract__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAbstract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1534:1: ( ( '}' ) )
            // InternalPubProto.g:1535:1: ( '}' )
            {
            // InternalPubProto.g:1535:1: ( '}' )
            // InternalPubProto.g:1536:2: '}'
            {
             before(grammarAccess.getProtoAbstractAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:1546:1: rule__ProtoPreface__Group__0 : rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1 ;
    public final void rule__ProtoPreface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1550:1: ( rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1 )
            // InternalPubProto.g:1551:2: rule__ProtoPreface__Group__0__Impl rule__ProtoPreface__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalPubProto.g:1558:1: rule__ProtoPreface__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPreface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1562:1: ( ( () ) )
            // InternalPubProto.g:1563:1: ( () )
            {
            // InternalPubProto.g:1563:1: ( () )
            // InternalPubProto.g:1564:2: ()
            {
             before(grammarAccess.getProtoPrefaceAccess().getProtoPrefaceAction_0()); 
            // InternalPubProto.g:1565:2: ()
            // InternalPubProto.g:1565:3: 
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
    // InternalPubProto.g:1573:1: rule__ProtoPreface__Group__1 : rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2 ;
    public final void rule__ProtoPreface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1577:1: ( rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2 )
            // InternalPubProto.g:1578:2: rule__ProtoPreface__Group__1__Impl rule__ProtoPreface__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:1585:1: rule__ProtoPreface__Group__1__Impl : ( 'Preface' ) ;
    public final void rule__ProtoPreface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1589:1: ( ( 'Preface' ) )
            // InternalPubProto.g:1590:1: ( 'Preface' )
            {
            // InternalPubProto.g:1590:1: ( 'Preface' )
            // InternalPubProto.g:1591:2: 'Preface'
            {
             before(grammarAccess.getProtoPrefaceAccess().getPrefaceKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPubProto.g:1600:1: rule__ProtoPreface__Group__2 : rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3 ;
    public final void rule__ProtoPreface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1604:1: ( rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3 )
            // InternalPubProto.g:1605:2: rule__ProtoPreface__Group__2__Impl rule__ProtoPreface__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:1612:1: rule__ProtoPreface__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPreface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1616:1: ( ( '{' ) )
            // InternalPubProto.g:1617:1: ( '{' )
            {
            // InternalPubProto.g:1617:1: ( '{' )
            // InternalPubProto.g:1618:2: '{'
            {
             before(grammarAccess.getProtoPrefaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:1627:1: rule__ProtoPreface__Group__3 : rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4 ;
    public final void rule__ProtoPreface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1631:1: ( rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4 )
            // InternalPubProto.g:1632:2: rule__ProtoPreface__Group__3__Impl rule__ProtoPreface__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:1639:1: rule__ProtoPreface__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoPreface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1643:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1644:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1644:1: ( ruleSegmentBody )
            // InternalPubProto.g:1645:2: ruleSegmentBody
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
    // InternalPubProto.g:1654:1: rule__ProtoPreface__Group__4 : rule__ProtoPreface__Group__4__Impl ;
    public final void rule__ProtoPreface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1658:1: ( rule__ProtoPreface__Group__4__Impl )
            // InternalPubProto.g:1659:2: rule__ProtoPreface__Group__4__Impl
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
    // InternalPubProto.g:1665:1: rule__ProtoPreface__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoPreface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1669:1: ( ( '}' ) )
            // InternalPubProto.g:1670:1: ( '}' )
            {
            // InternalPubProto.g:1670:1: ( '}' )
            // InternalPubProto.g:1671:2: '}'
            {
             before(grammarAccess.getProtoPrefaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:1681:1: rule__ProtoEpilogue__Group__0 : rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1 ;
    public final void rule__ProtoEpilogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1685:1: ( rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1 )
            // InternalPubProto.g:1686:2: rule__ProtoEpilogue__Group__0__Impl rule__ProtoEpilogue__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPubProto.g:1693:1: rule__ProtoEpilogue__Group__0__Impl : ( () ) ;
    public final void rule__ProtoEpilogue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1697:1: ( ( () ) )
            // InternalPubProto.g:1698:1: ( () )
            {
            // InternalPubProto.g:1698:1: ( () )
            // InternalPubProto.g:1699:2: ()
            {
             before(grammarAccess.getProtoEpilogueAccess().getProtoEpilogueAction_0()); 
            // InternalPubProto.g:1700:2: ()
            // InternalPubProto.g:1700:3: 
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
    // InternalPubProto.g:1708:1: rule__ProtoEpilogue__Group__1 : rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2 ;
    public final void rule__ProtoEpilogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1712:1: ( rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2 )
            // InternalPubProto.g:1713:2: rule__ProtoEpilogue__Group__1__Impl rule__ProtoEpilogue__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:1720:1: rule__ProtoEpilogue__Group__1__Impl : ( 'Epilogue' ) ;
    public final void rule__ProtoEpilogue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1724:1: ( ( 'Epilogue' ) )
            // InternalPubProto.g:1725:1: ( 'Epilogue' )
            {
            // InternalPubProto.g:1725:1: ( 'Epilogue' )
            // InternalPubProto.g:1726:2: 'Epilogue'
            {
             before(grammarAccess.getProtoEpilogueAccess().getEpilogueKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPubProto.g:1735:1: rule__ProtoEpilogue__Group__2 : rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3 ;
    public final void rule__ProtoEpilogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1739:1: ( rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3 )
            // InternalPubProto.g:1740:2: rule__ProtoEpilogue__Group__2__Impl rule__ProtoEpilogue__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:1747:1: rule__ProtoEpilogue__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoEpilogue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1751:1: ( ( '{' ) )
            // InternalPubProto.g:1752:1: ( '{' )
            {
            // InternalPubProto.g:1752:1: ( '{' )
            // InternalPubProto.g:1753:2: '{'
            {
             before(grammarAccess.getProtoEpilogueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:1762:1: rule__ProtoEpilogue__Group__3 : rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4 ;
    public final void rule__ProtoEpilogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1766:1: ( rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4 )
            // InternalPubProto.g:1767:2: rule__ProtoEpilogue__Group__3__Impl rule__ProtoEpilogue__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:1774:1: rule__ProtoEpilogue__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoEpilogue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1778:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:1779:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:1779:1: ( ruleSegmentBody )
            // InternalPubProto.g:1780:2: ruleSegmentBody
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
    // InternalPubProto.g:1789:1: rule__ProtoEpilogue__Group__4 : rule__ProtoEpilogue__Group__4__Impl ;
    public final void rule__ProtoEpilogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1793:1: ( rule__ProtoEpilogue__Group__4__Impl )
            // InternalPubProto.g:1794:2: rule__ProtoEpilogue__Group__4__Impl
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
    // InternalPubProto.g:1800:1: rule__ProtoEpilogue__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoEpilogue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1804:1: ( ( '}' ) )
            // InternalPubProto.g:1805:1: ( '}' )
            {
            // InternalPubProto.g:1805:1: ( '}' )
            // InternalPubProto.g:1806:2: '}'
            {
             before(grammarAccess.getProtoEpilogueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:1816:1: rule__ProtoPublicationBody__Group__0 : rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1 ;
    public final void rule__ProtoPublicationBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1820:1: ( rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1 )
            // InternalPubProto.g:1821:2: rule__ProtoPublicationBody__Group__0__Impl rule__ProtoPublicationBody__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPubProto.g:1828:1: rule__ProtoPublicationBody__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPublicationBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1832:1: ( ( () ) )
            // InternalPubProto.g:1833:1: ( () )
            {
            // InternalPubProto.g:1833:1: ( () )
            // InternalPubProto.g:1834:2: ()
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getProtoPublicationBodyAction_0()); 
            // InternalPubProto.g:1835:2: ()
            // InternalPubProto.g:1835:3: 
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
    // InternalPubProto.g:1843:1: rule__ProtoPublicationBody__Group__1 : rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2 ;
    public final void rule__ProtoPublicationBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1847:1: ( rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2 )
            // InternalPubProto.g:1848:2: rule__ProtoPublicationBody__Group__1__Impl rule__ProtoPublicationBody__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:1855:1: rule__ProtoPublicationBody__Group__1__Impl : ( 'Body' ) ;
    public final void rule__ProtoPublicationBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1859:1: ( ( 'Body' ) )
            // InternalPubProto.g:1860:1: ( 'Body' )
            {
            // InternalPubProto.g:1860:1: ( 'Body' )
            // InternalPubProto.g:1861:2: 'Body'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getBodyKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPubProto.g:1870:1: rule__ProtoPublicationBody__Group__2 : rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3 ;
    public final void rule__ProtoPublicationBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1874:1: ( rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3 )
            // InternalPubProto.g:1875:2: rule__ProtoPublicationBody__Group__2__Impl rule__ProtoPublicationBody__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalPubProto.g:1882:1: rule__ProtoPublicationBody__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPublicationBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1886:1: ( ( '{' ) )
            // InternalPubProto.g:1887:1: ( '{' )
            {
            // InternalPubProto.g:1887:1: ( '{' )
            // InternalPubProto.g:1888:2: '{'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:1897:1: rule__ProtoPublicationBody__Group__3 : rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4 ;
    public final void rule__ProtoPublicationBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1901:1: ( rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4 )
            // InternalPubProto.g:1902:2: rule__ProtoPublicationBody__Group__3__Impl rule__ProtoPublicationBody__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalPubProto.g:1909:1: rule__ProtoPublicationBody__Group__3__Impl : ( ( rule__ProtoPublicationBody__Group_3__0 )? ) ;
    public final void rule__ProtoPublicationBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1913:1: ( ( ( rule__ProtoPublicationBody__Group_3__0 )? ) )
            // InternalPubProto.g:1914:1: ( ( rule__ProtoPublicationBody__Group_3__0 )? )
            {
            // InternalPubProto.g:1914:1: ( ( rule__ProtoPublicationBody__Group_3__0 )? )
            // InternalPubProto.g:1915:2: ( rule__ProtoPublicationBody__Group_3__0 )?
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getGroup_3()); 
            // InternalPubProto.g:1916:2: ( rule__ProtoPublicationBody__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPubProto.g:1916:3: rule__ProtoPublicationBody__Group_3__0
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
    // InternalPubProto.g:1924:1: rule__ProtoPublicationBody__Group__4 : rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5 ;
    public final void rule__ProtoPublicationBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1928:1: ( rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5 )
            // InternalPubProto.g:1929:2: rule__ProtoPublicationBody__Group__4__Impl rule__ProtoPublicationBody__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalPubProto.g:1936:1: rule__ProtoPublicationBody__Group__4__Impl : ( ( rule__ProtoPublicationBody__Group_4__0 )? ) ;
    public final void rule__ProtoPublicationBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1940:1: ( ( ( rule__ProtoPublicationBody__Group_4__0 )? ) )
            // InternalPubProto.g:1941:1: ( ( rule__ProtoPublicationBody__Group_4__0 )? )
            {
            // InternalPubProto.g:1941:1: ( ( rule__ProtoPublicationBody__Group_4__0 )? )
            // InternalPubProto.g:1942:2: ( rule__ProtoPublicationBody__Group_4__0 )?
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getGroup_4()); 
            // InternalPubProto.g:1943:2: ( rule__ProtoPublicationBody__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPubProto.g:1943:3: rule__ProtoPublicationBody__Group_4__0
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
    // InternalPubProto.g:1951:1: rule__ProtoPublicationBody__Group__5 : rule__ProtoPublicationBody__Group__5__Impl ;
    public final void rule__ProtoPublicationBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1955:1: ( rule__ProtoPublicationBody__Group__5__Impl )
            // InternalPubProto.g:1956:2: rule__ProtoPublicationBody__Group__5__Impl
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
    // InternalPubProto.g:1962:1: rule__ProtoPublicationBody__Group__5__Impl : ( '}' ) ;
    public final void rule__ProtoPublicationBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1966:1: ( ( '}' ) )
            // InternalPubProto.g:1967:1: ( '}' )
            {
            // InternalPubProto.g:1967:1: ( '}' )
            // InternalPubProto.g:1968:2: '}'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:1978:1: rule__ProtoPublicationBody__Group_3__0 : rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1 ;
    public final void rule__ProtoPublicationBody__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1982:1: ( rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1 )
            // InternalPubProto.g:1983:2: rule__ProtoPublicationBody__Group_3__0__Impl rule__ProtoPublicationBody__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPubProto.g:1990:1: rule__ProtoPublicationBody__Group_3__0__Impl : ( 'parts:' ) ;
    public final void rule__ProtoPublicationBody__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:1994:1: ( ( 'parts:' ) )
            // InternalPubProto.g:1995:1: ( 'parts:' )
            {
            // InternalPubProto.g:1995:1: ( 'parts:' )
            // InternalPubProto.g:1996:2: 'parts:'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPubProto.g:2005:1: rule__ProtoPublicationBody__Group_3__1 : rule__ProtoPublicationBody__Group_3__1__Impl ;
    public final void rule__ProtoPublicationBody__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2009:1: ( rule__ProtoPublicationBody__Group_3__1__Impl )
            // InternalPubProto.g:2010:2: rule__ProtoPublicationBody__Group_3__1__Impl
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
    // InternalPubProto.g:2016:1: rule__ProtoPublicationBody__Group_3__1__Impl : ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) ) ;
    public final void rule__ProtoPublicationBody__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2020:1: ( ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) ) )
            // InternalPubProto.g:2021:1: ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) )
            {
            // InternalPubProto.g:2021:1: ( ( rule__ProtoPublicationBody__Alternatives_3_1 ) )
            // InternalPubProto.g:2022:2: ( rule__ProtoPublicationBody__Alternatives_3_1 )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_3_1()); 
            // InternalPubProto.g:2023:2: ( rule__ProtoPublicationBody__Alternatives_3_1 )
            // InternalPubProto.g:2023:3: rule__ProtoPublicationBody__Alternatives_3_1
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
    // InternalPubProto.g:2032:1: rule__ProtoPublicationBody__Group_4__0 : rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1 ;
    public final void rule__ProtoPublicationBody__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2036:1: ( rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1 )
            // InternalPubProto.g:2037:2: rule__ProtoPublicationBody__Group_4__0__Impl rule__ProtoPublicationBody__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPubProto.g:2044:1: rule__ProtoPublicationBody__Group_4__0__Impl : ( 'appendix:' ) ;
    public final void rule__ProtoPublicationBody__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2048:1: ( ( 'appendix:' ) )
            // InternalPubProto.g:2049:1: ( 'appendix:' )
            {
            // InternalPubProto.g:2049:1: ( 'appendix:' )
            // InternalPubProto.g:2050:2: 'appendix:'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPubProto.g:2059:1: rule__ProtoPublicationBody__Group_4__1 : rule__ProtoPublicationBody__Group_4__1__Impl ;
    public final void rule__ProtoPublicationBody__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2063:1: ( rule__ProtoPublicationBody__Group_4__1__Impl )
            // InternalPubProto.g:2064:2: rule__ProtoPublicationBody__Group_4__1__Impl
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
    // InternalPubProto.g:2070:1: rule__ProtoPublicationBody__Group_4__1__Impl : ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) ) ;
    public final void rule__ProtoPublicationBody__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2074:1: ( ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) ) )
            // InternalPubProto.g:2075:1: ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) )
            {
            // InternalPubProto.g:2075:1: ( ( rule__ProtoPublicationBody__Alternatives_4_1 ) )
            // InternalPubProto.g:2076:2: ( rule__ProtoPublicationBody__Alternatives_4_1 )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_4_1()); 
            // InternalPubProto.g:2077:2: ( rule__ProtoPublicationBody__Alternatives_4_1 )
            // InternalPubProto.g:2077:3: rule__ProtoPublicationBody__Alternatives_4_1
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
    // InternalPubProto.g:2086:1: rule__ProtoChangeHistory__Group__0 : rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1 ;
    public final void rule__ProtoChangeHistory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2090:1: ( rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1 )
            // InternalPubProto.g:2091:2: rule__ProtoChangeHistory__Group__0__Impl rule__ProtoChangeHistory__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPubProto.g:2098:1: rule__ProtoChangeHistory__Group__0__Impl : ( () ) ;
    public final void rule__ProtoChangeHistory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2102:1: ( ( () ) )
            // InternalPubProto.g:2103:1: ( () )
            {
            // InternalPubProto.g:2103:1: ( () )
            // InternalPubProto.g:2104:2: ()
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getProtoChangeHistoryAction_0()); 
            // InternalPubProto.g:2105:2: ()
            // InternalPubProto.g:2105:3: 
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
    // InternalPubProto.g:2113:1: rule__ProtoChangeHistory__Group__1 : rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2 ;
    public final void rule__ProtoChangeHistory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2117:1: ( rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2 )
            // InternalPubProto.g:2118:2: rule__ProtoChangeHistory__Group__1__Impl rule__ProtoChangeHistory__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2125:1: rule__ProtoChangeHistory__Group__1__Impl : ( 'ChangeHistory' ) ;
    public final void rule__ProtoChangeHistory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2129:1: ( ( 'ChangeHistory' ) )
            // InternalPubProto.g:2130:1: ( 'ChangeHistory' )
            {
            // InternalPubProto.g:2130:1: ( 'ChangeHistory' )
            // InternalPubProto.g:2131:2: 'ChangeHistory'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getChangeHistoryKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPubProto.g:2140:1: rule__ProtoChangeHistory__Group__2 : rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3 ;
    public final void rule__ProtoChangeHistory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2144:1: ( rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3 )
            // InternalPubProto.g:2145:2: rule__ProtoChangeHistory__Group__2__Impl rule__ProtoChangeHistory__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2152:1: rule__ProtoChangeHistory__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoChangeHistory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2156:1: ( ( '{' ) )
            // InternalPubProto.g:2157:1: ( '{' )
            {
            // InternalPubProto.g:2157:1: ( '{' )
            // InternalPubProto.g:2158:2: '{'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2167:1: rule__ProtoChangeHistory__Group__3 : rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4 ;
    public final void rule__ProtoChangeHistory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2171:1: ( rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4 )
            // InternalPubProto.g:2172:2: rule__ProtoChangeHistory__Group__3__Impl rule__ProtoChangeHistory__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:2179:1: rule__ProtoChangeHistory__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoChangeHistory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2183:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2184:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2184:1: ( ruleSegmentBody )
            // InternalPubProto.g:2185:2: ruleSegmentBody
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
    // InternalPubProto.g:2194:1: rule__ProtoChangeHistory__Group__4 : rule__ProtoChangeHistory__Group__4__Impl ;
    public final void rule__ProtoChangeHistory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2198:1: ( rule__ProtoChangeHistory__Group__4__Impl )
            // InternalPubProto.g:2199:2: rule__ProtoChangeHistory__Group__4__Impl
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
    // InternalPubProto.g:2205:1: rule__ProtoChangeHistory__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoChangeHistory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2209:1: ( ( '}' ) )
            // InternalPubProto.g:2210:1: ( '}' )
            {
            // InternalPubProto.g:2210:1: ( '}' )
            // InternalPubProto.g:2211:2: '}'
            {
             before(grammarAccess.getProtoChangeHistoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2221:1: rule__ProtoTOC__Group__0 : rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1 ;
    public final void rule__ProtoTOC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2225:1: ( rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1 )
            // InternalPubProto.g:2226:2: rule__ProtoTOC__Group__0__Impl rule__ProtoTOC__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPubProto.g:2233:1: rule__ProtoTOC__Group__0__Impl : ( () ) ;
    public final void rule__ProtoTOC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2237:1: ( ( () ) )
            // InternalPubProto.g:2238:1: ( () )
            {
            // InternalPubProto.g:2238:1: ( () )
            // InternalPubProto.g:2239:2: ()
            {
             before(grammarAccess.getProtoTOCAccess().getProtoTOCAction_0()); 
            // InternalPubProto.g:2240:2: ()
            // InternalPubProto.g:2240:3: 
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
    // InternalPubProto.g:2248:1: rule__ProtoTOC__Group__1 : rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2 ;
    public final void rule__ProtoTOC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2252:1: ( rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2 )
            // InternalPubProto.g:2253:2: rule__ProtoTOC__Group__1__Impl rule__ProtoTOC__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2260:1: rule__ProtoTOC__Group__1__Impl : ( 'TableOfContents' ) ;
    public final void rule__ProtoTOC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2264:1: ( ( 'TableOfContents' ) )
            // InternalPubProto.g:2265:1: ( 'TableOfContents' )
            {
            // InternalPubProto.g:2265:1: ( 'TableOfContents' )
            // InternalPubProto.g:2266:2: 'TableOfContents'
            {
             before(grammarAccess.getProtoTOCAccess().getTableOfContentsKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPubProto.g:2275:1: rule__ProtoTOC__Group__2 : rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3 ;
    public final void rule__ProtoTOC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2279:1: ( rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3 )
            // InternalPubProto.g:2280:2: rule__ProtoTOC__Group__2__Impl rule__ProtoTOC__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2287:1: rule__ProtoTOC__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoTOC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2291:1: ( ( '{' ) )
            // InternalPubProto.g:2292:1: ( '{' )
            {
            // InternalPubProto.g:2292:1: ( '{' )
            // InternalPubProto.g:2293:2: '{'
            {
             before(grammarAccess.getProtoTOCAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2302:1: rule__ProtoTOC__Group__3 : rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4 ;
    public final void rule__ProtoTOC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2306:1: ( rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4 )
            // InternalPubProto.g:2307:2: rule__ProtoTOC__Group__3__Impl rule__ProtoTOC__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalPubProto.g:2314:1: rule__ProtoTOC__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoTOC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2318:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2319:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2319:1: ( ruleSegmentBody )
            // InternalPubProto.g:2320:2: ruleSegmentBody
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
    // InternalPubProto.g:2329:1: rule__ProtoTOC__Group__4 : rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5 ;
    public final void rule__ProtoTOC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2333:1: ( rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5 )
            // InternalPubProto.g:2334:2: rule__ProtoTOC__Group__4__Impl rule__ProtoTOC__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalPubProto.g:2341:1: rule__ProtoTOC__Group__4__Impl : ( ( rule__ProtoTOC__Group_4__0 )? ) ;
    public final void rule__ProtoTOC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2345:1: ( ( ( rule__ProtoTOC__Group_4__0 )? ) )
            // InternalPubProto.g:2346:1: ( ( rule__ProtoTOC__Group_4__0 )? )
            {
            // InternalPubProto.g:2346:1: ( ( rule__ProtoTOC__Group_4__0 )? )
            // InternalPubProto.g:2347:2: ( rule__ProtoTOC__Group_4__0 )?
            {
             before(grammarAccess.getProtoTOCAccess().getGroup_4()); 
            // InternalPubProto.g:2348:2: ( rule__ProtoTOC__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPubProto.g:2348:3: rule__ProtoTOC__Group_4__0
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
    // InternalPubProto.g:2356:1: rule__ProtoTOC__Group__5 : rule__ProtoTOC__Group__5__Impl ;
    public final void rule__ProtoTOC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2360:1: ( rule__ProtoTOC__Group__5__Impl )
            // InternalPubProto.g:2361:2: rule__ProtoTOC__Group__5__Impl
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
    // InternalPubProto.g:2367:1: rule__ProtoTOC__Group__5__Impl : ( '}' ) ;
    public final void rule__ProtoTOC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2371:1: ( ( '}' ) )
            // InternalPubProto.g:2372:1: ( '}' )
            {
            // InternalPubProto.g:2372:1: ( '}' )
            // InternalPubProto.g:2373:2: '}'
            {
             before(grammarAccess.getProtoTOCAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2383:1: rule__ProtoTOC__Group_4__0 : rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1 ;
    public final void rule__ProtoTOC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2387:1: ( rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1 )
            // InternalPubProto.g:2388:2: rule__ProtoTOC__Group_4__0__Impl rule__ProtoTOC__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPubProto.g:2395:1: rule__ProtoTOC__Group_4__0__Impl : ( 'maxLevel:' ) ;
    public final void rule__ProtoTOC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2399:1: ( ( 'maxLevel:' ) )
            // InternalPubProto.g:2400:1: ( 'maxLevel:' )
            {
            // InternalPubProto.g:2400:1: ( 'maxLevel:' )
            // InternalPubProto.g:2401:2: 'maxLevel:'
            {
             before(grammarAccess.getProtoTOCAccess().getMaxLevelKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPubProto.g:2410:1: rule__ProtoTOC__Group_4__1 : rule__ProtoTOC__Group_4__1__Impl ;
    public final void rule__ProtoTOC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2414:1: ( rule__ProtoTOC__Group_4__1__Impl )
            // InternalPubProto.g:2415:2: rule__ProtoTOC__Group_4__1__Impl
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
    // InternalPubProto.g:2421:1: rule__ProtoTOC__Group_4__1__Impl : ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) ) ;
    public final void rule__ProtoTOC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2425:1: ( ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) ) )
            // InternalPubProto.g:2426:1: ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) )
            {
            // InternalPubProto.g:2426:1: ( ( rule__ProtoTOC__MaxLevelAssignment_4_1 ) )
            // InternalPubProto.g:2427:2: ( rule__ProtoTOC__MaxLevelAssignment_4_1 )
            {
             before(grammarAccess.getProtoTOCAccess().getMaxLevelAssignment_4_1()); 
            // InternalPubProto.g:2428:2: ( rule__ProtoTOC__MaxLevelAssignment_4_1 )
            // InternalPubProto.g:2428:3: rule__ProtoTOC__MaxLevelAssignment_4_1
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
    // InternalPubProto.g:2437:1: rule__ProtoAbbreviations__Group__0 : rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1 ;
    public final void rule__ProtoAbbreviations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2441:1: ( rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1 )
            // InternalPubProto.g:2442:2: rule__ProtoAbbreviations__Group__0__Impl rule__ProtoAbbreviations__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPubProto.g:2449:1: rule__ProtoAbbreviations__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAbbreviations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2453:1: ( ( () ) )
            // InternalPubProto.g:2454:1: ( () )
            {
            // InternalPubProto.g:2454:1: ( () )
            // InternalPubProto.g:2455:2: ()
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getProtoAbbreviationsAction_0()); 
            // InternalPubProto.g:2456:2: ()
            // InternalPubProto.g:2456:3: 
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
    // InternalPubProto.g:2464:1: rule__ProtoAbbreviations__Group__1 : rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2 ;
    public final void rule__ProtoAbbreviations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2468:1: ( rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2 )
            // InternalPubProto.g:2469:2: rule__ProtoAbbreviations__Group__1__Impl rule__ProtoAbbreviations__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2476:1: rule__ProtoAbbreviations__Group__1__Impl : ( 'Abbreviations' ) ;
    public final void rule__ProtoAbbreviations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2480:1: ( ( 'Abbreviations' ) )
            // InternalPubProto.g:2481:1: ( 'Abbreviations' )
            {
            // InternalPubProto.g:2481:1: ( 'Abbreviations' )
            // InternalPubProto.g:2482:2: 'Abbreviations'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getAbbreviationsKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPubProto.g:2491:1: rule__ProtoAbbreviations__Group__2 : rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3 ;
    public final void rule__ProtoAbbreviations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2495:1: ( rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3 )
            // InternalPubProto.g:2496:2: rule__ProtoAbbreviations__Group__2__Impl rule__ProtoAbbreviations__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2503:1: rule__ProtoAbbreviations__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAbbreviations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2507:1: ( ( '{' ) )
            // InternalPubProto.g:2508:1: ( '{' )
            {
            // InternalPubProto.g:2508:1: ( '{' )
            // InternalPubProto.g:2509:2: '{'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2518:1: rule__ProtoAbbreviations__Group__3 : rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4 ;
    public final void rule__ProtoAbbreviations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2522:1: ( rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4 )
            // InternalPubProto.g:2523:2: rule__ProtoAbbreviations__Group__3__Impl rule__ProtoAbbreviations__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:2530:1: rule__ProtoAbbreviations__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoAbbreviations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2534:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2535:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2535:1: ( ruleSegmentBody )
            // InternalPubProto.g:2536:2: ruleSegmentBody
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
    // InternalPubProto.g:2545:1: rule__ProtoAbbreviations__Group__4 : rule__ProtoAbbreviations__Group__4__Impl ;
    public final void rule__ProtoAbbreviations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2549:1: ( rule__ProtoAbbreviations__Group__4__Impl )
            // InternalPubProto.g:2550:2: rule__ProtoAbbreviations__Group__4__Impl
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
    // InternalPubProto.g:2556:1: rule__ProtoAbbreviations__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAbbreviations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2560:1: ( ( '}' ) )
            // InternalPubProto.g:2561:1: ( '}' )
            {
            // InternalPubProto.g:2561:1: ( '}' )
            // InternalPubProto.g:2562:2: '}'
            {
             before(grammarAccess.getProtoAbbreviationsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2572:1: rule__ProtoListOfTables__Group__0 : rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1 ;
    public final void rule__ProtoListOfTables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2576:1: ( rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1 )
            // InternalPubProto.g:2577:2: rule__ProtoListOfTables__Group__0__Impl rule__ProtoListOfTables__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPubProto.g:2584:1: rule__ProtoListOfTables__Group__0__Impl : ( () ) ;
    public final void rule__ProtoListOfTables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2588:1: ( ( () ) )
            // InternalPubProto.g:2589:1: ( () )
            {
            // InternalPubProto.g:2589:1: ( () )
            // InternalPubProto.g:2590:2: ()
            {
             before(grammarAccess.getProtoListOfTablesAccess().getProtoListOfTablesAction_0()); 
            // InternalPubProto.g:2591:2: ()
            // InternalPubProto.g:2591:3: 
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
    // InternalPubProto.g:2599:1: rule__ProtoListOfTables__Group__1 : rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2 ;
    public final void rule__ProtoListOfTables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2603:1: ( rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2 )
            // InternalPubProto.g:2604:2: rule__ProtoListOfTables__Group__1__Impl rule__ProtoListOfTables__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2611:1: rule__ProtoListOfTables__Group__1__Impl : ( 'ListOfTables' ) ;
    public final void rule__ProtoListOfTables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2615:1: ( ( 'ListOfTables' ) )
            // InternalPubProto.g:2616:1: ( 'ListOfTables' )
            {
            // InternalPubProto.g:2616:1: ( 'ListOfTables' )
            // InternalPubProto.g:2617:2: 'ListOfTables'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getListOfTablesKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPubProto.g:2626:1: rule__ProtoListOfTables__Group__2 : rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3 ;
    public final void rule__ProtoListOfTables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2630:1: ( rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3 )
            // InternalPubProto.g:2631:2: rule__ProtoListOfTables__Group__2__Impl rule__ProtoListOfTables__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2638:1: rule__ProtoListOfTables__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoListOfTables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2642:1: ( ( '{' ) )
            // InternalPubProto.g:2643:1: ( '{' )
            {
            // InternalPubProto.g:2643:1: ( '{' )
            // InternalPubProto.g:2644:2: '{'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2653:1: rule__ProtoListOfTables__Group__3 : rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4 ;
    public final void rule__ProtoListOfTables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2657:1: ( rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4 )
            // InternalPubProto.g:2658:2: rule__ProtoListOfTables__Group__3__Impl rule__ProtoListOfTables__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:2665:1: rule__ProtoListOfTables__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoListOfTables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2669:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2670:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2670:1: ( ruleSegmentBody )
            // InternalPubProto.g:2671:2: ruleSegmentBody
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
    // InternalPubProto.g:2680:1: rule__ProtoListOfTables__Group__4 : rule__ProtoListOfTables__Group__4__Impl ;
    public final void rule__ProtoListOfTables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2684:1: ( rule__ProtoListOfTables__Group__4__Impl )
            // InternalPubProto.g:2685:2: rule__ProtoListOfTables__Group__4__Impl
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
    // InternalPubProto.g:2691:1: rule__ProtoListOfTables__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoListOfTables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2695:1: ( ( '}' ) )
            // InternalPubProto.g:2696:1: ( '}' )
            {
            // InternalPubProto.g:2696:1: ( '}' )
            // InternalPubProto.g:2697:2: '}'
            {
             before(grammarAccess.getProtoListOfTablesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2707:1: rule__ProtoListOfFigures__Group__0 : rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1 ;
    public final void rule__ProtoListOfFigures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2711:1: ( rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1 )
            // InternalPubProto.g:2712:2: rule__ProtoListOfFigures__Group__0__Impl rule__ProtoListOfFigures__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPubProto.g:2719:1: rule__ProtoListOfFigures__Group__0__Impl : ( () ) ;
    public final void rule__ProtoListOfFigures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2723:1: ( ( () ) )
            // InternalPubProto.g:2724:1: ( () )
            {
            // InternalPubProto.g:2724:1: ( () )
            // InternalPubProto.g:2725:2: ()
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getProtoListOfFiguresAction_0()); 
            // InternalPubProto.g:2726:2: ()
            // InternalPubProto.g:2726:3: 
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
    // InternalPubProto.g:2734:1: rule__ProtoListOfFigures__Group__1 : rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2 ;
    public final void rule__ProtoListOfFigures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2738:1: ( rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2 )
            // InternalPubProto.g:2739:2: rule__ProtoListOfFigures__Group__1__Impl rule__ProtoListOfFigures__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2746:1: rule__ProtoListOfFigures__Group__1__Impl : ( 'ListOfFigures' ) ;
    public final void rule__ProtoListOfFigures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2750:1: ( ( 'ListOfFigures' ) )
            // InternalPubProto.g:2751:1: ( 'ListOfFigures' )
            {
            // InternalPubProto.g:2751:1: ( 'ListOfFigures' )
            // InternalPubProto.g:2752:2: 'ListOfFigures'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getListOfFiguresKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPubProto.g:2761:1: rule__ProtoListOfFigures__Group__2 : rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3 ;
    public final void rule__ProtoListOfFigures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2765:1: ( rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3 )
            // InternalPubProto.g:2766:2: rule__ProtoListOfFigures__Group__2__Impl rule__ProtoListOfFigures__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2773:1: rule__ProtoListOfFigures__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoListOfFigures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2777:1: ( ( '{' ) )
            // InternalPubProto.g:2778:1: ( '{' )
            {
            // InternalPubProto.g:2778:1: ( '{' )
            // InternalPubProto.g:2779:2: '{'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2788:1: rule__ProtoListOfFigures__Group__3 : rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4 ;
    public final void rule__ProtoListOfFigures__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2792:1: ( rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4 )
            // InternalPubProto.g:2793:2: rule__ProtoListOfFigures__Group__3__Impl rule__ProtoListOfFigures__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:2800:1: rule__ProtoListOfFigures__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoListOfFigures__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2804:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2805:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2805:1: ( ruleSegmentBody )
            // InternalPubProto.g:2806:2: ruleSegmentBody
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
    // InternalPubProto.g:2815:1: rule__ProtoListOfFigures__Group__4 : rule__ProtoListOfFigures__Group__4__Impl ;
    public final void rule__ProtoListOfFigures__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2819:1: ( rule__ProtoListOfFigures__Group__4__Impl )
            // InternalPubProto.g:2820:2: rule__ProtoListOfFigures__Group__4__Impl
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
    // InternalPubProto.g:2826:1: rule__ProtoListOfFigures__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoListOfFigures__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2830:1: ( ( '}' ) )
            // InternalPubProto.g:2831:1: ( '}' )
            {
            // InternalPubProto.g:2831:1: ( '}' )
            // InternalPubProto.g:2832:2: '}'
            {
             before(grammarAccess.getProtoListOfFiguresAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2842:1: rule__ProtoBibliography__Group__0 : rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1 ;
    public final void rule__ProtoBibliography__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2846:1: ( rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1 )
            // InternalPubProto.g:2847:2: rule__ProtoBibliography__Group__0__Impl rule__ProtoBibliography__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPubProto.g:2854:1: rule__ProtoBibliography__Group__0__Impl : ( () ) ;
    public final void rule__ProtoBibliography__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2858:1: ( ( () ) )
            // InternalPubProto.g:2859:1: ( () )
            {
            // InternalPubProto.g:2859:1: ( () )
            // InternalPubProto.g:2860:2: ()
            {
             before(grammarAccess.getProtoBibliographyAccess().getProtoBibliographyAction_0()); 
            // InternalPubProto.g:2861:2: ()
            // InternalPubProto.g:2861:3: 
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
    // InternalPubProto.g:2869:1: rule__ProtoBibliography__Group__1 : rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2 ;
    public final void rule__ProtoBibliography__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2873:1: ( rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2 )
            // InternalPubProto.g:2874:2: rule__ProtoBibliography__Group__1__Impl rule__ProtoBibliography__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:2881:1: rule__ProtoBibliography__Group__1__Impl : ( 'Bibliography' ) ;
    public final void rule__ProtoBibliography__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2885:1: ( ( 'Bibliography' ) )
            // InternalPubProto.g:2886:1: ( 'Bibliography' )
            {
            // InternalPubProto.g:2886:1: ( 'Bibliography' )
            // InternalPubProto.g:2887:2: 'Bibliography'
            {
             before(grammarAccess.getProtoBibliographyAccess().getBibliographyKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPubProto.g:2896:1: rule__ProtoBibliography__Group__2 : rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3 ;
    public final void rule__ProtoBibliography__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2900:1: ( rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3 )
            // InternalPubProto.g:2901:2: rule__ProtoBibliography__Group__2__Impl rule__ProtoBibliography__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:2908:1: rule__ProtoBibliography__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoBibliography__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2912:1: ( ( '{' ) )
            // InternalPubProto.g:2913:1: ( '{' )
            {
            // InternalPubProto.g:2913:1: ( '{' )
            // InternalPubProto.g:2914:2: '{'
            {
             before(grammarAccess.getProtoBibliographyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:2923:1: rule__ProtoBibliography__Group__3 : rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4 ;
    public final void rule__ProtoBibliography__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2927:1: ( rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4 )
            // InternalPubProto.g:2928:2: rule__ProtoBibliography__Group__3__Impl rule__ProtoBibliography__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:2935:1: rule__ProtoBibliography__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoBibliography__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2939:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:2940:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:2940:1: ( ruleSegmentBody )
            // InternalPubProto.g:2941:2: ruleSegmentBody
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
    // InternalPubProto.g:2950:1: rule__ProtoBibliography__Group__4 : rule__ProtoBibliography__Group__4__Impl ;
    public final void rule__ProtoBibliography__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2954:1: ( rule__ProtoBibliography__Group__4__Impl )
            // InternalPubProto.g:2955:2: rule__ProtoBibliography__Group__4__Impl
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
    // InternalPubProto.g:2961:1: rule__ProtoBibliography__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoBibliography__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2965:1: ( ( '}' ) )
            // InternalPubProto.g:2966:1: ( '}' )
            {
            // InternalPubProto.g:2966:1: ( '}' )
            // InternalPubProto.g:2967:2: '}'
            {
             before(grammarAccess.getProtoBibliographyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:2977:1: rule__ProtoGlossary__Group__0 : rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1 ;
    public final void rule__ProtoGlossary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2981:1: ( rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1 )
            // InternalPubProto.g:2982:2: rule__ProtoGlossary__Group__0__Impl rule__ProtoGlossary__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPubProto.g:2989:1: rule__ProtoGlossary__Group__0__Impl : ( () ) ;
    public final void rule__ProtoGlossary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:2993:1: ( ( () ) )
            // InternalPubProto.g:2994:1: ( () )
            {
            // InternalPubProto.g:2994:1: ( () )
            // InternalPubProto.g:2995:2: ()
            {
             before(grammarAccess.getProtoGlossaryAccess().getProtoGlossaryAction_0()); 
            // InternalPubProto.g:2996:2: ()
            // InternalPubProto.g:2996:3: 
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
    // InternalPubProto.g:3004:1: rule__ProtoGlossary__Group__1 : rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2 ;
    public final void rule__ProtoGlossary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3008:1: ( rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2 )
            // InternalPubProto.g:3009:2: rule__ProtoGlossary__Group__1__Impl rule__ProtoGlossary__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3016:1: rule__ProtoGlossary__Group__1__Impl : ( 'Glossary' ) ;
    public final void rule__ProtoGlossary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3020:1: ( ( 'Glossary' ) )
            // InternalPubProto.g:3021:1: ( 'Glossary' )
            {
            // InternalPubProto.g:3021:1: ( 'Glossary' )
            // InternalPubProto.g:3022:2: 'Glossary'
            {
             before(grammarAccess.getProtoGlossaryAccess().getGlossaryKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPubProto.g:3031:1: rule__ProtoGlossary__Group__2 : rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3 ;
    public final void rule__ProtoGlossary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3035:1: ( rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3 )
            // InternalPubProto.g:3036:2: rule__ProtoGlossary__Group__2__Impl rule__ProtoGlossary__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:3043:1: rule__ProtoGlossary__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoGlossary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3047:1: ( ( '{' ) )
            // InternalPubProto.g:3048:1: ( '{' )
            {
            // InternalPubProto.g:3048:1: ( '{' )
            // InternalPubProto.g:3049:2: '{'
            {
             before(grammarAccess.getProtoGlossaryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3058:1: rule__ProtoGlossary__Group__3 : rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4 ;
    public final void rule__ProtoGlossary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3062:1: ( rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4 )
            // InternalPubProto.g:3063:2: rule__ProtoGlossary__Group__3__Impl rule__ProtoGlossary__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3070:1: rule__ProtoGlossary__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoGlossary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3074:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:3075:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:3075:1: ( ruleSegmentBody )
            // InternalPubProto.g:3076:2: ruleSegmentBody
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
    // InternalPubProto.g:3085:1: rule__ProtoGlossary__Group__4 : rule__ProtoGlossary__Group__4__Impl ;
    public final void rule__ProtoGlossary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3089:1: ( rule__ProtoGlossary__Group__4__Impl )
            // InternalPubProto.g:3090:2: rule__ProtoGlossary__Group__4__Impl
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
    // InternalPubProto.g:3096:1: rule__ProtoGlossary__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoGlossary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3100:1: ( ( '}' ) )
            // InternalPubProto.g:3101:1: ( '}' )
            {
            // InternalPubProto.g:3101:1: ( '}' )
            // InternalPubProto.g:3102:2: '}'
            {
             before(grammarAccess.getProtoGlossaryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3112:1: rule__ProtoIndex__Group__0 : rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1 ;
    public final void rule__ProtoIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3116:1: ( rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1 )
            // InternalPubProto.g:3117:2: rule__ProtoIndex__Group__0__Impl rule__ProtoIndex__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPubProto.g:3124:1: rule__ProtoIndex__Group__0__Impl : ( () ) ;
    public final void rule__ProtoIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3128:1: ( ( () ) )
            // InternalPubProto.g:3129:1: ( () )
            {
            // InternalPubProto.g:3129:1: ( () )
            // InternalPubProto.g:3130:2: ()
            {
             before(grammarAccess.getProtoIndexAccess().getProtoIndexAction_0()); 
            // InternalPubProto.g:3131:2: ()
            // InternalPubProto.g:3131:3: 
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
    // InternalPubProto.g:3139:1: rule__ProtoIndex__Group__1 : rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2 ;
    public final void rule__ProtoIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3143:1: ( rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2 )
            // InternalPubProto.g:3144:2: rule__ProtoIndex__Group__1__Impl rule__ProtoIndex__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3151:1: rule__ProtoIndex__Group__1__Impl : ( 'Index' ) ;
    public final void rule__ProtoIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3155:1: ( ( 'Index' ) )
            // InternalPubProto.g:3156:1: ( 'Index' )
            {
            // InternalPubProto.g:3156:1: ( 'Index' )
            // InternalPubProto.g:3157:2: 'Index'
            {
             before(grammarAccess.getProtoIndexAccess().getIndexKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPubProto.g:3166:1: rule__ProtoIndex__Group__2 : rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3 ;
    public final void rule__ProtoIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3170:1: ( rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3 )
            // InternalPubProto.g:3171:2: rule__ProtoIndex__Group__2__Impl rule__ProtoIndex__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPubProto.g:3178:1: rule__ProtoIndex__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3182:1: ( ( '{' ) )
            // InternalPubProto.g:3183:1: ( '{' )
            {
            // InternalPubProto.g:3183:1: ( '{' )
            // InternalPubProto.g:3184:2: '{'
            {
             before(grammarAccess.getProtoIndexAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3193:1: rule__ProtoIndex__Group__3 : rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4 ;
    public final void rule__ProtoIndex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3197:1: ( rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4 )
            // InternalPubProto.g:3198:2: rule__ProtoIndex__Group__3__Impl rule__ProtoIndex__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3205:1: rule__ProtoIndex__Group__3__Impl : ( ruleSegmentBody ) ;
    public final void rule__ProtoIndex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3209:1: ( ( ruleSegmentBody ) )
            // InternalPubProto.g:3210:1: ( ruleSegmentBody )
            {
            // InternalPubProto.g:3210:1: ( ruleSegmentBody )
            // InternalPubProto.g:3211:2: ruleSegmentBody
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
    // InternalPubProto.g:3220:1: rule__ProtoIndex__Group__4 : rule__ProtoIndex__Group__4__Impl ;
    public final void rule__ProtoIndex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3224:1: ( rule__ProtoIndex__Group__4__Impl )
            // InternalPubProto.g:3225:2: rule__ProtoIndex__Group__4__Impl
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
    // InternalPubProto.g:3231:1: rule__ProtoIndex__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoIndex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3235:1: ( ( '}' ) )
            // InternalPubProto.g:3236:1: ( '}' )
            {
            // InternalPubProto.g:3236:1: ( '}' )
            // InternalPubProto.g:3237:2: '}'
            {
             before(grammarAccess.getProtoIndexAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3247:1: rule__ProtoDivisionBody__Group__0 : rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1 ;
    public final void rule__ProtoDivisionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3251:1: ( rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1 )
            // InternalPubProto.g:3252:2: rule__ProtoDivisionBody__Group__0__Impl rule__ProtoDivisionBody__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPubProto.g:3259:1: rule__ProtoDivisionBody__Group__0__Impl : ( 'numbering:' ) ;
    public final void rule__ProtoDivisionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3263:1: ( ( 'numbering:' ) )
            // InternalPubProto.g:3264:1: ( 'numbering:' )
            {
            // InternalPubProto.g:3264:1: ( 'numbering:' )
            // InternalPubProto.g:3265:2: 'numbering:'
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getNumberingKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPubProto.g:3274:1: rule__ProtoDivisionBody__Group__1 : rule__ProtoDivisionBody__Group__1__Impl ;
    public final void rule__ProtoDivisionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3278:1: ( rule__ProtoDivisionBody__Group__1__Impl )
            // InternalPubProto.g:3279:2: rule__ProtoDivisionBody__Group__1__Impl
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
    // InternalPubProto.g:3285:1: rule__ProtoDivisionBody__Group__1__Impl : ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) ) ;
    public final void rule__ProtoDivisionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3289:1: ( ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) ) )
            // InternalPubProto.g:3290:1: ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) )
            {
            // InternalPubProto.g:3290:1: ( ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 ) )
            // InternalPubProto.g:3291:2: ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 )
            {
             before(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleAssignment_1()); 
            // InternalPubProto.g:3292:2: ( rule__ProtoDivisionBody__NumberingStyleAssignment_1 )
            // InternalPubProto.g:3292:3: rule__ProtoDivisionBody__NumberingStyleAssignment_1
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
    // InternalPubProto.g:3301:1: rule__ProtoPart__Group__0 : rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1 ;
    public final void rule__ProtoPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3305:1: ( rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1 )
            // InternalPubProto.g:3306:2: rule__ProtoPart__Group__0__Impl rule__ProtoPart__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPubProto.g:3313:1: rule__ProtoPart__Group__0__Impl : ( () ) ;
    public final void rule__ProtoPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3317:1: ( ( () ) )
            // InternalPubProto.g:3318:1: ( () )
            {
            // InternalPubProto.g:3318:1: ( () )
            // InternalPubProto.g:3319:2: ()
            {
             before(grammarAccess.getProtoPartAccess().getProtoPartAction_0()); 
            // InternalPubProto.g:3320:2: ()
            // InternalPubProto.g:3320:3: 
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
    // InternalPubProto.g:3328:1: rule__ProtoPart__Group__1 : rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2 ;
    public final void rule__ProtoPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3332:1: ( rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2 )
            // InternalPubProto.g:3333:2: rule__ProtoPart__Group__1__Impl rule__ProtoPart__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3340:1: rule__ProtoPart__Group__1__Impl : ( 'Part' ) ;
    public final void rule__ProtoPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3344:1: ( ( 'Part' ) )
            // InternalPubProto.g:3345:1: ( 'Part' )
            {
            // InternalPubProto.g:3345:1: ( 'Part' )
            // InternalPubProto.g:3346:2: 'Part'
            {
             before(grammarAccess.getProtoPartAccess().getPartKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPubProto.g:3355:1: rule__ProtoPart__Group__2 : rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3 ;
    public final void rule__ProtoPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3359:1: ( rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3 )
            // InternalPubProto.g:3360:2: rule__ProtoPart__Group__2__Impl rule__ProtoPart__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:3367:1: rule__ProtoPart__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3371:1: ( ( '{' ) )
            // InternalPubProto.g:3372:1: ( '{' )
            {
            // InternalPubProto.g:3372:1: ( '{' )
            // InternalPubProto.g:3373:2: '{'
            {
             before(grammarAccess.getProtoPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3382:1: rule__ProtoPart__Group__3 : rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4 ;
    public final void rule__ProtoPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3386:1: ( rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4 )
            // InternalPubProto.g:3387:2: rule__ProtoPart__Group__3__Impl rule__ProtoPart__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3394:1: rule__ProtoPart__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3398:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3399:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3399:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3400:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:3409:1: rule__ProtoPart__Group__4 : rule__ProtoPart__Group__4__Impl ;
    public final void rule__ProtoPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3413:1: ( rule__ProtoPart__Group__4__Impl )
            // InternalPubProto.g:3414:2: rule__ProtoPart__Group__4__Impl
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
    // InternalPubProto.g:3420:1: rule__ProtoPart__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3424:1: ( ( '}' ) )
            // InternalPubProto.g:3425:1: ( '}' )
            {
            // InternalPubProto.g:3425:1: ( '}' )
            // InternalPubProto.g:3426:2: '}'
            {
             before(grammarAccess.getProtoPartAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3436:1: rule__ProtoAppendix__Group__0 : rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1 ;
    public final void rule__ProtoAppendix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3440:1: ( rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1 )
            // InternalPubProto.g:3441:2: rule__ProtoAppendix__Group__0__Impl rule__ProtoAppendix__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPubProto.g:3448:1: rule__ProtoAppendix__Group__0__Impl : ( () ) ;
    public final void rule__ProtoAppendix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3452:1: ( ( () ) )
            // InternalPubProto.g:3453:1: ( () )
            {
            // InternalPubProto.g:3453:1: ( () )
            // InternalPubProto.g:3454:2: ()
            {
             before(grammarAccess.getProtoAppendixAccess().getProtoAppendixAction_0()); 
            // InternalPubProto.g:3455:2: ()
            // InternalPubProto.g:3455:3: 
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
    // InternalPubProto.g:3463:1: rule__ProtoAppendix__Group__1 : rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2 ;
    public final void rule__ProtoAppendix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3467:1: ( rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2 )
            // InternalPubProto.g:3468:2: rule__ProtoAppendix__Group__1__Impl rule__ProtoAppendix__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3475:1: rule__ProtoAppendix__Group__1__Impl : ( 'Appendix' ) ;
    public final void rule__ProtoAppendix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3479:1: ( ( 'Appendix' ) )
            // InternalPubProto.g:3480:1: ( 'Appendix' )
            {
            // InternalPubProto.g:3480:1: ( 'Appendix' )
            // InternalPubProto.g:3481:2: 'Appendix'
            {
             before(grammarAccess.getProtoAppendixAccess().getAppendixKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPubProto.g:3490:1: rule__ProtoAppendix__Group__2 : rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3 ;
    public final void rule__ProtoAppendix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3494:1: ( rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3 )
            // InternalPubProto.g:3495:2: rule__ProtoAppendix__Group__2__Impl rule__ProtoAppendix__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:3502:1: rule__ProtoAppendix__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoAppendix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3506:1: ( ( '{' ) )
            // InternalPubProto.g:3507:1: ( '{' )
            {
            // InternalPubProto.g:3507:1: ( '{' )
            // InternalPubProto.g:3508:2: '{'
            {
             before(grammarAccess.getProtoAppendixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3517:1: rule__ProtoAppendix__Group__3 : rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4 ;
    public final void rule__ProtoAppendix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3521:1: ( rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4 )
            // InternalPubProto.g:3522:2: rule__ProtoAppendix__Group__3__Impl rule__ProtoAppendix__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3529:1: rule__ProtoAppendix__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoAppendix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3533:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3534:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3534:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3535:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:3544:1: rule__ProtoAppendix__Group__4 : rule__ProtoAppendix__Group__4__Impl ;
    public final void rule__ProtoAppendix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3548:1: ( rule__ProtoAppendix__Group__4__Impl )
            // InternalPubProto.g:3549:2: rule__ProtoAppendix__Group__4__Impl
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
    // InternalPubProto.g:3555:1: rule__ProtoAppendix__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoAppendix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3559:1: ( ( '}' ) )
            // InternalPubProto.g:3560:1: ( '}' )
            {
            // InternalPubProto.g:3560:1: ( '}' )
            // InternalPubProto.g:3561:2: '}'
            {
             before(grammarAccess.getProtoAppendixAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3571:1: rule__ProtoChapter__Group__0 : rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1 ;
    public final void rule__ProtoChapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3575:1: ( rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1 )
            // InternalPubProto.g:3576:2: rule__ProtoChapter__Group__0__Impl rule__ProtoChapter__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPubProto.g:3583:1: rule__ProtoChapter__Group__0__Impl : ( () ) ;
    public final void rule__ProtoChapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3587:1: ( ( () ) )
            // InternalPubProto.g:3588:1: ( () )
            {
            // InternalPubProto.g:3588:1: ( () )
            // InternalPubProto.g:3589:2: ()
            {
             before(grammarAccess.getProtoChapterAccess().getProtoChapterAction_0()); 
            // InternalPubProto.g:3590:2: ()
            // InternalPubProto.g:3590:3: 
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
    // InternalPubProto.g:3598:1: rule__ProtoChapter__Group__1 : rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2 ;
    public final void rule__ProtoChapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3602:1: ( rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2 )
            // InternalPubProto.g:3603:2: rule__ProtoChapter__Group__1__Impl rule__ProtoChapter__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3610:1: rule__ProtoChapter__Group__1__Impl : ( 'Chapter' ) ;
    public final void rule__ProtoChapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3614:1: ( ( 'Chapter' ) )
            // InternalPubProto.g:3615:1: ( 'Chapter' )
            {
            // InternalPubProto.g:3615:1: ( 'Chapter' )
            // InternalPubProto.g:3616:2: 'Chapter'
            {
             before(grammarAccess.getProtoChapterAccess().getChapterKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPubProto.g:3625:1: rule__ProtoChapter__Group__2 : rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3 ;
    public final void rule__ProtoChapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3629:1: ( rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3 )
            // InternalPubProto.g:3630:2: rule__ProtoChapter__Group__2__Impl rule__ProtoChapter__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:3637:1: rule__ProtoChapter__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoChapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3641:1: ( ( '{' ) )
            // InternalPubProto.g:3642:1: ( '{' )
            {
            // InternalPubProto.g:3642:1: ( '{' )
            // InternalPubProto.g:3643:2: '{'
            {
             before(grammarAccess.getProtoChapterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3652:1: rule__ProtoChapter__Group__3 : rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4 ;
    public final void rule__ProtoChapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3656:1: ( rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4 )
            // InternalPubProto.g:3657:2: rule__ProtoChapter__Group__3__Impl rule__ProtoChapter__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3664:1: rule__ProtoChapter__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoChapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3668:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3669:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3669:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3670:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:3679:1: rule__ProtoChapter__Group__4 : rule__ProtoChapter__Group__4__Impl ;
    public final void rule__ProtoChapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3683:1: ( rule__ProtoChapter__Group__4__Impl )
            // InternalPubProto.g:3684:2: rule__ProtoChapter__Group__4__Impl
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
    // InternalPubProto.g:3690:1: rule__ProtoChapter__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoChapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3694:1: ( ( '}' ) )
            // InternalPubProto.g:3695:1: ( '}' )
            {
            // InternalPubProto.g:3695:1: ( '}' )
            // InternalPubProto.g:3696:2: '}'
            {
             before(grammarAccess.getProtoChapterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3706:1: rule__ProtoSection__Group__0 : rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1 ;
    public final void rule__ProtoSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3710:1: ( rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1 )
            // InternalPubProto.g:3711:2: rule__ProtoSection__Group__0__Impl rule__ProtoSection__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPubProto.g:3718:1: rule__ProtoSection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3722:1: ( ( () ) )
            // InternalPubProto.g:3723:1: ( () )
            {
            // InternalPubProto.g:3723:1: ( () )
            // InternalPubProto.g:3724:2: ()
            {
             before(grammarAccess.getProtoSectionAccess().getProtoSectionAction_0()); 
            // InternalPubProto.g:3725:2: ()
            // InternalPubProto.g:3725:3: 
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
    // InternalPubProto.g:3733:1: rule__ProtoSection__Group__1 : rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2 ;
    public final void rule__ProtoSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3737:1: ( rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2 )
            // InternalPubProto.g:3738:2: rule__ProtoSection__Group__1__Impl rule__ProtoSection__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3745:1: rule__ProtoSection__Group__1__Impl : ( 'Section' ) ;
    public final void rule__ProtoSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3749:1: ( ( 'Section' ) )
            // InternalPubProto.g:3750:1: ( 'Section' )
            {
            // InternalPubProto.g:3750:1: ( 'Section' )
            // InternalPubProto.g:3751:2: 'Section'
            {
             before(grammarAccess.getProtoSectionAccess().getSectionKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPubProto.g:3760:1: rule__ProtoSection__Group__2 : rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3 ;
    public final void rule__ProtoSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3764:1: ( rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3 )
            // InternalPubProto.g:3765:2: rule__ProtoSection__Group__2__Impl rule__ProtoSection__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:3772:1: rule__ProtoSection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3776:1: ( ( '{' ) )
            // InternalPubProto.g:3777:1: ( '{' )
            {
            // InternalPubProto.g:3777:1: ( '{' )
            // InternalPubProto.g:3778:2: '{'
            {
             before(grammarAccess.getProtoSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3787:1: rule__ProtoSection__Group__3 : rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4 ;
    public final void rule__ProtoSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3791:1: ( rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4 )
            // InternalPubProto.g:3792:2: rule__ProtoSection__Group__3__Impl rule__ProtoSection__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3799:1: rule__ProtoSection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3803:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3804:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3804:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3805:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:3814:1: rule__ProtoSection__Group__4 : rule__ProtoSection__Group__4__Impl ;
    public final void rule__ProtoSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3818:1: ( rule__ProtoSection__Group__4__Impl )
            // InternalPubProto.g:3819:2: rule__ProtoSection__Group__4__Impl
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
    // InternalPubProto.g:3825:1: rule__ProtoSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3829:1: ( ( '}' ) )
            // InternalPubProto.g:3830:1: ( '}' )
            {
            // InternalPubProto.g:3830:1: ( '}' )
            // InternalPubProto.g:3831:2: '}'
            {
             before(grammarAccess.getProtoSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3841:1: rule__ProtoSubsection__Group__0 : rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1 ;
    public final void rule__ProtoSubsection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3845:1: ( rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1 )
            // InternalPubProto.g:3846:2: rule__ProtoSubsection__Group__0__Impl rule__ProtoSubsection__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPubProto.g:3853:1: rule__ProtoSubsection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSubsection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3857:1: ( ( () ) )
            // InternalPubProto.g:3858:1: ( () )
            {
            // InternalPubProto.g:3858:1: ( () )
            // InternalPubProto.g:3859:2: ()
            {
             before(grammarAccess.getProtoSubsectionAccess().getProtoSubsectionAction_0()); 
            // InternalPubProto.g:3860:2: ()
            // InternalPubProto.g:3860:3: 
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
    // InternalPubProto.g:3868:1: rule__ProtoSubsection__Group__1 : rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2 ;
    public final void rule__ProtoSubsection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3872:1: ( rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2 )
            // InternalPubProto.g:3873:2: rule__ProtoSubsection__Group__1__Impl rule__ProtoSubsection__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:3880:1: rule__ProtoSubsection__Group__1__Impl : ( 'Sub' ) ;
    public final void rule__ProtoSubsection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3884:1: ( ( 'Sub' ) )
            // InternalPubProto.g:3885:1: ( 'Sub' )
            {
            // InternalPubProto.g:3885:1: ( 'Sub' )
            // InternalPubProto.g:3886:2: 'Sub'
            {
             before(grammarAccess.getProtoSubsectionAccess().getSubKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPubProto.g:3895:1: rule__ProtoSubsection__Group__2 : rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3 ;
    public final void rule__ProtoSubsection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3899:1: ( rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3 )
            // InternalPubProto.g:3900:2: rule__ProtoSubsection__Group__2__Impl rule__ProtoSubsection__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:3907:1: rule__ProtoSubsection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSubsection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3911:1: ( ( '{' ) )
            // InternalPubProto.g:3912:1: ( '{' )
            {
            // InternalPubProto.g:3912:1: ( '{' )
            // InternalPubProto.g:3913:2: '{'
            {
             before(grammarAccess.getProtoSubsectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:3922:1: rule__ProtoSubsection__Group__3 : rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4 ;
    public final void rule__ProtoSubsection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3926:1: ( rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4 )
            // InternalPubProto.g:3927:2: rule__ProtoSubsection__Group__3__Impl rule__ProtoSubsection__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:3934:1: rule__ProtoSubsection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSubsection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3938:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:3939:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:3939:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:3940:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:3949:1: rule__ProtoSubsection__Group__4 : rule__ProtoSubsection__Group__4__Impl ;
    public final void rule__ProtoSubsection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3953:1: ( rule__ProtoSubsection__Group__4__Impl )
            // InternalPubProto.g:3954:2: rule__ProtoSubsection__Group__4__Impl
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
    // InternalPubProto.g:3960:1: rule__ProtoSubsection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSubsection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3964:1: ( ( '}' ) )
            // InternalPubProto.g:3965:1: ( '}' )
            {
            // InternalPubProto.g:3965:1: ( '}' )
            // InternalPubProto.g:3966:2: '}'
            {
             before(grammarAccess.getProtoSubsectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:3976:1: rule__ProtoSubsubsection__Group__0 : rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1 ;
    public final void rule__ProtoSubsubsection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3980:1: ( rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1 )
            // InternalPubProto.g:3981:2: rule__ProtoSubsubsection__Group__0__Impl rule__ProtoSubsubsection__Group__1
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
    // InternalPubProto.g:3988:1: rule__ProtoSubsubsection__Group__0__Impl : ( () ) ;
    public final void rule__ProtoSubsubsection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:3992:1: ( ( () ) )
            // InternalPubProto.g:3993:1: ( () )
            {
            // InternalPubProto.g:3993:1: ( () )
            // InternalPubProto.g:3994:2: ()
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getProtoSubsubsectionAction_0()); 
            // InternalPubProto.g:3995:2: ()
            // InternalPubProto.g:3995:3: 
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
    // InternalPubProto.g:4003:1: rule__ProtoSubsubsection__Group__1 : rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2 ;
    public final void rule__ProtoSubsubsection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4007:1: ( rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2 )
            // InternalPubProto.g:4008:2: rule__ProtoSubsubsection__Group__1__Impl rule__ProtoSubsubsection__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPubProto.g:4015:1: rule__ProtoSubsubsection__Group__1__Impl : ( 'Subsub' ) ;
    public final void rule__ProtoSubsubsection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4019:1: ( ( 'Subsub' ) )
            // InternalPubProto.g:4020:1: ( 'Subsub' )
            {
            // InternalPubProto.g:4020:1: ( 'Subsub' )
            // InternalPubProto.g:4021:2: 'Subsub'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getSubsubKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPubProto.g:4030:1: rule__ProtoSubsubsection__Group__2 : rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3 ;
    public final void rule__ProtoSubsubsection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4034:1: ( rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3 )
            // InternalPubProto.g:4035:2: rule__ProtoSubsubsection__Group__2__Impl rule__ProtoSubsubsection__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPubProto.g:4042:1: rule__ProtoSubsubsection__Group__2__Impl : ( '{' ) ;
    public final void rule__ProtoSubsubsection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4046:1: ( ( '{' ) )
            // InternalPubProto.g:4047:1: ( '{' )
            {
            // InternalPubProto.g:4047:1: ( '{' )
            // InternalPubProto.g:4048:2: '{'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPubProto.g:4057:1: rule__ProtoSubsubsection__Group__3 : rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4 ;
    public final void rule__ProtoSubsubsection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4061:1: ( rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4 )
            // InternalPubProto.g:4062:2: rule__ProtoSubsubsection__Group__3__Impl rule__ProtoSubsubsection__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPubProto.g:4069:1: rule__ProtoSubsubsection__Group__3__Impl : ( ruleProtoDivisionBody ) ;
    public final void rule__ProtoSubsubsection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4073:1: ( ( ruleProtoDivisionBody ) )
            // InternalPubProto.g:4074:1: ( ruleProtoDivisionBody )
            {
            // InternalPubProto.g:4074:1: ( ruleProtoDivisionBody )
            // InternalPubProto.g:4075:2: ruleProtoDivisionBody
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
    // InternalPubProto.g:4084:1: rule__ProtoSubsubsection__Group__4 : rule__ProtoSubsubsection__Group__4__Impl ;
    public final void rule__ProtoSubsubsection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4088:1: ( rule__ProtoSubsubsection__Group__4__Impl )
            // InternalPubProto.g:4089:2: rule__ProtoSubsubsection__Group__4__Impl
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
    // InternalPubProto.g:4095:1: rule__ProtoSubsubsection__Group__4__Impl : ( '}' ) ;
    public final void rule__ProtoSubsubsection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4099:1: ( ( '}' ) )
            // InternalPubProto.g:4100:1: ( '}' )
            {
            // InternalPubProto.g:4100:1: ( '}' )
            // InternalPubProto.g:4101:2: '}'
            {
             before(grammarAccess.getProtoSubsubsectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPubProto.g:4111:1: rule__PublicationClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PublicationClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4115:1: ( ( RULE_ID ) )
            // InternalPubProto.g:4116:2: ( RULE_ID )
            {
            // InternalPubProto.g:4116:2: ( RULE_ID )
            // InternalPubProto.g:4117:3: RULE_ID
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
    // InternalPubProto.g:4126:1: rule__PublicationClass__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__PublicationClass__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4130:1: ( ( RULE_STRING ) )
            // InternalPubProto.g:4131:2: ( RULE_STRING )
            {
            // InternalPubProto.g:4131:2: ( RULE_STRING )
            // InternalPubProto.g:4132:3: RULE_STRING
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
    // InternalPubProto.g:4141:1: rule__PublicationClass__NatureAssignment_6 : ( rulePublicationNature ) ;
    public final void rule__PublicationClass__NatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4145:1: ( ( rulePublicationNature ) )
            // InternalPubProto.g:4146:2: ( rulePublicationNature )
            {
            // InternalPubProto.g:4146:2: ( rulePublicationNature )
            // InternalPubProto.g:4147:3: rulePublicationNature
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


    // $ANTLR start "rule__PublicationClass__SegmentsAssignment_8"
    // InternalPubProto.g:4156:1: rule__PublicationClass__SegmentsAssignment_8 : ( ruleProtoDocumentSegment ) ;
    public final void rule__PublicationClass__SegmentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4160:1: ( ( ruleProtoDocumentSegment ) )
            // InternalPubProto.g:4161:2: ( ruleProtoDocumentSegment )
            {
            // InternalPubProto.g:4161:2: ( ruleProtoDocumentSegment )
            // InternalPubProto.g:4162:3: ruleProtoDocumentSegment
            {
             before(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleProtoDocumentSegment();

            state._fsp--;

             after(grammarAccess.getPublicationClassAccess().getSegmentsProtoDocumentSegmentParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__PublicationClass__SegmentsAssignment_8"


    // $ANTLR start "rule__PublicationClass__DivisionsAssignment_10"
    // InternalPubProto.g:4171:1: rule__PublicationClass__DivisionsAssignment_10 : ( ruleProtoDivision ) ;
    public final void rule__PublicationClass__DivisionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4175:1: ( ( ruleProtoDivision ) )
            // InternalPubProto.g:4176:2: ( ruleProtoDivision )
            {
            // InternalPubProto.g:4176:2: ( ruleProtoDivision )
            // InternalPubProto.g:4177:3: ruleProtoDivision
            {
             before(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleProtoDivision();

            state._fsp--;

             after(grammarAccess.getPublicationClassAccess().getDivisionsProtoDivisionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__PublicationClass__DivisionsAssignment_10"


    // $ANTLR start "rule__SegmentBody__TitleAssignment_0_1"
    // InternalPubProto.g:4186:1: rule__SegmentBody__TitleAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__SegmentBody__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4190:1: ( ( RULE_STRING ) )
            // InternalPubProto.g:4191:2: ( RULE_STRING )
            {
            // InternalPubProto.g:4191:2: ( RULE_STRING )
            // InternalPubProto.g:4192:3: RULE_STRING
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
    // InternalPubProto.g:4201:1: rule__SegmentBody__OptionalAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__SegmentBody__OptionalAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4205:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4206:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4206:2: ( ( 'true' ) )
            // InternalPubProto.g:4207:3: ( 'true' )
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 
            // InternalPubProto.g:4208:3: ( 'true' )
            // InternalPubProto.g:4209:4: 'true'
            {
             before(grammarAccess.getSegmentBodyAccess().getOptionalTrueKeyword_1_1_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPubProto.g:4220:1: rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4224:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4225:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4225:2: ( ( 'true' ) )
            // InternalPubProto.g:4226:3: ( 'true' )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 
            // InternalPubProto.g:4227:3: ( 'true' )
            // InternalPubProto.g:4228:4: 'true'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsTrueKeyword_3_1_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPubProto.g:4239:1: rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4243:1: ( ( ( 'true' ) ) )
            // InternalPubProto.g:4244:2: ( ( 'true' ) )
            {
            // InternalPubProto.g:4244:2: ( ( 'true' ) )
            // InternalPubProto.g:4245:3: ( 'true' )
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 
            // InternalPubProto.g:4246:3: ( 'true' )
            // InternalPubProto.g:4247:4: 'true'
            {
             before(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixTrueKeyword_4_1_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPubProto.g:4258:1: rule__ProtoTOC__MaxLevelAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ProtoTOC__MaxLevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4262:1: ( ( RULE_INT ) )
            // InternalPubProto.g:4263:2: ( RULE_INT )
            {
            // InternalPubProto.g:4263:2: ( RULE_INT )
            // InternalPubProto.g:4264:3: RULE_INT
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
    // InternalPubProto.g:4273:1: rule__ProtoDivisionBody__NumberingStyleAssignment_1 : ( ruleProtoSequenceNumberStyle ) ;
    public final void rule__ProtoDivisionBody__NumberingStyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPubProto.g:4277:1: ( ( ruleProtoSequenceNumberStyle ) )
            // InternalPubProto.g:4278:2: ( ruleProtoSequenceNumberStyle )
            {
            // InternalPubProto.g:4278:2: ( ruleProtoSequenceNumberStyle )
            // InternalPubProto.g:4279:3: ruleProtoSequenceNumberStyle
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000FD9C9000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000FD9C8000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0007E00000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000620000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000FD9C8000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});

}