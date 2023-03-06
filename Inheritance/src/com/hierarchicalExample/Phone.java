/*
 * phone - id, phoneNo, bill
landline - connection, area
mobilephone -brand, simCard, netpack

which one user is using 
 */
package com.hierarchicalExample;

public class Phone {
	
	private int id;
	private long phoneNo;
	private float bill;
	// Rs.1 per min
	Phone(){
		
	}
	Phone(int id, long phoneNo, float bill){
		this.id = id;
		this.phoneNo = phoneNo;
		this.bill = bill;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setBill(float bill) {
		this.bill = bill;
	}
	public float getBill() {
		return bill;
	}
	
	public String toString() {
		return "Phone [" + id + ", " + phoneNo + ", " + bill + "]";
	}
	
}
