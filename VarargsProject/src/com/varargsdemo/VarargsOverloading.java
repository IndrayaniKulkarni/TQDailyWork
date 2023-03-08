package com.varargsdemo;

public class VarargsOverloading {

	public static void display(int ...a) {
	//	int sum =0;
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
		//System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
	}
	public static void display(String ...a) {
		//	int sum =0;
		System.out.println();
			for(String i:a) {
				System.out.print(i+" ");
			}
			//System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
		}
	public static void display(float ...a) {
		//	int sum =0;
		System.out.println();
			for(float i:a) {
				System.out.print(i+" ");
			}
			//System.out.println("Sum of array "+Arrays.toString(a)+" = "+sum);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(1,2,3,4);
		display(1.0f,1.2f,3.4f);
		display("java","c","python");
//		display();  // amibiguity .. don't understand which function to call
	}

}
