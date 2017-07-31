package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import database.*;
//import database.ReadWrite;
import model.*;

public class ProductCtrl 
{
	
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<ActiveUser> activeUserList = new ArrayList<ActiveUser>();
    
    ProductDB productDB = new ProductDB();
    
    public ProductCtrl()
    {
    	productList = ReadWrite.readProduct();
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
		
	public void setproductList(ArrayList<Product> productList)
	{
		this.productList = productList;
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
		Date time = new Date();
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
				if (choice ==1)
				{
					activeUserList = ReadWrite.getAllActiveUserDetails();
					
					int confirmationNumber = (int) (Math.random() * 1000 + 1000);
					
					ReadWrite.findActiveUser();
					System.out.println("Congratulations on booking: " + productList.get(bikeId).toString());
					System.out.println("Your confirmation number is: " + confirmationNumber);
					System.out.println("Your payment will be withdrawn when you pick up your booking.");
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
