package com.jdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class JDBCHashMap {

	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	static Connection con = null;
	
	// Key: item, val : price
	HashMap<String, Float> imap;
	
	public JDBCHashMap() throws SQLException {
		con = DBConnect.getConnection();
		st = con.createStatement();
		imap = new HashMap<>();
	}
	
	void createMap() {
		
		try {
			rs = st.executeQuery("SELECT * FROM item");
		    
					while(rs.next()) {
						imap.put(rs.getString("itemname"), rs.getFloat("cost"));
					}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	void displayMap() {
		System.out.println("ITEM      |     PRICE(RS)");
		System.out.println("--------------------------------");
		for(Map.Entry<String, Float> en: imap.entrySet()) {
			System.out.println(en.getKey()+ "        "+ en.getValue());
		}
	}
	public static void main(String[] args) throws SQLException{
		JDBCHashMap hm = new JDBCHashMap();
		hm.createMap();
		hm.displayMap();
	}

}
