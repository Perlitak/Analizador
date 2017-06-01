// Generated from Compiladores\Proyecto\proyecto.g4 by ANTLR 4.5.1
package Compiladores.Proyecto;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proyectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RUNNING=1, IMPRIME=2, CICLO=3, FUCTION=4, ENT=5, DEC=6, CAD=7, CONST=8, 
		SUMAR=9, RESTA=10, MULTI=11, DIV=12, Y=13, O=14, NO=15, FAL=16, VER=17, 
		MAYOR=18, MENOR=19, MAYGUAL=20, MEYGUAL=21, IGUAL2=22, NEGIGUAL=23, ASIG=24, 
		END=25, INICIO=26, LLAA=27, LLAC=28, COMI=29, PARA=30, PARC=31, CORA=32, 
		CORC=33, IF=34, THEN=35, FOR=36, MASFOR=37, MENFOR=38, WHILE=39, ID=40, 
		ENTERO=41, DECIMAL=42, CADENA=43, COMMENT=44, WS=45;
	public static final int
		RULE_running = 0, RULE_sentence = 1, RULE_entero_asig = 2, RULE_decimal_asig = 3, 
		RULE_cadena_asig = 4, RULE_consts = 5, RULE_const_asig = 6, RULE_imprimiendo = 7, 
		RULE_ruleif = 8, RULE_condicion = 9, RULE_expr = 10, RULE_comp_expr = 11, 
		RULE_operacion = 12, RULE_comp_operator = 13, RULE_conclusion = 14, RULE_decl_cicloif = 15, 
		RULE_rulefor = 16, RULE_iniciacion = 17, RULE_tope = 18, RULE_tope_op = 19, 
		RULE_paso = 20, RULE_paso_op = 21, RULE_decl_ciclofor = 22, RULE_rulewhile = 23, 
		RULE_comparacion = 24, RULE_bloqueinst = 25, RULE_ent_dec = 26, RULE_operacioneswhile = 27, 
		RULE_ope_varias = 28, RULE_ope_program = 29, RULE_decl_ciclowhile = 30, 
		RULE_nomb_vec = 31, RULE_tipo = 32, RULE_elem_tipo = 33, RULE_elements = 34, 
		RULE_elements_cad = 35, RULE_elem_vec = 36, RULE_elem_vec_cad = 37, RULE_vector_asig = 38, 
		RULE_vector_asig_cad = 39, RULE_fila = 40, RULE_columna = 41, RULE_nomb_mat = 42, 
		RULE_elem_mat = 43, RULE_elem_mat_cad = 44, RULE_matriz_asig = 45, RULE_matriz_asig_cad = 46, 
		RULE_funcion = 47;
	public static final String[] ruleNames = {
		"running", "sentence", "entero_asig", "decimal_asig", "cadena_asig", "consts", 
		"const_asig", "imprimiendo", "ruleif", "condicion", "expr", "comp_expr", 
		"operacion", "comp_operator", "conclusion", "decl_cicloif", "rulefor", 
		"iniciacion", "tope", "tope_op", "paso", "paso_op", "decl_ciclofor", "rulewhile", 
		"comparacion", "bloqueinst", "ent_dec", "operacioneswhile", "ope_varias", 
		"ope_program", "decl_ciclowhile", "nomb_vec", "tipo", "elem_tipo", "elements", 
		"elements_cad", "elem_vec", "elem_vec_cad", "vector_asig", "vector_asig_cad", 
		"fila", "columna", "nomb_mat", "elem_mat", "elem_mat_cad", "matriz_asig", 
		"matriz_asig_cad", "funcion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'running'", "'imprime'", "'ciclo'", "'fuction'", "'ent'", "'dec'", 
		"'cad'", "'const'", "'+'", "'-'", "'*'", "'/'", "'y'", "'o'", "'nou'", 
		"'fal'", "'ver'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"','", "':'", "'{'", "'}'", "'\"'", "'('", "')'", "'['", "']'", "'if'", 
		"'then'", "'for'", "'++'", "'--'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RUNNING", "IMPRIME", "CICLO", "FUCTION", "ENT", "DEC", "CAD", "CONST", 
		"SUMAR", "RESTA", "MULTI", "DIV", "Y", "O", "NO", "FAL", "VER", "MAYOR", 
		"MENOR", "MAYGUAL", "MEYGUAL", "IGUAL2", "NEGIGUAL", "ASIG", "END", "INICIO", 
		"LLAA", "LLAC", "COMI", "PARA", "PARC", "CORA", "CORC", "IF", "THEN", 
		"FOR", "MASFOR", "MENFOR", "WHILE", "ID", "ENTERO", "DECIMAL", "CADENA", 
		"COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "proyecto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public proyectoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RunningContext extends ParserRuleContext {
		public TerminalNode RUNNING() { return getToken(proyectoParser.RUNNING, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public List<TerminalNode> INICIO() { return getTokens(proyectoParser.INICIO); }
		public TerminalNode INICIO(int i) {
			return getToken(proyectoParser.INICIO, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public RunningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_running; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterRunning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitRunning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitRunning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunningContext running() throws RecognitionException {
		RunningContext _localctx = new RunningContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_running);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(RUNNING);
			setState(97);
			match(ID);
			setState(98);
			match(INICIO);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (IMPRIME - -1)) | (1L << (CICLO - -1)) | (1L << (FUCTION - -1)) | (1L << (ENT - -1)) | (1L << (DEC - -1)) | (1L << (CAD - -1)) | (1L << (CONST - -1)) | (1L << (MAYOR - -1)) | (1L << (MENOR - -1)) | (1L << (MAYGUAL - -1)) | (1L << (MEYGUAL - -1)) | (1L << (IGUAL2 - -1)) | (1L << (NEGIGUAL - -1)) | (1L << (LLAA - -1)) | (1L << (COMI - -1)) | (1L << (PARA - -1)) | (1L << (CORA - -1)) | (1L << (MASFOR - -1)) | (1L << (MENFOR - -1)) | (1L << (ID - -1)) | (1L << (ENTERO - -1)) | (1L << (DECIMAL - -1)) | (1L << (CADENA - -1)))) != 0)) {
				{
				{
				setState(99);
				sentence();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(INICIO);
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

	public static class SentenceContext extends ParserRuleContext {
		public Entero_asigContext entero_asig() {
			return getRuleContext(Entero_asigContext.class,0);
		}
		public Decimal_asigContext decimal_asig() {
			return getRuleContext(Decimal_asigContext.class,0);
		}
		public Cadena_asigContext cadena_asig() {
			return getRuleContext(Cadena_asigContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public Const_asigContext const_asig() {
			return getRuleContext(Const_asigContext.class,0);
		}
		public ImprimiendoContext imprimiendo() {
			return getRuleContext(ImprimiendoContext.class,0);
		}
		public RuleifContext ruleif() {
			return getRuleContext(RuleifContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public Decl_cicloifContext decl_cicloif() {
			return getRuleContext(Decl_cicloifContext.class,0);
		}
		public RuleforContext rulefor() {
			return getRuleContext(RuleforContext.class,0);
		}
		public IniciacionContext iniciacion() {
			return getRuleContext(IniciacionContext.class,0);
		}
		public TopeContext tope() {
			return getRuleContext(TopeContext.class,0);
		}
		public Tope_opContext tope_op() {
			return getRuleContext(Tope_opContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public Paso_opContext paso_op() {
			return getRuleContext(Paso_opContext.class,0);
		}
		public Decl_cicloforContext decl_ciclofor() {
			return getRuleContext(Decl_cicloforContext.class,0);
		}
		public RulewhileContext rulewhile() {
			return getRuleContext(RulewhileContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public BloqueinstContext bloqueinst() {
			return getRuleContext(BloqueinstContext.class,0);
		}
		public Ent_decContext ent_dec() {
			return getRuleContext(Ent_decContext.class,0);
		}
		public Ope_variasContext ope_varias() {
			return getRuleContext(Ope_variasContext.class,0);
		}
		public Ope_programContext ope_program() {
			return getRuleContext(Ope_programContext.class,0);
		}
		public OperacioneswhileContext operacioneswhile() {
			return getRuleContext(OperacioneswhileContext.class,0);
		}
		public Decl_ciclowhileContext decl_ciclowhile() {
			return getRuleContext(Decl_ciclowhileContext.class,0);
		}
		public Nomb_vecContext nomb_vec() {
			return getRuleContext(Nomb_vecContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Elem_tipoContext elem_tipo() {
			return getRuleContext(Elem_tipoContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public Elements_cadContext elements_cad() {
			return getRuleContext(Elements_cadContext.class,0);
		}
		public Elem_vecContext elem_vec() {
			return getRuleContext(Elem_vecContext.class,0);
		}
		public Elem_vec_cadContext elem_vec_cad() {
			return getRuleContext(Elem_vec_cadContext.class,0);
		}
		public Vector_asigContext vector_asig() {
			return getRuleContext(Vector_asigContext.class,0);
		}
		public Vector_asig_cadContext vector_asig_cad() {
			return getRuleContext(Vector_asig_cadContext.class,0);
		}
		public FilaContext fila() {
			return getRuleContext(FilaContext.class,0);
		}
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public Nomb_matContext nomb_mat() {
			return getRuleContext(Nomb_matContext.class,0);
		}
		public Elem_matContext elem_mat() {
			return getRuleContext(Elem_matContext.class,0);
		}
		public Elem_mat_cadContext elem_mat_cad() {
			return getRuleContext(Elem_mat_cadContext.class,0);
		}
		public Matriz_asigContext matriz_asig() {
			return getRuleContext(Matriz_asigContext.class,0);
		}
		public Matriz_asig_cadContext matriz_asig_cad() {
			return getRuleContext(Matriz_asig_cadContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				entero_asig();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				decimal_asig();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				cadena_asig();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				consts();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				const_asig();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				imprimiendo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				ruleif();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				condicion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				expr(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				comp_expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(117);
				operacion();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(118);
				comp_operator();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(119);
				conclusion();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(120);
				decl_cicloif();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(121);
				rulefor();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(122);
				iniciacion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(123);
				tope();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(124);
				tope_op();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(125);
				paso();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(126);
				paso_op();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(127);
				decl_ciclofor();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(128);
				rulewhile();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(129);
				comparacion();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(130);
				bloqueinst();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(131);
				ent_dec();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(132);
				ope_varias();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(133);
				ope_program();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(134);
				operacioneswhile();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(135);
				decl_ciclowhile();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(136);
				nomb_vec();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(137);
				tipo();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(138);
				elem_tipo();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(139);
				elements();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(140);
				elements_cad();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(141);
				elem_vec();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(142);
				elem_vec_cad();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(143);
				vector_asig();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(144);
				vector_asig_cad();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(145);
				fila();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(146);
				columna();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(147);
				nomb_mat();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(148);
				elem_mat();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(149);
				elem_mat_cad();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(150);
				matriz_asig();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(151);
				matriz_asig_cad();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(152);
				funcion();
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

	public static class Entero_asigContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(proyectoParser.ENT, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public Entero_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterEntero_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitEntero_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitEntero_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entero_asigContext entero_asig() throws RecognitionException {
		Entero_asigContext _localctx = new Entero_asigContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entero_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ENT);
			setState(156);
			match(ID);
			setState(157);
			match(ASIG);
			setState(158);
			match(ENTERO);
			setState(159);
			match(END);
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

	public static class Decimal_asigContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(proyectoParser.DEC, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public TerminalNode DECIMAL() { return getToken(proyectoParser.DECIMAL, 0); }
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public Decimal_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterDecimal_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitDecimal_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitDecimal_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_asigContext decimal_asig() throws RecognitionException {
		Decimal_asigContext _localctx = new Decimal_asigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decimal_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DEC);
			setState(162);
			match(ID);
			setState(163);
			match(ASIG);
			setState(164);
			match(DECIMAL);
			setState(165);
			match(END);
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

	public static class Cadena_asigContext extends ParserRuleContext {
		public TerminalNode CAD() { return getToken(proyectoParser.CAD, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public TerminalNode CADENA() { return getToken(proyectoParser.CADENA, 0); }
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public Cadena_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterCadena_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitCadena_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitCadena_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cadena_asigContext cadena_asig() throws RecognitionException {
		Cadena_asigContext _localctx = new Cadena_asigContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cadena_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(CAD);
			setState(168);
			match(ID);
			setState(169);
			match(ASIG);
			setState(170);
			match(CADENA);
			setState(171);
			match(END);
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

	public static class ConstsContext extends ParserRuleContext {
		public Entero_asigContext entero_asig() {
			return getRuleContext(Entero_asigContext.class,0);
		}
		public Decimal_asigContext decimal_asig() {
			return getRuleContext(Decimal_asigContext.class,0);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_consts);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case ENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				entero_asig();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				decimal_asig();
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

	public static class Const_asigContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(proyectoParser.CONST, 0); }
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public Const_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterConst_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitConst_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitConst_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_asigContext const_asig() throws RecognitionException {
		Const_asigContext _localctx = new Const_asigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_const_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CONST);
			setState(178);
			consts();
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

	public static class ImprimiendoContext extends ParserRuleContext {
		public TerminalNode IMPRIME() { return getToken(proyectoParser.IMPRIME, 0); }
		public TerminalNode PARA() { return getToken(proyectoParser.PARA, 0); }
		public List<TerminalNode> COMI() { return getTokens(proyectoParser.COMI); }
		public TerminalNode COMI(int i) {
			return getToken(proyectoParser.COMI, i);
		}
		public TerminalNode CADENA() { return getToken(proyectoParser.CADENA, 0); }
		public TerminalNode PARC() { return getToken(proyectoParser.PARC, 0); }
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public ImprimiendoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimiendo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterImprimiendo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitImprimiendo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitImprimiendo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimiendoContext imprimiendo() throws RecognitionException {
		ImprimiendoContext _localctx = new ImprimiendoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprimiendo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IMPRIME);
			setState(181);
			match(PARA);
			setState(182);
			match(COMI);
			setState(183);
			match(CADENA);
			setState(184);
			match(COMI);
			setState(185);
			match(PARC);
			setState(186);
			match(END);
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

	public static class RuleifContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(proyectoParser.EOF, 0); }
		public List<Decl_cicloifContext> decl_cicloif() {
			return getRuleContexts(Decl_cicloifContext.class);
		}
		public Decl_cicloifContext decl_cicloif(int i) {
			return getRuleContext(Decl_cicloifContext.class,i);
		}
		public RuleifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterRuleif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitRuleif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitRuleif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleifContext ruleif() throws RecognitionException {
		RuleifContext _localctx = new RuleifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CICLO) {
				{
				{
				setState(188);
				decl_cicloif();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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

	public static class CondicionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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

	public static class ExprContext extends ParserRuleContext {
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Y() { return getToken(proyectoParser.Y, 0); }
		public TerminalNode O() { return getToken(proyectoParser.O, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			comp_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(Y);
						setState(203);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						match(O);
						setState(206);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(211);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_exprContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(proyectoParser.PARA, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public TerminalNode PARC() { return getToken(proyectoParser.PARC, 0); }
		public Comp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterComp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitComp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitComp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_exprContext comp_expr() throws RecognitionException {
		Comp_exprContext _localctx = new Comp_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PARA);
			setState(213);
			operacion();
			setState(214);
			comp_operator();
			setState(215);
			operacion();
			setState(216);
			match(PARC);
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(proyectoParser.PARA, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(proyectoParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(proyectoParser.ENTERO, i);
		}
		public TerminalNode MULTI() { return getToken(proyectoParser.MULTI, 0); }
		public TerminalNode PARC() { return getToken(proyectoParser.PARC, 0); }
		public TerminalNode DIV() { return getToken(proyectoParser.DIV, 0); }
		public TerminalNode SUMAR() { return getToken(proyectoParser.SUMAR, 0); }
		public TerminalNode RESTA() { return getToken(proyectoParser.RESTA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacion);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(PARA);
				setState(219);
				match(ENTERO);
				setState(220);
				match(MULTI);
				setState(221);
				match(ENTERO);
				setState(222);
				match(PARC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(PARA);
				setState(224);
				match(ENTERO);
				setState(225);
				match(DIV);
				setState(226);
				match(ENTERO);
				setState(227);
				match(PARC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(PARA);
				setState(229);
				match(ENTERO);
				setState(230);
				match(SUMAR);
				setState(231);
				match(ENTERO);
				setState(232);
				match(PARC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(PARA);
				setState(234);
				match(ENTERO);
				setState(235);
				match(RESTA);
				setState(236);
				match(ENTERO);
				setState(237);
				match(PARC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(ENTERO);
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

	public static class Comp_operatorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(proyectoParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(proyectoParser.MENOR, 0); }
		public TerminalNode MAYGUAL() { return getToken(proyectoParser.MAYGUAL, 0); }
		public TerminalNode MEYGUAL() { return getToken(proyectoParser.MEYGUAL, 0); }
		public TerminalNode IGUAL2() { return getToken(proyectoParser.IGUAL2, 0); }
		public TerminalNode NEGIGUAL() { return getToken(proyectoParser.NEGIGUAL, 0); }
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitComp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitComp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYGUAL) | (1L << MEYGUAL) | (1L << IGUAL2) | (1L << NEGIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConclusionContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(proyectoParser.CADENA, 0); }
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CADENA);
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

	public static class Decl_cicloifContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(proyectoParser.CICLO, 0); }
		public TerminalNode IF() { return getToken(proyectoParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(proyectoParser.THEN, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public Decl_cicloifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_cicloif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterDecl_cicloif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitDecl_cicloif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitDecl_cicloif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_cicloifContext decl_cicloif() throws RecognitionException {
		Decl_cicloifContext _localctx = new Decl_cicloifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decl_cicloif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(CICLO);
			setState(246);
			match(IF);
			setState(247);
			condicion();
			setState(248);
			match(THEN);
			setState(249);
			conclusion();
			setState(250);
			match(END);
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

	public static class RuleforContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(proyectoParser.EOF, 0); }
		public List<Decl_cicloforContext> decl_ciclofor() {
			return getRuleContexts(Decl_cicloforContext.class);
		}
		public Decl_cicloforContext decl_ciclofor(int i) {
			return getRuleContext(Decl_cicloforContext.class,i);
		}
		public RuleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulefor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterRulefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitRulefor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitRulefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleforContext rulefor() throws RecognitionException {
		RuleforContext _localctx = new RuleforContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rulefor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CICLO) {
				{
				{
				setState(252);
				decl_ciclofor();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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

	public static class IniciacionContext extends ParserRuleContext {
		public Entero_asigContext entero_asig() {
			return getRuleContext(Entero_asigContext.class,0);
		}
		public IniciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterIniciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitIniciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitIniciacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniciacionContext iniciacion() throws RecognitionException {
		IniciacionContext _localctx = new IniciacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iniciacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			entero_asig();
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

	public static class TopeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public Tope_opContext tope_op() {
			return getRuleContext(Tope_opContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public TopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterTope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitTope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitTope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopeContext tope() throws RecognitionException {
		TopeContext _localctx = new TopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			tope_op();
			setState(264);
			match(ENTERO);
			setState(265);
			match(END);
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

	public static class Tope_opContext extends ParserRuleContext {
		public TerminalNode IGUAL2() { return getToken(proyectoParser.IGUAL2, 0); }
		public TerminalNode MENOR() { return getToken(proyectoParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(proyectoParser.MAYOR, 0); }
		public TerminalNode MAYGUAL() { return getToken(proyectoParser.MAYGUAL, 0); }
		public TerminalNode MEYGUAL() { return getToken(proyectoParser.MEYGUAL, 0); }
		public Tope_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tope_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterTope_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitTope_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitTope_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tope_opContext tope_op() throws RecognitionException {
		Tope_opContext _localctx = new Tope_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tope_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYGUAL) | (1L << MEYGUAL) | (1L << IGUAL2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public Paso_opContext paso_op() {
			return getRuleContext(Paso_opContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			paso_op();
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

	public static class Paso_opContext extends ParserRuleContext {
		public TerminalNode MASFOR() { return getToken(proyectoParser.MASFOR, 0); }
		public TerminalNode MENFOR() { return getToken(proyectoParser.MENFOR, 0); }
		public Paso_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterPaso_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitPaso_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitPaso_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paso_opContext paso_op() throws RecognitionException {
		Paso_opContext _localctx = new Paso_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paso_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==MASFOR || _la==MENFOR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Decl_cicloforContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(proyectoParser.CICLO, 0); }
		public TerminalNode FOR() { return getToken(proyectoParser.FOR, 0); }
		public TerminalNode PARA() { return getToken(proyectoParser.PARA, 0); }
		public IniciacionContext iniciacion() {
			return getRuleContext(IniciacionContext.class,0);
		}
		public TopeContext tope() {
			return getRuleContext(TopeContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public TerminalNode PARC() { return getToken(proyectoParser.PARC, 0); }
		public Decl_cicloforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_ciclofor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterDecl_ciclofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitDecl_ciclofor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitDecl_ciclofor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_cicloforContext decl_ciclofor() throws RecognitionException {
		Decl_cicloforContext _localctx = new Decl_cicloforContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decl_ciclofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(CICLO);
			setState(275);
			match(FOR);
			setState(276);
			match(PARA);
			setState(277);
			iniciacion();
			setState(278);
			tope();
			setState(279);
			paso();
			setState(280);
			match(PARC);
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

	public static class RulewhileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(proyectoParser.EOF, 0); }
		public List<Decl_ciclowhileContext> decl_ciclowhile() {
			return getRuleContexts(Decl_ciclowhileContext.class);
		}
		public Decl_ciclowhileContext decl_ciclowhile(int i) {
			return getRuleContext(Decl_ciclowhileContext.class,i);
		}
		public RulewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulewhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterRulewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitRulewhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitRulewhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulewhileContext rulewhile() throws RecognitionException {
		RulewhileContext _localctx = new RulewhileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rulewhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CICLO) {
				{
				{
				setState(282);
				decl_ciclowhile();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(proyectoParser.PARA, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode PARC() { return getToken(proyectoParser.PARC, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PARA);
			setState(291);
			match(ID);
			setState(292);
			comp_operator();
			setState(293);
			match(ENTERO);
			setState(294);
			match(PARC);
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

	public static class BloqueinstContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public OperacioneswhileContext operacioneswhile() {
			return getRuleContext(OperacioneswhileContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public BloqueinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterBloqueinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitBloqueinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitBloqueinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueinstContext bloqueinst() throws RecognitionException {
		BloqueinstContext _localctx = new BloqueinstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bloqueinst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(LLAA);
			setState(297);
			operacioneswhile();
			setState(298);
			paso();
			setState(299);
			match(LLAC);
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

	public static class Ent_decContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(proyectoParser.DECIMAL, 0); }
		public Ent_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ent_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterEnt_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitEnt_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitEnt_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ent_decContext ent_dec() throws RecognitionException {
		Ent_decContext _localctx = new Ent_decContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ent_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperacioneswhileContext extends ParserRuleContext {
		public List<Ope_variasContext> ope_varias() {
			return getRuleContexts(Ope_variasContext.class);
		}
		public Ope_variasContext ope_varias(int i) {
			return getRuleContext(Ope_variasContext.class,i);
		}
		public List<Ope_programContext> ope_program() {
			return getRuleContexts(Ope_programContext.class);
		}
		public Ope_programContext ope_program(int i) {
			return getRuleContext(Ope_programContext.class,i);
		}
		public OperacioneswhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacioneswhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterOperacioneswhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitOperacioneswhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitOperacioneswhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacioneswhileContext operacioneswhile() throws RecognitionException {
		OperacioneswhileContext _localctx = new OperacioneswhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operacioneswhile);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(305);
					switch (_input.LA(1)) {
					case ENTERO:
					case DECIMAL:
						{
						setState(303);
						ope_varias();
						}
						break;
					case IMPRIME:
					case CICLO:
					case ENT:
					case DEC:
					case CAD:
						{
						setState(304);
						ope_program();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307); 
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

	public static class Ope_variasContext extends ParserRuleContext {
		public List<Ent_decContext> ent_dec() {
			return getRuleContexts(Ent_decContext.class);
		}
		public Ent_decContext ent_dec(int i) {
			return getRuleContext(Ent_decContext.class,i);
		}
		public List<TerminalNode> MULTI() { return getTokens(proyectoParser.MULTI); }
		public TerminalNode MULTI(int i) {
			return getToken(proyectoParser.MULTI, i);
		}
		public List<TerminalNode> END() { return getTokens(proyectoParser.END); }
		public TerminalNode END(int i) {
			return getToken(proyectoParser.END, i);
		}
		public List<TerminalNode> DIV() { return getTokens(proyectoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(proyectoParser.DIV, i);
		}
		public List<TerminalNode> SUMAR() { return getTokens(proyectoParser.SUMAR); }
		public TerminalNode SUMAR(int i) {
			return getToken(proyectoParser.SUMAR, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(proyectoParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(proyectoParser.RESTA, i);
		}
		public Ope_variasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ope_varias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterOpe_varias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitOpe_varias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitOpe_varias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ope_variasContext ope_varias() throws RecognitionException {
		Ope_variasContext _localctx = new Ope_variasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ope_varias);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(309);
						ent_dec();
						setState(310);
						match(MULTI);
						setState(311);
						ent_dec();
						setState(312);
						match(END);
						}
						break;
					case 2:
						{
						setState(314);
						ent_dec();
						setState(315);
						match(DIV);
						setState(316);
						ent_dec();
						setState(317);
						match(END);
						}
						break;
					case 3:
						{
						setState(319);
						ent_dec();
						setState(320);
						match(SUMAR);
						setState(321);
						ent_dec();
						setState(322);
						match(END);
						}
						break;
					case 4:
						{
						setState(324);
						ent_dec();
						setState(325);
						match(RESTA);
						setState(326);
						ent_dec();
						setState(327);
						match(END);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Ope_programContext extends ParserRuleContext {
		public List<Entero_asigContext> entero_asig() {
			return getRuleContexts(Entero_asigContext.class);
		}
		public Entero_asigContext entero_asig(int i) {
			return getRuleContext(Entero_asigContext.class,i);
		}
		public List<Decimal_asigContext> decimal_asig() {
			return getRuleContexts(Decimal_asigContext.class);
		}
		public Decimal_asigContext decimal_asig(int i) {
			return getRuleContext(Decimal_asigContext.class,i);
		}
		public List<Cadena_asigContext> cadena_asig() {
			return getRuleContexts(Cadena_asigContext.class);
		}
		public Cadena_asigContext cadena_asig(int i) {
			return getRuleContext(Cadena_asigContext.class,i);
		}
		public List<ImprimiendoContext> imprimiendo() {
			return getRuleContexts(ImprimiendoContext.class);
		}
		public ImprimiendoContext imprimiendo(int i) {
			return getRuleContext(ImprimiendoContext.class,i);
		}
		public List<Decl_cicloifContext> decl_cicloif() {
			return getRuleContexts(Decl_cicloifContext.class);
		}
		public Decl_cicloifContext decl_cicloif(int i) {
			return getRuleContext(Decl_cicloifContext.class,i);
		}
		public List<Decl_cicloforContext> decl_ciclofor() {
			return getRuleContexts(Decl_cicloforContext.class);
		}
		public Decl_cicloforContext decl_ciclofor(int i) {
			return getRuleContext(Decl_cicloforContext.class,i);
		}
		public List<Vector_asigContext> vector_asig() {
			return getRuleContexts(Vector_asigContext.class);
		}
		public Vector_asigContext vector_asig(int i) {
			return getRuleContext(Vector_asigContext.class,i);
		}
		public List<Vector_asig_cadContext> vector_asig_cad() {
			return getRuleContexts(Vector_asig_cadContext.class);
		}
		public Vector_asig_cadContext vector_asig_cad(int i) {
			return getRuleContext(Vector_asig_cadContext.class,i);
		}
		public List<Matriz_asigContext> matriz_asig() {
			return getRuleContexts(Matriz_asigContext.class);
		}
		public Matriz_asigContext matriz_asig(int i) {
			return getRuleContext(Matriz_asigContext.class,i);
		}
		public List<Matriz_asig_cadContext> matriz_asig_cad() {
			return getRuleContexts(Matriz_asig_cadContext.class);
		}
		public Matriz_asig_cadContext matriz_asig_cad(int i) {
			return getRuleContext(Matriz_asig_cadContext.class,i);
		}
		public Ope_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ope_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterOpe_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitOpe_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitOpe_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ope_programContext ope_program() throws RecognitionException {
		Ope_programContext _localctx = new Ope_programContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ope_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(333);
						entero_asig();
						}
						break;
					case 2:
						{
						setState(334);
						decimal_asig();
						}
						break;
					case 3:
						{
						setState(335);
						cadena_asig();
						}
						break;
					case 4:
						{
						setState(336);
						imprimiendo();
						}
						break;
					case 5:
						{
						setState(337);
						decl_cicloif();
						}
						break;
					case 6:
						{
						setState(338);
						decl_ciclofor();
						}
						break;
					case 7:
						{
						setState(339);
						vector_asig();
						}
						break;
					case 8:
						{
						setState(340);
						vector_asig_cad();
						}
						break;
					case 9:
						{
						setState(341);
						matriz_asig();
						}
						break;
					case 10:
						{
						setState(342);
						matriz_asig_cad();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(345); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Decl_ciclowhileContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(proyectoParser.CICLO, 0); }
		public TerminalNode WHILE() { return getToken(proyectoParser.WHILE, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public BloqueinstContext bloqueinst() {
			return getRuleContext(BloqueinstContext.class,0);
		}
		public Decl_ciclowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_ciclowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterDecl_ciclowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitDecl_ciclowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitDecl_ciclowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_ciclowhileContext decl_ciclowhile() throws RecognitionException {
		Decl_ciclowhileContext _localctx = new Decl_ciclowhileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decl_ciclowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(CICLO);
			setState(348);
			match(WHILE);
			setState(349);
			comparacion();
			setState(350);
			bloqueinst();
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

	public static class Nomb_vecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public TerminalNode CORA() { return getToken(proyectoParser.CORA, 0); }
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode CORC() { return getToken(proyectoParser.CORC, 0); }
		public Nomb_vecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomb_vec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterNomb_vec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitNomb_vec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitNomb_vec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nomb_vecContext nomb_vec() throws RecognitionException {
		Nomb_vecContext _localctx = new Nomb_vecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nomb_vec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(ID);
			setState(353);
			match(CORA);
			setState(354);
			match(ENTERO);
			setState(355);
			match(CORC);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(proyectoParser.ENT, 0); }
		public TerminalNode DEC() { return getToken(proyectoParser.DEC, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==ENT || _la==DEC) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Elem_tipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(proyectoParser.DECIMAL, 0); }
		public TerminalNode CADENA() { return getToken(proyectoParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public Elem_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElem_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElem_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElem_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_tipoContext elem_tipo() throws RecognitionException {
		Elem_tipoContext _localctx = new Elem_tipoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elem_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << ENTERO) | (1L << DECIMAL) | (1L << CADENA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ElementsContext extends ParserRuleContext {
		public Elem_tipoContext elem_tipo() {
			return getRuleContext(Elem_tipoContext.class,0);
		}
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			elem_tipo();
			setState(362);
			match(END);
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

	public static class Elements_cadContext extends ParserRuleContext {
		public List<TerminalNode> COMI() { return getTokens(proyectoParser.COMI); }
		public TerminalNode COMI(int i) {
			return getToken(proyectoParser.COMI, i);
		}
		public Elem_tipoContext elem_tipo() {
			return getRuleContext(Elem_tipoContext.class,0);
		}
		public TerminalNode END() { return getToken(proyectoParser.END, 0); }
		public Elements_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElements_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElements_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElements_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elements_cadContext elements_cad() throws RecognitionException {
		Elements_cadContext _localctx = new Elements_cadContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elements_cad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(COMI);
			setState(365);
			elem_tipo();
			setState(366);
			match(COMI);
			setState(367);
			match(END);
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

	public static class Elem_vecContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public Elem_vecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_vec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElem_vec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElem_vec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElem_vec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_vecContext elem_vec() throws RecognitionException {
		Elem_vecContext _localctx = new Elem_vecContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elem_vec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LLAA);
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				elements();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << ENTERO) | (1L << DECIMAL) | (1L << CADENA))) != 0) );
			setState(375);
			match(LLAC);
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

	public static class Elem_vec_cadContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public List<Elements_cadContext> elements_cad() {
			return getRuleContexts(Elements_cadContext.class);
		}
		public Elements_cadContext elements_cad(int i) {
			return getRuleContext(Elements_cadContext.class,i);
		}
		public Elem_vec_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_vec_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElem_vec_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElem_vec_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElem_vec_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_vec_cadContext elem_vec_cad() throws RecognitionException {
		Elem_vec_cadContext _localctx = new Elem_vec_cadContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elem_vec_cad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(LLAA);
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(378);
				elements_cad();
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMI );
			setState(383);
			match(LLAC);
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

	public static class Vector_asigContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Nomb_vecContext nomb_vec() {
			return getRuleContext(Nomb_vecContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public Elem_vecContext elem_vec() {
			return getRuleContext(Elem_vecContext.class,0);
		}
		public Vector_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterVector_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitVector_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitVector_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_asigContext vector_asig() throws RecognitionException {
		Vector_asigContext _localctx = new Vector_asigContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_vector_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			tipo();
			setState(386);
			nomb_vec();
			setState(387);
			match(ASIG);
			setState(388);
			elem_vec();
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

	public static class Vector_asig_cadContext extends ParserRuleContext {
		public TerminalNode CAD() { return getToken(proyectoParser.CAD, 0); }
		public Nomb_vecContext nomb_vec() {
			return getRuleContext(Nomb_vecContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public Elem_vec_cadContext elem_vec_cad() {
			return getRuleContext(Elem_vec_cadContext.class,0);
		}
		public Vector_asig_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_asig_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterVector_asig_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitVector_asig_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitVector_asig_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_asig_cadContext vector_asig_cad() throws RecognitionException {
		Vector_asig_cadContext _localctx = new Vector_asig_cadContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vector_asig_cad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(CAD);
			setState(391);
			nomb_vec();
			setState(392);
			match(ASIG);
			setState(393);
			elem_vec_cad();
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

	public static class FilaContext extends ParserRuleContext {
		public TerminalNode CORA() { return getToken(proyectoParser.CORA, 0); }
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode CORC() { return getToken(proyectoParser.CORC, 0); }
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitFila(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fila);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(CORA);
			setState(396);
			match(ENTERO);
			setState(397);
			match(CORC);
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

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode CORA() { return getToken(proyectoParser.CORA, 0); }
		public TerminalNode ENTERO() { return getToken(proyectoParser.ENTERO, 0); }
		public TerminalNode CORC() { return getToken(proyectoParser.CORC, 0); }
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(CORA);
			setState(400);
			match(ENTERO);
			setState(401);
			match(CORC);
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

	public static class Nomb_matContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(proyectoParser.ID, 0); }
		public FilaContext fila() {
			return getRuleContext(FilaContext.class,0);
		}
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public Nomb_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomb_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterNomb_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitNomb_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitNomb_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nomb_matContext nomb_mat() throws RecognitionException {
		Nomb_matContext _localctx = new Nomb_matContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nomb_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ID);
			setState(404);
			fila();
			setState(405);
			columna();
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

	public static class Elem_matContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public List<Elem_vecContext> elem_vec() {
			return getRuleContexts(Elem_vecContext.class);
		}
		public Elem_vecContext elem_vec(int i) {
			return getRuleContext(Elem_vecContext.class,i);
		}
		public Elem_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElem_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElem_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElem_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_matContext elem_mat() throws RecognitionException {
		Elem_matContext _localctx = new Elem_matContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elem_mat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(LLAA);
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(408);
				elem_vec();
				}
				}
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LLAA );
			setState(413);
			match(LLAC);
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

	public static class Elem_mat_cadContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public List<Elem_vec_cadContext> elem_vec_cad() {
			return getRuleContexts(Elem_vec_cadContext.class);
		}
		public Elem_vec_cadContext elem_vec_cad(int i) {
			return getRuleContext(Elem_vec_cadContext.class,i);
		}
		public Elem_mat_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_mat_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterElem_mat_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitElem_mat_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitElem_mat_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_mat_cadContext elem_mat_cad() throws RecognitionException {
		Elem_mat_cadContext _localctx = new Elem_mat_cadContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elem_mat_cad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LLAA);
			setState(417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(416);
				elem_vec_cad();
				}
				}
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LLAA );
			setState(421);
			match(LLAC);
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

	public static class Matriz_asigContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Nomb_matContext nomb_mat() {
			return getRuleContext(Nomb_matContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public Elem_matContext elem_mat() {
			return getRuleContext(Elem_matContext.class,0);
		}
		public Matriz_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterMatriz_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitMatriz_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitMatriz_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matriz_asigContext matriz_asig() throws RecognitionException {
		Matriz_asigContext _localctx = new Matriz_asigContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matriz_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			tipo();
			setState(424);
			nomb_mat();
			setState(425);
			match(ASIG);
			setState(426);
			elem_mat();
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

	public static class Matriz_asig_cadContext extends ParserRuleContext {
		public TerminalNode CAD() { return getToken(proyectoParser.CAD, 0); }
		public Nomb_matContext nomb_mat() {
			return getRuleContext(Nomb_matContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(proyectoParser.ASIG, 0); }
		public Elem_mat_cadContext elem_mat_cad() {
			return getRuleContext(Elem_mat_cadContext.class,0);
		}
		public Matriz_asig_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz_asig_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterMatriz_asig_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitMatriz_asig_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitMatriz_asig_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matriz_asig_cadContext matriz_asig_cad() throws RecognitionException {
		Matriz_asig_cadContext _localctx = new Matriz_asig_cadContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_matriz_asig_cad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CAD);
			setState(429);
			nomb_mat();
			setState(430);
			match(ASIG);
			setState(431);
			elem_mat_cad();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUCTION() { return getToken(proyectoParser.FUCTION, 0); }
		public TerminalNode LLAA() { return getToken(proyectoParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(proyectoParser.LLAC, 0); }
		public List<Ope_variasContext> ope_varias() {
			return getRuleContexts(Ope_variasContext.class);
		}
		public Ope_variasContext ope_varias(int i) {
			return getRuleContext(Ope_variasContext.class,i);
		}
		public List<Ope_programContext> ope_program() {
			return getRuleContexts(Ope_programContext.class);
		}
		public Ope_programContext ope_program(int i) {
			return getRuleContext(Ope_programContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proyectoListener ) ((proyectoListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proyectoVisitor ) return ((proyectoVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(FUCTION);
			setState(434);
			match(LLAA);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(437);
				switch (_input.LA(1)) {
				case ENTERO:
				case DECIMAL:
					{
					setState(435);
					ope_varias();
					}
					break;
				case IMPRIME:
				case CICLO:
				case ENT:
				case DEC:
				case CAD:
					{
					setState(436);
					ope_program();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPRIME) | (1L << CICLO) | (1L << ENT) | (1L << DEC) | (1L << CAD) | (1L << ENTERO) | (1L << DECIMAL))) != 0) );
			setState(441);
			match(LLAC);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u009c\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d2\n\f\f\f\16\f\u00d5\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f2\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u0100"+
		"\n\22\f\22\16\22\u0103\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\7\31\u011e\n\31\f\31\16\31\u0121\13\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\6"+
		"\35\u0134\n\35\r\35\16\35\u0135\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u014c"+
		"\n\36\r\36\16\36\u014d\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\6\37\u015a\n\37\r\37\16\37\u015b\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\6&\u0176\n&\r&\16&\u0177\3&\3"+
		"&\3\'\3\'\6\'\u017e\n\'\r\'\16\'\u017f\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\6-\u019c\n-\r-\16-\u019d"+
		"\3-\3-\3.\3.\6.\u01a4\n.\r.\16.\u01a5\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\6\61\u01b8\n\61\r\61\16\61\u01b9\3\61"+
		"\3\61\3\61\2\3\26\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\b\3\2\24\31\3\2\24\30\3\2\'(\3\2+,\3"+
		"\2\7\b\3\2*-\u01db\2b\3\2\2\2\4\u009b\3\2\2\2\6\u009d\3\2\2\2\b\u00a3"+
		"\3\2\2\2\n\u00a9\3\2\2\2\f\u00b1\3\2\2\2\16\u00b3\3\2\2\2\20\u00b6\3\2"+
		"\2\2\22\u00c1\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2\2\2\30\u00d6\3\2\2"+
		"\2\32\u00f1\3\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2 \u00f7\3\2\2\2\""+
		"\u0101\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u010d\3\2\2\2*\u010f\3\2"+
		"\2\2,\u0112\3\2\2\2.\u0114\3\2\2\2\60\u011f\3\2\2\2\62\u0124\3\2\2\2\64"+
		"\u012a\3\2\2\2\66\u012f\3\2\2\28\u0133\3\2\2\2:\u014b\3\2\2\2<\u0159\3"+
		"\2\2\2>\u015d\3\2\2\2@\u0162\3\2\2\2B\u0167\3\2\2\2D\u0169\3\2\2\2F\u016b"+
		"\3\2\2\2H\u016e\3\2\2\2J\u0173\3\2\2\2L\u017b\3\2\2\2N\u0183\3\2\2\2P"+
		"\u0188\3\2\2\2R\u018d\3\2\2\2T\u0191\3\2\2\2V\u0195\3\2\2\2X\u0199\3\2"+
		"\2\2Z\u01a1\3\2\2\2\\\u01a9\3\2\2\2^\u01ae\3\2\2\2`\u01b3\3\2\2\2bc\7"+
		"\3\2\2cd\7*\2\2dh\7\34\2\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\34\2\2l\3\3\2\2\2m\u009c\5\6\4\2n\u009c"+
		"\5\b\5\2o\u009c\5\n\6\2p\u009c\5\f\7\2q\u009c\5\16\b\2r\u009c\5\20\t\2"+
		"s\u009c\5\22\n\2t\u009c\5\24\13\2u\u009c\5\26\f\2v\u009c\5\30\r\2w\u009c"+
		"\5\32\16\2x\u009c\5\34\17\2y\u009c\5\36\20\2z\u009c\5 \21\2{\u009c\5\""+
		"\22\2|\u009c\5$\23\2}\u009c\5&\24\2~\u009c\5(\25\2\177\u009c\5*\26\2\u0080"+
		"\u009c\5,\27\2\u0081\u009c\5.\30\2\u0082\u009c\5\60\31\2\u0083\u009c\5"+
		"\62\32\2\u0084\u009c\5\64\33\2\u0085\u009c\5\66\34\2\u0086\u009c\5:\36"+
		"\2\u0087\u009c\5<\37\2\u0088\u009c\58\35\2\u0089\u009c\5> \2\u008a\u009c"+
		"\5@!\2\u008b\u009c\5B\"\2\u008c\u009c\5D#\2\u008d\u009c\5F$\2\u008e\u009c"+
		"\5H%\2\u008f\u009c\5J&\2\u0090\u009c\5L\'\2\u0091\u009c\5N(\2\u0092\u009c"+
		"\5P)\2\u0093\u009c\5R*\2\u0094\u009c\5T+\2\u0095\u009c\5V,\2\u0096\u009c"+
		"\5X-\2\u0097\u009c\5Z.\2\u0098\u009c\5\\/\2\u0099\u009c\5^\60\2\u009a"+
		"\u009c\5`\61\2\u009bm\3\2\2\2\u009bn\3\2\2\2\u009bo\3\2\2\2\u009bp\3\2"+
		"\2\2\u009bq\3\2\2\2\u009br\3\2\2\2\u009bs\3\2\2\2\u009bt\3\2\2\2\u009b"+
		"u\3\2\2\2\u009bv\3\2\2\2\u009bw\3\2\2\2\u009bx\3\2\2\2\u009by\3\2\2\2"+
		"\u009bz\3\2\2\2\u009b{\3\2\2\2\u009b|\3\2\2\2\u009b}\3\2\2\2\u009b~\3"+
		"\2\2\2\u009b\177\3\2\2\2\u009b\u0080\3\2\2\2\u009b\u0081\3\2\2\2\u009b"+
		"\u0082\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0084\3\2\2\2\u009b\u0085\3\2"+
		"\2\2\u009b\u0086\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u0088\3\2\2\2\u009b"+
		"\u0089\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008c\3\2"+
		"\2\2\u009b\u008d\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u008f\3\2\2\2\u009b"+
		"\u0090\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2"+
		"\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\5\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7*\2\2\u009f\u00a0"+
		"\7\32\2\2\u00a0\u00a1\7+\2\2\u00a1\u00a2\7\33\2\2\u00a2\7\3\2\2\2\u00a3"+
		"\u00a4\7\b\2\2\u00a4\u00a5\7*\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7,"+
		"\2\2\u00a7\u00a8\7\33\2\2\u00a8\t\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab"+
		"\7*\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7-\2\2\u00ad\u00ae\7\33\2\2\u00ae"+
		"\13\3\2\2\2\u00af\u00b2\5\6\4\2\u00b0\u00b2\5\b\5\2\u00b1\u00af\3\2\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\r\3\2\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5"+
		"\5\f\7\2\u00b5\17\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\7 \2\2\u00b8"+
		"\u00b9\7\37\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\7"+
		"!\2\2\u00bc\u00bd\7\33\2\2\u00bd\21\3\2\2\2\u00be\u00c0\5 \21\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\2\2\3\u00c5"+
		"\23\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7\25\3\2\2\2\u00c8\u00c9\b\f\1\2"+
		"\u00c9\u00ca\5\30\r\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc\f\5\2\2\u00cc\u00cd"+
		"\7\17\2\2\u00cd\u00d2\5\26\f\6\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7\20\2"+
		"\2\u00d0\u00d2\5\26\f\5\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\27\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\5\32\16\2\u00d8"+
		"\u00d9\5\34\17\2\u00d9\u00da\5\32\16\2\u00da\u00db\7!\2\2\u00db\31\3\2"+
		"\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7+\2\2\u00de\u00df\7\r\2\2\u00df\u00e0"+
		"\7+\2\2\u00e0\u00f2\7!\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\7+\2\2\u00e3"+
		"\u00e4\7\16\2\2\u00e4\u00e5\7+\2\2\u00e5\u00f2\7!\2\2\u00e6\u00e7\7 \2"+
		"\2\u00e7\u00e8\7+\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\7+\2\2\u00ea\u00f2"+
		"\7!\2\2\u00eb\u00ec\7 \2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\7\f\2\2\u00ee"+
		"\u00ef\7+\2\2\u00ef\u00f2\7!\2\2\u00f0\u00f2\7+\2\2\u00f1\u00dc\3\2\2"+
		"\2\u00f1\u00e1\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\33\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6"+
		"\7-\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"\u00fa\5\24\13\2\u00fa\u00fb\7%\2\2\u00fb\u00fc\5\36\20\2\u00fc\u00fd"+
		"\7\33\2\2\u00fd!\3\2\2\2\u00fe\u0100\5.\30\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\2\2\3\u0105#\3\2\2\2\u0106\u0107"+
		"\5\6\4\2\u0107%\3\2\2\2\u0108\u0109\7*\2\2\u0109\u010a\5(\25\2\u010a\u010b"+
		"\7+\2\2\u010b\u010c\7\33\2\2\u010c\'\3\2\2\2\u010d\u010e\t\3\2\2\u010e"+
		")\3\2\2\2\u010f\u0110\7*\2\2\u0110\u0111\5,\27\2\u0111+\3\2\2\2\u0112"+
		"\u0113\t\4\2\2\u0113-\3\2\2\2\u0114\u0115\7\5\2\2\u0115\u0116\7&\2\2\u0116"+
		"\u0117\7 \2\2\u0117\u0118\5$\23\2\u0118\u0119\5&\24\2\u0119\u011a\5*\26"+
		"\2\u011a\u011b\7!\2\2\u011b/\3\2\2\2\u011c\u011e\5> \2\u011d\u011c\3\2"+
		"\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\2\2\3\u0123\61\3\2\2"+
		"\2\u0124\u0125\7 \2\2\u0125\u0126\7*\2\2\u0126\u0127\5\34\17\2\u0127\u0128"+
		"\7+\2\2\u0128\u0129\7!\2\2\u0129\63\3\2\2\2\u012a\u012b\7\35\2\2\u012b"+
		"\u012c\58\35\2\u012c\u012d\5*\26\2\u012d\u012e\7\36\2\2\u012e\65\3\2\2"+
		"\2\u012f\u0130\t\5\2\2\u0130\67\3\2\2\2\u0131\u0134\5:\36\2\u0132\u0134"+
		"\5<\37\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u01369\3\2\2\2\u0137\u0138\5\66\34"+
		"\2\u0138\u0139\7\r\2\2\u0139\u013a\5\66\34\2\u013a\u013b\7\33\2\2\u013b"+
		"\u014c\3\2\2\2\u013c\u013d\5\66\34\2\u013d\u013e\7\16\2\2\u013e\u013f"+
		"\5\66\34\2\u013f\u0140\7\33\2\2\u0140\u014c\3\2\2\2\u0141\u0142\5\66\34"+
		"\2\u0142\u0143\7\13\2\2\u0143\u0144\5\66\34\2\u0144\u0145\7\33\2\2\u0145"+
		"\u014c\3\2\2\2\u0146\u0147\5\66\34\2\u0147\u0148\7\f\2\2\u0148\u0149\5"+
		"\66\34\2\u0149\u014a\7\33\2\2\u014a\u014c\3\2\2\2\u014b\u0137\3\2\2\2"+
		"\u014b\u013c\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0146\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e;\3\2\2\2\u014f"+
		"\u015a\5\6\4\2\u0150\u015a\5\b\5\2\u0151\u015a\5\n\6\2\u0152\u015a\5\20"+
		"\t\2\u0153\u015a\5 \21\2\u0154\u015a\5.\30\2\u0155\u015a\5N(\2\u0156\u015a"+
		"\5P)\2\u0157\u015a\5\\/\2\u0158\u015a\5^\60\2\u0159\u014f\3\2\2\2\u0159"+
		"\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2"+
		"\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c=\3\2\2\2\u015d\u015e\7\5\2\2\u015e\u015f"+
		"\7)\2\2\u015f\u0160\5\62\32\2\u0160\u0161\5\64\33\2\u0161?\3\2\2\2\u0162"+
		"\u0163\7*\2\2\u0163\u0164\7\"\2\2\u0164\u0165\7+\2\2\u0165\u0166\7#\2"+
		"\2\u0166A\3\2\2\2\u0167\u0168\t\6\2\2\u0168C\3\2\2\2\u0169\u016a\t\7\2"+
		"\2\u016aE\3\2\2\2\u016b\u016c\5D#\2\u016c\u016d\7\33\2\2\u016dG\3\2\2"+
		"\2\u016e\u016f\7\37\2\2\u016f\u0170\5D#\2\u0170\u0171\7\37\2\2\u0171\u0172"+
		"\7\33\2\2\u0172I\3\2\2\2\u0173\u0175\7\35\2\2\u0174\u0176\5F$\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\36\2\2\u017aK\3\2\2\2\u017b\u017d"+
		"\7\35\2\2\u017c\u017e\5H%\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\36"+
		"\2\2\u0182M\3\2\2\2\u0183\u0184\5B\"\2\u0184\u0185\5@!\2\u0185\u0186\7"+
		"\32\2\2\u0186\u0187\5J&\2\u0187O\3\2\2\2\u0188\u0189\7\t\2\2\u0189\u018a"+
		"\5@!\2\u018a\u018b\7\32\2\2\u018b\u018c\5L\'\2\u018cQ\3\2\2\2\u018d\u018e"+
		"\7\"\2\2\u018e\u018f\7+\2\2\u018f\u0190\7#\2\2\u0190S\3\2\2\2\u0191\u0192"+
		"\7\"\2\2\u0192\u0193\7+\2\2\u0193\u0194\7#\2\2\u0194U\3\2\2\2\u0195\u0196"+
		"\7*\2\2\u0196\u0197\5R*\2\u0197\u0198\5T+\2\u0198W\3\2\2\2\u0199\u019b"+
		"\7\35\2\2\u019a\u019c\5J&\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\36"+
		"\2\2\u01a0Y\3\2\2\2\u01a1\u01a3\7\35\2\2\u01a2\u01a4\5L\'\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\7\36\2\2\u01a8[\3\2\2\2\u01a9\u01aa\5B\"\2"+
		"\u01aa\u01ab\5V,\2\u01ab\u01ac\7\32\2\2\u01ac\u01ad\5X-\2\u01ad]\3\2\2"+
		"\2\u01ae\u01af\7\t\2\2\u01af\u01b0\5V,\2\u01b0\u01b1\7\32\2\2\u01b1\u01b2"+
		"\5Z.\2\u01b2_\3\2\2\2\u01b3\u01b4\7\6\2\2\u01b4\u01b7\7\35\2\2\u01b5\u01b8"+
		"\5:\36\2\u01b6\u01b8\5<\37\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\7\36\2\2\u01bca\3\2\2\2\27h\u009b\u00b1\u00c1\u00d1\u00d3"+
		"\u00f1\u0101\u011f\u0133\u0135\u014b\u014d\u0159\u015b\u0177\u017f\u019d"+
		"\u01a5\u01b7\u01b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}