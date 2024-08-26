package Automation;

public class Constructorc1 
{
	
	Constructorc1()
	{
		System.out.println("this is constructor program");
	}

	Constructorc1(int a)
	{
		System.out.println("this is constructor program a");
	}
	
	Constructorc1(int a,double b)
	{
		System.out.println("this is constructor program b");
	}
	public static void main(String[] args)
	{
		Constructorc1 c1=new Constructorc1(19,3.14);
		new Constructorc1();
		new Constructorc1(10);	
	}

}
