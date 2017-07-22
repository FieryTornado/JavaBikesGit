package control;

import java.util.ArrayList;

//import database.ReadWrite;
import model.Product;

public class ProductCtrl {
	
    private ArrayList<Product>productList = new ArrayList<Product>();
    
    public ProductCtrl()
    {
    	//productList = ReadWrite.getproductList();
    }
	
	public void BrowseBikes() 
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

	public ArrayList<Product> bookBike() 
	{
		/*for (Product product :getProductList())
		{
			System.out.println(product.getSize());
		}
		*/
		return productList;
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
