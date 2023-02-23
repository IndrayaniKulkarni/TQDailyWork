package com.array1;

import java.util.Arrays;
import java.util.Scanner;

public class HalfSorting {

	static Scanner sc = new Scanner(System.in);
	
	public static void swap(int arr[], int i, int j) {			
     int temp;
	 temp = arr[i];
	 arr[i] = arr[j];
	 arr[j] = temp;
	}
	
	public static void sortDes(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					swap(arr,i,j);
				}
			}
		}
		
	}
	public static void sortAsc(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Size =");
		int n = sc.nextInt();
		System.out.println("Array =");
		int num[] = new int[n];
		FreqNumber.input(num);
		
		int dec[] = new int[n/2+1];
		int asc[] = new int[n/2+1];
		
		for(int i=0; i<num.length/2; i++) {
			dec[i]=num[i];
		}
		for(int i=0; i<num.length/2; i++) {
			asc[i]=num[i];
		}
		
		sortDes(dec);
		System.out.println(Arrays.toString(dec));
		
		sortAsc(asc);
		System.out.println(Arrays.toString(asc));
		
		
	}

}
