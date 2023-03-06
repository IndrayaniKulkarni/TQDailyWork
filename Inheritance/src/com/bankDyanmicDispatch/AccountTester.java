package com.bankDyanmicDispatch;

public class AccountTester {

	public static void main(String[] args) {
		
		Account a;
		a = new Account(112,"Mona",10000);
        System.out.println(a);
        
        a = new SavingAcc(112,"Mona",10000);
        a.getAmount();
        System.out.println(a);
        
        a = new CurrentAcc(112,"Mona",10000);
        a.getAmount();
        System.out.println(a);
        
        
	}

	

}
