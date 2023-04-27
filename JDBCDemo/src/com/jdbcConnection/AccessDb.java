package com.jdbcConnection;

import java.sql.Connection;

public class AccessDb {

	static Connection conn = null;
	
	public AccessDb() {
		conn = DBConnection.getConnection();
		System.out.println("Connected ...");
	}
	public static void main(String[] args) {
		
		AccessDb obj = new AccessDb();
	}

}
