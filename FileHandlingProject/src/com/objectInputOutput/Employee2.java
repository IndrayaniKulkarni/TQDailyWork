package com.objectInputOutput;

import java.io.Serializable;

public class Employee2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eId;
	private String eName;
	transient private float salary;
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int eId, String eName, float salary) {
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
