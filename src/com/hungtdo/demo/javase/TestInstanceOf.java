package com.hungtdo.demo.javase;

public class TestInstanceOf {

	
	public void method(Object o)
	{
		if(o instanceof Object)		// Violation.
		{
			// Do Something.
			System.out.println("o: " + o.getClass().getSimpleName());
		} 	
		
		if(null instanceof Object) {
			System.out.println("NULL IS AN INTANCE OF A OBJECY");
		}
	}
	
	public static void main(String[] args) {
		
		TestInstanceOf a = new TestInstanceOf();
		a.method(null);
	}

}
