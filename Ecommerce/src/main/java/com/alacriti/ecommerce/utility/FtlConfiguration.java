package com.alacriti.ecommerce.utility;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

public class FtlConfiguration {
	public Configuration getConfiguration()throws IOException{
		Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(FtlConfiguration.class, "/");
		
		//cfg.setIncompatibleImprovements(new Version(2, 3, 16));
		cfg.setDirectoryForTemplateLoading(new File("/home/harishab/workspaceLuna/Ecommerce/src/main/webapp/ftl/"));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setLocale(Locale.US);
	
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		return cfg;
	}
}
