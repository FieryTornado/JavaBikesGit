package database;

import java.util.*;

import model.*;

public class ProductDB {
	
	ArrayList<Bike>BikeList = new ArrayList<Bike>();
	ArrayList<Ebike>EbikeList = new ArrayList<Ebike>();
	
	ArrayList<Product> productList = new ArrayList<Product>();
	
	public void productList()
	{
	productList.addAll(BikeList);
	productList.addAll(EbikeList);
	}
	
	public ArrayList<Product> getproductList() {
		return productList;
	}
	
	public ProductDB()
	{
		productList.addAll(BikeList);
		productList.addAll(EbikeList);
	}
	
	
	public void BikeList()
	{
		BikeList.add(new Bike("City", "Red", "M", "1500", "111", "H"));
		BikeList.add(new Bike("City", "Red", "S", "1000", "112", "H"));
		BikeList.add(new Bike("City", "Red", "L", "2000", "113", "H"));
		
		BikeList.add(new Bike("City", "Black", "M", "1500", "114", "H"));
		BikeList.add(new Bike("City", "Black", "S", "1000", "115", "H"));
		BikeList.add(new Bike("City", "Black", "L", "2000", "116", "H"));
		
		BikeList.add(new Bike("Mountain", "Red", "M", "3000", "117", "H"));
		BikeList.add(new Bike("Mountain", "Red", "S", "2000", "118", "H"));
		BikeList.add(new Bike("Mountain", "Red", "L", "4000", "119", "H"));
		
		BikeList.add(new Bike("Mountain", "Black", "M", "3000", "120", "H"));
		BikeList.add(new Bike("Mountain", "Black", "S", "2000", "121", "H"));
		BikeList.add(new Bike("Mountain", "Black", "L", "4000", "122", "H"));
	}
	
	public void EbikeList()
	{
		EbikeList.add(new Ebike("City", "Red", "M", "2000", "123", "Medium Charge"));
		EbikeList.add(new Ebike("City", "Red", "S", "1500", "124", "Medium Charge"));
		EbikeList.add(new Ebike("City", "Red", "L", "3000", "125", "Medium Charge"));
		
		EbikeList.add(new Ebike("City", "Black", "M", "2000", "126", "Medium Charge"));
		EbikeList.add(new Ebike("City", "Black", "S", "1500", "127", "Medium Charge"));
		EbikeList.add(new Ebike("City", "Black", "L", "3000", "128", "Medium Charge"));
		
		EbikeList.add(new Ebike("Mountain", "Red", "M", "4000", "129", "Fast Charge"));
		EbikeList.add(new Ebike("Mountain", "Red", "S", "3000", "130", "Fast Charge"));
		EbikeList.add(new Ebike("Mountain", "Red", "L", "6000", "131", "Fast Charge"));
		
		EbikeList.add(new Ebike("Mountain", "Black", "M", "4000", "132", "Fast Charge"));
		EbikeList.add(new Ebike("Mountain", "Black", "S", "3000", "133", "Fast Charge"));
		EbikeList.add(new Ebike("Mountain", "Black", "L", "6000", "134", "Fast Charge"));		
	}
}