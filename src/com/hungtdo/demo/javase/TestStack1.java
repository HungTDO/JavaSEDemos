package com.hungtdo.demo.javase;

import java.util.Stack;

public class TestStack1 {
	
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 90; i < 100; i++) {
			stack.add(i);
		}
		
		System.out.println("Capacity: " + stack.capacity());
		System.out.println("Size: " + stack.size());
		
		System.out.println("===============PEEK==============");
		
		/*PEEK: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.*/
		if(!stack.isEmpty()) {
			int topStack = stack.peek();
			System.out.println("Top Stack: " + topStack);
		}
		
		System.out.println("==============POP===============");
		
		/*POP: Removes the object at the top of this stack and returns that object as the value of this function..
		 * Returns:
		 *		The object at the top of this stack (the last item of the Vector object).
		 * 
		 * */
		while (!stack.isEmpty()) {
			System.out.println("CLEAR : " + stack.pop());
			System.out.println("Capacity: " + stack.capacity());
			System.out.println("Size: " + stack.size());
		}
		
		///////////////////////////////////////////
		System.out.println("==============PUSH===============");
		
		for (int i = 90; i < 100; i++) {
			System.out.println(stack.push(i));
		}
		
		System.out.println("Capacity: " + stack.capacity());
		System.out.println("Size: " + stack.size());
		if(!stack.isEmpty()) {
			int topStack = stack.peek();
			System.out.println("Top Stack: " + topStack);
		}
		
	}
}
