package database;

import java.util.ArrayList;

import model.*;

public class ProductDB {
	
	ArrayList<Bike>BikeList = new ArrayList<Bike>();
	ArrayList<Ebike>EbikeList = new ArrayList<Ebike>();
	
	public void BikeList()
	{
		BikeList.add(new Bike("City", "Red", "M", 1500, "H"));
		BikeList.add(new Bike("City", "Red", "S", 1000, "H"));
		BikeList.add(new Bike("City", "Red", "L", 2000, "H"));
		
		BikeList.add(new Bike("City", "Black", "M", 1500, "H"));
		BikeList.add(new Bike("City", "Black", "S", 1000, "H"));
		BikeList.add(new Bike("City", "Black", "L", 2000, "H"));
		
		BikeList.add(new Bike("Mountain", "Red", "M", 3000, "H"));
		BikeList.add(new Bike("Mountain", "Red", "S", 2000, "H"));
		BikeList.add(new Bike("Mountain", "Red", "L", 4000, "H"));
		
		BikeList.add(new Bike("Mountain", "Black", "M", 3000, "H"));
		BikeList.add(new Bike("Mountain", "Black", "S", 2000, "H"));
		BikeList.add(new Bike("Mountain", "Black", "L", 4000, "H"));
	}
	
	public void EbikeList()
	{
		EbikeList.add(new Ebike("City", "Red", "M", 2000, ""));
		EbikeList.add(new Ebike("City", "Red", "S", 1500, ""));
		EbikeList.add(new Ebike("City", "Red", "L", 3000, ""));
		
		EbikeList.add(new Ebike("City", "Black", "M", 2000, ""));
		EbikeList.add(new Ebike("City", "Black", "S", 1500, ""));
		EbikeList.add(new Ebike("City", "Black", "L", 3000, ""));
		
		EbikeList.add(new Ebike("Mountain", "Red", "M", 4000, ""));
		EbikeList.add(new Ebike("Mountain", "Red", "S", 3000, ""));
		EbikeList.add(new Ebike("Mountain", "Red", "L", 6000, ""));
		
		EbikeList.add(new Ebike("Mountain", "Black", "M", 4000, ""));
		EbikeList.add(new Ebike("Mountain", "Black", "S", 3000, ""));
		EbikeList.add(new Ebike("Mountain", "Black", "L", 6000, ""));		
	}
}