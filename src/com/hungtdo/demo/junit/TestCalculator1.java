package com.hungtdo.demo.junit;

import junit.framework.TestCase;

public class TestCalculator1 extends TestCase {

	private MathCalculator calculator;
	
	private TestJUnitString jUnitString;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Preparing");
		calculator = new MathCalculator();
		jUnitString = new TestJUnitString();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Release");
	}

	//method phai la pulic de JUnit framwork hoat dong duoc
	public void testAdd() {
		//Kiem tra tinh dung dan cua phuong thuc
		//Doi so thu nhat: ket qua mong muon
		//Doi so thu 2: Ket qua thuc te
		assertEquals(15, calculator.add(10, 5));
	}
	
	public void testString() {
		assertEquals("I LOVE YOU", jUnitString.getUpercase("i Love You"));
		assertEquals("ABC", jUnitString.getUpercase("abc."));
	}
}
