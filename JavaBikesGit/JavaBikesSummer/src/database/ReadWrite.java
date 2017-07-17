package database;

import java.io.*;
import java.util.*;

import model.*;

public class ReadWrite {
	String details;
	
	public void saveUser(String firstName, String lastName, String username, String password)
	{
		String fileName = "customer.txt";
		try
		{
			Writer output;
			output = new BufferedWriter(new FileWriter(fileName, true));
			output.append("\r\n");
			output.append(firstName + ";" + lastName + ";" + username + ";" + password);
			output.close();
		}
		catch (IOException ex)
		{
			System.out.println("Error writing to file '" + fileName + "'");
		}
	}
	
	public static Customer getCustomerdetails(String line)
	{
					
		Customer customerdetails = new Customer();
		String[] values = line.split(";");
		
		customerdetails.setFirstName(values[0]);
		customerdetails.setLastName(values[1]);
		customerdetails.setUsername(values[2]);
		customerdetails.setPassword(values[3]);
		
		return customerdetails;
	}
	
	public static ArrayList<Customer> getAllCustomerList()
	{
		ArrayList<Customer> customerdetails = new ArrayList<Customer>();
		Scanner input = readDetails("customer.txt");
		{			
		while (input.hasNextLine())
		{
			customerdetails.add(getCustomerdetails(input.nextLine()));
		}		
		}
		return customerdetails;
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
	{
	try
	{
		java.io.File ReadFile = new java.io.File(file);
		input = new Scanner(ReadFile);
	}
	catch (FileNotFoundException ex)
	{
		System.out.println("Error reading file" + file + ";");
	}
	}
	return input;
	}	
	}