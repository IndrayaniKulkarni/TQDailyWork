package com.objectPassing;

import java.util.Scanner;

public class ObjectPassing {
	static Scanner sc=new Scanner(System.in);

	static void deposit(Account a) {
		// sc = new Scanner(System.in);
		System.out.println("Deposit = Rs.");
		double depo = sc.nextDouble();
		String pan;
		
		if(depo>=50000)
		{
			System.out.println("\nNeed your PAN number=");
			pan = sc.next();
		}
		double submit = a.getBalance() + depo;
		a.setBalance(submit);
		// sc.close();
	}

	static void withdrawal(Account a) {

		int minimalBalance = 3000;
		// sc = new Scanner(System.in);
		System.out.println("(Enter) Withdraw = Rs.");
		double withD = sc.nextDouble();
		if (a.getBalance() <= minimalBalance || withD >= 25000) {
			System.out.println(
					"Sorry your balance is too low or your withdrawal amount is greater than 25000 ...You can't withdraw money..");
		} else {
			double amount = (a.getBalance() - withD);

			a.setBalance(amount);
			System.out.println("Rs ." + withD + " are deducted from your account..");
		}
		// sc.close();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.println("Account number =");
	    a.setAccNumber(sc.nextInt());
		System.out.print("Account holder name = ");
		a.setAccName(sc.next());
		System.out.print("Balance = Rs.");
		a.setBalance(sc.nextDouble());
		System.out.print("Bank name =");
		a.setBankName(sc.next());
		//System.out.println(a);

		int ch;
		char choice;
		do {
			System.out.println("------------------------------");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check status");
			System.out.println("4. Exit");
			System.out.println("Choice = ");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				deposit(a);
				break;
			case 2:
				withdrawal(a);
				break;
			case 3:System.out.println("Bank details= ");
				System.out.println(a);
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("------------------------------");
			System.out.println("\n**Do you wish to continue (for yes - y/Y) = ");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		sc.close();
	}

}
