package com.hungtdo.demo.javase;


public class TestModifyData {


	public static void main(String[] args) {
		String link = "a";
		String imgUrl = "b";
		BannerEntity obj = new BannerEntity(link, imgUrl);
		link = "a1234";
		
		System.out.println(obj.getLink());
	}
}
