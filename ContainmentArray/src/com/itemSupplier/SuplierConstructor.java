package com.itemSupplier;

public class SuplierConstructor {

	public static void main(String[] args) {
	
		Supplier s[] = new Supplier[3];

		Item i1[] = new  Item[3];
		i1[0] = new Item(1,"FlairGel",20.0f,10);
		i1[1] = new Item(2,"StedlerPencils",30.0f,10);
		i1[2] = new Item(3,"Eraser",5.0f,20);
		
		s[0] = new Supplier(101,"Raghav","1024244356",i1);
		
		Item i2[] = new  Item[3];
		i2[0] = new Item(1,"CelloGel",15.0f,10);
		i2[1] = new Item(2,"ParkerPencils",20.0f,10);
		i2[2] = new Item(3,"Ruler",15.0f,20);
		
		s[1] = new Supplier(102,"Mary","9028844356",i2);
		
		Item i3[] = new  Item[3];
		i3[0] = new Item(1,"Stepler",20.0f,5);
		i3[1] = new Item(2,"WashiTape",50.0f,5);
		i3[2] = new Item(3,"ColourPens",55.0f,20);
		
		s[2] = new Supplier(105,"Charlie","8844344356",i3);
		
		
		for(Supplier x:s) {
			System.out.println(x.getSid()+" "+x.getSupName()+" "+x.getContactNo());
			for(Item y:x.getItem()) {
				System.out.println(y);
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
	}

}
