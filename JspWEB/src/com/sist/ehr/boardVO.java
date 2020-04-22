package com.sist.ehr;

public class boardVO {
	
	String name;
	String title;
	String context;
	
	public boardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boardVO(String name, String title, String context) {
		super();
		this.name = name;
		this.title = title;
		this.context = context;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "boardVO [name=" + name + ", title=" + title + ", context=" + context + "]";
	}
	
	
	
}
