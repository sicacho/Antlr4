import antlr4.generate.rule.RuleLexer;
import antlr4.generate.rule.RuleParser;
import com.language.compiler.ByteArrayClassLoader;
import com.language.compiler.InMemoryCompiler;
import com.language.util.Post;
import com.language.util.Rule;
import com.language.util.RuleResult;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tnkhang on 11/11/2016.
 */
public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String inputFile = null;
    if (args.length == 0) inputFile = "D:\\antlr4-practice\\src\\main\\java\\t.json";
    InputStream is = new FileInputStream(inputFile);
    ANTLRInputStream input = new ANTLRInputStream(is);
    RuleLexer lexer = new RuleLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    RuleParser parser = new RuleParser(tokens);
    ParseTree tree = parser.rules(); // parse; start at prog
    ParseTreeWalker walker = new ParseTreeWalker();
    RuleExtractListener ruleExtractListener = new RuleExtractListener();
    walker.walk(ruleExtractListener,tree);
    InMemoryCompiler inMemoryCompiler = new InMemoryCompiler();
    byte[] complied =  inMemoryCompiler.createJavaBytecodeFromString(ruleExtractListener.getClassName(),ruleExtractListener.getClassSource());
    System.out.println(complied);

    ByteArrayClassLoader classLoader = ByteArrayClassLoader.newInstance();
    try {
      Class<?> cls = classLoader.loadClass("com.language.generate."+ruleExtractListener.getClassName(),complied);
      Rule rule = (Rule) cls.newInstance();
      RuleResult ruleResult = rule.matches(new Post(), (value, operator, field, post) -> {return true;});
      System.out.println(ruleResult.toString());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }


//    System.out.println(tree.toStringTree(parser)); // print tree as text
  }
}
