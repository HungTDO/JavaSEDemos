package com.hungtdo.demo.javase;

public class JavaIntern {

	public static void main(String[] args) {
		float i = 10.9f;
		
		double kq = Math.round(i);//.5 tron len va nguoc lai
		double kq1 = Math.ceil(i);//Lay tron len
		double kq2 = Math.floor(i);//Lay tron xuong
		System.out.println("" + kq + ";" + kq1+ ";" + kq2);
		
		String s = new String("TEST");
		String str = "TEST";
		str = str.substring(0,3);
		str = str.intern();
		System.out.println(str);
		
		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();

		if ( s1 == s2 ){
		    System.out.println("s1 and s2 are same");  // 1.
		}

		if ( s1 == s3 ){
		    System.out.println("s1 and s3 are same" );  // 2.
		}
		
		/////////////
		String _s = "Example";
		String sss = "Example";
		//put Example string to pool. if is already in pool return its. , Otherwise. add this string to the set and return it
		String ss = new String("Example").intern();
		String _s1 = ss + ""; 
//		_s1 = _s1.intern();//Remove this comment - (ss == _s1) return true
		String _s11 = ss; //Create new object but same instance
		String _s2 = new String("Example").intern(); // this will create new object
		String _s3 = new String("Exam" + "pl" + "e").intern(); // this will create new object
		 // but as we are calling intern we will get reference of pooled string "Example"
		System.out.println(_s == sss); // will return true
		System.out.println(_s == ss); // will return true
		System.out.println(_s == _s11); // will return true
		System.out.println(ss == _s1); // will return false
		System.out.println(ss == _s11); // will return true
		System.out.println(ss == _s2); // will return true
		System.out.println(_s2 == _s3); // will return true
		System.out.println(_s11 == _s2); // will return true
		
		
	}

}
