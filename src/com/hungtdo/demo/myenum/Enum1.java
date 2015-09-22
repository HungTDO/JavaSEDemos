package com.hungtdo.demo.myenum;

public class Enum1 {

  enum Category
 {
	 KHOAHOC (3),
	 SINHHOC (4),
	 TOANHOC (5),
	 TINHOC (199);
	 
	private int value = 0;
	 
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	 Category(int value)//Constructor, real this method is private method
	 {
		 this.value = value;
	 }
	 
 }
 
 public static void main(String[] args)
 {
	 Category c = Category.TINHOC;
	 int total = c.getValue() + 4;
//	 c.setValue(1);
	 System.out.println("Name: " + c + "; Value: " +  c.getValue());
	 System.out.println("Total: " + total);
 }
}
