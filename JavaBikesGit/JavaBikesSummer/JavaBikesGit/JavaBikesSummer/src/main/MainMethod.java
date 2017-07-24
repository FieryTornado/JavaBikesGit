package main;

import java.io.IOException;
import java.util.*;

import control.*;
import model.Customer;

public class MainMethod 
{
	
	static Scanner input = new Scanner(System.in);
	static Control ctrl = new Control();
	static ProductCtrl productCtrl = new ProductCtrl();
	static String details;
	
	static Customer cust = new Customer();
	
	public static void main(String[] args) throws IOException 
	{		
		// print information "welcome screen"
		printwelcomeMenu();
		{}
	
	do
	{
		try
		{
		int selectwelcomeMenu = input.nextInt();
		switch(selectwelcomeMenu)
		{
		case 1:
			// create customer
			Customer customer = new Customer();
			customer = ctrl.CreateCustomer();
			String details = customer.getFirstName() + ";" + customer.getLastName()
			+ ";" + customer.getUsername() + ";" + customer.getPassword() + ";";
			
			ctrl.writeToFile(details);
			ctrl.loadDB();
			loginMenu();
			break;		
			
		case 2:
			// login
			ctrl.customerLogin();
			break;
		case 3:
			// login
			ctrl.Admin();
			break;
			
		case 4:
			//browse bikes
			productCtrl.AvailableBikes();
			break;
		case 5:
			// exit
			System.exit(0);
			break;
			default:
				break;
		}
	}
		catch (InputMismatchException e)
		{
			System.out.println("\nChoose a number from 1 to 4: ");
			input.nextLine();
			break;
	}		
	}
	while (true);
}

	private static void printwelcomeMenu() 
	{		
			System.out.println("Welcome to Java Bikes: Choose a number from 1 to 4 to begin");
			System.out.println("\n|1| Create an account" );
			System.out.println("|2| Customer Login" );
			System.out.println("|3| Admin Login" );
			System.out.println("|4| Browse bikes" );
			System.out.println("|5| End Session" );			
	}
	
	private static void loginMenu() 
	{		
		printloginMenu();
		
		do
		{
			try
			{
				int selectloginMenu = input.nextInt();
				switch(selectloginMenu)
				{
				case 1:
					ctrl.customerLogin();
					loginMenu();
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
				System.out.println("\nChoose a number from 1 to 3");
				input.next();
				break;
			}
		}
		while (true);		
	}

	private static void printloginMenu() 
	{
		System.out.println("\nChoose one of the following numbers to continue");
		System.out.println("\nEnter |1| to login");
		System.out.println("Enter |2| to exit");		
	}
}