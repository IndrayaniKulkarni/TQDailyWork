package com.empDept;

public class Department {

	private int id;
	private String name;
	
	Department(){
		
	}
	Department(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Department) {
//            Department other = (Department) obj;
//            return id == other.id && name.equals(other.name);
//        }
//        return false;
//    }
	public String toString() {
		return ("Department = "+id+" "+name);
	}
}
