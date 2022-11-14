package com.jdbc.customer.Service;

import java.util.List;

import com.jdbc.customer.Dao.CustomerDao;
import com.jdbc.customer.Dto.Customer;

public class CustomerService {
	CustomerDao dao=new CustomerDao();
	public void insertCustomer(Customer customer)
	{
		dao.insertCustomer(customer);	
	}
	
	
	
	public void deleteCustomer(Customer customer)
	{
		dao.deleteCustomer(customer);
	}
	
	
	
	public void updateCustomerName(Customer customer)
	{
		dao.updateCustomerName(customer);
	}
	public void updateCustomerAddress(Customer customer)
	{
		dao.updateCustomerAddress(customer);
	}
	public void updateCustomerPhno(Customer customer)
	{
		dao.updateCustomerPhno(customer);
	}
	public void updateCustomerEmail(Customer customer)
	{
		dao.updateCustomerEmail(customer);
	}
	
	
	
	public List<Customer> displayCustomerr(){
		return dao.displayCustomerr();
	}
	

}
