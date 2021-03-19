package com.yedam.diary;

import java.io.Serializable;

public class DiaryVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String wdate;
	private String cotents;
	
	
	public DiaryVO(String wdate, String cotents) {
		this.wdate = wdate;
		this.cotents = cotents;
	}
	public DiaryVO() {
		
	}
	
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getCotents() {
		return cotents;
	}
	public void setCotents(String cotents) {
		this.cotents = cotents;
	}
	public static void start() {
		// TODO Auto-generated method stub
		
	}
	
	

}
