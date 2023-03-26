package com.containment;

public class Order {

	private int orderId;
	private String type;
	private double amount;

	Order() {

	}

	Order(int orderId, String type, double amount) {

		this.orderId = orderId;
		this.type = type;
		this.amount = amount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", type=" + type + ", amount=" + amount + "]";
	}

}
