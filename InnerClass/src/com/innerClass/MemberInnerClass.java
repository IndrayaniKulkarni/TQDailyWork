package com.innerClass;

class Bank{
	private static String bankName ="SBI";
	String bankloc;
	int regNo;
	
	{
		//instance block
		bankloc = "Delhi";
		regNo = 12345;
	}
	
	void displayBank() {
		System.out.println(bankName +" "+bankloc+" "+regNo);
	}
	
	class Locker{
		int lockerId;
		String custName;
		static int lockerRent = 2000;
		
		void enterDetails(int lockerId, String custName) {
			this.lockerId = lockerId;
			this.custName = custName;
			System.out.println("This locker belong to "+custName+" with locker Id = "+lockerId+"in "+bankName);
		
			displayBank();
			System.out.println("Rent = "+lockerRent);
		}
	}
}
public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way
		Bank b1 = new Bank();
		b1.displayBank();
		Bank.Locker lock1 = b1.new Locker();
		lock1.enterDetails(101, "Sam");
		//2nd way
		Bank.Locker lock2 = new Bank().new Locker();
	    lock2.enterDetails(131, "lemony");
	}

}
