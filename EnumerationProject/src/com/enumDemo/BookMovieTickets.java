package com.enumDemo;

import java.util.Scanner;

public class BookMovieTickets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select one of the following = ");
		System.out.println("1. Standard");
		System.out.println("2. Premium");
		System.out.println("3. Recliner");

		int seatType = sc.nextInt();
		System.out.println("Enter no. of seats =");
		int noOfSeats = sc.nextInt();

		MovieSeats ms = null;

		switch (seatType) {
		case 1:
			ms = MovieSeats.STANDARD;
			System.out.println("Price = "+noOfSeats*ms.price);
			break;

		case 2:
			ms = MovieSeats.PREMIUM;
			System.out.println("Price = "+noOfSeats*ms.price);
			break;
		case 3:
			ms = MovieSeats.RECLINER;
			System.out.println("Price = "+noOfSeats*ms.price);
			break;
		default:
			System.out.println("error");
		}

	}

}
