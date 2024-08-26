package Polymorphism;

import java.sql.Date;

import Type_casting.object;

public class Date_Format extends object
{

	public static void main(String[] args) 
	{
		Date d1=new Date(0);
		System.out.println(d1.getTime());// getTime() return type is long datatype
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String time=d2.toString(); // Converting time format into string -
		                           //so that can utilize the string functionality
		
       String Month=time.substring(4, 7);
       System.out.println(Month);    // we can get month from the String 
       
       String Date=time.substring(8, 10);
       System.out.println(Date);
       
       String Year=time.substring(time.length()-4);
       System.out.println(Year);
       
       String DateFormat1=Date.concat(Month).concat(Year);
       System.out.println(DateFormat1);
       
       String DateFormat2=Date.concat(" ").concat(Month).concat(" ").concat(Year);
       System.out.println(DateFormat2);
       
       String DateFormat3=Date.concat("-").concat(Month).concat("-").concat(Year);
       System.out.println(DateFormat3);
       
       String DateFormat4=Date.concat("/").concat(Month).concat("/").concat(Year);
       System.out.println(DateFormat4);
     
       Date_Format D1=new Date_Format();
       System.out.println(D1.getClass());// we don't utilize the object class 
	}
	

}
