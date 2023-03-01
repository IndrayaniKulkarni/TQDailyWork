package com.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort2ndHigh {
static Scanner sc = new Scanner(System.in);
 public static void swap(int num[], int i, int j) {
	 int temp;
	 temp = num[i];
	 num[i] = num[j];
	 num[j]=temp;
 }
   public static void sort(int num[]) {
	   
	   for(int i=0; i<num.length; i++) {
		   for(int j=i+1; j<num.length; j++) {
			   if(num[i]>num[j]) {
				   swap(num,i,j);
			   }
		   }
	   }
   }
	public static void input(int num[]) {
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("size = ");
		int n=sc.nextInt();
		
		int num[] = new int[n];
		System.out.println("Array =");
		input(num);
		System.out.println("Before sorting = "+Arrays.toString(num));
		sort(num);
		System.out.println("After sorting = "+Arrays.toString(num));
		System.out.println("Second highest number in given array = "+num[n-2]);

	}

}
