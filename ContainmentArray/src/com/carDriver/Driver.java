package com.carDriver;

public class Driver {

	private int id;
	private String name;
	private String contactNo;
	
	
	Driver(){
		
	}
	Driver(int id, String name, String contactNo){
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
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
	
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String toString() {
		return "Driver : [" + id + ", " + name + ", " + contactNo + "]";
	}
	
	
}
