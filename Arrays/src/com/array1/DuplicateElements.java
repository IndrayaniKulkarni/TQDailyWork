package com.array1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
	static Scanner sc = new Scanner(System.in);

	public static void printUnique(int arr[]) {

		int count = 0, unique = 0;
		
		for(int i=0; i<arr.length; i++) {
			count = 1;
			if(arr[i]=='\0') {
				continue;
			}
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='\0';
				}
			}
			if(count==1) {
				unique++;
				System.out.println(arr[i]+" : "+count);
			}
		}
		System.out.println("\nTotal Unique numbers ="+unique);
	}

//	public static void input(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//	}

	public static void main(String[] args) {

		System.out.println("Size = ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Array = ");
		// FreqNumberclass - public static void input()
		FreqNumber.input(arr);

		System.out.println("Given array = " + Arrays.toString(arr));
		printUnique(arr);
	}

}
