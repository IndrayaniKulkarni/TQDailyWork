package com.courseStudent;

public class Student {

	private int sid;
	private String name;
	private int age;
	private Course course;

	Student() {

	}

	Student(int sid, String name, int age) {
		this();
		this.sid = sid;
		this.name = name;
		this.age = age;

	}

	Student(int sid, String name, int age, Course course) {
		this(sid, name, age);
		this.course = course;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public String toString() {
		return "Student {" + sid + ", " + name + ", " + age + ", " + course + "]";
	}

}
