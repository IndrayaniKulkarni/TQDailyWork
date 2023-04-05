package com.linkedHashMap;

public class Department {

	private int id;
	private String dname;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + "]";
	}
	
	@Override
	public int hashCode() {
		return (id+dname.hashCode());
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Department other = (Department) o;
		return ((id==other.id) && (dname.equals(other.dname)));
	}
}
