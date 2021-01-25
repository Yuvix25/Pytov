// Generated from c:\Users\yuvro\OneDrive\Desktop\Pytov\Pytov.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, COMMENT=16, 
		LINE_COMMENT_C=17, LINE_COMMENT_P=18, AND=19, OR=20, NOT=21, TRUE=22, 
		FALSE=23, ADD=24, SUBTRACT=25, MULT=26, DIVIDE=27, FLOOR_DIVISION=28, 
		MODULO=29, GT=30, GE=31, LT=32, LE=33, EQ=34, NOT_EQ=35, LPAREN=36, RPAREN=37, 
		RETURN=38, DECIMAL=39, IDENTIFIER=40, OPEN_CURLY=41, CLOSE_CURLY=42, WS=43, 
		SEMI_COLON=44, NEW_LINE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "COMMENT", "LINE_COMMENT_C", 
			"LINE_COMMENT_P", "AND", "OR", "NOT", "TRUE", "FALSE", "ADD", "SUBTRACT", 
			"MULT", "DIVIDE", "FLOOR_DIVISION", "MODULO", "GT", "GE", "LT", "LE", 
			"EQ", "NOT_EQ", "LPAREN", "RPAREN", "RETURN", "DECIMAL", "IDENTIFIER", 
			"OPEN_CURLY", "CLOSE_CURLY", "WS", "SEMI_COLON", "NEW_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'if'", "'elif'", "'else if'", "'else'", "','", "'='", 
			"'while'", "'for'", "'in'", "'func'", "'function'", "'def'", null, null, 
			null, null, "'&&'", "'||'", "'!'", null, null, "'+'", "'-'", "'*'", "'/'", 
			"'/_'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'('", "')'", 
			"'return'", null, null, "'{'", "'}'", null, "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "COMMENT", "LINE_COMMENT_C", "LINE_COMMENT_P", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "ADD", "SUBTRACT", "MULT", "DIVIDE", 
			"FLOOR_DIVISION", "MODULO", "GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", 
			"RPAREN", "RETURN", "DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", 
			"WS", "SEMI_COLON", "NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22\3"+
		"\22\3\22\3\23\3\23\7\23\u00c0\n\23\f\23\16\23\u00c3\13\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u00d7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00e3\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u010e\n(\r(\16(\u010f"+
		"\3(\3(\6(\u0114\n(\r(\16(\u0115\5(\u0118\n(\3)\3)\7)\u011c\n)\f)\16)\u011f"+
		"\13)\3*\3*\3+\3+\3,\6,\u0126\n,\r,\16,\u0127\3,\3,\3-\3-\3.\3.\4\u009f"+
		"\u00aa\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\4\2\f\f\17\17\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\17\"\"\2\u013a\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\td\3\2"+
		"\2\2\13i\3\2\2\2\rq\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25\u0080"+
		"\3\2\2\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2\33\u008c\3\2\2\2\35\u0095\3"+
		"\2\2\2\37\u0099\3\2\2\2!\u00a4\3\2\2\2#\u00b2\3\2\2\2%\u00bd\3\2\2\2\'"+
		"\u00c6\3\2\2\2)\u00c9\3\2\2\2+\u00cc\3\2\2\2-\u00d6\3\2\2\2/\u00e2\3\2"+
		"\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2"+
		"\29\u00ec\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2?\u00f3\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fb\3\2\2\2G\u00fe\3\2\2\2I\u0101\3\2\2\2K"+
		"\u0103\3\2\2\2M\u0105\3\2\2\2O\u010d\3\2\2\2Q\u0119\3\2\2\2S\u0120\3\2"+
		"\2\2U\u0122\3\2\2\2W\u0125\3\2\2\2Y\u012b\3\2\2\2[\u012d\3\2\2\2]^\7]"+
		"\2\2^\4\3\2\2\2_`\7_\2\2`\6\3\2\2\2ab\7k\2\2bc\7h\2\2c\b\3\2\2\2de\7g"+
		"\2\2ef\7n\2\2fg\7k\2\2gh\7h\2\2h\n\3\2\2\2ij\7g\2\2jk\7n\2\2kl\7u\2\2"+
		"lm\7g\2\2mn\7\"\2\2no\7k\2\2op\7h\2\2p\f\3\2\2\2qr\7g\2\2rs\7n\2\2st\7"+
		"u\2\2tu\7g\2\2u\16\3\2\2\2vw\7.\2\2w\20\3\2\2\2xy\7?\2\2y\22\3\2\2\2z"+
		"{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177\24\3\2\2\2\u0080\u0081"+
		"\7h\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083\26\3\2\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7p\2\2\u0086\30\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089"+
		"\7w\2\2\u0089\u008a\7p\2\2\u008a\u008b\7e\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7h\2\2\u008d\u008e\7w\2\2\u008e\u008f\7p\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7k\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7"+
		"h\2\2\u0098\36\3\2\2\2\u0099\u009f\7$\2\2\u009a\u009b\7^\2\2\u009b\u009e"+
		"\7$\2\2\u009c\u009e\13\2\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3 \3\2\2\2\u00a4\u00a5"+
		"\7\61\2\2\u00a5\u00a6\7,\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\21\2\2\u00b1\"\3\2\2"+
		"\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b8\3\2\2\2\u00b5"+
		"\u00b7\n\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\b\22\2\2\u00bc$\3\2\2\2\u00bd\u00c1\7%\2\2\u00be\u00c0\n\2\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\23\2\2"+
		"\u00c5&\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7(\2\2\u00c8(\3\2\2\2\u00c9"+
		"\u00ca\7~\2\2\u00ca\u00cb\7~\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd"+
		",\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2\2\u00d1"+
		"\u00d7\7g\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2"+
		"\u00d5\u00d7\7g\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7.\3\2"+
		"\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00e3\7g\2\2\u00dd\u00de\7H\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e3\7g\2\2\u00e2\u00d8\3\2\2"+
		"\2\u00e2\u00dd\3\2\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\62\3"+
		"\2\2\2\u00e6\u00e7\7/\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\66"+
		"\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed"+
		"\u00ee\7a\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0<\3\2\2\2\u00f1"+
		"\u00f2\7@\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\7?\2\2\u00f5"+
		"@\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa"+
		"\7?\2\2\u00faD\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc\u00fd\7?\2\2\u00fdF\3"+
		"\2\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100\7?\2\2\u0100H\3\2\2\2\u0101\u0102"+
		"\7*\2\2\u0102J\3\2\2\2\u0103\u0104\7+\2\2\u0104L\3\2\2\2\u0105\u0106\7"+
		"t\2\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7p\2\2\u010bN\3\2\2\2\u010c\u010e\t\3\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0117\3\2\2\2\u0111\u0113\7\60\2\2\u0112\u0114\t\3\2\2\u0113\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0118\3\2\2\2\u0118P\3\2\2\2"+
		"\u0119\u011d\t\4\2\2\u011a\u011c\t\5\2\2\u011b\u011a\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eR\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7}\2\2\u0121T\3\2\2\2\u0122\u0123\7\177\2\2"+
		"\u0123V\3\2\2\2\u0124\u0126\t\6\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\b,\2\2\u012aX\3\2\2\2\u012b\u012c\7=\2\2\u012cZ\3\2\2\2\u012d\u012e"+
		"\7\f\2\2\u012e\\\3\2\2\2\17\2\u009d\u009f\u00aa\u00b8\u00c1\u00d6\u00e2"+
		"\u010f\u0115\u0117\u011d\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}