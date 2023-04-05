package com.customerTreeMap;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getPrice()-o1.getPrice());
	}

}
