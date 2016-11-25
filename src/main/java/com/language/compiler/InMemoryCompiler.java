package com.language.compiler;

import javax.tools.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tnkhang on 11/22/2016.
 */
public class InMemoryCompiler {
  public byte[] createJavaBytecodeFromString(String className,String source) throws IOException, ClassNotFoundException {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
    // defining classpath
    JavaFileObject file = new JavaSourceFromString(className,source);
    Iterable<? extends JavaFileObject> strfiles = Arrays.asList(file);
    // add classpath to options
    InMemoryClassManager manager = new InMemoryClassManager(compiler.getStandardFileManager(null, null, null));
    // compile
    JavaCompiler.CompilationTask task = compiler.getTask(null, manager, diagnostics, null, null, strfiles);
    boolean success = task.call();
    for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
      System.out.println(diagnostic.getCode());
      System.out.println(diagnostic.getKind());
      System.out.println(diagnostic.getPosition());
      System.out.println(diagnostic.getStartPosition());
      System.out.println(diagnostic.getEndPosition());
      System.out.println(diagnostic.getSource());
      System.out.println(diagnostic.getMessage(null));

    }
    System.out.println("Success: " + success);
    List<CompilationUnit> compilationUnits = manager.getAllClasses();
//    System.out.println(targetArray.length);
//    System.out.println(Class.forName("com.language.generate."+className).getPackage().toString());
    return compilationUnits.get(0).getBytecode();
  }

}
