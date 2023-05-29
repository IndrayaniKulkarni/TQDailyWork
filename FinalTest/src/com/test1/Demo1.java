package com.test1;

public class Demo1 {

	public static void findClosestNo(int[] arr, int n) {
		int minDiff = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(Math.abs(n-arr[i])<minDiff) {
				minDiff = Math.abs(arr[i]-n);
				index = i;
			}
		}
		System.out.println(arr[index]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int array - random input
		
		int[] arr = {1,24,31,18};
		int n = 10;
		//find closest no. 
		
		findClosestNo(arr,n);
		
	}

}
