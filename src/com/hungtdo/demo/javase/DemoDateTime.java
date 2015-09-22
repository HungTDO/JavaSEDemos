package com.hungtdo.demo.javase;

import java.text.ParseException;
import java.util.Date;

public class DemoDateTime {

	public static void main(String[] args) throws ParseException {
		long time1 = System.currentTimeMillis();//Timestamp
		long unixTime = System.currentTimeMillis() / 1000L;
		Date date = new Date(time1);
		long time = date.getTime();
		System.out.println("" + time);
		System.out.println("" + time1);
		System.out.println("" + unixTime);

	}

}
