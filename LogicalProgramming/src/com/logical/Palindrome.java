/*
 * How to find palindrome of number if we go digit wise 
 * thenn in terms of complexity it would be costly so?
 * first try bad complexity
 */
package com.logical;

public class Palindrome {

	public static void isPalindrome(int num) {
		int reverse = 0;

		int original = num;
		while (num != 0) {
			int r = num % 10;
			reverse = reverse * 10 + r;
			num = num / 10;

		}
		if (original == reverse) {
			System.out.println(" Palindrome");
		} else {
			System.out.println(" Not Palindrome");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(101);
		isPalindrome(113);
	}

}
