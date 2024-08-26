package Automation;

import java.util.Scanner;

public class Area_of_the_circle
{
 final static double pi=3.14; // pi=Math.pi;

	public static void main(String[] args)
	{
		System.out.println("please enter the vaue of r");
		
		Scanner s1=new Scanner(System.in);
		
		double r=s1.nextDouble();
		
		double area=pi*r*r;
		
		System.out.println("Area of circle --->" + area);

	}

}
