package com.practice;

public class Author {

	private int id;
	private String name;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name) {
		super();
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
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return (id+name.hashCode());
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Author other = (Author) o;
		return ((id==other.id)&&(name.equals(other.name)));
	}
}
