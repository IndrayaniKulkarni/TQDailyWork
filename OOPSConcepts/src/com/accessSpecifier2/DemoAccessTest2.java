package com.accessSpecifier2;

import com.accesssSpecifier.DemoAccess;

public class DemoAccessTest2 {

	public static void main(String[] args) {

		DemoAccess da = new DemoAccess();
		System.out.println("\nOnside class and inside package");
		System.out.println(da.a + " " + "can't print da.b" + " " + "can't print da.c");
		//System.out.println("Conclusion - only public accessible inside class.");
		System.out.println("\nException in thread \"main\" java.lang.Error: Unresolved compilation problems: \r\n"
				+ "	The field DemoAccess.b is not visible\r\n" + "	The field DemoAccess.c is not visible\r\n" + "\r\n"
				+ "	at OOPS/com.accessSpecifier2.DemoAccessTest2.main(DemoAccessTest2.java:11)");
		System.out.println("\nConclusion - only public accessible inside class.");
	}

}
