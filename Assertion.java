package mypackage;

class Assertion 
{
	public static void main(String[] args)
	{
		System.out.println(withdrawMoney(50,20));
		System.out.println(withdrawMoney(90,40));
		
	}
	static public double withdrawMoney(double balance, double amount)
	{
		assert balance>=amount;
		return balance-amount;
		
	}
}