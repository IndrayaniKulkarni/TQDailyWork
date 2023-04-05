package com.queue;


import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque<Integer> adq = new ArrayDeque<>();

		// adq.add(null); not allowed
		adq.add(56);
		adq.add(78);
		adq.add(78);
		adq.add(45);

		// duplicate allowed
		// maintain order of insertion

		System.out.println(adq);

		System.out.println(adq.removeLast());

		adq.push(90); // addFirst

		adq.add(89);

		System.out.println(adq);

		System.out.println(adq.pop());

	}

}
