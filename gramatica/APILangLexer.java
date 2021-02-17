// Generated from APILang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APILangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TYPE=14, NAME=15, PACKAGE_NAME=16, 
		FOLDER_NAME=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "TYPE", "NAME", "PACKAGE_NAME", "FOLDER_NAME", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'package'", "'{'", "'}'", "'folder'", "'property'", 
			"'of type'", "'with constraint'", "'required'", "'unique'", "'oneToMany'", 
			"'manyToMany'", "'manyToOne'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TYPE", "NAME", "PACKAGE_NAME", "FOLDER_NAME", "WS"
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


	public APILangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "APILang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ae\n\17\3\20\6\20\u00b1"+
		"\n\20\r\20\16\20\u00b2\3\21\6\21\u00b6\n\21\r\21\16\21\u00b7\3\22\6\22"+
		"\u00bb\n\22\r\22\16\22\u00bc\3\23\6\23\u00c0\n\23\r\23\16\23\u00c1\3\23"+
		"\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\3\2\6\4\2C\\c|\5\2\60\60C\\c|\6\3\2\61"+
		"C\\aac|\5\2\13\f\17\17\"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5-\3\2\2"+
		"\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17I\3\2\2\2\21Q\3"+
		"\2\2\2\23a\3\2\2\2\25j\3\2\2\2\27q\3\2\2\2\31{\3\2\2\2\33\u0086\3\2\2"+
		"\2\35\u00ad\3\2\2\2\37\u00b0\3\2\2\2!\u00b5\3\2\2\2#\u00ba\3\2\2\2%\u00bf"+
		"\3\2\2\2\'(\7o\2\2()\7q\2\2)*\7f\2\2*+\7g\2\2+,\7n\2\2,\4\3\2\2\2-.\7"+
		"r\2\2./\7c\2\2/\60\7e\2\2\60\61\7m\2\2\61\62\7c\2\2\62\63\7i\2\2\63\64"+
		"\7g\2\2\64\6\3\2\2\2\65\66\7}\2\2\66\b\3\2\2\2\678\7\177\2\28\n\3\2\2"+
		"\29:\7h\2\2:;\7q\2\2;<\7n\2\2<=\7f\2\2=>\7g\2\2>?\7t\2\2?\f\3\2\2\2@A"+
		"\7r\2\2AB\7t\2\2BC\7q\2\2CD\7r\2\2DE\7g\2\2EF\7t\2\2FG\7v\2\2GH\7{\2\2"+
		"H\16\3\2\2\2IJ\7q\2\2JK\7h\2\2KL\7\"\2\2LM\7v\2\2MN\7{\2\2NO\7r\2\2OP"+
		"\7g\2\2P\20\3\2\2\2QR\7y\2\2RS\7k\2\2ST\7v\2\2TU\7j\2\2UV\7\"\2\2VW\7"+
		"e\2\2WX\7q\2\2XY\7p\2\2YZ\7u\2\2Z[\7v\2\2[\\\7t\2\2\\]\7c\2\2]^\7k\2\2"+
		"^_\7p\2\2_`\7v\2\2`\22\3\2\2\2ab\7t\2\2bc\7g\2\2cd\7s\2\2de\7w\2\2ef\7"+
		"k\2\2fg\7t\2\2gh\7g\2\2hi\7f\2\2i\24\3\2\2\2jk\7w\2\2kl\7p\2\2lm\7k\2"+
		"\2mn\7s\2\2no\7w\2\2op\7g\2\2p\26\3\2\2\2qr\7q\2\2rs\7p\2\2st\7g\2\2t"+
		"u\7V\2\2uv\7q\2\2vw\7O\2\2wx\7c\2\2xy\7p\2\2yz\7{\2\2z\30\3\2\2\2{|\7"+
		"o\2\2|}\7c\2\2}~\7p\2\2~\177\7{\2\2\177\u0080\7V\2\2\u0080\u0081\7q\2"+
		"\2\u0081\u0082\7O\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7{\2\2\u0085\32\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7{\2\2\u008a\u008b\7V\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7Q\2\2\u008d\u008e\7p\2\2\u008e\u008f\7g\2\2\u008f\34\3\2\2\2\u0090"+
		"\u0091\7U\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7p\2\2\u0095\u00ae\7i\2\2\u0096\u0097\7K\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b\7i\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u00ae\7t\2\2\u009d\u009e\7D\2\2\u009e\u009f\7q\2\2"+
		"\u009f\u00a0\7q\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00ae\7p\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00ab\5\37\20\2\u00ab\u00ac\7@\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u0090\3\2\2\2\u00ad\u0096\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a4\3\2"+
		"\2\2\u00ae\36\3\2\2\2\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3 \3\2\2\2\u00b4"+
		"\u00b6\t\3\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\"\3\2\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"$\3\2\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\b\23\2\2\u00c4&\3\2\2\2\b\2\u00ad\u00b2\u00b7\u00bc\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}