package control;

import java.util.*;
import database.ReadWrite;
//import database.ReadWrite;
import model.*;

public class ProductCtrl {
	
    private ArrayList<Product>productList = new ArrayList<Product>();
    
    public ProductCtrl()
    {
    	productList = ReadWrite.readProduct();
    }
    
    
	
	public void AvailableBikes() 
	 {
			for (int i = 0; i < productList.size(); i++)
			{
				System.out.println(productList.get(i));
			}
		}

	public String promotions() 
	{
		return null;
	}

	/*public ArrayList<Product> bookBike() 
	{
		return productList;
	}
	*/
	
	public void bookBike()
	{
		ArrayList<Product> productList = null;
		Scanner input = new Scanner(System.in);
		boolean productFound = false;
		int bikeId = 0;
		
		System.out.println("");
		browseBikeList();
		
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
					
				}
			}
		}
	}
	

	private void browseBikeList() {
		// TODO Auto-generated method stub
		
	}



	public void printBikes() 
	{
		for (int i = 0; i <productList.size(); i++)
		{
		System.out.println(productList.get(i));
		}		
		
	}

	public void printpromotions() 
	{
		// TODO Auto-generated method stub
		}
}
