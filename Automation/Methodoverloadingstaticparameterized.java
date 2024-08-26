package Automation;

public class Methodoverloadingstaticparameterized
{
	static void add(int a)
	{
		System.out.println("1");
	}
	
	static void add()
	{
		System.out.println("2");
	}
	
	static void name(String a)
	{
		System.out.println("3");
	}
	
	static void name(String a,char b,double c)
	{
		System.out.println("4");
	}
	
	//multiple methods with same name but variation in the arguments list- Method overloading
	
	public static void main(String[] args) 
	{
		
		add(20);
		add();
		name("MKT");
		name("priya",'j',3.14);
	
	}

}
