package mypackage;

class Test
{
	void shape(int i)
	{
		System.out.println("Hello"+i);
	}
	void shape(float j)
	{
		System.out.println("Hii"+j);
	}
	

public static void main(String[] args)
	{
		
		Test t=new Test();
		t.shape(4);
		t.shape(2.0f);
		
	}

}