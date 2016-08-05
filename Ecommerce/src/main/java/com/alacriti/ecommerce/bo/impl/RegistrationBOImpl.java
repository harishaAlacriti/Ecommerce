package com.alacriti.ecommerce.bo.impl;


import javax.swing.JOptionPane;

import com.alacriti.ecommerce.bo.RegistrationBO;
import com.alacriti.ecommerce.dao.RegistrationDatabase;
import com.alacriti.ecommerce.utility.RegistrationResponseFtl;
import com.alacriti.ecommerce.vo.Registration;

public class RegistrationBOImpl implements RegistrationBO
{

	public String registerPerson(Registration registration) {
		RegistrationDatabase registationDatabase = new RegistrationDatabase();
		String str = null;
		String ftlString = null;
		try {
			str = registationDatabase.register(registration);
		} catch (Exception e) {
			//log.
		}
		RegistrationResponseFtl registrationResponseFtl = new RegistrationResponseFtl();
		if(str=="success"){
			try {
				ftlString = registrationResponseFtl.loginPage();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(str=="failure"){
			JOptionPane.showMessageDialog(null, "Login failed!");
		}
		return ftlString;
	}


}
