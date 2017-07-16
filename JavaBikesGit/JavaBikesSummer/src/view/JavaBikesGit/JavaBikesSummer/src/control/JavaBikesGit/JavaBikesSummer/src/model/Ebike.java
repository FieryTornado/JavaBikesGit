package model;

public class Ebike extends Product 
{
	private String batteryCapacity;

	public Ebike(String name, String size, String colour, String batteryCapacity) 
	{
		super (name, size, colour);
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
