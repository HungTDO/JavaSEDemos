package com.hungtdo.demo.javase;

import java.io.File;
import java.io.FilenameFilter;

public class IOFilenameFilterDemo {

	/** Filter interface to filter extension of file */
	private static final FilenameFilter fFilter = new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			// TODO: Implement filter file name at here
			if (name.endsWith(".jpg")) {
				return true;
			}
			return false;
		}
	};

	public static void main(String[] args) {
		File fRoot = new File("C:\\Example");
		File[] files = fRoot.listFiles(fFilter);
		System.out.println("Total file found: " + files.length);

	}

}
