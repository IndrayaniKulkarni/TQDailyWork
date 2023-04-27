package com.jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseResultSetCRUD {

	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	
	CourseResultSetCRUD() throws SQLException{
		con = DBConnection.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("SELECT * FROM course");
	}
	void getCourses() throws SQLException{
		
		rs.beforeFirst();
		System.out.println("CourseId\tCourseName\tFees\tDuration\tStudentCount");
		while(rs.next()) {
			int cid = rs.getInt(1); 
			String cname = rs.getString(2);
			float fees = rs.getFloat(3);
			int duration = rs.getInt(4);
			int scount = rs.getInt(5);
 		System.out.println(cid+"\t\t"+cname+"\t\t"+fees+"\t"+duration+"\t"+scount+"\n");
		}
	}
	void updateCourseFees(int id) throws SQLException{
		rs.beforeFirst();
		while(rs.next()) {
			if(id==rs.getInt(1)) {
				System.out.println("Current course fees = "+rs.getFloat(3));
				System.out.println("New Course fees = ");
				float fees = sc.nextFloat();
				rs.updateFloat(3,fees);
				rs.updateRow();
			}
		}
		getCourses();
	}
	
	void deleteCourse(int id) throws SQLException{
		rs.beforeFirst();
		while(rs.next()) {
			if(id==rs.getInt(1)) {
				rs.deleteRow();
			}
		}
		getCourses();
	}
	 public void insertCourse() throws SQLException{

			rs.moveToInsertRow();
			System.out.println("Course id = ");
			int id= sc.nextInt();
			System.out.println("Course = ");
			String cname= sc.next();
			System.out.println("Fees = ");
			float fees= sc.nextFloat();
			System.out.println("Duration (in months) = ");
			int duration= sc.nextInt();
			int scount =0;
			
			rs.updateInt(1, id);
			rs.updateString(2, cname);
			rs.updateFloat(3, fees);
			rs.updateInt(4, duration);
			rs.updateInt(5, scount);
			rs.insertRow();
			
			getCourses();
	    }
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		CourseResultSetCRUD cr = new CourseResultSetCRUD();
		cr.getCourses();
		System.out.println("-------------------------------");
		//cr.updateCourseFees(102);
		//cr.deleteCourse(105);
		cr.insertCourse();
	}

}
