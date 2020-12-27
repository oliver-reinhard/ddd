package com.mimacom.ddd.pub.proto.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPubProtoLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_PLAIN_TEXT_ONLY=7;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_RICH_TEXT_START=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int RULE_NATURAL=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_RICH_TEXT_END=10;
    public static final int RULE_RICH_TEXT_MIDDLE=9;
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

    public InternalPubProtoLexer() {;} 
    public InternalPubProtoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPubProtoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPubProto.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:11:7: ( ':=' )
            // InternalPubProto.g:11:9: ':='
            {
            match(":="); 


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
            // InternalPubProto.g:12:7: ( '{' )
            // InternalPubProto.g:12:9: '{'
            {
            match('{'); 

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
            // InternalPubProto.g:13:7: ( 'false' )
            // InternalPubProto.g:13:9: 'false'
            {
            match("false"); 


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
            // InternalPubProto.g:14:7: ( 'ISA' )
            // InternalPubProto.g:14:9: 'ISA'
            {
            match("ISA"); 


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
            // InternalPubProto.g:15:7: ( 'isa' )
            // InternalPubProto.g:15:9: 'isa'
            {
            match("isa"); 


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
            // InternalPubProto.g:16:7: ( 'AS' )
            // InternalPubProto.g:16:9: 'AS'
            {
            match("AS"); 


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
            // InternalPubProto.g:17:7: ( 'as' )
            // InternalPubProto.g:17:9: 'as'
            {
            match("as"); 


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
            // InternalPubProto.g:18:7: ( '*' )
            // InternalPubProto.g:18:9: '*'
            {
            match('*'); 

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
            // InternalPubProto.g:19:7: ( 'FALSE' )
            // InternalPubProto.g:19:9: 'FALSE'
            {
            match("FALSE"); 


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
            // InternalPubProto.g:20:7: ( 'UNDEFINED' )
            // InternalPubProto.g:20:9: 'UNDEFINED'
            {
            match("UNDEFINED"); 


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
            // InternalPubProto.g:21:7: ( 'undefined' )
            // InternalPubProto.g:21:9: 'undefined'
            {
            match("undefined"); 


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
            // InternalPubProto.g:22:7: ( 'E' )
            // InternalPubProto.g:22:9: 'E'
            {
            match('E'); 

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
            // InternalPubProto.g:23:7: ( 'e' )
            // InternalPubProto.g:23:9: 'e'
            {
            match('e'); 

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
            // InternalPubProto.g:24:7: ( '+' )
            // InternalPubProto.g:24:9: '+'
            {
            match('+'); 

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
            // InternalPubProto.g:25:7: ( '-' )
            // InternalPubProto.g:25:9: '-'
            {
            match('-'); 

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
            // InternalPubProto.g:26:7: ( 'Print' )
            // InternalPubProto.g:26:9: 'Print'
            {
            match("Print"); 


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
            // InternalPubProto.g:27:7: ( 'Web' )
            // InternalPubProto.g:27:9: 'Web'
            {
            match("Web"); 


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
            // InternalPubProto.g:28:7: ( 'arabic' )
            // InternalPubProto.g:28:9: 'arabic'
            {
            match("arabic"); 


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
            // InternalPubProto.g:29:7: ( 'capitalLetter' )
            // InternalPubProto.g:29:9: 'capitalLetter'
            {
            match("capitalLetter"); 


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
            // InternalPubProto.g:30:7: ( 'smallLetter' )
            // InternalPubProto.g:30:9: 'smallLetter'
            {
            match("smallLetter"); 


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
            // InternalPubProto.g:31:7: ( 'capitalRoman' )
            // InternalPubProto.g:31:9: 'capitalRoman'
            {
            match("capitalRoman"); 


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
            // InternalPubProto.g:32:7: ( 'smallRoman' )
            // InternalPubProto.g:32:9: 'smallRoman'
            {
            match("smallRoman"); 


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
            // InternalPubProto.g:33:7: ( 'none' )
            // InternalPubProto.g:33:9: 'none'
            {
            match("none"); 


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
            // InternalPubProto.g:34:7: ( 'white' )
            // InternalPubProto.g:34:9: 'white'
            {
            match("white"); 


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
            // InternalPubProto.g:35:7: ( 'red' )
            // InternalPubProto.g:35:9: 'red'
            {
            match("red"); 


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
            // InternalPubProto.g:36:7: ( 'orange' )
            // InternalPubProto.g:36:9: 'orange'
            {
            match("orange"); 


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
            // InternalPubProto.g:37:7: ( 'yellow' )
            // InternalPubProto.g:37:9: 'yellow'
            {
            match("yellow"); 


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
            // InternalPubProto.g:38:7: ( 'green' )
            // InternalPubProto.g:38:9: 'green'
            {
            match("green"); 


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
            // InternalPubProto.g:39:7: ( 'blue' )
            // InternalPubProto.g:39:9: 'blue'
            {
            match("blue"); 


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
            // InternalPubProto.g:40:7: ( 'pink' )
            // InternalPubProto.g:40:9: 'pink'
            {
            match("pink"); 


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
            // InternalPubProto.g:41:7: ( 'grey' )
            // InternalPubProto.g:41:9: 'grey'
            {
            match("grey"); 


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
            // InternalPubProto.g:42:7: ( 'VOID' )
            // InternalPubProto.g:42:9: 'VOID'
            {
            match("VOID"); 


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
            // InternalPubProto.g:43:7: ( 'BOOLEAN' )
            // InternalPubProto.g:43:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


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
            // InternalPubProto.g:44:7: ( 'NUMBER' )
            // InternalPubProto.g:44:9: 'NUMBER'
            {
            match("NUMBER"); 


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
            // InternalPubProto.g:45:7: ( 'TEXT' )
            // InternalPubProto.g:45:9: 'TEXT'
            {
            match("TEXT"); 


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
            // InternalPubProto.g:46:7: ( 'IDENTIFIER' )
            // InternalPubProto.g:46:9: 'IDENTIFIER'
            {
            match("IDENTIFIER"); 


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
            // InternalPubProto.g:47:7: ( 'TIMEPOINT' )
            // InternalPubProto.g:47:9: 'TIMEPOINT'
            {
            match("TIMEPOINT"); 


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
            // InternalPubProto.g:48:7: ( 'STATE' )
            // InternalPubProto.g:48:9: 'STATE'
            {
            match("STATE"); 


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
            // InternalPubProto.g:49:7: ( 'STATE_EVENT' )
            // InternalPubProto.g:49:9: 'STATE_EVENT'
            {
            match("STATE_EVENT"); 


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
            // InternalPubProto.g:50:7: ( 'COMPLEX' )
            // InternalPubProto.g:50:9: 'COMPLEX'
            {
            match("COMPLEX"); 


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
            // InternalPubProto.g:51:7: ( 'NOTIFICATION' )
            // InternalPubProto.g:51:9: 'NOTIFICATION'
            {
            match("NOTIFICATION"); 


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
            // InternalPubProto.g:52:7: ( 'SERVICE' )
            // InternalPubProto.g:52:9: 'SERVICE'
            {
            match("SERVICE"); 


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
            // InternalPubProto.g:53:7: ( 'OR' )
            // InternalPubProto.g:53:9: 'OR'
            {
            match("OR"); 


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
            // InternalPubProto.g:54:7: ( 'or' )
            // InternalPubProto.g:54:9: 'or'
            {
            match("or"); 


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
            // InternalPubProto.g:55:7: ( 'XOR' )
            // InternalPubProto.g:55:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalPubProto.g:56:7: ( 'xor' )
            // InternalPubProto.g:56:9: 'xor'
            {
            match("xor"); 


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
            // InternalPubProto.g:57:7: ( 'AND' )
            // InternalPubProto.g:57:9: 'AND'
            {
            match("AND"); 


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
            // InternalPubProto.g:58:7: ( 'and' )
            // InternalPubProto.g:58:9: 'and'
            {
            match("and"); 


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
            // InternalPubProto.g:59:7: ( '=' )
            // InternalPubProto.g:59:9: '='
            {
            match('='); 

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
            // InternalPubProto.g:60:7: ( '!=' )
            // InternalPubProto.g:60:9: '!='
            {
            match("!="); 


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
            // InternalPubProto.g:61:7: ( '<>' )
            // InternalPubProto.g:61:9: '<>'
            {
            match("<>"); 


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
            // InternalPubProto.g:62:7: ( '<' )
            // InternalPubProto.g:62:9: '<'
            {
            match('<'); 

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
            // InternalPubProto.g:63:7: ( '<=' )
            // InternalPubProto.g:63:9: '<='
            {
            match("<="); 


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
            // InternalPubProto.g:64:7: ( '\\u2264' )
            // InternalPubProto.g:64:9: '\\u2264'
            {
            match('\u2264'); 

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
            // InternalPubProto.g:65:7: ( '>=' )
            // InternalPubProto.g:65:9: '>='
            {
            match(">="); 


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
            // InternalPubProto.g:66:7: ( '\\u2265' )
            // InternalPubProto.g:66:9: '\\u2265'
            {
            match('\u2265'); 

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
            // InternalPubProto.g:67:7: ( '>' )
            // InternalPubProto.g:67:9: '>'
            {
            match('>'); 

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
            // InternalPubProto.g:68:7: ( 'IN' )
            // InternalPubProto.g:68:9: 'IN'
            {
            match("IN"); 


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
            // InternalPubProto.g:69:7: ( 'in' )
            // InternalPubProto.g:69:9: 'in'
            {
            match("in"); 


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
            // InternalPubProto.g:70:7: ( '..' )
            // InternalPubProto.g:70:9: '..'
            {
            match(".."); 


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
            // InternalPubProto.g:71:7: ( '->' )
            // InternalPubProto.g:71:9: '->'
            {
            match("->"); 


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
            // InternalPubProto.g:72:7: ( '=>' )
            // InternalPubProto.g:72:9: '=>'
            {
            match("=>"); 


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
            // InternalPubProto.g:73:7: ( '/' )
            // InternalPubProto.g:73:9: '/'
            {
            match('/'); 

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
            // InternalPubProto.g:74:7: ( '**' )
            // InternalPubProto.g:74:9: '**'
            {
            match("**"); 


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
            // InternalPubProto.g:75:7: ( '%' )
            // InternalPubProto.g:75:9: '%'
            {
            match('%'); 

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
            // InternalPubProto.g:76:7: ( '!' )
            // InternalPubProto.g:76:9: '!'
            {
            match('!'); 

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
            // InternalPubProto.g:77:7: ( 'NOT' )
            // InternalPubProto.g:77:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalPubProto.g:78:7: ( 'not' )
            // InternalPubProto.g:78:9: 'not'
            {
            match("not"); 


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
            // InternalPubProto.g:79:7: ( '?' )
            // InternalPubProto.g:79:9: '?'
            {
            match('?'); 

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
            // InternalPubProto.g:80:7: ( 'publication' )
            // InternalPubProto.g:80:9: 'publication'
            {
            match("publication"); 


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
            // InternalPubProto.g:81:7: ( 'class' )
            // InternalPubProto.g:81:9: 'class'
            {
            match("class"); 


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
            // InternalPubProto.g:82:7: ( 'nature:' )
            // InternalPubProto.g:82:9: 'nature:'
            {
            match("nature:"); 


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
            // InternalPubProto.g:83:7: ( 'segments:' )
            // InternalPubProto.g:83:9: 'segments:'
            {
            match("segments:"); 


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
            // InternalPubProto.g:84:7: ( 'divisions:' )
            // InternalPubProto.g:84:9: 'divisions:'
            {
            match("divisions:"); 


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
            // InternalPubProto.g:85:7: ( 'symbol:' )
            // InternalPubProto.g:85:9: 'symbol:'
            {
            match("symbol:"); 


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
            // InternalPubProto.g:86:7: ( 'htmlPreamble:' )
            // InternalPubProto.g:86:9: 'htmlPreamble:'
            {
            match("htmlPreamble:"); 


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
            // InternalPubProto.g:87:7: ( 'latexClass:' )
            // InternalPubProto.g:87:9: 'latexClass:'
            {
            match("latexClass:"); 


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
            // InternalPubProto.g:88:7: ( 'latexPreamble:' )
            // InternalPubProto.g:88:9: 'latexPreamble:'
            {
            match("latexPreamble:"); 


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
            // InternalPubProto.g:89:7: ( 'title:' )
            // InternalPubProto.g:89:9: 'title:'
            {
            match("title:"); 


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
            // InternalPubProto.g:90:7: ( 'optional:' )
            // InternalPubProto.g:90:9: 'optional:'
            {
            match("optional:"); 


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
            // InternalPubProto.g:91:7: ( 'Abstract' )
            // InternalPubProto.g:91:9: 'Abstract'
            {
            match("Abstract"); 


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
            // InternalPubProto.g:92:7: ( '}' )
            // InternalPubProto.g:92:9: '}'
            {
            match('}'); 

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
            // InternalPubProto.g:93:7: ( 'Preface' )
            // InternalPubProto.g:93:9: 'Preface'
            {
            match("Preface"); 


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
            // InternalPubProto.g:94:8: ( 'Epilogue' )
            // InternalPubProto.g:94:10: 'Epilogue'
            {
            match("Epilogue"); 


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
            // InternalPubProto.g:95:8: ( 'Body' )
            // InternalPubProto.g:95:10: 'Body'
            {
            match("Body"); 


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
            // InternalPubProto.g:96:8: ( 'ChangeHistory' )
            // InternalPubProto.g:96:10: 'ChangeHistory'
            {
            match("ChangeHistory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:97:8: ( 'TableOfContents' )
            // InternalPubProto.g:97:10: 'TableOfContents'
            {
            match("TableOfContents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:98:8: ( 'maxLevel:' )
            // InternalPubProto.g:98:10: 'maxLevel:'
            {
            match("maxLevel:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:99:8: ( 'Abbreviations' )
            // InternalPubProto.g:99:10: 'Abbreviations'
            {
            match("Abbreviations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:100:8: ( 'ListOfTables' )
            // InternalPubProto.g:100:10: 'ListOfTables'
            {
            match("ListOfTables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:101:8: ( 'ListOfFigures' )
            // InternalPubProto.g:101:10: 'ListOfFigures'
            {
            match("ListOfFigures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:102:8: ( 'Bibliography' )
            // InternalPubProto.g:102:10: 'Bibliography'
            {
            match("Bibliography"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:103:8: ( 'Glossary' )
            // InternalPubProto.g:103:10: 'Glossary'
            {
            match("Glossary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:104:8: ( 'Index' )
            // InternalPubProto.g:104:10: 'Index'
            {
            match("Index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:105:8: ( 'numbering:' )
            // InternalPubProto.g:105:10: 'numbering:'
            {
            match("numbering:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:106:8: ( 'Part' )
            // InternalPubProto.g:106:10: 'Part'
            {
            match("Part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:107:8: ( 'Appendix' )
            // InternalPubProto.g:107:10: 'Appendix'
            {
            match("Appendix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:108:8: ( 'Chapter' )
            // InternalPubProto.g:108:10: 'Chapter'
            {
            match("Chapter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:109:8: ( 'Section' )
            // InternalPubProto.g:109:10: 'Section'
            {
            match("Section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:110:8: ( 'Sub' )
            // InternalPubProto.g:110:10: 'Sub'
            {
            match("Sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:111:8: ( 'Subsub' )
            // InternalPubProto.g:111:10: 'Subsub'
            {
            match("Subsub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:112:8: ( 'NOTE' )
            // InternalPubProto.g:112:10: 'NOTE'
            {
            match("NOTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:113:8: ( 'import' )
            // InternalPubProto.g:113:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:114:8: ( 'test' )
            // InternalPubProto.g:114:10: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:115:8: ( 'context' )
            // InternalPubProto.g:115:10: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:116:8: ( ',' )
            // InternalPubProto.g:116:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:117:8: ( ':' )
            // InternalPubProto.g:117:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:118:8: ( '(' )
            // InternalPubProto.g:118:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:119:8: ( ')' )
            // InternalPubProto.g:119:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:120:8: ( 'archetype' )
            // InternalPubProto.g:120:10: 'archetype'
            {
            match("archetype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:121:8: ( 'is' )
            // InternalPubProto.g:121:10: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:122:8: ( 'filter' )
            // InternalPubProto.g:122:10: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:123:8: ( 'with' )
            // InternalPubProto.g:123:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:124:8: ( '.' )
            // InternalPubProto.g:124:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:125:8: ( '|' )
            // InternalPubProto.g:125:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:126:8: ( 'entity' )
            // InternalPubProto.g:126:10: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:127:8: ( 'detail' )
            // InternalPubProto.g:127:10: 'detail'
            {
            match("detail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:128:8: ( '[' )
            // InternalPubProto.g:128:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:129:8: ( ']' )
            // InternalPubProto.g:129:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:130:8: ( '#' )
            // InternalPubProto.g:130:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:131:8: ( 'if' )
            // InternalPubProto.g:131:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:132:8: ( 'then' )
            // InternalPubProto.g:132:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:133:8: ( 'end' )
            // InternalPubProto.g:133:10: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:134:8: ( 'else' )
            // InternalPubProto.g:134:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:135:8: ( '.*' )
            // InternalPubProto.g:135:10: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:136:8: ( 'true' )
            // InternalPubProto.g:136:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:137:8: ( '@before' )
            // InternalPubProto.g:137:10: '@before'
            {
            match("@before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:138:8: ( 'all' )
            // InternalPubProto.g:138:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:139:8: ( 'TRUE' )
            // InternalPubProto.g:139:10: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:15438:9: ( ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )* )
            // InternalPubProto.g:15438:11: ( '^' )? ( RULE_LETTER | '_' ) ( RULE_LETTER | '_' | '0' .. '9' )*
            {
            // InternalPubProto.g:15438:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPubProto.g:15438:11: '^'
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

            // InternalPubProto.g:15438:34: ( RULE_LETTER | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPubProto.g:
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
            // InternalPubProto.g:15440:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalPubProto.g:15440:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPubProto.g:15440:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalPubProto.g:15440:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPubProto.g:15440:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalPubProto.g:15442:14: ( ( ( '0' .. '9' )+ | '\\u221E' ) )
            // InternalPubProto.g:15442:16: ( ( '0' .. '9' )+ | '\\u221E' )
            {
            // InternalPubProto.g:15442:16: ( ( '0' .. '9' )+ | '\\u221E' )
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
                    // InternalPubProto.g:15442:17: ( '0' .. '9' )+
                    {
                    // InternalPubProto.g:15442:17: ( '0' .. '9' )+
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
                    	    // InternalPubProto.g:15442:18: '0' .. '9'
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
                    // InternalPubProto.g:15442:29: '\\u221E'
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
            // InternalPubProto.g:15444:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' ) )
            // InternalPubProto.g:15444:24: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
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
            // InternalPubProto.g:15446:26: (~ ( ( '\\u00BB' | ']' | '[' ) ) )
            // InternalPubProto.g:15446:28: ~ ( ( '\\u00BB' | ']' | '[' ) )
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
            // InternalPubProto.g:15448:22: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalPubProto.g:15448:24: '\\u00AB' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match('\u00AB'); 
            // InternalPubProto.g:15448:33: ( RULE_PLAIN_TEXT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='Z')||LA6_0=='\\'||(LA6_0>='^' && LA6_0<='\u00BA')||(LA6_0>='\u00BC' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPubProto.g:15448:33: RULE_PLAIN_TEXT
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

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:15450:22: ( '\\u00AB' ( RULE_PLAIN_TEXT )* '[' )
            // InternalPubProto.g:15450:24: '\\u00AB' ( RULE_PLAIN_TEXT )* '['
            {
            match('\u00AB'); 
            // InternalPubProto.g:15450:33: ( RULE_PLAIN_TEXT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='Z')||LA7_0=='\\'||(LA7_0>='^' && LA7_0<='\u00BA')||(LA7_0>='\u00BC' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPubProto.g:15450:33: RULE_PLAIN_TEXT
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
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_MIDDLE"
    public final void mRULE_RICH_TEXT_MIDDLE() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_MIDDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:15452:23: ( ']' ( RULE_PLAIN_TEXT )* '[' )
            // InternalPubProto.g:15452:25: ']' ( RULE_PLAIN_TEXT )* '['
            {
            match(']'); 
            // InternalPubProto.g:15452:29: ( RULE_PLAIN_TEXT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='Z')||LA8_0=='\\'||(LA8_0>='^' && LA8_0<='\u00BA')||(LA8_0>='\u00BC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPubProto.g:15452:29: RULE_PLAIN_TEXT
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
    // $ANTLR end "RULE_RICH_TEXT_MIDDLE"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:15454:20: ( ']' ( RULE_PLAIN_TEXT )* '\\u00BB' )
            // InternalPubProto.g:15454:22: ']' ( RULE_PLAIN_TEXT )* '\\u00BB'
            {
            match(']'); 
            // InternalPubProto.g:15454:26: ( RULE_PLAIN_TEXT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='Z')||LA9_0=='\\'||(LA9_0>='^' && LA9_0<='\u00BA')||(LA9_0>='\u00BC' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPubProto.g:15454:26: RULE_PLAIN_TEXT
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
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPubProto.g:15456:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPubProto.g:15456:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPubProto.g:15456:24: ( options {greedy=false; } : . )*
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
            	    // InternalPubProto.g:15456:52: .
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
            // InternalPubProto.g:15458:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPubProto.g:15458:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPubProto.g:15458:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPubProto.g:15458:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPubProto.g:15458:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPubProto.g:15458:41: ( '\\r' )? '\\n'
                    {
                    // InternalPubProto.g:15458:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPubProto.g:15458:41: '\\r'
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
            // InternalPubProto.g:15460:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPubProto.g:15460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPubProto.g:15460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalPubProto.g:
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
            // InternalPubProto.g:15462:16: ( . )
            // InternalPubProto.g:15462:18: .
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
        // InternalPubProto.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_RICH_TEXT_START | RULE_RICH_TEXT_MIDDLE | RULE_RICH_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=140;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalPubProto.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalPubProto.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalPubProto.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalPubProto.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalPubProto.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalPubProto.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalPubProto.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalPubProto.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalPubProto.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalPubProto.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalPubProto.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalPubProto.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalPubProto.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalPubProto.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalPubProto.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalPubProto.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalPubProto.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalPubProto.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalPubProto.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalPubProto.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalPubProto.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalPubProto.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalPubProto.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalPubProto.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalPubProto.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalPubProto.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalPubProto.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalPubProto.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalPubProto.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalPubProto.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalPubProto.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalPubProto.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalPubProto.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalPubProto.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalPubProto.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalPubProto.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalPubProto.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalPubProto.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalPubProto.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalPubProto.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalPubProto.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalPubProto.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalPubProto.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalPubProto.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalPubProto.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalPubProto.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalPubProto.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalPubProto.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalPubProto.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalPubProto.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalPubProto.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalPubProto.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalPubProto.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalPubProto.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalPubProto.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalPubProto.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalPubProto.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalPubProto.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalPubProto.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalPubProto.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalPubProto.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalPubProto.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalPubProto.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalPubProto.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalPubProto.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalPubProto.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalPubProto.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalPubProto.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalPubProto.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalPubProto.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalPubProto.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalPubProto.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalPubProto.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalPubProto.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalPubProto.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalPubProto.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalPubProto.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalPubProto.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalPubProto.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalPubProto.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalPubProto.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalPubProto.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalPubProto.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalPubProto.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalPubProto.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalPubProto.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // InternalPubProto.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // InternalPubProto.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // InternalPubProto.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // InternalPubProto.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // InternalPubProto.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // InternalPubProto.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // InternalPubProto.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // InternalPubProto.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // InternalPubProto.g:1:585: T__111
                {
                mT__111(); 

                }
                break;
            case 96 :
                // InternalPubProto.g:1:592: T__112
                {
                mT__112(); 

                }
                break;
            case 97 :
                // InternalPubProto.g:1:599: T__113
                {
                mT__113(); 

                }
                break;
            case 98 :
                // InternalPubProto.g:1:606: T__114
                {
                mT__114(); 

                }
                break;
            case 99 :
                // InternalPubProto.g:1:613: T__115
                {
                mT__115(); 

                }
                break;
            case 100 :
                // InternalPubProto.g:1:620: T__116
                {
                mT__116(); 

                }
                break;
            case 101 :
                // InternalPubProto.g:1:627: T__117
                {
                mT__117(); 

                }
                break;
            case 102 :
                // InternalPubProto.g:1:634: T__118
                {
                mT__118(); 

                }
                break;
            case 103 :
                // InternalPubProto.g:1:641: T__119
                {
                mT__119(); 

                }
                break;
            case 104 :
                // InternalPubProto.g:1:648: T__120
                {
                mT__120(); 

                }
                break;
            case 105 :
                // InternalPubProto.g:1:655: T__121
                {
                mT__121(); 

                }
                break;
            case 106 :
                // InternalPubProto.g:1:662: T__122
                {
                mT__122(); 

                }
                break;
            case 107 :
                // InternalPubProto.g:1:669: T__123
                {
                mT__123(); 

                }
                break;
            case 108 :
                // InternalPubProto.g:1:676: T__124
                {
                mT__124(); 

                }
                break;
            case 109 :
                // InternalPubProto.g:1:683: T__125
                {
                mT__125(); 

                }
                break;
            case 110 :
                // InternalPubProto.g:1:690: T__126
                {
                mT__126(); 

                }
                break;
            case 111 :
                // InternalPubProto.g:1:697: T__127
                {
                mT__127(); 

                }
                break;
            case 112 :
                // InternalPubProto.g:1:704: T__128
                {
                mT__128(); 

                }
                break;
            case 113 :
                // InternalPubProto.g:1:711: T__129
                {
                mT__129(); 

                }
                break;
            case 114 :
                // InternalPubProto.g:1:718: T__130
                {
                mT__130(); 

                }
                break;
            case 115 :
                // InternalPubProto.g:1:725: T__131
                {
                mT__131(); 

                }
                break;
            case 116 :
                // InternalPubProto.g:1:732: T__132
                {
                mT__132(); 

                }
                break;
            case 117 :
                // InternalPubProto.g:1:739: T__133
                {
                mT__133(); 

                }
                break;
            case 118 :
                // InternalPubProto.g:1:746: T__134
                {
                mT__134(); 

                }
                break;
            case 119 :
                // InternalPubProto.g:1:753: T__135
                {
                mT__135(); 

                }
                break;
            case 120 :
                // InternalPubProto.g:1:760: T__136
                {
                mT__136(); 

                }
                break;
            case 121 :
                // InternalPubProto.g:1:767: T__137
                {
                mT__137(); 

                }
                break;
            case 122 :
                // InternalPubProto.g:1:774: T__138
                {
                mT__138(); 

                }
                break;
            case 123 :
                // InternalPubProto.g:1:781: T__139
                {
                mT__139(); 

                }
                break;
            case 124 :
                // InternalPubProto.g:1:788: T__140
                {
                mT__140(); 

                }
                break;
            case 125 :
                // InternalPubProto.g:1:795: T__141
                {
                mT__141(); 

                }
                break;
            case 126 :
                // InternalPubProto.g:1:802: T__142
                {
                mT__142(); 

                }
                break;
            case 127 :
                // InternalPubProto.g:1:809: T__143
                {
                mT__143(); 

                }
                break;
            case 128 :
                // InternalPubProto.g:1:816: T__144
                {
                mT__144(); 

                }
                break;
            case 129 :
                // InternalPubProto.g:1:823: T__145
                {
                mT__145(); 

                }
                break;
            case 130 :
                // InternalPubProto.g:1:830: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 131 :
                // InternalPubProto.g:1:838: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 132 :
                // InternalPubProto.g:1:850: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 133 :
                // InternalPubProto.g:1:863: RULE_PLAIN_TEXT_ONLY
                {
                mRULE_PLAIN_TEXT_ONLY(); 

                }
                break;
            case 134 :
                // InternalPubProto.g:1:884: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 135 :
                // InternalPubProto.g:1:905: RULE_RICH_TEXT_MIDDLE
                {
                mRULE_RICH_TEXT_MIDDLE(); 

                }
                break;
            case 136 :
                // InternalPubProto.g:1:927: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 137 :
                // InternalPubProto.g:1:946: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 138 :
                // InternalPubProto.g:1:962: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 139 :
                // InternalPubProto.g:1:978: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 140 :
                // InternalPubProto.g:1:986: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\110\1\uffff\5\114\1\136\3\114\1\143\1\146\1\uffff\1\151\25\114\1\u0094\1\u0096\1\u0099\1\uffff\1\u009c\1\uffff\1\u00a0\1\u00a3\2\uffff\4\114\1\uffff\3\114\5\uffff\1\u00ba\1\uffff\2\106\1\uffff\1\106\2\uffff\1\106\5\uffff\2\114\1\uffff\2\114\1\u00c7\1\114\1\u00ca\1\u00cb\1\114\1\u00cd\1\u00ce\3\114\1\u00d3\3\114\2\uffff\4\114\1\uffff\2\114\4\uffff\17\114\1\u00f1\26\114\1\u0108\2\114\23\uffff\10\114\1\uffff\3\114\21\uffff\2\114\1\u0118\1\114\1\uffff\1\114\1\u011b\2\uffff\1\114\2\uffff\1\u011d\3\114\1\uffff\2\114\1\u0123\1\u0124\5\114\1\u012a\4\114\1\u012f\7\114\1\u0137\4\114\1\u013c\1\114\1\uffff\13\114\1\u014c\7\114\1\u0155\2\114\1\uffff\1\u0159\1\u015a\15\114\1\uffff\2\114\1\uffff\1\114\1\uffff\5\114\2\uffff\5\114\1\uffff\1\u0175\2\114\1\u0178\1\uffff\6\114\1\u017f\1\uffff\3\114\1\u0183\1\uffff\4\114\1\u0188\1\u0189\1\u018a\1\114\1\u018c\1\114\1\u018e\3\114\1\u0192\1\uffff\1\u0193\2\114\1\u0196\4\114\1\uffff\3\114\2\uffff\5\114\1\u01a3\1\u01a4\1\u01a5\3\114\1\u01a9\2\114\1\u01ac\6\114\1\u01b3\4\114\1\uffff\1\u01b8\1\114\1\uffff\1\114\1\u01bb\4\114\1\uffff\2\114\1\u01c3\1\uffff\3\114\1\u01c7\3\uffff\1\114\1\uffff\1\114\1\uffff\3\114\2\uffff\2\114\1\uffff\1\u01d0\13\114\3\uffff\3\114\1\uffff\1\u01e0\1\114\1\uffff\1\u01e2\3\114\1\u01e6\1\114\1\uffff\3\114\1\u01eb\1\uffff\2\114\1\uffff\7\114\1\uffff\1\u01f5\1\114\1\u01f7\1\uffff\3\114\1\u01fb\4\114\1\uffff\2\114\1\u0202\4\114\1\u0207\3\114\1\uffff\3\114\1\uffff\1\114\1\uffff\3\114\1\uffff\4\114\1\uffff\1\u0217\1\114\1\u021a\3\114\2\uffff\1\114\1\uffff\1\114\1\uffff\1\114\1\u0221\1\114\1\uffff\4\114\1\u0227\1\u0228\1\uffff\1\u0229\1\114\1\u022b\1\114\1\uffff\10\114\1\u0235\1\114\1\u0237\3\114\1\u023b\1\uffff\2\114\1\uffff\6\114\1\uffff\5\114\3\uffff\1\114\1\uffff\7\114\1\u0251\1\114\1\uffff\1\114\1\uffff\1\u0254\1\u0255\1\u0256\1\uffff\4\114\1\uffff\1\114\1\uffff\3\114\1\u025f\7\114\1\uffff\2\114\1\uffff\1\u0269\1\114\3\uffff\3\114\1\u026e\1\uffff\3\114\1\uffff\3\114\1\uffff\5\114\1\uffff\3\114\1\u027d\1\uffff\1\u027e\3\114\1\u0282\2\114\1\uffff\5\114\1\u028a\2\uffff\1\u028b\1\u028c\1\114\1\uffff\3\114\1\u0291\1\114\1\u0293\1\u0294\3\uffff\1\114\1\u0296\1\uffff\1\114\1\uffff\1\u0298\2\uffff\1\114\3\uffff\1\u029a\1\uffff";
    static final String DFA15_eofS =
        "\u029b\uffff";
    static final String DFA15_minS =
        "\1\0\1\75\1\uffff\1\141\1\104\1\146\1\116\1\154\1\52\1\101\1\116\1\156\2\60\1\uffff\1\76\1\141\1\145\1\141\1\145\1\141\1\150\1\145\1\160\1\145\1\162\1\154\1\151\3\117\2\105\1\117\1\122\1\117\1\157\1\76\2\75\1\uffff\1\75\1\uffff\2\52\2\uffff\1\145\1\164\1\141\1\145\1\uffff\1\141\1\151\1\154\5\uffff\1\0\1\uffff\1\142\1\101\1\uffff\1\0\2\uffff\1\0\5\uffff\2\154\1\uffff\1\101\1\105\1\60\1\144\2\60\1\160\2\60\1\104\1\142\1\160\1\60\1\141\1\144\1\154\2\uffff\1\114\1\104\1\144\1\151\1\uffff\1\144\1\163\4\uffff\1\145\1\162\1\142\1\160\1\141\1\156\1\141\1\147\1\155\1\156\1\164\1\155\1\151\1\164\1\144\1\60\1\164\1\154\1\145\1\165\1\156\1\142\1\111\1\117\1\144\1\142\1\115\1\124\1\130\1\115\1\142\1\125\1\101\1\122\1\143\1\142\1\115\1\141\1\60\1\122\1\162\23\uffff\1\166\1\164\1\155\2\164\1\163\1\145\1\165\1\uffff\1\170\1\163\1\157\5\uffff\1\0\7\uffff\1\0\3\uffff\1\163\1\164\1\60\1\116\1\uffff\1\145\1\60\2\uffff\1\157\2\uffff\1\60\1\164\1\162\1\145\1\uffff\1\142\1\150\2\60\1\123\1\105\1\145\1\154\1\151\1\60\1\145\1\156\1\146\1\164\1\60\1\151\1\163\1\164\1\154\1\155\1\142\1\145\1\60\1\165\1\142\1\164\1\150\1\60\1\156\1\uffff\1\151\1\154\2\145\1\153\1\154\1\104\1\114\1\171\1\154\1\102\1\60\1\124\1\105\1\154\1\105\1\124\1\126\1\164\1\60\1\120\1\156\1\uffff\2\60\1\151\1\141\1\154\1\145\1\154\1\164\1\156\1\145\1\114\1\164\1\163\2\145\1\uffff\1\124\1\170\1\uffff\1\162\1\uffff\1\162\1\145\1\156\1\151\1\145\2\uffff\1\105\1\106\1\146\1\157\1\164\1\uffff\1\60\1\164\1\141\1\60\1\uffff\1\164\1\163\1\145\1\154\1\145\1\157\1\60\1\uffff\1\162\2\145\1\60\1\uffff\1\147\2\157\1\156\3\60\1\151\1\60\1\105\1\60\1\151\1\105\1\106\1\60\1\uffff\1\60\1\120\1\145\1\60\1\105\1\111\1\151\1\165\1\uffff\1\114\1\147\1\164\2\uffff\1\163\1\151\1\120\1\170\1\145\3\60\1\145\1\117\1\163\1\60\1\162\1\111\1\60\1\164\1\141\1\166\1\144\1\143\1\164\1\60\1\111\1\151\1\147\1\171\1\uffff\1\60\1\143\1\uffff\1\141\1\60\1\170\1\114\1\156\1\154\1\uffff\1\145\1\162\1\60\1\uffff\1\145\1\156\1\167\1\60\3\uffff\1\143\1\uffff\1\101\1\uffff\1\157\1\122\1\111\2\uffff\2\117\1\uffff\1\60\1\103\1\157\1\142\1\105\2\145\1\151\1\154\1\162\1\103\1\72\3\uffff\1\166\1\146\1\141\1\uffff\1\60\1\106\1\uffff\1\60\1\143\2\151\1\60\1\171\1\uffff\1\116\1\156\1\165\1\60\1\uffff\1\145\1\154\1\uffff\1\164\1\145\1\157\1\164\2\72\1\151\1\uffff\1\60\1\141\1\60\1\uffff\1\141\1\116\1\147\1\60\1\103\1\111\1\146\1\105\1\uffff\1\105\1\156\1\60\1\130\1\110\1\162\1\157\1\60\1\145\1\154\1\162\1\uffff\1\145\1\106\1\162\1\uffff\1\111\1\uffff\1\164\1\141\1\170\1\uffff\1\160\1\105\2\145\1\uffff\1\60\1\114\1\60\1\164\1\155\1\163\2\uffff\1\156\1\uffff\1\154\1\uffff\1\164\1\60\1\162\1\uffff\1\101\1\116\1\103\1\126\2\60\1\uffff\1\60\1\151\1\60\1\156\1\uffff\2\141\1\145\1\154\1\141\1\151\1\171\1\105\1\60\1\164\1\60\1\145\1\104\1\144\1\60\1\uffff\1\145\1\157\1\uffff\1\164\1\141\1\72\1\147\1\72\1\151\1\uffff\1\141\2\124\1\157\1\105\3\uffff\1\163\1\uffff\1\163\1\155\1\163\1\141\1\72\1\142\1\147\1\60\1\122\1\uffff\1\151\1\uffff\3\60\1\uffff\1\164\1\155\1\145\1\156\1\uffff\1\72\1\uffff\1\157\1\160\1\111\1\60\1\156\1\116\1\164\1\72\1\142\1\163\1\155\1\uffff\1\154\1\165\1\uffff\1\60\1\157\3\uffff\1\164\1\141\1\162\1\60\1\uffff\1\156\1\150\1\117\1\uffff\1\164\1\124\1\157\1\uffff\1\154\1\72\1\142\1\145\1\162\1\uffff\1\156\1\145\1\156\1\60\1\uffff\1\60\1\171\1\116\1\145\1\60\1\162\1\145\1\uffff\1\154\1\163\1\145\1\163\1\162\1\60\2\uffff\2\60\1\156\1\uffff\1\171\1\72\1\145\1\60\1\163\2\60\3\uffff\1\164\1\60\1\uffff\1\72\1\uffff\1\60\2\uffff\1\163\3\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\75\1\uffff\1\151\1\156\1\163\1\160\1\163\1\52\1\101\1\116\1\156\2\u00ff\1\uffff\1\76\1\162\1\145\1\157\1\171\1\165\1\151\1\145\1\162\1\145\1\162\1\154\1\165\1\117\1\157\1\125\1\141\1\165\1\150\1\122\1\117\1\157\1\76\1\75\1\76\1\uffff\1\75\1\uffff\1\56\1\57\2\uffff\1\151\1\164\1\141\1\162\1\uffff\1\141\1\151\1\154\5\uffff\1\uffff\1\uffff\1\142\1\u00ff\1\uffff\1\uffff\2\uffff\1\uffff\5\uffff\2\154\1\uffff\1\101\1\105\1\u00ff\1\144\2\u00ff\1\160\2\u00ff\1\104\1\163\1\160\1\u00ff\1\143\1\144\1\154\2\uffff\1\114\1\104\1\144\1\151\1\uffff\1\164\1\163\4\uffff\1\151\1\162\1\142\1\160\1\141\1\156\1\141\1\147\1\155\2\164\1\155\1\151\1\164\1\144\1\u00ff\1\164\1\154\1\145\1\165\1\156\1\142\1\111\1\117\1\144\1\142\1\115\1\124\1\130\1\115\1\142\1\125\1\101\1\122\1\143\1\142\1\115\1\141\1\u00ff\1\122\1\162\23\uffff\1\166\1\164\1\155\2\164\1\163\1\145\1\165\1\uffff\1\170\1\163\1\157\5\uffff\1\uffff\7\uffff\1\uffff\3\uffff\1\163\1\164\1\u00ff\1\116\1\uffff\1\145\1\u00ff\2\uffff\1\157\2\uffff\1\u00ff\1\164\1\162\1\145\1\uffff\1\142\1\150\2\u00ff\1\123\1\105\1\145\1\154\1\151\1\u00ff\1\145\1\156\1\146\1\164\1\u00ff\1\151\1\163\1\164\1\154\1\155\1\142\1\145\1\u00ff\1\165\1\142\1\164\1\150\1\u00ff\1\156\1\uffff\1\151\1\154\1\171\1\145\1\153\1\154\1\104\1\114\1\171\1\154\1\102\1\u00ff\1\124\1\105\1\154\1\105\1\124\1\126\1\164\1\u00ff\1\120\1\160\1\uffff\2\u00ff\1\151\1\141\1\154\1\145\1\154\1\164\1\156\1\145\1\114\1\164\1\163\2\145\1\uffff\1\124\1\170\1\uffff\1\162\1\uffff\1\162\1\145\1\156\1\151\1\145\2\uffff\1\105\1\106\1\146\1\157\1\164\1\uffff\1\u00ff\1\164\1\141\1\u00ff\1\uffff\1\164\1\163\1\145\1\154\1\145\1\157\1\u00ff\1\uffff\1\162\2\145\1\u00ff\1\uffff\1\147\2\157\1\156\3\u00ff\1\151\1\u00ff\1\105\1\u00ff\1\151\1\105\1\106\1\u00ff\1\uffff\1\u00ff\1\120\1\145\1\u00ff\1\105\1\111\1\151\1\165\1\uffff\1\114\1\147\1\164\2\uffff\1\163\1\151\1\120\1\170\1\145\3\u00ff\1\145\1\117\1\163\1\u00ff\1\162\1\111\1\u00ff\1\164\1\141\1\166\1\144\1\143\1\164\1\u00ff\1\111\1\151\1\147\1\171\1\uffff\1\u00ff\1\143\1\uffff\1\141\1\u00ff\1\170\1\122\1\156\1\154\1\uffff\1\145\1\162\1\u00ff\1\uffff\1\145\1\156\1\167\1\u00ff\3\uffff\1\143\1\uffff\1\101\1\uffff\1\157\1\122\1\111\2\uffff\2\117\1\uffff\1\u00ff\1\103\1\157\1\142\1\105\2\145\1\151\1\154\1\162\1\120\1\72\3\uffff\1\166\1\146\1\141\1\uffff\1\u00ff\1\106\1\uffff\1\u00ff\1\143\2\151\1\u00ff\1\171\1\uffff\1\116\1\156\1\165\1\u00ff\1\uffff\1\145\1\154\1\uffff\1\164\1\145\1\157\1\164\2\72\1\151\1\uffff\1\u00ff\1\141\1\u00ff\1\uffff\1\141\1\116\1\147\1\u00ff\1\103\1\111\1\146\1\105\1\uffff\1\105\1\156\1\u00ff\1\130\1\110\1\162\1\157\1\u00ff\1\145\1\154\1\162\1\uffff\1\145\1\124\1\162\1\uffff\1\111\1\uffff\1\164\1\141\1\170\1\uffff\1\160\1\105\2\145\1\uffff\1\u00ff\1\122\1\u00ff\1\164\1\155\1\163\2\uffff\1\156\1\uffff\1\154\1\uffff\1\164\1\u00ff\1\162\1\uffff\1\101\1\116\1\103\1\126\2\u00ff\1\uffff\1\u00ff\1\151\1\u00ff\1\156\1\uffff\2\141\1\145\1\154\1\141\1\151\1\171\1\105\1\u00ff\1\164\1\u00ff\1\145\1\104\1\144\1\u00ff\1\uffff\1\145\1\157\1\uffff\1\164\1\141\1\72\1\147\1\72\1\151\1\uffff\1\141\2\124\1\157\1\105\3\uffff\1\163\1\uffff\1\163\1\155\1\163\1\141\1\72\1\142\1\147\1\u00ff\1\122\1\uffff\1\151\1\uffff\3\u00ff\1\uffff\1\164\1\155\1\145\1\156\1\uffff\1\72\1\uffff\1\157\1\160\1\111\1\u00ff\1\156\1\116\1\164\1\72\1\142\1\163\1\155\1\uffff\1\154\1\165\1\uffff\1\u00ff\1\157\3\uffff\1\164\1\141\1\162\1\u00ff\1\uffff\1\156\1\150\1\117\1\uffff\1\164\1\124\1\157\1\uffff\1\154\1\72\1\142\1\145\1\162\1\uffff\1\156\1\145\1\156\1\u00ff\1\uffff\1\u00ff\1\171\1\116\1\145\1\u00ff\1\162\1\145\1\uffff\1\154\1\163\1\145\1\163\1\162\1\u00ff\2\uffff\2\u00ff\1\156\1\uffff\1\171\1\72\1\145\1\u00ff\1\163\2\u00ff\3\uffff\1\164\1\u00ff\1\uffff\1\72\1\uffff\1\u00ff\2\uffff\1\163\3\uffff\1\u00ff\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\13\uffff\1\16\31\uffff\1\66\1\uffff\1\70\2\uffff\1\101\1\105\4\uffff\1\122\3\uffff\1\152\1\154\1\155\1\163\1\166\1\uffff\1\170\2\uffff\1\u0082\1\uffff\2\u0084\1\uffff\1\u008b\1\u008c\1\1\1\153\1\2\2\uffff\1\u0082\20\uffff\1\100\1\10\4\uffff\1\14\2\uffff\1\15\1\16\1\75\1\17\51\uffff\1\76\1\61\1\62\1\102\1\63\1\65\1\64\1\66\1\67\1\71\1\70\1\74\1\175\1\162\1\u0089\1\u008a\1\77\1\101\1\105\10\uffff\1\122\3\uffff\1\152\1\154\1\155\1\163\1\166\1\uffff\1\u0088\1\u0087\1\167\1\170\1\177\1\u0083\1\u0084\1\uffff\1\u0086\1\u0085\1\u008b\4\uffff\1\72\2\uffff\1\157\1\73\1\uffff\1\171\1\6\4\uffff\1\7\35\uffff\1\54\26\uffff\1\53\17\uffff\1\4\2\uffff\1\5\1\uffff\1\57\5\uffff\1\60\1\u0080\5\uffff\1\173\4\uffff\1\21\7\uffff\1\104\4\uffff\1\31\17\uffff\1\103\10\uffff\1\144\3\uffff\1\55\1\56\32\uffff\1\174\2\uffff\1\140\6\uffff\1\27\3\uffff\1\161\4\uffff\1\37\1\35\1\36\1\uffff\1\40\1\uffff\1\125\3\uffff\1\146\1\43\2\uffff\1\u0081\14\uffff\1\150\1\172\1\176\3\uffff\1\3\2\uffff\1\136\6\uffff\1\11\4\uffff\1\20\2\uffff\1\107\7\uffff\1\30\3\uffff\1\34\10\uffff\1\46\13\uffff\1\117\3\uffff\1\160\1\uffff\1\147\3\uffff\1\22\4\uffff\1\164\6\uffff\1\113\1\110\1\uffff\1\32\1\uffff\1\33\3\uffff\1\42\6\uffff\1\145\4\uffff\1\165\17\uffff\1\123\2\uffff\1\151\6\uffff\1\41\5\uffff\1\52\1\143\1\50\1\uffff\1\142\11\uffff\1\121\1\uffff\1\141\3\uffff\1\124\4\uffff\1\111\1\uffff\1\120\13\uffff\1\130\2\uffff\1\135\2\uffff\1\156\1\12\1\13\4\uffff\1\137\3\uffff\1\45\3\uffff\1\112\5\uffff\1\44\4\uffff\1\26\7\uffff\1\115\6\uffff\1\24\1\106\3\uffff\1\47\7\uffff\1\25\1\134\1\51\2\uffff\1\114\1\uffff\1\132\1\uffff\1\131\1\23\1\uffff\1\126\1\116\1\133\1\uffff\1\127";
    static final String DFA15_specialS =
        "\1\3\73\uffff\1\5\4\uffff\1\1\2\uffff\1\0\162\uffff\1\4\7\uffff\1\2\u01db\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\106\2\105\2\106\1\105\22\106\1\105\1\46\1\101\1\75\1\106\1\55\2\106\1\70\1\71\1\10\1\16\1\67\1\17\1\53\1\54\12\102\1\1\1\106\1\47\1\45\1\51\1\56\1\76\1\6\1\35\1\41\1\100\1\14\1\11\1\66\1\100\1\4\2\100\1\65\1\100\1\36\1\42\1\20\2\100\1\40\1\37\1\12\1\34\1\21\1\43\2\100\1\73\1\106\1\74\1\77\1\100\1\106\1\7\1\32\1\22\1\57\1\15\1\3\1\31\1\60\1\5\2\100\1\61\1\64\1\24\1\27\1\33\1\100\1\26\1\23\1\62\1\13\1\100\1\25\1\44\1\30\1\100\1\2\1\72\1\63\55\106\1\104\24\106\27\100\1\106\37\100\1\106\10\100\u211e\106\1\103\105\106\1\50\1\52\udd9a\106",
            "\1\107",
            "",
            "\1\112\7\uffff\1\113",
            "\1\116\11\uffff\1\117\4\uffff\1\115\32\uffff\1\120",
            "\1\124\6\uffff\1\123\1\122\4\uffff\1\121",
            "\1\126\4\uffff\1\125\16\uffff\1\127\15\uffff\1\130",
            "\1\134\1\uffff\1\133\3\uffff\1\132\1\131",
            "\1\135",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\17\114\1\142\12\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\13\114\1\145\1\114\1\144\14\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\150",
            "\1\153\20\uffff\1\152",
            "\1\154",
            "\1\155\12\uffff\1\156\2\uffff\1\157",
            "\1\161\7\uffff\1\160\13\uffff\1\162",
            "\1\164\15\uffff\1\163\5\uffff\1\165",
            "\1\166\1\167",
            "\1\170",
            "\1\172\1\uffff\1\171",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\13\uffff\1\177",
            "\1\u0080",
            "\1\u0081\31\uffff\1\u0083\5\uffff\1\u0082",
            "\1\u0085\5\uffff\1\u0084",
            "\1\u0086\3\uffff\1\u0087\10\uffff\1\u0089\16\uffff\1\u0088",
            "\1\u008b\16\uffff\1\u008a\20\uffff\1\u008c\17\uffff\1\u008d",
            "\1\u008e\30\uffff\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095",
            "\1\u0098\1\u0097",
            "",
            "\1\u009b",
            "",
            "\1\u009f\3\uffff\1\u009e",
            "\1\u00a1\4\uffff\1\u00a2",
            "",
            "",
            "\1\u00a7\3\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\2\uffff\1\u00ac\1\u00aa\10\uffff\1\u00ad",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "",
            "\133\u00b7\1\u00b9\1\u00b7\1\uffff\135\u00b7\1\u00b8\uff44\u00b7",
            "",
            "\1\u00bc",
            "\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\0\u00bd",
            "",
            "",
            "\133\u00bf\1\u00c0\1\u00bf\1\uffff\135\u00bf\1\u00c1\uff44\u00bf",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u00c8",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\1\u00c9\31\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u00cc",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u00cf",
            "\1\u00d1\20\uffff\1\u00d0",
            "\1\u00d2",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u00d4\1\uffff\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dd\17\uffff\1\u00dc",
            "\1\u00de",
            "",
            "",
            "",
            "",
            "\1\u00e0\3\uffff\1\u00df",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\5\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\1\u00f0\31\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0109",
            "\1\u010a",
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
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "",
            "",
            "",
            "",
            "\133\u00b7\1\u00b9\1\u00b7\1\uffff\135\u00b7\1\u00b8\uff44\u00b7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\133\u00bf\1\u00c0\1\u00bf\1\uffff\135\u00bf\1\u00c1\uff44\u00bf",
            "",
            "",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0119",
            "",
            "\1\u011a",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "",
            "\1\u011c",
            "",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140\23\uffff\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\114\7\uffff\4\114\1\u014b\3\114\1\u014a\21\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\22\114\1\u0154\7\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0156",
            "\1\u0157\1\uffff\1\u0158",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0176",
            "\1\u0177",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u018b",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u018d",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0194",
            "\1\u0195",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01aa",
            "\1\u01ab",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01bc",
            "\1\u01bd\5\uffff\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "",
            "",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\u01cf\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da\14\uffff\1\u01db",
            "\1\u01dc",
            "",
            "",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01e1",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01f6",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "\1\u0200",
            "\1\u0201",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020d\15\uffff\1\u020c",
            "\1\u020e",
            "",
            "\1\u020f",
            "",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0218\5\uffff\1\u0219",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "",
            "",
            "\1\u021e",
            "",
            "\1\u021f",
            "",
            "\1\u0220",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0222",
            "",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u022a",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u022c",
            "",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0236",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u023c",
            "\1\u023d",
            "",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "",
            "",
            "",
            "\1\u0249",
            "",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0252",
            "",
            "\1\u0253",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "",
            "\1\u025b",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "",
            "\1\u0267",
            "\1\u0268",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u026a",
            "",
            "",
            "",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0283",
            "\1\u0284",
            "",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u028d",
            "",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\1\u0292",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "",
            "",
            "\1\u0295",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "\1\u0297",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
            "",
            "",
            "\1\u0299",
            "",
            "",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114\105\uffff\27\114\1\uffff\37\114\1\uffff\10\114",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_RICH_TEXT_START | RULE_RICH_TEXT_MIDDLE | RULE_RICH_TEXT_END | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_68 = input.LA(1);

                        s = -1;
                        if ( ((LA15_68>='\u0000' && LA15_68<='Z')||LA15_68=='\\'||(LA15_68>='^' && LA15_68<='\u00BA')||(LA15_68>='\u00BC' && LA15_68<='\uFFFF')) ) {s = 191;}

                        else if ( (LA15_68=='[') ) {s = 192;}

                        else if ( (LA15_68=='\u00BB') ) {s = 193;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_65 = input.LA(1);

                        s = -1;
                        if ( ((LA15_65>='\u0000' && LA15_65<='\uFFFF')) ) {s = 189;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_191 = input.LA(1);

                        s = -1;
                        if ( (LA15_191=='[') ) {s = 192;}

                        else if ( ((LA15_191>='\u0000' && LA15_191<='Z')||LA15_191=='\\'||(LA15_191>='^' && LA15_191<='\u00BA')||(LA15_191>='\u00BC' && LA15_191<='\uFFFF')) ) {s = 191;}

                        else if ( (LA15_191=='\u00BB') ) {s = 193;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==':') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='f') ) {s = 3;}

                        else if ( (LA15_0=='I') ) {s = 4;}

                        else if ( (LA15_0=='i') ) {s = 5;}

                        else if ( (LA15_0=='A') ) {s = 6;}

                        else if ( (LA15_0=='a') ) {s = 7;}

                        else if ( (LA15_0=='*') ) {s = 8;}

                        else if ( (LA15_0=='F') ) {s = 9;}

                        else if ( (LA15_0=='U') ) {s = 10;}

                        else if ( (LA15_0=='u') ) {s = 11;}

                        else if ( (LA15_0=='E') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0=='+') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='P') ) {s = 16;}

                        else if ( (LA15_0=='W') ) {s = 17;}

                        else if ( (LA15_0=='c') ) {s = 18;}

                        else if ( (LA15_0=='s') ) {s = 19;}

                        else if ( (LA15_0=='n') ) {s = 20;}

                        else if ( (LA15_0=='w') ) {s = 21;}

                        else if ( (LA15_0=='r') ) {s = 22;}

                        else if ( (LA15_0=='o') ) {s = 23;}

                        else if ( (LA15_0=='y') ) {s = 24;}

                        else if ( (LA15_0=='g') ) {s = 25;}

                        else if ( (LA15_0=='b') ) {s = 26;}

                        else if ( (LA15_0=='p') ) {s = 27;}

                        else if ( (LA15_0=='V') ) {s = 28;}

                        else if ( (LA15_0=='B') ) {s = 29;}

                        else if ( (LA15_0=='N') ) {s = 30;}

                        else if ( (LA15_0=='T') ) {s = 31;}

                        else if ( (LA15_0=='S') ) {s = 32;}

                        else if ( (LA15_0=='C') ) {s = 33;}

                        else if ( (LA15_0=='O') ) {s = 34;}

                        else if ( (LA15_0=='X') ) {s = 35;}

                        else if ( (LA15_0=='x') ) {s = 36;}

                        else if ( (LA15_0=='=') ) {s = 37;}

                        else if ( (LA15_0=='!') ) {s = 38;}

                        else if ( (LA15_0=='<') ) {s = 39;}

                        else if ( (LA15_0=='\u2264') ) {s = 40;}

                        else if ( (LA15_0=='>') ) {s = 41;}

                        else if ( (LA15_0=='\u2265') ) {s = 42;}

                        else if ( (LA15_0=='.') ) {s = 43;}

                        else if ( (LA15_0=='/') ) {s = 44;}

                        else if ( (LA15_0=='%') ) {s = 45;}

                        else if ( (LA15_0=='?') ) {s = 46;}

                        else if ( (LA15_0=='d') ) {s = 47;}

                        else if ( (LA15_0=='h') ) {s = 48;}

                        else if ( (LA15_0=='l') ) {s = 49;}

                        else if ( (LA15_0=='t') ) {s = 50;}

                        else if ( (LA15_0=='}') ) {s = 51;}

                        else if ( (LA15_0=='m') ) {s = 52;}

                        else if ( (LA15_0=='L') ) {s = 53;}

                        else if ( (LA15_0=='G') ) {s = 54;}

                        else if ( (LA15_0==',') ) {s = 55;}

                        else if ( (LA15_0=='(') ) {s = 56;}

                        else if ( (LA15_0==')') ) {s = 57;}

                        else if ( (LA15_0=='|') ) {s = 58;}

                        else if ( (LA15_0=='[') ) {s = 59;}

                        else if ( (LA15_0==']') ) {s = 60;}

                        else if ( (LA15_0=='#') ) {s = 61;}

                        else if ( (LA15_0=='@') ) {s = 62;}

                        else if ( (LA15_0=='^') ) {s = 63;}

                        else if ( (LA15_0=='D'||LA15_0=='H'||(LA15_0>='J' && LA15_0<='K')||LA15_0=='M'||(LA15_0>='Q' && LA15_0<='R')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='j' && LA15_0<='k')||LA15_0=='q'||LA15_0=='v'||LA15_0=='z'||(LA15_0>='\u00C0' && LA15_0<='\u00D6')||(LA15_0>='\u00D8' && LA15_0<='\u00F6')||(LA15_0>='\u00F8' && LA15_0<='\u00FF')) ) {s = 64;}

                        else if ( (LA15_0=='\"') ) {s = 65;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 66;}

                        else if ( (LA15_0=='\u221E') ) {s = 67;}

                        else if ( (LA15_0=='\u00AB') ) {s = 68;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 69;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||(LA15_0>='&' && LA15_0<='\'')||LA15_0==';'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\u00BF')||LA15_0=='\u00D7'||LA15_0=='\u00F7'||(LA15_0>='\u0100' && LA15_0<='\u221D')||(LA15_0>='\u221F' && LA15_0<='\u2263')||(LA15_0>='\u2266' && LA15_0<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_183 = input.LA(1);

                        s = -1;
                        if ( (LA15_183=='\u00BB') ) {s = 184;}

                        else if ( ((LA15_183>='\u0000' && LA15_183<='Z')||LA15_183=='\\'||(LA15_183>='^' && LA15_183<='\u00BA')||(LA15_183>='\u00BC' && LA15_183<='\uFFFF')) ) {s = 183;}

                        else if ( (LA15_183=='[') ) {s = 185;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_60 = input.LA(1);

                        s = -1;
                        if ( ((LA15_60>='\u0000' && LA15_60<='Z')||LA15_60=='\\'||(LA15_60>='^' && LA15_60<='\u00BA')||(LA15_60>='\u00BC' && LA15_60<='\uFFFF')) ) {s = 183;}

                        else if ( (LA15_60=='\u00BB') ) {s = 184;}

                        else if ( (LA15_60=='[') ) {s = 185;}

                        else s = 186;

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