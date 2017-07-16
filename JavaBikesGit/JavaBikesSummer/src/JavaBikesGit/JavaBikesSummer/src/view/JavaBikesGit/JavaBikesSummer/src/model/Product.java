package model;

public class Product {
	protected String name, size, colour;

	public Product (String name, String size, String colour)
	{
		this.name = name;
		this.size = size;
		this.colour = colour;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
