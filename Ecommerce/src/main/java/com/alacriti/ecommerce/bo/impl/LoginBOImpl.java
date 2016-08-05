package com.alacriti.ecommerce.bo.impl;

import com.alacriti.ecommerce.bo.LoginBO;
import com.alacriti.ecommerce.dao.LoginDatabase;
import com.alacriti.ecommerce.utility.AdminOpenPage;
import com.alacriti.ecommerce.utility.UserOpenFtl;

public class LoginBOImpl implements LoginBO{
	public String loginUser(String emailId, String password){
		LoginDatabase loginDatabase = new LoginDatabase();
		String str = null;
		String ftlString = null;
		try {
			str = loginDatabase.login(emailId, password);
		} catch (Exception e) {
			//log.
		}
		UserOpenFtl userProfileFtl = new UserOpenFtl();
		AdminOpenPage adminOpenPage = new AdminOpenPage();
		if(str=="success"){
			try {
				if(loginDatabase.role==1){
					ftlString = userProfileFtl.products();
				}
				else if(loginDatabase.role==2){
					ftlString = adminOpenPage.products();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			ftlString = "Please register first!";
		}
		return ftlString;
	}
}
