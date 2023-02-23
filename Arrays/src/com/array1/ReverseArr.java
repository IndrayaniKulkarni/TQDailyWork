package com.array1;

import java.util.Scanner;

public class ReverseArr {
	static Scanner sc = new Scanner(System.in);

	public static void reverse(int nums[]) {
		System.out.println("=Reverse array=");
		for(int j = (nums.length-1); j>=0; j--) {
			System.out.print(nums[j]+" ");
		}
	}
	public static void inputArr(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Size=");
		int n  =sc.nextInt();
		
		System.out.println("Array elements = ");
		int nums[] = new int[n];
		
		inputArr(nums);
		reverse(nums);
	}

}
