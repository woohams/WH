package com.my.dto;

import java.util.Date;

public class MyBoardDto {
	

	private int myno;
	private String myname;
	private String mytitle;
	private String mycontent;
	private Date mydate;

	public MyBoardDto() {}
	
	public MyBoardDto(int myno, String myname, String mytitle, String mycontent, Date mydate) {
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
		this.mydate = mydate;
	}
	
	

	public MyBoardDto(int myno, String mytitle, String mycontent) {
		this.myno = myno;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
	}

	public int getMyno() {
		return myno;
	}

	public void setMyno(int myno) {
		this.myno = myno;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMytitle() {
		return mytitle;
	}

	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}

	public String getMycontent() {
		return mycontent;
	}

	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}

	public Date getMydate() {
		return mydate;
	}

	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}

	@Override
	public String toString() {
		return "MyBoardDto [myno=" + myno + ", myname=" + myname + ", mytitle=" + mytitle + ", mycontent=" + mycontent
				+ ", mydate=" + mydate + "]";
	}
	
	
	
	
}
