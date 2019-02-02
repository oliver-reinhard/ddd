package com.mimacom.ddd.dm.dme.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDmeLexer extends Lexer {
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

    public InternalDmeLexer() {;} 
    public InternalDmeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDmeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDme.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDme.g:11:7: ( 'domain' )
            // InternalDme.g:11:9: 'domain'
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
            // InternalDme.g:12:7: ( 'import' )
            // InternalDme.g:12:9: 'import'
            {
            match("import"); 


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
            // InternalDme.g:13:7: ( 'event' )
            // InternalDme.g:13:9: 'event'
            {
            match("event"); 


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
            // InternalDme.g:14:7: ( '{' )
            // InternalDme.g:14:9: '{'
            {
            match('{'); 

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
            // InternalDme.g:15:7: ( 'context' )
            // InternalDme.g:15:9: 'context'
            {
            match("context"); 


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
            // InternalDme.g:16:7: ( 'triggered' )
            // InternalDme.g:16:9: 'triggered'
            {
            match("triggered"); 


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
            // InternalDme.g:17:7: ( 'by' )
            // InternalDme.g:17:9: 'by'
            {
            match("by"); 


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
            // InternalDme.g:18:7: ( 'notifications' )
            // InternalDme.g:18:9: 'notifications'
            {
            match("notifications"); 


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
            // InternalDme.g:19:7: ( 'before' )
            // InternalDme.g:19:9: 'before'
            {
            match("before"); 


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
            // InternalDme.g:20:7: ( 'conditions' )
            // InternalDme.g:20:9: 'conditions'
            {
            match("conditions"); 


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
            // InternalDme.g:21:7: ( 'after' )
            // InternalDme.g:21:9: 'after'
            {
            match("after"); 


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
            // InternalDme.g:22:7: ( '}' )
            // InternalDme.g:22:9: '}'
            {
            match('}'); 

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
            // InternalDme.g:23:7: ( ':' )
            // InternalDme.g:23:9: ':'
            {
            match(':'); 

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
            // InternalDme.g:24:7: ( 'sent' )
            // InternalDme.g:24:9: 'sent'
            {
            match("sent"); 


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
            // InternalDme.g:25:7: ( 'to' )
            // InternalDme.g:25:9: 'to'
            {
            match("to"); 


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
            // InternalDme.g:26:7: ( 'human' )
            // InternalDme.g:26:9: 'human'
            {
            match("human"); 


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
            // InternalDme.g:27:7: ( 'actor' )
            // InternalDme.g:27:9: 'actor'
            {
            match("actor"); 


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
            // InternalDme.g:28:7: ( 'time' )
            // InternalDme.g:28:9: 'time'
            {
            match("time"); 


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
            // InternalDme.g:29:7: ( ':=' )
            // InternalDme.g:29:9: ':='
            {
            match(":="); 


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
            // InternalDme.g:30:7: ( 'ISA' )
            // InternalDme.g:30:9: 'ISA'
            {
            match("ISA"); 


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
            // InternalDme.g:31:7: ( 'isa' )
            // InternalDme.g:31:9: 'isa'
            {
            match("isa"); 


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
            // InternalDme.g:32:7: ( 'AS' )
            // InternalDme.g:32:9: 'AS'
            {
            match("AS"); 


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
            // InternalDme.g:33:7: ( 'as' )
            // InternalDme.g:33:9: 'as'
            {
            match("as"); 


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
            // InternalDme.g:34:7: ( '.' )
            // InternalDme.g:34:9: '.'
            {
            match('.'); 

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
            // InternalDme.g:35:7: ( '(' )
            // InternalDme.g:35:9: '('
            {
            match('('); 

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
            // InternalDme.g:36:7: ( ',' )
            // InternalDme.g:36:9: ','
            {
            match(','); 

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
            // InternalDme.g:37:7: ( ')' )
            // InternalDme.g:37:9: ')'
            {
            match(')'); 

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
            // InternalDme.g:38:7: ( '@before' )
            // InternalDme.g:38:9: '@before'
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
            // InternalDme.g:39:7: ( 'SELF' )
            // InternalDme.g:39:9: 'SELF'
            {
            match("SELF"); 


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
            // InternalDme.g:40:7: ( 'self' )
            // InternalDme.g:40:9: 'self'
            {
            match("self"); 


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
            // InternalDme.g:41:7: ( 'RETURN' )
            // InternalDme.g:41:9: 'RETURN'
            {
            match("RETURN"); 


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
            // InternalDme.g:42:7: ( 'return' )
            // InternalDme.g:42:9: 'return'
            {
            match("return"); 


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
            // InternalDme.g:43:7: ( 'RAISE' )
            // InternalDme.g:43:9: 'RAISE'
            {
            match("RAISE"); 


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
            // InternalDme.g:44:7: ( 'raise' )
            // InternalDme.g:44:9: 'raise'
            {
            match("raise"); 


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
            // InternalDme.g:45:7: ( 'NEW' )
            // InternalDme.g:45:9: 'NEW'
            {
            match("NEW"); 


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
            // InternalDme.g:46:7: ( 'new' )
            // InternalDme.g:46:9: 'new'
            {
            match("new"); 


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
            // InternalDme.g:47:7: ( 'if' )
            // InternalDme.g:47:9: 'if'
            {
            match("if"); 


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
            // InternalDme.g:48:7: ( 'then' )
            // InternalDme.g:48:9: 'then'
            {
            match("then"); 


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
            // InternalDme.g:49:7: ( 'else' )
            // InternalDme.g:49:9: 'else'
            {
            match("else"); 


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
            // InternalDme.g:50:7: ( 'end' )
            // InternalDme.g:50:9: 'end'
            {
            match("end"); 


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
            // InternalDme.g:51:7: ( 'for' )
            // InternalDme.g:51:9: 'for'
            {
            match("for"); 


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
            // InternalDme.g:52:7: ( 'do' )
            // InternalDme.g:52:9: 'do'
            {
            match("do"); 


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
            // InternalDme.g:53:7: ( '..' )
            // InternalDme.g:53:9: '..'
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
            // InternalDme.g:54:7: ( '*' )
            // InternalDme.g:54:9: '*'
            {
            match('*'); 

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
            // InternalDme.g:55:7: ( 'TRUE' )
            // InternalDme.g:55:9: 'TRUE'
            {
            match("TRUE"); 


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
            // InternalDme.g:56:7: ( 'true' )
            // InternalDme.g:56:9: 'true'
            {
            match("true"); 


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
            // InternalDme.g:57:7: ( 'FALSE' )
            // InternalDme.g:57:9: 'FALSE'
            {
            match("FALSE"); 


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
            // InternalDme.g:58:7: ( 'false' )
            // InternalDme.g:58:9: 'false'
            {
            match("false"); 


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
            // InternalDme.g:59:7: ( 'UNDEFINED' )
            // InternalDme.g:59:9: 'UNDEFINED'
            {
            match("UNDEFINED"); 


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
            // InternalDme.g:60:7: ( 'undefined' )
            // InternalDme.g:60:9: 'undefined'
            {
            match("undefined"); 


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
            // InternalDme.g:61:7: ( 'E' )
            // InternalDme.g:61:9: 'E'
            {
            match('E'); 

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
            // InternalDme.g:62:7: ( 'e' )
            // InternalDme.g:62:9: 'e'
            {
            match('e'); 

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
            // InternalDme.g:63:7: ( '+' )
            // InternalDme.g:63:9: '+'
            {
            match('+'); 

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
            // InternalDme.g:64:7: ( '-' )
            // InternalDme.g:64:9: '-'
            {
            match('-'); 

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
            // InternalDme.g:65:7: ( '.*' )
            // InternalDme.g:65:9: '.*'
            {
            match(".*"); 


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
            // InternalDme.g:66:7: ( 'OR' )
            // InternalDme.g:66:9: 'OR'
            {
            match("OR"); 


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
            // InternalDme.g:67:7: ( 'or' )
            // InternalDme.g:67:9: 'or'
            {
            match("or"); 


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
            // InternalDme.g:68:7: ( 'XOR' )
            // InternalDme.g:68:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalDme.g:69:7: ( 'xor' )
            // InternalDme.g:69:9: 'xor'
            {
            match("xor"); 


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
            // InternalDme.g:70:7: ( 'AND' )
            // InternalDme.g:70:9: 'AND'
            {
            match("AND"); 


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
            // InternalDme.g:71:7: ( 'and' )
            // InternalDme.g:71:9: 'and'
            {
            match("and"); 


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
            // InternalDme.g:72:7: ( '=' )
            // InternalDme.g:72:9: '='
            {
            match('='); 

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
            // InternalDme.g:73:7: ( '!=' )
            // InternalDme.g:73:9: '!='
            {
            match("!="); 


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
            // InternalDme.g:74:7: ( '<>' )
            // InternalDme.g:74:9: '<>'
            {
            match("<>"); 


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
            // InternalDme.g:75:7: ( '<' )
            // InternalDme.g:75:9: '<'
            {
            match('<'); 

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
            // InternalDme.g:76:7: ( '<=' )
            // InternalDme.g:76:9: '<='
            {
            match("<="); 


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
            // InternalDme.g:77:7: ( '\\u2264' )
            // InternalDme.g:77:9: '\\u2264'
            {
            match('\u2264'); 

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
            // InternalDme.g:78:7: ( '>=' )
            // InternalDme.g:78:9: '>='
            {
            match(">="); 


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
            // InternalDme.g:79:7: ( '\\u2265' )
            // InternalDme.g:79:9: '\\u2265'
            {
            match('\u2265'); 

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
            // InternalDme.g:80:7: ( '>' )
            // InternalDme.g:80:9: '>'
            {
            match('>'); 

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
            // InternalDme.g:81:7: ( '->' )
            // InternalDme.g:81:9: '->'
            {
            match("->"); 


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
            // InternalDme.g:82:7: ( '=>' )
            // InternalDme.g:82:9: '=>'
            {
            match("=>"); 


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
            // InternalDme.g:83:7: ( '/' )
            // InternalDme.g:83:9: '/'
            {
            match('/'); 

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
            // InternalDme.g:84:7: ( '**' )
            // InternalDme.g:84:9: '**'
            {
            match("**"); 


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
            // InternalDme.g:85:7: ( '%' )
            // InternalDme.g:85:9: '%'
            {
            match('%'); 

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
            // InternalDme.g:86:7: ( '!' )
            // InternalDme.g:86:9: '!'
            {
            match('!'); 

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
            // InternalDme.g:87:7: ( 'NOT' )
            // InternalDme.g:87:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalDme.g:88:7: ( 'not' )
            // InternalDme.g:88:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDme.g:4036:9: ( ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )* )
            // InternalDme.g:4036:11: ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )*
            {
            // InternalDme.g:4036:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDme.g:4036:11: '^'
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

            // InternalDme.g:4036:34: ( RULE_LETTER | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDme.g:
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
            // InternalDme.g:4038:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalDme.g:4038:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalDme.g:4038:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalDme.g:4038:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDme.g:4038:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalDme.g:4040:14: ( ( '0' .. '9' )+ )
            // InternalDme.g:4040:16: ( '0' .. '9' )+
            {
            // InternalDme.g:4040:16: ( '0' .. '9' )+
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
            	    // InternalDme.g:4040:17: '0' .. '9'
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
            // InternalDme.g:4042:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' ) )
            // InternalDme.g:4042:24: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
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
            // InternalDme.g:4044:26: (~ ( ( '\\u00BB' | '[' ) ) )
            // InternalDme.g:4044:28: ~ ( ( '\\u00BB' | '[' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||(input.LA(1)>='\\' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFF') ) {
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
            // InternalDme.g:4046:22: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalDme.g:4046:24: '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match('\u00AB'); 
            // InternalDme.g:4046:33: ( RULE_PLAIN_TEXT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='Z')||(LA5_0>='\\' && LA5_0<='\u00BA')||(LA5_0>='\u00BC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDme.g:4046:33: RULE_PLAIN_TEXT
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
            // InternalDme.g:4048:23: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '[' )
            // InternalDme.g:4048:25: '\\u00AB' ( RULE_PLAIN_TEXT )* '['
            {
            match('\u00AB'); 
            // InternalDme.g:4048:34: ( RULE_PLAIN_TEXT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='Z')||(LA6_0>='\\' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDme.g:4048:34: RULE_PLAIN_TEXT
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
            // InternalDme.g:4050:24: ( ']' ( RULE_PLAIN_TEXT )* '[' )
            // InternalDme.g:4050:26: ']' ( RULE_PLAIN_TEXT )* '['
            {
            match(']'); 
            // InternalDme.g:4050:30: ( RULE_PLAIN_TEXT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='Z')||(LA7_0>='\\' && LA7_0<='\u00BA')||(LA7_0>='\u00BC' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDme.g:4050:30: RULE_PLAIN_TEXT
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
            // InternalDme.g:4052:21: ( ']' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalDme.g:4052:23: ']' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match(']'); 
            // InternalDme.g:4052:27: ( RULE_PLAIN_TEXT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='Z')||(LA8_0>='\\' && LA8_0<='\u00BA')||(LA8_0>='\u00BC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDme.g:4052:27: RULE_PLAIN_TEXT
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
            // InternalDme.g:4054:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDme.g:4054:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDme.g:4054:24: ( options {greedy=false; } : . )*
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
            	    // InternalDme.g:4054:52: .
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
            // InternalDme.g:4056:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDme.g:4056:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDme.g:4056:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDme.g:4056:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalDme.g:4056:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDme.g:4056:41: ( '\\r' )? '\\n'
                    {
                    // InternalDme.g:4056:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDme.g:4056:41: '\\r'
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
            // InternalDme.g:4058:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDme.g:4058:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDme.g:4058:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalDme.g:
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
            // InternalDme.g:4060:16: ( . )
            // InternalDme.g:4060:18: .
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
        // InternalDme.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=89;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalDme.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalDme.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalDme.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalDme.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalDme.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalDme.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalDme.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalDme.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalDme.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalDme.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalDme.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalDme.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalDme.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalDme.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalDme.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalDme.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalDme.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalDme.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalDme.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalDme.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalDme.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalDme.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalDme.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalDme.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalDme.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalDme.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalDme.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalDme.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalDme.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalDme.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalDme.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalDme.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalDme.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalDme.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalDme.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalDme.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalDme.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalDme.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalDme.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalDme.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalDme.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalDme.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalDme.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalDme.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalDme.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalDme.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalDme.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalDme.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalDme.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalDme.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalDme.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalDme.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalDme.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalDme.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalDme.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalDme.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalDme.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalDme.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalDme.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalDme.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalDme.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalDme.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalDme.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalDme.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalDme.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalDme.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalDme.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalDme.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalDme.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalDme.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalDme.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalDme.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalDme.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalDme.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalDme.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalDme.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalDme.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalDme.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalDme.g:1:478: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 80 :
                // InternalDme.g:1:486: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 81 :
                // InternalDme.g:1:498: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 82 :
                // InternalDme.g:1:511: RULE_PLAIN_TEXT_ONLY
                {
                mRULE_PLAIN_TEXT_ONLY(); 

                }
                break;
            case 83 :
                // InternalDme.g:1:532: RULE_PLAIN_TEXT_START
                {
                mRULE_PLAIN_TEXT_START(); 

                }
                break;
            case 84 :
                // InternalDme.g:1:554: RULE_PLAIN_TEXT_MIDDLE
                {
                mRULE_PLAIN_TEXT_MIDDLE(); 

                }
                break;
            case 85 :
                // InternalDme.g:1:577: RULE_PLAIN_TEXT_END
                {
                mRULE_PLAIN_TEXT_END(); 

                }
                break;
            case 86 :
                // InternalDme.g:1:597: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 87 :
                // InternalDme.g:1:613: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 88 :
                // InternalDme.g:1:629: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 89 :
                // InternalDme.g:1:637: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\67\1\76\1\uffff\5\67\1\uffff\1\117\4\67\1\127\3\uffff\1\65\5\67\1\146\4\67\1\153\1\uffff\1\156\4\67\1\164\1\166\1\171\1\uffff\1\174\1\uffff\1\u0080\1\uffff\1\65\1\uffff\1\65\1\uffff\2\65\2\uffff\1\u008c\1\uffff\2\67\1\u008f\3\67\2\uffff\2\67\1\u0096\2\67\1\u0099\5\67\1\u009f\1\67\3\uffff\3\67\1\u00a5\1\67\7\uffff\11\67\2\uffff\4\67\4\uffff\1\u00b4\1\u00b5\2\67\30\uffff\1\67\1\uffff\1\67\1\u00ba\1\uffff\2\67\1\u00bd\3\67\1\uffff\2\67\1\uffff\1\67\1\u00c6\1\u00c7\2\67\1\uffff\1\u00ca\3\67\1\u00ce\1\uffff\1\u00cf\5\67\1\u00d5\1\u00d6\1\u00d7\5\67\2\uffff\1\u00dd\1\u00de\2\67\1\uffff\1\67\1\u00e2\1\uffff\3\67\1\u00e6\1\u00e7\1\u00e8\2\67\2\uffff\2\67\1\uffff\1\u00ed\1\u00ee\1\67\2\uffff\1\u00f0\4\67\3\uffff\1\67\1\u00f6\3\67\2\uffff\2\67\1\u00fc\1\uffff\3\67\3\uffff\2\67\1\u0102\1\u0103\2\uffff\1\u0104\1\uffff\1\67\1\u0106\1\67\1\u0108\1\u0109\1\uffff\1\u010a\2\67\1\u010d\1\u010e\1\uffff\3\67\1\u0112\1\67\3\uffff\1\u0114\1\uffff\1\u0115\3\uffff\2\67\2\uffff\1\u0118\2\67\1\uffff\1\67\2\uffff\2\67\1\uffff\6\67\1\u0124\1\67\1\u0126\1\u0127\1\u0128\1\uffff\1\67\3\uffff\2\67\1\u012c\1\uffff";
    static final String DFA14_eofS =
        "\u012d\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\146\1\60\1\uffff\1\157\1\150\2\145\1\143\1\uffff\1\75\1\145\1\165\1\123\1\116\1\52\3\uffff\1\142\1\105\1\101\1\141\1\105\1\141\1\52\1\122\1\101\1\116\1\156\1\60\1\uffff\1\76\1\122\1\162\1\117\1\157\1\76\2\75\1\uffff\1\75\1\uffff\1\52\1\uffff\1\101\1\uffff\1\0\1\uffff\2\0\2\uffff\1\60\1\uffff\1\160\1\141\1\60\1\145\1\163\1\144\2\uffff\1\156\1\151\1\60\1\155\1\145\1\60\1\146\1\164\1\167\2\164\1\60\1\144\3\uffff\1\154\1\155\1\101\1\60\1\104\7\uffff\1\114\1\124\1\111\1\164\1\151\1\127\1\124\1\162\1\154\2\uffff\1\125\1\114\1\104\1\144\4\uffff\2\60\1\122\1\162\21\uffff\1\0\2\uffff\1\0\3\uffff\1\141\1\uffff\1\157\1\60\1\uffff\1\156\1\145\1\60\1\144\1\147\1\145\1\uffff\1\145\1\156\1\uffff\1\157\2\60\1\145\1\157\1\uffff\1\60\1\164\1\146\1\141\1\60\1\uffff\1\60\1\106\1\125\1\123\1\165\1\163\3\60\1\163\1\105\1\123\1\105\1\145\2\uffff\2\60\1\151\1\162\1\uffff\1\164\1\60\1\uffff\1\145\1\151\1\147\3\60\1\162\1\146\2\uffff\2\162\1\uffff\2\60\1\156\2\uffff\1\60\1\122\1\105\1\162\1\145\3\uffff\1\145\1\60\1\105\1\106\1\146\2\uffff\1\156\1\164\1\60\1\uffff\1\170\1\164\1\145\3\uffff\1\145\1\151\2\60\2\uffff\1\60\1\uffff\1\116\1\60\1\156\2\60\1\uffff\1\60\1\111\1\151\2\60\1\uffff\1\164\1\151\1\162\1\60\1\143\3\uffff\1\60\1\uffff\1\60\3\uffff\1\116\1\156\2\uffff\1\60\1\157\1\145\1\uffff\1\141\2\uffff\1\105\1\145\1\uffff\1\156\1\144\1\164\1\104\1\144\1\163\1\60\1\151\3\60\1\uffff\1\157\3\uffff\1\156\1\163\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\163\1\u00ff\1\uffff\1\157\1\162\1\171\1\157\1\163\1\uffff\1\75\1\145\1\165\2\123\1\56\3\uffff\1\142\2\105\1\145\1\117\1\157\1\52\1\122\1\101\1\116\1\156\1\u00ff\1\uffff\1\76\1\122\1\162\1\117\1\157\1\76\1\75\1\76\1\uffff\1\75\1\uffff\1\57\1\uffff\1\u00ff\1\uffff\1\uffff\1\uffff\2\uffff\2\uffff\1\u00ff\1\uffff\1\160\1\141\1\u00ff\1\145\1\163\1\144\2\uffff\1\156\1\165\1\u00ff\1\155\1\145\1\u00ff\1\146\1\164\1\167\2\164\1\u00ff\1\144\3\uffff\1\156\1\155\1\101\1\u00ff\1\104\7\uffff\1\114\1\124\1\111\1\164\1\151\1\127\1\124\1\162\1\154\2\uffff\1\125\1\114\1\104\1\144\4\uffff\2\u00ff\1\122\1\162\21\uffff\1\uffff\2\uffff\1\uffff\3\uffff\1\141\1\uffff\1\157\1\u00ff\1\uffff\1\156\1\145\1\u00ff\1\164\1\147\1\145\1\uffff\1\145\1\156\1\uffff\1\157\2\u00ff\1\145\1\157\1\uffff\1\u00ff\1\164\1\146\1\141\1\u00ff\1\uffff\1\u00ff\1\106\1\125\1\123\1\165\1\163\3\u00ff\1\163\1\105\1\123\1\105\1\145\2\uffff\2\u00ff\1\151\1\162\1\uffff\1\164\1\u00ff\1\uffff\1\145\1\151\1\147\3\u00ff\1\162\1\146\2\uffff\2\162\1\uffff\2\u00ff\1\156\2\uffff\1\u00ff\1\122\1\105\1\162\1\145\3\uffff\1\145\1\u00ff\1\105\1\106\1\146\2\uffff\1\156\1\164\1\u00ff\1\uffff\1\170\1\164\1\145\3\uffff\1\145\1\151\2\u00ff\2\uffff\1\u00ff\1\uffff\1\116\1\u00ff\1\156\2\u00ff\1\uffff\1\u00ff\1\111\1\151\2\u00ff\1\uffff\1\164\1\151\1\162\1\u00ff\1\143\3\uffff\1\u00ff\1\uffff\1\u00ff\3\uffff\1\116\1\156\2\uffff\1\u00ff\1\157\1\145\1\uffff\1\141\2\uffff\1\105\1\145\1\uffff\1\156\1\144\1\164\1\104\1\144\1\163\1\u00ff\1\151\3\u00ff\1\uffff\1\157\3\uffff\1\156\1\163\1\u00ff\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\5\uffff\1\14\6\uffff\1\31\1\32\1\33\14\uffff\1\65\10\uffff\1\103\1\uffff\1\105\1\uffff\1\113\1\uffff\1\117\1\uffff\1\121\2\uffff\1\130\1\131\1\uffff\1\117\6\uffff\1\64\1\4\15\uffff\1\14\1\23\1\15\5\uffff\1\53\1\67\1\30\1\31\1\32\1\33\1\34\11\uffff\1\112\1\54\4\uffff\1\63\1\65\1\107\1\66\4\uffff\1\110\1\76\1\77\1\114\1\100\1\102\1\101\1\103\1\104\1\106\1\105\1\126\1\127\1\111\1\113\1\120\1\121\1\uffff\1\123\1\122\1\uffff\1\125\1\124\1\130\1\uffff\1\52\2\uffff\1\45\6\uffff\1\17\2\uffff\1\7\5\uffff\1\27\5\uffff\1\26\16\uffff\1\70\1\71\4\uffff\1\25\2\uffff\1\50\10\uffff\1\116\1\44\2\uffff\1\75\3\uffff\1\24\1\74\5\uffff\1\43\1\115\1\51\5\uffff\1\72\1\73\3\uffff\1\47\3\uffff\1\56\1\22\1\46\4\uffff\1\16\1\36\1\uffff\1\35\5\uffff\1\55\5\uffff\1\3\5\uffff\1\13\1\21\1\20\1\uffff\1\41\1\uffff\1\42\1\60\1\57\2\uffff\1\1\1\2\3\uffff\1\11\1\uffff\1\37\1\40\2\uffff\1\5\13\uffff\1\6\1\uffff\1\61\1\62\1\12\3\uffff\1\10";
    static final String DFA14_specialS =
        "\1\3\57\uffff\1\4\1\uffff\1\5\1\1\120\uffff\1\0\2\uffff\1\2\u00a5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\47\1\60\2\65\1\55\2\65\1\21\1\23\1\32\1\40\1\22\1\41\1\20\1\54\12\61\1\13\1\65\1\50\1\46\1\52\1\65\1\24\1\17\3\57\1\37\1\34\2\57\1\16\4\57\1\30\1\42\2\57\1\26\1\25\1\33\1\35\2\57\1\44\2\57\2\65\1\63\1\56\1\57\1\65\1\11\1\7\1\5\1\1\1\3\1\31\1\57\1\15\1\2\4\57\1\10\1\43\2\57\1\27\1\14\1\6\1\36\2\57\1\45\2\57\1\4\1\65\1\12\55\65\1\62\24\65\27\57\1\65\37\57\1\65\10\57\u2164\65\1\51\1\53\udd9a\65",
            "\1\66",
            "\1\72\6\uffff\1\70\5\uffff\1\71",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\74\1\67\1\75\7\67\1\73\4\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\100",
            "\1\104\1\103\5\uffff\1\102\2\uffff\1\101",
            "\1\106\23\uffff\1\105",
            "\1\110\11\uffff\1\107",
            "\1\112\2\uffff\1\111\7\uffff\1\114\4\uffff\1\113",
            "",
            "\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\124\4\uffff\1\123",
            "\1\126\3\uffff\1\125",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\136\3\uffff\1\135",
            "\1\140\3\uffff\1\137",
            "\1\141\11\uffff\1\142",
            "\1\144\15\uffff\1\143",
            "\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165",
            "\1\170\1\167",
            "",
            "\1\173",
            "",
            "\1\176\4\uffff\1\177",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\0\u0082",
            "",
            "\133\u0084\1\u0085\137\u0084\1\u0086\uff44\u0084",
            "\133\u0087\1\u0089\137\u0087\1\u0088\uff44\u0087",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\14\67\1\u008b\15\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\1\u0094\13\uffff\1\u0095",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0097",
            "\1\u0098",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00a0",
            "",
            "",
            "",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00b6",
            "\1\u00b7",
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
            "\133\u0084\1\u0085\137\u0084\1\u0086\uff44\u0084",
            "",
            "",
            "\133\u0087\1\u0089\137\u0087\1\u0088\uff44\u0087",
            "",
            "",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00bf\17\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\u00c5\21\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00ef",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "",
            "\1\u00f5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u0105",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0107",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u010b",
            "\1\u010c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0113",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "",
            "",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\1\u0125",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
            "",
            "\1\u0129",
            "",
            "",
            "",
            "\1\u012a",
            "\1\u012b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\105\uffff\27\67\1\uffff\37\67\1\uffff\10\67",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START | RULE_PLAIN_TEXT_MIDDLE | RULE_PLAIN_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_132 = input.LA(1);

                        s = -1;
                        if ( (LA14_132=='[') ) {s = 133;}

                        else if ( ((LA14_132>='\u0000' && LA14_132<='Z')||(LA14_132>='\\' && LA14_132<='\u00BA')||(LA14_132>='\u00BC' && LA14_132<='\uFFFF')) ) {s = 132;}

                        else if ( (LA14_132=='\u00BB') ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( ((LA14_51>='\u0000' && LA14_51<='Z')||(LA14_51>='\\' && LA14_51<='\u00BA')||(LA14_51>='\u00BC' && LA14_51<='\uFFFF')) ) {s = 135;}

                        else if ( (LA14_51=='\u00BB') ) {s = 136;}

                        else if ( (LA14_51=='[') ) {s = 137;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_135 = input.LA(1);

                        s = -1;
                        if ( (LA14_135=='[') ) {s = 137;}

                        else if ( ((LA14_135>='\u0000' && LA14_135<='Z')||(LA14_135>='\\' && LA14_135<='\u00BA')||(LA14_135>='\u00BC' && LA14_135<='\uFFFF')) ) {s = 135;}

                        else if ( (LA14_135=='\u00BB') ) {s = 136;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='d') ) {s = 1;}

                        else if ( (LA14_0=='i') ) {s = 2;}

                        else if ( (LA14_0=='e') ) {s = 3;}

                        else if ( (LA14_0=='{') ) {s = 4;}

                        else if ( (LA14_0=='c') ) {s = 5;}

                        else if ( (LA14_0=='t') ) {s = 6;}

                        else if ( (LA14_0=='b') ) {s = 7;}

                        else if ( (LA14_0=='n') ) {s = 8;}

                        else if ( (LA14_0=='a') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0==':') ) {s = 11;}

                        else if ( (LA14_0=='s') ) {s = 12;}

                        else if ( (LA14_0=='h') ) {s = 13;}

                        else if ( (LA14_0=='I') ) {s = 14;}

                        else if ( (LA14_0=='A') ) {s = 15;}

                        else if ( (LA14_0=='.') ) {s = 16;}

                        else if ( (LA14_0=='(') ) {s = 17;}

                        else if ( (LA14_0==',') ) {s = 18;}

                        else if ( (LA14_0==')') ) {s = 19;}

                        else if ( (LA14_0=='@') ) {s = 20;}

                        else if ( (LA14_0=='S') ) {s = 21;}

                        else if ( (LA14_0=='R') ) {s = 22;}

                        else if ( (LA14_0=='r') ) {s = 23;}

                        else if ( (LA14_0=='N') ) {s = 24;}

                        else if ( (LA14_0=='f') ) {s = 25;}

                        else if ( (LA14_0=='*') ) {s = 26;}

                        else if ( (LA14_0=='T') ) {s = 27;}

                        else if ( (LA14_0=='F') ) {s = 28;}

                        else if ( (LA14_0=='U') ) {s = 29;}

                        else if ( (LA14_0=='u') ) {s = 30;}

                        else if ( (LA14_0=='E') ) {s = 31;}

                        else if ( (LA14_0=='+') ) {s = 32;}

                        else if ( (LA14_0=='-') ) {s = 33;}

                        else if ( (LA14_0=='O') ) {s = 34;}

                        else if ( (LA14_0=='o') ) {s = 35;}

                        else if ( (LA14_0=='X') ) {s = 36;}

                        else if ( (LA14_0=='x') ) {s = 37;}

                        else if ( (LA14_0=='=') ) {s = 38;}

                        else if ( (LA14_0=='!') ) {s = 39;}

                        else if ( (LA14_0=='<') ) {s = 40;}

                        else if ( (LA14_0=='\u2264') ) {s = 41;}

                        else if ( (LA14_0=='>') ) {s = 42;}

                        else if ( (LA14_0=='\u2265') ) {s = 43;}

                        else if ( (LA14_0=='/') ) {s = 44;}

                        else if ( (LA14_0=='%') ) {s = 45;}

                        else if ( (LA14_0=='^') ) {s = 46;}

                        else if ( ((LA14_0>='B' && LA14_0<='D')||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='M')||(LA14_0>='P' && LA14_0<='Q')||(LA14_0>='V' && LA14_0<='W')||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='v' && LA14_0<='w')||(LA14_0>='y' && LA14_0<='z')||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u00FF')) ) {s = 47;}

                        else if ( (LA14_0=='\"') ) {s = 48;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 49;}

                        else if ( (LA14_0=='\u00AB') ) {s = 50;}

                        else if ( (LA14_0==']') ) {s = 51;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 52;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||(LA14_0>='&' && LA14_0<='\'')||LA14_0==';'||LA14_0=='?'||(LA14_0>='[' && LA14_0<='\\')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\u00BF')||LA14_0=='\u00D7'||LA14_0=='\u00F7'||(LA14_0>='\u0100' && LA14_0<='\u2263')||(LA14_0>='\u2266' && LA14_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( ((LA14_48>='\u0000' && LA14_48<='\uFFFF')) ) {s = 130;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( ((LA14_50>='\u0000' && LA14_50<='Z')||(LA14_50>='\\' && LA14_50<='\u00BA')||(LA14_50>='\u00BC' && LA14_50<='\uFFFF')) ) {s = 132;}

                        else if ( (LA14_50=='[') ) {s = 133;}

                        else if ( (LA14_50=='\u00BB') ) {s = 134;}

                        else s = 53;

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