package com.bankDyanmicDispatch;

public class CurrentAcc extends Account {

	protected double amount;
	// protected double deposit;

	CurrentAcc() {

	}

	CurrentAcc(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	public void rateOfInterest() {
		rate = 0.05f;
	}

	public float getAmount() {

		rateOfInterest();
		amount = balance * rate;
		balance = amount + balance;
		return (float) amount;
	}
	public String toString() {
		return "CurrentAcc ["+accNo+", "+name+", "+balance +", "+ amount+ ", "+rate+ "]";
	}

}
