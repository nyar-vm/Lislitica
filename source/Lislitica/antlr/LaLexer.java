// Generated from D:/Hybrid/Lislitica\La.g4 by ANTLR 4.7.2
package Lislitica.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "LineComment", 
			"PartComment", "WhiteSpace", "NewLine", "STRING", "Identifier", "NUMBER", 
			"Float", "Integer", "Digit", "OctalDigit", "HexDigit", "Letter", "UnicodeWhiteSpace", 
			"SimpleString", "EmojiCharacter", "NameCharacter", "NameStartCharacter", 
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


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "La.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u0268\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00fe"+
		"\n\t\f\t\16\t\u0101\13\t\3\t\3\t\3\n\3\n\7\n\u0107\n\n\f\n\16\n\u010a"+
		"\13\n\3\n\3\n\3\n\3\n\3\13\6\13\u0111\n\13\r\13\16\13\u0112\3\13\3\13"+
		"\3\f\5\f\u0118\n\f\3\f\3\f\6\f\u011c\n\f\r\f\16\f\u011d\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3\17\3\17\5\17\u012d"+
		"\n\17\3\20\6\20\u0130\n\20\r\20\16\20\u0131\3\20\3\20\7\20\u0136\n\20"+
		"\f\20\16\20\u0139\13\20\3\20\3\20\6\20\u013d\n\20\r\20\16\20\u013e\5\20"+
		"\u0141\n\20\3\21\6\21\u0144\n\21\r\21\16\21\u0145\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u0154\n\27\f\27\16\27\u0157"+
		"\13\27\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u015f\n\31\3\32\3\32\5\32\u0163"+
		"\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u0170"+
		"\n\37\3 \3 \3 \5 \u0175\n \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u017f\n#\3$\3"+
		"$\3$\5$\u0184\n$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5\'\u018f\n\'\3(\3(\3"+
		"(\5(\u0194\n(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\5\61\u01ae\n\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\5G\u01ed\nG\3H\3H\3"+
		"I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3L\5L\u01fc\nL\3M\3M\3N\3N\3N\5N\u0203\n"+
		"N\3O\3O\3P\3P\3P\3Q\3Q\3Q\5Q\u020d\nQ\3R\3R\3S\3S\5S\u0213\nS\3T\3T\3"+
		"T\3U\3U\3V\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0229\nZ\3[\3"+
		"[\3[\5[\u022e\n[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c"+
		"\3c\3d\3d\3d\5d\u0245\nd\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l"+
		"\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\4\u0108\u0155"+
		"\2v\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\23\67\249\25;\26=\27"+
		"?\30A\31C\32E\33G\34I\35K\36M\37O Q!S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60"+
		"q\61s\62u\63w\64y\65{\66}\67\1778\u00819\u0083:\u0085;\u0087<\u0089=\u008b"+
		">\u008d?\u008f@\u0091A\u0093B\u0095C\u0097D\u0099E\u009bF\u009dG\u009f"+
		"H\u00a1I\u00a3J\u00a5K\u00a7L\u00a9M\u00abN\u00adO\u00afP\u00b1Q\u00b3"+
		"R\u00b5S\u00b7T\u00b9U\u00bbV\u00bdW\u00bfX\u00c1Y\u00c3Z\u00c5[\u00c7"+
		"\\\u00c9]\u00cb^\u00cd_\u00cf`\u00d1a\u00d3b\u00d5c\u00d7d\u00d9e\u00db"+
		"f\u00ddg\u00dfh\u00e1i\u00e3j\u00e5k\u00e7l\u00e9m\3\2\r\4\2\f\f\17\17"+
		"\3\2\62;\3\2\629\5\2\62;CHch\4\2C\\c|\f\2\13\17\"\"\u0087\u0087\u00a2"+
		"\u00a2\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061\u3002"+
		"\u3002\4\2##\uff03\uff03\4\2<<\uff1c\uff1c\4\2==\uff1d\uff1d\4\2\60\60"+
		"\u3004\u3004\4\2..\uff0e\uff0e\7\u0093\2%\2%\2,\2,\2\62\2;\2\u00ab\2\u00ab"+
		"\2\u00b0\2\u00b0\2\u203e\2\u203e\2\u204b\2\u204b\2\u2124\2\u2124\2\u213b"+
		"\2\u213b\2\u2196\2\u219b\2\u21ab\2\u21ac\2\u231c\2\u231d\2\u232a\2\u232a"+
		"\2\u23d1\2\u23d1\2\u23eb\2\u23f5\2\u23fa\2\u23fc\2\u24c4\2\u24c4\2\u25ac"+
		"\2\u25ad\2\u25b8\2\u25b8\2\u25c2\2\u25c2\2\u25fd\2\u2600\2\u2602\2\u2606"+
		"\2\u2610\2\u2610\2\u2613\2\u2613\2\u2616\2\u2617\2\u261a\2\u261a\2\u261f"+
		"\2\u261f\2\u2622\2\u2622\2\u2624\2\u2625\2\u2628\2\u2628\2\u262c\2\u262c"+
		"\2\u2630\2\u2631\2\u263a\2\u263c\2\u2642\2\u2642\2\u2644\2\u2644\2\u264a"+
		"\2\u2655\2\u2662\2\u2662\2\u2665\2\u2665\2\u2667\2\u2668\2\u266a\2\u266a"+
		"\2\u267d\2\u267d\2\u2681\2\u2681\2\u2694\2\u2699\2\u269b\2\u269b\2\u269d"+
		"\2\u269e\2\u26a2\2\u26a3\2\u26ac\2\u26ad\2\u26b2\2\u26b3\2\u26bf\2\u26c0"+
		"\2\u26c6\2\u26c7\2\u26ca\2\u26ca\2\u26d0\2\u26d1\2\u26d3\2\u26d3\2\u26d5"+
		"\2\u26d6\2\u26eb\2\u26ec\2\u26f2\2\u26f7\2\u26f9\2\u26fc\2\u26ff\2\u26ff"+
		"\2\u2704\2\u2704\2\u2707\2\u2707\2\u270a\2\u270f\2\u2711\2\u2711\2\u2714"+
		"\2\u2714\2\u2716\2\u2716\2\u2718\2\u2718\2\u271f\2\u271f\2\u2723\2\u2723"+
		"\2\u272a\2\u272a\2\u2735\2\u2736\2\u2746\2\u2746\2\u2749\2\u2749\2\u274e"+
		"\2\u274e\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759\2\u2765\2\u2766"+
		"\2\u2797\2\u2799\2\u27a3\2\u27a3\2\u27b2\2\u27b2\2\u27c1\2\u27c1\2\u2936"+
		"\2\u2937\2\u2b07\2\u2b09\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52\2\u2b57\2\u2b57"+
		"\2\u3032\2\u3032\2\u303f\2\u303f\2\u3299\2\u3299\2\u329b\2\u329b\2\uf006"+
		"\3\uf006\3\uf0d1\3\uf0d1\3\uf172\3\uf173\3\uf180\3\uf181\3\uf190\3\uf190"+
		"\3\uf193\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf204\3\uf21c\3\uf21c\3\uf231"+
		"\3\uf231\3\uf234\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf323\3\uf326\3\uf395"+
		"\3\uf398\3\uf399\3\uf39b\3\uf39d\3\uf3a0\3\uf3f2\3\uf3f5\3\uf3f7\3\uf3f9"+
		"\3\uf4ff\3\uf501\3\uf53f\3\uf54b\3\uf550\3\uf552\3\uf569\3\uf571\3\uf572"+
		"\3\uf575\3\uf57c\3\uf589\3\uf589\3\uf58c\3\uf58f\3\uf592\3\uf592\3\uf597"+
		"\3\uf598\3\uf5a6\3\uf5a7\3\uf5aa\3\uf5aa\3\uf5b3\3\uf5b4\3\uf5be\3\uf5be"+
		"\3\uf5c4\3\uf5c6\3\uf5d3\3\uf5d5\3\uf5de\3\uf5e0\3\uf5e3\3\uf5e3\3\uf5e5"+
		"\3\uf5e5\3\uf5ea\3\uf5ea\3\uf5f1\3\uf5f1\3\uf5f5\3\uf5f5\3\uf5fc\3\uf651"+
		"\3\uf682\3\uf6c7\3\uf6cd\3\uf6d4\3\uf6e2\3\uf6e7\3\uf6eb\3\uf6eb\3\uf6ed"+
		"\3\uf6ee\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6fa\3\uf912\3\uf93c\3\uf93e\3\uf940"+
		"\3\uf942\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982\3\uf999\3\uf9c2"+
		"\3\uf9c2\3\uf9d2\3\uf9e8\3Y\2C\2\\\2c\2|\2\u00ac\2\u00ac\2\u00bc\2\u00bc"+
		"\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02ba\2\u02e2\2\u02e6\2\u0372"+
		"\2\u0375\2\u0377\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0386\2\u0386"+
		"\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5"+
		"\2\u03e3\2\u03f2\2\u0401\2\u1d02\2\u1d2c\2\u1d2e\2\u1d79\2\u1d7b\2\u1dc1"+
		"\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52"+
		"\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f"+
		"\2\u1f82\2\u1fb6\2\u1fb8\2\u1fc6\2\u1fc8\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fdf"+
		"\2\u1ff1\2\u1ff4\2\u1ff6\2\u1ff8\2\u2000\2\u2073\2\u2073\2\u2081\2\u2081"+
		"\2\u2092\2\u209e\2\u2128\2\u2128\2\u212c\2\u212d\2\u2134\2\u2134\2\u2150"+
		"\2\u2150\2\u2162\2\u218a\2\u2c62\2\u2c81\2\u2e82\2\u2e9b\2\u2e9d\2\u2ef5"+
		"\2\u2f02\2\u2fd7\2\u3007\2\u3007\2\u3009\2\u3009\2\u3023\2\u302b\2\u303a"+
		"\2\u303d\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30ff\2\u3101"+
		"\2\u31f2\2\u3201\2\u32d2\2\u3300\2\u3302\2\u3359\2\u3402\2\u4db7\2\u4e02"+
		"\2\u9fec\2\ua724\2\ua789\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua801"+
		"\2\uab32\2\uab5c\2\uab5e\2\uab67\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02"+
		"\2\ufb08\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uff71\2\uff73\2\uff9f"+
		"\2\u0142\3\u0190\3\u01a2\3\u01a2\3\ub002\3\ub120\3\ud202\3\ud247\3\uf202"+
		"\3\uf202\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4"+
		"\uceb2\4\uebe2\4\uf802\4\ufa1f\4\3\2\ud53b\3\ud53b\3\3\2\ud542\3\ud542"+
		"\3\3\2\ud54c\3\ud54c\3\u027d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
		"\2\2\u00e9\3\2\2\2\3\u00eb\3\2\2\2\5\u00ed\3\2\2\2\7\u00ef\3\2\2\2\t\u00f1"+
		"\3\2\2\2\13\u00f3\3\2\2\2\r\u00f5\3\2\2\2\17\u00f7\3\2\2\2\21\u00fb\3"+
		"\2\2\2\23\u0104\3\2\2\2\25\u0110\3\2\2\2\27\u011b\3\2\2\2\31\u0121\3\2"+
		"\2\2\33\u0123\3\2\2\2\35\u012c\3\2\2\2\37\u0140\3\2\2\2!\u0143\3\2\2\2"+
		"#\u0147\3\2\2\2%\u0149\3\2\2\2\'\u014b\3\2\2\2)\u014d\3\2\2\2+\u014f\3"+
		"\2\2\2-\u0151\3\2\2\2/\u015a\3\2\2\2\61\u015e\3\2\2\2\63\u0162\3\2\2\2"+
		"\65\u0164\3\2\2\2\67\u0166\3\2\2\29\u0168\3\2\2\2;\u016a\3\2\2\2=\u016f"+
		"\3\2\2\2?\u0174\3\2\2\2A\u0176\3\2\2\2C\u0178\3\2\2\2E\u017e\3\2\2\2G"+
		"\u0183\3\2\2\2I\u0185\3\2\2\2K\u0188\3\2\2\2M\u018e\3\2\2\2O\u0193\3\2"+
		"\2\2Q\u0195\3\2\2\2S\u0198\3\2\2\2U\u019a\3\2\2\2W\u019d\3\2\2\2Y\u01a0"+
		"\3\2\2\2[\u01a2\3\2\2\2]\u01a4\3\2\2\2_\u01a7\3\2\2\2a\u01ad\3\2\2\2c"+
		"\u01af\3\2\2\2e\u01b1\3\2\2\2g\u01b5\3\2\2\2i\u01b8\3\2\2\2k\u01ba\3\2"+
		"\2\2m\u01bc\3\2\2\2o\u01be\3\2\2\2q\u01c0\3\2\2\2s\u01c4\3\2\2\2u\u01c7"+
		"\3\2\2\2w\u01ca\3\2\2\2y\u01cc\3\2\2\2{\u01ce\3\2\2\2}\u01d2\3\2\2\2\177"+
		"\u01d5\3\2\2\2\u0081\u01d7\3\2\2\2\u0083\u01da\3\2\2\2\u0085\u01dc\3\2"+
		"\2\2\u0087\u01de\3\2\2\2\u0089\u01e2\3\2\2\2\u008b\u01e6\3\2\2\2\u008d"+
		"\u01ec\3\2\2\2\u008f\u01ee\3\2\2\2\u0091\u01f0\3\2\2\2\u0093\u01f3\3\2"+
		"\2\2\u0095\u01f6\3\2\2\2\u0097\u01fb\3\2\2\2\u0099\u01fd\3\2\2\2\u009b"+
		"\u0202\3\2\2\2\u009d\u0204\3\2\2\2\u009f\u0206\3\2\2\2\u00a1\u020c\3\2"+
		"\2\2\u00a3\u020e\3\2\2\2\u00a5\u0212\3\2\2\2\u00a7\u0214\3\2\2\2\u00a9"+
		"\u0217\3\2\2\2\u00ab\u0219\3\2\2\2\u00ad\u021d\3\2\2\2\u00af\u0220\3\2"+
		"\2\2\u00b1\u0223\3\2\2\2\u00b3\u0228\3\2\2\2\u00b5\u022d\3\2\2\2\u00b7"+
		"\u022f\3\2\2\2\u00b9\u0231\3\2\2\2\u00bb\u0233\3\2\2\2\u00bd\u0235\3\2"+
		"\2\2\u00bf\u0237\3\2\2\2\u00c1\u0239\3\2\2\2\u00c3\u023b\3\2\2\2\u00c5"+
		"\u023d\3\2\2\2\u00c7\u0244\3\2\2\2\u00c9\u0246\3\2\2\2\u00cb\u0248\3\2"+
		"\2\2\u00cd\u024a\3\2\2\2\u00cf\u024c\3\2\2\2\u00d1\u024e\3\2\2\2\u00d3"+
		"\u0250\3\2\2\2\u00d5\u0252\3\2\2\2\u00d7\u0254\3\2\2\2\u00d9\u0256\3\2"+
		"\2\2\u00db\u0258\3\2\2\2\u00dd\u025a\3\2\2\2\u00df\u025c\3\2\2\2\u00e1"+
		"\u025e\3\2\2\2\u00e3\u0260\3\2\2\2\u00e5\u0262\3\2\2\2\u00e7\u0264\3\2"+
		"\2\2\u00e9\u0266\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec\4\3\2\2\2\u00ed\u00ee"+
		"\7+\2\2\u00ee\6\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0\b\3\2\2\2\u00f1\u00f2"+
		"\7_\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\7}\2\2\u00f4\f\3\2\2\2\u00f5\u00f6"+
		"\7\177\2\2\u00f6\16\3\2\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7y\2\2\u00fa\20\3\2\2\2\u00fb\u00ff\5\u00a7T\2\u00fc\u00fe\n\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b\t"+
		"\2\2\u0103\22\3\2\2\2\u0104\u0108\5{>\2\u0105\u0107\13\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5{>\2\u010c\u010d\3\2\2"+
		"\2\u010d\u010e\b\n\2\2\u010e\24\3\2\2\2\u010f\u0111\5+\26\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\b\13\3\2\u0115\26\3\2\2\2\u0116\u0118\7\17"+
		"\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011c\7\f\2\2\u011a\u011c\7\17\2\2\u011b\u0117\3\2\2\2\u011b\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\b\f\3\2\u0120\30\3\2\2\2\u0121\u0122\5-\27"+
		"\2\u0122\32\3\2\2\2\u0123\u0127\5\63\32\2\u0124\u0126\5\61\31\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\34\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012d\5!\21\2\u012b\u012d"+
		"\5\37\20\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\36\3\2\2\2\u012e"+
		"\u0130\5#\22\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\5\u00cbf\2\u0134"+
		"\u0136\5#\22\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0141\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\5\u00cbf\2\u013b\u013d\5#\22\2\u013c\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u012f\3\2\2\2\u0140\u013a\3\2\2\2\u0141 \3\2\2\2\u0142\u0144\5#\22\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\"\3\2\2\2\u0147\u0148\t\3\2\2\u0148$\3\2\2\2\u0149\u014a"+
		"\t\4\2\2\u014a&\3\2\2\2\u014b\u014c\t\5\2\2\u014c(\3\2\2\2\u014d\u014e"+
		"\t\6\2\2\u014e*\3\2\2\2\u014f\u0150\t\7\2\2\u0150,\3\2\2\2\u0151\u0155"+
		"\5\u00bf`\2\u0152\u0154\13\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0159\5\u00bf`\2\u0159.\3\2\2\2\u015a\u015b\t\r\2\2\u015b"+
		"\60\3\2\2\2\u015c\u015f\5\63\32\2\u015d\u015f\5#\22\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015d\3\2\2\2\u015f\62\3\2\2\2\u0160\u0163\5\u00a9U\2\u0161"+
		"\u0163\t\16\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\64\3\2\2"+
		"\2\u0164\u0165\7\u230a\2\2\u0165\66\3\2\2\2\u0166\u0167\7\u230b\2\2\u0167"+
		"8\3\2\2\2\u0168\u0169\7\u230c\2\2\u0169:\3\2\2\2\u016a\u016b\7\u230d\2"+
		"\2\u016b<\3\2\2\2\u016c\u016d\7>\2\2\u016d\u0170\7~\2\2\u016e\u0170\7"+
		"\u27ea\2\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2\2\2\u0170>\3\2\2\2\u0171"+
		"\u0172\7~\2\2\u0172\u0175\7@\2\2\u0173\u0175\7\u27eb\2\2\u0174\u0171\3"+
		"\2\2\2\u0174\u0173\3\2\2\2\u0175@\3\2\2\2\u0176\u0177\7\u201e\2\2\u0177"+
		"B\3\2\2\2\u0178\u0179\7\u201f\2\2\u0179D\3\2\2\2\u017a\u017b\7>\2\2\u017b"+
		"\u017c\7>\2\2\u017c\u017f\7>\2\2\u017d\u017f\7\u22da\2\2\u017e\u017a\3"+
		"\2\2\2\u017e\u017d\3\2\2\2\u017fF\3\2\2\2\u0180\u0181\7>\2\2\u0181\u0184"+
		"\7>\2\2\u0182\u0184\7\u226c\2\2\u0183\u0180\3\2\2\2\u0183\u0182\3\2\2"+
		"\2\u0184H\3\2\2\2\u0185\u0186\7>\2\2\u0186\u0187\7?\2\2\u0187J\3\2\2\2"+
		"\u0188\u0189\7>\2\2\u0189L\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7@\2"+
		"\2\u018c\u018f\7@\2\2\u018d\u018f\7\u22db\2\2\u018e\u018a\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018fN\3\2\2\2\u0190\u0191\7@\2\2\u0191\u0194\7@\2\2\u0192"+
		"\u0194\7\u226d\2\2\u0193\u0190\3\2\2\2\u0193\u0192\3\2\2\2\u0194P\3\2"+
		"\2\2\u0195\u0196\7@\2\2\u0196\u0197\7?\2\2\u0197R\3\2\2\2\u0198\u0199"+
		"\7@\2\2\u0199T\3\2\2\2\u019a\u019b\7-\2\2\u019b\u019c\7-\2\2\u019cV\3"+
		"\2\2\2\u019d\u019e\7-\2\2\u019e\u019f\7?\2\2\u019fX\3\2\2\2\u01a0\u01a1"+
		"\7-\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\7\u2297\2\2\u01a3\\\3\2\2\2\u01a4\u01a5"+
		"\7/\2\2\u01a5\u01a6\7/\2\2\u01a6^\3\2\2\2\u01a7\u01a8\7/\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9`\3\2\2\2\u01aa\u01ab\7/\2\2\u01ab\u01ae\7@\2\2\u01ac\u01ae"+
		"\7\u2194\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeb\3\2\2\2\u01af"+
		"\u01b0\7/\2\2\u01b0d\3\2\2\2\u01b1\u01b2\7,\2\2\u01b2\u01b3\7,\2\2\u01b3"+
		"\u01b4\7,\2\2\u01b4f\3\2\2\2\u01b5\u01b6\7,\2\2\u01b6\u01b7\7,\2\2\u01b7"+
		"h\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9j\3\2\2\2\u01ba\u01bb\7\u00d9\2\2\u01bb"+
		"l\3\2\2\2\u01bc\u01bd\7\u2299\2\2\u01bdn\3\2\2\2\u01be\u01bf\7\u229b\2"+
		"\2\u01bfp\3\2\2\2\u01c0\u01c1\7\61\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c3"+
		"\7B\2\2\u01c3r\3\2\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\7\61\2\2\u01c6"+
		"t\3\2\2\2\u01c7\u01c8\7\61\2\2\u01c8\u01c9\7B\2\2\u01c9v\3\2\2\2\u01ca"+
		"\u01cb\7\61\2\2\u01cbx\3\2\2\2\u01cc\u01cd\7\u00f9\2\2\u01cdz\3\2\2\2"+
		"\u01ce\u01cf\7\'\2\2\u01cf\u01d0\7\'\2\2\u01d0\u01d1\7\'\2\2\u01d1|\3"+
		"\2\2\2\u01d2\u01d3\7\'\2\2\u01d3\u01d4\7\'\2\2\u01d4~\3\2\2\2\u01d5\u01d6"+
		"\7\'\2\2\u01d6\u0080\3\2\2\2\u01d7\u01d8\7`\2\2\u01d8\u01d9\7`\2\2\u01d9"+
		"\u0082\3\2\2\2\u01da\u01db\7`\2\2\u01db\u0084\3\2\2\2\u01dc\u01dd\7\u221c"+
		"\2\2\u01dd\u0086\3\2\2\2\u01de\u01df\7?\2\2\u01df\u01e0\7?\2\2\u01e0\u01e1"+
		"\7?\2\2\u01e1\u0088\3\2\2\2\u01e2\u01e3\7?\2\2\u01e3\u01e4\7#\2\2\u01e4"+
		"\u01e5\7?\2\2\u01e5\u008a\3\2\2\2\u01e6\u01e7\7?\2\2\u01e7\u01e8\7?\2"+
		"\2\u01e8\u008c\3\2\2\2\u01e9\u01ea\7?\2\2\u01ea\u01ed\7@\2\2\u01eb\u01ed"+
		"\7\u27fb\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u008e\3\2\2"+
		"\2\u01ee\u01ef\7?\2\2\u01ef\u0090\3\2\2\2\u01f0\u01f1\7\u0080\2\2\u01f1"+
		"\u01f2\7\u0080\2\2\u01f2\u0092\3\2\2\2\u01f3\u01f4\7\u0080\2\2\u01f4\u01f5"+
		"\7?\2\2\u01f5\u0094\3\2\2\2\u01f6\u01f7\7\u0080\2\2\u01f7\u0096\3\2\2"+
		"\2\u01f8\u01f9\7~\2\2\u01f9\u01fc\7~\2\2\u01fa\u01fc\7\u2229\2\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u0098\3\2\2\2\u01fd\u01fe\7~"+
		"\2\2\u01fe\u009a\3\2\2\2\u01ff\u0200\7(\2\2\u0200\u0203\7(\2\2\u0201\u0203"+
		"\7\u222a\2\2\u0202\u01ff\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u009c\3\2\2"+
		"\2\u0204\u0205\7(\2\2\u0205\u009e\3\2\2\2\u0206\u0207\7#\2\2\u0207\u0208"+
		"\7#\2\2\u0208\u00a0\3\2\2\2\u0209\u020a\7#\2\2\u020a\u020d\7?\2\2\u020b"+
		"\u020d\7\u2262\2\2\u020c\u0209\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u00a2"+
		"\3\2\2\2\u020e\u020f\t\b\2\2\u020f\u00a4\3\2\2\2\u0210\u0213\5\u009fP"+
		"\2\u0211\u0213\7\u00ae\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u00a6\3\2\2\2\u0214\u0215\7%\2\2\u0215\u0216\7#\2\2\u0216\u00a8\3\2\2"+
		"\2\u0217\u0218\7&\2\2\u0218\u00aa\3\2\2\2\u0219\u021a\7B\2\2\u021a\u021b"+
		"\7B\2\2\u021b\u021c\7B\2\2\u021c\u00ac\3\2\2\2\u021d\u021e\7B\2\2\u021e"+
		"\u021f\7B\2\2\u021f\u00ae\3\2\2\2\u0220\u0221\7B\2\2\u0221\u0222\7?\2"+
		"\2\u0222\u00b0\3\2\2\2\u0223\u0224\7B\2\2\u0224\u00b2\3\2\2\2\u0225\u0226"+
		"\7<\2\2\u0226\u0229\7<\2\2\u0227\u0229\7\u2239\2\2\u0228\u0225\3\2\2\2"+
		"\u0228\u0227\3\2\2\2\u0229\u00b4\3\2\2\2\u022a\u022b\7<\2\2\u022b\u022e"+
		"\7?\2\2\u022c\u022e\7\u2256\2\2\u022d\u022a\3\2\2\2\u022d\u022c\3\2\2"+
		"\2\u022e\u00b6\3\2\2\2\u022f\u0230\t\t\2\2\u0230\u00b8\3\2\2\2\u0231\u0232"+
		"\t\n\2\2\u0232\u00ba\3\2\2\2\u0233\u0234\7b\2\2\u0234\u00bc\3\2\2\2\u0235"+
		"\u0236\7\u00b6\2\2\u0236\u00be\3\2\2\2\u0237\u0238\7$\2\2\u0238\u00c0"+
		"\3\2\2\2\u0239\u023a\7)\2\2\u023a\u00c2\3\2\2\2\u023b\u023c\7a\2\2\u023c"+
		"\u00c4\3\2\2\2\u023d\u023e\7\60\2\2\u023e\u023f\7\60\2\2\u023f\u0240\7"+
		"\60\2\2\u0240\u00c6\3\2\2\2\u0241\u0242\7\60\2\2\u0242\u0245\7?\2\2\u0243"+
		"\u0245\7\u2252\2\2\u0244\u0241\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u00c8"+
		"\3\2\2\2\u0246\u0247\t\13\2\2\u0247\u00ca\3\2\2\2\u0248\u0249\7\u22c7"+
		"\2\2\u0249\u00cc\3\2\2\2\u024a\u024b\t\f\2\2\u024b\u00ce\3\2\2\2\u024c"+
		"\u024d\7\u2161\2\2\u024d\u00d0\3\2\2\2\u024e\u024f\7\u00b2\2\2\u024f\u00d2"+
		"\3\2\2\2\u0250\u0251\7\u1d42\2\2\u0251\u00d4\3\2\2\2\u0252\u0253\7\u1d36"+
		"\2\2\u0253\u00d6\3\2\2\2\u0254\u0255\7\u2104\2\2\u0255\u00d8\3\2\2\2\u0256"+
		"\u0257\7\u211f\2\2\u0257\u00da\3\2\2\2\u0258\u0259\7\u2126\2\2\u0259\u00dc"+
		"\3\2\2\2\u025a\u025b\t\17\2\2\u025b\u00de\3\2\2\2\u025c\u025d\t\20\2\2"+
		"\u025d\u00e0\3\2\2\2\u025e\u025f\t\21\2\2\u025f\u00e2\3\2\2\2\u0260\u0261"+
		"\7\u00a9\2\2\u0261\u00e4\3\2\2\2\u0262\u0263\7\u00b8\2\2\u0263\u00e6\3"+
		"\2\2\2\u0264\u0265\7\u00a6\2\2\u0265\u00e8\3\2\2\2\u0266\u0267\7\u220a"+
		"\2\2\u0267\u00ea\3\2\2\2\"\2\u00ff\u0108\u0112\u0117\u011b\u011d\u0127"+
		"\u012c\u0131\u0137\u013e\u0140\u0145\u0155\u015e\u0162\u016f\u0174\u017e"+
		"\u0183\u018e\u0193\u01ad\u01ec\u01fb\u0202\u020c\u0212\u0228\u022d\u0244"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}