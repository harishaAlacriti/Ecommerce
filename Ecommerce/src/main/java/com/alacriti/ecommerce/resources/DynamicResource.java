package com.alacriti.ecommerce.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.alacriti.ecommerce.delegate.AddProductDelegete;
import com.alacriti.ecommerce.vo.ProductDetails;


@Path("/")
public class DynamicResource {
	
	

	@POST
	@Path("addproduct")
	public Response AddProduct(@FormParam("ProductCatogery") String catogery,
			@FormParam("ProductName") String productName,
			@FormParam("ProductPrice") double productPrice,
					@FormParam("QuantyOfProducts") int quantity,
					@FormParam("ProductDescription") String description) throws Exception {
		ProductDetails productDetails = new ProductDetails(catogery, productName, productPrice, quantity, description);
		AddProductDelegete add = new AddProductDelegete(productDetails);
		String str = add.addProduct();
		if(str=="success"){
			return Response.status(200).entity("Product is added successfully").build();
		}
		else{
			return Response.status(200).entity("Product is not added!  please try again").build();
		}
	}
	
	@GET
	@Path("editProduct")
	public Response openProductEditPage() throws URISyntaxException{
		URI uri = new URI("Http://localhost:8080/Ecommerce/EditProduct.html");
		return Response.temporaryRedirect(uri).build();
		
	}
	
	@GET
	@Path("productview")
	public Response productView() throws URISyntaxException{
		URI uri = new URI("http://localhost:8080/Ecommerce/productviewpage.html");
		return Response.temporaryRedirect(uri).build();
	}
	
	@GET
	@Path("registerHere")
	public Response registerHere() throws URISyntaxException{
		URI uri = new URI("http://localhost:8080/Ecommerce/registration.html");
		return Response.temporaryRedirect(uri).build();
	}
}
