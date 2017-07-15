package control;

import java.io.*;
import java.util.*;
import model.*;
import view.*;

public class Control 
{
	Scanner input = new Scanner(System.in);
	String details;
	Customer cust = new Customer();
	
	private ArrayList<Product>ProductList = new Product();
	

	public void printCreateCustomer() 
	{
		System.out.println("\nEnter 1 to create an account with Java Bikes.");
	}

	// Method to create customer
	public Customer CreateCustomer() 
	{
		//Using a do while loop so it repeats until criteria is fulfilled
		do
		{
		System.out.println("Please enter your first name");
		details = input.nextLine();
		
		if(details.matches("[a-zA-Z]+"))
		{
			cust.setFirstName(details);	
		}
		else
		{
			System.out.println("Please use English letters");
			details = null;
		}
		}
		while (details == null);
		
		do
		{
		System.out.println("Please enter your last name");
		details = input.nextLine();
		
		if(details.matches("[a-zA-Z]+"))
		{
			cust.setLastName(details);
		}
		else
		{
			System.out.println("Please use English letters");
			details = null;
		}
	}
	while (details == null);
		
		
		
		
		System.out.println("Please enter a username");
		if(details.matches("^[a-zA-Z0-9_.-]{5,}$"))
		cust.setUsername(input.nextLine());
		
		
		System.out.println("Please enter a password");
		cust.setPassword(input.nextLine());
		// add to database via ctrl
		
		System.out.println("Congratulations! You have created an account with Java Bikes");
		return cust;
	}


	public Customer Login() 
	{
		String username;
		String password;
		
		int attempt = 0;
		if (attempt == 2)
		{
			System.out.println("You have exceeded the number of login attemps. Please ty again later");
			System.exit(0);
		}
		
		{
			System.out.println("Please enter your username");
			username = input.next();
		
			System.out.println("Please enter your password");
			password = input.next();
			
			// check in the database
			// login success do smth\
			// login fail do smth else
			// update loggedIn state to true;
		}
		return null;				

}

	public void BrowseBikes() {
		// TODO Auto-generated method stub
		for (int i = 0; i <ProductList.size(); i++)
		{
			System.out.println(ProductList.get(i));
		}
		
	}

}