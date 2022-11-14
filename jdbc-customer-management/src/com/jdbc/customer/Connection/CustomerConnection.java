package com.jdbc.customer.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
	 
		try {
		// STEP 1 load the driver   
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc-customer-management";
		String userName="root";
		String password="deep@1081";
		
		//STEP 2 Create the connection 
		
		Connection connection=DriverManager.getConnection(url,userName,password);
		return connection;
		}
		catch(Exception e) {
		return null;
			
		}
		
		
		
		
		
		
		
		
	}

	
}
