// Generated from D:/Hybrid/Lislitica\La.g4 by ANTLR 4.7.2
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
		PartComment=9, WhiteSpace=10, NewLine=11, STRING=12, Identifier=13, NUMBER=14, 
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
		RULE_symbol = 4, RULE_expressionStatement = 5, RULE_expression = 6, RULE_function_apply = 7, 
		RULE_function_curry = 8, RULE_function_params = 9, RULE_assign_statement = 10, 
		RULE_assignable = 11, RULE_assign_lhs = 12, RULE_assign_pass = 13, RULE_dict_literal = 14, 
		RULE_keyvalue = 15, RULE_validKey = 16, RULE_raw = 17, RULE_listLiteral = 18, 
		RULE_element = 19, RULE_indexLiteral = 20, RULE_index_valid = 21, RULE_signedInteger = 22, 
		RULE_prefix_ops = 23, RULE_postfix_ops = 24, RULE_left_ops = 25, RULE_right_ops = 26, 
		RULE_assign_ops = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "emptyStatement", "eos", "symbol", "expressionStatement", 
			"expression", "function_apply", "function_curry", "function_params", 
			"assign_statement", "assignable", "assign_lhs", "assign_pass", "dict_literal", 
			"keyvalue", "validKey", "raw", "listLiteral", "element", "indexLiteral", 
			"index_valid", "signedInteger", "prefix_ops", "postfix_ops", "left_ops", 
			"right_ops", "assign_ops"
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
			"WhiteSpace", "NewLine", "STRING", "Identifier", "NUMBER", "Float", "Integer", 
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << STRING) | (1L << Identifier) | (1L << NUMBER) | (1L << Increase) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BitNot - 72)) | (1L << (LogicNot - 72)) | (1L << (Semicolon - 72)) | (1L << (Reciprocal - 72)))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				expressionStatement();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(66);
					eos();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				assign_statement();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(70);
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
			setState(75);
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
			setState(77);
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
			setState(79);
			match(Identifier);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(DOT);
					setState(81);
					match(Identifier);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 10, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expression(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				expression(0);
				}
				}
				setState(94);
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
	public static class StringContext extends ExpressionContext {
		public Token atom;
		public TerminalNode STRING() { return getToken(LaParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitString(this);
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
	public static class SpaceOperatorContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
	public static class MethodApplyContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(LaParser.DOT, 0); }
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
	public static class NumberContext extends ExpressionContext {
		public Token atom;
		public TerminalNode NUMBER() { return getToken(LaParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitNumber(this);
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
		public Dict_literalContext data;
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionApplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				function_apply();
				}
				break;
			case 2:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((PrefixExpressionContext)_localctx).op = prefix_ops();
				setState(98);
				((PrefixExpressionContext)_localctx).right = expression(14);
				}
				break;
			case 3:
				{
				_localctx = new AssignOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				((AssignOperatorContext)_localctx).id = assign_lhs();
				setState(101);
				((AssignOperatorContext)_localctx).op = assign_ops();
				setState(102);
				((AssignOperatorContext)_localctx).expr = assignable();
				}
				break;
			case 4:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				((ListContext)_localctx).data = listLiteral();
				}
				break;
			case 5:
				{
				_localctx = new DictContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((DictContext)_localctx).data = dict_literal();
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				((StringContext)_localctx).atom = match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((NumberContext)_localctx).atom = match(NUMBER);
				}
				break;
			case 8:
				{
				_localctx = new SymbolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((SymbolExpressionContext)_localctx).atom = symbol();
				}
				break;
			case 9:
				{
				_localctx = new PriorityExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__0);
				setState(110);
				expression(0);
				setState(111);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MethodApplyContext(new ExpressionContext(_parentctx, _parentState));
						((MethodApplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(116);
						((MethodApplyContext)_localctx).op = match(DOT);
						setState(117);
						((MethodApplyContext)_localctx).right = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new SpaceOperatorContext(new ExpressionContext(_parentctx, _parentState));
						((SpaceOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(119);
						((SpaceOperatorContext)_localctx).right = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new LeftOperatorContext(new ExpressionContext(_parentctx, _parentState));
						((LeftOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(121);
						((LeftOperatorContext)_localctx).op = left_ops();
						setState(122);
						((LeftOperatorContext)_localctx).right = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new RightOperatorContext(new ExpressionContext(_parentctx, _parentState));
						((RightOperatorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(125);
						((RightOperatorContext)_localctx).op = right_ops();
						setState(126);
						((RightOperatorContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PostfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(129);
						((PostfixExpressionContext)_localctx).op = postfix_ops();
						}
						break;
					case 6:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState));
						((IndexContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						((IndexContext)_localctx).data = indexLiteral();
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 14, RULE_function_apply);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			symbol();
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(138);
					function_curry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 16, RULE_function_curry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << STRING) | (1L << Identifier) | (1L << NUMBER) | (1L << Increase) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BitNot - 72)) | (1L << (LogicNot - 72)) | (1L << (Reciprocal - 72)))) != 0)) {
				{
				setState(144);
				function_params();
				}
			}

			setState(147);
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
		enterRule(_localctx, 18, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression(0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				expression(0);
				}
				}
				setState(156);
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
		enterRule(_localctx, 20, RULE_assign_statement);
		try {
			_localctx = new AssignStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((AssignStatementContext)_localctx).id = assign_lhs();
			setState(158);
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
		enterRule(_localctx, 22, RULE_assignable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 24, RULE_assign_lhs);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new AssignAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(Identifier);
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					match(DOT);
					setState(165);
					match(Identifier);
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case 3:
				_localctx = new AssignFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(Identifier);
				setState(171);
				match(T__0);
				setState(172);
				match(Identifier);
				setState(173);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new AssignWithListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(Identifier);
				setState(175);
				match(T__2);
				setState(176);
				match(Integer);
				setState(177);
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
		enterRule(_localctx, 26, RULE_assign_pass);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tilde:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Tilde);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
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

	public static class Dict_literalContext extends ParserRuleContext {
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
	 
		public Dict_literalContext() { }
		public void copyFrom(Dict_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyDictContext extends Dict_literalContext {
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public EmptyDictContext(Dict_literalContext ctx) { copyFrom(ctx); }
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
	public static class LiteralDictContext extends Dict_literalContext {
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaParser.COMMA, i);
		}
		public LiteralDictContext(Dict_literalContext ctx) { copyFrom(ctx); }
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

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dict_literal);
		int _la;
		try {
			int _alt;
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LiteralDictContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__4);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << STRING) | (1L << Identifier) | (1L << NUMBER) | (1L << Power))) != 0)) {
					{
					setState(185);
					keyvalue();
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(186);
							match(COMMA);
							setState(187);
							keyvalue();
							}
							} 
						}
						setState(192);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(195);
					match(COMMA);
					}
				}

				setState(198);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new EmptyDictContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__4);
				setState(200);
				match(Colon);
				setState(201);
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

	public static class KeyvalueContext extends ParserRuleContext {
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
	 
		public KeyvalueContext() { }
		public void copyFrom(KeyvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalKeyContext extends KeyvalueContext {
		public ValidKeyContext key;
		public ElementContext value;
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public ValidKeyContext validKey() {
			return getRuleContext(ValidKeyContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public NormalKeyContext(KeyvalueContext ctx) { copyFrom(ctx); }
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
	public static class SymbolKeyContext extends KeyvalueContext {
		public Token key;
		public ElementContext value;
		public TerminalNode Colon() { return getToken(LaParser.Colon, 0); }
		public TerminalNode Identifier() { return getToken(LaParser.Identifier, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SymbolKeyContext(KeyvalueContext ctx) { copyFrom(ctx); }
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
	public static class RawKeyContext extends KeyvalueContext {
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
		public RawKeyContext(KeyvalueContext ctx) { copyFrom(ctx); }
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

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyvalue);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case STRING:
			case NUMBER:
				_localctx = new NormalKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((NormalKeyContext)_localctx).key = validKey();
				setState(205);
				match(Colon);
				setState(206);
				((NormalKeyContext)_localctx).value = element();
				}
				break;
			case Identifier:
				_localctx = new SymbolKeyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((SymbolKeyContext)_localctx).key = match(Identifier);
				setState(209);
				match(Colon);
				setState(210);
				((SymbolKeyContext)_localctx).value = element();
				}
				break;
			case Power:
				_localctx = new RawKeyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(Power);
				setState(212);
				((RawKeyContext)_localctx).key = symbol();
				setState(213);
				match(Colon);
				setState(214);
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
		public TerminalNode NUMBER() { return getToken(LaParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LaParser.STRING, 0); }
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
		enterRule(_localctx, 32, RULE_validKey);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(STRING);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
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
		public TerminalNode STRING() { return getToken(LaParser.STRING, 0); }
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
		enterRule(_localctx, 34, RULE_raw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__6);
			setState(224);
			match(T__0);
			setState(225);
			((RawContext)_localctx).text = match(STRING);
			setState(226);
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

	public static class ListLiteralContext extends ParserRuleContext {
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
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaVisitor ) return ((LaVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__4);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << STRING) | (1L << Identifier) | (1L << NUMBER) | (1L << Increase) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BitNot - 72)) | (1L << (LogicNot - 72)) | (1L << (Reciprocal - 72)))) != 0)) {
				{
				setState(229);
				element();
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(230);
							match(COMMA);
							}
						}

						setState(233);
						element();
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
				match(COMMA);
				}
			}

			setState(244);
			match(T__5);
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
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
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
		enterRule(_localctx, 38, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(246);
				expression(0);
				}
				break;
			case 2:
				{
				setState(247);
				dict_literal();
				}
				break;
			case 3:
				{
				setState(248);
				listLiteral();
				}
				break;
			case 4:
				{
				setState(249);
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
		enterRule(_localctx, 40, RULE_indexLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__2);
			setState(253);
			index_valid();
			setState(258); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(254);
						match(COMMA);
						}
					}

					setState(257);
					index_valid();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(262);
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
		enterRule(_localctx, 42, RULE_index_valid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(264);
				symbol();
				}
				break;
			case Integer:
				{
				setState(265);
				match(Integer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(268);
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
		enterRule(_localctx, 44, RULE_signedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(271);
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

			setState(274);
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
		enterRule(_localctx, 46, RULE_prefix_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 48, RULE_postfix_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 50, RULE_left_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 52, RULE_right_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 54, RULE_assign_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\5\3J\n\3\5\3L\n\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bt\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\t\3\t\6\t\u008e\n\t\r"+
		"\t\16\t\u008f\3\n\3\n\5\n\u0094\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u009b"+
		"\n\13\f\13\16\13\u009e\13\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\6"+
		"\16\u00a9\n\16\r\16\16\16\u00aa\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00b5\n\16\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\7\20\u00bf"+
		"\n\20\f\20\16\20\u00c2\13\20\5\20\u00c4\n\20\3\20\5\20\u00c7\n\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00db\n\21\3\22\3\22\3\22\5\22\u00e0\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00ea\n\24\3\24\7\24\u00ed"+
		"\n\24\f\24\16\24\u00f0\13\24\5\24\u00f2\n\24\3\24\5\24\u00f5\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u00fd\n\25\3\26\3\26\3\26\5\26\u0102\n"+
		"\26\3\26\6\26\u0105\n\26\r\26\16\26\u0106\3\26\3\26\3\27\3\27\5\27\u010d"+
		"\n\27\3\27\5\27\u0110\n\27\3\30\5\30\u0113\n\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\u0106\3\16\36\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\4\2%%**\7\2##"+
		"%%**JK``\16\2\34\36 \"%&**-\60\64\64<>AADDFFIIKK\3\2:;\b\2$$((@@PPSS\\"+
		"\\\2\u0135\2=\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fY\3"+
		"\2\2\2\16s\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2"+
		"\26\u009f\3\2\2\2\30\u00a2\3\2\2\2\32\u00b4\3\2\2\2\34\u00b8\3\2\2\2\36"+
		"\u00cc\3\2\2\2 \u00da\3\2\2\2\"\u00df\3\2\2\2$\u00e1\3\2\2\2&\u00e6\3"+
		"\2\2\2(\u00fc\3\2\2\2*\u00fe\3\2\2\2,\u010c\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u0116\3\2\2\2\62\u0118\3\2\2\2\64\u011a\3\2\2\2\66\u011c\3\2\2\28\u011e"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?"+
		"=\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BL\5\6\4\2CE\5\f\7\2DF\5\b\5\2ED\3\2\2\2"+
		"EF\3\2\2\2FL\3\2\2\2GI\5\26\f\2HJ\5\b\5\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KB\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\5\3\2\2\2MN\5\b\5\2N\7\3\2\2\2OP\7U"+
		"\2\2P\t\3\2\2\2QV\7\17\2\2RS\7]\2\2SU\7\17\2\2TR\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2Y^\5\16\b\2Z[\7_\2\2[]\5\16\b\2"+
		"\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2\2\2ab\b\b"+
		"\1\2bt\5\20\t\2cd\5\60\31\2de\5\16\b\20et\3\2\2\2fg\5\32\16\2gh\58\35"+
		"\2hi\5\30\r\2it\3\2\2\2jt\5&\24\2kt\5\36\20\2lt\7\16\2\2mt\7\20\2\2nt"+
		"\5\n\6\2op\7\3\2\2pq\5\16\b\2qr\7\4\2\2rt\3\2\2\2sa\3\2\2\2sc\3\2\2\2"+
		"sf\3\2\2\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2"+
		"t\u0088\3\2\2\2uv\f\16\2\2vw\7]\2\2w\u0087\5\16\b\17xy\f\r\2\2y\u0087"+
		"\5\16\b\16z{\f\f\2\2{|\5\64\33\2|}\5\16\b\r}\u0087\3\2\2\2~\177\f\13\2"+
		"\2\177\u0080\5\66\34\2\u0080\u0081\5\16\b\13\u0081\u0087\3\2\2\2\u0082"+
		"\u0083\f\17\2\2\u0083\u0087\5\62\32\2\u0084\u0085\f\b\2\2\u0085\u0087"+
		"\5*\26\2\u0086u\3\2\2\2\u0086x\3\2\2\2\u0086z\3\2\2\2\u0086~\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d"+
		"\5\n\6\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\21\3\2\2\2\u0091\u0093"+
		"\7\3\2\2\u0092\u0094\5\24\13\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0096\7\4\2\2\u0096\23\3\2\2\2\u0097\u009c"+
		"\5\16\b\2\u0098\u0099\7_\2\2\u0099\u009b\5\16\b\2\u009a\u0098\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\5\30\r"+
		"\2\u00a1\27\3\2\2\2\u00a2\u00a3\5\16\b\2\u00a3\31\3\2\2\2\u00a4\u00b5"+
		"\7\17\2\2\u00a5\u00a8\7\17\2\2\u00a6\u00a7\7]\2\2\u00a7\u00a9\7\17\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae\7\3\2\2"+
		"\u00ae\u00af\7\17\2\2\u00af\u00b5\7\4\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2"+
		"\7\5\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b5\7\6\2\2\u00b4\u00a4\3\2\2\2"+
		"\u00b4\u00a5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\33"+
		"\3\2\2\2\u00b6\u00b9\7C\2\2\u00b7\u00b9\5\n\6\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00c3\7\7\2\2\u00bb\u00c0\5 \21"+
		"\2\u00bc\u00bd\7_\2\2\u00bd\u00bf\5 \21\2\u00be\u00bc\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c7\7_\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cd\7\b\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\7T"+
		"\2\2\u00cb\u00cd\7\b\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\5(\25"+
		"\2\u00d1\u00db\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\7T\2\2\u00d4\u00db"+
		"\5(\25\2\u00d5\u00d6\7:\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7T\2\2\u00d8"+
		"\u00d9\5(\25\2\u00d9\u00db\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2"+
		"\2\2\u00da\u00d5\3\2\2\2\u00db!\3\2\2\2\u00dc\u00e0\7\20\2\2\u00dd\u00e0"+
		"\7\16\2\2\u00de\u00e0\5$\23\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\7"+
		"\3\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\7\4\2\2\u00e5%\3\2\2\2\u00e6\u00f1"+
		"\7\7\2\2\u00e7\u00ee\5(\25\2\u00e8\u00ea\7_\2\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\5(\25\2\u00ec\u00e9\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\7_\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\b\2\2\u00f7\'\3\2\2\2"+
		"\u00f8\u00fd\5\16\b\2\u00f9\u00fd\5\36\20\2\u00fa\u00fd\5&\24\2\u00fb"+
		"\u00fd\5$\23\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd)\3\2\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0104"+
		"\5,\27\2\u0100\u0102\7_\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\5,\27\2\u0104\u0101\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7\6\2\2\u0109+\3\2\2\2\u010a\u010d\5\n\6\2\u010b\u010d\7\22\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110"+
		"\7T\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110-\3\2\2\2\u0111\u0113"+
		"\t\2\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7\22\2\2\u0115/\3\2\2\2\u0116\u0117\t\3\2\2\u0117\61\3\2\2\2\u0118"+
		"\u0119\7#\2\2\u0119\63\3\2\2\2\u011a\u011b\t\4\2\2\u011b\65\3\2\2\2\u011c"+
		"\u011d\t\5\2\2\u011d\67\3\2\2\2\u011e\u011f\t\6\2\2\u011f9\3\2\2\2!=E"+
		"IKV^s\u0086\u0088\u008f\u0093\u009c\u00aa\u00b4\u00b8\u00c0\u00c3\u00c6"+
		"\u00cc\u00da\u00df\u00e9\u00ee\u00f1\u00f4\u00fc\u0101\u0106\u010c\u010f"+
		"\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}