package com.hungtdo.demo.javase;


public class DemoBreakLabel {

	public static void main(String[] args) {
		labelA:
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break labelA;
			}
			System.out.println("i: " + i);
		}
		int a = 10 + 2;
		System.out.println("KQ: " + a);
	}
}
