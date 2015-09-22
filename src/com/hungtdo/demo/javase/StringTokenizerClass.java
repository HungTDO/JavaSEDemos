package com.hungtdo.demo.javase;

import java.util.StringTokenizer;

/*
 * StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged in new code. 
 * It is recommended that anyone seeking this functionality use the split method of String or the java.util.regex package instead.
 * */
public class StringTokenizerClass {

	public static void main(String[] args) {
		String str = "AnhYeuEm, 0034, MS234234, John Baba,2009";
		StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
		
		while (stringTokenizer.hasMoreElements()) {
			String item = (String) stringTokenizer.nextElement();
			System.out.println(item.trim());
		}
		
		System.out.println("====================");
		
		String[] splitArr = str.split(",");
		int len = splitArr.length;
		for(int i=0; i<len; i++) {
			System.out.println(splitArr[i].trim());
		}
	}
}
