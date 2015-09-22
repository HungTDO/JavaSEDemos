package com.hungtdo.demo.javase;

interface Manageable {
	public void manage();
}

class Manager {
	public void canManage(Manageable m) {
		m.manage();
	}
}



public class JavaAnonymousClassPassArgs {
	volatile int rate = 0;
	 volatile int x = 10;
//	volatile final int y = 10;
	transient int z= 0;

	public strictfp static void main(String[] args) {
		Manager m = new Manager();
		m.canManage(new Manageable() {
			public void manage() {
				System.out.println("Yes, it is being anonymously managed!");
			}
		}); // anonymous interface implementer as method argument closes here
	}
}
