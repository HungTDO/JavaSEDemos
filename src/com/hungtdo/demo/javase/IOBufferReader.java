package com.hungtdo.demo.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class IOBufferReader {

	public static void main(String[] args) throws IOException{
		char c = '0';
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));
		System.out.println("Enter characters, 'q' to quit");
		final long startTime = System.currentTimeMillis();
//		System.out.println("Read a line of text: " + br.readLine());
		do
		{
			c = (char) br.read();
			System.out.println("Single Character: " + c);
		}while(c != 'q');

		final long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");
	}

}
