package com.sort2;

import java.util.Comparator;

public class CourseIdComparator implements Comparator<Course>{

	@Override
	public int compare(Course c1, Course c2) {
		return (int) (c1.getcId()-c2.getcId());
	}
}
