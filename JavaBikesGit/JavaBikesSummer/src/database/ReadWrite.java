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
		String[] values = line.split(";");
		
		managerFromFile.setUsername(values[0]);
		managerFromFile.setPassword(values[1]);
		
		return managerFromFile;
	}
	
	//File to read and write manager details
	public static ArrayList<Manager> getManagerDetails()
	{
		ArrayList<Manager> managerList = new ArrayList<Manager>();
		Scanner input = readDetails("manager.txt");
		
		while (input.hasNextLine())
		{
			managerList.add(getManager(input.nextLine()));
		}
		
		return managerList;
	}
	
	public static ActiveUser getActiveUser(String line)
	{
		ActiveUser activeUserFromFile = new ActiveUser();
		String[] value = line.split(";");
		
		activeUserFromFile.setActiveUser(value[0]);
		return activeUserFromFile;
	}
	
	public static ArrayList<ActiveUser> getAllActiveUserDetails()
	{
		ArrayList<ActiveUser> activeUserList = new ArrayList<ActiveUser>();
		Scanner input = readDetails("activeUser.txt");
		
		while (input.hasNextLine())
		{
		}
		return activeUserList;
	}
	
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
	
	public static void wipeActiveUser()
	{
		try
		{
			PrintWriter pwWipe = new PrintWriter("activeUser.txt");
			pwWipe.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error finding activeuser.txt: ");
		}
	}
	
	
	public static ArrayList<Product> printBike()
	{
		ArrayList<Product> oneLineList = new ArrayList<Product>();
		
		Scanner oneLine = readDetails("products.txt");
		
		while (oneLine.hasNextLine())
		{
			oneLineList.addAll(readProduct());
		}
		for (int i = oneLine.nextInt(); --i < oneLineList.size();)
				{
					System.out.println(oneLineList.get(i));
					break;
				}
		return oneLineList;
	}
	
	
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
		
		ArrayList <Product> productList = new ArrayList<Product>();
		while (scanner.hasNext())
		{
			String values = scanner.nextLine();
			String valueList[] = values.split(";");
		
		//differentiating bikes from Ebikes
		if (valueList[0].equals("Bike"))
		{
			String gears =(valueList[5]);
			
			productList.add(new Bike(valueList[0], valueList[1], valueList[2], valueList[3], valueList[4], gears));
		}
		else if (valueList[0].equals("Ebike"))
		{
			String charge = (valueList[5]);
					
			productList.add(new Ebike(valueList[0], valueList[1], valueList[2], valueList[3], valueList[4], charge));
		}
	}
	scanner.close();
	return productList;
	}

	public static ArrayList<Product> getproductList() {
		ArrayList<Product> productList = new ArrayList<Product>();
		Scanner input = readDetails("product.txt");
		
		while (input.hasNextLine())
		{
			productList.add(getproductList(input.nextLine()));
		}
		return productList;
	}

	private static Product getproductList(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}