package com.customArrayList;

import java.util.Comparator;

public class OrderPriceComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		if(o1.getPrice()==o2.getPrice()) {
			return (o1.getOrder().compareTo(o2.getOrder()));
		}
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
