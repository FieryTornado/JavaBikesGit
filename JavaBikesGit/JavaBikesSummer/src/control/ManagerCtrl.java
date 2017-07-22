package control;

import java.util.Scanner;

import database.ReadWrite;
import model.*;

public class ManagerCtrl {
	
	Scanner input = new Scanner(System.in);
	Manager manager = new Manager();
	
	//Bike bike = new Bike();
	//Ebike eBike = new Ebike();

	public void ManagerMenu() {
		printManagerMenu();
		
		//do
		//{
			//int selectManagerMenu = input.nextInt();
			//switch (selectManagerMenu)
			//{
			
			
			/*case 1:
			Bike = new Bike();
			bike = addBike();
			bike.WriteToFile(bikeDetails);
			managerMenu();
			break;
		catch (InputMismatchException e)
		{
			System.out.println("\nChoose a number from 1 - 3: ");
		}
			}
		while (true);
		
	}

	private Bike addBike() {
		// TODO Auto-generated method stub
		return null;
		*/
	}
			public void printManagerMenu()
			{
				System.out.println("\n|1| Add bike" );
				System.out.println("|2| Add electric bike" );
				System.out.println("|3| Exit system" );
			}
			
			public void writeToFile()
			{
				String details = manager.getUsername() + ";" + manager.getPassword() + ";";
				ReadWrite.WriteDetails("manager.txt", details);
			}
}