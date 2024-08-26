package Assert_keyword;

public class Assert_keyword {

	public static void main(String[] args) 
	{
		int a=10;
		/*assert a==11; //condition is not matching*/ // syntax 1:- assert condition;
		/*String a1="priya";
		assert a1.length()==5;*/
		String a1="priya";
		assert a1.equals("kumar");  
		System.out.println("----------");
		assert a1.equals("priya"):("Iam assert keyword"); // if the condition is false then the message will be executed 
		// syntax 2:- assert condition:("message");
		System.out.println(a+100);
		System.out.println("condition is true hence message section is not geting executed");	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}

}
