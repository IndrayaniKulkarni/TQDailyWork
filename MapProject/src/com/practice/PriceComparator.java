package com.practice;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return (int) (b1.getPrice()-b2.getPrice());
	}

	
}
