package Automation;

public class Final_variable_global

{
	
	final static double pi=3.14;
	final static int no_pf_days_weak=7;
	
	/*static void area_of_circle()  
	{
		final int area=10;
		
		System.out.println(area);
	}
	public static void main(String[] args)
	{
		System.out.println(pi);
		
		System.out.println(no_pf_days_weak);
		
		area_of_circle();
	}*/
	
	
	
	void area_of_circle()
	{
		final int area=10;
		
		System.out.println(area);
	}
	public static void main(String[] args)
	{
		System.out.println(pi);
		
		System.out.println(no_pf_days_weak);
		
		Final_variable_global f1=new Final_variable_global();
		f1.area_of_circle();
	}
	
}
