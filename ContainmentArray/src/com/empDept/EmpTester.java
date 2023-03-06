package com.empDept;

public class EmpTester {

	public static void highestSalary(Employee emp[]) {
		
	  //Employee temp = new Employee();
		
		float max = Float.MIN_VALUE;
		
		for(int i=0; i<emp.length; i++) {
			if(emp[i].getSalary()>max) {
				max = emp[i].getSalary();
			}
		}
		System.out.println("Highest salary = "+max);
	}
	
	public static void sort(Employee emp[]) {
		
		Employee temp = new Employee();
		
		for(int i=0; i<emp.length; i++) {
			for(int j=i+1; j<emp.length; j++) {
				if(emp[i].getSalary()>emp[j].getSalary()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
	}
	public static void empDepartmemtwise(Employee e[], Department d[]) {
		int count=0;
		
		for(Department x:d) {
			System.out.println("Dept:"+x.getName());
			System.out.println("__________________");
			count=0;
			for(Employee y:e) {
				if(y.getDept().equals(x)) {
					count++;
					System.out.println(y.getName());
				}
				
			}System.out.println("__________________");
			System.out.println("Dept "+x.getName()+" number of employees = "+count);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
	}
	public static void print(Employee e[]) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Employee x:e) {
			System.out.println(x);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	public static void main(String[] args) {
	
		Department d[] =  new Department[4];
		d[0] = new Department(10,"Sales");
		d[1] = new Department(20,"R&D");
		d[2] = new Department(30,"Production");
		d[3] = new Department(40,"Marketing");
		
		
		Employee e[] = new Employee[10];
		
		e[0] = new Employee(101,"Jay",40000,d[0]);
		e[1] = new Employee(102,"Diana",50000,d[2]);
		e[2] = new Employee(103,"Henry",70000,d[3]);
		e[3] = new Employee(104,"Daisy",47000,d[1]);
		e[4] = new Employee(105,"Meenakshi",89000,d[2]);
		e[5] = new Employee(106,"Sakshi",60000,d[1]);
		e[6] = new Employee(107,"Jeena",70000,d[3]);
		e[7] = new Employee(108,"Neil",40000,d[2]);
		e[8] = new Employee(109,"Gregory",40000,d[3]);
		e[9] = new Employee(110,"William",40000,d[0]);
		
//		print(e);
//		highestSalary(e);
//		sort(e);
//		print(e);
		empDepartmemtwise(e,d);
	}

}
