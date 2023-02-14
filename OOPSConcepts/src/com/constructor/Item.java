package com.constructor;

public class Item {

	private int itemId;
	private String itemName;
	private float price;
	private String category;
	
	//default constructor
	public Item() {
		System.out.println("Default constructor");
	}
	
	//patameterised constructor
	//need to create default if you created this param constructor
	//we are constructor overloading
	public Item(int itemId,String itemName, float price, String category)
	{
		System.out.println("Param constructor");
		this.itemId = itemId;
		this.itemName = itemName;
		this.price=price;
		this.category = category;
		
	}
	
	public String toString()
	{
		return ("Item details "+itemId+" "+itemName+" "+price+" "+category);
	}
}
