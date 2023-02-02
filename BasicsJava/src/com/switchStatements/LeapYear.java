/*
 * 1. Write a Java program to check whether a year is leap year or not
 * resource used - https://www.wikihow.com/Calculate-Leap-Years
 * 
 * Classname- LeapYear
 * 
 * Version info.
 * 
 * Date - 02 Feb.,2023
 * 
 * Copyright notice
 */
package com.switchStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nKindly enter the month number = ");
		month = sc.nextInt();
		
		
		switch(month)
		{
		case 1://Jan 31
		case 3://march
		case 5://may
		case 7://july
		case 8://aug
		case 10://oct
		case 12://dec
			    System.out.println(" 31 days in the month...");
			    break;
			
			
		case 4://april 30
		case 6://june
		case 9://sept
		case 11://nov
				System.out.println(" 30 days in the month...");
				break;
		
			
			
		case 2: // feb (leap year criteria)
				System.out.println("\n Year = ");
				int year = sc.nextInt();
				if((year%4==0)&&(year%100!=0)||(year%400==0))
				{
					System.out.println(" 29 days in the month.");
				}
				else 
				{
					System.out.println(" 28 days in the month.");
				}
				
		}
		sc.close();

	}

}
