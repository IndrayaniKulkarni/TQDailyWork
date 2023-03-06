package com.dynamicMethodDispatch;

class Player {
	protected String name;

	Player() {

	}

	Player(String name) {
		this.name = name;
	}

//	public String getName() {
//		return name;
//	}
	public void display() {
		System.out.println(this.name + "is a player..");
	}

}

class Cricket extends Player {

	Cricket() {

	}

	Cricket(String name) {
		super(name);
	}

	public void display() {
		System.out.println(this.name + " is a cricket player..");
	}
}

class Football extends Player {
	Football() {

	}

	Football(String name) {
		super(name);
	}

	public void display() {
		System.out.println(name + " is a football player..");
	}
}

public class DynamicMethodPlayer {

	public static void main(String[] args) {
		// with same ref. stored in stack we can
		// refer to heap area address of which
		// object is initialised
		// we use parent class to define ref.
		// and with help of it we can ref. to child
		// method and its own parent method??
		// is this right...review later..

		Player p;
		p = new Player("Elie");
		p.display();
		p = new Cricket("Oscar");
		p.display();
		p = new Football("Amit");
		p.display();

	}

}
