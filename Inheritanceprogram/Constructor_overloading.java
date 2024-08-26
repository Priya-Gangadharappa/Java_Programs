package Inheritanceprogram;

public class Constructor_overloading
{
	Constructor_overloading()
	{
		this(34);
		System.out.println("wit no parameter");
	}
	
	Constructor_overloading(int a)
	{
		this(23,56.77);
		System.out.println("with interger parameter");
	}
	
	Constructor_overloading(int a,double b)
	{
		
		System.out.println("with two parameter");
	}
	
	public static void main(String[] args)
	{
		new Constructor_overloading();

	}

}
