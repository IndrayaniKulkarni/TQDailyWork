package com.customerTreeMap;

public class Order {

	private int orderId;
	private String item;
	private float price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String item, float price) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", item=" + item + ", price=" + price + "]";
	}
	
}
