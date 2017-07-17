package control;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class CustomerCtrl 
{
	Scanner input = new Scanner(System.in);
	BikeCtrl bikeCtrl = new BikeCtrl();
	
	
	private ArrayList<Customer>CustomerList;
	private ArrayList<Product>ProductList;
	
	public static void CreateCustomer() 
	{
		// TODO Auto-generated method stub
		
	}

	public static void Login() 
	{
		// TODO Auto-generated method stub
		
	}
	public void customerMenu() 
	{
		printcustomerMenu();
		
		int selectcustomerMenu = input.nextInt();
		switch (selectcustomerMenu)
		{		
		case 1:
			bikeCtrl.BrowseBikes();
			bikeCtrl.printBikes();
			customerMenu();
			break;
			
		case 2:
			bikeCtrl.promotions();
			bikeCtrl.printpromotions();
			customerMenu();
			break;
			
		case 3:
			bikeCtrl.bookBike();
			customerMenu();
			
		case 4:
			System.exit(0);
			
			default:
				System.out.println("Wrong input: Choose a number from 1 to 4 to continue");
				input.next();
				break;			
		}
	}

	private void printcustomerMenu() 
	{
		System.out.println("\nChoose one of the following numbers to continue: ");
		System.out.println("\n|1| Browse bikes");
		System.out.println("|2| See available promotions");
		System.out.println("|3| Book a bike");
		System.out.println("|4| Exit process");		

		}

}
