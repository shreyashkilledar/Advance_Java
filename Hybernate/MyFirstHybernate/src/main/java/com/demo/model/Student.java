package com.demo.model;

public class Student {
	
	private int rollno;
	private String sname;
	private String saddress;
	public Student() {
		super();
	}
	public Student(int rollno, String sname, String saddress) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	

}
