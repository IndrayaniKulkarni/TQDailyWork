package com.studentClassException;

class Student{
	private int id;
	private String name;
	private float marks;
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
	public void setMarks(float marks) throws InvalidMarksException{
		if(marks<0 || marks>100) {
			try {
				throw new InvalidMarksException("Marks can't be negative nor greater than 100");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		else {
			this.marks = marks;
		}
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class StudentTester {

	public static void main(String[] args) throws InvalidMarksException{
		
		Student s = new Student();
		s.setId(101);
		s.setName("Klaus");
		s.setMarks(-20.0f);
		s.toString();
		Student s2 = new Student();
		s2.setId(101);
		s2.setName("Klaus");
		s2.setMarks(70.0f);
		s2.toString();
	}

}
