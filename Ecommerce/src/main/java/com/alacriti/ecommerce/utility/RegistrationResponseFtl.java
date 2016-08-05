package com.alacriti.ecommerce.utility;

import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.alacriti.ecommerce.resources.LoginResource;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class RegistrationResponseFtl {
	public String loginPage() throws Exception{
		FtlConfiguration ftlConfiguration = new FtlConfiguration();
		Configuration configuration = ftlConfiguration.getConfiguration();
			
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
			Template tmp = configuration.getTemplate("login.ftl");
			
			Writer consoleWriter = new OutputStreamWriter(System.out);
			consoleWriter.toString();
			tmp.process(LoginResource.profileMap,consoleWriter);
		
			StringWriter stringWriter = new StringWriter();
	        tmp.process(LoginResource.profileMap, stringWriter);

	        return stringWriter.toString();
			
		}
	
}
