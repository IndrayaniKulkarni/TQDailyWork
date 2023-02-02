package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a =5;
		
	//	a +=(5); //internally casting
		
		// for following we need mention
		a = (byte)(a + 5);
		System.out.println(a);

	}

}
