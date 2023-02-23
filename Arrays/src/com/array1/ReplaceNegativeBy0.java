package com.array1;

import java.util.Scanner;

public class ReplaceNegativeBy0 {
static Scanner sc = new Scanner(System.in);
	public static void replace(int a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]<0) {
				a[i]=0;
			}
		}
	}
	public static void print(int a[]) {
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void input(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int a[] = new int[n];
		input(a);
		System.out.println("Before replace");
		print(a);
		replace(a);
		System.out.println("After replace");
		print(a);
		
		
		
		
	}

}
