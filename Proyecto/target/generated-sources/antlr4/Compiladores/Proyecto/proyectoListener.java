// Generated from Compiladores\Proyecto\proyecto.g4 by ANTLR 4.5.1
package Compiladores.Proyecto;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link proyectoParser}.
 */
public interface proyectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link proyectoParser#running}.
	 * @param ctx the parse tree
	 */
	void enterRunning(proyectoParser.RunningContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#running}.
	 * @param ctx the parse tree
	 */
	void exitRunning(proyectoParser.RunningContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(proyectoParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(proyectoParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#entero_asig}.
	 * @param ctx the parse tree
	 */
	void enterEntero_asig(proyectoParser.Entero_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#entero_asig}.
	 * @param ctx the parse tree
	 */
	void exitEntero_asig(proyectoParser.Entero_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#decimal_asig}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_asig(proyectoParser.Decimal_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#decimal_asig}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_asig(proyectoParser.Decimal_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#cadena_asig}.
	 * @param ctx the parse tree
	 */
	void enterCadena_asig(proyectoParser.Cadena_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#cadena_asig}.
	 * @param ctx the parse tree
	 */
	void exitCadena_asig(proyectoParser.Cadena_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(proyectoParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(proyectoParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#const_asig}.
	 * @param ctx the parse tree
	 */
	void enterConst_asig(proyectoParser.Const_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#const_asig}.
	 * @param ctx the parse tree
	 */
	void exitConst_asig(proyectoParser.Const_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#imprimiendo}.
	 * @param ctx the parse tree
	 */
	void enterImprimiendo(proyectoParser.ImprimiendoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#imprimiendo}.
	 * @param ctx the parse tree
	 */
	void exitImprimiendo(proyectoParser.ImprimiendoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#ruleif}.
	 * @param ctx the parse tree
	 */
	void enterRuleif(proyectoParser.RuleifContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#ruleif}.
	 * @param ctx the parse tree
	 */
	void exitRuleif(proyectoParser.RuleifContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(proyectoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(proyectoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(proyectoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(proyectoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void enterComp_expr(proyectoParser.Comp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void exitComp_expr(proyectoParser.Comp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(proyectoParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(proyectoParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(proyectoParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(proyectoParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(proyectoParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(proyectoParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#decl_cicloif}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cicloif(proyectoParser.Decl_cicloifContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#decl_cicloif}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cicloif(proyectoParser.Decl_cicloifContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#rulefor}.
	 * @param ctx the parse tree
	 */
	void enterRulefor(proyectoParser.RuleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#rulefor}.
	 * @param ctx the parse tree
	 */
	void exitRulefor(proyectoParser.RuleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#iniciacion}.
	 * @param ctx the parse tree
	 */
	void enterIniciacion(proyectoParser.IniciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#iniciacion}.
	 * @param ctx the parse tree
	 */
	void exitIniciacion(proyectoParser.IniciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#tope}.
	 * @param ctx the parse tree
	 */
	void enterTope(proyectoParser.TopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#tope}.
	 * @param ctx the parse tree
	 */
	void exitTope(proyectoParser.TopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#tope_op}.
	 * @param ctx the parse tree
	 */
	void enterTope_op(proyectoParser.Tope_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#tope_op}.
	 * @param ctx the parse tree
	 */
	void exitTope_op(proyectoParser.Tope_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(proyectoParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(proyectoParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#paso_op}.
	 * @param ctx the parse tree
	 */
	void enterPaso_op(proyectoParser.Paso_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#paso_op}.
	 * @param ctx the parse tree
	 */
	void exitPaso_op(proyectoParser.Paso_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#decl_ciclofor}.
	 * @param ctx the parse tree
	 */
	void enterDecl_ciclofor(proyectoParser.Decl_cicloforContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#decl_ciclofor}.
	 * @param ctx the parse tree
	 */
	void exitDecl_ciclofor(proyectoParser.Decl_cicloforContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#rulewhile}.
	 * @param ctx the parse tree
	 */
	void enterRulewhile(proyectoParser.RulewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#rulewhile}.
	 * @param ctx the parse tree
	 */
	void exitRulewhile(proyectoParser.RulewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(proyectoParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(proyectoParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#bloqueinst}.
	 * @param ctx the parse tree
	 */
	void enterBloqueinst(proyectoParser.BloqueinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#bloqueinst}.
	 * @param ctx the parse tree
	 */
	void exitBloqueinst(proyectoParser.BloqueinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#ent_dec}.
	 * @param ctx the parse tree
	 */
	void enterEnt_dec(proyectoParser.Ent_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#ent_dec}.
	 * @param ctx the parse tree
	 */
	void exitEnt_dec(proyectoParser.Ent_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#operacioneswhile}.
	 * @param ctx the parse tree
	 */
	void enterOperacioneswhile(proyectoParser.OperacioneswhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#operacioneswhile}.
	 * @param ctx the parse tree
	 */
	void exitOperacioneswhile(proyectoParser.OperacioneswhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#ope_varias}.
	 * @param ctx the parse tree
	 */
	void enterOpe_varias(proyectoParser.Ope_variasContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#ope_varias}.
	 * @param ctx the parse tree
	 */
	void exitOpe_varias(proyectoParser.Ope_variasContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#ope_program}.
	 * @param ctx the parse tree
	 */
	void enterOpe_program(proyectoParser.Ope_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#ope_program}.
	 * @param ctx the parse tree
	 */
	void exitOpe_program(proyectoParser.Ope_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#decl_ciclowhile}.
	 * @param ctx the parse tree
	 */
	void enterDecl_ciclowhile(proyectoParser.Decl_ciclowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#decl_ciclowhile}.
	 * @param ctx the parse tree
	 */
	void exitDecl_ciclowhile(proyectoParser.Decl_ciclowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#nomb_vec}.
	 * @param ctx the parse tree
	 */
	void enterNomb_vec(proyectoParser.Nomb_vecContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#nomb_vec}.
	 * @param ctx the parse tree
	 */
	void exitNomb_vec(proyectoParser.Nomb_vecContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(proyectoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(proyectoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elem_tipo}.
	 * @param ctx the parse tree
	 */
	void enterElem_tipo(proyectoParser.Elem_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elem_tipo}.
	 * @param ctx the parse tree
	 */
	void exitElem_tipo(proyectoParser.Elem_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(proyectoParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(proyectoParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elements_cad}.
	 * @param ctx the parse tree
	 */
	void enterElements_cad(proyectoParser.Elements_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elements_cad}.
	 * @param ctx the parse tree
	 */
	void exitElements_cad(proyectoParser.Elements_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elem_vec}.
	 * @param ctx the parse tree
	 */
	void enterElem_vec(proyectoParser.Elem_vecContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elem_vec}.
	 * @param ctx the parse tree
	 */
	void exitElem_vec(proyectoParser.Elem_vecContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elem_vec_cad}.
	 * @param ctx the parse tree
	 */
	void enterElem_vec_cad(proyectoParser.Elem_vec_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elem_vec_cad}.
	 * @param ctx the parse tree
	 */
	void exitElem_vec_cad(proyectoParser.Elem_vec_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#vector_asig}.
	 * @param ctx the parse tree
	 */
	void enterVector_asig(proyectoParser.Vector_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#vector_asig}.
	 * @param ctx the parse tree
	 */
	void exitVector_asig(proyectoParser.Vector_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#vector_asig_cad}.
	 * @param ctx the parse tree
	 */
	void enterVector_asig_cad(proyectoParser.Vector_asig_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#vector_asig_cad}.
	 * @param ctx the parse tree
	 */
	void exitVector_asig_cad(proyectoParser.Vector_asig_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(proyectoParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(proyectoParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(proyectoParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(proyectoParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#nomb_mat}.
	 * @param ctx the parse tree
	 */
	void enterNomb_mat(proyectoParser.Nomb_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#nomb_mat}.
	 * @param ctx the parse tree
	 */
	void exitNomb_mat(proyectoParser.Nomb_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elem_mat}.
	 * @param ctx the parse tree
	 */
	void enterElem_mat(proyectoParser.Elem_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elem_mat}.
	 * @param ctx the parse tree
	 */
	void exitElem_mat(proyectoParser.Elem_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#elem_mat_cad}.
	 * @param ctx the parse tree
	 */
	void enterElem_mat_cad(proyectoParser.Elem_mat_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#elem_mat_cad}.
	 * @param ctx the parse tree
	 */
	void exitElem_mat_cad(proyectoParser.Elem_mat_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#matriz_asig}.
	 * @param ctx the parse tree
	 */
	void enterMatriz_asig(proyectoParser.Matriz_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#matriz_asig}.
	 * @param ctx the parse tree
	 */
	void exitMatriz_asig(proyectoParser.Matriz_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#matriz_asig_cad}.
	 * @param ctx the parse tree
	 */
	void enterMatriz_asig_cad(proyectoParser.Matriz_asig_cadContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#matriz_asig_cad}.
	 * @param ctx the parse tree
	 */
	void exitMatriz_asig_cad(proyectoParser.Matriz_asig_cadContext ctx);
	/**
	 * Enter a parse tree produced by {@link proyectoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(proyectoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(proyectoParser.FuncionContext ctx);
}