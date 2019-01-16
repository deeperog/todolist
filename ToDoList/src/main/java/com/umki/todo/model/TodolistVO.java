package com.umki.todo.model;

public class TodolistVO {
	int idx;
	String content;
	String date;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TodolistVO [idx=" + idx + ", content=" + content + ", date=" + date + "]";
	}
	
}
