package com.alacriti.ecommerce.utility;

import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.alacriti.ecommerce.resources.LoginResource;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class AdminOpenPage {
	public String products() throws Exception{
		Writer consoleWriter = new OutputStreamWriter(System.out);
		StringWriter stringWriter = new StringWriter();
		try{
		FtlConfiguration ftlConfiguration = new FtlConfiguration();
		Configuration configuration = ftlConfiguration.getConfiguration();
		
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		Template tmp = configuration.getTemplate("AdminProductspage.ftl");
		
		
		consoleWriter.toString();
		tmp.process(LoginResource.profileMap,consoleWriter);
	
        tmp.process(LoginResource.profileMap, stringWriter);
        }catch(Exception e){
        	throw new Exception(e);
        }

        return stringWriter.toString();
		
	}
}
