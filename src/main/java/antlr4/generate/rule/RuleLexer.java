// Generated from rule\Rule.g4 by ANTLR 4.5.3
package antlr4.generate.rule;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, STRING=19, NUMBER=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'\"_id\"'", "':'", "'\"_rev\"'", "'\"name\"'", 
		"'\"rule\"'", "'['", "']'", "'\"$and\"'", "'\"$or\"'", "'\"$not\"'", "'\"$eq\"'", 
		"'\"$containsString\"'", "'\"$containsWord\"'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "STRING", "NUMBER", "WS"
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


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00a9\n\24\f\24"+
		"\16\24\u00ac\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u00b3\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\5\30\u00be\n\30\3\30\3\30\3\30\6\30"+
		"\u00c3\n\30\r\30\16\30\u00c4\3\30\5\30\u00c8\n\30\3\30\5\30\u00cb\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00d1\n\30\3\30\5\30\u00d4\n\30\3\31\3\31\3"+
		"\31\7\31\u00d9\n\31\f\31\16\31\u00dc\13\31\5\31\u00de\n\31\3\32\3\32\5"+
		"\32\u00e2\n\32\3\32\3\32\3\33\6\33\u00e7\n\33\r\33\16\33\u00e8\3\33\3"+
		"\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\26\61\2\63\2\65\27\3\2\n\4"+
		"\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2GGgg\4\2"+
		"--//\5\2\13\f\17\17\"\"\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2"+
		"\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13C\3\2\2\2"+
		"\rE\3\2\2\2\17L\3\2\2\2\21S\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27^\3\2\2"+
		"\2\31e\3\2\2\2\33k\3\2\2\2\35r\3\2\2\2\37x\3\2\2\2!\u008a\3\2\2\2#\u009a"+
		"\3\2\2\2%\u009f\3\2\2\2\'\u00a5\3\2\2\2)\u00af\3\2\2\2+\u00b4\3\2\2\2"+
		"-\u00ba\3\2\2\2/\u00d3\3\2\2\2\61\u00dd\3\2\2\2\63\u00df\3\2\2\2\65\u00e6"+
		"\3\2\2\2\678\7}\2\28\4\3\2\2\29:\7.\2\2:\6\3\2\2\2;<\7\177\2\2<\b\3\2"+
		"\2\2=>\7$\2\2>?\7a\2\2?@\7k\2\2@A\7f\2\2AB\7$\2\2B\n\3\2\2\2CD\7<\2\2"+
		"D\f\3\2\2\2EF\7$\2\2FG\7a\2\2GH\7t\2\2HI\7g\2\2IJ\7x\2\2JK\7$\2\2K\16"+
		"\3\2\2\2LM\7$\2\2MN\7p\2\2NO\7c\2\2OP\7o\2\2PQ\7g\2\2QR\7$\2\2R\20\3\2"+
		"\2\2ST\7$\2\2TU\7t\2\2UV\7w\2\2VW\7n\2\2WX\7g\2\2XY\7$\2\2Y\22\3\2\2\2"+
		"Z[\7]\2\2[\24\3\2\2\2\\]\7_\2\2]\26\3\2\2\2^_\7$\2\2_`\7&\2\2`a\7c\2\2"+
		"ab\7p\2\2bc\7f\2\2cd\7$\2\2d\30\3\2\2\2ef\7$\2\2fg\7&\2\2gh\7q\2\2hi\7"+
		"t\2\2ij\7$\2\2j\32\3\2\2\2kl\7$\2\2lm\7&\2\2mn\7p\2\2no\7q\2\2op\7v\2"+
		"\2pq\7$\2\2q\34\3\2\2\2rs\7$\2\2st\7&\2\2tu\7g\2\2uv\7s\2\2vw\7$\2\2w"+
		"\36\3\2\2\2xy\7$\2\2yz\7&\2\2z{\7e\2\2{|\7q\2\2|}\7p\2\2}~\7v\2\2~\177"+
		"\7c\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7u\2\2\u0082\u0083"+
		"\7U\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7i\2\2\u0088\u0089\7$\2\2\u0089 \3\2\2\2\u008a"+
		"\u008b\7$\2\2\u008b\u008c\7&\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094\u0095\7Y\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7f\2\2\u0098\u0099\7$\2\2"+
		"\u0099\"\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w"+
		"\2\2\u009d\u009e\7g\2\2\u009e$\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00aa\7$\2\2\u00a6\u00a9\5)\25\2\u00a7\u00a9\n\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7$\2\2\u00ae(\3\2\2\2\u00af\u00b2\7^\2\2\u00b0\u00b3\t\3\2\2\u00b1"+
		"\u00b3\5+\26\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3*\3\2\2\2"+
		"\u00b4\u00b5\7w\2\2\u00b5\u00b6\5-\27\2\u00b6\u00b7\5-\27\2\u00b7\u00b8"+
		"\5-\27\2\u00b8\u00b9\5-\27\2\u00b9,\3\2\2\2\u00ba\u00bb\t\4\2\2\u00bb"+
		".\3\2\2\2\u00bc\u00be\7/\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\5\61\31\2\u00c0\u00c2\7\60\2\2\u00c1\u00c3"+
		"\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5\63\32\2\u00c7\u00c6\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d4\3\2\2\2\u00c9\u00cb\7/\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\61"+
		"\31\2\u00cd\u00ce\5\63\32\2\u00ce\u00d4\3\2\2\2\u00cf\u00d1\7/\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\5\61"+
		"\31\2\u00d3\u00bd\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4"+
		"\60\3\2\2\2\u00d5\u00de\7\62\2\2\u00d6\u00da\t\6\2\2\u00d7\u00d9\t\5\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd"+
		"\u00d6\3\2\2\2\u00de\62\3\2\2\2\u00df\u00e1\t\7\2\2\u00e0\u00e2\t\b\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\5\61\31\2\u00e4\64\3\2\2\2\u00e5\u00e7\t\t\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\b\33\2\2\u00eb\66\3\2\2\2\20\2\u00a8\u00aa\u00b2\u00bd"+
		"\u00c4\u00c7\u00ca\u00d0\u00d3\u00da\u00dd\u00e1\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}