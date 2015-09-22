package com.hungtdo.demo.javase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService1 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					System.out.println("Ihread 1: " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}
			}
		});
		
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 15; i++) {
					
					System.out.println("Ihread I2: " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}
			}
		});
		
		exec.execute(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					System.out.println("Ihread I3: " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}
			}
		});
		
		exec.shutdown();
		
//		exec.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				for (int i = 0; i < 10; i++) {
//					
//					System.out.println("Ihread I4: " + i);
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					};
//				}
//			}
//		});

	}

}
