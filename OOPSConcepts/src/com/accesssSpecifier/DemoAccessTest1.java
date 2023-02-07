package com.accesssSpecifier;

public class DemoAccessTest1 {
	public static void main(String[] args) {

		DemoAccess da = new DemoAccess();
		System.out.println("\nOnside class and inside package");
		System.out.println(da.a + " " + "can't print da.b" + " " + da.c);
//		System.out.println("Conclusion - public and default accessible inside class.");
		System.out.println("\nException in thread \"main\" java.lang.Error: Unresolved compilation problem: \r\n"
				+ "	The field DemoAccess.b is not visible\r\n" + "\r\n"
				+ "	at OOPS/com.accesssSpecifier.DemoAccessTest1.main(DemoAccessTest1.java:8)");
		System.out.println("\nConclusion - public and default accessible inside class.");
	}

}
