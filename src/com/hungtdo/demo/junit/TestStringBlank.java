package com.hungtdo.demo.junit;

import junit.framework.TestCase;

public class TestStringBlank extends TestCase {

	private TestString testClass;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		testClass = new TestString();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		
	}
	
	
	public void testBlank() {
		assertEquals(true, testClass.isBlank(""));
		assertEquals(true, testClass.isBlank("    "));
		assertEquals(true, testClass.isBlank(null));
	}

	private class TestString {
		/**
		 * Tests if a string is blank: null, emtpy, or only whitespace (" ",
		 * \r\n, \t, etc)
		 * 
		 * @param string
		 *            string to test
		 * @return if string is blank
		 */
		public boolean isBlank(String string) {
			if (string == null || string.length() == 0)
				return true;

			int l = string.length();
			for (int i = 0; i < l; i++) {
				if (!Character.isWhitespace(string.codePointAt(i)))
					return false;
			}
			return true;
		}
	}

}
