package SIB_and_IIB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s1.nextInt();
		try
		{
			int age1=s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println(" sorry please read the question again:");
			Scanner s2=new Scanner(System.in);
			System.out.println("enter your age");
			int age1=s2.nextInt();
		}
		System.out.println("enter your first name ");
		Scanner s3=new Scanner(System.in);
		String firstname=s3.next();
	}

}
