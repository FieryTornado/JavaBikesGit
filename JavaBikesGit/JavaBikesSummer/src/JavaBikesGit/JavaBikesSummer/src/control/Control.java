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
	CustomerView custView = new CustomerView();
	
	private ArrayList<Customer>customerArrayList = new ArrayList<Customer>();
	//private ArrayList<Product>ProductList = new Product();
	

	public void printCreateCustomer() 
	{
		System.out.println("\nEnter 1 to create an account with Java Bikes.");
	}

	// Method to create customer
	public void CreateCustomer() 
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
			
		System.out.println("Congratulations! You have created an account with Java Bikes");
		cust.writeToFile(details);;
	}
	
	public void LoginMenu() 
	{
		do
		{
			try
			{
		int selectLoginMenu = input.nextInt();
		switch(selectLoginMenu)
		{
		case 1:
		Login();
		break;
			
		case 2:
			System.exit(0);
			break;
			default:
				break;
		}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Choose a number from 1 to 3");
				input.next();
				break;
			}
		}
		while (true);		
	}

	public void Login() 
	{
		String username;
		String password;
		
		int attempt = 0;
		if (attempt == 2)
		{
			System.out.println("You have exceeded the number of login attemps. Please ty again later");
			System.exit(0);
		}
		boolean loggedIn = false;
		do		
		{
			attempt++;
			System.out.println("Please enter your username");
			username = input.next();
		
			System.out.println("Please enter your password");
			password = input.next();
			
			for(int i = 0; i<customerArrayList.size() && !loggedIn; i++)
			{
				if(username.equals(customerArrayList.get(i).getUsername()) &&password.equals(customerArrayList.get(i).getPassword()))
				{
					System.out.println("You have logged in. Welcome" + username + ".");
					loggedIn = true;
				}
			}
			if(!loggedIn)
			{
				System.out.println("Wrong username or password: Please try again");
			}
		}
		while (attempt < 3 && !loggedIn);
		custView.customerMenu();
}

public void BrowseBikes() 
 {
 
		// TODO Auto-generated method stub
		//for (int i = 0; i <ProductList.size(); i++)
		//{
		//	System.out.println(ProductList.get(i));
		//}
		
	}
}