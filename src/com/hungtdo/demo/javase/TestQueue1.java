package com.hungtdo.demo.javase;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue1 {

	
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 90; i < 100; i++) {
			queue.add(i);
		}
		
		/*PEEK: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.*/
//		if(!queue.isEmpty()) {
//			System.out.println(queue.peek());
//		}
		
		/*POLL: Retrieves and removes the head of this queue, or returns null if this queue is empty.*/
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		/* REMOVE: Retrieves and removes the head of this queue. 
		This method differs from POLL only in that it throws an exception if this queue is empty. */
//		while (!queue.isEmpty()) {
//			System.out.println(queue.remove());
//		}
		
	}

}
