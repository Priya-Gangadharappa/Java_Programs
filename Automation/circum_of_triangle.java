package Automation;

import java.util.Scanner;

public class circum_of_triangle {

	public static void main(String[] args)
	{
System.out.println("please enter the vaue of a");
		
System.out.println("please enter the vaue of b");

System.out.println("please enter the vaue of c");

		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		
		int triangle=a+b+c;
		
		System.out.println("circumferance of triangle --->" +triangle);

		

	}

}
