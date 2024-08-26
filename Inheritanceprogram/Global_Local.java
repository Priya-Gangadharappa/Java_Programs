package Inheritanceprogram;

public class Global_Local //this keyword                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
{
 int age; // 0
 double salary;//0.0
 String name; //null
 
 void employee_details(int age,double salary,String name)// 67,priya,988.9788
 {
	 this.age=age;//the value get assigned from the right hand side to left hand side
	 this.name=name;// this.global_variable=local_variable
	 this.salary=salary;
	 
	 /*System.out.println("age is-> "  + age);
	 System.out.println("salary is-> "  + salary);
	 System.out.println("name is-> "  + name);*/
 }
	public static void main(String[] args)
	{
		Global_Local g1=new Global_Local();
		g1.employee_details(67,988.9788,"priya");
		System.out.println(g1.salary); //global value 
		System.out.println(g1.age);
		System.out.println(g1.name);
	}

}
