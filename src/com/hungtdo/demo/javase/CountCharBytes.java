package com.hungtdo.demo.javase;


public class CountCharBytes {

//	private byte[] charToBytes(final char x) {
//		  String temp = new String(new char[] {x});
//		  try {
//		    return temp.getBytes("ISO-8859-1");
//		  } catch (UnsupportedEncodingException e) {
//		    // Log a complaint
//		    return null;
//		  }
//		}
	
	private long countBytes(String str) {
		if(str != null && !str.isEmpty()) {
			char[] cha = str.toCharArray();
			long bytes = 0;
			for(int i=0; i < cha.length; i++) {
				String item = new String(new char[]{cha[i]});
				bytes += item.getBytes().length;
			}
			
			return bytes;
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		CountCharBytes obj = new CountCharBytes();
		long bytes = obj.countBytes("a了解ですabc");
		System.out.println("COUNT BYTES > " + bytes);
	}

}
