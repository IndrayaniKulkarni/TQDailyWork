package com.hierarchical;

public class SchoolStudent extends Student {

	private String schoolName;
	private int std;

	SchoolStudent() {

	}

	SchoolStudent(int id, String name, float marks, double fees, String schoolName, int std) {
		super(id, name, marks, fees);
		this.schoolName = schoolName;
		this.std = std;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String schoolName() {
		return schoolName;
	}
	
	public void setStd(int std) {
		this.std = std;
	}
	public int getStd() {
		return std;
	}

	
	public String toString() {
		return "SchoolStudent =" +super.toString()+ schoolName + ", " + std + "]";
	}
	
	
}
