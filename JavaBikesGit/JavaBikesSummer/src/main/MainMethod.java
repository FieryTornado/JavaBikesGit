package main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import control.Control;


public class MainMethod {
	
	static Scanner input = new Scanner(System.in);
	
	static Control ctrl = new Control();
	
	public static void main(String[] args) throws IOException {
		
		// print information "welcome screen"
		printwelcomeMenu();
		{
			
		}
	
	do
	{
		try
		{
		int selectwelcomeMenu = input.nextInt();
		switch(selectwelcomeMenu)
		{
		case 1:
			// create customer
			ctrl.CreateCustomer();
			break;
			
		case 2:
			// login
			ctrl.Login();
			break;
			
		case 3:
			//browse bikes
			ctrl.BrowseBikes();
			break;
		case 4:
			// exit
			System.exit(0);
			break;
			default:
				break;
		}
	}
		catch (InputMismatchException e)
		{
			System.out.println("\nChoose a number from 1 to 4: ");
			input.next();
			break;
	}
		
	}
	while (true);	

	

	}
	
	public static void printwelcomeMenu() 
	{
		System.out.println("Welcome to Java Bikes: Choose a number from 1 to 4 to begin");
		System.out.println("|1| Create an account" );
		System.out.println("|2| Login" );
		System.out.println("|3| Browse bikes" );
		System.out.println("|4| End Session" );
		
	}	
	
	}