package com.jdbcjoins;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JoinQueryProductDb {
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public JoinQueryProductDb() throws SQLException {

        con= DBConnect.getConnection();
        st= con.createStatement();
        
	}

	public void getItemsBySupplier2(String fname) {

		String sql = "select i.* from item i join supplier s on i.supid= s.supid and s.firstName='" + fname + "'";

		try {
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("itemName") + "   " + rs.getFloat("cost"));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void getItemsBySupplier(String fname) {

		String sql = "select i.* from item i join supplier s on i.supid= s.supid and s.firstName=?";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, fname);

			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("itemName") + "   " + rs.getFloat("cost"));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void getSuppliersByItem(String iname) {

		String sql = " SELECT s.supid, s.firstName, s.phoneNo FROM supplier s JOIN item i ON s.supid = i.supid  AND i.itemname = ?";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, iname);
			
			rs = pst.executeQuery();
			System.out.println("Id"+"  "+"SupplierName"+" "+"SupplierContact");
			while (rs.next()) {
				System.out.println(rs.getInt("supid")+" "+rs.getString("firstname")+" "+rs.getString("lastname") + "   " + rs.getLong("phoneNo"));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) throws SQLException {
		JoinQueryProductDb js = new JoinQueryProductDb();

		System.out.println("Enter the supplier name:");
		String name = sc.next();

		js.getItemsBySupplier2(name);

		System.out.println("--------------");
		
		System.out.println("Enter the item name:");
		String item = sc.next();
		js.getSuppliersByItem(item);
		
	}

}
