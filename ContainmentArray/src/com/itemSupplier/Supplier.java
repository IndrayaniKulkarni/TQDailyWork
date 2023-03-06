package com.itemSupplier;

import java.util.Arrays;

public class Supplier {

	private int sid;
	private String supName;
	private String contactNo;
	private Item item[];
	
	Supplier(){
		
	}

	Supplier(int sid, String supName, String contactNo, Item[] item) {
		this.sid = sid;
		this.supName = supName;
		this.contactNo = contactNo;
		this.item = item;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", supName=" + supName + ", contactNo=" + contactNo + ", item="
				+ Arrays.toString(item) + "]";
	}
	
	
}
