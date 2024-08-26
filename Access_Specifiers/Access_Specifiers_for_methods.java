package Access_Specifiers;

public class Access_Specifiers_for_methods 
{
 public static void add()    //All 4 access specifiers can be accessed in all type of methods 
 {
	 System.out.println("public");
 }
 
 protected static void substraction()
 {
	 System.out.println("protected");
 }
 
 static void multiplication()
 {
	 System.out.println("default/package"); 
 }
 
 private static void division()
 {
	 System.out.println("private");
 }
	public static void main(String[] args) 
	{
		add();
		substraction();
		multiplication();
		division();
     
	}

}
