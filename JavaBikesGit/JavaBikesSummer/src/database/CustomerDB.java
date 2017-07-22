package database;

import java.util.*;
import model.*;

public class CustomerDB 
{
	
	private ArrayList<Customer>customerList = new ArrayList<Customer>();
	private ArrayList<Manager>managerList = new ArrayList<Manager>();
	
	public void customerList()
	{
		customerList.add(new Customer());
	}
	
	public void ManagerList()
	{
		managerList.add(new Manager("admin", "admin111"));
	}
}