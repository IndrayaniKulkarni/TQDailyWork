package com.itemSupplier;

public class Item {

	private int id; 
	private String name;
	private float unitPrice;
	private float quantity;
//	total
	
	Item(){
		
	}
	Item(int id, String name, float unitPrice, float quantity){
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity =quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	
}
