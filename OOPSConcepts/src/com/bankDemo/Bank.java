package com.bankDemo;

public class Bank {

	public static void main(String args[]) {
		//ref = obj
		Account a1 = new Account();
		//calling methods
		a1.setAccNo(1021);
		a1.setAccName("Mary");
		a1.setBankName("SBI");
		a1.setBalance(2323.0f);
		//to create object and inputting value we have different methods..
		//basically we are not giving input at the time of object creation
		//this is loose coupling or loose binding
		
		
		//in contrast
		//passing inputs at time of object creation
		//tight binding or coupling
		 Account a3= new Account(2013,"Graham","SBI"); 
	     System.out.println(a3);//tostring would be called
	   
	     
	}

}
