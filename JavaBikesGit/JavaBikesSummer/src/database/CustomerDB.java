package database;

import java.util.*;
import model.*;

public class CustomerDB 
{
	
	private ArrayList<Customer>customerList = new ArrayList<Customer>();
	private ArrayList<Manager>ManagerList = new ArrayList<Manager>();
	
	public void customerList()
	{
		customerList.add(new Customer());
	}
	
	public void ManagerList()
	{
		ManagerList.add(new Manager());
	}
}