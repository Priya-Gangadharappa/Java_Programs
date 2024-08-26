package Automation;

public class modifierMethosoverloading 
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
	static void add(boolean a)
	{
		System.out.println(a);
	}
	
 static void sub()
 {
	 System.out.println("iam your substraction method");
 }
	
	public static void main(String[] args) 
	{
		Methodoverloadingnonstaticmethod d1=new Methodoverloadingnonstaticmethod();
		d1.add(20); 
		//non staticmethod with int parameter
		
		d1.add(); 
		// non static method without parameter
		
		d1.name("MKT"); 
		// non static method with string parameter
		
		d1.name("priya",'j',3.14); 
		// non static with variation in the arguments list 
		
		add(true); 
		// static methos with parameter
	
		sub();
		// satic method without parameter
		
		
	}

}
