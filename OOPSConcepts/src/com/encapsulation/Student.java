package com.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private float marks;
	
	//this object -current object
	//set - set values  -- called as mutators
	public void setId(int id)
	{
		this.id = id;//to avoid confusion of local var and object -data mem
	}
	
	//getter - accessors
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setMarks(float marks)
	{
		this.marks = marks;
	}
	public float getMarks()
	{
		return marks;
	}
	
	
}
