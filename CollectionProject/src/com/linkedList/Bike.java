package com.linkedList;

public class Bike {

	private int id;
	private String bName;
	private double price;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int id, String bName, double price) {
		super();
		this.id = id;
		this.bName = bName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", bName=" + bName + ", price=" + price + "]";
	}
	
	
}
