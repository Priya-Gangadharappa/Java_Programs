package Automation;

import java.util.Scanner;

public class Area_of_triangle {
	
	public static void main(String[] args) 
	{
       
		System.out.println("please enter the value of b");
		System.out.println("please enter the value of h");
		
		Scanner s1=new Scanner(System.in);
		
		int b=s1.nextInt();
		int h=s1.nextInt();
		
		double area=1/2*b*h;
		
		System.out.println("Area of triangle --->" + area);

	}

}
