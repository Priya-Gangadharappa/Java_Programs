package Polymorphism;
class Encapsulation_parent
{
	private int otp=0000;
	
	public int getOtp()
	{
		return otp;
	}
	public void setOpt(int otp)
	{
		this.otp = otp;
	}
}
public class Encapsulation_intdatatype extends Encapsulation_parent
{

	public static void main(String[] args)
	{
		Encapsulation_parent e1=new Encapsulation_parent();
		e1.setOpt(4567);
		System.out.println(e1.getOtp());
		
	}

}
