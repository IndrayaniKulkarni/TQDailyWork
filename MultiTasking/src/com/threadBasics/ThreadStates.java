package com.threadBasics;

public class ThreadStates {

	public static void main(String[] args) {
		
		Thread.State[] states = Thread.State.values();
		
		for(Thread.State t:states) {
			System.out.println(t);
		}
	}

}
