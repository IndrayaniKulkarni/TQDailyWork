package com.array1;

import java.util.Scanner;

public class ArraySumEvenOdd {

	/*public static void sumEvenOdd(int arr[]) {
		int sumEven =0 ;
		int sumOdd = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sumEven +=arr[i];
			}
			else
			{
				sumOdd +=arr[i];
			}
		}
		System.out.println("\n Sum of even numbers =  "+sumEven);
		System.out.println("\n Sum of odd numbers = "+sumOdd);
	}*/
	public static int addEven(int arr[]) {
		int sumEven =0 ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sumEven +=arr[i];
			}
		}
		return sumEven;
	}
	public static int addOdd(int arr[]) {
		int sumOdd =0 ;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sumOdd +=arr[i];
			}
		}
		return sumOdd;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("SUM of even numbers in given array ="+addEven(arr));
		System.out.println("SUM of odd numbers in given array ="+addOdd(arr));
		
		sc.close();

	}

}
