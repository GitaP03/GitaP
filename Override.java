package mypackage;


class Test2
{
	void show()
	{
		System.out.println("Parent class method called");
	
	}
	
class Test extends Test2
{
	void show()
	{
		super.show();
		System.out.println("Child class method called");

	}
}

class Override
{
	public static void main(String[] args)
	{
		
		Test2 s=new Test2();
		s.show();
	}
}
}
