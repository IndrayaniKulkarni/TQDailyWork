package com.demo;


class Car implements Movable{

	@Override
	public void move() {
		System.out.println("Car moving at speed at "+speed+"km/hr.");
	}
	
}
class Person implements Movable{

	@Override
	public void move() {
		System.out.println("Person isrunning at speed at "+(speed/5)+"km/hr.");
	}
	
}
public class MovableTest {

	public static void main(String args[]) {
		// dynamic method dispatch
		Movable m;
		m = new Car();
		m.move();
		
		m= new Person();
		m.move();
	}
	
}
