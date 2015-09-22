package com.hungtdo.demo.javase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
	
	private static final String PATTERN_PASS = "^[a-zA-Z0-9]{8}$";
	
	/**
	 * Validate String by pattern.
	 * 
	 * @param strPattern regular expression pattern
	 * @param input String 
	 * */
	private boolean validateString(String strPattern, String input) {
		Pattern pattern = Pattern.compile(strPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	private boolean validatePass(String pass) {
		boolean passValid = validateString(PATTERN_PASS, pass);
		return passValid;
	}
	
	public static void main(String[] args) {
		RegularExpression1 regex = new RegularExpression1();
		System.out.println(regex.validatePass("lha0hhh1"));
	}

}
