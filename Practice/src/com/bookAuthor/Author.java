package com.bookAuthor;

public class Author {

	private int authorId;
	private String authorName;
	private String email;
	private int contactNo;
	
	Author(){
		
	}
	Author(int authorId, String authorName, String email, int contactNo){
		this.authorId = authorId;
		this.authorName = authorName;
		this.email = email;
		this.contactNo = contactNo;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public String toString() {
		return ("Author [ authorId = "+authorId+" , authorName = "+authorName+", email ="+email+" , contactNo = "+contactNo+" ]");
	}
	
}
