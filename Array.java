package mypackage;

import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int a[][]=new int[5][5];
		a[1][0]=7;
		a[0][1]=9;
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
			System.out.printf(a[i][j]+ "\t");	
			}
		    System.out.println("\n");
		}
	}
}
