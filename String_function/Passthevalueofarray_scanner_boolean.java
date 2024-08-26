package String_function;

import java.util.Arrays;
import java.util.Scanner;

public class Passthevalueofarray_scanner_boolean {

	public static void main(String[] args) 
	{
    boolean stdName[]=new boolean[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<stdName.length;i++)
        {
			stdName[i]=s1.nextBoolean();
			}
		  System.out.println(Arrays.toString(stdName)); //printing array in single line
			 s1.close();
			}

}
