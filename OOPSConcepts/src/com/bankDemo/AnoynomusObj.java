package com.bankDemo;

public class AnoynomusObj {

	public static void main(String[] args) {
// anoynomus object is object without ref.
		//hence can not access later
		
         System.out.println(new Account());
         System.out.println(new Account(10,"John",24823498230.0f,"Barclay").toString());
	}

}
