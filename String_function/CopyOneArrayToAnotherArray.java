package String_function;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) 
	{
		double Esalary[]=new double[3];
		Esalary[0]=7185.34;
		Esalary[1]=7485.23;
		Esalary[2]=7885.23;
		
		double Msalary[]=new double[3];
		
		for(int i=0;i<Esalary.length;i++)
		{
			Msalary[i]=Esalary[i];
			
		}
		System.out.println("Old salary is->");
		System.out.println(Arrays.toString(Esalary));
		
		System.out.println("After copying ,the new salary is->");
		System.out.println(Arrays.toString(Msalary));
	}

}
