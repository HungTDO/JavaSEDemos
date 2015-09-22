package com.hungtdo.demo.javase;

/*
 * 
 * 
 * Remember, anonymous inner classes are inherited ones, 
 * and we always use a superclass reference variable to refer to an anonymous subclass object. 
 * And, we can only call methods on an anonymous inner class object that are defined in the superclass. 
 * Though, we can introduce new methods in anonymous inner class, but we cannot access them 
 * through the reference variable of superclass 
 * because superclass does not know anything about new methods or data members introduced in subclass.
 * 
 * See more:
 * http://cs-fundamentals.com/java-programming/java-anonymous-inner-classes.php#anonymous-subclass'>java-anonymous-inner-classes
 * 
 * */

public class JavaAnonymousInnerClass {

	public static void main(String[] args) {

		// Anonymous class - sub-class of class Dog
		Dog dog = new Dog() {// a new class that has no name

			// Override method of parent class
			public void someDog(String name) {
				super.someDog(name);
				System.out.println("Anonymous Dog > " + name);
			}

			@Override
			public void walk() {
				System.out.println("DOg is walking");
				abc();
			}

			public void abc() {
				System.out.println("ABC Dog");
			}
		}; // anonymous class body closes here
			// dog contains an object of anonymous subclass of Dog.

		/*
		 * (dog) is superclass reference variable to refer to an anonymous subclass object.
		 *  And, we can only call methods on an anonymous inner class object that are defined in the superclass
		 */

		dog.someDog("Nathasa");
		dog.walk();
		dog.talk();
		dog.play();
		// dog.abc();//Doesn't call

		// create newly object
		Dog dogClass = new Dog();
		dogClass.talk();

		Dog dogClass1 = dog;

		System.out.println(dogClass1 == dog);
		System.out.println(dogClass == dog);

		BeggieDog bDog = new BeggieDog() {
			public void someDog(String name) {
				System.out.println("Beggie Dog > " + name);
			}
			
			@Override
			public void eat() {
				super.eat();
			}
		};
		bDog.someDog("IKIK");
		bDog.eat();
	}

	private static class BeggieDog extends Dog implements IDog2{
		@Override
		public void someDog(String name) {
			super.someDog(name);
			System.out.println("Beggie Dog");
		}

		@Override
		public void eat() {
			System.out.println("Beggie Dog > EAT");
		}
	}

	private static class Dog implements IDog {

		public void someDog(String name) {
			System.out.println("Classic Dog > " + name);
		}

		@Override
		public void walk() {
			System.out.println("DOg is WALKING: " + this.getClass().getName());
		}

		@Override
		public void talk() {
			System.out.println("DOg is TALKING: " + this.getClass().getName());
		}

		@Override
		public void play() {
			System.out.println("DOg is PLAYING: " + this.getClass().getName());
		}
	}

	private interface IDog {

		public void walk();

		public void talk();

		public void play();
	}
	
	private interface IDog2 {

		public void eat();
	}
}
