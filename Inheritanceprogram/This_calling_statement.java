package Inheritanceprogram;

public class This_calling_statement 
{
	This_calling_statement(int a )
	{
		System.out.println(" a has integer value");
	}
	
	This_calling_statement(double b)
	{
		this(56);
		System.out.println(" b had double value");
	}
	
	This_calling_statement()
	{
		this(6789.7655); 
		System.out.println(" without parameter");
		
	}
	
	public static void main(String[] args)
	{
		new This_calling_statement();

	}

}
