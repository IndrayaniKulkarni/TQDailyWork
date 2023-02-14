package com.chaining;

class Demo {
	private int a, b, c;

	Demo()
	{
		a=90;
		b=80;
		c=70;
	}
	Demo(int a)
	{
		this();
		System.out.println("CONSTRUCTOR with 1 param ");
		this.a=a;
	}
	Demo(int a, int b)
	{
		this();
		System.out.println("CONSTRUCTOR with 2 param ");
		this.a=a;
		this.b=b;
	}

	Demo(int a, int b, int c){
		System.out.println("CONSTRUCTOR with 3 param ");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String toString()
	{
		return (a+ "  "+b +"  "+c);
	}
}

public class ConstructorChaining {
	
	public static void main(String[] args) {
	
          Demo d1 = new Demo();
          System.out.println(d1.toString());
          Demo d2 = new Demo(10);
          System.out.println(d2.toString());
          Demo d3 = new Demo(10,20);
          System.out.println(d3.toString());
          Demo d4 = new Demo(10,20,30);
          System.out.println(d4.toString());
	}

}
