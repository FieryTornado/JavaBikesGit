package database;

import java.util.ArrayList;

import model.*;

public class ProductDB {
	
	ArrayList<Bike>BikeList = new ArrayList<Bike>();
	ArrayList<Ebike>EbikeList = new ArrayList<Ebike>();
	
	public void BikeList()
	{
		BikeList.add(new Bike("City", "Red", "M", "H"));
		BikeList.add(new Bike("City", "Red", "S", "H"));
		BikeList.add(new Bike("City", "Red", "L", "H"));
		
		BikeList.add(new Bike("City", "Black", "M", "H"));
		BikeList.add(new Bike("City", "Black", "S", "H"));
		BikeList.add(new Bike("City", "Black", "L", "H"));
		
		BikeList.add(new Bike("Mountain", "Red", "M", "H"));
		BikeList.add(new Bike("Mountain", "Red", "S", "H"));
		BikeList.add(new Bike("Mountain", "Red", "L", "H"));
		
		BikeList.add(new Bike("Mountain", "Black", "M", "H"));
		BikeList.add(new Bike("Mountain", "Black", "S", "H"));
		BikeList.add(new Bike("Mountain", "Black", "L", "H"));
	}
	
	public void EbikeList()
	{
		EbikeList.add(new Ebike("City", "Red", "M", ""));
		EbikeList.add(new Ebike("City", "Red", "S", ""));
		EbikeList.add(new Ebike("City", "Red", "L", ""));
		
		EbikeList.add(new Ebike("City", "Black", "M", ""));
		EbikeList.add(new Ebike("City", "Black", "S", ""));
		EbikeList.add(new Ebike("City", "Black", "L", ""));
		
		EbikeList.add(new Ebike("Mountain", "Red", "M", ""));
		EbikeList.add(new Ebike("Mountain", "Red", "S", ""));
		EbikeList.add(new Ebike("Mountain", "Red", "L", ""));
		
		EbikeList.add(new Ebike("Mountain", "Black", "M", ""));
		EbikeList.add(new Ebike("Mountain", "Black", "S", ""));
		EbikeList.add(new Ebike("Mountain", "Black", "L", ""));		
	}
}