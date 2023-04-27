package com.jdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollable {

	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	static Connection con = null;
	
	public ResultSetScrollable() throws SQLException{
		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("SELECT * FROM item");
		
	}
	void getItemDetails() {
		try {
			System.out.println("-------Forward--------");
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getFloat(3)+" "+rs.getInt(4));
			}
			System.out.println("-----------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	void getItemDetails2() {
		try {
			System.out.println("-------Backward--------");
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getFloat(3)+" "+rs.getInt(4));
			}
			System.out.println("-----------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws SQLException {

		   ResultSetScrollable obj= new ResultSetScrollable();
		   obj.getItemDetails();
		   obj.getItemDetails2();
		   
	}
}
