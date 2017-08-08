package control;

import java.io.*;
import java.util.*;

import database.ReadWrite;
import model.*;

public class ManagerCtrl 
{	
	Scanner input = new Scanner(System.in);
	//Initialising manager
	Manager manager = new Manager();
	String details;
	
	//Initialising array list for products
	private ArrayList<Product> productList;
	
	//Constructor to load productArrayList
	public ManagerCtrl()
	{
		productList = ReadWrite.readProduct();
	}

	//Creation of manager manager menu
	public void ManagerMenu() throws IOException
	{
		printManagerMenu();
		
		do
		{
			try
			{
				int selectManagerMenu = input.nextInt();
				switch(selectManagerMenu)
				{
				case 1:					
					Bike bike = new Bike();
					bike = WriteBikeToDB();
					String details = bike.getName() + ";" + bike.getColour() + ";" + bike.getSize() + ";" + bike.getPrice() + ";" + bike.getId()
					+ ";" + bike.getGears() + ";";
					writeToFile(details);
					ManagerMenu();
					break;
					
				case 2:
					Ebike ebike = new Ebike();
					ebike = WriteEbikeToDB();
					String eDetails = ebike.getName() + ";" + ebike.getColour() + ";" + ebike.getSize() + ";" + ebike.getPrice() + ";" + ebike.getId()
					+ ";" + ebike.getBatteryCapacity() + ";";
					writeToFile(eDetails);
					ManagerMenu();
					break;
					
				case 3:
					ReadWrite.wipeActiveUser();
					break;
				
				case 4:
					System.exit(0);
					break;
					
					default:
						break;
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nChoose a number from 1 to 4");
				input.nextLine();
				break;
			}
		}
		while (true);
		}
	
	private void writeToFile(String details) 
	{
		ReadWrite.WriteDetails("products.txt", details);
	}	
		
		//Adding Bike to database
		public Bike WriteBikeToDB()
		{
			Scanner input = new Scanner(System.in);
			String details;
			Bike bike = new Bike();
			do
			{
				System.out.println("Please Write 'Bike' to differ from Ebike: ");
				details = input.nextLine();
			if(details.matches("Bike"))
			{
				bike.setName(details);
			}
			else
			{
				System.out.println("You must write 'Bike' ");
				details = null;
			}
			}
			while (details == null);
			
			do
			{
				System.out.println("Please Enter colour: ");
				details = input.nextLine();
				if
				(details.matches("[A-Za-z]+"))
				{
					bike.setColour(details);
				}
				else
				{
					System.out.println("Please use Latin letters");
					details = null;
				}
			}
			while(details == null);
			
			do
			{
				System.out.println("Please enter price: Insert kr at end ");
				details = input.nextLine();
				if (details.matches("[0-9k[r]]+"))
				{
					bike.setPrice(details);
				}
				else
				{
					System.out.println("Please use numbers and insert kr at end");
					details = null;
				}
			}
			while (details == null);
			
			do
			{
				System.out.println("Please Enter Size In: S, M, or L");
				details = input.nextLine();
				if (details.matches("[SML]+"))
				{
						bike.setSize(details);
					}
					else
					{
						System.out.println("Enter Size In: S, M, or L");
						details = null;
					}
				}
				while (details == null);
			
			do
			{
				System.out.println("Please enter ID for bike: ");
				details = input.nextLine();
				if (details.matches("[0-9]+"))
				{
					bike.setId(details);
			}
			
			else
			{
				System.out.println("Please use numbers");
				details = null;
			}
			}
			while (details == null);
			
			do
			{
				System.out.println("Please Enter gears: ");
				details = input.nextLine();
				if(details.matches("[0-9]+"))
				{
					bike.setGears(details);
			}
			else
			{
				System.out.println("Please use numbers.");
				details = null;
			}
			}
			while (details == null);
			
			System.out.println("Bike has been added");
			return bike;
		}
			
			public Ebike WriteEbikeToDB()
			{
				Scanner input = new Scanner(System.in);
				String eDetails;
				Ebike ebike = new Ebike();
				
				do
				{
					System.out.println("Please Enter 'Electric Bike' to differ from bike: ");
					eDetails = input.nextLine();
					if (eDetails.matches("Electric Bike"))
					{						
						ebike.setName(eDetails);
					}
					else
					{
						System.out.println("You must enter 'Electric Bike'");
						eDetails = null;
					}
				}
				while(eDetails == null);
				
				do
				{
					System.out.println("Please Enter colour: ");
					eDetails = input.nextLine();
					if (eDetails.matches("[A-Za-z]+"))
					{
						ebike.setColour(eDetails);
					}
					else
					{
						System.out.println("Please Use Latin letters");
						eDetails = null;
					}						
				}
				while (eDetails == null);
				
				do
				{
					System.out.println("Please Enter price: Add kr at end");
					eDetails = input.nextLine();
					if (eDetails.matches("[0-9k[r]]+"))
					{
						ebike.setPrice(eDetails);
					}
					else
					{
						System.out.println("Use numbers and add kr at end");
						eDetails = null;
					}
				}
				while (eDetails == null);
				
				do
				{
					System.out.println("Enter size: Use S, M, or L");
					eDetails = input.nextLine();
					if (eDetails.matches("[SML]+"))
					{
						ebike.setSize(eDetails);
					}
					else
					{
						System.out.println("Use S, M, or L");
					}
				}
				while (eDetails == null);
				
				do
				{
					System.out.println("Please Enter ID: ");
					eDetails = input.nextLine();
					if (eDetails.matches("[0-9]+"))
					{
						ebike.setId(eDetails);
					}
					else
					{
						System.out.println("Use numbers only");
						eDetails = null;
					}
				}
				while (eDetails == null);
				
				do
				{
					System.out.println("Please Enter Battery Charging Time: Add h at end for hours");
					eDetails = input.nextLine();
					if (eDetails.matches("[0-9h]+"))
					{
						ebike.setBatteryCapacity(eDetails);
					}
					else
					{
						System.out.println("Use numbers and add h at end for hours.");
						eDetails = null;
					}
				}
				while (eDetails == null);
				
				System.out.println("Ebike has been added");				
				return ebike;
			}
	
			public void printManagerMenu()
			{
				System.out.println("\n|1| Add bike" );
				System.out.println("|2| Add electric bike" );
				System.out.println("|4| Log out" );
				System.out.println("|3| Exit system" );
			}
			
			public void writeToFile()
			{
				String details = manager.getUsername() + ";" + manager.getPassword() + ";";
				ReadWrite.WriteDetails("manager.txt", details);
			}
}