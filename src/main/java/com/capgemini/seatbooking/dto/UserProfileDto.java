package com.capgemini.seatbooking.dto;

public class UserProfileDto {
	private String email;
	
	private String newpassword;
	
	public UserProfileDto()
	{
	
	}
	 public UserProfileDto(String email, String newpassword) {
		super();
		this.email = email;
		this.newpassword = newpassword;
	}
	
	 public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	@Override
	public String toString() {
		return "UserProfileDto [email=" + email + ", newpassword=" + newpassword + "]";
	}
	
}
