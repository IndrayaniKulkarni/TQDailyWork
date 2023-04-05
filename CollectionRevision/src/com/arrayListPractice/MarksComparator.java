package com.arrayListPractice;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		return (int) (s1.getMarks()-s2.getMarks());
	}

}
