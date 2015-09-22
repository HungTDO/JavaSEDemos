package com.hungtdo.demo.javase;


public class JavaIntern2 {

	private static final String AUTHOR = "HUNGTDO";
	
	public static void main(String[] args) {
		String str0 = new String("HUNGTDO");
		String str01 = new String("HUNGTDO").intern();
		
		String at0 = "HUNGTDO".intern();
		String at = "HUNGTDO";
		String at1 = "HUNGTDO";
		String at2 = "HUNGT" + "DO";
		String at3 = at;
		String at4 = str0;
		
		String str = new String("HUNGTDO");
		String str1 = new String("HUNGTDO");
		
		Book book = new Book();
		String au = book.getAuthor();
		
		System.out.println(str0.intern() == AUTHOR);//true
		System.out.println(at0 == AUTHOR);//true
		System.out.println(str0 == at0);//false
		System.out.println(str01 == at);//true
		System.out.println(at == at1);//true
		System.out.println(at3 == at);//true
		System.out.println(at4 == str0);//true
		System.out.println(at1 == at2);//true
		System.out.println(str == str1);//false
		System.out.println(str.intern() == str1);//false
		System.out.println(str == au);//false
		System.out.println(at == au);//true
		str = str.intern();
		System.out.println(str == au);//true
		
//		Logger.getLogger(JavaIntern2.class.getSimpleName()).log(Level.SEVERE, "ERROR");
	}

	
	private static class Book {
		private static final String AUTHOR = "HUNGTDO";
		private String author = "HUNG" + "TDO";
		
		public Book() {}
		
		public String getAuthor() {
			return author;
		}
	}
}
