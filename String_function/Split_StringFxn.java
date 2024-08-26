package String_function;

import java.util.Arrays;

public class Split_StringFxn {

	public static void main(String[] args) 
	{
		String s1="Manish Kumar Thiwari";
		String[] name=s1.split(" ");
		System.out.println(Arrays.toString(name)); // the given string will be splited for every word
		
		String[] name1=s1.split(" ", 2); // here 2 is limit ex:- the string will be splitted for 2 array [ s1 , s2 ]
		System.out.println(Arrays.toString(name1));// the given string will be splited according to the limits 

	}

}
