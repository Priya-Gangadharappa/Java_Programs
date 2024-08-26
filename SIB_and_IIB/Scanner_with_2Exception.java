package SIB_and_IIB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_with_2Exception {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the age");
		int age[]=new int[3];
		age[0]=21;
		age[1]=22;
		age[2]=24;
		try
		{
			int age1=s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("sorry your input is for integer value");
			Scanner s2=new Scanner(System.in);
			System.out.println("enter your age");
			int age1=s2.nextInt();
		}
		
		catch(IndexOutOfBoundsException a2)
		{
			System.out.println("sorry range of value is exceeded");
			Scanner s3=new Scanner(System.in);
			System.out.println("enter your age");
			int age1=s3.nextInt();	
		}
	}
}
