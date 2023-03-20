package com.multicatch;

import java.util.Scanner;

public class AddBinaryNumbers {

	public static boolean isBinary(int op) {
		int original = op;
		boolean status = false;
		while(op!=0) {
			int r=op%10;
			op=op/10;
			if(r==0||r==1) {
				status = true;
			}
			else {
				status = false;
				break;
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Binary AND =");
		try{
			System.out.println("First operand = ");
	        int op1 = sc.nextInt();
	        if(!isBinary(op1)) {
	        	throw new ArithmeticException();
	        }
	        else {
	        	System.out.println("valid");
	        }
	        System.out.println("Second operand = ");
	        int op2 = sc.nextInt();
	        if(!isBinary(op2)) {
	        	throw new ArithmeticException();
	        }
	        else {
	        	System.out.println("valid");
	        }
	        
		}
		catch(ArithmeticException e) {
			System.out.println("Number is not binary "+e);
		}
		
		sc.close();
	}

}
