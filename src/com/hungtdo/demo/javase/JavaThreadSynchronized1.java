package com.hungtdo.demo.javase;

class Table {

	/* Neu printTable k duoc Synchronized thi gia tri cua A se bi thay doi lon xon.
	 * khi su dung synchronized, chi 1 thread duoc truy cap 1 luc tren 1 class, 
	 * thu tu tinh toan cho A se duoc tuan tu */
	private static int a = 0;
	
	synchronized static void printTable(String name, int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ": " + (n * i));
			a += 1;
			int b = a / 0;
			System.out.println("A: " + a);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread1 extends Thread {
	private String name;
	public MyThread1(String name) {
		this.name = name;
	}
	public void run() {
		Table.printTable(name, 1);
	}
}

class MyThread2 extends Thread {
	private String name;
	public MyThread2(String name) {
		this.name = name;
	}
	
	public void run() {
		Table.printTable(name, 10);
	}
}

public class JavaThreadSynchronized1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("Thread 1");
		MyThread2 t2 = new MyThread2("Thread 2");
		MyThread1 t3 = new MyThread1("Thread 1(2)");
		t1.start();
		t2.start();
		t3.start();
	}

}
