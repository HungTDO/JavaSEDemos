package com.hungtdo.demo.javase;

import java.util.Random;

public class MathPercent {

	public static void main(String[] args) {
		int day = 5;
		int point = day % 5;
		
		System.out.print("" + point);
		for(int i=0; i<=1000; i++) {
			System.out.println("Random: " + new Random().nextInt(2));
		}
	}
}
