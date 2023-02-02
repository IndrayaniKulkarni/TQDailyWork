package com.operators;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot, best;
		Scanner sc = new Scanner(System.in);
		System.out.println("Total marks = ");
		tot = sc.nextInt();
		System.out.println("Best of three = ");
		best = sc.nextInt();
		sc.close();
		
		// with if else conditon and logical operator
		if((tot>80)|| (best>90))
		{
			System.out.println("Eligible..");
		}
		else
		{
			System.out.println("Not Eligible..");
		}
		
		// with ternary operator and logical operator
		System.out.println((((tot>80)|| (best>90))?"Eligible":"Not Eligible"));
		
	}

}
