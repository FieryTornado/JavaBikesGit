package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import database.*;
//import database.ReadWrite;
import model.*;

public class ProductCtrl 
{	
	String details;
    private ArrayList<Product> productList = new ArrayList<Product>();
    
    public ProductCtrl()
    {
    	productList = ReadWrite.readProduct();
    	ReadWrite.WriteDetails("products.txt", details);
    }
    
    
	//Method to show arraylist of bikes
	public void AvailableBikes() 
	 {
		System.out.println("Below are a list of available bikes");
			for (int i = 0; i < productList.size(); i++)
			{
				System.out.println(productList.get(i));
			}
		}

	public String promotions() 
	{
		return null;
	}
	
	public void bookBike() throws FileNotFoundException, IOException
	{
		ArrayList<Product> productList = null;
		Scanner input = new Scanner(System.in);
		boolean productFound = false;
		Date timenow = new Date();
		int bikeId = 0;
		
		System.out.println("");
		AvailableBikes();
		
		System.out.println("Enter bike ID to rent: ");
		bikeId = input.nextInt() -1;
		
		productList = ReadWrite.readProduct();
		
		if (!productFound && bikeId > -1 && bikeId < productList.size())
		{
			System.out.println("\nYou are booking: " + productList.get(bikeId).toString());
			System.out.println("\nPress 1 to confirm booking: ");
			System.out.println("\nPress 2 to return to options: ");
			
			int choice = input.nextInt();
			while (choice !=0)
			{
				if (choice == 1)

				{	
					//If user chooses 1 to confirm booking, generate random confirmation and print the following
					int confirmationNumber = (int) (Math.random() * 2000 + 1000);
					
					System.out.println("Congratulations on booking: " + productList.get(bikeId).toString());
					System.out.println("Your confirmation number is: " + confirmationNumber);
					System.out.println("Date: " + timenow.toString());
					System.out.println("You will now be asked to enter your Credit Card details. Payment will be deducted upon pickup.");
					break;
				}
				if (choice == 2)
				{
					productFound = false;
					bookBike();
					break;
				}
				else
				{
					System.out.println("Invalid input: Please try again.");
					choice = 0;
					bookBike();
					break;
				}
			}
		}
	}
	

	public void printBikesMenu() 
	{
		System.out.println("\nEnter 1 to return to customer menu");
		
	}

	public void printpromotions() 
	{
		// TODO Auto-generated method stub
		}
}
