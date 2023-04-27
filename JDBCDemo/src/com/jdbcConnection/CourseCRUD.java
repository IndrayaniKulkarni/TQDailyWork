package com.jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCRUD {

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	public CourseCRUD() {
		con = DBConnection.getConnection();
		System.out.println("Connected...");
	    try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}
	
	void menu() {
		System.out.println("1. Add a course");
		System.out.println("2. Delete a course");
		System.out.println("3. Update a course");
		System.out.println("4. View all the courses");
		System.out.println("5. View course by id");
		System.out.println("6. Exit");
	}
	
	void fetchAllCourses() {
		try {
			
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

	boolean getCourseById(int id) {
		boolean status = false;
		try {
			pst = con.prepareStatement("SELECT * FROM course WHERE id = ?");
			pst.setInt(1, id);
		    System.out.println("\t Courses available ");
		    System.out.println("--------------------------------------------------");
			if(rs.next()){
				int cid = rs.getInt(1); 
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				float fees = rs.getInt(4);
				int scount = rs.getInt(5);
     		System.out.println(cid+" "+cname+" "+duration+" "+fees+" "+scount+"\n");
     		status = true;
			}
			System.out.println("--------------------------------------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return status;
	}
	void deleteCourseById(int id) {
		try {
			pst = con.prepareStatement("DELETE FROM course WHERE courseid = ?");
			pst.setInt(1, id);
			int noOfRowsDeleted = pst.executeUpdate();
			if(noOfRowsDeleted>0) {
				System.out.println("Course "+id+" deleted ..");
			}
			else {
				System.out.println("Course not found..");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	void insertCourse() {
		System.out.println("Course Id = ");
	    int cid = sc.nextInt();
	    
	    System.out.println("Course name = ");
	    String cname = sc.next();
	    
	    System.out.println("Course duration (in terms of months) = ");
	    int duration = sc.nextInt();
	    
	    System.out.println("Fees = ");
	    float fees = sc.nextFloat();
	    
	    //while adding new course, no of students = 0
	  try {  
	    pst = con.prepareStatement("INSERT INTO course VALUES (?,?,?,?,?)");
	    pst.setInt(1, cid);
	    pst.setString(2, cname);
	    pst.setFloat(3,fees);
	    pst.setInt(4,duration);
	    pst.setInt(6, 0);
	    
	    int noOfRowsInserted = pst.executeUpdate();
	    if(noOfRowsInserted>0) {
	    	System.out.println("Course added successfully ..");
	    }
	    else {
	    	System.out.println("Error..");
	    }
	  }
	  catch(SQLException e) {
		  System.out.println(e);
	  }
	
	}
	void updateCourseById(int id) {
		try {
			if(getCourseById(id)) {
				System.out.println("Enter the new fees of this course :");
				int fees= sc.nextInt();
				
				pst= con.prepareStatement("update course set fees=? where courseid=?");
				pst.setInt(1, fees);
				pst.setInt(2, id);
				
				int noOfRowsUpdated= pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Course updated with new values:");
					getCourseById(id);
				}
				else
				{
					System.out.println("error in data");
				}
			}
			else {
				System.out.println("Course doesn't exits..");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	
		CourseCRUD c = new CourseCRUD();
		
		System.out.println("Course CRUD");
		int ch;
		int id ;
		do {
			c.menu();
			System.out.println("Choice = ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: c.insertCourse();
					break;
			case 2: System.out.println("Id = ");
	                id = sc.nextInt();
	                c.deleteCourseById(id);
	                break;
			case 3: System.out.println("Id = ");
                     id = sc.nextInt();
				     c.updateCourseById(id);
				    break;
			case 4: c.fetchAllCourses();
			        break;
			case 5: System.out.println("Id = ");
			        id = sc.nextInt();
			        if(!c.getCourseById(id)){
			        	System.out.println("Course not found ...");
			        }
				   break;
			case 6: System.out.println("-------------EXIT--------------");
					System.exit(0);
			        break;
			default:System.out.println("Error...");
			        break;
			}
			
			System.out.println("Do wish to continue (1-Yes, 0-No) = ");
			ch = sc.nextInt();
			
		}while(ch!=0);
	}

}
