package model;

public class Manager 
{
	private String username, password;
	
	//Manager constructor
	public Manager(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	
	public Manager()
	{}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}
