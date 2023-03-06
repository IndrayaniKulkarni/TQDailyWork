package com.hierarchical;

public class CollegeStudent extends Student{
	
	private String course;
	private int semester;
	
	CollegeStudent(){
		
	}
	
	CollegeStudent(int id, String name, float marks, double fees, String course, int semester){

		super(id,name, marks, fees);
		this.course = course;
		this.semester = semester;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getSemester() {
		return semester;
	}
	
	public String toString() {
		return "CollegeStudent ="+super.toString() + course + ", " + semester + "]";
	}
	
	
	
	

}
