package com.jdbcCallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedureCall {

	Statement st;
	ResultSet rs;
	CallableStatement cst;

	static Connection con;
	static Scanner sc = new Scanner(System.in);

	public StoredProcedureCall() throws SQLException {
		con = DBConnect2.getConnection();
		System.out.println("Connected ..");
		st = con.createStatement();
	}

	public void callProcedureEmpCount() {
		try {
			cst = con.prepareCall("{ CALL getEmpCountDept()}");
			boolean status = cst.execute();
			if (status) {
				rs = cst.getResultSet();
				System.out.println("Dept Id | No. of  Employees");
				System.out.println("---------------------------------");
				while (rs.next()) {
					System.out.println(rs.getInt("department_id") + "\t|\t" + rs.getInt("COUNT(employee_id)"));
				}
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {

		StoredProcedureCall st = new StoredProcedureCall();
		st.callProcedureEmpCount();
	}

}
