package Automation;

public class maleandfemaleif
{
  public static void main(String[] args)
  {
	  String gender="Female";
	  String gender1="Male";
	  int age = 0;
	  
	  if(gender1=="Female")
	  {
		  System.out.println("Female travelling is free for any age");
		 
	  }
	  else
	  {
		  if(gender1=="Male")
		  {
		
			  if(age <=12)
			  {
				  System.out.println(" ticket pair is half");
			  }
			  else
				  if(age>=12 || age==59)
			  {
				System.out.println("ticket pair is full");
			  }
			  else
			  {
				  System.out.println("ticket is senior citizen");
			  }
	  }
	 
  System.out.println("end of the loop");
  
}
 }
  
}

