//package com.diamond;
//
//interface Student{
//	void show();
//	default void display() {
//		System.out.println("student..");
//	}
//}
//interface Teacher{
//	void show();
//	default void display() {
//		System.out.println("teacher..");
//	}
//}
///*
// * Multiple markers at this line
//	- The type DiamondDemo must implement the inherited abstract method Teacher.show()
//	- Duplicate default methods named display with the parameters () and () are inherited from 
//the types Teacher and Student
// */
//public class DiamondDemo //implements Student, Teacher
//{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("show method");
//	}
//
//}
