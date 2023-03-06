package com.bankDyanmicDispatch;

public class SavingAcc extends Account {

	protected double amount;
	// protected double deposit;

	SavingAcc() {

	}

	SavingAcc(int accNo, String name, double balance) {
           super(accNo,name, balance);
	}
	public void rateOfInterest() {
		rate = 0.03f;
	}
	
	public float getAmount() {
		
		rateOfInterest();
		amount = balance*rate;
		balance = amount + balance;
		return (float)amount;
	}

	@Override
	public String toString() {
		return "SavingAcc ["+accNo+", "+name+", "+balance+", " + amount +", "+rate+ "]";
	}
	

}
