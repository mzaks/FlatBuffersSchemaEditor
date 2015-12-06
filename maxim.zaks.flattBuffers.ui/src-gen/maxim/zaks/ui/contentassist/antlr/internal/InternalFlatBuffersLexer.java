package maxim.zaks.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlatBuffersLexer extends Lexer {
    public static final int RULE_HEX=10;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=9;
    public static final int RULE_DEPRECTED_ATTRIBUTE=8;
    public static final int RULE_DECIMAL=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_KEY_ATTRIBUTE=7;
    public static final int T__21=21;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_ID_ATTRIBUTE=5;
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
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_HASH_ATTRIBUTE=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_REQUIRED_ATTRIBUTE=6;
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

    public InternalFlatBuffersLexer() {;} 
    public InternalFlatBuffersLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFlatBuffersLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:11:7: ( 'bool' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:11:9: 'bool'
            {
            match("bool"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:12:7: ( 'float' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:12:9: 'float'
            {
            match("float"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:13:7: ( 'double' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:13:9: 'double'
            {
            match("double"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:14:7: ( 'string' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:14:9: 'string'
            {
            match("string"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:15:7: ( 'byte' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:15:9: 'byte'
            {
            match("byte"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:16:7: ( 'ubyte' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:16:9: 'ubyte'
            {
            match("ubyte"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:17:7: ( 'short' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:17:9: 'short'
            {
            match("short"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:18:7: ( 'ushort' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:18:9: 'ushort'
            {
            match("ushort"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:19:7: ( 'int' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:19:9: 'int'
            {
            match("int"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:20:7: ( 'uint' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:20:9: 'uint'
            {
            match("uint"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:21:7: ( 'long' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:21:9: 'long'
            {
            match("long"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:22:7: ( 'ulong' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:22:9: 'ulong'
            {
            match("ulong"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:23:7: ( 'root_type' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:23:9: 'root_type'
            {
            match("root_type"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:24:7: ( ';' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:24:9: ';'
            {
            match(';'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:25:7: ( 'attribute' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:25:9: 'attribute'
            {
            match("attribute"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:26:7: ( 'file_identifier' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:26:9: 'file_identifier'
            {
            match("file_identifier"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:27:7: ( 'file_extension' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:27:9: 'file_extension'
            {
            match("file_extension"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:28:7: ( 'namespace' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:28:9: 'namespace'
            {
            match("namespace"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:29:7: ( 'include' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:29:9: 'include'
            {
            match("include"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:30:7: ( 'struct' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:30:9: 'struct'
            {
            match("struct"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:31:7: ( '{' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:31:9: '{'
            {
            match('{'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:32:7: ( '}' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:32:9: '}'
            {
            match('}'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:33:7: ( ':' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:33:9: ':'
            {
            match(':'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:34:7: ( 'table' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:34:9: 'table'
            {
            match("table"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:35:7: ( '=' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:35:9: '='
            {
            match('='); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:36:7: ( '(' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:36:9: '('
            {
            match('('); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:37:7: ( ')' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:37:9: ')'
            {
            match(')'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:38:7: ( ',' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:38:9: ','
            {
            match(','); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:39:7: ( '.' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:39:9: '.'
            {
            match('.'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:40:7: ( '[' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:40:9: '['
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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:41:7: ( ']' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:41:9: ']'
            {
            match(']'); 

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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:42:7: ( 'enum' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:42:9: 'enum'
            {
            match("enum"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:43:7: ( 'union' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:43:9: 'union'
            {
            match("union"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:44:7: ( 'false' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:44:9: 'false'
            {
            match("false"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:45:7: ( 'true' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:45:9: 'true'
            {
            match("true"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:46:7: ( 'original_order' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:46:9: 'original_order'
            {
            match("original_order"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:47:7: ( 'force_align' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:47:9: 'force_align'
            {
            match("force_align"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:48:7: ( 'bit_flags' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:48:9: 'bit_flags'
            {
            match("bit_flags"); 


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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:49:7: ( 'nested_flatbuffer' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:49:9: 'nested_flatbuffer'
            {
            match("nested_flatbuffer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_ID_ATTRIBUTE"
    public final void mRULE_ID_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_ID_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5806:19: ( 'id' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5806:21: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_ATTRIBUTE"

    // $ANTLR start "RULE_DEPRECTED_ATTRIBUTE"
    public final void mRULE_DEPRECTED_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_DEPRECTED_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5808:26: ( 'deprecated' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5808:28: 'deprecated'
            {
            match("deprecated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEPRECTED_ATTRIBUTE"

    // $ANTLR start "RULE_REQUIRED_ATTRIBUTE"
    public final void mRULE_REQUIRED_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_REQUIRED_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5810:25: ( 'required' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5810:27: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REQUIRED_ATTRIBUTE"

    // $ANTLR start "RULE_KEY_ATTRIBUTE"
    public final void mRULE_KEY_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_KEY_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5812:20: ( 'key' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5812:22: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEY_ATTRIBUTE"

    // $ANTLR start "RULE_HASH_ATTRIBUTE"
    public final void mRULE_HASH_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_HASH_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5814:21: ( 'hash' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5814:23: 'hash'
            {
            match("hash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH_ATTRIBUTE"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5816:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5818:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5818:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5818:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:14: ( ( '-' )? RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:16: ( '-' )? RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:16: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:30: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:31: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:41: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:63: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='B'||LA9_0=='b') ) {
                alt9=1;
            }
            else if ( (LA9_0=='D'||LA9_0=='F'||LA9_0=='L'||LA9_0=='d'||LA9_0=='f'||LA9_0=='l') ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:64: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5820:92: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5822:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5822:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5822:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5822:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5822:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5824:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5826:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5826:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5826:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5826:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:41: ( '\\r' )? '\\n'
                    {
                    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5828:41: '\\r'
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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5830:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5830:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5830:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5832:16: ( . )
            // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:5832:18: .
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
        // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_ID_ATTRIBUTE | RULE_DEPRECTED_ATTRIBUTE | RULE_REQUIRED_ATTRIBUTE | RULE_KEY_ATTRIBUTE | RULE_HASH_ATTRIBUTE | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=53;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:244: RULE_ID_ATTRIBUTE
                {
                mRULE_ID_ATTRIBUTE(); 

                }
                break;
            case 41 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:262: RULE_DEPRECTED_ATTRIBUTE
                {
                mRULE_DEPRECTED_ATTRIBUTE(); 

                }
                break;
            case 42 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:287: RULE_REQUIRED_ATTRIBUTE
                {
                mRULE_REQUIRED_ATTRIBUTE(); 

                }
                break;
            case 43 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:311: RULE_KEY_ATTRIBUTE
                {
                mRULE_KEY_ATTRIBUTE(); 

                }
                break;
            case 44 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:330: RULE_HASH_ATTRIBUTE
                {
                mRULE_HASH_ATTRIBUTE(); 

                }
                break;
            case 45 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:350: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 46 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:359: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:368: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 48 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:381: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:389: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:401: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:417: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:433: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // ../maxim.zaks.flattBuffers.ui/src-gen/maxim/zaks/ui/contentassist/antlr/internal/InternalFlatBuffers.g:1:441: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\10\50\1\uffff\2\50\3\uffff\1\50\7\uffff\4\50\2\121\2\44\1\uffff\3\44\2\uffff\3\50\1\uffff\16\50\1\151\3\50\1\uffff\3\50\3\uffff\2\50\7\uffff\4\50\1\uffff\1\121\6\uffff\20\50\1\u0087\1\50\1\uffff\12\50\1\u0093\1\50\1\u0095\1\u0096\14\50\1\u00a3\2\50\1\uffff\1\50\1\u00a7\6\50\1\u00ae\1\u00af\1\50\1\uffff\1\u00b1\2\uffff\1\50\1\u00b3\1\50\1\u00b6\5\50\1\u00bc\1\u00bd\1\50\1\uffff\1\u00bf\1\u00c0\1\50\1\uffff\5\50\1\u00c7\2\uffff\1\50\1\uffff\1\50\1\uffff\2\50\1\uffff\1\50\1\u00cd\1\50\1\u00cf\1\u00d0\2\uffff\1\u00d1\2\uffff\6\50\1\uffff\5\50\1\uffff\1\50\3\uffff\1\u00de\13\50\1\uffff\1\50\1\u00eb\4\50\1\u00f0\4\50\1\u00f5\1\uffff\1\u00f6\1\u00f7\2\50\1\uffff\3\50\1\u00fd\3\uffff\4\50\1\u0102\1\uffff\4\50\1\uffff\7\50\1\u010e\1\50\1\u0110\1\u0111\1\uffff\1\50\2\uffff\1\50\1\u0114\1\uffff";
    static final String DFA20_eofS =
        "\u0115\uffff";
    static final String DFA20_minS =
        "\1\0\1\151\1\141\1\145\1\150\1\142\1\144\1\157\1\145\1\uffff\1\164\1\141\3\uffff\1\141\7\uffff\1\156\1\162\1\145\1\141\3\60\1\101\1\uffff\2\0\1\52\2\uffff\1\157\2\164\1\uffff\1\157\2\154\1\162\1\165\1\160\1\162\1\157\1\171\1\150\1\156\1\157\1\151\1\143\1\60\1\156\1\157\1\161\1\uffff\1\164\1\155\1\163\3\uffff\1\142\1\165\7\uffff\1\165\1\151\1\171\1\163\1\uffff\1\60\6\uffff\1\154\1\145\1\137\1\141\1\145\1\163\1\143\1\142\1\162\1\151\1\162\1\164\1\157\1\164\1\156\1\157\1\60\1\154\1\uffff\1\147\1\164\1\165\1\162\1\145\1\164\1\154\1\145\1\155\1\147\1\60\1\150\2\60\1\146\1\164\1\137\2\145\1\154\1\145\1\156\1\143\1\164\1\145\1\162\1\60\1\147\1\156\1\uffff\1\165\1\60\1\137\2\151\1\163\2\145\2\60\1\151\1\uffff\1\60\2\uffff\1\154\1\60\1\145\1\60\1\137\1\145\1\143\1\147\1\164\2\60\1\164\1\uffff\2\60\1\144\1\uffff\1\164\1\162\1\142\1\160\1\144\1\60\2\uffff\1\156\1\uffff\1\141\1\uffff\1\144\1\170\1\uffff\1\141\1\60\1\141\2\60\2\uffff\1\60\2\uffff\1\145\1\171\1\145\1\165\1\141\1\137\1\uffff\1\141\1\147\1\145\1\164\1\154\1\uffff\1\164\3\uffff\1\60\1\160\1\144\1\164\1\143\1\146\1\154\1\163\1\156\1\145\1\151\1\145\1\uffff\1\145\1\60\2\145\1\154\1\137\1\60\1\164\1\156\1\147\1\144\1\60\1\uffff\2\60\1\141\1\157\1\uffff\1\151\1\163\1\156\1\60\3\uffff\1\164\1\162\1\146\1\151\1\60\1\uffff\1\142\1\144\1\151\1\157\1\uffff\1\165\2\145\1\156\1\146\2\162\1\60\1\146\2\60\1\uffff\1\145\2\uffff\1\162\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\171\2\157\1\164\1\163\1\156\2\157\1\uffff\1\164\1\145\3\uffff\1\162\7\uffff\1\156\1\162\1\145\1\141\1\170\1\154\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\157\2\164\1\uffff\1\157\2\154\1\162\1\165\1\160\1\162\1\157\1\171\1\150\1\156\1\157\1\151\1\164\1\172\1\156\1\157\1\161\1\uffff\1\164\1\155\1\163\3\uffff\1\142\1\165\7\uffff\1\165\1\151\1\171\1\163\1\uffff\1\154\6\uffff\1\154\1\145\1\137\1\141\1\145\1\163\1\143\1\142\1\162\1\165\1\162\1\164\1\157\1\164\1\156\1\157\1\172\1\154\1\uffff\1\147\1\164\1\165\1\162\1\145\1\164\1\154\1\145\1\155\1\147\1\172\1\150\2\172\1\146\1\164\1\137\2\145\1\154\1\145\1\156\1\143\1\164\1\145\1\162\1\172\1\147\1\156\1\uffff\1\165\1\172\1\137\2\151\1\163\2\145\2\172\1\151\1\uffff\1\172\2\uffff\1\154\1\172\1\151\1\172\1\137\1\145\1\143\1\147\1\164\2\172\1\164\1\uffff\2\172\1\144\1\uffff\1\164\1\162\1\142\1\160\1\144\1\172\2\uffff\1\156\1\uffff\1\141\1\uffff\1\144\1\170\1\uffff\1\141\1\172\1\141\2\172\2\uffff\1\172\2\uffff\1\145\1\171\1\145\1\165\1\141\1\137\1\uffff\1\141\1\147\1\145\1\164\1\154\1\uffff\1\164\3\uffff\1\172\1\160\1\144\1\164\1\143\1\146\1\154\1\163\1\156\1\145\1\151\1\145\1\uffff\1\145\1\172\2\145\1\154\1\137\1\172\1\164\1\156\1\147\1\144\1\172\1\uffff\2\172\1\141\1\157\1\uffff\1\151\1\163\1\156\1\172\3\uffff\1\164\1\162\1\146\1\151\1\172\1\uffff\1\142\1\144\1\151\1\157\1\uffff\1\165\2\145\1\156\1\146\2\162\1\172\1\146\2\172\1\uffff\1\145\2\uffff\1\162\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\11\uffff\1\16\2\uffff\1\25\1\26\1\27\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\10\uffff\1\60\3\uffff\1\64\1\65\3\uffff\1\60\22\uffff\1\16\3\uffff\1\25\1\26\1\27\2\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\4\uffff\1\55\1\uffff\1\56\1\57\1\61\1\62\1\63\1\64\22\uffff\1\50\35\uffff\1\11\13\uffff\1\53\1\uffff\1\1\1\5\14\uffff\1\12\3\uffff\1\13\6\uffff\1\43\1\40\1\uffff\1\54\1\uffff\1\2\2\uffff\1\42\5\uffff\1\7\1\6\1\uffff\1\14\1\41\6\uffff\1\30\5\uffff\1\3\1\uffff\1\4\1\24\1\10\14\uffff\1\23\14\uffff\1\52\4\uffff\1\46\4\uffff\1\15\1\17\1\22\5\uffff\1\51\4\uffff\1\45\13\uffff\1\21\1\uffff\1\44\1\20\2\uffff\1\47";
    static final String DFA20_specialS =
        "\1\1\37\uffff\1\2\1\0\u00f3\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\21\1\22\2\44\1\23\1\35\1\24\1\42\1\33\11\34\1\16\1\11\1\44\1\20\3\44\32\37\1\25\1\44\1\26\1\36\1\37\1\44\1\12\1\1\1\37\1\3\1\27\1\2\1\37\1\32\1\6\1\37\1\31\1\7\1\37\1\13\1\30\2\37\1\10\1\4\1\17\1\5\5\37\1\14\1\44\1\15\uff82\44",
            "\1\47\5\uffff\1\45\11\uffff\1\46",
            "\1\53\7\uffff\1\52\2\uffff\1\51\2\uffff\1\54",
            "\1\56\11\uffff\1\55",
            "\1\60\13\uffff\1\57",
            "\1\61\6\uffff\1\63\2\uffff\1\64\1\uffff\1\65\4\uffff\1\62",
            "\1\67\11\uffff\1\66",
            "\1\70",
            "\1\72\11\uffff\1\71",
            "",
            "\1\74",
            "\1\75\3\uffff\1\76",
            "",
            "",
            "",
            "\1\102\20\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\120\10\uffff\1\122\1\uffff\3\122\5\uffff\1\122\13\uffff\1\117\6\uffff\1\120\2\uffff\1\122\1\uffff\3\122\5\uffff\1\122\13\uffff\1\117",
            "\12\120\10\uffff\1\122\1\uffff\3\122\5\uffff\1\122\22\uffff\1\120\2\uffff\1\122\1\uffff\3\122\5\uffff\1\122",
            "\12\122",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\123",
            "\0\123",
            "\1\124\4\uffff\1\125",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\20\uffff\1\147",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\12\120\10\uffff\1\122\1\uffff\3\122\5\uffff\1\122\22\uffff\1\120\2\uffff\1\122\1\uffff\3\122\5\uffff\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\13\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0094",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0097",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b0",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00b2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b5\3\uffff\1\u00b4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00be",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ce",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_ID_ATTRIBUTE | RULE_DEPRECTED_ATTRIBUTE | RULE_REQUIRED_ATTRIBUTE | RULE_KEY_ATTRIBUTE | RULE_HASH_ATTRIBUTE | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_33 = input.LA(1);

                        s = -1;
                        if ( ((LA20_33>='\u0000' && LA20_33<='\uFFFF')) ) {s = 83;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='b') ) {s = 1;}

                        else if ( (LA20_0=='f') ) {s = 2;}

                        else if ( (LA20_0=='d') ) {s = 3;}

                        else if ( (LA20_0=='s') ) {s = 4;}

                        else if ( (LA20_0=='u') ) {s = 5;}

                        else if ( (LA20_0=='i') ) {s = 6;}

                        else if ( (LA20_0=='l') ) {s = 7;}

                        else if ( (LA20_0=='r') ) {s = 8;}

                        else if ( (LA20_0==';') ) {s = 9;}

                        else if ( (LA20_0=='a') ) {s = 10;}

                        else if ( (LA20_0=='n') ) {s = 11;}

                        else if ( (LA20_0=='{') ) {s = 12;}

                        else if ( (LA20_0=='}') ) {s = 13;}

                        else if ( (LA20_0==':') ) {s = 14;}

                        else if ( (LA20_0=='t') ) {s = 15;}

                        else if ( (LA20_0=='=') ) {s = 16;}

                        else if ( (LA20_0=='(') ) {s = 17;}

                        else if ( (LA20_0==')') ) {s = 18;}

                        else if ( (LA20_0==',') ) {s = 19;}

                        else if ( (LA20_0=='.') ) {s = 20;}

                        else if ( (LA20_0=='[') ) {s = 21;}

                        else if ( (LA20_0==']') ) {s = 22;}

                        else if ( (LA20_0=='e') ) {s = 23;}

                        else if ( (LA20_0=='o') ) {s = 24;}

                        else if ( (LA20_0=='k') ) {s = 25;}

                        else if ( (LA20_0=='h') ) {s = 26;}

                        else if ( (LA20_0=='0') ) {s = 27;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 28;}

                        else if ( (LA20_0=='-') ) {s = 29;}

                        else if ( (LA20_0=='^') ) {s = 30;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='c'||LA20_0=='g'||LA20_0=='j'||LA20_0=='m'||(LA20_0>='p' && LA20_0<='q')||(LA20_0>='v' && LA20_0<='z')) ) {s = 31;}

                        else if ( (LA20_0=='\"') ) {s = 32;}

                        else if ( (LA20_0=='\'') ) {s = 33;}

                        else if ( (LA20_0=='/') ) {s = 34;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 35;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='*' && LA20_0<='+')||LA20_0=='<'||(LA20_0>='>' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||LA20_0=='|'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_32 = input.LA(1);

                        s = -1;
                        if ( ((LA20_32>='\u0000' && LA20_32<='\uFFFF')) ) {s = 83;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}