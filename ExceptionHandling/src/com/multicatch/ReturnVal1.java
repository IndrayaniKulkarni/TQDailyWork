package com.multicatch;

public class ReturnVal1 {

	static int method(int data) {
		
		try {
			return data+10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		finally
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(method(10));
	}

}
