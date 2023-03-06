package com.wrapper;
class First{
	Number value;
	
//	Number displayValue() {
//		return value;
//	}
	Object displayValue() {
		return value;
	}
	
}
class Second extends First{
	Integer myVal;
//	Number displayValue() {
//		return myVal;
//	}
	Integer displayValue() {
		return myVal;
	}
	
}

class Third extends First{
	char ch;
	//can not do this
	//char not subclass of Number
	Character displayValue() {
		return ch;
	}
}
public class CovariantWrapper {

	public static void main(String[] args) {
		
		Second s1 = new Second();
		//Number n = s1.displayValue();
		//n = n+5;// can't do integer operation with number type
		Integer n = s1.displayValue();
		n = n+5;
		System.out.println(n);
		
		
	}

}
