package com.hungtdo.demo.javase;

public class TestVariReferences {
	
	public static void main(String[] args) {
		int i = 1;
		change(i);
		System.out.print(i);
	}

	static void change(int i) {
		i = 2;
	}
}
