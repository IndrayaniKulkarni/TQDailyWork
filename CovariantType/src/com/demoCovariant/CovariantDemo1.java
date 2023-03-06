package com.demoCovariant;
class Vehicle{
//	private String name;
	protected int speed;
	//instance block
	{
		speed = 100;
	}
	//return type as Vehicle
	Vehicle changeSpeed() {
		speed = speed + 10;
		return this; // returns current obj
	}
	void display() {
		System.out.println("Speed of vehicle ="+speed);
	}
	
}
class Car extends Vehicle{
	//reinitialsing var from parent class in instance block
	{
		speed = 200;
	}
//	Vehicle changeSpeed() {
//		speed = speed + 50;
//		return this; // returns current obj
//	}
	Car changeSpeed() {
		speed = speed + 50;
		return this; // returns current obj
	}
	
	void display() {
		System.out.println("Speed of car ="+speed);
	}
	void changeGear() {
		System.out.println("Gear changed");
	}
}
public class CovariantDemo1 {

	public static void main(String[] args) {
	
//		Vehicle v = new Vehicle();
//		Car bmw = new Car();
//		bmw.display();
//		bmw = bmw.changeSpeed();
		//System.out.println(bmw.changeSpeed());
	//
//		Vehicle v = new Car();
//		v.display();
//		
//		v = v.changeSpeed();
////		v.changeGear();
//		
//		Car c1 = new Car();
//		c1.display();
//		//c1 = c1.changeSpeed();
//		c1.changeSpeed();
//		c1.changeGear();
//		c1.display();
		
		Car c;
		Car bmw = new Car();
		Car audi = new Car();
		
		c = bmw.changeSpeed();
		c.display();
		
		c.changeGear();
		c.display();
		
		c=audi.changeSpeed();
		c.display();
	
	}

}
