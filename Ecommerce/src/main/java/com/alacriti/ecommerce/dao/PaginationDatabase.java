package com.alacriti.ecommerce.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.alacriti.ecommerce.vo.ProductDetails;



public class PaginationDatabase extends DatabaseClass{
	
	public ArrayList<ProductDetails> paginationNext(int start, int size) throws ClassNotFoundException, SQLException{
		Connection con = getConnection();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ArrayList<ProductDetails> list = new ArrayList<ProductDetails>();
		String q1 = "select * from prod_dtls_tbl limit "+start+", "+size;
		ResultSet set = st.executeQuery(q1);
		while(set.next()){
			System.out.println(set.getString(2));
			ProductDetails productDetails = new ProductDetails(set.getInt(1),set.getString(2), set.getInt(4),set.getDouble(5), set.getString(6), set.getString(7));
			list.add(productDetails);
		}
		
		closeConnection(con);
		return list;
	}

	public String getRecordCount() throws SQLException, ClassNotFoundException{
		Connection con = getConnection();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
//		PaginationDatabase paginationDatabase = new PaginationDatabase();
//		ArrayList<ProductDetails> list = new ArrayList<ProductDetails>();
		String q1="select count(*) from prod_dtls_tbl";
		ResultSet set1 = st.executeQuery(q1);
		set1.next();
		int count = set1.getInt(1);
		set1.close();
		
//		String q2="select * from prod_dtls_tbl limit 0, 3";
//		ResultSet set2 = st.executeQuery(q2);
//		while(set2.next()){
//			ProductDetails productDetails = new ProductDetails(set2.getInt(1),set2.getString(2), set2.getInt(4),set2.getDouble(5), set2.getString(6), set2.getString(7));
//			list.add(productDetails);
//		}
		closeConnection(con);
		return count+"";
	}
	
	
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PaginationDatabase ps = new PaginationDatabase();
		
		System.out.println(ps.pagination());
	}*/
}
