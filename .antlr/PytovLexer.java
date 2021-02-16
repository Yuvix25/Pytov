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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, STRING=21, COMMENT=22, LINE_COMMENT_C=23, 
		LINE_COMMENT_P=24, AND=25, OR=26, NOT=27, TRUE=28, FALSE=29, INC=30, DEC=31, 
		ADD=32, SUBTRACT=33, POWER=34, MULT=35, DIVIDE=36, FLOOR_DIVISION=37, 
		MODULO=38, GT=39, GE=40, LT=41, LE=42, EQ=43, NOT_EQ=44, LPAREN=45, RPAREN=46, 
		RETURN=47, BREAK=48, DECIMAL=49, IDENTIFIER=50, OPEN_CURLY=51, CLOSE_CURLY=52, 
		WS=53, SEMI_COLON=54, NEW_LINE=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "STRING", "COMMENT", "LINE_COMMENT_C", "LINE_COMMENT_P", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "INC", "DEC", "ADD", "SUBTRACT", 
			"POWER", "MULT", "DIVIDE", "FLOOR_DIVISION", "MODULO", "GT", "GE", "LT", 
			"LE", "EQ", "NOT_EQ", "LPAREN", "RPAREN", "RETURN", "BREAK", "DECIMAL", 
			"IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", "WS", "SEMI_COLON", "NEW_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'['", "']'", "'if'", "'elif'", "'else if'", "'else'", 
			"'case'", "':'", "'default:'", "'switch'", "','", "'global'", "'='", 
			"'while'", "'for'", "'in'", "'func'", "'function'", "'def'", null, null, 
			null, null, "'&&'", "'||'", "'!'", null, null, "'++'", "'--'", "'+'", 
			"'-'", "'**'", "'*'", "'/'", "'/_'", "'%'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'!='", "'('", "')'", "'return'", "'break'", null, null, "'{'", 
			"'}'", null, "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "STRING", "COMMENT", 
			"LINE_COMMENT_C", "LINE_COMMENT_P", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"INC", "DEC", "ADD", "SUBTRACT", "POWER", "MULT", "DIVIDE", "FLOOR_DIVISION", 
			"MODULO", "GT", "GE", "LT", "LE", "EQ", "NOT_EQ", "LPAREN", "RPAREN", 
			"RETURN", "BREAK", "DECIMAL", "IDENTIFIER", "OPEN_CURLY", "CLOSE_CURLY", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\7\26\u00d7\n\26\f\26\16\26\u00da\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\26\5\26\u00e7\n\26\3\27\3\27"+
		"\3\27\3\27\7\27\u00ed\n\27\f\27\16\27\u00f0\13\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u00fb\n\30\f\30\16\30\u00fe\13\30\3\30"+
		"\3\30\3\31\3\31\7\31\u0104\n\31\f\31\16\31\u0107\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u011b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0127\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\6\62\u0161\n\62\r\62\16\62\u0162\3\62\3\62\6\62\u0167\n"+
		"\62\r\62\16\62\u0168\5\62\u016b\n\62\3\63\3\63\7\63\u016f\n\63\f\63\16"+
		"\63\u0172\13\63\3\64\3\64\3\65\3\65\3\66\6\66\u0179\n\66\r\66\16\66\u017a"+
		"\3\66\3\66\3\67\3\67\38\38\5\u00d8\u00e2\u00ee\29\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\7\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\17\"\"\2\u0190\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3q\3\2\2\2\5x\3\2\2\2\7z\3\2\2\2\t|\3\2\2\2\13\177\3\2\2\2\r\u0084"+
		"\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3"+
		"\2\2\2\27\u00a1\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00b1\3\2"+
		"\2\2\37\u00b3\3\2\2\2!\u00b9\3\2\2\2#\u00bd\3\2\2\2%\u00c0\3\2\2\2\'\u00c5"+
		"\3\2\2\2)\u00ce\3\2\2\2+\u00e6\3\2\2\2-\u00e8\3\2\2\2/\u00f6\3\2\2\2\61"+
		"\u0101\3\2\2\2\63\u010a\3\2\2\2\65\u010d\3\2\2\2\67\u0110\3\2\2\29\u011a"+
		"\3\2\2\2;\u0126\3\2\2\2=\u0128\3\2\2\2?\u012b\3\2\2\2A\u012e\3\2\2\2C"+
		"\u0130\3\2\2\2E\u0132\3\2\2\2G\u0135\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2"+
		"\2\2M\u013c\3\2\2\2O\u013e\3\2\2\2Q\u0140\3\2\2\2S\u0143\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0148\3\2\2\2Y\u014b\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_"+
		"\u0152\3\2\2\2a\u0159\3\2\2\2c\u0160\3\2\2\2e\u016c\3\2\2\2g\u0173\3\2"+
		"\2\2i\u0175\3\2\2\2k\u0178\3\2\2\2m\u017e\3\2\2\2o\u0180\3\2\2\2qr\7k"+
		"\2\2rs\7o\2\2st\7r\2\2tu\7q\2\2uv\7t\2\2vw\7v\2\2w\4\3\2\2\2xy\7]\2\2"+
		"y\6\3\2\2\2z{\7_\2\2{\b\3\2\2\2|}\7k\2\2}~\7h\2\2~\n\3\2\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082\7k\2\2\u0082\u0083\7h\2\2\u0083"+
		"\f\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7n\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2"+
		"\2\u008b\16\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0090\7g\2\2\u0090\20\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\22\3\2\2\2\u0096\u0097"+
		"\7<\2\2\u0097\24\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a\7g\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7w\2\2\u009d\u009e\7n\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7<\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7y\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7e\2\2"+
		"\u00a6\u00a7\7j\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9\32\3\2\2"+
		"\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7d\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\34\3\2\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\"\3\2\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7p\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7w\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7e\2\2\u00c4&\3\2\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd(\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7h\2"+
		"\2\u00d1*\3\2\2\2\u00d2\u00d8\7$\2\2\u00d3\u00d4\7^\2\2\u00d4\u00d7\7"+
		"$\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00e7\7$\2\2\u00dc\u00e2\7)\2\2\u00dd\u00de"+
		"\7^\2\2\u00de\u00e1\7)\2\2\u00df\u00e1\13\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7)\2\2\u00e6"+
		"\u00d2\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7\61\2\2"+
		"\u00e9\u00ea\7,\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3\7\61"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\27\2\2\u00f5.\3\2\2\2\u00f6\u00f7"+
		"\7\61\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\n\2\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\b\30\2\2"+
		"\u0100\60\3\2\2\2\u0101\u0105\7%\2\2\u0102\u0104\n\2\2\2\u0103\u0102\3"+
		"\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b\31\2\2\u0109\62\3\2\2"+
		"\2\u010a\u010b\7(\2\2\u010b\u010c\7(\2\2\u010c\64\3\2\2\2\u010d\u010e"+
		"\7~\2\2\u010e\u010f\7~\2\2\u010f\66\3\2\2\2\u0110\u0111\7#\2\2\u01118"+
		"\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115"+
		"\u011b\7g\2\2\u0116\u0117\7V\2\2\u0117\u0118\7t\2\2\u0118\u0119\7w\2\2"+
		"\u0119\u011b\7g\2\2\u011a\u0112\3\2\2\2\u011a\u0116\3\2\2\2\u011b:\3\2"+
		"\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0127\7g\2\2\u0121\u0122\7H\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0127\7g\2\2\u0126\u011c\3\2\2"+
		"\2\u0126\u0121\3\2\2\2\u0127<\3\2\2\2\u0128\u0129\7-\2\2\u0129\u012a\7"+
		"-\2\2\u012a>\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012d@\3\2"+
		"\2\2\u012e\u012f\7-\2\2\u012fB\3\2\2\2\u0130\u0131\7/\2\2\u0131D\3\2\2"+
		"\2\u0132\u0133\7,\2\2\u0133\u0134\7,\2\2\u0134F\3\2\2\2\u0135\u0136\7"+
		",\2\2\u0136H\3\2\2\2\u0137\u0138\7\61\2\2\u0138J\3\2\2\2\u0139\u013a\7"+
		"\61\2\2\u013a\u013b\7a\2\2\u013bL\3\2\2\2\u013c\u013d\7\'\2\2\u013dN\3"+
		"\2\2\2\u013e\u013f\7@\2\2\u013fP\3\2\2\2\u0140\u0141\7@\2\2\u0141\u0142"+
		"\7?\2\2\u0142R\3\2\2\2\u0143\u0144\7>\2\2\u0144T\3\2\2\2\u0145\u0146\7"+
		">\2\2\u0146\u0147\7?\2\2\u0147V\3\2\2\2\u0148\u0149\7?\2\2\u0149\u014a"+
		"\7?\2\2\u014aX\3\2\2\2\u014b\u014c\7#\2\2\u014c\u014d\7?\2\2\u014dZ\3"+
		"\2\2\2\u014e\u014f\7*\2\2\u014f\\\3\2\2\2\u0150\u0151\7+\2\2\u0151^\3"+
		"\2\2\2\u0152\u0153\7t\2\2\u0153\u0154\7g\2\2\u0154\u0155\7v\2\2\u0155"+
		"\u0156\7w\2\2\u0156\u0157\7t\2\2\u0157\u0158\7p\2\2\u0158`\3\2\2\2\u0159"+
		"\u015a\7d\2\2\u015a\u015b\7t\2\2\u015b\u015c\7g\2\2\u015c\u015d\7c\2\2"+
		"\u015d\u015e\7m\2\2\u015eb\3\2\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u016a\3\2\2\2\u0164\u0166\7\60\2\2\u0165\u0167\t\3\2\2\u0166\u0165\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u016b\3\2\2\2\u016bd\3\2\2\2"+
		"\u016c\u0170\t\4\2\2\u016d\u016f\t\5\2\2\u016e\u016d\3\2\2\2\u016f\u0172"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171f\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\7}\2\2\u0174h\3\2\2\2\u0175\u0176\7\177\2\2"+
		"\u0176j\3\2\2\2\u0177\u0179\t\6\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\b\66\2\2\u017dl\3\2\2\2\u017e\u017f\7=\2\2\u017fn\3\2\2\2\u0180"+
		"\u0181\7\f\2\2\u0181p\3\2\2\2\22\2\u00d6\u00d8\u00e0\u00e2\u00e6\u00ee"+
		"\u00fc\u0105\u011a\u0126\u0162\u0168\u016a\u0170\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}