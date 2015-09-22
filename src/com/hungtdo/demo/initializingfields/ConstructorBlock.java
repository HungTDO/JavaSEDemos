package com.hungtdo.demo.initializingfields;

/**
 * 
 * Demo use <a href=
 * 'http://docs.oracle.com/javase/tutorial/java/javaOO/initial.html'>Initializing
 * Instance Members</a>
 * 
 * @author HUNGTDO
 * 
 */
public class ConstructorBlock {

	private static int myVar = initializeInstanceVariable();

	protected static final int initializeInstanceVariable() {

		return 50 + 10;

		// initialization code goes here
	}

	public static void main(String[] args) {
//		int myVar = initializeInstanceVariable();
		System.out.println("myVar: " + myVar);
	}
}
