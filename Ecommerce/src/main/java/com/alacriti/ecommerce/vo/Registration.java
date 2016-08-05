package com.alacriti.ecommerce.vo;

import java.io.InputStream;

public class Registration {
	private int userId;
	private String firstName;
	private String lastName;
	private String emailId;

	private String password;
	private String city;
	private int pincode;
	private long mobileNumber;
	private InputStream fileData;
	private String fileName;
	 
	  
	public Registration() {
		super();
	}

	public Registration(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public Registration(String firstName, String lastName, String emailId,
			String password, String city, int pincode, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.city = city;
		this.pincode = pincode;
		this.mobileNumber = mobileNumber;
	
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public InputStream getFileData() {
		return fileData;
	}

	public void setFileData(InputStream fileData) {
		this.fileData = fileData;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
