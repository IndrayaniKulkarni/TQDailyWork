package com.basics;

public class Student {
	//instance var
	int sid;
	String name;
	int age;
	double marks;
	//methods
	//setter
	void enterDetails(int id, String n, int a, double m)
	{
		sid = id;
		name = n;
		age = a;
		marks=m;
	}
	void displayDetails()
	{
		System.out.println("StudentId :"+sid);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);
	}
	char getGrade()
	{
		if(marks>=80)
		{
			return 'A';
		}
		else if(marks>=70)
		{
			return 'B';
		}
		else if(marks>=60)
		{
			return 'C';
		}
		else
		{
			return 'F';
		}
	}
	//main method in the same class
	
//	public static void main(String args[])
//	{
//		Student s1 = new 
//	}

}
