package com.linkedList;

import java.util.Comparator;

public class PriceComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike b1, Bike b2) {
		// TODO Auto-generated method stub
		return (int) (b2.getPrice()-b1.getPrice());
	}

}
