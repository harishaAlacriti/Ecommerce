package com.alacriti.ecommerce.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alacriti.ecommerce.dao.PaginationDatabase;
import com.alacriti.ecommerce.vo.ProductDetails;

@Path("/Pagination")

public class PaginationResource {
	PaginationDatabase paginationDatabase = new PaginationDatabase();
	
	@GET
	@Path("/pages")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ProductDetails> paginationNext(@QueryParam("start") int start,
													@QueryParam("size") int size) throws ClassNotFoundException, SQLException{
		return paginationDatabase.paginationNext(start, size);
	}
	
	@GET
	@Path("/count")
	
	public String getCount() throws ClassNotFoundException, SQLException{
		return paginationDatabase.getRecordCount();
//		return 18+"";
	}
}
