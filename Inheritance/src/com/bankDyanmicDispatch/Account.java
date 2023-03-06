package com.bankDyanmicDispatch;

public class Account {

	protected int accNo;
	protected String name;
	protected double balance;
	protected float rate;
	
	Account(){
		
	}
	Account(int accNo, String name){
		this.accNo = accNo;
		this.name = name;
	}
	Account(int accNo, String name, double balance){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public void RateOfInterest() {
		rate = 0.01f;
	}
	public float getAmount() {
		return 0.0f;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", rate=" + rate + "]";
	}
	
	
}
