/*
 * Given an age tell whether person is allowed to vote or not
 * 
 * Classname - VotingCriteria
 * 
 * Date - 31 Jan.,2023
 * 
 */
package com.ifelse;

import java.util.Scanner;

public class VotingCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the age of person. = ");
		age = sc.nextInt();
		sc.close();

		if (age >= 18) {
			System.out.println("\nYes, you are allowed to vote.");
		} else {
			System.out.println("\nSorry, you can't vote..");
		}

	}

}
