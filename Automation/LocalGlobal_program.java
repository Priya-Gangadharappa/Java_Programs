package Automation;

public class LocalGlobal_program 
{
static int a=20;
static int b=10;

static void add()
{
	a=90; 
	System.out.println(a+b);
}

static void sub() 
{
	System.out.println(a-b);
}

static void multi()
{
	System.out.println(a*b);
}

static void div()
{
	System.out.println(a/b);
}

public static void main(String[] args)
{
	
	add();
	sub();
	multi();
	div();
	
	
}

}
