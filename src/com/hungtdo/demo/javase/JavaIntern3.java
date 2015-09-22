package com.hungtdo.demo.javase;

public class JavaIntern3 {

	public static void main(String[] args) {
		//literal:: Là một chuỗi ký tự dạng string, number, hoặc date biểu diễn trực tiếp một giá trị cụ thể. Ví dụ `XYZ123', `1234' và `6/10/57'.
		String s1 = "Hello";//is literal (la ky tu)
		String s2 = s1;
		String s3 = new String("Hello");//is not literal, this's object
		String s4 = "lo";
		String s4Full = "Hel" + s4;//Tinh toan cong chu voi 1 doi tuong
		String s4FullInterned = ("Hel" + s4).intern();
		String s5Full = "Hel" + "lo";//Noi chuoi

		System.out.println(s1 == "Hello"); // true
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false

		// Strings computed by concatenation at
		// run-time are newly created and therefore distinct.
		System.out.println("Hello" == s4Full); // false
		
		System.out.println("Hello" == s4FullInterned); // true
		System.out.println("Hello" == s5Full); // true

		// s3 is not literal, so distinct
		System.out.println(s3 == ("Hel" + s4).intern()); // false
		System.out.println(s3 == (s1).intern()); // false

		// The result of explicitly interning a computed string is the same
		// string as any pre-existing literal string with the same contents.
		System.out.println(s1 == s3.intern()); // true
		System.out.println("Hello" == ("Hel" + s4).intern()); // true
		System.out.println(s1 == ("Hel" + s4).intern()); // true
		System.out.println(s3.intern() == ("Hel" + s4).intern()); // true
	}
}
