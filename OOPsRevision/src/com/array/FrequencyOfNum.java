package com.array;

import java.util.Scanner;

public class FrequencyOfNum {
static Scanner sc = new Scanner(System.in);

public static void findFreq(int arr[]) {
	int count =0;
	for(int i=0; i<arr.length; i++) {
		count =1;
		if(arr[i]=='\0') {
			continue;
		}
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				count++;
				arr[j]='\0';
			}
		}
	System.out.println(arr[i]+" : "+count);
	}
}
	public static void input(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size = ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		input(arr);
		findFreq(arr);
		
		sc.close();
	}

}
