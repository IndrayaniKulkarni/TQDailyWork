package com.operators;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class TernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//greater of 2 nums
//		int num1 =90;
//		int num2 =78;
//		
//		System.out.println(" Greater no = "+((num1>num2)?num1:num2));
//		System.out.println(" Smallest no = "+((num1<num2)?num1:num2));
         
//		// even odd
//		int num =191;
//		System.out.println(" Number " + num + " = " + ((num%2==0)?"even":"odd"));
//	
//		
//		String status;
//		status =((num%2==0)?"even":"odd");
//		System.out.println(num + " is "+ status);
		
		// greater of 3 nums 
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
		int val;
		
		
		int status = (( ( (num1>num2)? (val=num1):(val=num2) )>num3) ? val : num3);
		System.out.println(status);
		
		//or 
		int greater;
		
		greater = (num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
		System.out.println(greater);
		
		
		
	}

}
