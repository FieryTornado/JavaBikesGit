package view;

import java.util.Scanner;

import control.Control;

public class CustomerView 
{
	Control ctrl = new Control();
	Scanner input = new Scanner(System.in);

	public void customerMenu() 
	{
		printcustomerMenu();
		
		int selectcustomerMenu = input.nextInt();
		switch (selectcustomerMenu)
		{		
		case 1:
			ctrl.BrowseBikes();
			ctrl.printBikes();
			customerMenu();
			break;
			
		case 2:
			ctrl.promotions();
			ctrl.printpromotions();
			customerMenu();
			break;
			
		case 3:
			ctrl.bookBike();
			customerMenu();
			
		case 4:
			System.exit(0);
			
			default:
				System.out.println("Wrong input: Choose a number from 1 to 4 to continue");
				input.next();
				break;			
		}
	}

	private void printcustomerMenu() 
	{
		System.out.println("\nChoose one of the following numbers to continue: ");
		System.out.println("\n|1| Browse bikes");
		System.out.println("|2|See available promotions");
		System.out.println("|3| Book a bike");
		System.out.println("|4| Exit process");		
	}
}