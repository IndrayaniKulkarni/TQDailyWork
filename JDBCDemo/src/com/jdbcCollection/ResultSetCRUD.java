package com.jdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCRUD {

	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public ResultSetCRUD() throws SQLException {
		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("SELECT * FROM item");
	}

	public void getItemDetails() {
//		Columns:
//			itemid int PK 
//			itemname varchar(50) 
//			cost float 
//			supid int
		try {
			rs.beforeFirst(); // set rs cursor before first line
			System.out.println("itemid\titem\t\tcost\tsupId");
			while (rs.next()) {
				int itemId = rs.getInt("itemId");
				String item = rs.getString("itemname");
				float cost = rs.getFloat("cost");
				int supId = rs.getInt("supId");

				System.out.println(itemId + "\t" + item + " \t\t" + cost + "\t" + supId);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void updateItemPrice(int itemId) {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == itemId) {
					System.out.println(rs.getString(2) + "  OldPrice:" + rs.getFloat(3));
					System.out.println("New price =");
					float price = sc.nextFloat();
					rs.updateFloat(3, price);
					rs.updateRow();
				}
			}
			getItemDetails();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void deleteItem(int itemid) {
		try {
			rs.beforeFirst();

			while (rs.next()) {
				if (rs.getInt(1) == itemid) {
					rs.deleteRow();
				}

			}

			getItemDetails();

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
    public void insertItem() throws SQLException{

		rs.moveToInsertRow();
		System.out.println("Enter item id:");
		int id= sc.nextInt();
		System.out.println("Enter the item name:");
		String iname= sc.next();
		System.out.println("Enter cost:");
		float cost= sc.nextFloat();
		System.out.println("Enter supplier id :");
		int sid= sc.nextInt();
		
		rs.updateInt(1, id);
		rs.updateString(2, iname);
		rs.updateFloat(3, cost);
		rs.updateInt(4, sid);
		
		rs.insertRow();
		
		getItemDetails();
    }
	public static void main(String[] args) throws SQLException {

		ResultSetCRUD crud = new ResultSetCRUD();
		//crud.getItemDetails();
		//crud.updateItemPrice(40);
		//crud.deleteItem(60);
		
		crud.insertItem();
	}

}
