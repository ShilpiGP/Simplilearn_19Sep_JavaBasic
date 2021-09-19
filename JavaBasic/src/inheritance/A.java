package inheritance;

public class A extends B
{
	public void day()
	{
		System.out.println("Today is Sunday");
	}
	
	public static void main(String args[])
	{
		A a = new A();
		a.day();
		a.date();
		a.year();
		a.nextyear();
		}
	}
