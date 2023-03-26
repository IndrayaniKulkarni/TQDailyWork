package com.containment;

public class Customer {

	private int custId;
	private String custName;
	Order order;
	Customer(){
		
	}
	

	Customer(int custId, String custName, Order order) {
		
		this.custId = custId;
		this.custName = custName;
		this.order = order;
	}


	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", order=" + order + "]";
	}
}
