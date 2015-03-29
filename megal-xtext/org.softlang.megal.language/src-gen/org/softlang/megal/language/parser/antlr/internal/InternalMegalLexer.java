package org.softlang.megal.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalLexer extends Lexer {
    public static final int RULE_SEGMENT=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_LCID=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_UCID=5;
    public static final int RULE_WS=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMegalLexer() {;} 
    public InternalMegalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMegalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:11:7: ( 'model' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:11:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:12:7: ( 'import' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:13:7: ( '@' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:13:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:14:7: ( '[' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:15:7: ( ']' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:16:7: ( '(' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:17:7: ( ')' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:17:9: ')'
            {
            match(')'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:18:7: ( '|' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:18:9: '|'
            {
            match('|'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:19:7: ( '->' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:19:9: '->'
            {
            match("->"); 


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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:20:7: ( '=' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:20:9: '='
            {
            match('='); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:21:7: ( '<' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:21:9: '<'
            {
            match('<'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:22:7: ( 'as' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:22:9: 'as'
            {
            match("as"); 


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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:23:7: ( 'entity' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:23:9: 'entity'
            {
            match("entity"); 


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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:24:7: ( '*' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:24:9: '*'
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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:25:7: ( '?' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:25:9: '?'
            {
            match('?'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:26:7: ( '!' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:26:9: '!'
            {
            match('!'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:27:7: ( ':' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:27:9: ':'
            {
            match(':'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:28:7: ( '+' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:28:9: '+'
            {
            match('+'); 

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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:29:7: ( '::' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:29:9: '::'
            {
            match("::"); 


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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:30:7: ( '.' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_UCID"
    public final void mRULE_UCID() throws RecognitionException {
        try {
            int _type = RULE_UCID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1324:11: ( ( '^' )? ( 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1324:13: ( '^' )? ( 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1324:13: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1324:13: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1324:38: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:
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
    // $ANTLR end "RULE_UCID"

    // $ANTLR start "RULE_LCID"
    public final void mRULE_LCID() throws RecognitionException {
        try {
            int _type = RULE_LCID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1326:11: ( ( '^' )? ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1326:13: ( '^' )? ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1326:13: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1326:13: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1326:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1328:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1330:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1330:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1330:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1330:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:41: ( '\\r' )? '\\n'
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1332:41: '\\r'
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
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1334:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1334:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1334:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SEGMENT"
    public final void mRULE_SEGMENT() throws RecognitionException {
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1336:23: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' | '_' | '~' | ':' | '?' | '#' | '[' | ']' | '@' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' )+ )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1336:25: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' | '_' | '~' | ':' | '?' | '#' | '[' | ']' | '@' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' )+
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1336:25: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' | '_' | '~' | ':' | '?' | '#' | '[' | ']' | '@' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='!'||(LA13_0>='#' && LA13_0<='$')||(LA13_0>='&' && LA13_0<='.')||(LA13_0>='0' && LA13_0<=';')||LA13_0=='='||(LA13_0>='?' && LA13_0<='[')||LA13_0==']'||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='~') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='&' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEGMENT"

    public void mTokens() throws RecognitionException {
        // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_UCID | RULE_LCID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt14=26;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:130: RULE_UCID
                {
                mRULE_UCID(); 

                }
                break;
            case 22 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:140: RULE_LCID
                {
                mRULE_LCID(); 

                }
                break;
            case 23 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:150: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:162: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:178: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1:194: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\26\11\uffff\2\26\3\uffff\1\37\10\uffff\2\26\1\44\1\26\4\uffff\2\26\1\uffff\4\26\1\54\2\26\1\uffff\1\57\1\60\2\uffff";
    static final String DFA14_eofS =
        "\61\uffff";
    static final String DFA14_minS =
        "\1\11\1\157\1\155\11\uffff\1\163\1\156\3\uffff\1\72\2\uffff\1\60\3\uffff\1\52\1\uffff\1\144\1\160\1\60\1\164\4\uffff\1\145\1\157\1\uffff\1\151\1\154\1\162\1\164\1\60\1\164\1\171\1\uffff\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\174\1\157\1\155\11\uffff\1\163\1\156\3\uffff\1\72\2\uffff\1\172\3\uffff\1\57\1\uffff\1\144\1\160\1\172\1\164\4\uffff\1\145\1\157\1\uffff\1\151\1\154\1\162\1\164\1\172\1\164\1\171\1\uffff\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\16\1\17\1\20\1\uffff\1\22\1\24\1\uffff\1\25\1\26\1\27\1\uffff\1\32\4\uffff\1\23\1\21\1\30\1\31\2\uffff\1\14\7\uffff\1\1\2\uffff\1\2\1\15";
    static final String DFA14_specialS =
        "\61\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\20\1\27\4\uffff\1\27\1\6\1\7\1\16\1\22\1\uffff\1\11\1\23\1\30\12\25\1\21\1\uffff\1\13\1\12\1\uffff\1\17\1\3\32\25\1\4\1\uffff\1\5\1\24\1\26\1\uffff\1\14\3\26\1\15\3\26\1\2\3\26\1\1\15\26\1\uffff\1\10",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "\1\36",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\40\4\uffff\1\41",
            "",
            "\1\42",
            "\1\43",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\45",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\55",
            "\1\56",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_UCID | RULE_LCID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}