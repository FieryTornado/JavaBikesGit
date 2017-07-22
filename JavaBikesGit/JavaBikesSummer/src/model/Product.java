package model;

public class Product {
	protected String name, colour, size, price, Id;

	public Product (String name, String colour, String size, String price, String Id)
	{
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.Id = Id;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
