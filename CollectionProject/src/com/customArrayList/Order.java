package com.customArrayList;

public class Order implements Comparable<Order>{

	private int orderId;
	private String order;
	private float price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String order, float price) {
		super();
		this.orderId = orderId;
		this.order = order;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", order=" + order + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Order o) {
		
		if(this.orderId ==  o.orderId) {
			return (this.order.compareTo(order));
		}
		else if(this.orderId > o.orderId){
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}
