package com.polymorphism;

import java.util.Scanner;

public class Area {

//	int side;
//	int length, breadth;
//	int base;
//	float height;
//	float radius;

	public void area(int side) {
		System.out.println("Area of square :" + side * side);
	}

	public void area(int l, int b) {
		System.out.println("Area of rectangle :" + l * b);
	}

	public void area(int b, float h) {
		System.out.println("Area of triangle :" + (0.5) * b * h);
	}

	public float area(float r) {
		return ((float) ((3.14) * r * r));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Area a = new Area();

		System.out.println("Type of shape : (square,rectangle,triangle,circle) :");
		String type = sc.next();
		switch (type) {
		case "square":
			a.area(10);
			break;
		case "rectangle":
			a.area(2, 4);
			break;
		case "triangle":
			a.area(10, 14.5f);
			break;
		case "circle":
			System.out.println("Area Circle" + a.area(2.3f));
			break;
		}
		sc.close();
	}

	public static void main() {

		System.out.println("hello");

	}

}
