// Generated from ExprChanged.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprChangedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_unary = 2, RULE_mulWeak = 3, RULE_addStrong = 4, 
		RULE_powLeft = 5, RULE_primary = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "unary", "mulWeak", "addStrong", "powLeft", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ExprChanged.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprChangedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprChangedParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expr();
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			unary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public Token s;
		public MulWeakContext m;
		public MulWeakContext mulWeak() {
			return getRuleContext(MulWeakContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(19);
				((UnaryContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((UnaryContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(22);
			((UnaryContext)_localctx).m = mulWeak();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulWeakContext extends ParserRuleContext {
		public AddStrongContext a;
		public Token op;
		public AddStrongContext addStrong;
		public List<AddStrongContext> b = new ArrayList<AddStrongContext>();
		public List<AddStrongContext> addStrong() {
			return getRuleContexts(AddStrongContext.class);
		}
		public AddStrongContext addStrong(int i) {
			return getRuleContext(AddStrongContext.class,i);
		}
		public MulWeakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulWeak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterMulWeak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitMulWeak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitMulWeak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulWeakContext mulWeak() throws RecognitionException {
		MulWeakContext _localctx = new MulWeakContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mulWeak);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((MulWeakContext)_localctx).a = addStrong();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(25);
				((MulWeakContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((MulWeakContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(26);
				((MulWeakContext)_localctx).addStrong = addStrong();
				((MulWeakContext)_localctx).b.add(((MulWeakContext)_localctx).addStrong);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddStrongContext extends ParserRuleContext {
		public PowLeftContext a;
		public Token op;
		public AddStrongContext b;
		public PowLeftContext powLeft() {
			return getRuleContext(PowLeftContext.class,0);
		}
		public AddStrongContext addStrong() {
			return getRuleContext(AddStrongContext.class,0);
		}
		public AddStrongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStrong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterAddStrong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitAddStrong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitAddStrong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStrongContext addStrong() throws RecognitionException {
		AddStrongContext _localctx = new AddStrongContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addStrong);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((AddStrongContext)_localctx).a = powLeft();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(33);
				((AddStrongContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((AddStrongContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				((AddStrongContext)_localctx).b = addStrong();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PowLeftContext extends ParserRuleContext {
		public PrimaryContext a;
		public PrimaryContext primary;
		public List<PrimaryContext> b = new ArrayList<PrimaryContext>();
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public PowLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterPowLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitPowLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitPowLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowLeftContext powLeft() throws RecognitionException {
		PowLeftContext _localctx = new PowLeftContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_powLeft);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((PowLeftContext)_localctx).a = primary();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(38);
				match(T__4);
				setState(39);
				((PowLeftContext)_localctx).primary = primary();
				((PowLeftContext)_localctx).b.add(((PowLeftContext)_localctx).primary);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ExprChangedParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprChangedListener ) ((ExprChangedListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprChangedVisitor ) return ((ExprChangedVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primary);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(NUMBER);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__5);
				setState(47);
				expr();
				setState(48);
				match(T__6);
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

	public static final String _serializedATN =
		"\u0004\u0001\t5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002\u0015\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u001c"+
		"\b\u0003\n\u0003\f\u0003\u001f\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004$\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		")\b\u0005\n\u0005\f\u0005,\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u00063\b\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002\u0001\u0000\u0001\u0002"+
		"\u0001\u0000\u0003\u00042\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0011"+
		"\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006\u0018"+
		"\u0001\u0000\u0000\u0000\b \u0001\u0000\u0000\u0000\n%\u0001\u0000\u0000"+
		"\u0000\f2\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000"+
		"\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0003\u0001\u0000\u0000\u0000"+
		"\u0013\u0015\u0007\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0005\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0003\b\u0004\u0000\u0019\u001a\u0007\u0001\u0000\u0000\u001a"+
		"\u001c\u0003\b\u0004\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u0007\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 #\u0003\n\u0005\u0000!\"\u0007\u0000\u0000\u0000"+
		"\"$\u0003\b\u0004\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\t\u0001\u0000\u0000\u0000%*\u0003\f\u0006\u0000&\'\u0005\u0005"+
		"\u0000\u0000\')\u0003\f\u0006\u0000(&\u0001\u0000\u0000\u0000),\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+\u000b\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-3\u0005\b\u0000"+
		"\u0000./\u0005\u0006\u0000\u0000/0\u0003\u0002\u0001\u000001\u0005\u0007"+
		"\u0000\u000013\u0001\u0000\u0000\u00002-\u0001\u0000\u0000\u00002.\u0001"+
		"\u0000\u0000\u00003\r\u0001\u0000\u0000\u0000\u0005\u0014\u001d#*2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}