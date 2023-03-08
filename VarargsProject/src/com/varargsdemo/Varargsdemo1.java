package com.varargsdemo;

import java.util.Arrays;

public class Varargsdemo1 {

	public static void sumArr(int a[]) {
		int sum =0;
		for(int i:a) {
			sum +=i;
		}
		System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
	}
	
	public static void sumArrBetter(int ...a) {
		int sum =0;
		for(int i:a) {
			sum +=i;
		}
		System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
	}
	
	public static void main(String[] args) {
		
		
		int arr1[] = {1,2,2,4,5,6};
		int arr2[] = {4,4,7,8,9};
		
		sumArr(arr1);
		sumArr(arr2);
		
		sumArrBetter(2,5,6,7,8);
	}

}
