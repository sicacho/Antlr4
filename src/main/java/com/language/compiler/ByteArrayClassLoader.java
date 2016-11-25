package com.language.compiler;


import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * Created by tnkhang on 11/22/2016.
 */
public class ByteArrayClassLoader extends ClassLoader {

  private byte[] bytecode;

  private ByteArrayClassLoader() {
    super(ByteArrayClassLoader.class.getClassLoader());
  }

  /**
   * Returns a Class object using the class name and its bytecode.
   *
   * @param fqdn Fully qualified class name
   * @param byteCode Bytecode
   * @return Loaded class
   * @throws ClassNotFoundException Thrown when class not found
   */
  public Class<?> loadClass(String fqdn, byte[] byteCode)
          throws ClassNotFoundException {
    setBytecode(byteCode.clone());
    return loadClass(fqdn);
  }

  @Override
  protected Class findClass(String name)
          throws ClassNotFoundException {
    Class<?> cls = null;

    try {
      if (bytecode != null) {
        cls = defineClass(name, bytecode);
      }
    } catch (ClassFormatError ex) {
      throw new ClassNotFoundException("Class name: " + name, ex);
    }

    return cls;
  }

  public static ByteArrayClassLoader newInstance() {
    return AccessController.doPrivileged(new BaclPrevilegedAction());
  }

  Class<?> defineClass(String name, byte[] bytecode) {
    return defineClass(name, bytecode, 0, bytecode.length);
  }

  void setBytecode(byte[] bytecode) {
    this.bytecode = bytecode;
  }

  byte[] getBytecode() {
    return bytecode;
  }

  private static class BaclPrevilegedAction implements PrivilegedAction<ByteArrayClassLoader> {

    @Override
    public ByteArrayClassLoader run() {
      return new ByteArrayClassLoader();
    }

  }
}
