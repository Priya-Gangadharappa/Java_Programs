package Automation;

public class staticnonstatic_glbvar 
{
 static double pi=3.14;
 int no_of_days_leap_year=366;
 
 public static void main(String[] args)
 {
	 pi=5; // updating the static global variable directly 
	 
	 
	 System.out.println(pi);
	 
	 staticnonstatic_glbvar n1=new staticnonstatic_glbvar();// by creating an object we can call non static global variable 
	 
	 n1.no_of_days_leap_year=355; // by creating the object we can update the non static global variable 
	 
	 System.out.println(n1.no_of_days_leap_year);
 }
}
