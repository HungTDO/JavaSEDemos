package com.hungtdo.demo.javase;

public class VolatileDemo1 {

	class Test {
	    volatile int i = 0, j = 0;
	    void one() { i++; j++; }
	    void two() {
	        System.out.println("i=" + i + " j=" + j);
	    }
	}
	
	private void newTest() {
		Test test = new Test();
		test.one();
		test.two();
	}
	
	public static void main(String[] args) {
		VolatileDemo1 vo = new VolatileDemo1();
		vo.newTest();
		vo.newTest();
	}

}
