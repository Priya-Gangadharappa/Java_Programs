package Automation;

public class calling_Static_nonstatic 
{


	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	static void sub()
	{
		int a=10;
		int b=20;
		int sub=a-b;
		
		System.out.println(sub);
	}
	
	public static void main(String[] args)
	{
		// can call Non static method by creating an object with the help of refrance variable
		
		//Syntax ;- classname refrance_variable= new classname();                                                                                                                                                                                                                                                                                             
		
		call_nonstaticmethod c1=new call_nonstaticmethod();
		c1.add();
		
		sub(); // calling static method directly by method name
		
		
	}
}
