package com.hungtdo.demo.javase.serializable;

import java.io.Serializable;

public class Links implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String href;
	private String text;
	
	public Links(String href, String text) {
		super();
		this.href = href;
		this.text = text;
	}
	public String getHref() {
		return href;
	}
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return "Links [href=" + href + ", text=" + text + "]";
	}
}
