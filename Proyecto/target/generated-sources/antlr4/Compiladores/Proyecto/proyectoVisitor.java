// Generated from Compiladores\Proyecto\proyecto.g4 by ANTLR 4.5.1
package Compiladores.Proyecto;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link proyectoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface proyectoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link proyectoParser#running}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunning(proyectoParser.RunningContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(proyectoParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#entero_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero_asig(proyectoParser.Entero_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#decimal_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_asig(proyectoParser.Decimal_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#cadena_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena_asig(proyectoParser.Cadena_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(proyectoParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#const_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_asig(proyectoParser.Const_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#imprimiendo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimiendo(proyectoParser.ImprimiendoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#ruleif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleif(proyectoParser.RuleifContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(proyectoParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(proyectoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#comp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_expr(proyectoParser.Comp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(proyectoParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_operator(proyectoParser.Comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(proyectoParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#decl_cicloif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cicloif(proyectoParser.Decl_cicloifContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#rulefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulefor(proyectoParser.RuleforContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#iniciacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciacion(proyectoParser.IniciacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#tope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTope(proyectoParser.TopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#tope_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTope_op(proyectoParser.Tope_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(proyectoParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#paso_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso_op(proyectoParser.Paso_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#decl_ciclofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_ciclofor(proyectoParser.Decl_cicloforContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#rulewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulewhile(proyectoParser.RulewhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(proyectoParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#bloqueinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueinst(proyectoParser.BloqueinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#ent_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnt_dec(proyectoParser.Ent_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#operacioneswhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacioneswhile(proyectoParser.OperacioneswhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#ope_varias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpe_varias(proyectoParser.Ope_variasContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#ope_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpe_program(proyectoParser.Ope_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#decl_ciclowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_ciclowhile(proyectoParser.Decl_ciclowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#nomb_vec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomb_vec(proyectoParser.Nomb_vecContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(proyectoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elem_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_tipo(proyectoParser.Elem_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(proyectoParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elements_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements_cad(proyectoParser.Elements_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elem_vec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_vec(proyectoParser.Elem_vecContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elem_vec_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_vec_cad(proyectoParser.Elem_vec_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#vector_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_asig(proyectoParser.Vector_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#vector_asig_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_asig_cad(proyectoParser.Vector_asig_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(proyectoParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(proyectoParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#nomb_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomb_mat(proyectoParser.Nomb_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elem_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_mat(proyectoParser.Elem_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#elem_mat_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_mat_cad(proyectoParser.Elem_mat_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#matriz_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz_asig(proyectoParser.Matriz_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#matriz_asig_cad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz_asig_cad(proyectoParser.Matriz_asig_cadContext ctx);
	/**
	 * Visit a parse tree produced by {@link proyectoParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(proyectoParser.FuncionContext ctx);
}