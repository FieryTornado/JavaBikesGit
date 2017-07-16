package database;

import java.util.*;
import model.*;

public class CustomerDB 
{
	
	private ArrayList<Customer>CustomerList = new ArrayList<Customer>();
	private ArrayList<Manager>ManagerList = new ArrayList<Manager>();
	
	public void CustomerList()
	{
		CustomerList.add(new Customer());
	}
	
	public void ManagerList()
	{
		ManagerList.add(new Manager());
	}
}