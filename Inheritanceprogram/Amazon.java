package Inheritanceprogram; // super calling statemnet  vv                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
class youtube
{
	youtube(String a, double b)
	{
		System.out.println("youtube");
	}
}
class Google extends youtube
{
 Google()
 {
	 super("priya",566.7656);
	 // super calling statemnet will be present implicitly
	 System.out.println("google");
 }
}
public class Amazon extends Google 
{
   Amazon()
     { // super calling statement present implicitly
	 //super calling statement 
	 System.out.println("Amazon"); 
       }
	   
	public static void main(String[] args) 
	{
		new Amazon();

	}

}
