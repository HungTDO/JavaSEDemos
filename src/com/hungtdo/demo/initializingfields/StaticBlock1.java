package com.hungtdo.demo.initializingfields;

/**
 * 
 * Demo use <a href=
 * 'http://docs.oracle.com/javase/tutorial/java/javaOO/initial.html'>Static
 * Initialization Block</a>
 * 
 * @author HUNGTDO
 * 
 */
public class StaticBlock1 {

	private static int a = 0;
	private static final String DEMO_NAME;
	private static final int[] arr;
	private static final int[] arr2;
	private static int[] arr3;

	private static int total;
	private static int inputA, inputB;

	// private int flag = 0;

	// Static initialization block. Note: this block only use with static
	// variables
	static {
		// flag=2;
		a = 1;
		DEMO_NAME = "HUNGTDO";
		arr = new int[] { 3, 4, 3, 3, 23, 22, 18, 6 };
		arr2 = arr.clone();
		arr2[4] = 99;
		arr3 = new int[4];

		int len = arr2.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			int value = arr2[i];
			if (value % 2 == 0) {
				arr3[temp] = value;
				temp++;
			}
		}
	}

	// The runtime system guarantees that static initialization blocks are
	// called in the order that they appear in the source code.
	static {
		inputA = a;
		inputB = 10;
		total = inputA + inputB;
	}

	public static void main(String[] args) {
		int len = arr3.length;
		StringBuilder values = new StringBuilder();
		for (int j = 0; j < len; j++) {
			values.append(arr3[j] + ";");
		}
		String str = String.format(
				"a->%d; DEMO_NAME->%s; arr->%d; arr2->%s; arr3->%s", a,
				DEMO_NAME, arr.length, arr2.length, values);
		System.out.println(str);

		System.out.print("TOTAL: " + total);

	}

}
