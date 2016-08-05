package com.alacriti.ecommerce.delegate;

import com.alacriti.ecommerce.bo.RegistrationBO;
import com.alacriti.ecommerce.bo.impl.RegistrationBOImpl;
import com.alacriti.ecommerce.vo.Registration;

public class RegistrationDelegete {

	private Registration registrationVO;
	
	
	public RegistrationDelegete(Registration registrationVO)
	{
		this.registrationVO = registrationVO;
	}
	
	public String registerPerson()
	{
		String str =null;
		RegistrationBO bo = new RegistrationBOImpl();
		str = bo.registerPerson(registrationVO);
		return str;
	}
}
