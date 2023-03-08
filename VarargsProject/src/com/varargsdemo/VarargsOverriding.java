package com.varargsdemo;

class Parent {

	public void display(Integer... a) {
		for (Integer x : a) {
			System.out.print(x);
		}

	}
}

class Child extends Parent {
	
	@Override
	public void display(Integer... a) {
		for (Integer x : a) {
			System.out.print(x);
		}

	}

}

public class VarargsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
