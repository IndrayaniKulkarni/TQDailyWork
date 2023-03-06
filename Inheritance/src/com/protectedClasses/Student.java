package com.protectedClasses;

public class Student {

	private int id;
	protected String name;
	int age; //default
	public float marks;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		
		s.id = 121;
		s.name = "ruby";
		s.age = 21;
		s.marks = 90;
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
	}

}
