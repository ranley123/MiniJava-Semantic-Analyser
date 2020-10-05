// Generated from MiniJavaGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, ESC=4, AND=5, LT=6, PLUS=7, MINUS=8, 
		MUL=9, CLASS=10, PUBLIC=11, STATIC=12, VOID=13, MAIN=14, STRING=15, EXTENDS=16, 
		RETURN=17, WHILE=18, IF=19, ELSE=20, BOOLEAN=21, INT=22, FLOAT=23, SYSTEMOUT=24, 
		LENGTH=25, NEW=26, THIS=27, TRUE=28, FALSE=29, NOT=30, DOT=31, COMMA=32, 
		SEMICOLON=33, LBRACE=34, RBRACE=35, LPAREN=36, RPAREN=37, LSQUARE=38, 
		RSQUARE=39, EQUALS=40, ID=41, LETTER=42, INTEGER=43, FLOATNUM=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "LINE_COMMENT", "ESC", "AND", "LT", "PLUS", "MINUS", 
			"MUL", "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", 
			"RETURN", "WHILE", "IF", "ELSE", "BOOLEAN", "INT", "FLOAT", "SYSTEMOUT", 
			"LENGTH", "NEW", "THIS", "TRUE", "FALSE", "NOT", "DOT", "COMMA", "SEMICOLON", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "EQUALS", 
			"ID", "LETTER", "INTEGER", "FLOATNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'&&'", "'<'", "'+'", "'-'", "'*'", "'class'", 
			"'public'", "'static'", "'void'", "'main'", "'String'", "'extends'", 
			"'return'", "'while'", "'if'", "'else'", "'boolean'", "'int'", "'float'", 
			"'System.out.println'", "'length'", "'new'", "'this'", "'true'", "'false'", 
			"'!'", "'.'", "','", "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "ESC", "AND", "LT", "PLUS", "MINUS", 
			"MUL", "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", 
			"RETURN", "WHILE", "IF", "ELSE", "BOOLEAN", "INT", "FLOAT", "SYSTEMOUT", 
			"LENGTH", "NEW", "THIS", "TRUE", "FALSE", "NOT", "DOT", "COMMA", "SEMICOLON", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "EQUALS", 
			"ID", "LETTER", "INTEGER", "FLOATNUM"
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


	public MiniJavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\5\2^\n\2\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4y"+
		"\n\4\f\4\16\4|\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\7*\u012b\n*\f*\16*\u012e\13"+
		"*\3+\5+\u0131\n+\3,\6,\u0134\n,\r,\16,\u0135\3-\6-\u0139\n-\r-\16-\u013a"+
		"\3-\3-\6-\u013f\n-\r-\16-\u0140\4lz\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3"+
		"\2\7\4\2\13\13\"\"\b\2$$^^ddppttvv\3\2\62;\5\2C\\aac|\3\2\60\60\2\u014b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3`\3\2\2\2\5f\3\2\2\2\7t\3\2\2\2\t\u0081"+
		"\3\2\2\2\13\u0084\3\2\2\2\r\u0087\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3"+
		"\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0095\3\2\2\2\31\u009c\3\2"+
		"\2\2\33\u00a3\3\2\2\2\35\u00a8\3\2\2\2\37\u00ad\3\2\2\2!\u00b4\3\2\2\2"+
		"#\u00bc\3\2\2\2%\u00c3\3\2\2\2\'\u00c9\3\2\2\2)\u00cc\3\2\2\2+\u00d1\3"+
		"\2\2\2-\u00d9\3\2\2\2/\u00dd\3\2\2\2\61\u00e3\3\2\2\2\63\u00f6\3\2\2\2"+
		"\65\u00fd\3\2\2\2\67\u0101\3\2\2\29\u0106\3\2\2\2;\u010b\3\2\2\2=\u0111"+
		"\3\2\2\2?\u0113\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G"+
		"\u011b\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0127\3\2\2\2U\u0130\3\2\2\2W\u0133\3\2\2\2Y\u0138"+
		"\3\2\2\2[a\t\2\2\2\\^\7\17\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\f\2"+
		"\2`[\3\2\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\2\2"+
		"\2e\4\3\2\2\2fg\7\61\2\2gh\7,\2\2hl\3\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2"+
		"\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2pq\7\61\2\2qr\3\2"+
		"\2\2rs\b\3\2\2s\6\3\2\2\2tu\7\61\2\2uv\7\61\2\2vz\3\2\2\2wy\13\2\2\2x"+
		"w\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\f\2\2"+
		"~\177\3\2\2\2\177\u0080\b\4\2\2\u0080\b\3\2\2\2\u0081\u0082\7^\2\2\u0082"+
		"\u0083\t\3\2\2\u0083\n\3\2\2\2\u0084\u0085\7(\2\2\u0085\u0086\7(\2\2\u0086"+
		"\f\3\2\2\2\u0087\u0088\7>\2\2\u0088\16\3\2\2\2\u0089\u008a\7-\2\2\u008a"+
		"\20\3\2\2\2\u008b\u008c\7/\2\2\u008c\22\3\2\2\2\u008d\u008e\7,\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\26\3\2\2\2\u0095\u0096\7r\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u0098\7d\2\2\u0098\u0099\7n\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7e\2\2\u009b\30\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7"+
		"v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7e\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7f\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\36\3\2\2\2\u00ad\u00ae"+
		"\7U\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7z\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2"+
		"\u00b9\u00ba\7f\2\2\u00ba\u00bb\7u\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7t"+
		"\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7p\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5"+
		"\7j\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"&\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7h\2\2\u00cb(\3\2\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8,\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2"+
		"\2\u00dc.\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7"+
		"q\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\60\3\2\2\2\u00e3\u00e4"+
		"\7U\2\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7q\2"+
		"\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef"+
		"\7r\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7p\2\2\u00f5\62\3\2\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7i\2\2"+
		"\u00fa\u00fb\7v\2\2\u00fb\u00fc\7j\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7"+
		"p\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7y\2\2\u0100\66\3\2\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7u\2\2\u0105"+
		"8\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7w\2\2\u0109"+
		"\u010a\7g\2\2\u010a:\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f\u0110\7g\2\2\u0110<\3\2\2\2\u0111"+
		"\u0112\7#\2\2\u0112>\3\2\2\2\u0113\u0114\7\60\2\2\u0114@\3\2\2\2\u0115"+
		"\u0116\7.\2\2\u0116B\3\2\2\2\u0117\u0118\7=\2\2\u0118D\3\2\2\2\u0119\u011a"+
		"\7}\2\2\u011aF\3\2\2\2\u011b\u011c\7\177\2\2\u011cH\3\2\2\2\u011d\u011e"+
		"\7*\2\2\u011eJ\3\2\2\2\u011f\u0120\7+\2\2\u0120L\3\2\2\2\u0121\u0122\7"+
		"]\2\2\u0122N\3\2\2\2\u0123\u0124\7_\2\2\u0124P\3\2\2\2\u0125\u0126\7?"+
		"\2\2\u0126R\3\2\2\2\u0127\u012c\5U+\2\u0128\u012b\5U+\2\u0129\u012b\t"+
		"\4\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dT\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0131\t\5\2\2\u0130\u012f\3\2\2\2\u0131V\3\2\2\2\u0132\u0134\t"+
		"\4\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136X\3\2\2\2\u0137\u0139\t\4\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\t\6\2\2\u013d\u013f\t\4\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141Z\3\2\2\2"+
		"\16\2]`blz\u012a\u012c\u0130\u0135\u013a\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}