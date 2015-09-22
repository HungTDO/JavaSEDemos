package com.hungtdo.demo.javase;

class PrintDemo {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}

}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;

	ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		// Dong dau tien se bi lon xon do nhieu Thread truy cap den tuc thoi
		System.out.println("Thread " + threadName + " starting.");
		
		// Sau khi den doan nay se gap dong bo, nen sau khi xong qua trinh PrintCount
		synchronized (PD) {
			PD.printCount();
			// Here place print exit in body
		}
		
		// Sau do dong print exit moi duoc thu thi, k nen lam nhu nay, de dong nay trong Synchronized block
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}

public class JavaThreadSynchronized7 {

	public static void main(String[] args) {
		PrintDemo PD = new PrintDemo();

		ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
		ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}
