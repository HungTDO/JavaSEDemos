package com.hungtdo.demo.javase;

public class TestLambda1 {

	public static void main(String[] args) {
		System.out.println("=== RunnableTest ===");

		// Anonymous Runnable
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world two!");

		Runnable r3 = () -> {
			int a = 3;
			int b = a + 12 * 4;
			System.out.println("Ket qua: " + b);
		};
		// Run em!
		r1.run();
		r2.run();
		r3.run();

	}
}
