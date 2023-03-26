package com.practiceQs15mar;

import java.util.Arrays;

class Student{
	private int id;
	private String name;
	private float marks[];
	private float percentage;
	private static float totalMarks = 300.0f;
	
	Student(){
		
	}
	Student(int id, String name, float[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
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
	public float[] getMarks() {
		return marks;
	}
	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage() {
		float sum = 0;
	    for(int i=0; i<marks.length; i++) {
	    	sum+=marks[i];
	    }
	    
		this.percentage = (sum/totalMarks);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", percentage="
				+ percentage + "]";
	}
	
	
}
public class StudentTester {

	public static void listOfStudents(Student s[]) {
		System.out.println("Id"+" "+"Name"+" "+"Marks"+" "+"Percentage");
		for(int i=0; i<s.length; i++) {
			s[i].setPercentage();
			System.out.println(s[i].getId()+" "+s[i].getName()+" "+Arrays.toString(s[i].getMarks())+" "+s[i].getPercentage());
		}
	}
	public static void main(String[] args) {
		
        Student[] s = new Student[4];
        
        s[0] = new Student(101,"Ruby",new float[] {80.0f,87.0f,94.0f});
        s[1] = new Student(102,"Rupert",new float[] {85.0f,87.0f,89.0f});
        s[2] = new Student(103,"Donna",new float[] {82.0f,85.0f,90.0f});
        s[3] = new Student(104,"Billy",new float[] {80.0f,75.0f,90.0f});
        
        listOfStudents(s);
	}

}
