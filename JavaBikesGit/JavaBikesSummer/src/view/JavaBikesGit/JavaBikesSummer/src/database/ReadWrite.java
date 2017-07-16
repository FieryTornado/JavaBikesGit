package database;

import java.io.*;

public class ReadWrite {

	public static void WriteDetails(String file, String input) 
	{
		try
		{
			FileWriter fwriter = new FileWriter(file, true);
			PrintWriter output = new java.io.PrintWriter(fwriter);
			
			output.println(input);
			output.close();
		}
		catch (IOException ex)
		{
			System.out.println("Error writing to file" + file + ".");
		}
		
	}

}
