package com.methodOveridding;

class Bank{
	protected float rate ;
	void setRateOfInterest() {
		rate = 0f;
		
	}
}
class HDFC extends Bank{
	
	void setRateOfInterest() {
		rate = 8.5f;
		
	}
}
class Canara extends Bank{
	
	void setRateOfInterest() {
		rate = 9.0f;
		
	}
}
public class BankInterestOverridding {

	public static void main(String[] args) {
		

	}

}
