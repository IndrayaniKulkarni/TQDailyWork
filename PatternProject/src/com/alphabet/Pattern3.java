/**
 * 
 *    E
 *   DE
 *  CDE
 * BCDE   
 */
package com.alphabet;

public class Pattern3 {

	public static void main(String args[]) {
		
		char ch = 'E';
		for(int i=0; i<5; i++) {
			for(int j=0; j<(5-i-1); j++ ) {
				System.out.print(" ");
				
			}
			ch = 'E';
			for(int k=0; k<i; k++) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}
}
