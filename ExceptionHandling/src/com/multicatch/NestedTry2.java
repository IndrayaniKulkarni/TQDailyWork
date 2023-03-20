package com.multicatch;

public class NestedTry2 {
//propagation of exception
	public static void nestedTry() {
//		try {
		int i = Integer.parseInt("abc");
		//catch(Exception e) {
//		System.out.println("Method:"+e);
//	}
	}
	public static void main(String[] args) {
		
		try {
			nestedTry();
		}
		catch(Exception e) {
			System.out.println("Main:"+e);
		}
	}

}
