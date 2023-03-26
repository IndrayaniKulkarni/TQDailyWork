package com.innerClass;

interface Doable{
	public void doIt();
}
class Car {
	
	public void drive() {
		System.out.println("I'm driving..");
	}
}
abstract class Cake{
	abstract void doBaking() ;
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		
		//1. using interface
		
		//Doable$1
		Doable d1 = new Doable() {
			public void doIt() {
				System.out.println("I am doing nothing..");
				
			}
		};
		d1.doIt();
		
		//2. using concrete
		Car c1=new Car() {
			public void drive() {
				System.out.println("driving");
			}
		};
		
		//3. using abstract
//		AnonoymousInnerClass$ extends cake
		Cake k = new Cake() {
			public void doBaking() {
				System.out.println("bake a cake");
			}
		};
		k.doBaking();
	};

}
