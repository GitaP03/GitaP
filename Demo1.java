package mypackage;

import java.util.Scanner;
class Demo1
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<=24; i++)
		{
			int hr=sc.nextInt();
			System.out.println("Enter hours");
			
		}
		for (int i=0;i<=60; i++)
		{
			int min=sc.nextInt();
			System.out.println("Enter minutes");
			
		}
		for (int i=0;i<=60; i++)
		{
			int sec=sc.nextInt();
			System.out.println("Enter seconds");
			
	    }
		sc.close();
	}
	
}
