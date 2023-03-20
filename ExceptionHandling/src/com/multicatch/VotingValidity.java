package com.multicatch;

import java.util.Scanner;

public class VotingValidity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter age = ");
			int age = sc.nextInt();
			if (age < 0) {
				throw new Exception("Age can't be negative.");
			}
			if (age > 0 && age < 18) {
				throw new ArithmeticException("Person not old enough to vote..");
			} else {
				System.out.println("Allowed to vote");
			}
		} catch (ArithmeticException e) {
			System.out.println("Person not old enough to vote..");
		} catch (Exception e) {
			System.out.println("Age can't be negative.");
		}

		finally {
			sc.close();
		}
	}

}
