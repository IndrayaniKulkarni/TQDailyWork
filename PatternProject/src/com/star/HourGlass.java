package com.star;

public class HourGlass {

	public static void main(String[] args) {
		
		
		int n = 6;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(n-i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<(n-i-1); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
