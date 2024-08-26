package String_function;

import java.util.Arrays;
import java.util.Scanner;

public class Passthevalueofarray_scanner_double {

	public static void main(String[] args) 
	{
		
	    double Esalary[]=new double[3];
			
			Scanner s1=new Scanner(System.in);
			
			for(int i=0;i<Esalary.length;i++)
	        {
				Esalary[i]=s1.nextDouble();
				}
			  System.out.println(Arrays.toString(Esalary)); //printing array in single line
				 s1.close();
				
		
	}

}
