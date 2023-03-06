package com.hierarchicalExample;

public class Landline extends Phone{

	private String connection;
	private String area;
	
	Landline(){
		
	}
	Landline(int id, long phoneNo, float bill, String connection, String area){
		super(id, phoneNo, bill);
		this.setConnection(connection);
		this.setArea(area);
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
