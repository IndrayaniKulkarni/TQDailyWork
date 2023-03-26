package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class BikeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Bike> blist = new LinkedList<>();
		
		blist.add(new Bike(101,"Honda Bike",89000));
		blist.add(new Bike(102,"Royal Enfield",100000));
		blist.add(new Bike(103,"Yamaha",78000));
		blist.add(new Bike(104,"Hayabhusa",250000));
		
		for(Bike b:blist) {
			System.out.println(b);
		}
		
		Collections.sort(blist,new PriceComparator());
		System.out.println(blist);
		
	}

}
