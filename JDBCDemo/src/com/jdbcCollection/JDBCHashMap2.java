package com.jdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JDBCHashMap2 {

	Statement st;
	Statement st1;
	ResultSet rs;
	ResultSet rs1;
	PreparedStatement pst;
	
	static Connection con = null;
	
	// Key: supplier name and val: item name list
	HashMap<String, ArrayList<String>> smap;
	
	public JDBCHashMap2() throws SQLException {
		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		smap = new HashMap<>();
	}
	
	void createMap() {
		ArrayList<String> itemNames;
		String sname = null;
		
		try { 
			// 2 result set req for 2 queries
			rs = st.executeQuery("SELECT * From supplier");
			rs1 = st1.executeQuery("SELECT * From item");
			
			while(rs.next()) {
				sname = rs.getString("firstName");
				itemNames = new ArrayList<>();
				rs1.beforeFirst();  // Moves the cursor to the front ofthis ResultSet object, just before thefirst row.
				// iterate through item table for items supplied by supid
				while(rs1.next()) {
					if(rs.getInt("supId")==rs1.getInt("supId")) {
						itemNames.add(rs1.getString("itemName"));
					}
				}
				smap.put(sname, itemNames);
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	void displayMap() {
		
		System.out.println("--------------------------------");
		for(Map.Entry<String, ArrayList<String>> en: smap.entrySet()) {
			System.out.println("Supplier  : "+en.getKey());
			System.out.println("Items supplied : ");
			
			for(String it: en.getValue()) {
				System.out.print(it+" ");
			}
			System.out.println();
			System.out.println("--------------------------------");
		}
	}
	public static void main(String[] args) throws SQLException{
		JDBCHashMap2 hm = new JDBCHashMap2();
		hm.createMap();
		hm.displayMap();
	}

}
