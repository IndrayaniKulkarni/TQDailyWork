package com.array1;

import java.util.Scanner;

public class AddNextElement {
static Scanner sc = new Scanner(System.in);
	public static void add(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			a[i] =a[i] + a[i+1];
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
		add(a);
		System.out.println("\nAfter replace");
		print(a);
		
		
		
		
	}

}
