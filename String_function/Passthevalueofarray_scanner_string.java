package String_function;

import java.util.Arrays;
import java.util.Scanner;

public class Passthevalueofarray_scanner_string {

	public static void main(String[] args) 
	{
		String stdName[]=new String[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<stdName.length;i++)
        {
			stdName[i]=s1.next();
        }
		  System.out.println(Arrays.toString(stdName));//printing array in single line
			 s1.close();
			}
	}


