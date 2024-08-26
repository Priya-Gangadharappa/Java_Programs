package String_function;

import java.util.Arrays;
import java.util.Scanner;

public class PassvalueofArray_usingScannerClass 
{

	public static void main(String[] args) 
	{
	
		 
		int rollno[]=new int[3];
		/*rollno[0]=50;
		rollno[1]=21;
		rollno[2]=67;*/
		Scanner s1=new Scanner(System.in);
		
		/*System.out.println("enter the rollno[0]");
		System.out.println("enter the rollno[1]");
		System.out.println("enter the rollno[2]");*/
          for(int i=0;i<rollno.length;i++)
          {
        	 rollno[i]=s1.nextInt(); // scanner function for integer
          }
          
         /* System.out.println(rollno[0]);
          System.out.println(rollno[1]);
          System.out.println(rollno[2]);*/
          
          System.out.println(Arrays.toString(rollno));//printing array in single line
	 s1.close();
	}

}
