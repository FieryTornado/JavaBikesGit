package control;

import java.io.*;
import java.util.*;

import database.ReadWrite;
import model.*;

public class ManagerCtrl {
	
	Scanner input = new Scanner(System.in);
	Manager manager = new Manager();
	String details;
	
	private ArrayList<Product> productList;

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
					String bikeDetails = bike.getName() + ";" + bike.getColour() + ";" + bike.getSize() + ";" + bike.getPrice() + ";" + bike.getId()
					+ ";" + bike.getGears() + ";";
					writeToFile(bikeDetails);
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
	
	private String writeToFile(String details) 
	{
		ReadWrite.WriteDetails("products.txt", details);
		return null;
	}

	public ManagerCtrl()
	{
		productList = ReadWrite.readProduct();
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
				String Edetails;
				Ebike ebike = new Ebike();
				
				do
				{
					System.out.println("Please Enter 'Electric Bike' to differ from bike: ");
					Edetails = input.nextLine();
					if (Edetails.matches("Electric Bike"))
					{						
						ebike.setName(Edetails);
					}
					else
					{
						System.out.println("You must enter 'Electric Bike'");
						Edetails = null;
					}
				}
				while(Edetails == null);
				
				do
				{
					System.out.println("Please Enter colour: ");
					Edetails = input.nextLine();
					if (Edetails.matches("[A-Za-z]+"))
					{
						ebike.setColour(Edetails);
					}
					else
					{
						System.out.println("Please Use Latin Characters");
						Edetails = null;
					}						
				}
				while (Edetails == null);
				
				do
				{
					System.out.println("Please Enter price: Add kr at end");
					Edetails = input.nextLine();
					if (Edetails.matches("[0-9k[r]]+"))
					{
						ebike.setPrice(Edetails);
					}
					else
					{
						System.out.println("Use numbers and add kr at end");
						Edetails = null;
					}
				}
				while (Edetails == null);
				
				do
				{
					System.out.println("Please Enter size: Use S, M, or L");
					Edetails = input.nextLine();
					if (Edetails.matches("[SML]+"))
					{
						ebike.setSize(Edetails);
					}
					else
					{
						System.out.println("Use S, M, or L");
					}
				}
				while (Edetails == null);
				
				do
				{
					System.out.println("Please Enter ID: ");
					Edetails = input.nextLine();
					if (Edetails.matches("[0-9]+"))
					{
						ebike.setId(Edetails);
					}
					else
					{
						System.out.println("Use numbers only");
						Edetails = null;
					}
				}
				while (Edetails == null);
				
				do
				{
					System.out.println("Please Enter Battery Charging Time: Add h at end for hours");
					Edetails = input.nextLine();
					if (Edetails.matches("[0-9h]+"))
					{
						ebike.setBatteryCapacity(Edetails);
					}
					else
					{
						System.out.println("Use numbers and add h at end for hours.");
						Edetails = null;
					}
				}
				while (Edetails == null);
				
				System.out.println("Ebike has been added");				
				return ebike;
			}
	
			public void printManagerMenu()
			{
				System.out.println("\n|1| Add bike" );
				System.out.println("|2| Add electric bike" );
				System.out.println("|3| Exit system" );
			}
			
			public void writeToFile()
			{
				String details = manager.getUsername() + ";" + manager.getPassword() + ";";
				ReadWrite.WriteDetails("manager.txt", details);
			}
}