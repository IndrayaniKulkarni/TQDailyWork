package com.varargsdemo;

public class VarargsWrapper {
	public void display(Number ...a) {
		for (Number x : a) {
			System.out.print(x);
		}

	}
	public void display(Object ...a) {
		for (Object x : a) {
			System.out.print(x);
		}

	}
	public static void main(String[] args) {
		
		VarargsWrapper v = new VarargsWrapper();
		v.display(); //ambiguity
		//int belongs to obj
		
		// number and char both doesn't belongs to same class
		// 
	}

}
