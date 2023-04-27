package com.objectInputOutput;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eId;
	private String eName;
	private float salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, float salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
}
