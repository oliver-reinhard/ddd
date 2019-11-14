package com.mimacom.ddd.dm.dom.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomLexer extends Lexer {
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

    public InternalDomLexer() {;} 
    public InternalDomLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDom.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:11:7: ( 'domain' )
            // InternalDom.g:11:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:12:7: ( 'snapshot' )
            // InternalDom.g:12:9: 'snapshot'
            {
            match("snapshot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:13:7: ( '{' )
            // InternalDom.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:14:7: ( '}' )
            // InternalDom.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:15:7: ( '=' )
            // InternalDom.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:16:7: ( 'entity' )
            // InternalDom.g:16:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:17:7: ( 'detail' )
            // InternalDom.g:17:9: 'detail'
            {
            match("detail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:18:7: ( 'import' )
            // InternalDom.g:18:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:19:7: ( 'test' )
            // InternalDom.g:19:9: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:20:7: ( 'context' )
            // InternalDom.g:20:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:21:7: ( ',' )
            // InternalDom.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:22:7: ( ':' )
            // InternalDom.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:23:7: ( 'in' )
            // InternalDom.g:23:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:24:7: ( '(' )
            // InternalDom.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:25:7: ( ')' )
            // InternalDom.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:26:7: ( 'archetype' )
            // InternalDom.g:26:9: 'archetype'
            {
            match("archetype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:27:7: ( 'is' )
            // InternalDom.g:27:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:28:7: ( 'filter' )
            // InternalDom.g:28:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:29:7: ( 'with' )
            // InternalDom.g:29:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:30:7: ( '*' )
            // InternalDom.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:31:7: ( '.' )
            // InternalDom.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:32:7: ( '@before' )
            // InternalDom.g:32:9: '@before'
            {
            match("@before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:33:7: ( ':=' )
            // InternalDom.g:33:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:34:7: ( '|' )
            // InternalDom.g:34:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:35:7: ( 'ISA' )
            // InternalDom.g:35:9: 'ISA'
            {
            match("ISA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:36:7: ( 'isa' )
            // InternalDom.g:36:9: 'isa'
            {
            match("isa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:37:7: ( 'AS' )
            // InternalDom.g:37:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:38:7: ( 'as' )
            // InternalDom.g:38:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:39:7: ( 'NEW' )
            // InternalDom.g:39:9: 'NEW'
            {
            match("NEW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:40:7: ( 'new' )
            // InternalDom.g:40:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:41:7: ( '[' )
            // InternalDom.g:41:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:42:7: ( '#' )
            // InternalDom.g:42:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:43:7: ( ']' )
            // InternalDom.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:44:7: ( 'all' )
            // InternalDom.g:44:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:45:7: ( 'if' )
            // InternalDom.g:45:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:46:7: ( 'then' )
            // InternalDom.g:46:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:47:7: ( 'else' )
            // InternalDom.g:47:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:48:7: ( 'end' )
            // InternalDom.g:48:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:49:7: ( '..' )
            // InternalDom.g:49:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:50:7: ( 'TRUE' )
            // InternalDom.g:50:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:51:7: ( 'true' )
            // InternalDom.g:51:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:52:7: ( 'FALSE' )
            // InternalDom.g:52:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:53:7: ( 'false' )
            // InternalDom.g:53:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:54:7: ( 'UNDEFINED' )
            // InternalDom.g:54:9: 'UNDEFINED'
            {
            match("UNDEFINED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:55:7: ( 'undefined' )
            // InternalDom.g:55:9: 'undefined'
            {
            match("undefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:56:7: ( 'E' )
            // InternalDom.g:56:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:57:7: ( 'e' )
            // InternalDom.g:57:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:58:7: ( '+' )
            // InternalDom.g:58:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:59:7: ( '-' )
            // InternalDom.g:59:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:60:7: ( '.*' )
            // InternalDom.g:60:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:61:7: ( 'VOID' )
            // InternalDom.g:61:9: 'VOID'
            {
            match("VOID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:62:7: ( 'BOOLEAN' )
            // InternalDom.g:62:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:63:7: ( 'NUMBER' )
            // InternalDom.g:63:9: 'NUMBER'
            {
            match("NUMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:64:7: ( 'TEXT' )
            // InternalDom.g:64:9: 'TEXT'
            {
            match("TEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:65:7: ( 'IDENTIFIER' )
            // InternalDom.g:65:9: 'IDENTIFIER'
            {
            match("IDENTIFIER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:66:7: ( 'TIMEPOINT' )
            // InternalDom.g:66:9: 'TIMEPOINT'
            {
            match("TIMEPOINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:67:7: ( 'STATE' )
            // InternalDom.g:67:9: 'STATE'
            {
            match("STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:68:7: ( 'STATE_EVENT' )
            // InternalDom.g:68:9: 'STATE_EVENT'
            {
            match("STATE_EVENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:69:7: ( 'COMPLEX' )
            // InternalDom.g:69:9: 'COMPLEX'
            {
            match("COMPLEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:70:7: ( 'NOTIFICATION' )
            // InternalDom.g:70:9: 'NOTIFICATION'
            {
            match("NOTIFICATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:71:7: ( 'SERVICE' )
            // InternalDom.g:71:9: 'SERVICE'
            {
            match("SERVICE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:72:7: ( 'OR' )
            // InternalDom.g:72:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:73:7: ( 'or' )
            // InternalDom.g:73:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:74:7: ( 'XOR' )
            // InternalDom.g:74:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:75:7: ( 'xor' )
            // InternalDom.g:75:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:76:7: ( 'AND' )
            // InternalDom.g:76:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:77:7: ( 'and' )
            // InternalDom.g:77:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:78:7: ( '!=' )
            // InternalDom.g:78:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:79:7: ( '<>' )
            // InternalDom.g:79:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:80:7: ( '<' )
            // InternalDom.g:80:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:81:7: ( '<=' )
            // InternalDom.g:81:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:82:7: ( '\\u2264' )
            // InternalDom.g:82:9: '\\u2264'
            {
            match('\u2264'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:83:7: ( '>=' )
            // InternalDom.g:83:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:84:7: ( '\\u2265' )
            // InternalDom.g:84:9: '\\u2265'
            {
            match('\u2265'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:85:7: ( '>' )
            // InternalDom.g:85:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:86:7: ( 'IN' )
            // InternalDom.g:86:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:87:7: ( '->' )
            // InternalDom.g:87:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:88:7: ( '=>' )
            // InternalDom.g:88:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:89:7: ( '/' )
            // InternalDom.g:89:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:90:7: ( '**' )
            // InternalDom.g:90:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:91:7: ( '%' )
            // InternalDom.g:91:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:92:7: ( '!' )
            // InternalDom.g:92:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:93:7: ( 'NOT' )
            // InternalDom.g:93:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:94:8: ( 'not' )
            // InternalDom.g:94:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:95:8: ( '?' )
            // InternalDom.g:95:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4650:9: ( ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )* )
            // InternalDom.g:4650:11: ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )*
            {
            // InternalDom.g:4650:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDom.g:4650:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDom.g:4650:34: ( RULE_LETTER | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDom.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4652:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalDom.g:4652:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalDom.g:4652:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDom.g:4652:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDom.g:4652:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_NATURAL"
    public final void mRULE_NATURAL() throws RecognitionException {
        try {
            int _type = RULE_NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4654:14: ( ( ( '0' .. '9' )+ | '\\u221E' ) )
            // InternalDom.g:4654:16: ( ( '0' .. '9' )+ | '\\u221E' )
            {
            // InternalDom.g:4654:16: ( ( '0' .. '9' )+ | '\\u221E' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='\u221E') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDom.g:4654:17: ( '0' .. '9' )+
                    {
                    // InternalDom.g:4654:17: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDom.g:4654:18: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalDom.g:4654:29: '\\u221E'
                    {
                    match('\u221E'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NATURAL"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalDom.g:4656:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' ) )
            // InternalDom.g:4656:24: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_PLAIN_TEXT"
    public final void mRULE_PLAIN_TEXT() throws RecognitionException {
        try {
            // InternalDom.g:4658:26: (~ ( ( '\\u00BB' | ']' | '[' ) ) )
            // InternalDom.g:4658:28: ~ ( ( '\\u00BB' | ']' | '[' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_TEXT"

    // $ANTLR start "RULE_PLAIN_TEXT_ONLY"
    public final void mRULE_PLAIN_TEXT_ONLY() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_TEXT_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4660:22: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalDom.g:4660:24: '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match('\u00AB'); 
            // InternalDom.g:4660:33: ( RULE_PLAIN_TEXT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='Z')||LA6_0=='\\'||(LA6_0>='^' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDom.g:4660:33: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\u00BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_TEXT_ONLY"

    // $ANTLR start "RULE_PLAIN_TEXT_START"
    public final void mRULE_PLAIN_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4662:23: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '[' )
            // InternalDom.g:4662:25: '\\u00AB' ( RULE_PLAIN_TEXT )* '['
            {
            match('\u00AB'); 
            // InternalDom.g:4662:34: ( RULE_PLAIN_TEXT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='Z')||LA7_0=='\\'||(LA7_0>='^' && LA7_0<='\u00BA')||(LA7_0>='\u00BC' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDom.g:4662:34: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_TEXT_START"

    // $ANTLR start "RULE_PLAIN_TEXT_MIDDLE"
    public final void mRULE_PLAIN_TEXT_MIDDLE() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_TEXT_MIDDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4664:24: ( ']' ( RULE_PLAIN_TEXT )* '[' )
            // InternalDom.g:4664:26: ']' ( RULE_PLAIN_TEXT )* '['
            {
            match(']'); 
            // InternalDom.g:4664:30: ( RULE_PLAIN_TEXT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='Z')||LA8_0=='\\'||(LA8_0>='^' && LA8_0<='\u00BA')||(LA8_0>='\u00BC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDom.g:4664:30: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_TEXT_MIDDLE"

    // $ANTLR start "RULE_PLAIN_TEXT_END"
    public final void mRULE_PLAIN_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4666:21: ( ']' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalDom.g:4666:23: ']' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match(']'); 
            // InternalDom.g:4666:27: ( RULE_PLAIN_TEXT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='Z')||LA9_0=='\\'||(LA9_0>='^' && LA9_0<='\u00BA')||(LA9_0>='\u00BC' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDom.g:4666:27: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\u00BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_TEXT_END"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4668:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDom.g:4668:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDom.g:4668:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDom.g:4668:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4670:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDom.g:4670:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDom.g:4670:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDom.g:4670:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDom.g:4670:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDom.g:4670:41: ( '\\r' )? '\\n'
                    {
                    // InternalDom.g:4670:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDom.g:4670:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4672:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDom.g:4672:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDom.g:4672:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDom.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDom.g:4674:16: ( . )
            // InternalDom.g:4674:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDom.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=96;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalDom.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalDom.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalDom.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalDom.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalDom.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalDom.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalDom.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalDom.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalDom.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalDom.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalDom.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalDom.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalDom.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalDom.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalDom.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalDom.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalDom.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalDom.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalDom.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalDom.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalDom.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalDom.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalDom.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalDom.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalDom.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalDom.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalDom.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalDom.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalDom.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalDom.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalDom.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalDom.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalDom.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalDom.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalDom.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalDom.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalDom.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalDom.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalDom.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalDom.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalDom.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalDom.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalDom.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalDom.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalDom.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalDom.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalDom.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalDom.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalDom.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalDom.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalDom.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalDom.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalDom.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalDom.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalDom.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalDom.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalDom.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalDom.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalDom.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalDom.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalDom.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalDom.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalDom.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalDom.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalDom.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalDom.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalDom.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalDom.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalDom.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalDom.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalDom.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalDom.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalDom.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalDom.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalDom.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalDom.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalDom.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalDom.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalDom.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalDom.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalDom.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalDom.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalDom.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalDom.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalDom.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalDom.g:1:522: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 87 :
                // InternalDom.g:1:530: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // InternalDom.g:1:542: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 89 :
                // InternalDom.g:1:555: RULE_PLAIN_TEXT_ONLY
                {
                mRULE_PLAIN_TEXT_ONLY(); 

                }
                break;
            case 90 :
                // InternalDom.g:1:576: RULE_PLAIN_TEXT_START
                {
                mRULE_PLAIN_TEXT_START(); 

                }
                break;
            case 91 :
                // InternalDom.g:1:598: RULE_PLAIN_TEXT_MIDDLE
                {
                mRULE_PLAIN_TEXT_MIDDLE(); 

                }
                break;
            case 92 :
                // InternalDom.g:1:621: RULE_PLAIN_TEXT_END
                {
                mRULE_PLAIN_TEXT_END(); 

                }
                break;
            case 93 :
                // InternalDom.g:1:641: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 94 :
                // InternalDom.g:1:657: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 95 :
                // InternalDom.g:1:673: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // InternalDom.g:1:681: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\75\2\uffff\1\102\1\105\3\75\1\uffff\1\120\2\uffff\3\75\1\133\1\136\1\72\1\uffff\4\75\2\uffff\1\157\4\75\1\167\1\uffff\1\172\10\75\1\u0085\1\u0088\1\uffff\1\u008b\1\uffff\1\u008f\2\uffff\1\72\1\uffff\1\72\2\uffff\1\72\2\uffff\2\75\1\uffff\1\75\4\uffff\2\75\1\uffff\1\75\1\u009f\1\u00a1\1\u00a2\4\75\5\uffff\1\75\1\u00a8\5\75\7\uffff\2\75\1\u00b0\1\u00b1\6\75\6\uffff\6\75\4\uffff\5\75\1\u00c3\1\u00c4\2\75\24\uffff\4\75\1\u00cb\2\75\1\uffff\1\u00ce\2\uffff\5\75\1\uffff\1\u00d4\1\u00d5\3\75\1\u00d9\1\75\2\uffff\1\u00db\1\u00dc\1\75\1\u00df\1\u00e0\1\u00e1\13\75\2\uffff\1\u00ed\1\u00ee\4\75\1\uffff\1\u00f3\1\75\1\uffff\1\u00f5\1\u00f6\1\u00f7\2\75\2\uffff\2\75\1\u00fc\1\uffff\1\75\2\uffff\2\75\3\uffff\1\u0100\1\u0101\4\75\1\u0106\4\75\2\uffff\4\75\1\uffff\1\75\3\uffff\3\75\1\u0113\1\uffff\3\75\2\uffff\1\75\1\u0118\2\75\1\uffff\1\75\1\u011d\2\75\1\u0120\1\u0121\1\75\1\u0123\1\u0124\2\75\1\u0127\1\uffff\1\75\1\u0129\2\75\1\uffff\4\75\1\uffff\2\75\2\uffff\1\75\2\uffff\1\u0133\1\75\1\uffff\1\75\1\uffff\4\75\1\u013a\1\75\1\u013c\1\u013d\1\u013e\1\uffff\6\75\1\uffff\1\75\3\uffff\1\u0146\2\75\1\u0149\1\u014a\1\u014b\1\75\1\uffff\1\u014d\1\75\3\uffff\1\75\1\uffff\1\75\1\u0151\1\u0152\2\uffff";
    static final String DFA15_eofS =
        "\u0153\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\156\2\uffff\1\76\1\60\1\146\1\145\1\157\1\uffff\1\75\2\uffff\1\154\1\141\1\151\2\52\1\142\1\uffff\1\104\1\116\1\105\1\145\2\uffff\1\0\1\105\1\101\1\116\1\156\1\60\1\uffff\1\76\2\117\1\105\1\117\1\122\1\162\1\117\1\157\2\75\1\uffff\1\75\1\uffff\1\52\2\uffff\1\101\1\uffff\1\0\2\uffff\1\0\2\uffff\1\155\1\164\1\uffff\1\141\4\uffff\1\144\1\163\1\uffff\1\160\3\60\1\163\1\145\1\165\1\156\5\uffff\1\143\1\60\1\154\1\144\2\154\1\164\7\uffff\1\101\1\105\2\60\1\104\1\127\1\115\1\124\1\167\1\164\2\uffff\1\0\3\uffff\1\125\1\130\1\115\1\114\1\104\1\144\4\uffff\1\111\1\117\1\101\1\122\1\115\2\60\1\122\1\162\20\uffff\1\0\3\uffff\2\141\1\160\1\151\1\60\1\145\1\157\1\uffff\1\60\2\uffff\1\164\1\156\1\145\1\164\1\150\1\uffff\2\60\1\164\1\163\1\150\1\60\1\116\2\uffff\2\60\1\102\3\60\1\105\1\124\1\105\1\123\1\105\1\145\1\104\1\114\1\124\1\126\1\120\2\uffff\2\60\2\151\1\163\1\164\1\uffff\1\60\1\162\1\uffff\3\60\2\145\2\uffff\2\145\1\60\1\uffff\1\124\2\uffff\1\105\1\106\3\uffff\2\60\1\120\1\105\1\106\1\146\1\60\2\105\1\111\1\114\2\uffff\1\156\1\154\1\150\1\171\1\uffff\1\164\3\uffff\1\170\1\164\1\162\1\60\1\uffff\1\111\1\122\1\111\2\uffff\1\117\1\60\1\111\1\151\1\uffff\1\101\1\60\1\103\1\105\2\60\1\157\2\60\1\164\1\171\1\60\1\uffff\1\106\1\60\1\103\1\111\1\uffff\1\116\1\156\1\116\1\105\1\uffff\1\105\1\130\2\uffff\1\164\2\uffff\1\60\1\160\1\uffff\1\111\1\uffff\1\101\1\116\1\105\1\145\1\60\1\126\3\60\1\uffff\1\145\1\105\2\124\1\104\1\144\1\uffff\1\105\3\uffff\1\60\1\122\1\111\3\60\1\116\1\uffff\1\60\1\117\3\uffff\1\124\1\uffff\1\116\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\157\1\156\2\uffff\1\76\1\u00ff\1\163\1\162\1\157\1\uffff\1\75\2\uffff\1\163\2\151\1\52\1\56\1\142\1\uffff\2\123\1\125\1\157\2\uffff\1\uffff\1\122\1\101\1\116\1\156\1\u00ff\1\uffff\1\76\2\117\1\124\1\117\1\122\1\162\1\117\1\157\1\75\1\76\1\uffff\1\75\1\uffff\1\57\2\uffff\1\u00ff\1\uffff\1\uffff\2\uffff\1\uffff\2\uffff\1\155\1\164\1\uffff\1\141\4\uffff\1\164\1\163\1\uffff\1\160\3\u00ff\1\163\1\145\1\165\1\156\5\uffff\1\143\1\u00ff\1\154\1\144\2\154\1\164\7\uffff\1\101\1\105\2\u00ff\1\104\1\127\1\115\1\124\1\167\1\164\2\uffff\1\uffff\3\uffff\1\125\1\130\1\115\1\114\1\104\1\144\4\uffff\1\111\1\117\1\101\1\122\1\115\2\u00ff\1\122\1\162\20\uffff\1\uffff\3\uffff\2\141\1\160\1\151\1\u00ff\1\145\1\157\1\uffff\1\u00ff\2\uffff\1\164\1\156\1\145\1\164\1\150\1\uffff\2\u00ff\1\164\1\163\1\150\1\u00ff\1\116\2\uffff\2\u00ff\1\102\3\u00ff\1\105\1\124\1\105\1\123\1\105\1\145\1\104\1\114\1\124\1\126\1\120\2\uffff\2\u00ff\2\151\1\163\1\164\1\uffff\1\u00ff\1\162\1\uffff\3\u00ff\2\145\2\uffff\2\145\1\u00ff\1\uffff\1\124\2\uffff\1\105\1\106\3\uffff\2\u00ff\1\120\1\105\1\106\1\146\1\u00ff\2\105\1\111\1\114\2\uffff\1\156\1\154\1\150\1\171\1\uffff\1\164\3\uffff\1\170\1\164\1\162\1\u00ff\1\uffff\1\111\1\122\1\111\2\uffff\1\117\1\u00ff\1\111\1\151\1\uffff\1\101\1\u00ff\1\103\1\105\2\u00ff\1\157\2\u00ff\1\164\1\171\1\u00ff\1\uffff\1\106\1\u00ff\1\103\1\111\1\uffff\1\116\1\156\1\116\1\105\1\uffff\1\105\1\130\2\uffff\1\164\2\uffff\1\u00ff\1\160\1\uffff\1\111\1\uffff\1\101\1\116\1\105\1\145\1\u00ff\1\126\3\u00ff\1\uffff\1\145\1\105\2\124\1\104\1\144\1\uffff\1\105\3\uffff\1\u00ff\1\122\1\111\3\u00ff\1\116\1\uffff\1\u00ff\1\117\3\uffff\1\124\1\uffff\1\116\2\u00ff\2\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\5\uffff\1\13\1\uffff\1\16\1\17\6\uffff\1\30\4\uffff\1\37\1\40\6\uffff\1\60\13\uffff\1\110\1\uffff\1\112\1\uffff\1\121\1\125\1\uffff\1\126\1\uffff\2\130\1\uffff\1\137\1\140\2\uffff\1\126\1\uffff\1\3\1\4\1\116\1\5\2\uffff\1\57\10\uffff\1\13\1\27\1\14\1\16\1\17\7\uffff\1\120\1\24\1\47\1\62\1\25\1\26\1\30\12\uffff\1\37\1\40\1\uffff\1\133\1\41\1\134\6\uffff\1\56\1\60\1\115\1\61\11\uffff\1\104\1\122\1\105\1\107\1\106\1\110\1\111\1\113\1\112\1\135\1\136\1\117\1\121\1\125\1\127\1\130\1\uffff\1\132\1\131\1\137\7\uffff\1\15\1\uffff\1\21\1\43\5\uffff\1\34\7\uffff\1\114\1\33\21\uffff\1\76\1\77\6\uffff\1\46\2\uffff\1\32\5\uffff\1\42\1\103\3\uffff\1\31\1\uffff\1\102\1\35\2\uffff\1\123\1\36\1\124\13\uffff\1\100\1\101\4\uffff\1\45\1\uffff\1\11\1\44\1\51\4\uffff\1\23\3\uffff\1\50\1\66\4\uffff\1\63\14\uffff\1\53\4\uffff\1\52\4\uffff\1\71\2\uffff\1\1\1\7\1\uffff\1\6\1\10\2\uffff\1\22\1\uffff\1\65\11\uffff\1\12\6\uffff\1\64\1\uffff\1\75\1\73\1\2\7\uffff\1\20\2\uffff\1\70\1\54\1\55\1\uffff\1\67\3\uffff\1\72\1\74";
    static final String DFA15_specialS =
        "\1\0\32\uffff\1\3\31\uffff\1\1\2\uffff\1\4\64\uffff\1\5\46\uffff\1\2\u00be\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\72\2\71\2\72\1\71\22\72\1\71\1\53\1\65\1\32\1\72\1\61\2\72\1\14\1\15\1\21\1\41\1\12\1\42\1\22\1\60\12\66\1\13\1\72\1\54\1\5\1\56\1\62\1\23\1\26\1\44\1\46\1\64\1\40\1\35\2\64\1\25\4\64\1\27\1\47\3\64\1\45\1\34\1\36\1\43\1\64\1\51\2\64\1\31\1\72\1\33\1\63\1\64\1\72\1\16\1\64\1\11\1\1\1\6\1\17\2\64\1\7\4\64\1\30\1\50\3\64\1\2\1\10\1\37\1\64\1\20\1\52\2\64\1\3\1\24\1\4\55\72\1\70\24\72\27\64\1\72\37\64\1\72\10\64\u211e\72\1\67\105\72\1\55\1\57\udd9a\72",
            "\1\74\11\uffff\1\73",
            "\1\76",
            "",
            "",
            "\1\101",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75\1\104\1\75\1\103\14\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\111\6\uffff\1\106\1\107\4\uffff\1\110",
            "\1\112\2\uffff\1\113\11\uffff\1\114",
            "\1\115",
            "",
            "\1\117",
            "",
            "",
            "\1\125\1\uffff\1\126\3\uffff\1\123\1\124",
            "\1\130\7\uffff\1\127",
            "\1\131",
            "\1\132",
            "\1\135\3\uffff\1\134",
            "\1\137",
            "",
            "\1\142\11\uffff\1\143\4\uffff\1\141",
            "\1\145\4\uffff\1\144",
            "\1\146\11\uffff\1\150\5\uffff\1\147",
            "\1\151\11\uffff\1\152",
            "",
            "",
            "\133\155\1\156\1\155\1\uffff\135\155\1\160\uff44\155",
            "\1\162\3\uffff\1\163\10\uffff\1\161",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\1\171",
            "\1\173",
            "\1\174",
            "\1\176\16\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0087\1\u0086",
            "",
            "\1\u008a",
            "",
            "\1\u008d\4\uffff\1\u008e",
            "",
            "",
            "\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\0\u0092",
            "",
            "",
            "\133\u0094\1\u0095\1\u0094\1\uffff\135\u0094\1\u0096\uff44\u0094",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "\1\u009c\17\uffff\1\u009b",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\u00a0\31\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\133\155\1\156\1\155\1\uffff\135\155\1\160\uff44\155",
            "",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00c5",
            "\1\u00c6",
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
            "\133\u0094\1\u0095\1\u0094\1\uffff\135\u0094\1\u0096\uff44\u0094",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00da",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00dd",
            "\12\75\7\uffff\10\75\1\u00de\21\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00f4",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\1\u00fd",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "",
            "",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "\1\u0117",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\12\75\7\uffff\32\75\4\uffff\1\u011c\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u011e",
            "\1\u011f",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0122",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0125",
            "\1\u0126",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\1\u0128",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "\1\u0132",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0134",
            "",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u013b",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u0147",
            "\1\u0148",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u014c",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\1\u014e",
            "",
            "",
            "",
            "\1\u014f",
            "",
            "\1\u0150",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75\105\uffff\27\75\1\uffff\37\75\1\uffff\10\75",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='d') ) {s = 1;}

                        else if ( (LA15_0=='s') ) {s = 2;}

                        else if ( (LA15_0=='{') ) {s = 3;}

                        else if ( (LA15_0=='}') ) {s = 4;}

                        else if ( (LA15_0=='=') ) {s = 5;}

                        else if ( (LA15_0=='e') ) {s = 6;}

                        else if ( (LA15_0=='i') ) {s = 7;}

                        else if ( (LA15_0=='t') ) {s = 8;}

                        else if ( (LA15_0=='c') ) {s = 9;}

                        else if ( (LA15_0==',') ) {s = 10;}

                        else if ( (LA15_0==':') ) {s = 11;}

                        else if ( (LA15_0=='(') ) {s = 12;}

                        else if ( (LA15_0==')') ) {s = 13;}

                        else if ( (LA15_0=='a') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0=='w') ) {s = 16;}

                        else if ( (LA15_0=='*') ) {s = 17;}

                        else if ( (LA15_0=='.') ) {s = 18;}

                        else if ( (LA15_0=='@') ) {s = 19;}

                        else if ( (LA15_0=='|') ) {s = 20;}

                        else if ( (LA15_0=='I') ) {s = 21;}

                        else if ( (LA15_0=='A') ) {s = 22;}

                        else if ( (LA15_0=='N') ) {s = 23;}

                        else if ( (LA15_0=='n') ) {s = 24;}

                        else if ( (LA15_0=='[') ) {s = 25;}

                        else if ( (LA15_0=='#') ) {s = 26;}

                        else if ( (LA15_0==']') ) {s = 27;}

                        else if ( (LA15_0=='T') ) {s = 28;}

                        else if ( (LA15_0=='F') ) {s = 29;}

                        else if ( (LA15_0=='U') ) {s = 30;}

                        else if ( (LA15_0=='u') ) {s = 31;}

                        else if ( (LA15_0=='E') ) {s = 32;}

                        else if ( (LA15_0=='+') ) {s = 33;}

                        else if ( (LA15_0=='-') ) {s = 34;}

                        else if ( (LA15_0=='V') ) {s = 35;}

                        else if ( (LA15_0=='B') ) {s = 36;}

                        else if ( (LA15_0=='S') ) {s = 37;}

                        else if ( (LA15_0=='C') ) {s = 38;}

                        else if ( (LA15_0=='O') ) {s = 39;}

                        else if ( (LA15_0=='o') ) {s = 40;}

                        else if ( (LA15_0=='X') ) {s = 41;}

                        else if ( (LA15_0=='x') ) {s = 42;}

                        else if ( (LA15_0=='!') ) {s = 43;}

                        else if ( (LA15_0=='<') ) {s = 44;}

                        else if ( (LA15_0=='\u2264') ) {s = 45;}

                        else if ( (LA15_0=='>') ) {s = 46;}

                        else if ( (LA15_0=='\u2265') ) {s = 47;}

                        else if ( (LA15_0=='/') ) {s = 48;}

                        else if ( (LA15_0=='%') ) {s = 49;}

                        else if ( (LA15_0=='?') ) {s = 50;}

                        else if ( (LA15_0=='^') ) {s = 51;}

                        else if ( (LA15_0=='D'||(LA15_0>='G' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='M')||(LA15_0>='P' && LA15_0<='R')||LA15_0=='W'||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='m')||(LA15_0>='p' && LA15_0<='r')||LA15_0=='v'||(LA15_0>='y' && LA15_0<='z')||(LA15_0>='\u00C0' && LA15_0<='\u00D6')||(LA15_0>='\u00D8' && LA15_0<='\u00F6')||(LA15_0>='\u00F8' && LA15_0<='\u00FF')) ) {s = 52;}

                        else if ( (LA15_0=='\"') ) {s = 53;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 54;}

                        else if ( (LA15_0=='\u221E') ) {s = 55;}

                        else if ( (LA15_0=='\u00AB') ) {s = 56;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 57;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||(LA15_0>='&' && LA15_0<='\'')||LA15_0==';'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\u00BF')||LA15_0=='\u00D7'||LA15_0=='\u00F7'||(LA15_0>='\u0100' && LA15_0<='\u221D')||(LA15_0>='\u221F' && LA15_0<='\u2263')||(LA15_0>='\u2266' && LA15_0<='\uFFFF')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_53 = input.LA(1);

                        s = -1;
                        if ( ((LA15_53>='\u0000' && LA15_53<='\uFFFF')) ) {s = 146;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_148 = input.LA(1);

                        s = -1;
                        if ( (LA15_148=='[') ) {s = 149;}

                        else if ( ((LA15_148>='\u0000' && LA15_148<='Z')||LA15_148=='\\'||(LA15_148>='^' && LA15_148<='\u00BA')||(LA15_148>='\u00BC' && LA15_148<='\uFFFF')) ) {s = 148;}

                        else if ( (LA15_148=='\u00BB') ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='Z')||LA15_27=='\\'||(LA15_27>='^' && LA15_27<='\u00BA')||(LA15_27>='\u00BC' && LA15_27<='\uFFFF')) ) {s = 109;}

                        else if ( (LA15_27=='[') ) {s = 110;}

                        else if ( (LA15_27=='\u00BB') ) {s = 112;}

                        else s = 111;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_56 = input.LA(1);

                        s = -1;
                        if ( ((LA15_56>='\u0000' && LA15_56<='Z')||LA15_56=='\\'||(LA15_56>='^' && LA15_56<='\u00BA')||(LA15_56>='\u00BC' && LA15_56<='\uFFFF')) ) {s = 148;}

                        else if ( (LA15_56=='[') ) {s = 149;}

                        else if ( (LA15_56=='\u00BB') ) {s = 150;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_109 = input.LA(1);

                        s = -1;
                        if ( (LA15_109=='\u00BB') ) {s = 112;}

                        else if ( ((LA15_109>='\u0000' && LA15_109<='Z')||LA15_109=='\\'||(LA15_109>='^' && LA15_109<='\u00BA')||(LA15_109>='\u00BC' && LA15_109<='\uFFFF')) ) {s = 109;}

                        else if ( (LA15_109=='[') ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}