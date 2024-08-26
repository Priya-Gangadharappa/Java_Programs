package SIB_and_IIB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		int rollno[]= new int[3];
		 
 Scanner s1= new Scanner(System.in);
 System.out.println("enter the rollno's");
 int rollno1=s1.nextInt();
  try
		 {
			
		 int[] rollno2;
		
		 int rollno3=s1.nextInt();
		 }
		 catch(InputMismatchException a1)
        {
			System.out.println("exception handeled 1"); 
			
         }
    
        catch(IndexOutOfBoundsException b1)
          {
        	System.out.println("exception handled 2");
              }
		 
		
}
}

