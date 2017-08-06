package model;

import database.ReadWrite;

public class Ebike extends Product 
{
	private String batteryCapacity;

	public Ebike(String name, String size, String colour, String price, String Id, String batteryCapacity) 
	{
		super (name, size, colour, price, Id);
		this.batteryCapacity = batteryCapacity;
	}

	public Ebike() 
	{
		//Constructor to create Ebike Object
	}

	public String getBatteryCapacity() 
	{
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) 
	{
		this.batteryCapacity = batteryCapacity;
	}
	
	public String toString()
	{
		return "ID: " + Id + " --- " + "Bike Name: " + name + ", Size: " + size + ", Colour: " + colour + ", Price: "
				+ price + ", Charge Time: " + batteryCapacity;
	}
	
	public void writeToFile(String details)
	{
		ReadWrite.WriteDetails("products.txt", details);
	}

}
