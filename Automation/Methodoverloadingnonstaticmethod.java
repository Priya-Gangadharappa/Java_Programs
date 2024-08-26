package Automation;

public class Methodoverloadingnonstaticmethod
{
	 void add(int a)
	{
		System.out.println("1");
	}
	
	 void add()
	{
		System.out.println("2");
	}
	
	void name(String a)
	{
		System.out.println("3");
	}
	
	void name(String a,char b,double c)
	{
		System.out.println("4");
		
	}
	
	public static void main(String[] args) 
	{
		Methodoverloadingnonstaticmethod d1=new Methodoverloadingnonstaticmethod();
		d1.add(20);
		d1.add();
		d1.name("MKT");
		d1.name("priya",'j',3.14);
		
	}

}
