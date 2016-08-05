package com.alacriti.ecommerce.resources;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.alacriti.ecommerce.delegate.RegistrationDelegete;
import com.alacriti.ecommerce.vo.Registration;

@Path("/registration")
public class RegistrationResource {
	//RegisterValidate registerValidate = new RegisterValidate();
	//BinaryStream bs = new BinaryStream()
	
	@POST
	 @Consumes(MediaType.MULTIPART_FORM_DATA)  
	public String register(@FormParam("exampleInputFirstName") String firstName,
			@FormParam("exampleInputLastName") String lastName,
			@FormParam("exampleInputEmail") String emailId,
			@FormParam("exampleInputPassword") String password,
			@FormParam("exampleInputCity")String city,
			@FormParam("exampleInputPincode")int pincode,
			@FormParam("exampleInputMobileNumber")long mobileNumber
			/*@FormParam("image-holder") InputStream  image,
			@FormParam("fileUpload") String fileName*/
			) throws Exception{
		//System.out.println(image);
		
		/*String storingFileLocation = "/home/harishab/"+fileName;
		  try {  
	           	FileOutputStream   out = new FileOutputStream(new File(storingFileLocation));  
	               int read = 0;  
	               byte[] bytes = new byte[1024];  
	               out = new FileOutputStream(new File(storingFileLocation));  
	              // while ((read = image.read(bytes)) != -1) {  
	                   out.write(bytes, 0, read);  
	               }  
	               out.flush();  
	               out.close();  
	           } catch (IOException e) {e.printStackTrace();}  
	           String output = "File successfully uploaded to : " + storingFileLocation;  */
		
		//System.out.println(image);
		String str = null;
		Registration registration = new Registration(firstName, lastName, emailId, password, city, pincode, mobileNumber);
		try{	
			RegistrationDelegete delegate = new RegistrationDelegete(registration);
			str = delegate.registerPerson();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	       
	        
		
		
		
		
		return str;
	}
}
