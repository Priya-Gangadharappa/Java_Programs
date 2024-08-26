package Automation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
	String name="ram";
	String name1="arm";
	
	if(name.length()!=name1.length())
	{
		System.out.println("NOT ANAGRAM");
	}
	else
	{
		char []c1=	name.toCharArray();
		char []c2=	name1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

	boolean answer=		Arrays.equals(c1, c2);
		System.out.println(answer);
		if(answer==true)
		{
			System.out.println("the Given Strings are Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
		
	}
	

	}

}
