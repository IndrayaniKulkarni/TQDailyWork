package com.switchStatements;

import java.util.Scanner;

public class LetterDigitSpecialChar {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);

		if (((ch >= 65) && (ch <= 90)) || ((ch >= 97) && (ch <= 122))) {
			if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e')
					|| (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				System.out.println("Vowel");

			} else
				System.out.println("Consonant");
		}

		else if ((ch >= 48) && (ch <= 57)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special character");
		}
		sc.close();

	}

}
