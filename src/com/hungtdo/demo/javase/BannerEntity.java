package com.hungtdo.demo.javase;

public class BannerEntity {

	private String link;

	private String imageUrl;

	public BannerEntity(String link, String imageUrl) {
		this.link = link;
		this.imageUrl = imageUrl;
	}

	public String getLink() {
		return link;
	}

	public String getImageUrl() {
		return imageUrl;
	}

}
