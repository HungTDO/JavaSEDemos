package com.hungtdo.demo.javase;

public class Threadabc {

	public static void main(String[] args) {
		for(int i=0; i<10000; i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					
				}
			}, "" + i).run();
		}

	}

}
