package com.jdbcCollection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/productdb";
	public static final String USER = "root";
	public static final String PASS = "root";
	
	static Connection con = null;
	public static Connection getConnection() {
		
		try {//STEP 1 : loading the class
		 Class.forName(JDBC_DRIVER);
		 System.out.println("Driver loaded");
		 // Establish connection
		 con = DriverManager.getConnection(JDBC_URL,USER,PASS);
		// System.out.println("Connected...");
		}
		catch(Exception e) {
			System.out.println("Exception occured :"+e);
		}
		return con;
	}
}
