/*
 *  percentage - Marks to grade 
 *  
 *  Classname - GradingSys
 *  
 *  Date - 31 Jan.,2023
 *  
 */
package com.ifelse;

import java.util.Scanner;

public class GradingSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks1, marks2, marks3;
		float tot, percentage;

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the marks(out of 100) of PCM - ");
		marks1 = sc.nextFloat();
		marks2 = sc.nextFloat();
		marks3 = sc.nextFloat();
		sc.close();

		tot = marks1 + marks2 + marks3;

		percentage = tot / 3;
		System.out.println("\n Percentage = " + percentage + "");
		if (percentage >= 85) {
			System.out.println("\nExcellent..");
		} else if (percentage >= 70) {
			System.out.println("\nVery Good..");
		} else if (percentage >= 55) {
			System.out.println("\nGood..");
		} else if (percentage >= 40) {
			System.out.println("\nSatisfactory..");
		} else {
			System.out.println("\nSorry, but you have to work hard..");
		}
	}

}
