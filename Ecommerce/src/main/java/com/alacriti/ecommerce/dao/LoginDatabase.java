package com.alacriti.ecommerce.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.alacriti.ecommerce.resources.LoginResource;
import com.alacriti.ecommerce.vo.Registration;

public class LoginDatabase extends DatabaseClass{
	public static boolean result;
	public int role;
	//final static Logger logger = Logger.getLogger(LoginResource.class);
	public String login(String emailId, String password) throws Exception{
		System.out.println("this is loginDB method");
		DatabaseClass databaseClass = new DatabaseClass();
		Connection con = databaseClass.getConnection();
		Statement st = con.createStatement();
		
		Registration profile = new Registration();
		ArrayList<Registration> profileList = new ArrayList<Registration>();
	
		String q1 = "select * from user_dtls_tbl where mailid='"+emailId+"' and password='"+password+"'";
		ResultSet set= st.executeQuery(q1);
		if(set.next()){
				System.out.println("record found");
				profile.setUserId(set.getInt(1));
				profile.setFirstName(set.getString(2));
				//logger.info("This is to inform that firstName is:"+set.getString(1));
				profile.setLastName(set.getString(3));
				//logger.info("This is to inform that lastName is:"+set.getString(2));
				profile.setEmailId(set.getString(4));
				//logger.info("This is to inform that email is:"+set.getString(3));	
				profile.setCity(set.getString(7));
				profile.setPincode(set.getInt(8));
				profile.setMobileNumber(set.getLong(6));
				profileList.add(profile);
				LoginResource.profileMap.put("profileMap", profileList);
				System.out.println("successfully added");
				role=set.getInt(12);
				String q2="insert into login_dtls_tbl(userid) values("+set.getInt(1)+")";
				st.executeUpdate(q2);
				set.close();
				return "success";
			}
			else{
				set.close();
				closeConnection(con);
				//JOptionPane.showMessageDialog(null, "Login failed!");
				return "failure";
			}
		
	
		
	}
}
