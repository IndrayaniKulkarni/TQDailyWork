package com.jdbcCallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionCallDemo {

	Statement st;
	ResultSet rs;
	CallableStatement cst;

	static Connection con;
	static Scanner sc = new Scanner(System.in);

	public FunctionCallDemo() throws SQLException {
		con = DBConnect2.getConnection();
		System.out.println("Connected...");
		st = con.createStatement();
	}

	public void callAddNum(int n1, int n2) {
		try {
			cst = con.prepareCall("{?= call addTwoNum(?,?)}");
			cst.setInt(2, n1);
			cst.setInt(3, n2);

			cst.registerOutParameter(1, Types.INTEGER);

			boolean status = cst.execute();
			if (!status) {
				System.out.println("The ans =" + cst.getInt(1));
			} else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {
   
		FunctionCallDemo fc = new FunctionCallDemo();
		fc.callAddNum(10, 20);
	}

}
