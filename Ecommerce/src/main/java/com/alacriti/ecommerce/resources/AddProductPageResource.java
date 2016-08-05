package com.alacriti.ecommerce.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/addproductpage1")
public class AddProductPageResource {
	
	@GET
	
	public Response productView() throws URISyntaxException{
		URI uri = new URI("http://localhost:8080/Ecommerce/AddProduct.html");
		return Response.temporaryRedirect(uri).build();
	}
}
