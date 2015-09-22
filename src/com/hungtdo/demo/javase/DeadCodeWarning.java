package com.hungtdo.demo.javase;

public class DeadCodeWarning {

	public static void main(String[] args) {
		boolean x = true;
		
		if(true || x /*Dead code*/) {
			//
		}
		
		if (true) {
			System.out.println(x);
		} else if (x) {/*Dead code*/
			System.out.println(x);
		}
	}

}
