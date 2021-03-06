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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		JOIN_COLUMN=18, JOIN_COLUMN_SETTINGS=19, BINARY=20, TYPE=21, NAME=22, 
		PACKAGE_NAME=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"JOIN_COLUMN", "JOIN_COLUMN_SETTINGS", "BINARY", "TYPE", "NAME", "PACKAGE_NAME", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'package'", "'table'", "'schema'", "'primary key'", 
			"'{'", "'}'", "'property'", "'of type'", "'of model'", "'with constraint'", 
			"'required'", "'unique'", "'oneToMany'", "'manyToMany'", "'manyToOne'", 
			"'oneToOne'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "JOIN_COLUMN", "JOIN_COLUMN_SETTINGS", 
			"BINARY", "TYPE", "NAME", "PACKAGE_NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u00cd\n\23"+
		"\r\23\16\23\u00ce\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00e9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00f4\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0119\n\26\3\27\6\27"+
		"\u011c\n\27\r\27\16\27\u011d\3\30\6\30\u0121\n\30\r\30\16\30\u0122\3\31"+
		"\6\31\u0126\n\31\r\31\16\31\u0127\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\3\2\5\5\2C\\aac|\5\2\60\60C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7A\3\2\2\2\tG\3\2"+
		"\2\2\13N\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23g\3\2\2\2\25o\3"+
		"\2\2\2\27x\3\2\2\2\31\u0088\3\2\2\2\33\u0091\3\2\2\2\35\u0098\3\2\2\2"+
		"\37\u00a2\3\2\2\2!\u00ad\3\2\2\2#\u00b7\3\2\2\2%\u00d2\3\2\2\2\'\u00e8"+
		"\3\2\2\2)\u00f3\3\2\2\2+\u0118\3\2\2\2-\u011b\3\2\2\2/\u0120\3\2\2\2\61"+
		"\u0125\3\2\2\2\63\64\7o\2\2\64\65\7q\2\2\65\66\7f\2\2\66\67\7g\2\2\67"+
		"8\7n\2\28\4\3\2\2\29:\7r\2\2:;\7c\2\2;<\7e\2\2<=\7m\2\2=>\7c\2\2>?\7i"+
		"\2\2?@\7g\2\2@\6\3\2\2\2AB\7v\2\2BC\7c\2\2CD\7d\2\2DE\7n\2\2EF\7g\2\2"+
		"F\b\3\2\2\2GH\7u\2\2HI\7e\2\2IJ\7j\2\2JK\7g\2\2KL\7o\2\2LM\7c\2\2M\n\3"+
		"\2\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR\7o\2\2RS\7c\2\2ST\7t\2\2TU\7{\2\2"+
		"UV\7\"\2\2VW\7m\2\2WX\7g\2\2XY\7{\2\2Y\f\3\2\2\2Z[\7}\2\2[\16\3\2\2\2"+
		"\\]\7\177\2\2]\20\3\2\2\2^_\7r\2\2_`\7t\2\2`a\7q\2\2ab\7r\2\2bc\7g\2\2"+
		"cd\7t\2\2de\7v\2\2ef\7{\2\2f\22\3\2\2\2gh\7q\2\2hi\7h\2\2ij\7\"\2\2jk"+
		"\7v\2\2kl\7{\2\2lm\7r\2\2mn\7g\2\2n\24\3\2\2\2op\7q\2\2pq\7h\2\2qr\7\""+
		"\2\2rs\7o\2\2st\7q\2\2tu\7f\2\2uv\7g\2\2vw\7n\2\2w\26\3\2\2\2xy\7y\2\2"+
		"yz\7k\2\2z{\7v\2\2{|\7j\2\2|}\7\"\2\2}~\7e\2\2~\177\7q\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7s\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7k\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7f\2\2\u0090\32\3\2\2\2\u0091\u0092\7w\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7k\2\2\u0094\u0095\7s\2\2\u0095\u0096\7w\2\2\u0096\u0097"+
		"\7g\2\2\u0097\34\3\2\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7V\2\2\u009c\u009d\7q\2\2\u009d\u009e\7O\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7{\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7o\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7{\2\2"+
		"\u00a6\u00a7\7V\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7O\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7{\2\2\u00ac \3\2\2\2\u00ad\u00ae"+
		"\7o\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7{\2\2\u00b1"+
		"\u00b2\7V\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7p"+
		"\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd"+
		"\7Q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7g\2\2\u00bf$\3\2\2\2\u00c0\u00c1"+
		"\7l\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7E\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7w\2\2"+
		"\u00c8\u00c9\7o\2\2\u00c9\u00d3\7p\2\2\u00ca\u00cc\7}\2\2\u00cb\u00cd"+
		"\5\'\24\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\177\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3&\3\2\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7\"\2\2\u00d9\u00da\7?\2\2\u00da\u00db\7\"\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00e9\5-\27\2\u00dd\u00de\7w\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7s\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\5)\25\2\u00e8\u00d4\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e9"+
		"(\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00f4\7g\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2"+
		"\u00f1\u00f2\7u\2\2\u00f2\u00f4\7g\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ee"+
		"\3\2\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7U\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u0119\7i\2\2\u00fb"+
		"\u00fc\7K\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ff\u0100\7i\2\2\u0100\u0101\7g\2\2\u0101\u0119\7t\2\2\u0102\u0103"+
		"\7D\2\2\u0103\u0104\7q\2\2\u0104\u0105\7q\2\2\u0105\u0106\7n\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u0108\7c\2\2\u0108\u0119\7p\2\2\u0109\u010a\7F\2\2"+
		"\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d\7d\2\2\u010d\u010e"+
		"\7n\2\2\u010e\u0119\7g\2\2\u010f\u0110\7N\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113\u0114\7>\2\2\u0114\u0115\3\2\2"+
		"\2\u0115\u0116\5-\27\2\u0116\u0117\7@\2\2\u0117\u0119\3\2\2\2\u0118\u00f5"+
		"\3\2\2\2\u0118\u00fb\3\2\2\2\u0118\u0102\3\2\2\2\u0118\u0109\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u0119,\3\2\2\2\u011a\u011c\t\2\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e.\3"+
		"\2\2\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\60\3\2\2\2\u0124\u0126\t\4\2"+
		"\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\31\2\2\u012a\62\3\2\2\2\13"+
		"\2\u00ce\u00d2\u00e8\u00f3\u0118\u011d\u0122\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}