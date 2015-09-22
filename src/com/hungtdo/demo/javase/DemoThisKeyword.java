package com.hungtdo.demo.javase;

public class DemoThisKeyword {
	private static class JBT {
		int variable = 5;
	 
		public JBT() {
			this("JBT");
			System.out.println("Inside Constructor without parameter");
		}
	 
		public JBT(String str) {
			System.out
					.println("Inside Constructor with String parameter as " + str);
		}
		
		void method(int variable) {
			variable = 10;
			System.out.println("Value of Instance variable :" + this.variable);
			System.out.println("Value of Local variable :" + variable);
		}
	 
		void method() {
			int variable = 40;
			System.out.println("Value of Instance variable :" + this.variable);
			System.out.println("Value of Local variable :" + variable);
		}
	}
	
	public static void main(String[] args) {
		JBT obj = new JBT();
		obj.method(20);
		obj.method();
	}

}
