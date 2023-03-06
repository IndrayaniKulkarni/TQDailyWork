package com.itemSupplier;

import java.util.Scanner;

public class SupplierGetterSetter {
	static Scanner sc = new Scanner(System.in);

	public static void inputItem(Item i) {

		System.out.println("Item Id = ");
		i.setId(sc.nextInt());
		System.out.println("Item Name = ");
		i.setName(sc.next());
		System.out.println("Item unit price = ");
		i.setUnitPrice(sc.nextFloat());
		System.out.println("Item quantity = ");
		i.setQuantity(sc.nextFloat());
	}

	public static void input(Supplier s) {

		System.out.println("Supplier Id = ");
		s.setSid(sc.nextInt());
		System.out.println("Supplier Name = ");
		s.setSupName(sc.next());
		System.out.println("Supplier Contact no = ");
		s.setContactNo(sc.next());

		System.out.println("No. of items =");
		int n = sc.nextInt();

		s.setItem(new Item[n]);

		for (int i = 0; i < n; i++) {	
			s.getItem()[i] = new Item();
			inputItem(s.getItem()[i]);
		}
	}

	public static void main(String[] args) {

		Supplier[] s = new Supplier[2];
		for(int i=0; i<2; i++) {
			s[i] = new Supplier();
			input(s[i]);
		}
		for(Supplier x:s) {
			System.out.println(x.getSid()+" "+x.getSupName()+" "+x.getContactNo());
			for(Item y:x.getItem()) {
				System.out.println(y);
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
	}

}
