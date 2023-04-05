package com.customeLogicalMap;

public class Course {

	private int id;
	private String cName;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String cName) {
		super();
		this.id = id;
		this.cName = cName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cName=" + cName + "]";
	}
	
	
}
