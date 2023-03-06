package com.stringLogical2;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStringEqualParts {

	public static void divideString(String str) {
		int len = str.length();
	    int n =  4; //no. of substring
	    
	    int noOfChars = len/n;
	    String splitStr[] = new String[n];
	    if(len%n!=0)
	    {
	    	System.out.println("Can't divide");
	    }
	    else
	    {
	    	
	    	int index = 0; // substring index
	    	for(int i=0; i<str.length(); i+=noOfChars) {
	    		splitStr[index] = str.substring(i,index+noOfChars);
	    		index++;
	    	}
	    	System.out.println(Arrays.toString(splitStr));
	    }
	    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		String str = sc.next();
		divideString(str);
		
	}

}
