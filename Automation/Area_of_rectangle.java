package Automation;

import java.util.Scanner;

public class Area_of_rectangle
{

	public static void main(String[] args) 
	{

		System.out.println("please enter the value of l");
		System.out.println("please enter the value of w");
		
		Scanner s1=new Scanner(System.in);
		
		int l=s1.nextInt();
		int w=s1.nextInt();
		
		int area=l*w;
		
		System.out.println("Area of rectangle --->" + area);


	}

}
