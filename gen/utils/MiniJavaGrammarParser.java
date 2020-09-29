// Generated from /home/ranley/Desktop/CS4201/SemanticAnalyser/src/utils/MiniJavaGrammar.g4 by ANTLR 4.8
package utils;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_program = 0, RULE_mainclass = 1, RULE_classdecl = 2, RULE_vardecl = 3, 
		RULE_methoddecl = 4, RULE_formallist = 5, RULE_formalrest = 6, RULE_type = 7, 
		RULE_statement = 8, RULE_expr = 9, RULE_op = 10, RULE_exprlist = 11, RULE_exprrest = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainclass", "classdecl", "vardecl", "methoddecl", "formallist", 
			"formalrest", "type", "statement", "expr", "op", "exprlist", "exprrest"
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

	@Override
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainclassContext mainclass() {
			return getRuleContext(MainclassContext.class,0);
		}
		public List<ClassdeclContext> classdecl() {
			return getRuleContexts(ClassdeclContext.class);
		}
		public ClassdeclContext classdecl(int i) {
			return getRuleContext(ClassdeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(26);
			mainclass();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(27);
				classdecl();
				}
				}
				setState(32);
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

	public static class MainclassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaGrammarParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniJavaGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaGrammarParser.ID, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(MiniJavaGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MiniJavaGrammarParser.LBRACE, i);
		}
		public TerminalNode PUBLIC() { return getToken(MiniJavaGrammarParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaGrammarParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(MiniJavaGrammarParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MiniJavaGrammarParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaGrammarParser.STRING, 0); }
		public TerminalNode LSQUARE() { return getToken(MiniJavaGrammarParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MiniJavaGrammarParser.RSQUARE, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaGrammarParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MiniJavaGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MiniJavaGrammarParser.RBRACE, i);
		}
		public MainclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMainclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMainclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMainclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainclassContext mainclass() throws RecognitionException {
		MainclassContext _localctx = new MainclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(CLASS);
			setState(34);
			match(ID);
			setState(35);
			match(LBRACE);
			setState(36);
			match(PUBLIC);
			setState(37);
			match(STATIC);
			setState(38);
			match(VOID);
			setState(39);
			match(MAIN);
			setState(40);
			match(LPAREN);
			setState(41);
			match(STRING);
			setState(42);
			match(LSQUARE);
			setState(43);
			match(RSQUARE);
			setState(44);
			match(ID);
			setState(45);
			match(RPAREN);
			setState(46);
			match(LBRACE);
			setState(47);
			statement();
			setState(48);
			match(RBRACE);
			setState(49);
			match(RBRACE);
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

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaGrammarParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniJavaGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaGrammarParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(MiniJavaGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaGrammarParser.RBRACE, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(MiniJavaGrammarParser.EXTENDS, 0); }
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitClassdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classdecl);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(CLASS);
				setState(52);
				match(ID);
				setState(53);
				match(LBRACE);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << ID))) != 0)) {
					{
					{
					setState(54);
					vardecl();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUBLIC) {
					{
					{
					setState(60);
					methoddecl();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(CLASS);
				setState(68);
				match(ID);
				setState(69);
				match(EXTENDS);
				setState(70);
				match(ID);
				setState(71);
				match(LBRACE);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << ID))) != 0)) {
					{
					{
					setState(72);
					vardecl();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUBLIC) {
					{
					{
					setState(78);
					methoddecl();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(RBRACE);
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

	public static class VardeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			match(ID);
			setState(89);
			match(SEMICOLON);
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

	public static class MethoddeclContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiniJavaGrammarParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniJavaGrammarParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaGrammarParser.RBRACE, 0); }
		public FormallistContext formallist() {
			return getRuleContext(FormallistContext.class,0);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methoddecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PUBLIC);
			setState(92);
			type();
			setState(93);
			match(ID);
			setState(94);
			match(LPAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(95);
				formallist();
				}
			}

			setState(98);
			match(RPAREN);
			setState(99);
			match(LBRACE);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					vardecl();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SYSTEMOUT) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RETURN);
			setState(113);
			expr(0);
			setState(114);
			match(SEMICOLON);
			setState(115);
			match(RBRACE);
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

	public static class FormallistContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public List<FormalrestContext> formalrest() {
			return getRuleContexts(FormalrestContext.class);
		}
		public FormalrestContext formalrest(int i) {
			return getRuleContext(FormalrestContext.class,i);
		}
		public FormallistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formallist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterFormallist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitFormallist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitFormallist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormallistContext formallist() throws RecognitionException {
		FormallistContext _localctx = new FormallistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formallist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			type();
			setState(118);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				formalrest();
				}
				}
				setState(124);
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

	public static class FormalrestContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MiniJavaGrammarParser.COMMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public FormalrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterFormalrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitFormalrest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitFormalrest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalrestContext formalrest() throws RecognitionException {
		FormalrestContext _localctx = new FormalrestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalrest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(COMMA);
			setState(126);
			type();
			setState(127);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public TerminalNode LSQUARE() { return getToken(MiniJavaGrammarParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MiniJavaGrammarParser.RSQUARE, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaGrammarParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(INT);
				setState(130);
				match(LSQUARE);
				setState(131);
				match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniJavaGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaGrammarParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(MiniJavaGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaGrammarParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaGrammarParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(MiniJavaGrammarParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(MiniJavaGrammarParser.WHILE, 0); }
		public TerminalNode SYSTEMOUT() { return getToken(MiniJavaGrammarParser.SYSTEMOUT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaGrammarParser.EQUALS, 0); }
		public TerminalNode LSQUARE() { return getToken(MiniJavaGrammarParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(MiniJavaGrammarParser.RSQUARE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LBRACE);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SYSTEMOUT) | (1L << LBRACE) | (1L << ID))) != 0)) {
					{
					{
					setState(138);
					statement();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(IF);
				setState(146);
				match(LPAREN);
				setState(147);
				expr(0);
				setState(148);
				match(RPAREN);
				setState(149);
				statement();
				setState(150);
				match(ELSE);
				setState(151);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(WHILE);
				setState(154);
				match(LPAREN);
				setState(155);
				expr(0);
				setState(156);
				match(RPAREN);
				setState(157);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(SYSTEMOUT);
				setState(160);
				match(LPAREN);
				setState(161);
				expr(0);
				setState(162);
				match(RPAREN);
				setState(163);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(ID);
				setState(166);
				match(EQUALS);
				setState(167);
				expr(0);
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(ID);
				setState(171);
				match(LSQUARE);
				setState(172);
				expr(0);
				setState(173);
				match(RSQUARE);
				setState(174);
				match(EQUALS);
				setState(175);
				expr(0);
				setState(176);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaGrammarParser.INTEGER, 0); }
		public TerminalNode TRUE() { return getToken(MiniJavaGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaGrammarParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(MiniJavaGrammarParser.ID, 0); }
		public TerminalNode THIS() { return getToken(MiniJavaGrammarParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaGrammarParser.NEW, 0); }
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public TerminalNode LSQUARE() { return getToken(MiniJavaGrammarParser.LSQUARE, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(MiniJavaGrammarParser.RSQUARE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaGrammarParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MiniJavaGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniJavaGrammarParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(MiniJavaGrammarParser.LENGTH, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(181);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(182);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(183);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(184);
				match(ID);
				}
				break;
			case 5:
				{
				setState(185);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(186);
				match(NEW);
				setState(187);
				match(INT);
				setState(188);
				match(LSQUARE);
				setState(189);
				exprlist();
				setState(190);
				match(RSQUARE);
				}
				break;
			case 7:
				{
				setState(192);
				match(NEW);
				setState(193);
				match(ID);
				setState(194);
				match(LPAREN);
				setState(195);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(196);
				match(NOT);
				setState(197);
				expr(2);
				}
				break;
			case 9:
				{
				setState(198);
				match(LPAREN);
				setState(199);
				expr(0);
				setState(200);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(205);
						op();
						setState(206);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(209);
						match(LSQUARE);
						setState(210);
						expr(0);
						setState(211);
						match(RSQUARE);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(214);
						match(DOT);
						setState(215);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(217);
						match(DOT);
						setState(218);
						match(ID);
						setState(219);
						match(LPAREN);
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAREN) | (1L << ID) | (1L << INTEGER))) != 0)) {
							{
							setState(220);
							exprlist();
							}
						}

						setState(223);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MiniJavaGrammarParser.AND, 0); }
		public TerminalNode LT() { return getToken(MiniJavaGrammarParser.LT, 0); }
		public TerminalNode PLUS() { return getToken(MiniJavaGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaGrammarParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(MiniJavaGrammarParser.MUL, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << MUL))) != 0)) ) {
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

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprrestContext> exprrest() {
			return getRuleContexts(ExprrestContext.class);
		}
		public ExprrestContext exprrest(int i) {
			return getRuleContext(ExprrestContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			expr(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(232);
				exprrest();
				}
				}
				setState(237);
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

	public static class ExprrestContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MiniJavaGrammarParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExprrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExprrest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExprrest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprrestContext exprrest() throws RecognitionException {
		ExprrestContext _localctx = new ExprrestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprrest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(COMMA);
			setState(239);
			expr(0);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\7\4R\n\4\f\4\16\4U"+
		"\13\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\3\6\3"+
		"\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00e0\n\13\3\13\7\13\u00e3\n\13\f\13\16\13\u00e6\13\13"+
		"\3\f\3\f\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef\13\r\3\16\3\16\3\16\3\16"+
		"\2\3\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\7\13\2\u0107\2\34"+
		"\3\2\2\2\4#\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n]\3\2\2\2\fw\3\2\2\2\16\177"+
		"\3\2\2\2\20\u0089\3\2\2\2\22\u00b4\3\2\2\2\24\u00cc\3\2\2\2\26\u00e7\3"+
		"\2\2\2\30\u00e9\3\2\2\2\32\u00f0\3\2\2\2\34 \5\4\3\2\35\37\5\6\4\2\36"+
		"\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#"+
		"$\7\f\2\2$%\7*\2\2%&\7#\2\2&\'\7\r\2\2\'(\7\16\2\2()\7\17\2\2)*\7\20\2"+
		"\2*+\7%\2\2+,\7\21\2\2,-\7\'\2\2-.\7(\2\2./\7*\2\2/\60\7&\2\2\60\61\7"+
		"#\2\2\61\62\5\22\n\2\62\63\7$\2\2\63\64\7$\2\2\64\5\3\2\2\2\65\66\7\f"+
		"\2\2\66\67\7*\2\2\67;\7#\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DX\7$\2\2EF\7\f\2\2FG\7*\2\2GH\7\22\2\2"+
		"HI\7*\2\2IM\7#\2\2JL\5\b\5\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N"+
		"S\3\2\2\2OM\3\2\2\2PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VX\7$\2\2W\65\3\2\2\2WE\3\2\2\2X\7\3\2\2\2YZ\5\20"+
		"\t\2Z[\7*\2\2[\\\7\"\2\2\\\t\3\2\2\2]^\7\r\2\2^_\5\20\t\2_`\7*\2\2`b\7"+
		"%\2\2ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7&\2\2ei\7#\2\2fh\5\b"+
		"\5\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jo\3\2\2\2ki\3\2\2\2ln\5\22"+
		"\n\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\23"+
		"\2\2st\5\24\13\2tu\7\"\2\2uv\7$\2\2v\13\3\2\2\2wx\5\20\t\2x|\7*\2\2y{"+
		"\5\16\b\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2"+
		"\177\u0080\7!\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7*\2\2\u0082\17\3\2"+
		"\2\2\u0083\u0084\7\30\2\2\u0084\u0085\7\'\2\2\u0085\u008a\7(\2\2\u0086"+
		"\u008a\7\27\2\2\u0087\u008a\7\30\2\2\u0088\u008a\7*\2\2\u0089\u0083\3"+
		"\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\21\3\2\2\2\u008b\u008f\7#\2\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u00b5\7$\2\2\u0093\u0094\7\25\2\2\u0094"+
		"\u0095\7%\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7&\2\2\u0097\u0098\5\22"+
		"\n\2\u0098\u0099\7\26\2\2\u0099\u009a\5\22\n\2\u009a\u00b5\3\2\2\2\u009b"+
		"\u009c\7\24\2\2\u009c\u009d\7%\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7"+
		"&\2\2\u009f\u00a0\5\22\n\2\u00a0\u00b5\3\2\2\2\u00a1\u00a2\7\31\2\2\u00a2"+
		"\u00a3\7%\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\7\""+
		"\2\2\u00a6\u00b5\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\7)\2\2\u00a9\u00aa"+
		"\5\24\13\2\u00aa\u00ab\7\"\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\7*\2\2"+
		"\u00ad\u00ae\7\'\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7(\2\2\u00b0\u00b1"+
		"\7)\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7\"\2\2\u00b3\u00b5\3\2\2\2"+
		"\u00b4\u008b\3\2\2\2\u00b4\u0093\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u00a1"+
		"\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b5\23\3\2\2\2\u00b6"+
		"\u00b7\b\13\1\2\u00b7\u00cd\7,\2\2\u00b8\u00cd\7\35\2\2\u00b9\u00cd\7"+
		"\36\2\2\u00ba\u00cd\7*\2\2\u00bb\u00cd\7\34\2\2\u00bc\u00bd\7\33\2\2\u00bd"+
		"\u00be\7\30\2\2\u00be\u00bf\7\'\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7"+
		"(\2\2\u00c1\u00cd\3\2\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7*\2\2\u00c4"+
		"\u00c5\7%\2\2\u00c5\u00cd\7&\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00cd\5\24"+
		"\13\4\u00c8\u00c9\7%\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\7&\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00b6\3\2\2\2\u00cc\u00b8\3\2\2\2\u00cc\u00b9\3\2"+
		"\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00bc\3\2\2\2\u00cc"+
		"\u00c2\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00e4\3\2"+
		"\2\2\u00ce\u00cf\f\17\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1\5\24\13\20"+
		"\u00d1\u00e3\3\2\2\2\u00d2\u00d3\f\16\2\2\u00d3\u00d4\7\'\2\2\u00d4\u00d5"+
		"\5\24\13\2\u00d5\u00d6\7(\2\2\u00d6\u00e3\3\2\2\2\u00d7\u00d8\f\r\2\2"+
		"\u00d8\u00d9\7 \2\2\u00d9\u00e3\7\32\2\2\u00da\u00db\f\f\2\2\u00db\u00dc"+
		"\7 \2\2\u00dc\u00dd\7*\2\2\u00dd\u00df\7%\2\2\u00de\u00e0\5\30\r\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7&"+
		"\2\2\u00e2\u00ce\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\25\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\t\2\2\2\u00e8\27"+
		"\3\2\2\2\u00e9\u00ed\5\24\13\2\u00ea\u00ec\5\32\16\2\u00eb\u00ea\3\2\2"+
		"\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\31"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\5\24\13\2"+
		"\u00f2\33\3\2\2\2\24 ;AMSWbio|\u0089\u008f\u00b4\u00cc\u00df\u00e2\u00e4"+
		"\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}