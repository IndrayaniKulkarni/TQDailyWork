package com.practiceQs15mar;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeros {

	public static void shiftZerosToEnd(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Afer = "+Arrays.toString(arr));
	}
	public static void main(String[] args) {

//         int arr[] = {1,0,3,4,5,0,9};
//         //ans = {1,3,4,5,9,0,0};

		Scanner sc = new Scanner(System.in);
		System.out.println("size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before = "+Arrays.toString(arr));
         shiftZerosToEnd(arr);

	}

}
