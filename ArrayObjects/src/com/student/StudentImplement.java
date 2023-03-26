package com.student;

public class StudentImplement {

	public static void main(String[] args) {
		Student st[] = new Student[5];
		
		st[0] = new Student(1,"Radha",89.5f);
		st[1] = new Student(2,"Ramesh",89.5f);
		st[2] = new Student(3,"Clara",83.5f);
		st[3] = new Student(4,"Henry",87.5f);
		st[4] = new Student(5,"Alex",79.5f);
		
		
		for(Student x:st) {
			System.out.println(x.toString());
		}
	}

}
