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
	
	public static ArrayList<Customer> getCustomerList()
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
	}