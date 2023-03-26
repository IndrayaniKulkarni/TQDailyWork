package com.customArrayList;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks()==o2.getMarks()) {
			return o1.getName().compareTo(o2.getName());
		}
		else if(o1.getMarks()>o2.getMarks()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
