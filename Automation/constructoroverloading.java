package Automation;

public class constructoroverloading 
{
	constructoroverloading ()
	{
		System.out.println("this is constructor program");
	}

	constructoroverloading (int a)
	{
		System.out.println("this is constructor program a");
	}
	
	constructoroverloading (int a,double b)
	{
		System.out.println("this is constructor program b");
	}
	
	void add() 
	{
		System.out.println("non static");
	}
	public static void main(String[] args)
	{
		constructoroverloading  c1=new constructoroverloading (19,3.14);
		new constructoroverloading (); // another way to call the constructor
		new constructoroverloading (10);
		c1.add();// object with non static method 
		new constructoroverloading().add();

		
	}

}
