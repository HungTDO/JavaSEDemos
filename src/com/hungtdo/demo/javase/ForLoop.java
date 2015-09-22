package com.hungtdo.demo.javase;
import java.util.ArrayList;

public class ForLoop {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
		arr.add("F");
		arr.add("G");
		arr.add("H");
		
//		for(int i=0; i<arr.size(); i++) {
//			String str = arr.get(i);
//			
//			if(str.equals("B")) {
//				arr.remove(i);
//			} else {
//				System.out.println("" + str + " > " + i);
//			}
//		}
		
		//FIX index when modify values of Collection
//		for(int i=0; i<arr.size(); ) {
//			String str = arr.get(i);
//			
//			if(str.equals("B") || str.equals("D")) {
//				arr.remove(i);
//				continue;
//			}
//			System.out.println("" + str);
//			i++;//up index
//		}
		
		//With *for each* do not modify values of collection (add, remove) . Throw runtime error
		int i = 0;
		for(String str : arr) {
			System.out.println("" + str);
			if(str.equals("B")) {
				arr.remove(i);
			} 
			i++;
		}
	}

}
