package com.bankDemo;

public class Account {

	private int accNo;
	private String accName;
	private float balance;
	private String bankName;

	// default constructor
	Account() {

	}

	// param constructor
	Account(int accNo, String accName, String bankName) {
		this.accNo = accNo;
		this.accName = accName;
		this.bankName = bankName;
	}

	Account(int accNo, String accName, float balance, String bankName) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		this.bankName = bankName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String toString(){
		return (accNo+" "+accName+" "+ balance+" "+bankName);
	}
}
