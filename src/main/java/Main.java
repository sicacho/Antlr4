import antlr4.generate.expr.ExprLexer;
import antlr4.generate.expr.ExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tnkhang on 11/11/2016.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    String inputFile = null;
     if ( args.length==0 ) inputFile = "D:\\antlr4-practice\\src\\main\\java\\t.expr";
     InputStream is = new FileInputStream(inputFile);
     ANTLRInputStream input = new ANTLRInputStream(is);
     ExprLexer lexer = new ExprLexer(input);
     CommonTokenStream tokens = new CommonTokenStream(lexer);
     ExprParser parser = new ExprParser(tokens);
     ParseTree tree = parser.prog(); // parse; start at prog
     System.out.println(tree.toStringTree(parser)); // print tree as text
  }
}
