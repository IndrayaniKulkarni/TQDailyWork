package com.jdbcConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	static Connection conn = null;
	Statement st;
	ResultSet rs;

	public FetchData() {
		conn = DBConnection.getConnection();
	}

	public void fetchCourseData() {
		try {
			st = conn.createStatement();
		//rs -cursor - situates before first row
			rs = st.executeQuery("SELECT * FROM course");
		    System.out.println("\t Courses available ");
		    System.out.println("--------------------------------------------------");
			while(rs.next()) {
				int cid = rs.getInt(1); 
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				float fees = rs.getInt(4);
				int scount = rs.getInt(5);
     		System.out.println(cid+" "+cname+" "+duration+" "+fees+" "+scount+"\n");
     		
			}
			System.out.println("--------------------------------------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

    public void fetchStudentData() {
    	try {
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM student");
    		System.out.println("\t Student list ");
    		System.out.println("--------------------------------------------------");
    		while(rs.next()) {
    			int id = rs.getInt("stid");
                String name = rs.getString("sname");
    		    String email = rs.getString("email"); 
    			long phoneNo = rs.getLong("phoneNo"); 
    			int cid = rs.getInt("courseId"); 
    			String fstatus = rs.getString("feestatus");
    			System.out.println(id+" "+name+" "+email+" "+phoneNo+" "+cid+" "+fstatus+"\n");
    		}
    		System.out.println("--------------------------------------------------");
    	}
    	catch(SQLException e) {
    		System.out.println(e);
    	}
    }
    public void fetchStudentDataById(int id) {
    	try {
    		st = conn.createStatement();
    		
    		rs = st.executeQuery("SELECT * FROM student WHERE stid = "+ id);
    		System.out.println("\t Student = ");
    		System.out.println("--------------------------------------------------");
    		//while(rs.next()) {
    		if(rs.next()) {
    			int i = rs.getInt("stid");
    		
                String name = rs.getString("sname");
    		    String email = rs.getString("email"); 
    			long phoneNo = rs.getLong("phoneNo"); 
    			int cid = rs.getInt("courseId"); 
    			String fstatus = rs.getString("feestatus");
    			System.out.println(i+" "+name+" "+email+" "+phoneNo+" "+cid+" "+fstatus+"\n");
    		}
    			//	}
    		System.out.println("--------------------------------------------------");
    	}
    	catch(SQLException e) {
    		System.out.println(e);
    	}
    }
    public void fetchFacultyData() {
    	try {
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM faculty");
    		System.out.println("\t Faculty list ");
    		System.out.println("--------------------------------------------------");
    		while(rs.next()) {
    		    int id = rs.getInt("facultyid");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
    		    String email = rs.getString("email"); 
    		    float salary = rs.getFloat("salary");
    		    int exper = rs.getInt("exp");
    		    Date joiningD = rs.getDate("joiningdate");
    			long phoneNo = rs.getLong("phoneNo"); 
    	
    			System.out.println(id+" "+fname+" "+lname+" "+email+" "+salary+" "+exper+" "+joiningD+" "+phoneNo+"\n");
    		}
    		System.out.println("--------------------------------------------------");
    	}
    	catch(SQLException e) {
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) {
		FetchData fd= new FetchData();
	     fd.fetchCourseData();
	     fd.fetchStudentData();
	     fd.fetchFacultyData();
	     
	     fd.fetchStudentDataById(4);
	}

}
