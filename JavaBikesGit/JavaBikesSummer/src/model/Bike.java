package model;

public class Bike extends Product 
{
	
	private String gears;

	public Bike(String name, String size, String colour, String price, String Id, String gears) 
	{
		super (name, size, colour, price, Id);
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