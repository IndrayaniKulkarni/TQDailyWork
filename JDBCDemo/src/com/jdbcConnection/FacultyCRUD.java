package com.jdbcConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FacultyCRUD {

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	static SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd");
	

	public FacultyCRUD() {
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
		System.out.println("1. Add a Faculty");
		System.out.println("2. Delete a Faculty");
		System.out.println("3. Update a Faculty");
		System.out.println("4. View all the Faculties");
		System.out.println("5. View Faculty by id");
		System.out.println("6. Exit");
	}
	
	void fetchAllFacultys() {
		try {
			
			rs = st.executeQuery("SELECT * FROM faculty");
		    System.out.println("\t Facultys available ");
		    System.out.println("--------------------------------------------------");
			while(rs.next()) {
				int id = rs.getInt("facultyid"); 
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String emailId = rs.getString("email");
				float salary = rs.getFloat("salary");
				int exper = rs.getInt("exp");
				Date joiningDate = rs.getDate("joiningdate");
				long phoneno = rs.getLong("phoneno");
     		System.out.println(id+" "+fname+" "+lname+" "+emailId+" "+salary+" "+exper+" "+joiningDate+ " "+phoneno+"\n");
     		
			}
			System.out.println("--------------------------------------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

	boolean getFacultyById(int fid) {
		boolean status = false;
		try {
			pst = con.prepareStatement("SELECT * FROM faculty WHERE id = ?");
			pst.setInt(1, fid);
		    System.out.println("\t Facultys available ");
		    System.out.println("--------------------------------------------------");
			if(rs.next()){
				int id = rs.getInt("facultyid"); 
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String emailId = rs.getString("email");
				float salary = rs.getFloat("salary");
				int exper = rs.getInt("exp");
				Date joiningDate = rs.getDate("joiningdate"); //import sql date
				long phoneno = rs.getInt("phoneno");
     		System.out.println(id+" "+fname+" "+lname+" "+emailId+" "+salary+" "+exper+" "+joiningDate+ " "+phoneno+"\n");
     		
     		status = true;
			}
			System.out.println("--------------------------------------------------");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return status;
	}
	void deleteFacultyById(int id) {
		try {
			pst = con.prepareStatement("DELETE FROM faculty WHERE facultyid = ?");
			pst.setInt(1, id);
			int noOfRowsDeleted = pst.executeUpdate();
			if(noOfRowsDeleted>0) {
				System.out.println("Faculty "+id+" deleted ..");
			}
			else {
				System.out.println("Faculty not found..");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	void insertFaculty() throws ParseException {
		System.out.println("Faculty Id = ");
	    int fid = sc.nextInt();
	    
	    System.out.println("Faculty first name = ");
	    String fname = sc.next();
	    
	    System.out.println("Faculty last name = ");
	    String lname = sc.next();
	    
	    System.out.println("Faculty emailId = ");
	    String emailId = sc.next();
	    
	    System.out.println("Salary = ");
	    float salary = sc.nextFloat();
	    
	    System.out.println("Experience (in years) = ");
	    int exper = sc.nextInt();
	    
	    System.out.println("Joining date = ");
	    String jd = sc.next();
	    java.util.Date jDate = inputDate.parse(jd);
		java.sql.Date jDate2 = new java.sql.Date(jDate.getTime());
		System.out.println("Phoneno = ");
		long phoneno = sc.nextLong();
	   
	  try {  
	    pst = con.prepareStatement("INSERT INTO faculty VALUES (?,?,?,?,?,?,?,?)");
	    pst.setInt(1, fid);
	    pst.setString(2, fname);
	    pst.setString(3, lname);
	    pst.setString(4, emailId);
	    pst.setFloat(5, salary);
	    pst.setInt(6, exper);
	  
//		java.sql.Date sqlDate = new java.sql.Date(joiningDate);
	    pst.setDate(7,jDate2);
	    
	    pst.setLong(8, phoneno);
	    
	    int noOfRowsInserted = pst.executeUpdate();
	    if(noOfRowsInserted>0) {
	    	System.out.println("Faculty added successfully ..");
	    }
	    else {
	    	System.out.println("Error..");
	    }
	  }
	  catch(SQLException e) {
		  System.out.println(e);
	  }
	
	}
	void updateFacultyById(int id) {
		try {
			if(getFacultyById(id)) {
				System.out.println("Enter the new salary of this Faculty :");
				int salary = sc.nextInt();
				
				pst= con.prepareStatement("update faculty set salary=? where facultyid=?");
				pst.setInt(1, salary);
				pst.setInt(2, id);
				
				int noOfRowsUpdated= pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Faculty updated with new values:");
					getFacultyById(id);
				}
				else
				{
					System.out.println("error in data");
				}
			}
			else {
				System.out.println("Faculty doesn't exits..");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws ParseException {
	
		FacultyCRUD f = new FacultyCRUD();
		
		System.out.println("Faculty CRUD");
		int ch;
		int id ;
		do {
			f.menu();
			System.out.println("Choice = ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: f.insertFaculty();
					break;
			case 2: System.out.println("Id = ");
	                id = sc.nextInt();
	                f.deleteFacultyById(id);
	                break;
			case 3: System.out.println("Id = ");
                     id = sc.nextInt();
				     f.updateFacultyById(id);
				    break;
			case 4: f.fetchAllFacultys();
			        break;
			case 5: System.out.println("Id = ");
			        id = sc.nextInt();
			        if(!f.getFacultyById(id)){
			        	System.out.println("Faculty not found ...");
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
