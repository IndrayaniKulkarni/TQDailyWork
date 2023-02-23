package com.array1;

import java.util.Scanner;

public class Sort {

	static Scanner sc = new Scanner(System.in);
	
	public static void bubbleSort(int nums[]) {
		
		int temp;
		
		for(int i=0;i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					temp = nums[i];
					nums[i]=nums[j];
					nums[j] =temp;
				}
			}
		}
	}
	
	public static void inputArr(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
	}
	public static void print(int nums[]) {
		for(int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Size=");
		int n  =sc.nextInt();
		
		System.out.println("Array elements = ");
		int nums[] = new int[n];
		inputArr(nums);
		System.out.println("Before sorting - ");
		print(nums);
		bubbleSort(nums);
		System.out.println("After sorting - ");
		print(nums);
		
	}

}
