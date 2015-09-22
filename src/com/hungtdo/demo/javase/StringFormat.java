package com.hungtdo.demo.javase;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 * See more: 
 * http://examples.javacodegeeks.com/core-java/lang/string/java-string-format-example/
 * http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
 * */
public class StringFormat {

	// %d : will print the integer as it is.
	// %6d : will pint the integer as it is. If the number of digits is less than 6, the output will be padded on the left.
	// %-6d : will pint the integer as it is. If the number of digits is less than 6, the output will be padded on the right.
	// %06d : will pint the integer as it is. If the number of digits is less than 6, the output will be padded on the left with zeroes.
	// %.2d : will print maximum 2 digits of the integer.

	public static void main(String[] args) {
		//Numeric and text
		System.out.println(String.format("%09d", 123));//000000123;
		System.out.println(String.format("%9d", 123));//      123;
		System.out.println(String.format("%-9d", 123));//123      ;
		System.out.println(String.format("%1$d", 123));//123;
		System.out.println(String.format("%d %s %d", 1, "2", 3));//1 2 3;
		
		System.out.printf("%-12s%-12s\n","Column 1","Column 2");        //Column 1    Column 2   
		System.out.printf("%-12.5f%.20f", 12.23429837482,9.10212023134);//12.23430    9.10212023134000000000
		System.out.println();

		//Date Time
		System.out.println(String.format("Local time: %tT", Calendar.getInstance()));
		System.out.format("Local time: %tT", Calendar.getInstance());//16:40:31
		System.out.println();
		
		 // Explicit argument indices may be used to re-order output.
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);

		formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
		formatter.close();
		System.out.println(sb.toString());
		
		// Writes formatted output to System.err.
		System.err.printf("Unable to open file '%1$s': %2$s", "FOOD", "ERROR MESSAGE");//Result > "Unable to open file 'food': No such file or directory"
		System.out.println();
		
		 // Format a string containing a date.
		 Calendar c = new GregorianCalendar(1995, Calendar.MAY, 8);
		 //Format pattern: mm/e/YYYY -> e (or d): day in month without 0 prefix
		 String s = String.format("Duke's Birthday: %1$tm / %1$te /%1$tY", c);//Duke's Birthday: 05 23,1995
		 
		 System.out.println(s);
	}

}
