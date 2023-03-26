package com.diamondProblem;

interface A{
	
	public void display();
}

interface B{
	
	public void print();
}

class AB implements A, B{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" print method .. class AB");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" display method .. class AB");
		
	}
		
}

class C extends AB{
	
}
class D extends AB{
	
}
public class diamondProblemTest {

	public static void main(String[] args) {
		
		D obj = new D();
	}

}
