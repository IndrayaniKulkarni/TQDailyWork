package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
	int id;
	String name;
	float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float marks) {
		super();
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return (int) (s2.getMarks() - s1.getMarks());
	}
	
}
public class PriorityOStudent {

	public static void main(String[] args) {
		
		PriorityQueue<Student> st = new PriorityQueue<>(new MarksComparator());
		st.add(new Student(101,"Sam",89.0f));
		st.add(new Student(105,"Gary",79.0f));
		st.add(new Student(102,"Harsh",90.0f));
		
		System.out.println(st);
	}

}
