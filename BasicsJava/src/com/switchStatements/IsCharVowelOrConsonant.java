/*
 * Is char is vowel or consonant
 * 
 */
package com.switchStatements;

import java.util.Scanner;

public class IsCharVowelOrConsonant {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the character =");
		ch = sc.next().charAt(0);
		sc.close();
		
		char ch='Z';
	     
	     switch(ch)
	     {
	     case 65: System.out.println("Capital A");
	               break;
	     case 90: System.out.println("Capital Z");
	               break;         
	     }
	      
	     int i= 90; //> can write byte and short
	     
	     switch(i)
	     {
	     case 'A': System.out.println("Capital A");
	                break;
	     case 'Z':System.out.println("Capital Z");
	              break;
	     }
	    
	     int val=48;
	     
	     char ch1 =(char) val;
	     System.out.println(ch1);
		
		

	}

}
