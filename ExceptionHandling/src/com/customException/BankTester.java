package com.customException;

class Account {
	private int accountNo;
	private String name;
	private float balance;
	private float deposit;
	private float withdraw;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
		this.balance += this.deposit;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw){
		this.withdraw = withdraw;
//		if((this.balance - this.withdraw)<= this.deposit) {
//			throw new InsufficientBalanceException("No sufficient funds in the accout..");
//		}
//		else {
//			this.balance -= withdraw;
//		}
//		2nd way

		/*if ((this.balance - this.withdraw) <= this.deposit) {
			try {
				throw new InsufficientBalanceException("No sufficient funds in the account..");
			} catch (Exception e) {
				System.out.println(e);
				this.balance =balance;
				System.out.println(toString());
				
			}
		} else {
			this.balance -= withdraw;
			System.out.println(balance);
		
		}*/
		if (this.balance - withdraw < 0) {
			try {
				throw new InsufficientBalanceException("Balance is too low");
			} catch (InsufficientBalanceException e) {
				System.out.println(e);

			}
		} else

		{
			this.balance -= withdraw;

			System.out.println("Amount withdrawn:" + withdraw);
			System.out.println("Current Balance:" + this.balance);
		}
		

	}

	@Override
	public String toString() {System.out.println(this.toString());
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + "]";
	}

}

public class BankTester {

	public static void main(String[] args){

		Account a = new Account();
		a.setAccountNo(23423);
		a.setName("Aurelia");
		a.setBalance(5000.0f);
		a.setDeposit(300.0f);
		a.setWithdraw(6000.0f);

//		1. 1 way
//		try{
//			a.setWithdraw(5010.0f);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println(a.toString());
//		}
//		System.out.println(a.toString());
		Account a2 = new Account();
		a2.setAccountNo(23323);
		a2.setName("Amit");
		a2.setBalance(5000.0f);
		a2.setDeposit(300.0f);
		a2.setWithdraw(5000.0f);
//		a2.toString();
//		try{
//			a2.setWithdraw(100.0f);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println(a2.toString());
//		}

	}

}
