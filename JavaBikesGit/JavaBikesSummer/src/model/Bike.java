package model;

public class Bike extends Product 
{
	
	private String gears;

	public Bike(String name, String size, String colour, int price, String gears) 
	{
		super (name, size, colour, price);
		this.gears = gears;
	}

	public String getGears() 
	{
		return gears;
	}

	public void setGears(String gears) 
	{
		this.gears = gears;
	}
}