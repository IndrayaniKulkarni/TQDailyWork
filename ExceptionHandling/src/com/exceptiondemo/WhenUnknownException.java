package com.exceptiondemo;

public class WhenUnknownException {

	public static void main(String[] args) {
		
		try {
			String str = new String("loermerpsd");
		    for(int i=str.length()-1; i>=0; i--) {
		    	System.out.println(str.charAt(i));
		    }
		}
		catch(Exception e) {
			System.out.println("Exception occured :"+e);
		}
	}

}
