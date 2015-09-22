package com.hungtdo.demo.javase;

/*
 * Warning: Dead code 
 * In Eclipse, "dead code" is code than will never be executed. Usually it's in a conditional branch that logically will never be entered.
 * http://stackoverflow.com/a/8713582/938427
 * */

public class TestBoolean {

	public static void main(String[] args) {
		int x = 1, y = 2;

		//True
		System.out.println(x==2 && y==2 || y==2);
		//true
		System.out.println(x==1 || y==1 && y==1);
		//True
		System.out.println(true || (true && false));
		//False
		System.out.println(true && (true && false));

	}

}
