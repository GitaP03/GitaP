package mypackage;

import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		switch(num)
		{
		case 1: case 2: case 3: case 4:
				System.out.println("Rainy");
			    break;
			    
		case 5: case 6: case 7: case 8:
				System.out.println("Winter");
			    break;
		case 9: case 10: case 11: case 12:
				System.out.println("Summer");
			    break;
	    default:
	    	    System.out.println("No Season");
		}
		
	}
}

