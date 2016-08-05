package com.alacriti.ecommerce.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.alacriti.ecommerce.dao.LoginDatabase;
import com.alacriti.ecommerce.delegate.LoginDelegete;
import com.alacriti.ecommerce.utility.UserOpenFtl;

@Path("/login")
public class LoginResource{
	public static Map<String, Object> profileMap = new HashMap<String, Object>();
	LoginDatabase loginDatabase = new LoginDatabase();
	UserOpenFtl userProfile = new UserOpenFtl();
	
	@POST
	public String login(@FormParam("loginInputEmail") String emailId,
			@FormParam("loginInputPassword") String password) throws Exception{
		
			LoginDelegete delegate = new LoginDelegete(emailId, password);
			String str = delegate.loginUser();
				
			return str;
			
	}	 	
	
	@POST
	@Path("/addToCart")
	public void addToCart(){
		
	}
}
