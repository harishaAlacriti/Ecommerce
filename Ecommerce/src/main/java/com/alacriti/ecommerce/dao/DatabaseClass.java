package com.alacriti.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseClass {
	//final static Logger logger = Logger.getLogger(LoginResource.class);
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/ecommerce_dev", "ecommerce_dev", "ecommerce_dev");
		return con;
		
	}
	
	public void closeConnection(Connection conn)
	{
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				//logger.error("error in closing");
			}
	}
	
	public void commit(Connection conn)
	{
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				//logger.error("error in closing");
			}
	}
}
