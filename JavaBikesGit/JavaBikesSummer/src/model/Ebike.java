package model;

public class Ebike extends Product 
{
	private String batteryCapacity;

	public Ebike(String name, String size, String colour, int price, String batteryCapacity) 
	{
		super (name, size, colour, price);
		this.batteryCapacity = batteryCapacity;
	}

	public String getBatteryCapacity() 
	{
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) 
	{
		this.batteryCapacity = batteryCapacity;
	}

}
