package Automation;

import java.util.Scanner;

public class Area_of_tripezium {

	public static void main(String[] args) 
	{
		System.out.println("please enter the vaue of a");
		
		System.out.println("please enter the vaue of b");

		System.out.println("please enter the vaue of h");

				Scanner s1=new Scanner(System.in);
				
				int a=s1.nextInt();
				int b=s1.nextInt();
				int h=s1.nextInt();
				
				int Tripezium=1/2*(a*b)*h;
				
				System.out.println("circumferance of triangle --->" +Tripezium);

	}

}
