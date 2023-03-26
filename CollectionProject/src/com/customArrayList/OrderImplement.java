package com.customArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OrderImplement {

	public static void main(String[] args) {
		
		ArrayList<Order> o = new ArrayList<>();
		
		o.add(new Order(01,"Fountain Pen",50.0f));
		o.add(new Order(10,"Notebook",100.0f));
		o.add(new Order(13,"Graph paper",30.0f));
		o.add(new Order(14,"Pencil",40.0f));
		
		Collections.sort(o);
		System.out.println(o);
		
		Collections.sort(o, new OrderPriceComparator());
		System.out.println(o);
	}

}
