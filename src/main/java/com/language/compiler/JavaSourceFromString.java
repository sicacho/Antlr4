package com.language.compiler;

import javax.tools.SimpleJavaFileObject;
import java.net.URI;

/**
 * Created by tnkhang on 11/22/2016.
 */
public class JavaSourceFromString extends SimpleJavaFileObject {

  private final String code;
  private final String className;

  public JavaSourceFromString(String className, String javaSourceCode) {
    super(URI.create("string:///" + className.replace('.','/') + Kind.SOURCE.extension),Kind.SOURCE);
    this.className = className;
    this.code = javaSourceCode;
  }

  @Override
  public final CharSequence getCharContent(boolean ignoreEncodingErrors) {
    return code;
  }

  @Override
  public final String getName() {
    return className;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    JavaSourceFromString that = (JavaSourceFromString) o;

    if (!code.equals(that.code)) return false;
    return className.equals(that.className);

  }

  @Override
  public int hashCode() {
    int result = code.hashCode();
    result = 31 * result + className.hashCode();
    return result;
  }
}
