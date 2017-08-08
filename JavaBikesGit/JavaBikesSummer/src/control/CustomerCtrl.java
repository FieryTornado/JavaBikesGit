package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import database.ReadWrite;
import main.MainMethod;
import model.CreditCard;
import model.Product;

public class CustomerCtrl 
{
	Scanner input = new Scanner(System.in);
	ProductCtrl productCtrl = new ProductCtrl();
	MainMethod main = new MainMethod();
	CreditCard cardDetails = new CreditCard();
	
	private ArrayList<Product> productList = new ArrayList<Product>();
	private ArrayList<CreditCard> cardList = new ArrayList<CreditCard>();
	
	public CustomerCtrl()
	{
		productList = ReadWrite.readProduct();
		cardList = ReadWrite.getCreditCardDetails();
	}

	public void customerMenu() throws FileNotFoundException, IOException 
	{
		printcustomerMenu();		
		
		do
		{
			try
			{
			int selectcustomerMenu = input.nextInt();
			switch (selectcustomerMenu)
			{
			
		case 1:
			productCtrl.AvailableBikes();
			productCtrl.printBikesMenu();
			int selectBikeMenu = input.nextInt();
			switch (selectBikeMenu)
			{
			case 1:
			customerMenu();
			break;
			}
			
		case 2:
			productCtrl.promotions();
			productCtrl.printpromotions();
			customerMenu();
			break;
			
		case 3:
			productCtrl.bookBike();
			
			CreditCard CC = new CreditCard();
			CC = createCreditCard();
			
			String cardDeails = CC.getCardHolder() + ";" + CC.getCardNumber() + ";" + CC.getMonthOfExpiry() + ";" + CC.getYearOfExpiry()
			+ ";" + CC.getCVC() + ";";
			
			cardDetails.writeTofile(cardDeails);
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
			catch (InputMismatchException e)
			{
				System.out.println("Wrong input: Choose a number from 1 to 4 to continue");
			}
		}
			while (true);
		}
		

	private CreditCard createCreditCard() {
		// Method variables and reference
		Scanner input = new Scanner(System.in);
		String details;
		
		do
		{
			System.out.println("Please Enter Name on Card: ");
			details = input.nextLine();
			if (details.matches("[A-Za-z]+"))
			{
				cardDetails.setCardHolder(details);
			}
			else
			{
				System.out.println("Please use Latin Letters");
				details = null;
			}
		}
		while (details == null);
		
		do
		{
			System.out.println("\nPlease Enter Card Number: xxxx-xxxx-xxxx-xxxx ");
			details = input.nextLine();
			if (details.matches("^(\\d{4}-?^(\\d{4}-?^(\\d{4}-?^(\\d{4}-?$"))
			{
				cardDetails.setCardNumber(details);
			}
			else
			{
				System.out.println("Wrong format: Please use xxxx-xxxx-xxxx-xxxx ");
				details = null;
			}
		}
		while (details == null);
		
		do
		{
			System.out.println("Please Enter Month of Expiry In: XX ");
			details = input.nextLine();
			if (details.matches("[0-9]+") && details.length()==2 && details.substring(0, 1).matches("[0-1]+"))
			{
				cardDetails.setMonthOfExpiry(details);
			}
			else
			{
				System.out.println("Must be XX");
				details = null;
			}
		}
		while (details == null);
		
		do
		{
			System.out.println("Please Enter Card Expiry date in: XX ");
			details = input.nextLine();
			if(details.matches("[0-9]+") && details.length()==2)
			{
				cardDetails.setYearOfExpiry(details);
			}
			else
			{
				System.out.println("Please use XX");
				details = null;
			}
		}
		while (details == null);
		
		do
		{
			System.out.println("Please Enter CVC In: XXX ");
			details = input.nextLine();
			if (details.matches("[0-9]+") &&details.length()==3)
			{
				cardDetails.setCVC(details);
			}
			else
			{
				System.out.println("Use XXX");
				details = null;
			}
		}
		while (details == null);
		
		return null;
	}

	private void returntoMainMenu() {
		ReadWrite.wipeActiveUser();
		MainMethod.printwelcomeMenu();
		
	}

	private void printcustomerMenu() 
	{
		System.out.println("\nChoose one of the following numbers to continue: ");
		System.out.println("\n|1| See available bikes");
		System.out.println("|2| See available promotions");
		System.out.println("|3| Book a bike");
		System.out.println("|4| Log out");
		System.out.println("|5| Exit process");	
	}

}
