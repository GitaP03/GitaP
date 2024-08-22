package mypackage;

interface I1
{
void show();
}
class Test implements I1
{
	public void show()
	{
		System.out.println("Show method called");
	}
	
}
class Overide
{
	public static void main(String[] args)
	{
		Test t= new Test();
		t.show();
	
	}
}