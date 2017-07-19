package control;

import java.util.*;

import database.ReadWrite;
import model.*;

public class Control 
{
	Scanner input = new Scanner(System.in);
	String details;
	Customer cust = new Customer();
	CustomerCtrl custCtrl = new CustomerCtrl();
	
	private ArrayList<Customer>customerList = new ArrayList<Customer>();	

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
		details = checkExistingUsers(input);
		cust.setUsername(details);
				
		do
		{
		System.out.println("Please enter a password");
		if(details.matches("^[a-zA-Z0-9_.-]{5,30}+"))
		cust.setPassword(input.nextLine());
		else
		{
			System.out.println("Invalid password: Can be letters and numbers and must be at least 5 characters");
			details = null;
		}
		}
		while (details == null);
			
		System.out.println("Congratulations! You have created an account with Java Bikes");
	}
	
	private String checkExistingUsers(Scanner input) 
	{
		String users = input.nextLine();
		for (int i =0; i<customerList.size(); i++)
			if (customerList.get(i).getUsername().equals(users) || users.length() < 5)
			{
				System.out.println("Invalid input or user already exists. Please try again: ");
				return checkExistingUsers(input);
			}
		return users;
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
			System.out.println("You have exceeded 3 login attempts. Please ty again later");
			System.exit(0);
		}
		boolean logIn = false;
		do		
		{
			attempt++;
			System.out.println("Please enter your username");
			username = input.nextLine();
		
			System.out.println("Please enter your password");
			password = input.nextLine();
			
			for(int i = 0; i<customerList.size() && !logIn; i++)
			{
				if(username.equals(customerList.get(i).getUsername()) &&password.equals(customerList.get(i).getPassword()))
				{
					System.out.println("You have logged in. Welcome " + username + ":");
					logIn = true;
					
					//String details = customerList.get(i).getUsername();
				}
			}
			if(!logIn)
			{
				System.out.println("Wrong username or password: Please try again");
			}
		}
		while (attempt < 3 && !logIn);
		custCtrl.customerMenu();
}
	public void writeToFile() 
	{
		String details = cust.getFirstName() + ";" + cust.getLastName()
		+ ";" + cust.getUsername() + ";" + cust.getPassword() + ";";
		ReadWrite.WriteDetails("customer.txt", details);
	}	

public void loadDB() {
	customerList = ReadWrite.getCustomerList();
	
}

}