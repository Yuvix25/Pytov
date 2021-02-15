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
		T__17=18, T__18=19, STRING=20, COMMENT=21, LINE_COMMENT_C=22, LINE_COMMENT_P=23, 
		AND=24, OR=25, NOT=26, TRUE=27, FALSE=28, INC=29, DEC=30, ADD=31, SUBTRACT=32, 
		MULT=33, DIVIDE=34, FLOOR_DIVISION=35, MODULO=36, GT=37, GE=38, LT=39, 
		LE=40, EQ=41, NOT_EQ=42, LPAREN=43, RPAREN=44, RETURN=45, BREAK=46, DECIMAL=47, 
		IDENTIFIER=48, OPEN_CURLY=49, CLOSE_CURLY=50, WS=51, SEMI_COLON=52, NEW_LINE=53;
	public static final int
		RULE_parse = 0, RULE_allCode = 1, RULE_seperators = 2, RULE_exp = 3, RULE_atom = 4, 
		RULE_listr = 5, RULE_incDec = 6, RULE_beforeIncDec = 7, RULE_inc = 8, 
		RULE_dec = 9, RULE_opCpBn = 10, RULE_notl = 11, RULE_identifier = 12, 
		RULE_decimal = 13, RULE_string = 14, RULE_comparator = 15, RULE_binary = 16, 
		RULE_operator = 17, RULE_boolTF = 18, RULE_ifStatement = 19, RULE_breakp = 20, 
		RULE_switchCase = 21, RULE_switchDefault = 22, RULE_switchStatement = 23, 
		RULE_identifierList = 24, RULE_declaration = 25, RULE_declarationList = 26, 
		RULE_variableDeclaration = 27, RULE_expList = 28, RULE_parameterList = 29, 
		RULE_parameterInputList = 30, RULE_whileStatement = 31, RULE_forStatement = 32, 
		RULE_nonPythonForStatement = 33, RULE_funcDeclaration = 34, RULE_funcCall = 35, 
		RULE_returnp = 36, RULE_statement = 37, RULE_block = 38, RULE_openCurly = 39, 
		RULE_closeCurly = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "allCode", "seperators", "exp", "atom", "listr", "incDec", "beforeIncDec", 
			"inc", "dec", "opCpBn", "notl", "identifier", "decimal", "string", "comparator", 
			"binary", "operator", "boolTF", "ifStatement", "breakp", "switchCase", 
			"switchDefault", "switchStatement", "identifierList", "declaration", 
			"declarationList", "variableDeclaration", "expList", "parameterList", 
			"parameterInputList", "whileStatement", "forStatement", "nonPythonForStatement", 
			"funcDeclaration", "funcCall", "returnp", "statement", "block", "openCurly", 
			"closeCurly"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'if'", "'elif'", "'else if'", "'else'", "'case'", 
			"':'", "'default:'", "'switch'", "','", "'global'", "'='", "'while'", 
			"'for'", "'in'", "'func'", "'function'", "'def'", null, null, null, null, 
			"'&&'", "'||'", "'!'", null, null, "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'/_'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'('", 
			"')'", "'return'", "'break'", null, null, "'{'", "'}'", null, "';'", 
			"'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "STRING", "COMMENT", 
			"LINE_COMMENT_C", "LINE_COMMENT_P", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"INC", "DEC", "ADD", "SUBTRACT", "MULT", "DIVIDE", "FLOOR_DIVISION", 
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
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				allCode();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0) );
			setState(87);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				seperators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
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
			setState(95);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(LPAREN);
				setState(99);
				exp(0);
				setState(100);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				notl();
				setState(103);
				exp(5);
				}
				break;
			case 3:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				atom();
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				funcCall();
				}
				break;
			case 5:
				{
				_localctx = new IncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				incDec();
				}
				break;
			case 6:
				{
				_localctx = new BeforeIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				beforeIncDec();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
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
					setState(111);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(112);
					((OpCpBnExpressionContext)_localctx).op = opCpBn();
					setState(113);
					((OpCpBnExpressionContext)_localctx).right = exp(7);
					}
					} 
				}
				setState(119);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				boolTF();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				string();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				decimal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
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
		enterRule(_localctx, 10, RULE_listr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(128);
				parameterInputList(0);
				}
			}

			setState(131);
			match(T__1);
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
		enterRule(_localctx, 12, RULE_incDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			identifier();
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(134);
				inc();
				}
				break;
			case DEC:
				{
				setState(135);
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
		enterRule(_localctx, 14, RULE_beforeIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(138);
				inc();
				}
				break;
			case DEC:
				{
				setState(139);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
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
		enterRule(_localctx, 16, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 18, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 20, RULE_opCpBn);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUBTRACT:
			case MULT:
			case DIVIDE:
			case FLOOR_DIVISION:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
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
				setState(149);
				comparator();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
		enterRule(_localctx, 22, RULE_notl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 26, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		enterRule(_localctx, 30, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 32, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 34, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULT) | (1L << DIVIDE) | (1L << FLOOR_DIVISION) | (1L << MODULO))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_boolTF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			match(T__2);
			setState(170);
			exp(0);
			setState(171);
			block();
			}
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI_COLON || _la==NEW_LINE) {
						{
						{
						setState(173);
						seperators();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__4) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(180);
					exp(0);
					setState(181);
					block();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==NEW_LINE) {
					{
					{
					setState(188);
					seperators();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__5);
				setState(195);
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
		enterRule(_localctx, 40, RULE_breakp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 42, RULE_switchCase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__6);
			setState(201);
			exp(0);
			setState(202);
			match(T__7);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					seperators();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 44, RULE_switchDefault);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__8);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					seperators();
					}
					} 
				}
				setState(215);
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
		enterRule(_localctx, 46, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__9);
			setState(217);
			exp(0);
			setState(218);
			openCurly();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0)) {
				{
				{
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(219);
					switchCase();
					}
					break;
				case 2:
					{
					setState(220);
					switchDefault();
					}
					break;
				}
				setState(223);
				allCode();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
		enterRule(_localctx, 48, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			identifier();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(T__10);
					setState(233);
					identifier();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(239);
				match(T__10);
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
		enterRule(_localctx, 50, RULE_declaration);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				variableDeclaration();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
		enterRule(_localctx, 52, RULE_declarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			variableDeclaration();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(T__10);
					setState(248);
					variableDeclaration();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(254);
				match(T__10);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(257);
				match(T__11);
				}
			}

			setState(260);
			identifier();
			setState(261);
			match(T__12);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(262);
				exp(0);
				}
				break;
			case 2:
				{
				setState(263);
				funcCall();
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
		enterRule(_localctx, 56, RULE_expList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			exp(0);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(T__10);
					setState(268);
					exp(0);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(274);
				match(T__10);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(278);
				identifierList();
				}
				break;
			case 2:
				{
				setState(279);
				declarationList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(282);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(283);
					match(T__10);
					setState(284);
					parameterList(4);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_parameterInputList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(291);
				expList();
				}
				break;
			case 2:
				{
				setState(292);
				declarationList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterInputListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterInputList);
					setState(295);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(296);
					match(T__10);
					setState(297);
					parameterInputList(4);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__13);
			setState(304);
			exp(0);
			setState(305);
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
		enterRule(_localctx, 64, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__14);
			setState(308);
			exp(0);
			setState(309);
			match(T__15);
			setState(310);
			exp(0);
			setState(311);
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
		enterRule(_localctx, 66, RULE_nonPythonForStatement);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(313);
				match(T__14);
				setState(314);
				variableDeclaration();
				setState(315);
				match(SEMI_COLON);
				setState(316);
				exp(0);
				setState(317);
				match(SEMI_COLON);
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(318);
					exp(0);
					}
					break;
				case 2:
					{
					setState(319);
					variableDeclaration();
					}
					break;
				}
				setState(322);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(324);
				match(T__14);
				setState(325);
				match(LPAREN);
				setState(326);
				variableDeclaration();
				setState(327);
				match(SEMI_COLON);
				setState(328);
				exp(0);
				setState(329);
				match(SEMI_COLON);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(330);
					exp(0);
					}
					break;
				case 2:
					{
					setState(331);
					variableDeclaration();
					}
					break;
				}
				setState(334);
				match(RPAREN);
				setState(335);
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
		enterRule(_localctx, 68, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			identifier();
			setState(341);
			match(LPAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==IDENTIFIER) {
				{
				setState(342);
				parameterList(0);
				}
			}

			setState(345);
			match(RPAREN);
			setState(346);
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
		enterRule(_localctx, 70, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			identifier();
			setState(349);
			match(LPAREN);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << DECIMAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(350);
				parameterInputList(0);
				}
			}

			setState(353);
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
		enterRule(_localctx, 72, RULE_returnp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(RETURN);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(356);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				switchCase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				switchDefault();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				nonPythonForStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(367);
				returnp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(368);
				breakp();
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
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON || _la==NEW_LINE) {
				{
				{
				setState(371);
				seperators();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			openCurly();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INC) | (1L << DEC) | (1L << LPAREN) | (1L << RETURN) | (1L << BREAK) | (1L << DECIMAL) | (1L << IDENTIFIER) | (1L << SEMI_COLON) | (1L << NEW_LINE))) != 0)) {
				{
				{
				setState(378);
				allCode();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
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
		enterRule(_localctx, 78, RULE_openCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 80, RULE_closeCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		case 29:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 30:
			return parameterInputList_sempred((ParameterInputListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0189\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\6\2"+
		"V\n\2\r\2\16\2W\3\2\3\2\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3\5\3\5\7\5v\n\5\f"+
		"\5\16\5y\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\5\7\u0084\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\5\t\u008f\n\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25\3\25\3\25\3\25\7\25\u00ba"+
		"\n\25\f\25\16\25\u00bd\13\25\3\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13"+
		"\25\3\25\3\25\5\25\u00c7\n\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00cf"+
		"\n\27\f\27\16\27\u00d2\13\27\3\30\3\30\7\30\u00d6\n\30\f\30\16\30\u00d9"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\5\31\u00e0\n\31\3\31\7\31\u00e3\n\31\f"+
		"\31\16\31\u00e6\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u00ed\n\32\f\32\16"+
		"\32\u00f0\13\32\3\32\5\32\u00f3\n\32\3\33\3\33\5\33\u00f7\n\33\3\34\3"+
		"\34\3\34\7\34\u00fc\n\34\f\34\16\34\u00ff\13\34\3\34\5\34\u0102\n\34\3"+
		"\35\5\35\u0105\n\35\3\35\3\35\3\35\3\35\5\35\u010b\n\35\3\36\3\36\3\36"+
		"\7\36\u0110\n\36\f\36\16\36\u0113\13\36\3\36\5\36\u0116\n\36\3\37\3\37"+
		"\3\37\5\37\u011b\n\37\3\37\3\37\3\37\7\37\u0120\n\37\f\37\16\37\u0123"+
		"\13\37\3 \3 \3 \5 \u0128\n \3 \3 \3 \7 \u012d\n \f \16 \u0130\13 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0143\n#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u014f\n#\3#\3#\3#\5#\u0154\n#\3$\3$\3$\3"+
		"$\5$\u015a\n$\3$\3$\3$\3%\3%\3%\5%\u0162\n%\3%\3%\3&\3&\5&\u0168\n&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0174\n\'\3(\7(\u0177\n(\f"+
		"(\16(\u017a\13(\3(\3(\7(\u017e\n(\f(\16(\u0181\13(\3(\3(\3)\3)\3*\3*\3"+
		"*\2\5\b<>+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPR\2\t\3\2\66\67\3\2\',\3\2\32\33\3\2!&\3\2\35\36\3\2\6\7"+
		"\3\2\23\25\2\u0199\2U\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bo\3\2\2\2\n\177\3"+
		"\2\2\2\f\u0081\3\2\2\2\16\u0087\3\2\2\2\20\u008e\3\2\2\2\22\u0092\3\2"+
		"\2\2\24\u0094\3\2\2\2\26\u0099\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3\2\2"+
		"\2\34\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2\2\2\"\u00a5\3\2\2\2$\u00a7"+
		"\3\2\2\2&\u00a9\3\2\2\2(\u00ab\3\2\2\2*\u00c8\3\2\2\2,\u00ca\3\2\2\2."+
		"\u00d3\3\2\2\2\60\u00da\3\2\2\2\62\u00e9\3\2\2\2\64\u00f6\3\2\2\2\66\u00f8"+
		"\3\2\2\28\u0104\3\2\2\2:\u010c\3\2\2\2<\u011a\3\2\2\2>\u0127\3\2\2\2@"+
		"\u0131\3\2\2\2B\u0135\3\2\2\2D\u0153\3\2\2\2F\u0155\3\2\2\2H\u015e\3\2"+
		"\2\2J\u0165\3\2\2\2L\u0173\3\2\2\2N\u0178\3\2\2\2P\u0184\3\2\2\2R\u0186"+
		"\3\2\2\2TV\5\4\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y"+
		"Z\7\2\2\3Z\3\3\2\2\2[`\5\6\4\2\\`\5L\'\2]`\5\64\33\2^`\5\b\5\2_[\3\2\2"+
		"\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\t\2\2\2b\7\3\2\2\2cd\b"+
		"\5\1\2de\7-\2\2ef\5\b\5\2fg\7.\2\2gp\3\2\2\2hi\5\30\r\2ij\5\b\5\7jp\3"+
		"\2\2\2kp\5\n\6\2lp\5H%\2mp\5\16\b\2np\5\20\t\2oc\3\2\2\2oh\3\2\2\2ok\3"+
		"\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pw\3\2\2\2qr\f\b\2\2rs\5\26\f\2st"+
		"\5\b\5\ttv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2"+
		"yw\3\2\2\2z\u0080\5&\24\2{\u0080\5\36\20\2|\u0080\5\34\17\2}\u0080\5\32"+
		"\16\2~\u0080\5\f\7\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2"+
		"\2\177~\3\2\2\2\u0080\13\3\2\2\2\u0081\u0083\7\3\2\2\u0082\u0084\5> \2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\7\4\2\2\u0086\r\3\2\2\2\u0087\u008a\5\32\16\2\u0088\u008b\5\22\n\2\u0089"+
		"\u008b\5\24\13\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\17\3\2"+
		"\2\2\u008c\u008f\5\22\n\2\u008d\u008f\5\24\13\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\32\16\2\u0091\21\3\2"+
		"\2\2\u0092\u0093\7\37\2\2\u0093\23\3\2\2\2\u0094\u0095\7 \2\2\u0095\25"+
		"\3\2\2\2\u0096\u009a\5$\23\2\u0097\u009a\5 \21\2\u0098\u009a\5\"\22\2"+
		"\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\27"+
		"\3\2\2\2\u009b\u009c\7\34\2\2\u009c\31\3\2\2\2\u009d\u009e\7\62\2\2\u009e"+
		"\33\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\26\2\2"+
		"\u00a2\37\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4!\3\2\2\2\u00a5\u00a6\t\4\2"+
		"\2\u00a6#\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8%\3\2\2\2\u00a9\u00aa\t\6\2"+
		"\2\u00aa\'\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae"+
		"\5N(\2\u00ae\u00bb\3\2\2\2\u00af\u00b1\5\6\4\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\t\7\2\2\u00b6\u00b7\5\b\5\2\u00b7"+
		"\u00b8\5N(\2\u00b8\u00ba\3\2\2\2\u00b9\u00b2\3\2\2\2\u00ba\u00bd\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c6\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c7\5N(\2\u00c6\u00c1\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7)\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c9+\3\2\2\2\u00ca\u00cb"+
		"\7\t\2\2\u00cb\u00cc\5\b\5\2\u00cc\u00d0\7\n\2\2\u00cd\u00cf\5\6\4\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1-\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\7\13\2\2\u00d4\u00d6"+
		"\5\6\4\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8/\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f\2\2"+
		"\u00db\u00dc\5\b\5\2\u00dc\u00e4\5P)\2\u00dd\u00e0\5,\27\2\u00de\u00e0"+
		"\5.\30\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\5\4\3\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\5R*\2\u00e8\61\3\2\2\2\u00e9\u00ee\5\32\16"+
		"\2\u00ea\u00eb\7\r\2\2\u00eb\u00ed\5\32\16\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\7\r\2\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\63\3\2\2\2\u00f4\u00f7\58\35\2\u00f5\u00f7\5F$\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\65\3\2\2\2\u00f8\u00fd"+
		"\58\35\2\u00f9\u00fa\7\r\2\2\u00fa\u00fc\58\35\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\r\2\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\67\3\2\2\2\u0103\u0105\7\16\2\2\u0104\u0103\3\2\2"+
		"\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\32\16\2\u0107"+
		"\u010a\7\17\2\2\u0108\u010b\5\b\5\2\u0109\u010b\5H%\2\u010a\u0108\3\2"+
		"\2\2\u010a\u0109\3\2\2\2\u010b9\3\2\2\2\u010c\u0111\5\b\5\2\u010d\u010e"+
		"\7\r\2\2\u010e\u0110\5\b\5\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\7\r\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		";\3\2\2\2\u0117\u0118\b\37\1\2\u0118\u011b\5\62\32\2\u0119\u011b\5\66"+
		"\34\2\u011a\u0117\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0121\3\2\2\2\u011c"+
		"\u011d\f\5\2\2\u011d\u011e\7\r\2\2\u011e\u0120\5<\37\6\u011f\u011c\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"=\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b \1\2\u0125\u0128\5:\36\2\u0126"+
		"\u0128\5\66\34\2\u0127\u0124\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012e\3"+
		"\2\2\2\u0129\u012a\f\5\2\2\u012a\u012b\7\r\2\2\u012b\u012d\5> \6\u012c"+
		"\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f?\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\20\2\2\u0132\u0133"+
		"\5\b\5\2\u0133\u0134\5N(\2\u0134A\3\2\2\2\u0135\u0136\7\21\2\2\u0136\u0137"+
		"\5\b\5\2\u0137\u0138\7\22\2\2\u0138\u0139\5\b\5\2\u0139\u013a\5N(\2\u013a"+
		"C\3\2\2\2\u013b\u013c\7\21\2\2\u013c\u013d\58\35\2\u013d\u013e\7\66\2"+
		"\2\u013e\u013f\5\b\5\2\u013f\u0142\7\66\2\2\u0140\u0143\5\b\5\2\u0141"+
		"\u0143\58\35\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\5N(\2\u0145\u0154\3\2\2\2\u0146\u0147\7\21\2\2\u0147"+
		"\u0148\7-\2\2\u0148\u0149\58\35\2\u0149\u014a\7\66\2\2\u014a\u014b\5\b"+
		"\5\2\u014b\u014e\7\66\2\2\u014c\u014f\5\b\5\2\u014d\u014f\58\35\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7."+
		"\2\2\u0151\u0152\5N(\2\u0152\u0154\3\2\2\2\u0153\u013b\3\2\2\2\u0153\u0146"+
		"\3\2\2\2\u0154E\3\2\2\2\u0155\u0156\t\b\2\2\u0156\u0157\5\32\16\2\u0157"+
		"\u0159\7-\2\2\u0158\u015a\5<\37\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7.\2\2\u015c\u015d\5N(\2\u015dG\3"+
		"\2\2\2\u015e\u015f\5\32\16\2\u015f\u0161\7-\2\2\u0160\u0162\5> \2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7."+
		"\2\2\u0164I\3\2\2\2\u0165\u0167\7/\2\2\u0166\u0168\5\b\5\2\u0167\u0166"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168K\3\2\2\2\u0169\u0174\5(\25\2\u016a"+
		"\u0174\5\60\31\2\u016b\u0174\5,\27\2\u016c\u0174\5.\30\2\u016d\u0174\5"+
		"@!\2\u016e\u0174\5B\"\2\u016f\u0174\5D#\2\u0170\u0174\5H%\2\u0171\u0174"+
		"\5J&\2\u0172\u0174\5*\26\2\u0173\u0169\3\2\2\2\u0173\u016a\3\2\2\2\u0173"+
		"\u016b\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2"+
		"\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174M\3\2\2\2\u0175\u0177\5\6\4\2\u0176\u0175\3\2\2\2"+
		"\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017f\5P)\2\u017c\u017e\5\4\3\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\5R*\2\u0183O"+
		"\3\2\2\2\u0184\u0185\7\63\2\2\u0185Q\3\2\2\2\u0186\u0187\7\64\2\2\u0187"+
		"S\3\2\2\2)W_ow\177\u0083\u008a\u008e\u0099\u00b2\u00bb\u00c1\u00c6\u00d0"+
		"\u00d7\u00df\u00e4\u00ee\u00f2\u00f6\u00fd\u0101\u0104\u010a\u0111\u0115"+
		"\u011a\u0121\u0127\u012e\u0142\u014e\u0153\u0159\u0161\u0167\u0173\u0178"+
		"\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}