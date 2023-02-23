package com.advancement;

public interface Printable {
	
		float PI =3.14f;
		void area();
		default void volume() {
			System.out.println("Volume method.");
		  display();
		}
		private void display() {
			System.out.println("heloen");
		}
	
}
// cube.java, printable.java,
//sqauare .java

