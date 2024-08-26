package Automation;

public class Finalvariable
{
	
	final static double pi=3.14;
	final static int no_pf_days_weak=7;
	
	static int no_of_months=12;
	
	
	public static void main(String[] args)
	{
		final int age=90;// final variable value cannot be changed
		
	// 	age=91; //reinitialization is not possible in final variable 
		
		System.out.println(age);
		System.out.println(pi);
		System.out.println(no_pf_days_weak);
		
		System.out.println(no_of_months);
	}

}
