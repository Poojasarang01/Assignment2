package com.yash.oops;



import java.util.Date;

public class Athletic_Player {
	private int aid;
	private String aname;
	private String paddress;
	private String dob;
	public Athletic_Player(int aid, String aname, String paddress, String dob) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.paddress = paddress;
		this.dob = dob;
	}
	
	public void Athletic_Player1(int aid2, String aname2, String paddress2, String dob2) {
		
		this.aid=aid2;
		this.aname = aname2;
		this.paddress = paddress2;
		this.dob = dob2;
	}

	void display() {
		System.out.println("ID:- "+aid);
		System.out.println("aname:- "+aname);	
		System.out.println("paddress:- "+paddress);
		System.out.println("dob:- "+dob);
	}
	

}
