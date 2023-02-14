package com.staticDemo;

public class Employee {

	private int empId;
	private String empName;
	static private String companyName;
	static private int count=0;
	
	//instance block - for hit counter
	{
		count++;
	}
	
	static {
		companyName = "HCL";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	
    public void display()
    {
    	System.out.println("("+empId+", "+empName+", "+companyName+")");
    }
	public static void main(String[] args) {
	
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		obj1.setEmpId(4123);
		obj1.setEmpName("Gary");
		obj1.display();
		obj2.setEmpId(4023);
		obj2.setEmpName("Ginny");
		obj2.display();
		//changed once reflected for every obj
		Employee.setCompanyName("Infosys");
		obj1.display();
		obj2.display();
		System.out.println("\n\nNumber of employees = "+count);
		
		Employee obj3 = new Employee();
		obj3.setEmpId(4123);
		obj3.setEmpName("Gary");
		obj3.display();
		System.out.println("\n\nNumber of employees = "+count);

	}

}
