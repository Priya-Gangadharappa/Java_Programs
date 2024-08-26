package Automation;

import java.util.Scanner;

public class Circum_of_circle {
	final static double pi=3.14;

	public static void main(String[] args) 
	{
System.out.println("please enter the vaue of r");
		
		Scanner s1=new Scanner(System.in);
		
		double r=s1.nextDouble();
		
		double area=2*pi*r;
		
		System.out.println("circumferance of circle --->" + area);

	}

}
