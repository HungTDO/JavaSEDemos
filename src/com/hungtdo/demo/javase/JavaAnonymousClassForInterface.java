package com.hungtdo.demo.javase;

public class JavaAnonymousClassForInterface {

	private interface Person {
		public void talk();

		public void eat();

		public void play();
	}

	public static void main(String[] args) {

		Person person = new Person() {
			
			@Override
			public void talk() {
				System.out.println("INTERFACE TALKING > " + this.getClass().getName());
			}
			
			@Override
			public void play() {
				
			}
			
			@Override
			public void eat() {
				
			}
		};
		
		person.talk();
		
		
		//Runnable is Anonymous inner class of Runnable class 
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUNNABLE TALKING > " + this.getClass().getName());
				abc();
			}
			
			public void abc(){
				System.out.println("ABC");
			}
		};
		
		runnable.run();
		
		
//		Person person2 = new Person();Not allow
		
	}
}
