/**
 * Series 
0,3,8,15..till n

1*1 - 1 =0
2*2 - 1 =3
3*3 - 1 =8

 */
package com.logicalQs;

import java.util.Scanner;

public class Series {

	public static void printSeries(int s, int l) {
		
		while(s<=l) {
			System.out.println("( "+s + " * "+ s + ") (- 1) = " + ((s*s)-1));
			s++;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Series till nth number..");
		int n = sc.nextInt();
		
		if(n>0) {
			int s = 0, l =n;
			printSeries(s,l);
		}
		else
		{
			int s = n, l =0;
			printSeries(s,l);
		}
		
		sc.close();

	}

}
