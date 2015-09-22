package com.hungtdo.demo.javase;

class MyClass6 {

	private static int a = 0;

	public static synchronized void log1(String msg1, String msg2) {
		for (int i = 1; i <= 5; i++) {
			a++;
			System.out.println(msg1 + "-" + msg2 + " > A: " + a);

			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	public static void log2(String msg1, String msg2) {
		synchronized (MyClass6.class) {
			for (int i = 1; i <= 5; i++) {
				a++;
				System.out.println(msg1 + "-" + msg2 + " > A: " + a);

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		}
	}
}

public class JavaThreadSynchronized6 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {

				// MyClass6.log1("Thread 1", "Log 1");
				MyClass6.log2("Thread 1", "Log 2");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				// MyClass6.log1("Thread 2", "Log 1");
				MyClass6.log2("Thread 2", "Log 2");
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				// MyClass6.log1("Thread 3", "Log 1");
				MyClass6.log2("Thread 3", "Log 2");
			}
		};

		t1.start();
		t2.start();
		t3.start();
	}

}
