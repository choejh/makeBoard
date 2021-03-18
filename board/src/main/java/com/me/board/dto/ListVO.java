package com.me.board.dto;

import java.sql.Time;

public class ListVO {

	
	private int idx;
	private String title;
	private String contents;
	private Time inserttime;
	private int viewcnt;
	private String password;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Time getInserttime() {
		return inserttime;
	}
	public void setInserttime(Time inserttime) {
		this.inserttime = inserttime;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
