// Generated from MiniJavaGrammar.g by ANTLR 4.7.2
package utils;
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
		RETURN=17, WHILE=18, IF=19, ELSE=20, BOOLEAN=21, INT=22, SYSTEMOUT=23, 
		LENGTH=24, NEW=25, THIS=26, TRUE=27, FALSE=28, NOT=29, DOT=30, COMMA=31, 
		SEMICOLON=32, LBRACE=33, RBRACE=34, LPAREN=35, RPAREN=36, LSQUARE=37, 
		RSQUARE=38, EQUALS=39, ID=40, LETTER=41, INTEGER=42;
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
			"RETURN", "WHILE", "IF", "ELSE", "BOOLEAN", "INT", "SYSTEMOUT", "LENGTH", 
			"NEW", "THIS", "TRUE", "FALSE", "NOT", "DOT", "COMMA", "SEMICOLON", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "EQUALS", "ID", "LETTER", 
			"INTEGER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'&&'", "'<'", "'+'", "'-'", "'*'", "'class'", 
			"'public'", "'static'", "'void'", "'main'", "'String'", "'extends'", 
			"'return'", "'while'", "'if'", "'else'", "'boolean'", "'int'", "'System.out.println'", 
			"'length'", "'new'", "'this'", "'true'", "'false'", "'!'", "'.'", "','", 
			"';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "ESC", "AND", "LT", "PLUS", "MINUS", 
			"MUL", "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", 
			"RETURN", "WHILE", "IF", "ELSE", "BOOLEAN", "INT", "SYSTEMOUT", "LENGTH", 
			"NEW", "THIS", "TRUE", "FALSE", "NOT", "DOT", "COMMA", "SEMICOLON", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "EQUALS", "ID", "LETTER", 
			"INTEGER"
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
	public String getGrammarFileName() { return "MiniJavaGrammar.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\5\2Z\n\2\3\2\6\2]\n\2\r\2\16\2^\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n"+
		"\3\f\3\16\3j\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4u\n\4\f\4\16"+
		"\4x\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3)\7)\u0121\n)\f)\16)\u0124\13)\3*\5*\u0127\n*\3+\6+\u012a\n+\r+\16+"+
		"\u012b\4hv\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\6\4\2\13\13\"\"\b\2$$^"+
		"^ddppttvv\3\2\62;\5\2C\\aac|\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3\\\3\2\2\2\5b\3\2\2\2\7"+
		"p\3\2\2\2\t}\3\2\2\2\13\u0080\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2"+
		"\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u0091\3\2\2\2\31"+
		"\u0098\3\2\2\2\33\u009f\3\2\2\2\35\u00a4\3\2\2\2\37\u00a9\3\2\2\2!\u00b0"+
		"\3\2\2\2#\u00b8\3\2\2\2%\u00bf\3\2\2\2\'\u00c5\3\2\2\2)\u00c8\3\2\2\2"+
		"+\u00cd\3\2\2\2-\u00d5\3\2\2\2/\u00d9\3\2\2\2\61\u00ec\3\2\2\2\63\u00f3"+
		"\3\2\2\2\65\u00f7\3\2\2\2\67\u00fc\3\2\2\29\u0101\3\2\2\2;\u0107\3\2\2"+
		"\2=\u0109\3\2\2\2?\u010b\3\2\2\2A\u010d\3\2\2\2C\u010f\3\2\2\2E\u0111"+
		"\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K\u0117\3\2\2\2M\u0119\3\2\2\2O"+
		"\u011b\3\2\2\2Q\u011d\3\2\2\2S\u0126\3\2\2\2U\u0129\3\2\2\2W]\t\2\2\2"+
		"XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\f\2\2\\W\3\2\2\2\\Y\3\2"+
		"\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\2\2\2a\4\3\2\2\2bc\7"+
		"\61\2\2cd\7,\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf"+
		"\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b\3\2\2o"+
		"\6\3\2\2\2pq\7\61\2\2qr\7\61\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2"+
		"\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\f\2\2z{\3\2\2\2{|\b\4"+
		"\2\2|\b\3\2\2\2}~\7^\2\2~\177\t\3\2\2\177\n\3\2\2\2\u0080\u0081\7(\2\2"+
		"\u0081\u0082\7(\2\2\u0082\f\3\2\2\2\u0083\u0084\7>\2\2\u0084\16\3\2\2"+
		"\2\u0085\u0086\7-\2\2\u0086\20\3\2\2\2\u0087\u0088\7/\2\2\u0088\22\3\2"+
		"\2\2\u0089\u008a\7,\2\2\u008a\24\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d"+
		"\7n\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\u0090\7u\2\2\u0090"+
		"\26\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093\7w\2\2\u0093\u0094\7d\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7e\2\2\u0097\30\3\2\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7e\2\2\u009e\32\3\2\2\2\u009f\u00a0\7"+
		"x\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7f\2\2\u00a3\34"+
		"\3\2\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2"+
		"\u00af \3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7z\2\2\u00b2\u00b3\7v\2"+
		"\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7p\2\2\u00be"+
		"$\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7h\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2\u00d3\7c\2\2\u00d3\u00d4\7p\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7k\2"+
		"\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8.\3\2\2\2\u00d9\u00da\7"+
		"U\2\2\u00da\u00db\7{\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5\7r\2"+
		"\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7p\2\2\u00eb\60\3\2\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7i\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00f2\7j\2\2\u00f2\62\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7y\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7j\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\66\3\2\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7g\2\2"+
		"\u01008\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7c\2\2\u0103\u0104\7n\2"+
		"\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106:\3\2\2\2\u0107\u0108\7"+
		"#\2\2\u0108<\3\2\2\2\u0109\u010a\7\60\2\2\u010a>\3\2\2\2\u010b\u010c\7"+
		".\2\2\u010c@\3\2\2\2\u010d\u010e\7=\2\2\u010eB\3\2\2\2\u010f\u0110\7}"+
		"\2\2\u0110D\3\2\2\2\u0111\u0112\7\177\2\2\u0112F\3\2\2\2\u0113\u0114\7"+
		"*\2\2\u0114H\3\2\2\2\u0115\u0116\7+\2\2\u0116J\3\2\2\2\u0117\u0118\7]"+
		"\2\2\u0118L\3\2\2\2\u0119\u011a\7_\2\2\u011aN\3\2\2\2\u011b\u011c\7?\2"+
		"\2\u011cP\3\2\2\2\u011d\u0122\5S*\2\u011e\u0121\5S*\2\u011f\u0121\t\4"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123R\3\2\2\2\u0124\u0122\3\2\2\2"+
		"\u0125\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127T\3\2\2\2\u0128\u012a\t"+
		"\4\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cV\3\2\2\2\f\2Y\\^hv\u0120\u0122\u0126\u012b\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}