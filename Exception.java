package mypackage;

import java.io.*;
class Exception
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr=new FileReader("Demo.java");

		}
		
			catch(IOException e) 
		{
			      System.out.println(e);
		}
	}
}