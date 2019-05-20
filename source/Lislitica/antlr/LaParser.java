// Generated from D:/Hybrid/Lislitica\La.g4 by ANTLR 4.7.2
package Lislitica.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, LineComment=8, 
		PartComment=9, WhiteSpace=10, NewLine=11, String=12, Identifier=13, Number=14, 
		Float=15, Integer=16, LCeil=17, RCeil=18, LFloor=19, RFloor=20, LAngle=21, 
		RAngle=22, LQuote=23, RQuote=24, Import=25, LeftShift=26, LessEqual=27, 
		Less=28, Export=29, RightShift=30, GraterEqual=31, Grater=32, Increase=33, 
		PlusTo=34, Plus=35, LogicXor=36, Decrease=37, MinusFrom=38, To=39, Minus=40, 
		NullSequence=41, Sequence=42, Times=43, Multiply=44, Kronecker=45, TensorProduct=46, 
		MapAll=47, Remainder=48, Map=49, Divide=50, Quotient=51, Comment=52, Output=53, 
		Mod=54, BaseInput=55, Power=56, Surd=57, Equivalent=58, NotEquivalent=59, 
		Equal=60, Infer=61, Assign=62, Concat=63, Destruct=64, Tilde=65, LogicOr=66, 
		BitOr=67, LogicAnd=68, BitAnd=69, DoubleBang=70, NotEqual=71, BitNot=72, 
		LogicNot=73, Shebang=74, Dollar=75, Curry=76, Apply=77, LetAssign=78, 
		At=79, TypeAnnotation=80, DelayedAssign=81, Colon=82, Semicolon=83, Quote=84, 
		Acute=85, DoubleQuotation=86, Quotation=87, Underline=88, Ellipsis=89, 
		FinalAssign=90, DOT=91, Dot=92, COMMA=93, Reciprocal=94, Degree=95, Transpose=96, 
		Hermitian=97, FieldComplex=98, FieldReal=99, FieldUnsigned=100, FieldBool=101, 
		FieldInteger=102, FieldString=103, Section=104, Pilcrow=105, Currency=106, 
		Element=107;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_emptyStatement = 2, RULE_eos = 3, 
		RULE_symbol = 4, RULE_literalStatement = 5, RULE_expressionStatement = 6, 
		RULE_expression = 7, RULE_function_apply = 8, RULE_function_curry = 9, 
		RULE_function_params = 10, RULE_assign_statement = 11, RULE_assignable = 12, 
		RULE_assign_lhs = 13, RULE_assign_pass = 14, RULE_listLiteral = 15, RULE_indexLiteral = 16, 
		RULE_dictLiteral = 17, RULE_keyValue = 18, RULE_validKey = 19, RULE_raw = 20, 
		RULE_element = 21, RULE_index_valid = 22, RULE_signedInteger = 23, RULE_prefix_ops = 24, 
		RULE_postfix_ops = 25, RULE_left_ops = 26, RULE_right_ops = 27, RULE_assign_ops = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "emptyStatement", "eos", "symbol", "literalStatement", 
			"expressionStatement", "expression", "function_apply", "function_curry", 
			"function_params", "assign_statement", "assignable", "assign_lhs", "assign_pass", 
			"listLiteral", "indexLiteral", "dictLiteral", "keyValue", "validKey", 
			"raw", "element", "index_valid", "signedInteger", "prefix_ops", "postfix_ops", 
			"left_ops", "right_ops", "assign_ops"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'Raw'", null, null, 
			null, null, null, null, null, null, null, "'\u2308'", "'\u2309'", "'\u230A'", 
			"'\u230B'", null, null, "'\u201C'", "'\u201D'", null, null, "'<='", "'<'", 
			null, null, "'>='", "'>'", "'++'", "'+='", "'+'", "'\u2295'", "'--'", 
			"'-='", null, "'-'", "'***'", "'**'", "'*'", "'\u00D7'", "'\u2297'", 
			"'\u2299'", "'//@'", "'//'", "'/@'", "'/'", "'\u00F7'", "'%%%'", "'%%'", 
			"'%'", "'^^'", "'^'", "'\u221A'", "'==='", "'=!='", "'=='", null, "'='", 
			"'~~'", "'~='", "'~'", null, "'|'", null, "'&'", "'!!'", null, null, 
			null, "'#!'", "'$'", "'@@@'", "'@@'", "'@='", "'@'", null, null, null, 
			null, "'`'", "'\u00B4'", "'\"'", "'''", "'_'", "'...'", null, null, "'\u22C5'", 
			null, "'\u215F'", "'\u00B0'", "'\u1D40'", "'\u1D34'", "'\u2102'", "'\u211D'", 
			"'\u2124'", "'\uD835\uDD39'", "'\uD835\uDD40'", "'\uD835\uDD4A'", "'\u00A7'", 
			"'\u00B6'", "'\u00A4'", "'\u2208'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "LineComment", "PartComment", 
			"WhiteSpace", "NewLine", "String", "Identifier", "Number", "Float", "Integer", 
			"LCeil", "RCeil", "LFloor", "RFloor", "LAngle", "RAngle", "LQuote", "RQuote", 
			"Import", "LeftShift", "LessEqual", "Less", "Export", "RightShift", "GraterEqual", 
			"Grater", "Increase", "PlusTo", "Plus", "LogicXor", "Decrease", "MinusFrom", 
			"To", "Minus", "NullSequence", "Sequence", "Times", "Multiply", "Kronecker", 
			"TensorProduct", "MapAll", "Remainder", "Map", "Divide", "Quotient", 
			"Comment", "Output", "Mod", "BaseInput", "Power", "Surd", "Equivalent", 
			"NotEquivalent", "Equal", "Infer", "Assign", "Concat", "Destruct", "Tilde", 
			"LogicOr", "BitOr", "LogicAnd", "BitAnd", "DoubleBang", "NotEqual", "BitNot", 
			"LogicNot", "Shebang", "Dollar", "Curry", "Apply", "LetAssign", "At", 
			"TypeAnnotation", "DelayedAssign", "Colon", "Semicolon", "Quote", "Acute", 
			"DoubleQuotation", "Quotation", "Underline", "Ellipsis", "FinalAssign", 
			"DOT", "Dot", "COMMA", "Reciprocal", "Degree", "Transpose", "Hermitian", 
			"FieldComplex", "FieldReal", "FieldUnsigned", "FieldBool", "FieldInteger", 
			"FieldString", "Section", "Pilcrow", "Currency", "Element"
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
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << String) | (1L << Identifier) | (1L << Number) | (1L << Increase) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BitNot - 72)) | (1L << (LogicNot - 72)) | (1L << (Semicolon - 72)) | (1L << (Reciprocal - 72)))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	public static class StatementContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public LiteralStatementContext literalStatement() {
			return getRuleContext(LiteralStatementContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				literalStatement();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(68);
					eos();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				expressionStatement();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(72);
					eos();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				assign_statement();
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(76);
					eos();
					}
					break;
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			eos();
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(LaParser.Semicolon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(Semicolon);
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

	public static class SymbolContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(LaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(LaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(LaParser.DOT, i);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_symbol);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Identifier);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(DOT);
					setState(87);
					match(Identifier);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class LiteralStatementContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(LaParser.Number, 0); }
		public TerminalNode String() { return getToken(LaParser.String, 0); }
		public TerminalNode Identifier() { return getToken(LaParser.Identifier, 0); }
		public LiteralStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLiteralStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLiteralStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLiteralStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralStatementContext literalStatement() throws RecognitionException {
		LiteralStatementContext _localctx = new LiteralStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << Identifier) | (1L << Number))) != 0)) ) {
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			expression(0);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				expression(0);
				}
				}
				setState(102);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriorityExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PriorityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPriorityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPriorityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitPriorityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionApplyContext extends ExpressionContext {
		public Function_applyContext function_apply() {
			return getRuleContext(Function_applyContext.class,0);
		}
		public FunctionApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFunctionApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFunctionApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitFunctionApply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftOperatorContext extends ExpressionContext {
		public ExpressionContext left;
		public Left_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Left_opsContext left_ops() {
			return getRuleContext(Left_opsContext.class,0);
		}
		public LeftOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLeftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLeftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLeftOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExpressionContext {
		public ExpressionContext left;
		public IndexLiteralContext data;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexLiteralContext indexLiteral() {
			return getRuleContext(IndexLiteralContext.class,0);
		}
		public IndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpaceOperatorContext extends ExpressionContext {
		public ExpressionContext right;
		public TerminalNode Number() { return getToken(LaParser.Number, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpaceOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSpaceOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSpaceOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitSpaceOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignOperatorContext extends ExpressionContext {
		public Assign_lhsContext id;
		public Assign_opsContext op;
		public AssignableContext expr;
		public Assign_lhsContext assign_lhs() {
			return getRuleContext(Assign_lhsContext.class,0);
		}
		public Assign_opsContext assign_ops() {
			return getRuleContext(Assign_opsContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodApplyContext extends ExpressionContext {
		public SymbolContext left;
		public Token op;
		public ExpressionContext right;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LaParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterMethodApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitMethodApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitMethodApply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOperatorContext extends ExpressionContext {
		public ExpressionContext left;
		public Right_opsContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Right_opsContext right_ops() {
			return getRuleContext(Right_opsContext.class,0);
		}
		public RightOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRightOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRightOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitRightOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DictContext extends ExpressionContext {
		public DictLiteralContext data;
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public DictContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends ExpressionContext {
		public Prefix_opsContext op;
		public ExpressionContext right;
		public Prefix_opsContext prefix_ops() {
			return getRuleContext(Prefix_opsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExpressionContext {
		public LiteralStatementContext atom;
		public LiteralStatementContext literalStatement() {
			return getRuleContext(LiteralStatementContext.class,0);
		}
		public LiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolExpressionContext extends ExpressionContext {
		public SymbolContext atom;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSymbolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSymbolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitSymbolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListContext extends ExpressionContext {
		public ListLiteralContext data;
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Postfix_opsContext op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Postfix_opsContext postfix_ops() {
			return getRuleContext(Postfix_opsContext.class,0);
		}
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				((PrefixExpressionContext)_localctx).op = prefix_ops();
				setState(105);
				((PrefixExpressionContext)_localctx).right = expression(14);
				}
				break;
			case 2:
				{
				_localctx = new MethodApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((MethodApplyContext)_localctx).left = symbol();
				setState(108);
				((MethodApplyContext)_localctx).op = match(DOT);
				setState(109);
				((MethodApplyContext)_localctx).right = expression(12);
				}
				break;
			case 3:
				{
				_localctx = new FunctionApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				function_apply();
				}
				break;
			case 4:
				{
				_localctx = new SpaceOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(Number);
				setState(113);
				((SpaceOperatorContext)_localctx).right = expression(10);
				}
				break;
			case 5:
				{
				_localctx = new AssignOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				((AssignOperatorContext)_localctx).id = assign_lhs();
				setState(115);
				((AssignOperatorContext)_localctx).op = assign_ops();
				setState(116);
				((AssignOperatorContext)_localctx).expr = assignable();
				}
				break;
			case 6:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				((ListContext)_localctx).data = listLiteral();
				}
				break;
			case 7:
				{
				_localctx = new DictContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				((DictContext)_localctx).data = dictLiteral();
				}
				break;
			case 8:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				((LiteralContext)_localctx).atom = literalStatement();
				}
				break;
			case 9:
				{
				_localctx = new SymbolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				((SymbolExpressionContext)_localctx).atom = symbol();
				}
				break;
			case 10:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__0);
				setState(123);
				expression(0);
				setState(124);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LeftOperatorContext(new ExpressionContext(_parentctx, _parentState));
						((LeftOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(129);
						((LeftOperatorContext)_localctx).op = left_ops();
						setState(130);
						((LeftOperatorContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new RightOperatorContext(new ExpressionContext(_parentctx, _parentState));
						((RightOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133);
						((RightOperatorContext)_localctx).op = right_ops();
						setState(134);
						((RightOperatorContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PostfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(137);
						((PostfixExpressionContext)_localctx).op = postfix_ops();
						}
						break;
					case 4:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState));
						((IndexContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						((IndexContext)_localctx).data = indexLiteral();
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Function_applyContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<Function_curryContext> function_curry() {
			return getRuleContexts(Function_curryContext.class);
		}
		public Function_curryContext function_curry(int i) {
			return getRuleContext(Function_curryContext.class,i);
		}
		public Function_applyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_apply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFunction_apply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFunction_apply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitFunction_apply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_applyContext function_apply() throws RecognitionException {
		Function_applyContext _localctx = new Function_applyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_apply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			symbol();
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					function_curry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Function_curryContext extends ParserRuleContext {
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Function_curryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_curry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFunction_curry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFunction_curry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitFunction_curry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_curryContext function_curry() throws RecognitionException {
		Function_curryContext _localctx = new Function_curryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_curry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << String) | (1L << Identifier) | (1L << Number) | (1L << Increase) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BitNot - 72)) | (1L << (LogicNot - 72)) | (1L << (Reciprocal - 72)))) != 0)) {
				{
				setState(152);
				function_params();
				}
			}

			setState(155);
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

	public static class Function_paramsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFunction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitFunction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expression(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				expression(0);
				}
				}
				setState(164);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	 
		public Assign_statementContext() { }
		public void copyFrom(Assign_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStatementContext extends Assign_statementContext {
		public Assign_lhsContext id;
		public AssignableContext expr;
		public Assign_lhsContext assign_lhs() {
			return getRuleContext(Assign_lhsContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignStatementContext(Assign_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_statement);
		try {
			_localctx = new AssignStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((AssignStatementContext)_localctx).id = assign_lhs();
			setState(166);
			((AssignStatementContext)_localctx).expr = assignable();
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

	public static class AssignableContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expression(0);
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

	public static class Assign_lhsContext extends ParserRuleContext {
		public Assign_lhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_lhs; }
	 
		public Assign_lhsContext() { }
		public void copyFrom(Assign_lhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignAttributeContext extends Assign_lhsContext {
		public List<TerminalNode> Identifier() { return getTokens(LaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(LaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(LaParser.DOT, i);
		}
		public AssignAttributeContext(Assign_lhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignFunctionContext extends Assign_lhsContext {
		public List<TerminalNode> Identifier() { return getTokens(LaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LaParser.Identifier, i);
		}
		public AssignFunctionContext(Assign_lhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignValueContext extends Assign_lhsContext {
		public TerminalNode Identifier() { return getToken(LaParser.Identifier, 0); }
		public AssignValueContext(Assign_lhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignWithListContext extends Assign_lhsContext {
		public TerminalNode Identifier() { return getToken(LaParser.Identifier, 0); }
		public TerminalNode Integer() { return getToken(LaParser.Integer, 0); }
		public AssignWithListContext(Assign_lhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssignWithList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssignWithList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssignWithList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_lhsContext assign_lhs() throws RecognitionException {
		Assign_lhsContext _localctx = new Assign_lhsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_lhs);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new AssignAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(Identifier);
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					match(DOT);
					setState(173);
					match(Identifier);
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case 3:
				_localctx = new AssignFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(Identifier);
				setState(179);
				match(T__0);
				setState(180);
				match(Identifier);
				setState(181);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new AssignWithListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(Identifier);
				setState(183);
				match(T__2);
				setState(184);
				match(Integer);
				setState(185);
				match(T__3);
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

	public static class Assign_passContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(LaParser.Tilde, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Assign_passContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_pass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssign_pass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssign_pass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssign_pass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_passContext assign_pass() throws RecognitionException {
		Assign_passContext _localctx = new Assign_passContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign_pass);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tilde:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Tilde);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				symbol();
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

	public static class ListLiteralContext extends ParserRuleContext {
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
	 
		public ListLiteralContext() { }
		public void copyFrom(ListLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyListContext extends ListLiteralContext {
		public TerminalNode COMMA() { return getToken(LaParser.COMMA, 0); }
		public EmptyListContext(ListLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitEmptyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralListContext extends ListLiteralContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public LiteralListContext(ListLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new LiteralListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__4);
				setState(193);
				element();
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(194);
							match(COMMA);
							}
						}

						setState(197);
						element();
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(203);
					match(COMMA);
					}
				}

				setState(206);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__4);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(209);
					match(COMMA);
					}
				}

				setState(212);
				match(T__5);
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

	public static class IndexLiteralContext extends ParserRuleContext {
		public List<Index_validContext> index_valid() {
			return getRuleContexts(Index_validContext.class);
		}
		public Index_validContext index_valid(int i) {
			return getRuleContext(Index_validContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public IndexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterIndexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitIndexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitIndexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexLiteralContext indexLiteral() throws RecognitionException {
		IndexLiteralContext _localctx = new IndexLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__2);
			setState(216);
			index_valid();
			setState(221); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(217);
						match(COMMA);
						}
					}

					setState(220);
					index_valid();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(225);
			match(T__3);
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

	public static class DictLiteralContext extends ParserRuleContext {
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
	 
		public DictLiteralContext() { }
		public void copyFrom(DictLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyDictContext extends DictLiteralContext {
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public EmptyDictContext(DictLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterEmptyDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitEmptyDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitEmptyDict(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralDictContext extends DictLiteralContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public LiteralDictContext(DictLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLiteralDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLiteralDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLiteralDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dictLiteral);
		int _la;
		try {
			int _alt;
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LiteralDictContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__4);
				setState(228);
				keyValue();
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						match(COMMA);
						setState(230);
						keyValue();
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(236);
					match(COMMA);
					}
				}

				setState(239);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new EmptyDictContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__4);
				setState(242);
				match(Colon);
				setState(243);
				match(T__5);
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

	public static class KeyValueContext extends ParserRuleContext {
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
	 
		public KeyValueContext() { }
		public void copyFrom(KeyValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalKeyContext extends KeyValueContext {
		public ValidKeyContext key;
		public ElementContext value;
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public ValidKeyContext validKey() {
			return getRuleContext(ValidKeyContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public NormalKeyContext(KeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterNormalKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitNormalKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitNormalKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolKeyContext extends KeyValueContext {
		public Token key;
		public ElementContext value;
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public TerminalNode Identifier() { return getToken(LaParser.Identifier, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SymbolKeyContext(KeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSymbolKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSymbolKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitSymbolKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RawKeyContext extends KeyValueContext {
		public SymbolContext key;
		public ElementContext value;
		public TerminalNode Power() { return getToken(LaParser.Power, 0); }
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public RawKeyContext(KeyValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRawKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRawKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitRawKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyValue);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case String:
			case Number:
				_localctx = new NormalKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((NormalKeyContext)_localctx).key = validKey();
				setState(247);
				match(Colon);
				setState(248);
				((NormalKeyContext)_localctx).value = element();
				}
				break;
			case Identifier:
				_localctx = new SymbolKeyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((SymbolKeyContext)_localctx).key = match(Identifier);
				setState(251);
				match(Colon);
				setState(252);
				((SymbolKeyContext)_localctx).value = element();
				}
				break;
			case Power:
				_localctx = new RawKeyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(Power);
				setState(254);
				((RawKeyContext)_localctx).key = symbol();
				setState(255);
				match(Colon);
				setState(256);
				((RawKeyContext)_localctx).value = element();
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

	public static class ValidKeyContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(LaParser.Number, 0); }
		public TerminalNode String() { return getToken(LaParser.String, 0); }
		public RawContext raw() {
			return getRuleContext(RawContext.class,0);
		}
		public ValidKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterValidKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitValidKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitValidKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidKeyContext validKey() throws RecognitionException {
		ValidKeyContext _localctx = new ValidKeyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_validKey);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(Number);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(String);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				raw();
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

	public static class RawContext extends ParserRuleContext {
		public Token text;
		public TerminalNode String() { return getToken(LaParser.String, 0); }
		public RawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitRaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawContext raw() throws RecognitionException {
		RawContext _localctx = new RawContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_raw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__6);
			setState(266);
			match(T__0);
			setState(267);
			((RawContext)_localctx).text = match(String);
			setState(268);
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

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public RawContext raw() {
			return getRuleContext(RawContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(270);
				expression(0);
				}
				break;
			case 2:
				{
				setState(271);
				dictLiteral();
				}
				break;
			case 3:
				{
				setState(272);
				listLiteral();
				}
				break;
			case 4:
				{
				setState(273);
				raw();
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

	public static class Index_validContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode Integer() { return getToken(LaParser.Integer, 0); }
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public Index_validContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_valid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterIndex_valid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitIndex_valid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitIndex_valid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_validContext index_valid() throws RecognitionException {
		Index_validContext _localctx = new Index_validContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_index_valid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(276);
				symbol();
				}
				break;
			case Integer:
				{
				setState(277);
				match(Integer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(280);
				match(Colon);
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

	public static class SignedIntegerContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(LaParser.Integer, 0); }
		public TerminalNode Plus() { return getToken(LaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(LaParser.Minus, 0); }
		public SignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitSignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedIntegerContext signedInteger() throws RecognitionException {
		SignedIntegerContext _localctx = new SignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(286);
			match(Integer);
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

	public static class Prefix_opsContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(LaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(LaParser.Minus, 0); }
		public TerminalNode BitNot() { return getToken(LaParser.BitNot, 0); }
		public TerminalNode LogicNot() { return getToken(LaParser.LogicNot, 0); }
		public TerminalNode Reciprocal() { return getToken(LaParser.Reciprocal, 0); }
		public TerminalNode Increase() { return getToken(LaParser.Increase, 0); }
		public Prefix_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPrefix_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPrefix_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitPrefix_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_opsContext prefix_ops() throws RecognitionException {
		Prefix_opsContext _localctx = new Prefix_opsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prefix_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Increase - 33)) | (1L << (Plus - 33)) | (1L << (Minus - 33)) | (1L << (BitNot - 33)) | (1L << (LogicNot - 33)) | (1L << (Reciprocal - 33)))) != 0)) ) {
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

	public static class Postfix_opsContext extends ParserRuleContext {
		public TerminalNode Increase() { return getToken(LaParser.Increase, 0); }
		public Postfix_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPostfix_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPostfix_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitPostfix_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_opsContext postfix_ops() throws RecognitionException {
		Postfix_opsContext _localctx = new Postfix_opsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_postfix_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Increase);
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

	public static class Left_opsContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(LaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(LaParser.Minus, 0); }
		public TerminalNode LeftShift() { return getToken(LaParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(LaParser.RightShift, 0); }
		public TerminalNode LogicAnd() { return getToken(LaParser.LogicAnd, 0); }
		public TerminalNode LogicNot() { return getToken(LaParser.LogicNot, 0); }
		public TerminalNode LogicOr() { return getToken(LaParser.LogicOr, 0); }
		public TerminalNode LogicXor() { return getToken(LaParser.LogicXor, 0); }
		public TerminalNode Equal() { return getToken(LaParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(LaParser.NotEqual, 0); }
		public TerminalNode Equivalent() { return getToken(LaParser.Equivalent, 0); }
		public TerminalNode NotEquivalent() { return getToken(LaParser.NotEquivalent, 0); }
		public TerminalNode Grater() { return getToken(LaParser.Grater, 0); }
		public TerminalNode GraterEqual() { return getToken(LaParser.GraterEqual, 0); }
		public TerminalNode Less() { return getToken(LaParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(LaParser.LessEqual, 0); }
		public TerminalNode Divide() { return getToken(LaParser.Divide, 0); }
		public TerminalNode Times() { return getToken(LaParser.Times, 0); }
		public TerminalNode Multiply() { return getToken(LaParser.Multiply, 0); }
		public TerminalNode Kronecker() { return getToken(LaParser.Kronecker, 0); }
		public TerminalNode TensorProduct() { return getToken(LaParser.TensorProduct, 0); }
		public TerminalNode Concat() { return getToken(LaParser.Concat, 0); }
		public Left_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLeft_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLeft_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitLeft_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_opsContext left_ops() throws RecognitionException {
		Left_opsContext _localctx = new Left_opsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_left_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (LeftShift - 26)) | (1L << (LessEqual - 26)) | (1L << (Less - 26)) | (1L << (RightShift - 26)) | (1L << (GraterEqual - 26)) | (1L << (Grater - 26)) | (1L << (Plus - 26)) | (1L << (LogicXor - 26)) | (1L << (Minus - 26)) | (1L << (Times - 26)) | (1L << (Multiply - 26)) | (1L << (Kronecker - 26)) | (1L << (TensorProduct - 26)) | (1L << (Divide - 26)) | (1L << (Equivalent - 26)) | (1L << (NotEquivalent - 26)) | (1L << (Equal - 26)) | (1L << (Concat - 26)) | (1L << (LogicOr - 26)) | (1L << (LogicAnd - 26)) | (1L << (NotEqual - 26)) | (1L << (LogicNot - 26)))) != 0)) ) {
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

	public static class Right_opsContext extends ParserRuleContext {
		public TerminalNode Power() { return getToken(LaParser.Power, 0); }
		public TerminalNode Surd() { return getToken(LaParser.Surd, 0); }
		public Right_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRight_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRight_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitRight_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_opsContext right_ops() throws RecognitionException {
		Right_opsContext _localctx = new Right_opsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_right_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==Power || _la==Surd) ) {
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

	public static class Assign_opsContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(LaParser.Assign, 0); }
		public TerminalNode PlusTo() { return getToken(LaParser.PlusTo, 0); }
		public TerminalNode MinusFrom() { return getToken(LaParser.MinusFrom, 0); }
		public TerminalNode LetAssign() { return getToken(LaParser.LetAssign, 0); }
		public TerminalNode FinalAssign() { return getToken(LaParser.FinalAssign, 0); }
		public TerminalNode DelayedAssign() { return getToken(LaParser.DelayedAssign, 0); }
		public Assign_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAssign_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAssign_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitAssign_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opsContext assign_ops() throws RecognitionException {
		Assign_opsContext _localctx = new Assign_opsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assign_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (PlusTo - 34)) | (1L << (MinusFrom - 34)) | (1L << (Assign - 34)) | (1L << (LetAssign - 34)) | (1L << (DelayedAssign - 34)) | (1L << (FinalAssign - 34)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\5\3L\n\3\3\3\3\3\5\3P\n"+
		"\3\5\3R\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3"+
		"\7\3\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t"+
		"\16\t\u0092\13\t\3\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3\13\3\13\5\13\u009c"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\6\17\u00b1\n\17\r\17\16\17\u00b2\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\5\20"+
		"\u00c1\n\20\3\21\3\21\3\21\5\21\u00c6\n\21\3\21\7\21\u00c9\n\21\f\21\16"+
		"\21\u00cc\13\21\3\21\5\21\u00cf\n\21\3\21\3\21\3\21\3\21\5\21\u00d5\n"+
		"\21\3\21\5\21\u00d8\n\21\3\22\3\22\3\22\5\22\u00dd\n\22\3\22\6\22\u00e0"+
		"\n\22\r\22\16\22\u00e1\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f"+
		"\23\16\23\u00ed\13\23\3\23\5\23\u00f0\n\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00f7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0105\n\24\3\25\3\25\3\25\5\25\u010a\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\5\27\u0115\n\27\3\30\3\30\5\30\u0119\n\30"+
		"\3\30\5\30\u011c\n\30\3\31\5\31\u011f\n\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\u00e1\3\20\37\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\3\2\16\20\4\2%%**"+
		"\7\2##%%**JK``\16\2\34\36 \"%&**-\60\64\64<>AADDFFIIKK\3\2:;\b\2$$((@"+
		"@PPSS\\\\\2\u0141\2?\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\nW\3\2\2"+
		"\2\f_\3\2\2\2\16a\3\2\2\2\20\u0080\3\2\2\2\22\u0093\3\2\2\2\24\u0099\3"+
		"\2\2\2\26\u009f\3\2\2\2\30\u00a7\3\2\2\2\32\u00aa\3\2\2\2\34\u00bc\3\2"+
		"\2\2\36\u00c0\3\2\2\2 \u00d7\3\2\2\2\"\u00d9\3\2\2\2$\u00f6\3\2\2\2&\u0104"+
		"\3\2\2\2(\u0109\3\2\2\2*\u010b\3\2\2\2,\u0114\3\2\2\2.\u0118\3\2\2\2\60"+
		"\u011e\3\2\2\2\62\u0122\3\2\2\2\64\u0124\3\2\2\2\66\u0126\3\2\2\28\u0128"+
		"\3\2\2\2:\u012a\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DR\5\6\4\2EG\5\f\7\2FH\5"+
		"\b\5\2GF\3\2\2\2GH\3\2\2\2HR\3\2\2\2IK\5\16\b\2JL\5\b\5\2KJ\3\2\2\2KL"+
		"\3\2\2\2LR\3\2\2\2MO\5\30\r\2NP\5\b\5\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2"+
		"QD\3\2\2\2QE\3\2\2\2QI\3\2\2\2QM\3\2\2\2R\5\3\2\2\2ST\5\b\5\2T\7\3\2\2"+
		"\2UV\7U\2\2V\t\3\2\2\2W\\\7\17\2\2XY\7]\2\2Y[\7\17\2\2ZX\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\t\2\2\2`\r\3\2\2\2"+
		"af\5\20\t\2bc\7_\2\2ce\5\20\t\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\17\3\2\2\2hf\3\2\2\2ij\b\t\1\2jk\5\62\32\2kl\5\20\t\20l\u0081\3\2"+
		"\2\2mn\5\n\6\2no\7]\2\2op\5\20\t\16p\u0081\3\2\2\2q\u0081\5\22\n\2rs\7"+
		"\20\2\2s\u0081\5\20\t\ftu\5\34\17\2uv\5:\36\2vw\5\32\16\2w\u0081\3\2\2"+
		"\2x\u0081\5 \21\2y\u0081\5$\23\2z\u0081\5\f\7\2{\u0081\5\n\6\2|}\7\3\2"+
		"\2}~\5\20\t\2~\177\7\4\2\2\177\u0081\3\2\2\2\u0080i\3\2\2\2\u0080m\3\2"+
		"\2\2\u0080q\3\2\2\2\u0080r\3\2\2\2\u0080t\3\2\2\2\u0080x\3\2\2\2\u0080"+
		"y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\u0090\3\2"+
		"\2\2\u0082\u0083\f\13\2\2\u0083\u0084\5\66\34\2\u0084\u0085\5\20\t\f\u0085"+
		"\u008f\3\2\2\2\u0086\u0087\f\n\2\2\u0087\u0088\58\35\2\u0088\u0089\5\20"+
		"\t\n\u0089\u008f\3\2\2\2\u008a\u008b\f\17\2\2\u008b\u008f\5\64\33\2\u008c"+
		"\u008d\f\7\2\2\u008d\u008f\5\"\22\2\u008e\u0082\3\2\2\2\u008e\u0086\3"+
		"\2\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0095\5\n\6\2\u0094\u0096\5\24\13\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2"+
		"\2\u0099\u009b\7\3\2\2\u009a\u009c\5\26\f\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\4\2\2\u009e\25\3\2\2"+
		"\2\u009f\u00a4\5\20\t\2\u00a0\u00a1\7_\2\2\u00a1\u00a3\5\20\t\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\27\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8"+
		"\u00a9\5\32\16\2\u00a9\31\3\2\2\2\u00aa\u00ab\5\20\t\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00bd\7\17\2\2\u00ad\u00b0\7\17\2\2\u00ae\u00af\7]\2\2\u00af"+
		"\u00b1\7\17\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bd\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5"+
		"\u00b6\7\3\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00bd\7\4\2\2\u00b8\u00b9\7"+
		"\17\2\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bd\7\6\2\2\u00bc"+
		"\u00ac\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bd\35\3\2\2\2\u00be\u00c1\7C\2\2\u00bf\u00c1\5\n\6\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\7\2\2\u00c3"+
		"\u00ca\5,\27\2\u00c4\u00c6\7_\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\5,\27\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7_\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d8\3\2"+
		"\2\2\u00d2\u00d4\7\7\2\2\u00d3\u00d5\7_\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\b\2\2\u00d7\u00c2\3\2"+
		"\2\2\u00d7\u00d2\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00df"+
		"\5.\30\2\u00db\u00dd\7_\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\5.\30\2\u00df\u00dc\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\7\6\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\7\2\2\u00e6\u00eb\5&\24\2"+
		"\u00e7\u00e8\7_\2\2\u00e8\u00ea\5&\24\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f0\7_\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f7\3\2\2\2\u00f3"+
		"\u00f4\7\7\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f7\7\b\2\2\u00f6\u00e5\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f7%\3\2\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa"+
		"\7T\2\2\u00fa\u00fb\5,\27\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\7\17\2\2\u00fd"+
		"\u00fe\7T\2\2\u00fe\u0105\5,\27\2\u00ff\u0100\7:\2\2\u0100\u0101\5\n\6"+
		"\2\u0101\u0102\7T\2\2\u0102\u0103\5,\27\2\u0103\u0105\3\2\2\2\u0104\u00f8"+
		"\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\'\3\2\2\2\u0106"+
		"\u010a\7\20\2\2\u0107\u010a\7\16\2\2\u0108\u010a\5*\26\2\u0109\u0106\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a)\3\2\2\2\u010b\u010c"+
		"\7\t\2\2\u010c\u010d\7\3\2\2\u010d\u010e\7\16\2\2\u010e\u010f\7\4\2\2"+
		"\u010f+\3\2\2\2\u0110\u0115\5\20\t\2\u0111\u0115\5$\23\2\u0112\u0115\5"+
		" \21\2\u0113\u0115\5*\26\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115-\3\2\2\2\u0116\u0119\5\n\6\2"+
		"\u0117\u0119\7\22\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u011c\7T\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"/\3\2\2\2\u011d\u011f\t\3\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0121\7\22\2\2\u0121\61\3\2\2\2\u0122\u0123"+
		"\t\4\2\2\u0123\63\3\2\2\2\u0124\u0125\7#\2\2\u0125\65\3\2\2\2\u0126\u0127"+
		"\t\5\2\2\u0127\67\3\2\2\2\u0128\u0129\t\6\2\2\u01299\3\2\2\2\u012a\u012b"+
		"\t\7\2\2\u012b;\3\2\2\2\"?GKOQ\\f\u0080\u008e\u0090\u0097\u009b\u00a4"+
		"\u00b2\u00bc\u00c0\u00c5\u00ca\u00ce\u00d4\u00d7\u00dc\u00e1\u00eb\u00ef"+
		"\u00f6\u0104\u0109\u0114\u0118\u011b\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}