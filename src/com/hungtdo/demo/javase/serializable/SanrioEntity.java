package com.hungtdo.demo.javase.serializable;

import java.io.Serializable;


public class SanrioEntity implements Serializable {
	
	private static final long serialVersionUID = 6948665555230592406L;

	private int mAvatar;
	
	private String mTitle;
	
	private String mContent;
	
	private String mUrl;
	
	private String link;
	
	private Links mLinks;
	
	/*0: Web; 1: App*/
	private int type = 0;
	
	public SanrioEntity(){
			super();
	}
	
	public SanrioEntity(String imageUrl, String title, String content, String link, int type){
		this.mUrl = imageUrl;
		this.mTitle = title;
		this.mContent = content;
		this.link = link;
		this.type = type;
	}
	
	public int getAvatar() {
		return mAvatar;
	}

	public void setAvatar(int avatar) {
		mAvatar = avatar;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public String getContent() {
		return mContent;
	}

	public void setContent(String content) {
		mContent = content;
	}

	public String getUrl() {
		return mUrl;
	}

	public void setUrl(String url) {
		mUrl = url;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Links getmLinks() {
		return mLinks;
	}

	public void setmLinks(Links mLinks) {
		this.mLinks = mLinks;
	}

	@Override
	public String toString() {
		return "SanrioEntity [mAvatar=" + mAvatar + ", mTitle=" + mTitle
				+ ", mContent=" + mContent + ", mUrl=" + mUrl + ", link="
				+ link + ", mLinks=" + mLinks + ", type=" + type + "]";
	}
	
}
