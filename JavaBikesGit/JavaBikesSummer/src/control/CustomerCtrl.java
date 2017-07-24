package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import database.ReadWrite;
import main.MainMethod;
import model.Product;

public class CustomerCtrl 
{
	Scanner input = new Scanner(System.in);
	ProductCtrl productCtrl = new ProductCtrl();
	MainMethod main = new MainMethod();
	
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	public CustomerCtrl()
	{
		productList = ReadWrite.readProduct();
	}

	public void customerMenu() throws FileNotFoundException, IOException 
	{
		printcustomerMenu();
		
		{	
			int selectcustomerMenu = input.nextInt();
			switch (selectcustomerMenu)
			{
			
		case 1:
			productCtrl.AvailableBikes();
			productCtrl.printBikes();
			customerMenu();
			break;
			
		case 2:
			productCtrl.promotions();
			productCtrl.printpromotions();
			customerMenu();
			break;
			
		case 3:
			productCtrl.bookBike();
			customerMenu();
			break;
			
		case 4:
			ReadWrite.wipeActiveUser();
			returntoMainMenu();
			
		case 5:
			System.exit(0);
			
			default:
				System.out.println("Wrong input: Choose a number from 1 to 4 to continue");
				input.next();
				break;			
		}
		}
	}

	private void returntoMainMenu() {
		ReadWrite.wipeActiveUser();
		MainMethod.printwelcomeMenu();
		
	}

	private void printcustomerMenu() 
	{
		System.out.println("\nChoose one of the following numbers to continue: ");
		System.out.println("\n|1| Browse bikes");
		System.out.println("|2| See available promotions");
		System.out.println("|3| Book a bike");
		System.out.println("|4| Exit process");		

		}

}
