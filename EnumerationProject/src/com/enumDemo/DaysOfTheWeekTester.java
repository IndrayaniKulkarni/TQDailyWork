package com.enumDemo;

public class DaysOfTheWeekTester {

	public enum DAYS {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	public static void main(String[] args) {
		
		System.out.println("Weekends = "+DAYS.SATURDAY+" "+DAYS.SUNDAY);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("All days in the week = ");
		for(DAYS d: DAYS.values()) {
			System.out.print(d+" ");
		}
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Value of THURSAY = "+DAYS.valueOf("THURSDAY"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Index of WEDNESDAY ="+DAYS.WEDNESDAY.ordinal());
	}

}
