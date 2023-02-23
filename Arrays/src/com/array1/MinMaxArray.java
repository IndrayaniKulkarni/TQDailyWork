package com.array1;

import java.util.Scanner;

public class MinMaxArray {
 static Scanner sc = new Scanner(System.in);

 public static void printMinMax(int nums[]) {
	 
	 int max = Integer.MIN_VALUE;
	 int min = Integer.MAX_VALUE;
	 
	 for(int i=0; i<nums.length; i++) {
		 if(max<nums[i]) {
			 max = nums[i];
		 }
		 if(min>nums[i]) {
			 min = nums[i];
		 }
	 }
	 System.out.println("\n Max = "+ max+" Min ="+min);
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
		printMinMax(nums);
		
	}

}
