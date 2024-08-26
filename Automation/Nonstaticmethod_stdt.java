package Automation;

public class Nonstaticmethod_stdt

{
	int age;
	String Name;
	double marks;
	
	
	void studen_details(int age, String Name, double marks)  //(21,Rishi,454.20)
	{
		System.out.println("non static method");
	}
	
 public static void main(String[] args)

 {
	 Nonstaticmethod_stdt s1=new Nonstaticmethod_stdt();
			 
	 s1.studen_details(21,"Rishi", 454.20); // prints the statement of student details
	 
	 System.out.println(s1.age);
	 System.out.println(s1.Name);
	 System.out.println(s1.marks);
	 
	 
 }
}
