package com.alacriti.ecommerce.bo.impl;

import com.alacriti.ecommerce.dao.AddProductToDatabase;
import com.alacriti.ecommerce.vo.ProductDetails;

public class AddProductBOImpl {
	public String addProduct(ProductDetails prodctDetails) throws Exception{
		AddProductToDatabase addDB = new AddProductToDatabase();
		String str = addDB.addProduct(prodctDetails);
	
		return str;
	}
}
