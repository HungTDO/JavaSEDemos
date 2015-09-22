package com.hungtdo.demo.initializingfields;

/**
 * Demo use Khối khởi tạo - <a href=
 * 'http://docs.oracle.com/javase/tutorial/java/javaOO/initial.html'>Initializer
 * blocks</a>
 * 
 * @author HUNGTDO
 * */
public class InitializerBlocks {

	int a = 1;
	private final String DEMO_NAME;
	private final int[] arr;
	private final int[] arr2;
	private int[] arr3;

	/*
	 * Khối khởi tạo cho các biến thường (non-static fields)(Khối nay khởi tạo
	 * như là khởi tạo biến - trước cả khi gọi constructor) Khối nay hữu ích cho
	 * việc khởi tạo các biến có logic phức tạp Khối khởi tạo này có thể sử dụng
	 * để khởi tạo cho các biến mà nhiều constructor có thể sử đụng được
	 * 
	 * Source: "The Java compiler copies initializer blocks into every
	 * constructor. Therefore, this approach can be used to share a block of
	 * code between multiple constructors."
	 */
	{
		System.out.println("Initializer Blocks");
		DEMO_NAME = "YUCHI";
		arr = new int[] { 3, 4, 2, 3, 1, 44, 55 };
		arr2 = arr.clone();
		arr3 = arr2.clone();
	}

	/**
	 * InitializerBlocks Constructor 1
	 * */
	public InitializerBlocks() {
		System.out.println("Constructor1");
		int len = arr3.length;
		StringBuilder values = new StringBuilder();
		for (int j = 0; j < len; j++) {
			values.append(arr3[j] + ";");
		}

	}

	/**
	 * InitializerBlocks Constructor 2
	 * 
	 * @param input
	 * */
	public InitializerBlocks(int input) {
		System.out.println("Constructor2");
		a = input;
	}

	public String getContent() {
		int len = arr3.length;
		StringBuilder values = new StringBuilder();
		for (int j = 0; j < len; j++) {
			values.append(arr3[j] + ";");
		}

		String str = String.format(
				"a->%d; DEMO_NAME->%s; arr->%d; arr2->%s; arr3->%s", a,
				DEMO_NAME, arr.length, arr2.length, values);
		return str;
	}
}
