grammar proyecto;

//LISTA TOKENS - PALABRAS RESERVADAS

RUNNING: 'running';
IMPRIME: 'imprime';
CICLO: 'ciclo';
FUCTION: 'fuction';

//tipos de variables
ENT:'ent';
DEC:'dec';
CAD:'cad';

//Constantes
CONST: 'const';

//operadores aritmeticos
SUMAR:'+'; 
RESTA:'-';
MULTI:'*';
DIV:'/';

//operadores logicos
Y:'y'; 
O:'o';
NO:'nou';
FAL:'fal';
VER:'ver';

//operadores de comparacion 
MAYOR: '>';
MENOR: '<';
MAYGUAL: '>=';
MEYGUAL:'<=';
IGUAL2: '==';
NEGIGUAL:'!=';

//operacion de asignacion de variables
ASIG:'=';

//fin
END:',';

//Signos de Abrir y Cerrar
INICIO: ':';
LLAA: '{';
LLAC: '}';
COMI:'"';
PARA:'(';
PARC:')';
CORA:'[';
CORC:']';

//Ciclo If
IF: 'if';
THEN: 'then';

//Ciclo For
FOR: 'for';
MASFOR: '++';
MENFOR: '--';

//Ciclo While
WHILE: 'while';

//Variables
ID: [a-zA-Z]*;
ENTERO:[0-9]+;
DECIMAL: '-'?[0-9]+('.'[0-9]+)?;
CADENA: [a-zA-Z_0-9]*;

COMMENT: '//' .+? ('\n'| EOF) -> skip;
WS:[\t\n\r]+ -> skip;

	   	
running: RUNNING ID INICIO
	sentence* //SIGNIFICA QUE PUEDE APARECER VARIAS VECES UNA SENTENCIA
	INICIO;
	
	sentence: 	entero_asig|decimal_asig|cadena_asig|consts|const_asig|imprimiendo|ruleif|condicion|expr|comp_expr|
				operacion|comp_operator|conclusion|decl_cicloif|rulefor|iniciacion|tope|tope_op|
				paso|paso_op|decl_ciclofor|rulewhile|comparacion|bloqueinst|ent_dec|ope_varias|ope_program|operacioneswhile|decl_ciclowhile|
				nomb_vec|tipo|elem_tipo|elements|elements_cad|elem_vec|elem_vec_cad|vector_asig|vector_asig_cad|
				fila|columna|nomb_mat|elem_mat|elem_mat_cad|matriz_asig|matriz_asig_cad|funcion; 			//PRODUCCIONES DE LA SENTENCIA
    
	//DECLARACION DE VARIABLES
	entero_asig: ENT ID ASIG ENTERO END;				//ASIGNACION ENTERO
	decimal_asig: DEC ID ASIG DECIMAL END; 				//ASIGNACION DECIMAL
	cadena_asig: CAD ID ASIG CADENA END;				//ASIGNACION STRING
	
	//DECLARACION DE CONTANTES
	consts: entero_asig|decimal_asig;
	const_asig: CONST consts; 							//ASIGNACION CONSTANTE
	
	
	//IMPRIMIR
	imprimiendo: IMPRIME PARA COMI CADENA COMI PARC END; //IMPRESION  POR PANTALLA
	
	//CICLO IF
	ruleif : decl_cicloif*EOF;				//end of file
	condicion: expr;	 				//CONDICION IF 
	expr: expr Y expr | expr O expr | comp_expr;
	comp_expr : PARA operacion comp_operator operacion PARC;
	operacion	: PARA ENTERO MULTI ENTERO PARC | PARA ENTERO DIV ENTERO PARC |PARA ENTERO SUMAR ENTERO PARC|PARA ENTERO RESTA ENTERO PARC | ENTERO;
	comp_operator	:	MAYOR |	MENOR |	MAYGUAL |	MEYGUAL |	IGUAL2 | NEGIGUAL;
	conclusion : CADENA; 						//CONCLUSION IF
	decl_cicloif: CICLO IF condicion THEN conclusion END;		//ESQUEMA CICLO IF
	
	//CICLO FOR
	rulefor : decl_ciclofor*EOF;				//end of file
		//iniciacion
		iniciacion : entero_asig;
		//test
		tope : ID tope_op ENTERO END;
		tope_op: IGUAL2 |MENOR | MAYOR | MAYGUAL | MEYGUAL; 
		//paso
	    paso: ID paso_op;
		paso_op: MASFOR |MENFOR; 	 					
	decl_ciclofor : CICLO FOR PARA iniciacion tope paso PARC;
		
	//CICLO WHILE
	rulewhile: decl_ciclowhile*EOF;
		comparacion : PARA ID comp_operator ENTERO PARC;
		bloqueinst: LLAA operacioneswhile paso LLAC;
		ent_dec: ENTERO | DECIMAL;
		operacioneswhile: (ope_varias | ope_program)+;
		ope_varias: (ent_dec MULTI ent_dec END | ent_dec DIV ent_dec END | ent_dec SUMAR ent_dec END | ent_dec RESTA ent_dec END)+;
		ope_program:(entero_asig|decimal_asig|cadena_asig|imprimiendo|decl_cicloif| decl_ciclofor|vector_asig|vector_asig_cad|matriz_asig|matriz_asig_cad)+;
	decl_ciclowhile: CICLO WHILE comparacion bloqueinst;
	
	//VECTOR
		nomb_vec: ID CORA ENTERO CORC;
		tipo: ENT | DEC;
		elem_tipo: ENTERO | DECIMAL | CADENA |ID;
		elements: elem_tipo END;  
		elements_cad: COMI elem_tipo COMI END;
		elem_vec: LLAA elements+ LLAC;  
		elem_vec_cad: LLAA elements_cad+ LLAC;
	vector_asig: tipo nomb_vec ASIG elem_vec;
	vector_asig_cad: CAD nomb_vec ASIG elem_vec_cad;
	
	//MATRIZ
		fila: CORA ENTERO CORC;
		columna: CORA ENTERO CORC;
		nomb_mat: ID fila columna;
		elem_mat: LLAA elem_vec+ LLAC;
		elem_mat_cad: LLAA elem_vec_cad+ LLAC;
	matriz_asig: tipo nomb_mat ASIG elem_mat;
	matriz_asig_cad: CAD nomb_mat ASIG elem_mat_cad;
	
	//FUNCION
	funcion: FUCTION LLAA(ope_varias|ope_program)+ LLAC; 	