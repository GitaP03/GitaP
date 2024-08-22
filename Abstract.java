package mypackage;

abstract class Abs
{
	 abstract void show();
	 void disp()
	 {
	 System.out.println("Abstract method of abstract class");
	 }

}

class Test extends Abs
{
	void show()
	{
	System.out.println("Abstract method of test class");
	}
	
}
class Abstract
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.show();
		t.disp();
	}
	
}