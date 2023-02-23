package com.example;

public class Circle implements Printable, Showable{

    int r;
    float area;
//    final float PI = 3.14f;
    Circle(){
    	
    }
    Circle(int r){
    	this.r = r;
    }
    @Override
	public void display() {
		System.out.println("Drawing a circle..");
		this.area = PI * r * r;
		System.out.println("Area of circle = "+ area + "sq. units.");
		
		
	}

	@Override
	//implements com.example.Printable.print i.e firstly def interface ref.
	public void print() {
		System.out.println(" The radius of circle is "+ r + " units.");
		
		
	}
    public static void main(String[] args) {
		
		Circle c = new Circle(10);
		c.print();
		c.display();
		
	}
}
