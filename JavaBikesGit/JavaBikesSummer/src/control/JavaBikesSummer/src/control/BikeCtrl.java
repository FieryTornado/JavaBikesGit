package control;

import java.util.ArrayList;

import model.Product;

public class BikeCtrl {
	
	private ArrayList<Product>ProductList = new ArrayList<Product>();
	
	public void BrowseBikes() 
	 {
			
		}

	public String promotions() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void bookBike() 
	{
		// TODO Auto-generated method stub
		
	}

	public void printBikes() 
	{
		for (int i = 0; i <ProductList.size(); i++)
		{
		System.out.println(ProductList.get(i));
		}		
		
	}

	public void printpromotions() 
	{
		// TODO Auto-generated method stub
		}

}
