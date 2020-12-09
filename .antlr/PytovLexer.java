// Generated from c:\Users\yuvro\OneDrive\Desktop\PytovMain\Parser\Pytov.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PytovLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, COMMENT=15, LINE_COMMENT=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, ADD=22, SUBTRACT=23, MULT=24, 
		DIVIDE=25, FLOOR_DIVISION=26, MODULO=27, GT=28, GE=29, LT=30, LE=31, EQ=32, 
		NOT_EQ=33, LPAREN=34, RPAREN=35, RETURN=36, DECIMAL=37, IDENTIFIER=38, 
		OPEN_CURLY=39, CLOSE_CURLY=40, WS=41, SEMI_COLON=42, NEWLINE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "STRING", "COMMENT", "LINE_COMMENT", 
		"AND", "OR", "NOT", "TRUE", "FALSE", "ADD", "SUBTRACT", "MULT", "DIVIDE", 
		"FLOOR_DIVISION", "MODULO", "GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", 
		"RPAREN", "RETURN", "DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", 
		"WS", "SEMI_COLON", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'if'", "'elif'", "'else'", "','", "'='", "'while'", 
		"'for'", "'in'", "'func'", "'function'", "'def'", null, null, null, "'&&'", 
		"'||'", "'!'", null, null, "'+'", "'-'", "'*'", "'/'", "'/_'", "'%'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'('", "')'", "'return'", 
		null, null, "'{'", "'}'", null, "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRING", "COMMENT", "LINE_COMMENT", "AND", "OR", "NOT", "TRUE", 
		"FALSE", "ADD", "SUBTRACT", "MULT", "DIVIDE", "FLOOR_DIVISION", "MODULO", 
		"GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", "RPAREN", "RETURN", 
		"DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", "WS", "SEMI_COLON", 
		"NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PytovLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pytov.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			print("comment found")
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00ad\n\21"+
		"\f\21\16\21\u00b0\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c4\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\6&\u00fb\n&\r&\16&\u00fc\3&\3&\6&\u0101\n&\r&\16&\u0102\5"+
		"&\u0105\n&\3\'\3\'\7\'\u0109\n\'\f\'\16\'\u010c\13\'\3(\3(\3)\3)\3*\6"+
		"*\u0113\n*\r*\16*\u0114\3*\3*\3+\3+\3,\3,\4\u0093\u009e\2-\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-\3\2\7\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\5\2\13\13\16\17\"\"\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2"+
		"\2\2\7]\3\2\2\2\t`\3\2\2\2\13e\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21n\3\2"+
		"\2\2\23t\3\2\2\2\25x\3\2\2\2\27{\3\2\2\2\31\u0080\3\2\2\2\33\u0089\3\2"+
		"\2\2\35\u008d\3\2\2\2\37\u0098\3\2\2\2!\u00a8\3\2\2\2#\u00b3\3\2\2\2%"+
		"\u00b6\3\2\2\2\'\u00b9\3\2\2\2)\u00c3\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2"+
		"\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e3\3\2\2\2?\u00e5"+
		"\3\2\2\2A\u00e8\3\2\2\2C\u00eb\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00fa\3\2\2\2M\u0106\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2"+
		"\2\2S\u0112\3\2\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2YZ\7]\2\2Z\4\3\2\2\2"+
		"[\\\7_\2\2\\\6\3\2\2\2]^\7k\2\2^_\7h\2\2_\b\3\2\2\2`a\7g\2\2ab\7n\2\2"+
		"bc\7k\2\2cd\7h\2\2d\n\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\f\3"+
		"\2\2\2jk\7.\2\2k\16\3\2\2\2lm\7?\2\2m\20\3\2\2\2no\7y\2\2op\7j\2\2pq\7"+
		"k\2\2qr\7n\2\2rs\7g\2\2s\22\3\2\2\2tu\7h\2\2uv\7q\2\2vw\7t\2\2w\24\3\2"+
		"\2\2xy\7k\2\2yz\7p\2\2z\26\3\2\2\2{|\7h\2\2|}\7w\2\2}~\7p\2\2~\177\7e"+
		"\2\2\177\30\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7w\2\2\u0082\u0083"+
		"\7p\2\2\u0083\u0084\7e\2\2\u0084\u0085\7v\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088\32\3\2\2\2\u0089\u008a\7f\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7h\2\2\u008c\34\3\2\2\2\u008d\u0093\7$\2\2\u008e"+
		"\u008f\7^\2\2\u008f\u0092\7$\2\2\u0090\u0092\13\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7$"+
		"\2\2\u0097\36\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7,\2\2\u009a\u009e"+
		"\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\b\20\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\20\3\2\u00a7 \3\2\2"+
		"\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2\2\2\u00ab"+
		"\u00ad\n\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\b\21\3\2\u00b2\"\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7(\2\2"+
		"\u00b5$\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7\u00b8\7~\2\2\u00b8&\3\2\2\2\u00b9"+
		"\u00ba\7#\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7w\2\2\u00be\u00c4\7g\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7w\2\2\u00c2\u00c4\7g\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf"+
		"\3\2\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00d0\7g\2\2\u00ca\u00cb\7H\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00d0\7g\2\2"+
		"\u00cf\u00c5\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7"+
		"-\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7"+
		",\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\64\3\2\2\2\u00d9\u00da"+
		"\7\61\2\2\u00da\u00db\7a\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7\'\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\7@\2\2\u00df:\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7"+
		">\2\2\u00e6\u00e7\7?\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9\u00ea"+
		"\7?\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7?\2\2\u00edD\3"+
		"\2\2\2\u00ee\u00ef\7*\2\2\u00efF\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1H\3\2"+
		"\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7p\2\2\u00f8J\3\2\2\2\u00f9\u00fb"+
		"\t\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u0100\7\60\2\2\u00ff\u0101\t"+
		"\3\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105L\3\2\2\2\u0106\u010a\t\4\2\2\u0107\u0109\t\5\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"N\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7}\2\2\u010eP\3\2\2\2\u010f"+
		"\u0110\7\177\2\2\u0110R\3\2\2\2\u0111\u0113\t\6\2\2\u0112\u0111\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\b*\3\2\u0117T\3\2\2\2\u0118\u0119\7=\2\2\u0119V\3"+
		"\2\2\2\u011a\u011b\7\f\2\2\u011bX\3\2\2\2\16\2\u0091\u0093\u009e\u00ae"+
		"\u00c3\u00cf\u00fc\u0102\u0104\u010a\u0114\4\3\20\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}