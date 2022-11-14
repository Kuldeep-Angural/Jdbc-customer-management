package com.jdbc.customer.customer.Controller;

import java.security.Provider.Service;
import java.util.List;
import java.util.Scanner;

import com.jdbc.customer.Dto.Customer;
import com.jdbc.customer.Service.CustomerService;

public class CustomerController {

public static void main(String[] args) {
	
	Customer customer=new Customer();
	CustomerService customerService=new CustomerService();
	while(true) {
		System.out.println("");
		System.out.println("        Wel come to Customer Personal-Details  Management App      ");
		System.out.println("                           @tm SBI INDIA                  ");
		System.out.println("=====================================================================");
		Scanner input =new Scanner(System.in);
	System.out.println("Press 1 for insert data ");
	System.out.println("Press 2 for delete the data");
	System.out.println("Press 3 for update the data");
	System.out.println("Press 4 for display the data ");
	
	System.out.println("=====================================================================");
	
	int choose=input.nextInt();
	
	switch (choose) {
	case 1:
	{
		System.out.println("====================================");
		
		String nm=input.nextLine();
		
		System.out.println("Enter the Name of Customer");
		System.out.println("");
		System.out.println("");
		
		
		String naMe=input.nextLine();
		System.out.println("Enter the Phone No of customer ");
		String phone=input.nextLine();
		System.out.println("Enter the E-mail of customer");
		String emaiL=input.nextLine();
		System.out.println("Enter the Address Of customer");
		String addreSS=input.nextLine();
		System.out.println("Enter the ID of Customer");
		int iD=input.nextInt();
		
		System.out.println("..................................");
		
		
		customer.setId(iD);
		customer.setName(naMe);
		customer.setPhno(phone);
		customer.setEmail(emaiL);
		customer.setAddress(addreSS);
		customerService.insertCustomer(customer);
		
	
	}
	break;
	case 2:
	{
		System.out.println("enter the id of the"
				+ " customer which you want to delete");
		int nid=input.nextInt();
		
		customer.setId(nid);
		customerService.deleteCustomer(customer);
		
	}
	break;
	case 3:
		
	{
		System.out.println("Enter 1 to update Name");

		System.out.println("Enter 2 to update Phone No");
		System.out.println("Enter 3 to update Email");
		System.out.println("Enter 4 to update Address");
		int option=input.nextInt();
			switch (option) 
			{
			case 1:
			
			{
				System.out.println("enter the Id wher you want to change the name ");
				int id=input.nextInt();
				customer.setId(id);
				String n=input.nextLine();
				System.out.println("Enter new Name");
				String name=input.nextLine();
				customer.setName(name);
				customerService.updateCustomerName(customer);
				
				
				
			}
			
			break;
			case 2:
			{
				System.out.println("enter the Id wher you want to change the phnoe no ");	
				int id=input.nextInt();
				customer.setId(id);
				String n=input.nextLine();
				System.out.println("Enter new phoneNo");
				String phone=input.nextLine();
				customer.setPhno(phone);
				
				
				customerService.updateCustomerPhno(customer);
				
			}
			
			break;
			case 3:
			{
				System.out.println("enter the Id wher you want to change the E-mail ");	
				int id=input.nextInt();
				customer.setId(id);
				String n=input.nextLine();
				System.out.println("Enter new E-mail");
				String email=input.nextLine();
				customer.setEmail(email);
				
				
				customerService.updateCustomerEmail(customer);
				
			}
			
			
			
			break;
			case 4:
			{
				System.out.println("enter the Id wher you want to change the Address ");	
				int id=input.nextInt();
				customer.setId(id);
				String n=input.nextLine();
				System.out.println("Enter new Address");
				String addr=input.nextLine();
				customer.setAddress(addr);
				
				
				customerService.updateCustomerAddress(customer);
			}
			break;

			default:
			break;
			}
		
	}
	break;
	case 4:
	{
		List<Customer>customerr=customerService.displayCustomerr();
		System.out.println("This is the data Inside the customer Table ");
		for(Customer customer2:customerr)
		{
			
			System.out.println("ID        :    "+customer2.getId());
			System.out.println("name      :    "+customer2.getName());
			System.out.println("Phone no  :    "+customer2.getPhno());
			System.out.println("E-mail    :    "+customer2.getEmail());
			System.out.println("Address   :    "+customer2.getAddress());
			System.out.println("...................................");
			
		}
	}
	break;
	

	default:
	break;
}
	}
	
}
}

