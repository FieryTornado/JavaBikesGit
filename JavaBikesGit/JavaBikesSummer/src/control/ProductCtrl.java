package control;

import java.util.ArrayList;

import model.Product;

public class ProductCtrl {
private ArrayList<Product>ProductList = new ArrayList<Product>();
	
	public void BrowseBikes() 
	 {
			
		}

	public String promotions() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Product> bookBike() 
	{
		/*for (Product product :getProductList())
		{
			System.out.println(product.getSize());
		}
		*/
		return ProductList;
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
