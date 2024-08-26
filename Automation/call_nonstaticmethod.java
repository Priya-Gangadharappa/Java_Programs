package Automation;

public class call_nonstaticmethod 
{

	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		// can call Non static method by creating an object with the help of refrance variable
		
		//Syntax ;- classname refrance_variable= new classname();                                                                                                                                                                                                                                                                                             
		
		call_nonstaticmethod c1=new call_nonstaticmethod();
		c1.add();
		
	}
}
