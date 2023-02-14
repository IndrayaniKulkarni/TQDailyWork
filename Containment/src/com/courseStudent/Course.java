package com.courseStudent;

public class Course {
	
	private int cid;
	private String courseName;
	private float fees;
	
	Course(){
		
	}
	Course(int cid, String courseName, float d){
		this.cid = cid;
		this.courseName = courseName;
		this.fees = d;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
			return courseName;
	}
	
	public void setFees(float fees) {
		this.fees = fees;
	}
	public float getFees() {
		return fees;
	}
	
	public String toString() {
		return ("Course {"+cid+", "+courseName+", "+fees+"}");
	}

}
