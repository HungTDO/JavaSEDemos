package com.hungtdo.demo.javase;

class Table1 {

	synchronized static void printTable(int n, String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + ": " + (n * i));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}

/**Test thread anonymous class*/
public class JavaThreadSynchronized2 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Table1.printTable(1, "Thread1");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				Table1.printTable(10, "Thread2");
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				Table1.printTable(100, "Thread3");
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				Table1.printTable(1000, "Thread4");
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
