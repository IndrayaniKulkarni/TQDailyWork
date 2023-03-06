package com.single;

public class Student extends Person{
	
	private int id;
	private float marks;
	private String schoolName;
	
	Student(){
		
	}
	
	Student(int id, float marks, String schoolName){
		this.id = id;
		this.marks = marks;
		this.schoolName =schoolName;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public float getMarks() {
		return marks;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}

	
	public String toString() {
		return "Student =[" + id + ", "+name +", "+age+", "+ address+", " + marks + ", " + schoolName + "]";
	}
	
	

}
