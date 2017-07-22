package model;

public class Product {
	protected String name, colour, size;
	protected int price;

	public Product (String name, String colour, String size, int price)
	{
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
