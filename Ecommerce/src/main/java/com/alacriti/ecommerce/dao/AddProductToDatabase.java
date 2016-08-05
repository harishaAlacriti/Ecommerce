package com.alacriti.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alacriti.ecommerce.vo.ProductDetails;

public class AddProductToDatabase extends DatabaseClass{
	public String addProduct(ProductDetails productDetails) throws Exception{
		Connection con = getConnection();
		int n = 0;
		
		try{
		Statement st = con.createStatement();
		String q1 = "select catgid into @catg from catg_tbl where catg='"+productDetails.getCategory()+"'";
		st.executeQuery(q1);
		String q2 = "select @catg";
		ResultSet s = st.executeQuery(q2);
		s.next();
		
		//System.out.println("catgid is: "+cat);
		/*ResultSet set = st.executeQuery(q1);
		
		if(set.next()){
			cat = set.getInt(1);
		}*/
		
		PreparedStatement ps = con.prepareStatement("insert into prod_dtls_tbl(name, catg, quantity, unitprice, description) values(?, ?, ?, ?, ?)");
		ps.setString(1, productDetails.getProductName());
		ps.setInt(2, s.getInt(1));
		ps.setInt(3,  productDetails.getQuantity());
		ps.setDouble(4, productDetails.getProductPrice());
		ps.setString(5, productDetails.getDescription());
		n = ps.executeUpdate();
		
		}catch(SQLException e){
			System.out.println(e);
		}finally{
			closeConnection(con);
		}
		if(n!=0)
			return "success";
		else
			return "failure";
	}
}
