package com.innerClass;

class OuterClass{
	private static int a =10;
	private String name ="java";
	static class StaticInner{
		static int b=20;
		private String lang ="python";
		
		void show() {
			System.out.println(a);
//			System.out.println(name); //can't access non static members in static method
			System.out.println(b);
			System.out.println(lang);
			OuterClass o1 = new OuterClass();
			System.out.println(o1.name);
		}
		static void display() {
			OuterClass o1 = new OuterClass();
			System.out.println(o1.name);
			System.out.println(a);
			System.out.println(b);
			StaticInner s1 = new StaticInner();
			System.out.println(s1.lang);
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		
		OuterClass.StaticInner s1 = new OuterClass.StaticInner();
		s1.show();
		OuterClass.StaticInner.display();
		}

}
