package SIB_and_IIB;  //assignment 

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) 
	{
	
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the rollno of the student");
		int rollno=s1.nextInt();
		
		try
		{
			
			int rollno11[]=new int[4];
			
		}		
		catch(ArrayIndexOutOfBoundsException a1)
		{
		System.out.println("Sorry please enter proper array index");
		Scanner s2=new Scanner(System.in);		
		int rollno1=s1.nextInt();		
		}		
		System.out.println("enter the student age");
		Scanner s3=new Scanner(System.in);
		int age=s3.nextInt();
	}
}
