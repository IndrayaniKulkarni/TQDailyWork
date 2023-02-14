package com.thisDemo;
// ref. java code folder
public class ThisDemo2 {		
	int a;
	int b;
	String name;
	
	ThisDemo2(){
		this(90,100);
	      name="Unknown";
	}
	ThisDemo2(int a, int b)
	{
		this.a = a;
		this.b=b;
	}
	void addition(ThisDemo2 obj)
	{
		this.a= this.a+obj.a;
		this.b= this.b+obj.b;
	}
	ThisDemo2 displayValues()
	{
		a=a+10;
		b=b+10;
		return this;
	}
	
	public static void main(String[] args) {
		ThisDemo2 obj1= new ThisDemo2(5,6);
	     ThisDemo2 obj2= new ThisDemo2(9,10);
	     
	     System.out.println("Before:"+obj1.a+"  "+obj1.b);
	     obj1.addition(obj2);
	     
	          
	   
	     System.out.println("After:"+obj1.a+"  "+obj1.b);
	     
	     ThisDemo2 t = new ThisDemo2();
	     t.displayValues();
	     
	     System.out.println("T:"+t.a+" "+t.b);
	     
	     obj1= obj1.displayValues();
	     System.out.println("After:"+obj1.a+"  "+obj1.b);	
	
	}

}
