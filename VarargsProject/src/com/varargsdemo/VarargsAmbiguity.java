package com.varargsdemo;

public class VarargsAmbiguity {

	public static void display(int x,char ...a) {
		//	int sum =0;
		System.out.println(x);
			for(char i:a) {
				System.out.print(i+"");
			}
			//System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
	}
	public static void display(char a, int ...x) {
		//	int sum =0;
		System.out.println(a);
			for(int i:x) {
				System.out.print(i+"");
			}
			//System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(10,'c','e'); //will call 1st method
		display('d',32,34);//second method
		
		// here either 1st part or second part should be type casted
		//but here it can't decide
//		display(6,7,8,8); //which part to promat - amibiguity
	}

}
