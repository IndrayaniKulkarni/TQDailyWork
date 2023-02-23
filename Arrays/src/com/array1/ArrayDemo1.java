package com.array1;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of arr =");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Elements = ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum =0;
		for(int j =0; j<arr.length; j++) {
			sum += arr[j];
			
			System.out.print(arr[j]+" ");
		}
		System.out.println("\nSumof given array elements = "+sum);

	}

}
