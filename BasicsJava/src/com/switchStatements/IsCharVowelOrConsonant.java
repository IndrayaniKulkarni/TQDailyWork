/*
 * Is char is vowel or consonant
 * 
 */
package com.switchStatements;

import java.util.Scanner;

public class IsCharVowelOrConsonant {

	public static void main(String[] args) {
		
		/*char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the character =");
		ch = sc.next().charAt(0);
		
	     //switch can do internal type casting 
		//here we are passing character and inside it we case going to case according to it's 
		//ASCII value
	     switch(ch)
	     {
	     case 65: System.out.println("Capital A");
	               break;
	     case 90: System.out.println("Capital Z");
	               break;         
	     }
	     
	     System.out.println("please enter the integer which could be mapped to char =");
	     int i= sc.nextInt(); //we can use byte, short
	     //In reverse here we are passing integer value which could be mapped to ASCII -character
	     //internal type casting
	     switch(i)
	     {
	     case 'A': System.out.println("Capital A");
	                break;
	     case 'Z':System.out.println("Capital Z");
	              break;
	     }
	    
	     
	     int val=100;
	     //explicit type casting
	     char ch1 =(char) val;
	     System.out.println(ch1);
		
	     sc.close(); */
		
        Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("please enter the character =");
		ch = sc.next().charAt(0);
		//65-90 = A-Z
		//97-122 = a-z
		if((ch>=65)&&(ch<=90)||(ch>=97)&&(ch<=122))
		{
			if((ch=='A')||(ch=='a'||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u')))
			{
				System.out.println("input character is vowel.");
			}
			else
			{
				System.out.println("input character is consonant.");
			}
		}
 
		sc.close();
	}

}
