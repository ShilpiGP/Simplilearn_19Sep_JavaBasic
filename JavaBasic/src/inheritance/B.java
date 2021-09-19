package inheritance;

public class B extends C
{
	public void month()
	{
		System.out.println("Month is September");
	}
	public static void main(String args[])
	{
		B a = new B();
		//a.day();
		a.date();
		a.year();
		a.nextyear();
		}
	
}