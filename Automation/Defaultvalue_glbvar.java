package Automation;

public class Defaultvalue_glbvar
{
  double pi=3.14;
  static int no_of_days_leap_year=366;
  static int age; // 0 is the default value for global variable
  
  static void add()
  {
	  String a="priya";
	 
  }
  
	public static void main(String[] args)
	{
		double salary;//declarization 
		// no default value for local variable 
		salary =9012; 
		
		System.out.println(salary);
		
		System.out.println(age); // global variable can be utilized without initialization
		
	}
}
