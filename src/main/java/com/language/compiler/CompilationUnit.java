package com.language.compiler;


/**
 * A compilation unit is a compiled class. This class has a name and the
 * corresponding byte code. The compilation units are stored in a compilation
 * package.
 */
public class CompilationUnit {
	private final String name;
	private final JavaMemoryObject memoryObject;

	/**
	 * Constructs a compilation unit given a name and a byte array java file
	 * object containing the bytecode.
	 * 
	 * @param unitName Class name
	 * @param memoryObject Memory object
	 */
	public CompilationUnit(String unitName, JavaMemoryObject memoryObject) {
		this.name = unitName;
		this.memoryObject = memoryObject;
	}
	
	/**
	 * Gets the class name.
	 * 
	 * @return Class name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the bytecode as a byte array.
	 * 
	 * @return Bytecode
	 */
	public byte[] getBytecode() {
		return memoryObject != null ? memoryObject.getClassBytes() : null;
	}

}
