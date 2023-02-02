/*
 * DECS - Check BMI and tell whether to allow to donate blood or not
 * height feet, weight kg -convension - 1ft = 0.3048m
 * convert for formula = bmi = w/h^2
 * BMI > 18 -healthy, <18 - underweight, >25 -obese
 * 
 * Classname - BMICalculator
 * 
 * Date - 31 Jan.,2023
 * 
 */
package com.ifelse;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//var declaration
		float feet, weight;
		double bmi;
		
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter your weight(kg) = ");
		weight = sc.nextFloat();
		System.out.println("\n Please enter your height(feet) = ");
		feet = sc.nextFloat();
		sc.close();

		// conversion into standard format 
		double meterH = feet * (0.3048);

		// calculation
		bmi = (weight) / (meterH * meterH);

		System.out.println(" Your BMI = " + bmi);

		// result according to bmi values
		if (bmi > 25) {
			System.out.println("\n Your BMI status indicates, you are obese. ");
		} else if (bmi >= 18) {
			System.out.println("\n Your BMI status indicates, you are healthy.");
		} else if (bmi < 18) {
			System.out.println("\n Your BMI status indicates, you are underweight.");
		}

	}

}
