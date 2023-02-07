package com.accesssSpecifier;

public class DemoAccess {

	public int a = 100;
	private int b = 200;
	int c = 300;

	public static void main(String[] args) {

		DemoAccess da = new DemoAccess();
		System.out.println("\nInside class and package");
		System.out.println(da.a + " " + da.b + " " + da.c);
		System.out.println("\nConclusion - public, private and default accessible inside class.");
	}

}
