// Generated from C:/Users/piotr marganski/Desktop/Studia/VI semestr/Kompilatory/PrutoCompiler/src/main/antlr\pruto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prutoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		ID=17, NUMBER=18, INTEGER=19, DOUBLE=20, STRING=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COMMENT", "ID", 
		"NUMBER", "INTEGER", "DOUBLE", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'let'", "'='", "'read('", "')'", "'print'", 
		"'add'", "'to'", "'sub'", "'from'", "'multiply'", "'by'", "'devide'", 
		"'pow'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "ID", "NUMBER", "INTEGER", "DOUBLE", 
		"STRING", "WS"
	};
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


	public prutoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pruto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\7\21y\n\21\f\21\16\21|\13\21\3\21\5\21\177\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0086\n\21\f\21\16\21\u0089\13\21\3\21"+
		"\3\21\5\21\u008d\n\21\3\21\3\21\3\22\6\22\u0092\n\22\r\22\16\22\u0093"+
		"\3\23\3\23\5\23\u0098\n\23\3\24\6\24\u009b\n\24\r\24\16\24\u009c\3\25"+
		"\5\25\u00a0\n\25\3\25\6\25\u00a3\n\25\r\25\16\25\u00a4\3\25\3\25\6\25"+
		"\u00a9\n\25\r\25\16\25\u00aa\5\25\u00ad\n\25\3\26\3\26\7\26\u00b1\n\26"+
		"\f\26\16\26\u00b4\13\26\3\26\3\26\3\27\6\27\u00b9\n\27\r\27\16\27\u00ba"+
		"\3\27\3\27\4\u0087\u00b2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7"+
		"\4\2\f\f\17\17\3\2c|\3\2\62;\4\2--//\5\2\13\f\17\17\"\"\2\u00ca\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65"+
		"\3\2\2\2\79\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21M"+
		"\3\2\2\2\23Q\3\2\2\2\25T\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33f\3\2\2\2\35"+
		"i\3\2\2\2\37p\3\2\2\2!\u008c\3\2\2\2#\u0091\3\2\2\2%\u0097\3\2\2\2\'\u009a"+
		"\3\2\2\2)\u009f\3\2\2\2+\u00ae\3\2\2\2-\u00b8\3\2\2\2/\60\7d\2\2\60\61"+
		"\7g\2\2\61\62\7i\2\2\62\63\7k\2\2\63\64\7p\2\2\64\4\3\2\2\2\65\66\7g\2"+
		"\2\66\67\7p\2\2\678\7f\2\28\6\3\2\2\29:\7n\2\2:;\7g\2\2;<\7v\2\2<\b\3"+
		"\2\2\2=>\7?\2\2>\n\3\2\2\2?@\7t\2\2@A\7g\2\2AB\7c\2\2BC\7f\2\2CD\7*\2"+
		"\2D\f\3\2\2\2EF\7+\2\2F\16\3\2\2\2GH\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2"+
		"KL\7v\2\2L\20\3\2\2\2MN\7c\2\2NO\7f\2\2OP\7f\2\2P\22\3\2\2\2QR\7v\2\2"+
		"RS\7q\2\2S\24\3\2\2\2TU\7u\2\2UV\7w\2\2VW\7d\2\2W\26\3\2\2\2XY\7h\2\2"+
		"YZ\7t\2\2Z[\7q\2\2[\\\7o\2\2\\\30\3\2\2\2]^\7o\2\2^_\7w\2\2_`\7n\2\2`"+
		"a\7v\2\2ab\7k\2\2bc\7r\2\2cd\7n\2\2de\7{\2\2e\32\3\2\2\2fg\7d\2\2gh\7"+
		"{\2\2h\34\3\2\2\2ij\7f\2\2jk\7g\2\2kl\7x\2\2lm\7k\2\2mn\7f\2\2no\7g\2"+
		"\2o\36\3\2\2\2pq\7r\2\2qr\7q\2\2rs\7y\2\2s \3\2\2\2tu\7\61\2\2uv\7\61"+
		"\2\2vz\3\2\2\2wy\n\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2}\177\7\17\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u008d\7\f\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2\u0083\u0087"+
		"\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008d\7\61\2\2\u008ct\3\2\2\2\u008c"+
		"\u0081\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\21\2\2\u008f\"\3\2\2"+
		"\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094$\3\2\2\2\u0095\u0098\5\'\24\2\u0096"+
		"\u0098\5)\25\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098&\3\2\2\2"+
		"\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d(\3\2\2\2\u009e\u00a0\t\5\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\4\62"+
		";\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\4"+
		"\62;\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad*\3\2\2\2\u00ae\u00b2\7$\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6,\3\2\2\2\u00b7"+
		"\u00b9\t\6\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\27\2\2\u00bd"+
		".\3\2\2\2\20\2z~\u0087\u008c\u0093\u0097\u009c\u009f\u00a4\u00aa\u00ac"+
		"\u00b2\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}