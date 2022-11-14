package com.jdbc.customer.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.customer.Connection.CustomerConnection;
import com.jdbc.customer.Dto.Customer;

public class CustomerDao {
	Connection connection=null;
	
				//Method used to insert data into  customer table 
	public void insertCustomer(Customer customer)
	{
		
			
			
			try {
				connection=CustomerConnection.getConnection();
				//STEP 3 Create Statement
				Statement statement=connection.createStatement();
				String insert=" INSERT INTO coustomer VALUES("+customer.getId()+",'"+customer.getName()+"','"+customer.getPhno()+"','"+customer.getEmail()+"','"+customer.getAddress()+"')";
				
				//Step 4 Execute the query
				
				statement.execute(insert);
				System.out.println("data enter ....");
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	
	                 //Method used to  data into  customer table 
	public void deleteCustomer(Customer customer)
	{
		
	try {
		connection =CustomerConnection.getConnection();
		 Statement statement=connection.createStatement();
		 String delete="DELETE from coustomer WHERE id="+customer.getId()+"";
		 statement.executeUpdate(delete);
		 System.out.println("data deleted ....");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
					////Method used to Update data into  customer table 
	public void updateCustomerName(Customer customer)
	{ 
	try {
		
		connection= CustomerConnection.getConnection();
		
		Statement statement=connection.createStatement();
		
		String update="UPDATE  coustomer set name='"+customer.getName()+"' Where id="+customer.getId()+"";
		
		
		
		statement.executeUpdate(update);
		
		System.out.println("Data Update......");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
	
	public void updateCustomerPhno(Customer customer)
	{ 
	try {
		
		connection= CustomerConnection.getConnection();
		
		Statement statement=connection.createStatement();
		
		String update="UPDATE  coustomer set phone='"+customer.getPhno()+"' Where id="+customer.getId()+"";
		
		
		
		statement.executeUpdate(update);
		
		System.out.println("Data Update......");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
	
	public void updateCustomerEmail(Customer customer)
	{ 
	try {
		
		connection= CustomerConnection.getConnection();
		
		Statement statement=connection.createStatement();
		
		String update="UPDATE  coustomer set email='"+customer.getEmail()+"' Where id="+customer.getId()+"";
		
		
		
		statement.executeUpdate(update);
		
		System.out.println("Data Update......");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
	
	
	public void updateCustomerAddress(Customer customer)
	{ 
	try {
		
		connection= CustomerConnection.getConnection();
		
		Statement statement=connection.createStatement();
		
		String update="UPDATE  coustomer set address='"+customer.getAddress()+"' Where id="+customer.getId()+"";
		
		
		
		statement.executeUpdate(update);
		
		System.out.println("Data Update......");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
	
						//Method used to Display data from  customer table 
	
	
	
	
	
	public List<Customer> displayCustomerr() 
	{
	try {
		connection=CustomerConnection.getConnection();
		
		Statement statement=connection.createStatement();
		String select="SELECT* FROM coustomer";
		
		
		ResultSet resultSet=statement.executeQuery(select);
		List<Customer>customerr=new ArrayList<Customer>();
		while(resultSet.next())
		{
			Customer customer=new Customer();

			customer.setId(resultSet.getInt("id"));
			customer.setName(resultSet.getString("name"));
			customer.setPhno(resultSet.getString("phone"));
			customer.setEmail(resultSet.getString("email"));
			customer.setAddress(resultSet.getString("address"));
			customerr.add(customer);
			
		}
		return customerr;
		
		
	}
	catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return null;	
	
	
}
	


}
