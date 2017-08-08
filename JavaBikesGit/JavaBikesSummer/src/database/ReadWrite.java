package database;

import java.io.*;
import java.util.*;

import model.*;

public class ReadWrite {
	
	String details;
	
	public static Customer getCustomer(String line)
	{					
		Customer customerdetails = new Customer();
		String[] values = line.split(";");
		
		customerdetails.setFirstName(values[0]);
		customerdetails.setLastName(values[1]);
		customerdetails.setUsername(values[2]);
		customerdetails.setPassword(values[3]);
		
		return customerdetails;		
	}
	
	//ArrayList to get customerList
	public static ArrayList<Customer> getcustomerList()
	{
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Scanner input = readDetails("customer.txt");		
		while (input.hasNextLine())
		{
			customerList.add(getCustomer(input.nextLine()));		
		}
		return customerList;
	}

	//Write details method for all files
	public static void WriteDetails(String file, String input) 
	{		
		try
		{
			FileWriter fwriter = new FileWriter(file, true);
			PrintWriter output = new java.io.PrintWriter(fwriter);
			output.println(input);
			output.close();
		}
		catch (IOException ex)
		{
			System.out.println("Error writing to file" + file + ";");
		}			
	}
	
	//Read details method for reading all files
	public static Scanner readDetails(String file)
	{	
		Scanner input = new Scanner(System.in);
	try
	{
		java.io.File ReadFile = new java.io.File(file);
		input = new Scanner(ReadFile);
	}
	catch (FileNotFoundException ex)
	{
		System.out.println("Error reading file" + file + ";");
	}
	return input;
	}

	
	public static Manager getManager(String line)
	{
		Manager managerFromFile = new Manager();
		//Finds every ; and changes values to string
		String[] values = line.split(";");
		
		//Changing String to correct format
		managerFromFile.setUsername(values[0]);
		managerFromFile.setPassword(values[1]);
		
		return managerFromFile;
	}
	
	//File to read and write manager details
	public static ArrayList<Manager> getManagerDetails()
	{//Method to create ArrayList object
		ArrayList<Manager> managerList = new ArrayList<Manager>();
		Scanner input = readDetails("manager.txt");
		//Scanning each line getManager, returning manager and adding to file//
		while (input.hasNextLine())
		{
			managerList.add(getManager(input.nextLine()));
		}
		
		return managerList;
	}
	
	
	//method to get active user list for booking
	public static ActiveUser getActiveUser(String line)
	{
		ActiveUser activeUserFromFile = new ActiveUser();
		String[] value = line.split(";");
		
		activeUserFromFile.setActiveUser(value[0]);
		return activeUserFromFile;
	}
	
	//ArrayList to load all active users
	public static ArrayList<ActiveUser> getAllActiveUserDetails()
	{
		ArrayList<ActiveUser> activeUserList = new ArrayList<ActiveUser>();
		Scanner input = readDetails("activeUser.txt");
		
		while (input.hasNextLine())
		{
		}
		return activeUserList;
	}
	
	//Method to find activeUser from .txt for booking
	public static void findActiveUser() throws FileNotFoundException, IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("activeUser.txt")))
		{
			String line = null;
			while ((line = br.readLine()) !=null)
			{
				System.out.println("Thank you for your booking " + line + ".");
			}
		}
	}
	
	//defining the file the method activeuser should be wiped from
	public static void wipeActiveUser()
	{
		try
		{
			PrintWriter pw = new PrintWriter("activeUser.txt");
			pw.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error finding activeuser.txt: ");
		}
	}
	
	//Method to print products in ArrayList
	public static ArrayList<Product> printBike()
	{
		//Method to create ArrayList object
		ArrayList<Product> List = new ArrayList<Product>();
		//Method to scan .txt file
		Scanner Line = readDetails("products.txt");
		//Loop to print a line of item from file
		while (Line.hasNextLine())
		{
			List.addAll(readProduct());
		}
		for (int i = Line.nextInt(); --i < List.size();)
				{
					System.out.println(List.get(i));
					break;
				}
		return List;
	}	
	
	//Method to read the product ArrayList
	public static ArrayList<Product> readProduct()
	{
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(new File("products.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error finding products.txt");
		}
		
		//Method to create ArrayList object
		ArrayList <Product> productList = new ArrayList<Product>();
		while (scanner.hasNext())
		{
			String values = scanner.nextLine();
			String valueList[] = values.split(";");
		
		//differentiating bikes from Ebikes through their unique 5th values
		if (valueList[0].equals("Bike"))
		{
			String gears =(valueList[5]);
			
			productList.add(new Bike(valueList[0], valueList[1], valueList[2], valueList[3], valueList[4], gears));
		}
		else if (valueList[0].equals("Ebike"))
		{
			String  batteryCapacity = (valueList[5]);
					
			productList.add(new Ebike(valueList[0], valueList[1], valueList[2], valueList[3], valueList[4], batteryCapacity));
		}
	}
	scanner.close();
	return productList;
	}
	
	//Method to get credit card from .txt
	public static CreditCard getCreditCard(String line)
	{
		CreditCard creditCardFromFile = new CreditCard();
		//Looks for every ; and changes to string
		String[] value = line.split(";");
		//Changes String to right format
		creditCardFromFile.setCardHolder(value[0]);
		creditCardFromFile.setCardNumber(value[1]);
		creditCardFromFile.setMonthOfExpiry(value[2]);
		creditCardFromFile.setYearOfExpiry(value[3]);
		creditCardFromFile.setCVC(value[4]);
		
		return creditCardFromFile;
	}
	
	//Defining the file to read and write CC
	public static ArrayList<CreditCard> getCreditCardDetails()
	{
		ArrayList<CreditCard> CCList = new ArrayList <CreditCard>();
		Scanner input = readDetails("creditCard.txt");
		
		while (input.hasNextLine())
		{
			CCList.add(getCreditCard(input.nextLine()));
		}
		return CCList;
	}
	}