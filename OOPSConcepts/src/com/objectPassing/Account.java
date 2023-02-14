package com.objectPassing;

public class Account {

	private int accNumber;
	private String accName;
	private String bankName;
	private double balance;

	// default constructor
	Account() {

	}

	// param constructor
	Account(int accNumber, String accName, String bankName) {
		System.out.println("Constructor 1");
		this.accName = accName;
		this.accNumber = accNumber;
		this.bankName = bankName;
	}

	// param constructor
	Account(int accNumber, String accName, double balance, String bankName) {
		this(accNumber, accName, bankName);
		System.out.println("Constructor 2");
		this.balance = balance;

	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	void display() {
		System.out.println(accNumber + " " + accName + " " + bankName + " " + balance);
	}

	public String toString() {
		return accNumber + " " + accName + " " + bankName + "  :" + balance;
	}

}
