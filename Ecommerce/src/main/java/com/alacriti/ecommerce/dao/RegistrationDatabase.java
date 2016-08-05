package com.alacriti.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.alacriti.ecommerce.vo.Registration;


public class RegistrationDatabase extends DatabaseClass{
	
	
	public String register(Registration registration) throws Exception{
		int n=0;
		Connection con = getConnection();
		try{
		PreparedStatement ps=con.prepareStatement("insert into user_dtls_tbl(firstname, lastname, mailid, password, city, pincode, mobilenum, image) values(?,?,?,?,?,?,?,?)");  
		ps.setString(1, registration.getFirstName());
		ps.setString(2, registration.getLastName());
		ps.setString(3, registration.getEmailId());
		ps.setString(4, registration.getPassword());
		ps.setString(5, registration.getCity());
		ps.setInt(6, registration.getPincode());
		ps.setLong(7, registration.getMobileNumber());
		ps.setString(8, registration.getFileName());
		n = ps.executeUpdate();
		}catch(SQLException e){
			System.out.println(e);
		}finally{
			closeConnection(con);
		}
		if(n!=0)
			return "success";
		else
			return "failure";
	}
	
	
}
