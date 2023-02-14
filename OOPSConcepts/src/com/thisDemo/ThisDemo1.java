package com.thisDemo;

class Person {
	private String name;
	private int age;
	private String vote;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.vote = null;
	}
//calling another method from this method
	public void getVoteRight() {
        System.out.println("Voting rights = "); 
		this.checkVote();
         System.out.println(this.vote);
	}

	public void checkVote() {
		System.out.println("Checking status...");
		if (this.age >= 18) {
			this.vote = "Eligible";
		} else {
			this.vote = "Not eligible";
		}
	}
}

public class ThisDemo1 {

	public static void main(String[] args) {

		Person p1 = new Person("amy",20);
		p1.getVoteRight();
	}

}
