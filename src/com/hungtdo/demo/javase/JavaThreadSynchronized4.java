package com.hungtdo.demo.javase;

class Table4 {

	public void printTable(String name, int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Not synchronized: " + name + ": " + (n * i));
		}
		
		synchronized (Table4.this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Object sync: " + name + ": " + (n * i));
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		}
		
		synchronized (Table4.class) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Class sync: " + name + ": " + (n * i));
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		}
	}
}

class MyThread4 extends Thread {
	private String name;

	public MyThread4(String name) {
		this.name = name;
	}

	public void run() {
		new Table4().printTable(name, 1);
	}
}

class MyThread5 extends Thread {
	private String name;

	public MyThread5(String name) {
		this.name = name;
	}

	public void run() {
		new Table4().printTable(name, 10);
	}
}

public class JavaThreadSynchronized4 {

	public static void main(String[] args) {
		MyThread4 t1 = new MyThread4("Thread 4");
//		 MyThread5 t2 = new MyThread5("Thread 5");
		MyThread4 t3 = new MyThread4("Thread 4(2)");
		t1.start();
//		 t2.start();
		t3.start();
	}

}
