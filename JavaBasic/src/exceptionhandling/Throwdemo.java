package exceptionhandling;

public class Throwdemo 
{
	public static void main(String args[])
	{
		String day = "Monday";
		if(day.equals("Monday"))
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("It is a good day");
		}
		
		
	}
	}


