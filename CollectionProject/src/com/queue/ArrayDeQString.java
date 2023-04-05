package com.queue;

import java.util.ArrayDeque;

public class ArrayDeQString {

	public static void main(String[] args) {
		
		ArrayDeque<String> colours = new ArrayDeque<>();
		colours.add("blue");
		colours.push("red");
		System.out.println(colours);
		System.out.println("pop = "+colours.pop());
	}

}
