package com.array1;

import java.util.Scanner;

public class ArrayPassing {

	public static void print(int arr[]) {
		System.out.println("\nInside the funtion..");
		for(int i=0; i<arr.length;  i++) {
			arr[i] *=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		
		for(int i =0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("\nIn the main method ");
		for(int i=0; i<nums.length;  i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		print(nums);
		
		System.out.println("\nIn the main method ");
		for(int i=0; i<nums.length;  i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}

}
