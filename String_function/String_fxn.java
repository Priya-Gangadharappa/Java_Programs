package String_function;

public class String_fxn {

	public static void main(String[] args)
	{
		String s1=new String("Manish Kumar Tiwari");
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(8));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('u'));
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(0,5));
		System.out.println(s1.substring(7, 12));
		System.out.println(s1.substring(13,18));
		
	}

}
