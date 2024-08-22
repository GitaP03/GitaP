package mypackage;

interface I1
{
	int id=60;
}
interface I2 extends I1
{}
class Interface implements I2
{
	public static void main(String[] args)
	{
		System.out.println("Value id is: "+id);
	
	}
}