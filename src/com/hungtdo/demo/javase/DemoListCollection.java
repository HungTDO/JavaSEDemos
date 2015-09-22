package com.hungtdo.demo.javase;

import java.util.ArrayList;
import java.util.List;

public class DemoListCollection {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			listA.add(i);
		}
		
		List<Integer> listB = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			listB.add(i);
		}
		List<Integer> listA1 = new ArrayList<Integer>();
		List<Integer> listC = new ArrayList<Integer>();
		listC.addAll(listA1);
		listC.addAll(listB);
		
		for(int j=0; j<listC.size(); j++) {
			System.out.println("Value: " + listC.get(j));
		}

	}

}
