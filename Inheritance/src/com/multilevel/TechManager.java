package com.multilevel;

public class TechManager extends Manager{
	
	private String technology;
	
//	TechManager(){
//		//super();
//	}
	TechManager(int id, String name, double salary, float exper){
		
		super(id, name, salary, exper);
		this.exper = exper;
		
	}
	//constructors are never inherited
	TechManager(int id, String name, float salary, float exper){
		super(id,name,salary,exper);
		this.technology = technology;
	}
}
