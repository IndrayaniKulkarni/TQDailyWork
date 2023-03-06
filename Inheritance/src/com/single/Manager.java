package com.single;

public class Manager extends Employee{
	
	private float exper;

	
	public Manager(int id, String name, double salary,float exper) {
		super(id,name,salary);
		this.exper = exper;
	}

	public float getExper() {
		return exper;
	}

	public void setExper(float exper) {
		this.exper = exper;
	}
	
	
	

}
