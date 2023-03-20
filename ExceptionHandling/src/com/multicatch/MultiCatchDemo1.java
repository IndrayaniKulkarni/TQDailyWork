package com.multicatch;

public class MultiCatchDemo1 {

	public static void main(String[] args) {
		
//		String str[] = {"Java","C",null,"Python"}; -- null pointer
		
		String str[] = {"Java","C","Python","Ruby"};
		
		try {
			for(int i=0; i<=str.length; i++) {
				System.out.println(str[i].length()+" ");
			}
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		/*
		  	try {
			for(int i=0; i<=str.length; i++) {
				System.out.println(str[i].length()+" ");
			}
		}
		catch(NullPointerException | ArrayOutOfBoundsException e) //can't use exception as it is parent other written exception specification becomes unreachable {
			System.out.println(e);
		}
	
		catch(Exception e) {
			System.out.println(e);
		}
		 */
	}

}
