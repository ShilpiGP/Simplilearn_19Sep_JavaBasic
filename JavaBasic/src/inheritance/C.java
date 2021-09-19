package inheritance;

public class C extends D
{
	public void year()
	{
		System.out.println("Current year is 2021");
	}
	public static void main(String args[])
	{
		C y = new C();
		y.year();
		y.nextyear();
	}
}
