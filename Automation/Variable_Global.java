package Automation;

public class Variable_Global
{
	double pi=3.14;// Global variable -> any variable that is declared outside the method and inside the class
	
	//Scope of global variable is inside class
	
	static void add()
	{
		String a="priya";
		System.out.println(a);// scope is only inside the method 
	}
public static void main(String[] args)
{
	Variable_Global v1=new Variable_Global();
	
	System.out.println(v1.pi);
	add();
	
}

}
