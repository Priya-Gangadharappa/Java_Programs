package Automation;

import java.util.Scanner;

public class circum_of_rectangle {

	public static void main(String[] args) 
	{
		System.out.println("please enter the vaue of l");
		
		System.out.println("please enter the vaue of w");

				Scanner s1=new Scanner(System.in);
				
				int l=s1.nextInt();
				int w=s1.nextInt();
				
				int rectangle= 2*l+2*w;
				
				System.out.println("circumferance of rectangle --->" +rectangle);


	}

}
