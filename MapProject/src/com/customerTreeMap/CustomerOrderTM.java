package com.customerTreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTM {

	public static void sortByPrice(TreeMap<Customer,Order> tm)
	{
		//convert order values into arraylie
		ArrayList<Order> orderLs = new ArrayList<>(tm.values());
		
		Collections.sort(orderLs, new PriceComparator());
		
		LinkedHashMap<Customer,Order> lhm = new LinkedHashMap<>();
		
		for(Order o: orderLs) {
			for(Map.Entry<Customer, Order> en:tm.entrySet()) {
				if(o.equals(en.getValue())) {
					Customer c = en.getKey();
					if(!lhm.containsKey(c)) {
						lhm.put(c, o);
					}
				}
			}
		}
		for(Map.Entry<Customer, Order> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
	
		TreeMap<Customer,Order> tmap = new TreeMap<>();
		
		tmap.put(new Customer(1,"Prashant",423423234), new Order(101,"Laptop",43223f));
		tmap.put(new Customer(4,"Shweta",423423234), new Order(102,"Pendrive",43223f));
		tmap.put(new Customer(2,"Zuyog",423423234), new Order(103,"Laptop",43223f));
		tmap.put(new Customer(5,"Vivek",423423234), new Order(101,"Laptop",43223f));
		tmap.put(new Customer(5,"Vivek",423423234), new Order(105,"Charger",43223f));
		
		//correct here ...
		
	}

}
