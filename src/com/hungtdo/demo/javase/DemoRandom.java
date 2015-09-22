package com.hungtdo.demo.javase;

import java.util.Random;

public class DemoRandom {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("Value: " + new Random().nextInt(7));
		}

		for (int i = 0; i < 100; i++) {
			final int[] randomTime = { 5000, 7000, 10000 };
			final int selectTime = new Random().nextInt(randomTime.length);
			System.out.println("TIME: " + selectTime);
		}

	}

}
