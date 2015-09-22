package com.hungtdo.demo.initializingfields;

public class InitializerBlocksMain {

	public static void main(String[] args) {
		InitializerBlocks iBlock = new InitializerBlocks();
		String str = iBlock.getContent();
		System.out.println("VALUES: " + str);

		InitializerBlocks iBlock2 = new InitializerBlocks(9);
		String str2 = iBlock2.getContent();
		System.out.println("VALUES: " + str2);

	}

}
