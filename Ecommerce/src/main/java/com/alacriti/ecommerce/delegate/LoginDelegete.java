package com.alacriti.ecommerce.delegate;

import com.alacriti.ecommerce.bo.LoginBO;
import com.alacriti.ecommerce.bo.impl.LoginBOImpl;

public class LoginDelegete {
	private String emailId;
	private String password;
	public LoginDelegete(String emailId, String password)
	{
		this.emailId = emailId;

		this.password = password;
	}
	
	public String loginUser()
	{
		String str =null;
		LoginBO bo = (LoginBO) new LoginBOImpl();
		str = bo.loginUser(emailId, password);
		return str;
	}
}
