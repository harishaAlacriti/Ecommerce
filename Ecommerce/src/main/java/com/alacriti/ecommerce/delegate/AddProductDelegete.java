package com.alacriti.ecommerce.delegate;

import com.alacriti.ecommerce.bo.impl.AddProductBOImpl;
import com.alacriti.ecommerce.vo.ProductDetails;

public class AddProductDelegete {
	private ProductDetails prodctDetails;

	public AddProductDelegete(ProductDetails prodctDetails) {
		this.prodctDetails = prodctDetails;
	}
	
	public String addProduct() throws Exception{
		AddProductBOImpl addProductBOImpl = new AddProductBOImpl();
		String str = addProductBOImpl.addProduct(prodctDetails);
		
		return str;
	}
	
	
}
