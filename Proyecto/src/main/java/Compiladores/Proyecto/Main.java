
package Compiladores.Proyecto;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "comp";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		proyectoLexer lexer = new proyectoLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		proyectoParser parser = new proyectoParser(tokens);

		proyectoParser.RunningContext tree = parser.running();

		proyectoCustomVisitor visitor = new proyectoCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
