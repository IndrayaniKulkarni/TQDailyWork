package com.multicatch;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	private int rollNo;
	private String name;
	private float marks;

	public Student() {
	}

	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
		return "student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class StudentMarksException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		System.out.println("id :");
		s.setRollNo(sc.nextInt());

		System.out.println("name :");
		s.setName(sc.next());

		try {
			System.out.println("marks :");
			float m = sc.nextFloat();
			if (m < 0 || m > 100) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("Marks should be between 0 to 100");
		}

	}

}
