package com.hungtdo.demo.javase;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class IOScanner {

	public static void main(String[] args) throws IOException{
		//Dung cho stream: System.in use RegularEx
//		Scanner scanner = new Scanner(new File("example.txt"));
		//C1: FIlter
		 String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input);
	     s.useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close(); 
	     //C2
	     Scanner s2 = new Scanner(input);
	     s2.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
	     MatchResult result = s2.match();
	     for (int i=1; i<=result.groupCount(); i++)
	         System.out.println(result.group(i));
	     s2.close();
	}
}
