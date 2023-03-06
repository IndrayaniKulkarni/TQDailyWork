package com.single;

public class Person {
	
	protected String name;
	protected String nationality;
	protected int phoneNo;
	protected String address;
	protected int age;
	
	Person(){
		
	}
	Person(String name,String nationality, int phoneNo, String address, int age){
		this.name = name;
		this.nationality = nationality;
		this.phoneNo = phoneNo;
		this.address = address;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationality() {
		return nationality;
	}
	
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Person =" + name + ", " + nationality + ", " + phoneNo + ", " + address
				+ ", " + age + "]";
	}
	
	
	

}
