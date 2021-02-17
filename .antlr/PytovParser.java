// Generated from c:\Users\yuvro\OneDrive\Desktop\Pytov\Pytov.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PytovParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_allCode = 1, RULE_seperators = 2, RULE_exp = 3, RULE_atom = 4, 
		RULE_importp = 5, RULE_listr = 6, RULE_incDec = 7, RULE_beforeIncDec = 8, 
		RULE_inc = 9, RULE_dec = 10, RULE_opCpBn = 11, RULE_notl = 12, RULE_identifier = 13, 
		RULE_decimal = 14, RULE_string = 15, RULE_comparator = 16, RULE_binary = 17, 
		RULE_operator = 18, RULE_index = 19, RULE_indexOverwrite = 20, RULE_boolTF = 21, 
		RULE_ifStatement = 22, RULE_breakp = 23, RULE_switchCase = 24, RULE_switchDefault = 25, 
		RULE_switchStatement = 26, RULE_identifierList = 27, RULE_declaration = 28, 
		RULE_declarationList = 29, RULE_variableDeclaration = 30, RULE_expList = 31, 
		RULE_parameterList = 32, RULE_parameterInputList = 33, RULE_whileStatement = 34, 
		RULE_forStatement = 35, RULE_nonPythonForStatement = 36, RULE_funcDeclaration = 37, 
		RULE_funcCall = 38, RULE_returnp = 39, RULE_statement = 40, RULE_block = 41, 
		RULE_openCurly = 42, RULE_closeCurly = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "allCode", "seperators", "exp", "atom", "importp", "listr", 
			"incDec", "beforeIncDec", "inc", "dec", "opCpBn", "notl", "identifier", 
			"decimal", "string", "comparator", "binary", "operator", "index", "indexOverwrite", 
			"boolTF", "ifStatement", "breakp", "switchCase", "switchDefault", "switchStatement", 
			"identifierList", "declaration", "declarationList", "variableDeclaration", 
			"expList", "parameterList", "parameterInputList", "whileStatement", "forStatement", 
			"nonPythonForStatement", "funcDeclaration", "funcCall", "returnp", "statement", 
			"block", "openCurly", "closeCurly"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'['", "']'", "'='", "'if'", "'elif'", "'else if'", 
			"'else'", "'case'", "':'", "'default:'", "'switch'", "','", "'global'", 
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

	@Override
	public String getGrammarFileName() { return "Pytov.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PytovParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PytovParser.EOF, 0); }
		public List<AllCodeContext> allCode() {
			return getRuleContexts(AllCodeContext.class);
		}
		public AllCodeContext allCode(int i) {
			return getRuleContext(AllCodeContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				allCode();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0) );
			setState(93);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllCodeContext extends ParserRuleContext {
		public SeperatorsContext seperators() {
			return getRuleContext(SeperatorsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AllCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allCode; }
	}

	public final AllCodeContext allCode() throws RecognitionException {
		AllCodeContext _localctx = new AllCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_allCode);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				seperators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeperatorsContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(PytovParser.NEW_LINE, 0); }
		public TerminalNode SEMI_COLON() { return getToken(PytovParser.SEMI_COLON, 0); }
		public SeperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seperators; }
	}

	public final SeperatorsContext seperators() throws RecognitionException {
		SeperatorsContext _localctx = new SeperatorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==SEMI_COLON || _la==NEW_LINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BeforeIncDecExpressionContext extends ExpContext {
		public BeforeIncDecContext beforeIncDec() {
			return getRuleContext(BeforeIncDecContext.class,0);
		}
		public BeforeIncDecExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExpressionContext extends ExpContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class OpCpBnExpressionContext extends ExpContext {
		public ExpContext left;
		public OpCpBnContext op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpCpBnContext opCpBn() {
			return getRuleContext(OpCpBnContext.class,0);
		}
		public OpCpBnExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpContext {
		public NotlContext notl() {
			return getRuleContext(NotlContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExpressionContext extends ExpContext {
		public TerminalNode LPAREN() { return getToken(PytovParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PytovParser.RPAREN, 0); }
		public ParenExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class IndexExpressionContext extends ExpContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallExpressionContext extends ExpContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class IncDecExpressionContext extends ExpContext {
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public IncDecExpressionContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				match(LPAREN);
				setState(105);
				exp(0);
				setState(106);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				notl();
				setState(109);
				exp(6);
				}
				break;
			case 3:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				index();
				}
				break;
			case 4:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				atom();
				}
				break;
			case 5:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				funcCall();
				}
				break;
			case 6:
				{
				_localctx = new IncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				incDec();
				}
				break;
			case 7:
				{
				_localctx = new BeforeIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				beforeIncDec();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpCpBnExpressionContext(new ExpContext(_parentctx, _parentState));
					((OpCpBnExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(118);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(119);
					((OpCpBnExpressionContext)_localctx).op = opCpBn();
					setState(120);
					((OpCpBnExpressionContext)_localctx).right = exp(8);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public BoolTFContext boolTF() {
			return getRuleContext(BoolTFContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ListrContext listr() {
			return getRuleContext(ListrContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				boolTF();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				string();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				decimal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				identifier();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				listr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportpContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ImportpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importp; }
	}

	public final ImportpContext importp() throws RecognitionException {
		ImportpContext _localctx = new ImportpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(135);
				identifier();
				}
				break;
			case STRING:
				{
				setState(136);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListrContext extends ParserRuleContext {
		public ParameterInputListContext parameterInputList() {
			return getRuleContext(ParameterInputListContext.class,0);
		}
		public ListrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listr; }
	}

	public final ListrContext listr() throws RecognitionException {
		ListrContext _localctx = new ListrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__1);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(140);
				parameterInputList(0);
				}
			}

			setState(143);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			identifier();
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(146);
				inc();
				}
				break;
			case DEC:
				{
				setState(147);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeforeIncDecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public BeforeIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforeIncDec; }
	}

	public final BeforeIncDecContext beforeIncDec() throws RecognitionException {
		BeforeIncDecContext _localctx = new BeforeIncDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_beforeIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(150);
				inc();
				}
				break;
			case DEC:
				{
				setState(151);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(PytovParser.INC, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(PytovParser.DEC, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpCpBnContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public OpCpBnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opCpBn; }
	}

	public final OpCpBnContext opCpBn() throws RecognitionException {
		OpCpBnContext _localctx = new OpCpBnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opCpBn);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUBTRACT:
			case POWER:
			case MULT:
			case DIVIDE:
			case FLOOR_DIVISION:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				operator();
				}
				break;
			case GT:
			case GE:
			case LT:
			case LE:
			case EQ:
			case NOT_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				comparator();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				binary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotlContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PytovParser.NOT, 0); }
		public NotlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notl; }
	}

	public final NotlContext notl() throws RecognitionException {
		NotlContext _localctx = new NotlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_notl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PytovParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(PytovParser.DECIMAL, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PytovParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(PytovParser.GT, 0); }
		public TerminalNode GE() { return getToken(PytovParser.GE, 0); }
		public TerminalNode LT() { return getToken(PytovParser.LT, 0); }
		public TerminalNode LE() { return getToken(PytovParser.LE, 0); }
		public TerminalNode EQ() { return getToken(PytovParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(PytovParser.NOT_EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NOT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PytovParser.AND, 0); }
		public TerminalNode OR() { return getToken(PytovParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PytovParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(PytovParser.SUBTRACT, 0); }
		public TerminalNode POWER() { return getToken(PytovParser.POWER, 0); }
		public TerminalNode MULT() { return getToken(PytovParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(PytovParser.DIVIDE, 0); }
		public TerminalNode FLOOR_DIVISION() { return getToken(PytovParser.FLOOR_DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(PytovParser.MODULO, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << POWER) | (1L << MULT) | (1L << DIVIDE) | (1L << FLOOR_DIVISION) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			identifier();
			setState(180);
			match(T__1);
			setState(181);
			exp(0);
			setState(182);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOverwriteContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IndexOverwriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOverwrite; }
	}

	public final IndexOverwriteContext indexOverwrite() throws RecognitionException {
		IndexOverwriteContext _localctx = new IndexOverwriteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_indexOverwrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			index();
			setState(185);
			match(T__3);
			setState(186);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolTFContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PytovParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PytovParser.FALSE, 0); }
		public BoolTFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolTF; }
	}

	public final BoolTFContext boolTF() throws RecognitionException {
		BoolTFContext _localctx = new BoolTFContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolTF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<SeperatorsContext> seperators() {
			return getRuleContexts(SeperatorsContext.class);
		}
		public SeperatorsContext seperators(int i) {
			return getRuleContext(SeperatorsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			match(T__4);
			setState(191);
			exp(0);
			setState(192);
			block();
			}
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI_COLON || _la==NEW_LINE) {
						{
						{
						setState(194);
						seperators();
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(200);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					exp(0);
					setState(202);
					block();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==NEW_LINE) {
					{
					{
					setState(209);
					seperators();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(T__7);
				setState(216);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakpContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PytovParser.BREAK, 0); }
		public BreakpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakp; }
	}

	public final BreakpContext breakp() throws RecognitionException {
		BreakpContext _localctx = new BreakpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_breakp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<SeperatorsContext> seperators() {
			return getRuleContexts(SeperatorsContext.class);
		}
		public SeperatorsContext seperators(int i) {
			return getRuleContext(SeperatorsContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchCase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__8);
			setState(222);
			exp(0);
			setState(223);
			match(T__9);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					seperators();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultContext extends ParserRuleContext {
		public List<SeperatorsContext> seperators() {
			return getRuleContexts(SeperatorsContext.class);
		}
		public SeperatorsContext seperators(int i) {
			return getRuleContext(SeperatorsContext.class,i);
		}
		public SwitchDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefault; }
	}

	public final SwitchDefaultContext switchDefault() throws RecognitionException {
		SwitchDefaultContext _localctx = new SwitchDefaultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchDefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__10);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					seperators();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpenCurlyContext openCurly() {
			return getRuleContext(OpenCurlyContext.class,0);
		}
		public CloseCurlyContext closeCurly() {
			return getRuleContext(CloseCurlyContext.class,0);
		}
		public List<AllCodeContext> allCode() {
			return getRuleContexts(AllCodeContext.class);
		}
		public AllCodeContext allCode(int i) {
			return getRuleContext(AllCodeContext.class,i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public List<SwitchDefaultContext> switchDefault() {
			return getRuleContexts(SwitchDefaultContext.class);
		}
		public SwitchDefaultContext switchDefault(int i) {
			return getRuleContext(SwitchDefaultContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__11);
			setState(238);
			exp(0);
			setState(239);
			openCurly();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0)) {
				{
				{
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(240);
					switchCase();
					}
					break;
				case 2:
					{
					setState(241);
					switchDefault();
					}
					break;
				}
				setState(244);
				allCode();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			closeCurly();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			identifier();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(T__12);
					setState(254);
					identifier();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(260);
				match(T__12);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				variableDeclaration();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				funcDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			variableDeclaration();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					match(T__12);
					setState(269);
					variableDeclaration();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(275);
				match(T__12);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(278);
				match(T__13);
				}
			}

			setState(281);
			identifier();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << POWER) | (1L << MULT) | (1L << DIVIDE) | (1L << FLOOR_DIVISION) | (1L << MODULO))) != 0)) {
				{
				setState(282);
				operator();
				}
			}

			setState(285);
			match(T__3);
			setState(286);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpListContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			exp(0);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(T__12);
					setState(290);
					exp(0);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(296);
				match(T__12);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(300);
				identifierList();
				}
				break;
			case 2:
				{
				setState(301);
				declarationList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(304);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(305);
					match(T__12);
					setState(306);
					parameterList(4);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterInputListContext extends ParserRuleContext {
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public List<ParameterInputListContext> parameterInputList() {
			return getRuleContexts(ParameterInputListContext.class);
		}
		public ParameterInputListContext parameterInputList(int i) {
			return getRuleContext(ParameterInputListContext.class,i);
		}
		public ParameterInputListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterInputList; }
	}

	public final ParameterInputListContext parameterInputList() throws RecognitionException {
		return parameterInputList(0);
	}

	private ParameterInputListContext parameterInputList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterInputListContext _localctx = new ParameterInputListContext(_ctx, _parentState);
		ParameterInputListContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_parameterInputList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(313);
				expList();
				}
				break;
			case 2:
				{
				setState(314);
				declarationList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterInputListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterInputList);
					setState(317);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(318);
					match(T__12);
					setState(319);
					parameterInputList(4);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__14);
			setState(326);
			exp(0);
			setState(327);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__15);
			setState(330);
			exp(0);
			setState(331);
			match(T__16);
			setState(332);
			exp(0);
			setState(333);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonPythonForStatementContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(PytovParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(PytovParser.SEMI_COLON, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PytovParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PytovParser.RPAREN, 0); }
		public NonPythonForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonPythonForStatement; }
	}

	public final NonPythonForStatementContext nonPythonForStatement() throws RecognitionException {
		NonPythonForStatementContext _localctx = new NonPythonForStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nonPythonForStatement);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(335);
				match(T__15);
				setState(336);
				variableDeclaration();
				setState(337);
				match(SEMI_COLON);
				setState(338);
				exp(0);
				setState(339);
				match(SEMI_COLON);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(340);
					exp(0);
					}
					break;
				case 2:
					{
					setState(341);
					variableDeclaration();
					}
					break;
				}
				setState(344);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(346);
				match(T__15);
				setState(347);
				match(LPAREN);
				setState(348);
				variableDeclaration();
				setState(349);
				match(SEMI_COLON);
				setState(350);
				exp(0);
				setState(351);
				match(SEMI_COLON);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(352);
					exp(0);
					}
					break;
				case 2:
					{
					setState(353);
					variableDeclaration();
					}
					break;
				}
				setState(356);
				match(RPAREN);
				setState(357);
				block();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PytovParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PytovParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
			identifier();
			setState(363);
			match(LPAREN);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==IDENTIFIER) {
				{
				setState(364);
				parameterList(0);
				}
			}

			setState(367);
			match(RPAREN);
			setState(368);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PytovParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PytovParser.RPAREN, 0); }
		public ParameterInputListContext parameterInputList() {
			return getRuleContext(ParameterInputListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			identifier();
			setState(371);
			match(LPAREN);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(372);
				parameterInputList(0);
				}
			}

			setState(375);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PytovParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnp; }
	}

	public final ReturnpContext returnp() throws RecognitionException {
		ReturnpContext _localctx = new ReturnpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(RETURN);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(378);
				exp(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public SwitchDefaultContext switchDefault() {
			return getRuleContext(SwitchDefaultContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public NonPythonForStatementContext nonPythonForStatement() {
			return getRuleContext(NonPythonForStatementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnpContext returnp() {
			return getRuleContext(ReturnpContext.class,0);
		}
		public BreakpContext breakp() {
			return getRuleContext(BreakpContext.class,0);
		}
		public ImportpContext importp() {
			return getRuleContext(ImportpContext.class,0);
		}
		public IndexOverwriteContext indexOverwrite() {
			return getRuleContext(IndexOverwriteContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				switchCase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				switchDefault();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				nonPythonForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(388);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(389);
				returnp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(390);
				breakp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(391);
				importp();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(392);
				indexOverwrite();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public OpenCurlyContext openCurly() {
			return getRuleContext(OpenCurlyContext.class,0);
		}
		public CloseCurlyContext closeCurly() {
			return getRuleContext(CloseCurlyContext.class,0);
		}
		public List<SeperatorsContext> seperators() {
			return getRuleContexts(SeperatorsContext.class);
		}
		public SeperatorsContext seperators(int i) {
			return getRuleContext(SeperatorsContext.class,i);
		}
		public List<AllCodeContext> allCode() {
			return getRuleContexts(AllCodeContext.class);
		}
		public AllCodeContext allCode(int i) {
			return getRuleContext(AllCodeContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON || _la==NEW_LINE) {
				{
				{
				setState(395);
				seperators();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			openCurly();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0)) {
				{
				{
				setState(402);
				allCode();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			closeCurly();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenCurlyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(PytovParser.OPEN_CURLY, 0); }
		public OpenCurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCurly; }
	}

	public final OpenCurlyContext openCurly() throws RecognitionException {
		OpenCurlyContext _localctx = new OpenCurlyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_openCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(OPEN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseCurlyContext extends ParserRuleContext {
		public TerminalNode CLOSE_CURLY() { return getToken(PytovParser.CLOSE_CURLY, 0); }
		public CloseCurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCurly; }
	}

	public final CloseCurlyContext closeCurly() throws RecognitionException {
		CloseCurlyContext _localctx = new CloseCurlyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_closeCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 32:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 33:
			return parameterInputList_sempred((ParameterInputListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean parameterInputList_sempred(ParameterInputListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2\\\n\2\r\2\16\2]\3\2\3\2\3\3\3\3\3\3\3\3\5\3f\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3"+
		"\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u0087"+
		"\n\6\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\5\b\u0090\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\t\u0097\n\t\3\n\3\n\5\n\u009b\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00c6\n\30\f\30\16\30\u00c9\13\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\30\7\30"+
		"\u00d5\n\30\f\30\16\30\u00d8\13\30\3\30\3\30\5\30\u00dc\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13\32\3\33\3\33"+
		"\7\33\u00eb\n\33\f\33\16\33\u00ee\13\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00f5\n\34\3\34\7\34\u00f8\n\34\f\34\16\34\u00fb\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u0102\n\35\f\35\16\35\u0105\13\35\3\35\5\35\u0108\n\35"+
		"\3\36\3\36\5\36\u010c\n\36\3\37\3\37\3\37\7\37\u0111\n\37\f\37\16\37\u0114"+
		"\13\37\3\37\5\37\u0117\n\37\3 \5 \u011a\n \3 \3 \5 \u011e\n \3 \3 \3 "+
		"\3!\3!\3!\7!\u0126\n!\f!\16!\u0129\13!\3!\5!\u012c\n!\3\"\3\"\3\"\5\""+
		"\u0131\n\"\3\"\3\"\3\"\7\"\u0136\n\"\f\"\16\"\u0139\13\"\3#\3#\3#\5#\u013e"+
		"\n#\3#\3#\3#\7#\u0143\n#\f#\16#\u0146\13#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\5&\u0159\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0165"+
		"\n&\3&\3&\3&\5&\u016a\n&\3\'\3\'\3\'\3\'\5\'\u0170\n\'\3\'\3\'\3\'\3("+
		"\3(\3(\5(\u0178\n(\3(\3(\3)\3)\5)\u017e\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u018c\n*\3+\7+\u018f\n+\f+\16+\u0192\13+\3+\3+\7+\u0196\n"+
		"+\f+\16+\u0199\13+\3+\3+\3,\3,\3-\3-\3-\2\5\bBD.\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\t\3\289\3\2"+
		").\3\2\33\34\3\2\"(\3\2\36\37\3\2\b\t\3\2\24\26\2\u01b2\2[\3\2\2\2\4e"+
		"\3\2\2\2\6g\3\2\2\2\bv\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u009a\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3"+
		"\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3\2\2\2\34\u00a9\3\2\2\2\36\u00ab\3\2"+
		"\2\2 \u00ad\3\2\2\2\"\u00af\3\2\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00b5"+
		"\3\2\2\2*\u00ba\3\2\2\2,\u00be\3\2\2\2.\u00c0\3\2\2\2\60\u00dd\3\2\2\2"+
		"\62\u00df\3\2\2\2\64\u00e8\3\2\2\2\66\u00ef\3\2\2\28\u00fe\3\2\2\2:\u010b"+
		"\3\2\2\2<\u010d\3\2\2\2>\u0119\3\2\2\2@\u0122\3\2\2\2B\u0130\3\2\2\2D"+
		"\u013d\3\2\2\2F\u0147\3\2\2\2H\u014b\3\2\2\2J\u0169\3\2\2\2L\u016b\3\2"+
		"\2\2N\u0174\3\2\2\2P\u017b\3\2\2\2R\u018b\3\2\2\2T\u0190\3\2\2\2V\u019c"+
		"\3\2\2\2X\u019e\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^_\3\2\2\2_`\7\2\2\3`\3\3\2\2\2af\5\6\4\2bf\5R*\2cf\5:\36\2df\5"+
		"\b\5\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\5\3\2\2\2gh\t\2\2\2h\7"+
		"\3\2\2\2ij\b\5\1\2jk\7/\2\2kl\5\b\5\2lm\7\60\2\2mw\3\2\2\2no\5\32\16\2"+
		"op\5\b\5\bpw\3\2\2\2qw\5(\25\2rw\5\n\6\2sw\5N(\2tw\5\20\t\2uw\5\22\n\2"+
		"vi\3\2\2\2vn\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2"+
		"w~\3\2\2\2xy\f\t\2\2yz\5\30\r\2z{\5\b\5\n{}\3\2\2\2|x\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\t\3\2\2\2\u0080~\3\2\2\2\u0081\u0087"+
		"\5,\27\2\u0082\u0087\5 \21\2\u0083\u0087\5\36\20\2\u0084\u0087\5\34\17"+
		"\2\u0085\u0087\5\16\b\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\13\3\2\2"+
		"\2\u0088\u008b\7\3\2\2\u0089\u008c\5\34\17\2\u008a\u008c\5 \21\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\r\3\2\2\2\u008d\u008f\7\4\2\2"+
		"\u008e\u0090\5D#\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\7\5\2\2\u0092\17\3\2\2\2\u0093\u0096\5\34\17\2\u0094"+
		"\u0097\5\24\13\2\u0095\u0097\5\26\f\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\21\3\2\2\2\u0098\u009b\5\24\13\2\u0099\u009b\5\26\f\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\5\34"+
		"\17\2\u009d\23\3\2\2\2\u009e\u009f\7 \2\2\u009f\25\3\2\2\2\u00a0\u00a1"+
		"\7!\2\2\u00a1\27\3\2\2\2\u00a2\u00a6\5&\24\2\u00a3\u00a6\5\"\22\2\u00a4"+
		"\u00a6\5$\23\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\33\3\2\2\2\u00a9\u00aa"+
		"\7\64\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\63\2\2\u00ac\37\3\2\2\2\u00ad"+
		"\u00ae\7\27\2\2\u00ae!\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\t\4\2\2\u00b2%\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4\'\3\2\2\2\u00b5"+
		"\u00b6\5\34\17\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9\7"+
		"\5\2\2\u00b9)\3\2\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd"+
		"\5\b\5\2\u00bd+\3\2\2\2\u00be\u00bf\t\6\2\2\u00bf-\3\2\2\2\u00c0\u00c1"+
		"\7\7\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\5T+\2\u00c3\u00d0\3\2\2\2\u00c4"+
		"\u00c6\5\6\4\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\t\7\2\2\u00cb\u00cc\5\b\5\2\u00cc\u00cd\5T+\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00c7\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00db\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\5\6\4\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\n\2\2\u00da"+
		"\u00dc\5T+\2\u00db\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc/\3\2\2\2\u00dd"+
		"\u00de\7\62\2\2\u00de\61\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5\b"+
		"\5\2\u00e1\u00e5\7\f\2\2\u00e2\u00e4\5\6\4\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\63\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\7\r\2\2\u00e9\u00eb\5\6\4\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\65\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\16\2\2\u00f0\u00f1\5\b\5"+
		"\2\u00f1\u00f9\5V,\2\u00f2\u00f5\5\62\32\2\u00f3\u00f5\5\64\33\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\5\4\3\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\5X-\2\u00fd\67\3\2\2\2\u00fe\u0103\5\34\17\2\u00ff\u0100"+
		"\7\17\2\2\u0100\u0102\5\34\17\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u01089\3\2\2\2\u0109\u010c\5> \2\u010a\u010c\5L\'\2\u010b\u0109\3\2\2"+
		"\2\u010b\u010a\3\2\2\2\u010c;\3\2\2\2\u010d\u0112\5> \2\u010e\u010f\7"+
		"\17\2\2\u010f\u0111\5> \2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0117\7\17\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"=\3\2\2\2\u0118\u011a\7\20\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u011d\5\34\17\2\u011c\u011e\5&\24\2\u011d\u011c"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\6\2\2\u0120"+
		"\u0121\5\b\5\2\u0121?\3\2\2\2\u0122\u0127\5\b\5\2\u0123\u0124\7\17\2\2"+
		"\u0124\u0126\5\b\5\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012c\7\17\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012cA\3\2\2\2"+
		"\u012d\u012e\b\"\1\2\u012e\u0131\58\35\2\u012f\u0131\5<\37\2\u0130\u012d"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0137\3\2\2\2\u0132\u0133\f\5\2\2\u0133"+
		"\u0134\7\17\2\2\u0134\u0136\5B\"\6\u0135\u0132\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138C\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\b#\1\2\u013b\u013e\5@!\2\u013c\u013e\5<\37\2\u013d"+
		"\u013a\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0144\3\2\2\2\u013f\u0140\f\5"+
		"\2\2\u0140\u0141\7\17\2\2\u0141\u0143\5D#\6\u0142\u013f\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145E\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0147\u0148\7\21\2\2\u0148\u0149\5\b\5\2\u0149\u014a"+
		"\5T+\2\u014aG\3\2\2\2\u014b\u014c\7\22\2\2\u014c\u014d\5\b\5\2\u014d\u014e"+
		"\7\23\2\2\u014e\u014f\5\b\5\2\u014f\u0150\5T+\2\u0150I\3\2\2\2\u0151\u0152"+
		"\7\22\2\2\u0152\u0153\5> \2\u0153\u0154\78\2\2\u0154\u0155\5\b\5\2\u0155"+
		"\u0158\78\2\2\u0156\u0159\5\b\5\2\u0157\u0159\5> \2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5T+\2\u015b\u016a"+
		"\3\2\2\2\u015c\u015d\7\22\2\2\u015d\u015e\7/\2\2\u015e\u015f\5> \2\u015f"+
		"\u0160\78\2\2\u0160\u0161\5\b\5\2\u0161\u0164\78\2\2\u0162\u0165\5\b\5"+
		"\2\u0163\u0165\5> \2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\7\60\2\2\u0167\u0168\5T+\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0151\3\2\2\2\u0169\u015c\3\2\2\2\u016aK\3\2\2\2\u016b\u016c\t\b\2\2"+
		"\u016c\u016d\5\34\17\2\u016d\u016f\7/\2\2\u016e\u0170\5B\"\2\u016f\u016e"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\60\2\2"+
		"\u0172\u0173\5T+\2\u0173M\3\2\2\2\u0174\u0175\5\34\17\2\u0175\u0177\7"+
		"/\2\2\u0176\u0178\5D#\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\7\60\2\2\u017aO\3\2\2\2\u017b\u017d\7\61\2"+
		"\2\u017c\u017e\5\b\5\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017eQ"+
		"\3\2\2\2\u017f\u018c\5.\30\2\u0180\u018c\5\66\34\2\u0181\u018c\5\62\32"+
		"\2\u0182\u018c\5\64\33\2\u0183\u018c\5F$\2\u0184\u018c\5H%\2\u0185\u018c"+
		"\5J&\2\u0186\u018c\5N(\2\u0187\u018c\5P)\2\u0188\u018c\5\60\31\2\u0189"+
		"\u018c\5\f\7\2\u018a\u018c\5*\26\2\u018b\u017f\3\2\2\2\u018b\u0180\3\2"+
		"\2\2\u018b\u0181\3\2\2\2\u018b\u0182\3\2\2\2\u018b\u0183\3\2\2\2\u018b"+
		"\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2"+
		"\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"S\3\2\2\2\u018d\u018f\5\6\4\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0197\5V,\2\u0194\u0196\5\4\3\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\5X-\2\u019bU\3\2\2\2\u019c\u019d"+
		"\7\65\2\2\u019dW\3\2\2\2\u019e\u019f\7\66\2\2\u019fY\3\2\2\2*]ev~\u0086"+
		"\u008b\u008f\u0096\u009a\u00a5\u00c7\u00d0\u00d6\u00db\u00e5\u00ec\u00f4"+
		"\u00f9\u0103\u0107\u010b\u0112\u0116\u0119\u011d\u0127\u012b\u0130\u0137"+
		"\u013d\u0144\u0158\u0164\u0169\u016f\u0177\u017d\u018b\u0190\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}