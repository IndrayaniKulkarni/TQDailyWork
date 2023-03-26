package com.constructorExamples;

public class Employee {

	 int id;
     String name;
     int a,b;
     void add(int x, int y) {
    	 a = a+x;
    	 b =b+y;
    	 sum(); // this. or without it implicity calls for current obj
    	 
     }
     void sum() {
    	 System.out.println(this.a+this.b);
     }
     
     Employee display() {
    	 return this;
     }
	
}
