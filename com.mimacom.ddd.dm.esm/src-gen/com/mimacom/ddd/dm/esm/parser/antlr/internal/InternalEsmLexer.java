package com.mimacom.ddd.dm.esm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsmLexer extends Lexer {
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

    public InternalEsmLexer() {;} 
    public InternalEsmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEsmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEsm.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEsm.g:11:7: ( 'domain' )
            // InternalEsm.g:11:9: 'domain'
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
            // InternalEsm.g:12:7: ( 'alias' )
            // InternalEsm.g:12:9: 'alias'
            {
            match("alias"); 


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
            // InternalEsm.g:13:7: ( 'state' )
            // InternalEsm.g:13:9: 'state'
            {
            match("state"); 


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
            // InternalEsm.g:14:7: ( 'model' )
            // InternalEsm.g:14:9: 'model'
            {
            match("model"); 


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
            // InternalEsm.g:15:7: ( 'for' )
            // InternalEsm.g:15:9: 'for'
            {
            match("for"); 


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
            // InternalEsm.g:16:7: ( 'states' )
            // InternalEsm.g:16:9: 'states'
            {
            match("states"); 


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
            // InternalEsm.g:17:7: ( 'events' )
            // InternalEsm.g:17:9: 'events'
            {
            match("events"); 


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
            // InternalEsm.g:18:7: ( 'transitions' )
            // InternalEsm.g:18:9: 'transitions'
            {
            match("transitions"); 


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
            // InternalEsm.g:19:7: ( 'when' )
            // InternalEsm.g:19:9: 'when'
            {
            match("when"); 


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
            // InternalEsm.g:20:7: ( 'to' )
            // InternalEsm.g:20:9: 'to'
            {
            match("to"); 


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
            // InternalEsm.g:21:7: ( 'as' )
            // InternalEsm.g:21:9: 'as'
            {
            match("as"); 


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
            // InternalEsm.g:22:7: ( 'import' )
            // InternalEsm.g:22:9: 'import'
            {
            match("import"); 


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
            // InternalEsm.g:23:7: ( 'test' )
            // InternalEsm.g:23:9: 'test'
            {
            match("test"); 


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
            // InternalEsm.g:24:7: ( 'context' )
            // InternalEsm.g:24:9: 'context'
            {
            match("context"); 


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
            // InternalEsm.g:25:7: ( ',' )
            // InternalEsm.g:25:9: ','
            {
            match(','); 

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
            // InternalEsm.g:26:7: ( '{' )
            // InternalEsm.g:26:9: '{'
            {
            match('{'); 

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
            // InternalEsm.g:27:7: ( '}' )
            // InternalEsm.g:27:9: '}'
            {
            match('}'); 

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
            // InternalEsm.g:28:7: ( ':' )
            // InternalEsm.g:28:9: ':'
            {
            match(':'); 

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
            // InternalEsm.g:29:7: ( 'in' )
            // InternalEsm.g:29:9: 'in'
            {
            match("in"); 


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
            // InternalEsm.g:30:7: ( '(' )
            // InternalEsm.g:30:9: '('
            {
            match('('); 

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
            // InternalEsm.g:31:7: ( ')' )
            // InternalEsm.g:31:9: ')'
            {
            match(')'); 

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
            // InternalEsm.g:32:7: ( 'archetype' )
            // InternalEsm.g:32:9: 'archetype'
            {
            match("archetype"); 


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
            // InternalEsm.g:33:7: ( 'is' )
            // InternalEsm.g:33:9: 'is'
            {
            match("is"); 


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
            // InternalEsm.g:34:7: ( 'filter' )
            // InternalEsm.g:34:9: 'filter'
            {
            match("filter"); 


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
            // InternalEsm.g:35:7: ( 'with' )
            // InternalEsm.g:35:9: 'with'
            {
            match("with"); 


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
            // InternalEsm.g:36:7: ( '*' )
            // InternalEsm.g:36:9: '*'
            {
            match('*'); 

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
            // InternalEsm.g:37:7: ( '.' )
            // InternalEsm.g:37:9: '.'
            {
            match('.'); 

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
            // InternalEsm.g:38:7: ( '@before' )
            // InternalEsm.g:38:9: '@before'
            {
            match("@before"); 


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
            // InternalEsm.g:39:7: ( ':=' )
            // InternalEsm.g:39:9: ':='
            {
            match(":="); 


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
            // InternalEsm.g:40:7: ( '|' )
            // InternalEsm.g:40:9: '|'
            {
            match('|'); 

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
            // InternalEsm.g:41:7: ( 'ISA' )
            // InternalEsm.g:41:9: 'ISA'
            {
            match("ISA"); 


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
            // InternalEsm.g:42:7: ( 'isa' )
            // InternalEsm.g:42:9: 'isa'
            {
            match("isa"); 


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
            // InternalEsm.g:43:7: ( 'AS' )
            // InternalEsm.g:43:9: 'AS'
            {
            match("AS"); 


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
            // InternalEsm.g:44:7: ( 'SELF' )
            // InternalEsm.g:44:9: 'SELF'
            {
            match("SELF"); 


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
            // InternalEsm.g:45:7: ( 'self' )
            // InternalEsm.g:45:9: 'self'
            {
            match("self"); 


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
            // InternalEsm.g:46:7: ( 'NEW' )
            // InternalEsm.g:46:9: 'NEW'
            {
            match("NEW"); 


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
            // InternalEsm.g:47:7: ( 'new' )
            // InternalEsm.g:47:9: 'new'
            {
            match("new"); 


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
            // InternalEsm.g:48:7: ( 'all' )
            // InternalEsm.g:48:9: 'all'
            {
            match("all"); 


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
            // InternalEsm.g:49:7: ( 'if' )
            // InternalEsm.g:49:9: 'if'
            {
            match("if"); 


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
            // InternalEsm.g:50:7: ( 'then' )
            // InternalEsm.g:50:9: 'then'
            {
            match("then"); 


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
            // InternalEsm.g:51:7: ( 'else' )
            // InternalEsm.g:51:9: 'else'
            {
            match("else"); 


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
            // InternalEsm.g:52:7: ( 'end' )
            // InternalEsm.g:52:9: 'end'
            {
            match("end"); 


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
            // InternalEsm.g:53:7: ( '..' )
            // InternalEsm.g:53:9: '..'
            {
            match(".."); 


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
            // InternalEsm.g:54:7: ( 'TRUE' )
            // InternalEsm.g:54:9: 'TRUE'
            {
            match("TRUE"); 


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
            // InternalEsm.g:55:7: ( 'true' )
            // InternalEsm.g:55:9: 'true'
            {
            match("true"); 


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
            // InternalEsm.g:56:7: ( 'FALSE' )
            // InternalEsm.g:56:9: 'FALSE'
            {
            match("FALSE"); 


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
            // InternalEsm.g:57:7: ( 'false' )
            // InternalEsm.g:57:9: 'false'
            {
            match("false"); 


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
            // InternalEsm.g:58:7: ( 'UNDEFINED' )
            // InternalEsm.g:58:9: 'UNDEFINED'
            {
            match("UNDEFINED"); 


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
            // InternalEsm.g:59:7: ( 'undefined' )
            // InternalEsm.g:59:9: 'undefined'
            {
            match("undefined"); 


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
            // InternalEsm.g:60:7: ( 'E' )
            // InternalEsm.g:60:9: 'E'
            {
            match('E'); 

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
            // InternalEsm.g:61:7: ( 'e' )
            // InternalEsm.g:61:9: 'e'
            {
            match('e'); 

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
            // InternalEsm.g:62:7: ( '+' )
            // InternalEsm.g:62:9: '+'
            {
            match('+'); 

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
            // InternalEsm.g:63:7: ( '-' )
            // InternalEsm.g:63:9: '-'
            {
            match('-'); 

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
            // InternalEsm.g:64:7: ( '.*' )
            // InternalEsm.g:64:9: '.*'
            {
            match(".*"); 


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
            // InternalEsm.g:65:7: ( 'VOID' )
            // InternalEsm.g:65:9: 'VOID'
            {
            match("VOID"); 


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
            // InternalEsm.g:66:7: ( 'BOOLEAN' )
            // InternalEsm.g:66:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


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
            // InternalEsm.g:67:7: ( 'NUMBER' )
            // InternalEsm.g:67:9: 'NUMBER'
            {
            match("NUMBER"); 


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
            // InternalEsm.g:68:7: ( 'TEXT' )
            // InternalEsm.g:68:9: 'TEXT'
            {
            match("TEXT"); 


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
            // InternalEsm.g:69:7: ( 'IDENTIFIER' )
            // InternalEsm.g:69:9: 'IDENTIFIER'
            {
            match("IDENTIFIER"); 


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
            // InternalEsm.g:70:7: ( 'TIMEPOINT' )
            // InternalEsm.g:70:9: 'TIMEPOINT'
            {
            match("TIMEPOINT"); 


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
            // InternalEsm.g:71:7: ( 'COMPLEX' )
            // InternalEsm.g:71:9: 'COMPLEX'
            {
            match("COMPLEX"); 


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
            // InternalEsm.g:72:7: ( 'NOTIFICATION' )
            // InternalEsm.g:72:9: 'NOTIFICATION'
            {
            match("NOTIFICATION"); 


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
            // InternalEsm.g:73:7: ( 'SERVICE' )
            // InternalEsm.g:73:9: 'SERVICE'
            {
            match("SERVICE"); 


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
            // InternalEsm.g:74:7: ( 'OR' )
            // InternalEsm.g:74:9: 'OR'
            {
            match("OR"); 


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
            // InternalEsm.g:75:7: ( 'or' )
            // InternalEsm.g:75:9: 'or'
            {
            match("or"); 


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
            // InternalEsm.g:76:7: ( 'XOR' )
            // InternalEsm.g:76:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalEsm.g:77:7: ( 'xor' )
            // InternalEsm.g:77:9: 'xor'
            {
            match("xor"); 


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
            // InternalEsm.g:78:7: ( 'AND' )
            // InternalEsm.g:78:9: 'AND'
            {
            match("AND"); 


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
            // InternalEsm.g:79:7: ( 'and' )
            // InternalEsm.g:79:9: 'and'
            {
            match("and"); 


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
            // InternalEsm.g:80:7: ( '=' )
            // InternalEsm.g:80:9: '='
            {
            match('='); 

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
            // InternalEsm.g:81:7: ( '!=' )
            // InternalEsm.g:81:9: '!='
            {
            match("!="); 


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
            // InternalEsm.g:82:7: ( '<>' )
            // InternalEsm.g:82:9: '<>'
            {
            match("<>"); 


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
            // InternalEsm.g:83:7: ( '<' )
            // InternalEsm.g:83:9: '<'
            {
            match('<'); 

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
            // InternalEsm.g:84:7: ( '<=' )
            // InternalEsm.g:84:9: '<='
            {
            match("<="); 


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
            // InternalEsm.g:85:7: ( '\\u2264' )
            // InternalEsm.g:85:9: '\\u2264'
            {
            match('\u2264'); 

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
            // InternalEsm.g:86:7: ( '>=' )
            // InternalEsm.g:86:9: '>='
            {
            match(">="); 


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
            // InternalEsm.g:87:7: ( '\\u2265' )
            // InternalEsm.g:87:9: '\\u2265'
            {
            match('\u2265'); 

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
            // InternalEsm.g:88:7: ( '>' )
            // InternalEsm.g:88:9: '>'
            {
            match('>'); 

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
            // InternalEsm.g:89:7: ( '->' )
            // InternalEsm.g:89:9: '->'
            {
            match("->"); 


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
            // InternalEsm.g:90:7: ( '=>' )
            // InternalEsm.g:90:9: '=>'
            {
            match("=>"); 


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
            // InternalEsm.g:91:7: ( '/' )
            // InternalEsm.g:91:9: '/'
            {
            match('/'); 

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
            // InternalEsm.g:92:7: ( '**' )
            // InternalEsm.g:92:9: '**'
            {
            match("**"); 


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
            // InternalEsm.g:93:7: ( '%' )
            // InternalEsm.g:93:9: '%'
            {
            match('%'); 

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
            // InternalEsm.g:94:8: ( '!' )
            // InternalEsm.g:94:10: '!'
            {
            match('!'); 

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
            // InternalEsm.g:95:8: ( 'NOT' )
            // InternalEsm.g:95:10: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEsm.g:96:8: ( 'not' )
            // InternalEsm.g:96:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEsm.g:4135:9: ( ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )* )
            // InternalEsm.g:4135:11: ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )*
            {
            // InternalEsm.g:4135:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEsm.g:4135:11: '^'
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

            // InternalEsm.g:4135:34: ( RULE_LETTER | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEsm.g:
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
            // InternalEsm.g:4137:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalEsm.g:4137:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalEsm.g:4137:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalEsm.g:4137:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalEsm.g:4137:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalEsm.g:4139:14: ( ( '0' .. '9' )+ )
            // InternalEsm.g:4139:16: ( '0' .. '9' )+
            {
            // InternalEsm.g:4139:16: ( '0' .. '9' )+
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
            	    // InternalEsm.g:4139:17: '0' .. '9'
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
            // InternalEsm.g:4141:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' ) )
            // InternalEsm.g:4141:24: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
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
            // InternalEsm.g:4143:26: (~ ( ( '\\u00BB' | ']' | '[' ) ) )
            // InternalEsm.g:4143:28: ~ ( ( '\\u00BB' | ']' | '[' ) )
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
            // InternalEsm.g:4145:22: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalEsm.g:4145:24: '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match('\u00AB'); 
            // InternalEsm.g:4145:33: ( RULE_PLAIN_TEXT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='Z')||LA5_0=='\\'||(LA5_0>='^' && LA5_0<='\u00BA')||(LA5_0>='\u00BC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEsm.g:4145:33: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // InternalEsm.g:4147:23: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '[' )
            // InternalEsm.g:4147:25: '\\u00AB' ( RULE_PLAIN_TEXT )* '['
            {
            match('\u00AB'); 
            // InternalEsm.g:4147:34: ( RULE_PLAIN_TEXT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='Z')||LA6_0=='\\'||(LA6_0>='^' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEsm.g:4147:34: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalEsm.g:4149:24: ( ']' ( RULE_PLAIN_TEXT )* '[' )
            // InternalEsm.g:4149:26: ']' ( RULE_PLAIN_TEXT )* '['
            {
            match(']'); 
            // InternalEsm.g:4149:30: ( RULE_PLAIN_TEXT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='Z')||LA7_0=='\\'||(LA7_0>='^' && LA7_0<='\u00BA')||(LA7_0>='\u00BC' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEsm.g:4149:30: RULE_PLAIN_TEXT
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
    // $ANTLR end "RULE_PLAIN_TEXT_MIDDLE"

    // $ANTLR start "RULE_PLAIN_TEXT_END"
    public final void mRULE_PLAIN_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEsm.g:4151:21: ( ']' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalEsm.g:4151:23: ']' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match(']'); 
            // InternalEsm.g:4151:27: ( RULE_PLAIN_TEXT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='Z')||LA8_0=='\\'||(LA8_0>='^' && LA8_0<='\u00BA')||(LA8_0>='\u00BC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEsm.g:4151:27: RULE_PLAIN_TEXT
            	    {
            	    mRULE_PLAIN_TEXT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalEsm.g:4153:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEsm.g:4153:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEsm.g:4153:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEsm.g:4153:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalEsm.g:4155:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEsm.g:4155:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEsm.g:4155:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEsm.g:4155:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalEsm.g:4155:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEsm.g:4155:41: ( '\\r' )? '\\n'
                    {
                    // InternalEsm.g:4155:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEsm.g:4155:41: '\\r'
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
            // InternalEsm.g:4157:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEsm.g:4157:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEsm.g:4157:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEsm.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalEsm.g:4159:16: ( . )
            // InternalEsm.g:4159:18: .
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
        // InternalEsm.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=97;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalEsm.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalEsm.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalEsm.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalEsm.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalEsm.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalEsm.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalEsm.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalEsm.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalEsm.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalEsm.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalEsm.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalEsm.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalEsm.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalEsm.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalEsm.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalEsm.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalEsm.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalEsm.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalEsm.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalEsm.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalEsm.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalEsm.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalEsm.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalEsm.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalEsm.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalEsm.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalEsm.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalEsm.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalEsm.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalEsm.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalEsm.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalEsm.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalEsm.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalEsm.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalEsm.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalEsm.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalEsm.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalEsm.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalEsm.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalEsm.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalEsm.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalEsm.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalEsm.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalEsm.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalEsm.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalEsm.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalEsm.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalEsm.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalEsm.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalEsm.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalEsm.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalEsm.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalEsm.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalEsm.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalEsm.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalEsm.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalEsm.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalEsm.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalEsm.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalEsm.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalEsm.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalEsm.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalEsm.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalEsm.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalEsm.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalEsm.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalEsm.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalEsm.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalEsm.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalEsm.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalEsm.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalEsm.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalEsm.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalEsm.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalEsm.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalEsm.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalEsm.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalEsm.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalEsm.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalEsm.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalEsm.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalEsm.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalEsm.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalEsm.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalEsm.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalEsm.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // InternalEsm.g:1:529: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // InternalEsm.g:1:537: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 89 :
                // InternalEsm.g:1:549: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 90 :
                // InternalEsm.g:1:562: RULE_PLAIN_TEXT_ONLY
                {
                mRULE_PLAIN_TEXT_ONLY(); 

                }
                break;
            case 91 :
                // InternalEsm.g:1:583: RULE_PLAIN_TEXT_START
                {
                mRULE_PLAIN_TEXT_START(); 

                }
                break;
            case 92 :
                // InternalEsm.g:1:605: RULE_PLAIN_TEXT_MIDDLE
                {
                mRULE_PLAIN_TEXT_MIDDLE(); 

                }
                break;
            case 93 :
                // InternalEsm.g:1:628: RULE_PLAIN_TEXT_END
                {
                mRULE_PLAIN_TEXT_END(); 

                }
                break;
            case 94 :
                // InternalEsm.g:1:648: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // InternalEsm.g:1:664: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // InternalEsm.g:1:680: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 97 :
                // InternalEsm.g:1:688: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\5\71\1\107\4\71\3\uffff\1\127\2\uffff\1\133\1\136\1\67\1\uffff\11\71\1\161\1\uffff\1\164\7\71\1\175\1\177\1\u0082\1\uffff\1\u0085\1\uffff\1\u0089\1\uffff\1\67\1\uffff\1\67\1\uffff\2\67\2\uffff\1\71\1\uffff\1\71\1\u0097\13\71\1\uffff\1\71\1\u00a5\5\71\1\u00ab\1\u00ad\1\u00ae\1\71\16\uffff\2\71\1\u00b2\15\71\4\uffff\3\71\1\u00c4\1\u00c5\2\71\30\uffff\2\71\1\u00ca\1\uffff\1\71\1\u00cc\3\71\1\u00d0\4\71\1\u00d5\2\71\1\uffff\5\71\1\uffff\1\u00dd\2\uffff\1\71\1\u00df\1\71\1\uffff\1\u00e1\2\71\1\u00e4\1\71\1\u00e7\1\u00e8\1\u00e9\11\71\2\uffff\1\u00f3\1\u00f4\2\71\1\uffff\1\71\1\uffff\1\71\1\u00f9\1\71\1\uffff\3\71\1\u00fe\1\uffff\1\71\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\71\1\uffff\1\71\1\uffff\1\71\1\uffff\1\u0108\1\71\1\uffff\2\71\3\uffff\1\u010c\1\u010d\4\71\1\u0112\2\71\2\uffff\1\71\1\u0116\1\71\1\u0119\1\uffff\1\u011a\1\71\1\u011c\1\71\1\uffff\1\71\5\uffff\3\71\1\uffff\3\71\2\uffff\1\71\1\u0126\2\71\1\uffff\2\71\1\u012b\1\uffff\1\71\1\u012d\2\uffff\1\u012e\1\uffff\1\u012f\1\71\1\u0131\3\71\1\u0135\2\71\1\uffff\4\71\1\uffff\1\71\3\uffff\1\71\1\uffff\1\u013e\1\71\1\u0140\1\uffff\4\71\1\u0145\1\u0146\2\71\1\uffff\1\71\1\uffff\4\71\2\uffff\1\u014e\3\71\1\u0152\1\u0153\1\u0154\1\uffff\1\71\1\u0156\1\71\3\uffff\1\u0158\1\uffff\1\71\1\uffff\1\u015a\1\uffff";
    static final String DFA14_eofS =
        "\u015b\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\154\1\145\1\157\1\141\1\60\1\145\1\150\1\146\1\157\3\uffff\1\75\2\uffff\2\52\1\142\1\uffff\1\104\1\116\2\105\1\145\1\105\1\101\1\116\1\156\1\60\1\uffff\1\76\3\117\1\122\1\162\1\117\1\157\1\76\2\75\1\uffff\1\75\1\uffff\1\52\1\uffff\1\101\1\uffff\1\0\1\uffff\2\0\2\uffff\1\155\1\uffff\1\151\1\60\1\143\1\144\1\141\1\154\1\144\1\162\2\154\1\145\1\163\1\144\1\uffff\1\141\1\60\1\163\2\145\1\164\1\160\3\60\1\156\16\uffff\1\101\1\105\1\60\1\104\1\114\1\127\1\115\1\124\1\167\1\164\1\125\1\130\1\115\1\114\1\104\1\144\4\uffff\1\111\1\117\1\115\2\60\1\122\1\162\21\uffff\1\0\2\uffff\1\0\3\uffff\2\141\1\60\1\uffff\1\150\1\60\1\164\1\146\1\145\1\60\1\164\1\163\1\156\1\145\1\60\1\156\1\145\1\uffff\1\164\2\156\1\150\1\157\1\uffff\1\60\2\uffff\1\164\1\60\1\116\1\uffff\1\60\1\106\1\126\1\60\1\102\3\60\1\105\1\124\1\105\1\123\1\105\1\145\1\104\1\114\1\120\2\uffff\2\60\1\151\1\163\1\uffff\1\145\1\uffff\1\145\1\60\1\154\1\uffff\2\145\1\164\1\60\1\uffff\1\163\5\60\1\162\1\uffff\1\145\1\uffff\1\124\1\uffff\1\60\1\111\1\uffff\1\105\1\106\3\uffff\2\60\1\120\1\105\1\106\1\146\1\60\1\105\1\114\2\uffff\1\156\1\60\1\164\1\60\1\uffff\1\60\1\162\1\60\1\163\1\uffff\1\151\5\uffff\1\164\1\170\1\111\1\uffff\1\103\1\122\1\111\2\uffff\1\117\1\60\1\111\1\151\1\uffff\1\101\1\105\1\60\1\uffff\1\171\1\60\2\uffff\1\60\1\uffff\1\60\1\164\1\60\1\164\1\106\1\105\1\60\1\103\1\111\1\uffff\1\116\1\156\1\116\1\130\1\uffff\1\160\3\uffff\1\151\1\uffff\1\60\1\111\1\60\1\uffff\1\101\1\116\1\105\1\145\2\60\1\145\1\157\1\uffff\1\105\1\uffff\2\124\1\104\1\144\2\uffff\1\60\1\156\1\122\1\111\3\60\1\uffff\1\163\1\60\1\117\3\uffff\1\60\1\uffff\1\116\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\163\1\164\2\157\1\u00ff\1\162\1\151\1\163\1\157\3\uffff\1\75\2\uffff\1\52\1\56\1\142\1\uffff\2\123\1\105\1\125\1\157\1\122\1\101\1\116\1\156\1\u00ff\1\uffff\1\76\3\117\1\122\1\162\1\117\1\157\1\76\1\75\1\76\1\uffff\1\75\1\uffff\1\57\1\uffff\1\u00ff\1\uffff\1\uffff\1\uffff\2\uffff\2\uffff\1\155\1\uffff\1\154\1\u00ff\1\143\1\144\1\141\1\154\1\144\1\162\2\154\1\145\1\163\1\144\1\uffff\1\165\1\u00ff\1\163\2\145\1\164\1\160\3\u00ff\1\156\16\uffff\1\101\1\105\1\u00ff\1\104\1\122\1\127\1\115\1\124\1\167\1\164\1\125\1\130\1\115\1\114\1\104\1\144\4\uffff\1\111\1\117\1\115\2\u00ff\1\122\1\162\21\uffff\1\uffff\2\uffff\1\uffff\3\uffff\2\141\1\u00ff\1\uffff\1\150\1\u00ff\1\164\1\146\1\145\1\u00ff\1\164\1\163\1\156\1\145\1\u00ff\1\156\1\145\1\uffff\1\164\2\156\1\150\1\157\1\uffff\1\u00ff\2\uffff\1\164\1\u00ff\1\116\1\uffff\1\u00ff\1\106\1\126\1\u00ff\1\102\3\u00ff\1\105\1\124\1\105\1\123\1\105\1\145\1\104\1\114\1\120\2\uffff\2\u00ff\1\151\1\163\1\uffff\1\145\1\uffff\1\145\1\u00ff\1\154\1\uffff\2\145\1\164\1\u00ff\1\uffff\1\163\5\u00ff\1\162\1\uffff\1\145\1\uffff\1\124\1\uffff\1\u00ff\1\111\1\uffff\1\105\1\106\3\uffff\2\u00ff\1\120\1\105\1\106\1\146\1\u00ff\1\105\1\114\2\uffff\1\156\1\u00ff\1\164\1\u00ff\1\uffff\1\u00ff\1\162\1\u00ff\1\163\1\uffff\1\151\5\uffff\1\164\1\170\1\111\1\uffff\1\103\1\122\1\111\2\uffff\1\117\1\u00ff\1\111\1\151\1\uffff\1\101\1\105\1\u00ff\1\uffff\1\171\1\u00ff\2\uffff\1\u00ff\1\uffff\1\u00ff\1\164\1\u00ff\1\164\1\106\1\105\1\u00ff\1\103\1\111\1\uffff\1\116\1\156\1\116\1\130\1\uffff\1\160\3\uffff\1\151\1\uffff\1\u00ff\1\111\1\u00ff\1\uffff\1\101\1\116\1\105\1\145\2\u00ff\1\145\1\157\1\uffff\1\105\1\uffff\2\124\1\104\1\144\2\uffff\1\u00ff\1\156\1\122\1\111\3\u00ff\1\uffff\1\163\1\u00ff\1\117\3\uffff\1\u00ff\1\uffff\1\116\1\uffff\1\u00ff\1\uffff";
    static final String DFA14_acceptS =
        "\13\uffff\1\17\1\20\1\21\1\uffff\1\24\1\25\3\uffff\1\36\12\uffff\1\64\13\uffff\1\113\1\uffff\1\115\1\uffff\1\123\1\uffff\1\127\1\uffff\1\131\2\uffff\1\140\1\141\1\uffff\1\127\15\uffff\1\63\13\uffff\1\17\1\20\1\21\1\35\1\22\1\24\1\25\1\122\1\32\1\53\1\66\1\33\1\34\1\36\20\uffff\1\62\1\64\1\117\1\65\7\uffff\1\120\1\106\1\107\1\124\1\110\1\112\1\111\1\113\1\114\1\116\1\115\1\136\1\137\1\121\1\123\1\130\1\131\1\uffff\1\133\1\132\1\uffff\1\135\1\134\1\140\3\uffff\1\13\15\uffff\1\12\5\uffff\1\23\1\uffff\1\27\1\47\3\uffff\1\41\21\uffff\1\100\1\101\4\uffff\1\46\1\uffff\1\105\3\uffff\1\5\4\uffff\1\52\7\uffff\1\40\1\uffff\1\37\1\uffff\1\104\2\uffff\1\44\2\uffff\1\125\1\45\1\126\11\uffff\1\102\1\103\4\uffff\1\43\4\uffff\1\51\1\uffff\1\55\1\15\1\50\1\11\1\31\3\uffff\1\42\3\uffff\1\54\1\72\4\uffff\1\67\3\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\57\11\uffff\1\56\4\uffff\1\1\1\uffff\1\6\1\30\1\7\1\uffff\1\14\3\uffff\1\71\10\uffff\1\16\1\uffff\1\77\4\uffff\1\70\1\75\7\uffff\1\26\3\uffff\1\74\1\60\1\61\1\uffff\1\73\1\uffff\1\10\1\uffff\1\76";
    static final String DFA14_specialS =
        "\1\2\61\uffff\1\3\1\uffff\1\1\1\5\127\uffff\1\4\2\uffff\1\0\u00ca\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\51\1\62\2\67\1\57\2\67\1\17\1\20\1\21\1\37\1\13\1\40\1\22\1\56\12\63\1\16\1\67\1\52\1\50\1\54\1\67\1\23\1\26\1\42\1\43\1\61\1\36\1\33\2\61\1\25\4\61\1\30\1\44\3\61\1\27\1\32\1\34\1\41\1\61\1\46\2\61\2\67\1\65\1\60\1\61\1\67\1\2\1\61\1\12\1\1\1\6\1\5\2\61\1\11\3\61\1\4\1\31\1\45\3\61\1\3\1\7\1\35\1\61\1\10\1\47\2\61\1\14\1\24\1\15\55\67\1\64\24\67\27\61\1\67\37\61\1\67\10\61\u2164\67\1\53\1\55\udd9a\67",
            "\1\70",
            "\1\72\1\uffff\1\75\3\uffff\1\74\1\73",
            "\1\77\16\uffff\1\76",
            "\1\100",
            "\1\103\7\uffff\1\102\5\uffff\1\101",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\13\71\1\105\1\71\1\106\7\71\1\104\4\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\112\2\uffff\1\113\6\uffff\1\111\2\uffff\1\110",
            "\1\114\1\115",
            "\1\121\6\uffff\1\116\1\117\4\uffff\1\120",
            "\1\122",
            "",
            "",
            "",
            "\1\126",
            "",
            "",
            "\1\132",
            "\1\135\3\uffff\1\134",
            "\1\137",
            "",
            "\1\142\16\uffff\1\141",
            "\1\144\4\uffff\1\143",
            "\1\145",
            "\1\146\11\uffff\1\150\5\uffff\1\147",
            "\1\151\11\uffff\1\152",
            "\1\154\3\uffff\1\155\10\uffff\1\153",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\163",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\176",
            "\1\u0081\1\u0080",
            "",
            "\1\u0084",
            "",
            "\1\u0087\4\uffff\1\u0088",
            "",
            "\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\0\u008b",
            "",
            "\133\u008d\1\u008e\1\u008d\1\uffff\135\u008d\1\u008f\uff44\u008d",
            "\133\u0090\1\u0092\1\u0090\1\uffff\135\u0090\1\u0091\uff44\u0090",
            "",
            "",
            "\1\u0094",
            "",
            "\1\u0095\2\uffff\1\u0096",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3\23\uffff\1\u00a4",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\1\u00ac\31\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00af",
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
            "\1\u00b0",
            "\1\u00b1",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00b3",
            "\1\u00b4\5\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00c6",
            "\1\u00c7",
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
            "\133\u008d\1\u008e\1\u008d\1\uffff\135\u008d\1\u008f\uff44\u008d",
            "",
            "",
            "\133\u0090\1\u0092\1\u0090\1\uffff\135\u0090\1\u0091\uff44\u0090",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u00cb",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "",
            "\1\u00de",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00e0",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00e2",
            "\1\u00e3",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00e5",
            "\12\71\7\uffff\10\71\1\u00e6\21\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u00ff",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0105",
            "",
            "\1\u0106",
            "",
            "\1\u0107",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0117",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\22\71\1\u0118\7\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u011b",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u011d",
            "",
            "\1\u011e",
            "",
            "",
            "",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "",
            "\1\u0125",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u012c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0130",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "",
            "",
            "",
            "\1\u013d",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u013f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u0155",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "\1\u0157",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            "",
            "\1\u0159",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71\105\uffff\27\71\1\uffff\37\71\1\uffff\10\71",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_144 = input.LA(1);

                        s = -1;
                        if ( (LA14_144=='\u00BB') ) {s = 145;}

                        else if ( ((LA14_144>='\u0000' && LA14_144<='Z')||LA14_144=='\\'||(LA14_144>='^' && LA14_144<='\u00BA')||(LA14_144>='\u00BC' && LA14_144<='\uFFFF')) ) {s = 144;}

                        else if ( (LA14_144=='[') ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( ((LA14_52>='\u0000' && LA14_52<='Z')||LA14_52=='\\'||(LA14_52>='^' && LA14_52<='\u00BA')||(LA14_52>='\u00BC' && LA14_52<='\uFFFF')) ) {s = 141;}

                        else if ( (LA14_52=='[') ) {s = 142;}

                        else if ( (LA14_52=='\u00BB') ) {s = 143;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='d') ) {s = 1;}

                        else if ( (LA14_0=='a') ) {s = 2;}

                        else if ( (LA14_0=='s') ) {s = 3;}

                        else if ( (LA14_0=='m') ) {s = 4;}

                        else if ( (LA14_0=='f') ) {s = 5;}

                        else if ( (LA14_0=='e') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='w') ) {s = 8;}

                        else if ( (LA14_0=='i') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0==',') ) {s = 11;}

                        else if ( (LA14_0=='{') ) {s = 12;}

                        else if ( (LA14_0=='}') ) {s = 13;}

                        else if ( (LA14_0==':') ) {s = 14;}

                        else if ( (LA14_0=='(') ) {s = 15;}

                        else if ( (LA14_0==')') ) {s = 16;}

                        else if ( (LA14_0=='*') ) {s = 17;}

                        else if ( (LA14_0=='.') ) {s = 18;}

                        else if ( (LA14_0=='@') ) {s = 19;}

                        else if ( (LA14_0=='|') ) {s = 20;}

                        else if ( (LA14_0=='I') ) {s = 21;}

                        else if ( (LA14_0=='A') ) {s = 22;}

                        else if ( (LA14_0=='S') ) {s = 23;}

                        else if ( (LA14_0=='N') ) {s = 24;}

                        else if ( (LA14_0=='n') ) {s = 25;}

                        else if ( (LA14_0=='T') ) {s = 26;}

                        else if ( (LA14_0=='F') ) {s = 27;}

                        else if ( (LA14_0=='U') ) {s = 28;}

                        else if ( (LA14_0=='u') ) {s = 29;}

                        else if ( (LA14_0=='E') ) {s = 30;}

                        else if ( (LA14_0=='+') ) {s = 31;}

                        else if ( (LA14_0=='-') ) {s = 32;}

                        else if ( (LA14_0=='V') ) {s = 33;}

                        else if ( (LA14_0=='B') ) {s = 34;}

                        else if ( (LA14_0=='C') ) {s = 35;}

                        else if ( (LA14_0=='O') ) {s = 36;}

                        else if ( (LA14_0=='o') ) {s = 37;}

                        else if ( (LA14_0=='X') ) {s = 38;}

                        else if ( (LA14_0=='x') ) {s = 39;}

                        else if ( (LA14_0=='=') ) {s = 40;}

                        else if ( (LA14_0=='!') ) {s = 41;}

                        else if ( (LA14_0=='<') ) {s = 42;}

                        else if ( (LA14_0=='\u2264') ) {s = 43;}

                        else if ( (LA14_0=='>') ) {s = 44;}

                        else if ( (LA14_0=='\u2265') ) {s = 45;}

                        else if ( (LA14_0=='/') ) {s = 46;}

                        else if ( (LA14_0=='%') ) {s = 47;}

                        else if ( (LA14_0=='^') ) {s = 48;}

                        else if ( (LA14_0=='D'||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='M')||(LA14_0>='P' && LA14_0<='R')||LA14_0=='W'||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='p' && LA14_0<='r')||LA14_0=='v'||(LA14_0>='y' && LA14_0<='z')||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u00FF')) ) {s = 49;}

                        else if ( (LA14_0=='\"') ) {s = 50;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 51;}

                        else if ( (LA14_0=='\u00AB') ) {s = 52;}

                        else if ( (LA14_0==']') ) {s = 53;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 54;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||(LA14_0>='&' && LA14_0<='\'')||LA14_0==';'||LA14_0=='?'||(LA14_0>='[' && LA14_0<='\\')||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\u00BF')||LA14_0=='\u00D7'||LA14_0=='\u00F7'||(LA14_0>='\u0100' && LA14_0<='\u2263')||(LA14_0>='\u2266' && LA14_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( ((LA14_50>='\u0000' && LA14_50<='\uFFFF')) ) {s = 139;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_141 = input.LA(1);

                        s = -1;
                        if ( (LA14_141=='[') ) {s = 142;}

                        else if ( ((LA14_141>='\u0000' && LA14_141<='Z')||LA14_141=='\\'||(LA14_141>='^' && LA14_141<='\u00BA')||(LA14_141>='\u00BC' && LA14_141<='\uFFFF')) ) {s = 141;}

                        else if ( (LA14_141=='\u00BB') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( ((LA14_53>='\u0000' && LA14_53<='Z')||LA14_53=='\\'||(LA14_53>='^' && LA14_53<='\u00BA')||(LA14_53>='\u00BC' && LA14_53<='\uFFFF')) ) {s = 144;}

                        else if ( (LA14_53=='\u00BB') ) {s = 145;}

                        else if ( (LA14_53=='[') ) {s = 146;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}