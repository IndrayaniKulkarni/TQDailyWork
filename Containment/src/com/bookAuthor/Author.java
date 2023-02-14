package com.bookAuthor;

public class Author {
	
	private int authorId;
	private String name;
	private int age;
	
	//constructor initialises the obj.
	Author(){
		//default
	}
	
	Author(int authorId, String name, int age){
		this.authorId = authorId;
		this.name = name;
		this.age = age;
	}
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getAuthorId() {
		return authorId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
    public String toString() {
    	return ("Author {"+authorId+" , "+name+" , "+age+" }");
    }
	
}
