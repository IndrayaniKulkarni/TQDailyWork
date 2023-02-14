package com.polymorphism;

public class TypePromotion {

	static void display(float i)
	{
		System.out.println(i);
	}
	static void display() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		display();
		display(98);
		
		display('s');//char converting it self to int with Ascii value
		//115
		
		//display(9.8);//float cannot be upcasted as there isn't method 
		//with double 
		
	}

}
