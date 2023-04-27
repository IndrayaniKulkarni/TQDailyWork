package com.jdbcCallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedureCallWithParam {
// stored procedure with in, out, inout parameters
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	static Connection con;
	static Scanner sc = new Scanner(System.in);

	public StoredProcedureCallWithParam() throws SQLException {
		con = DBConnect2.getConnection();
		System.out.println("Connected ..");
		st = con.createStatement();
	}

	public void callProcedureGetMaxDeptIdSalary(int dId) {
		try {
			cst = con.prepareCall("{ CALL getMaxDeptIdSalary(?,?)}");
		    cst.setInt(1, dId);
		    cst.registerOutParameter(2, Types.INTEGER);
			boolean status = cst.execute();
			if (!status) {
				//rs = cst.getResultSet();
				System.out.println("Dept Id | Max Salary ");
				System.out.println("---------------------------------");
				//while (rs.next()) {
					System.out.println(dId + "\t|\t" + cst.getFloat("maxSal"));
				//}
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {

		StoredProcedureCallWithParam st = new StoredProcedureCallWithParam();
		st.callProcedureGetMaxDeptIdSalary(30);
	}

}
