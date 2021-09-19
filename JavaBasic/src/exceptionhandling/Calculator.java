package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{
public static void main(String args[])
{
	Scanner k = new Scanner(System.in);
	try
	{
	System.out.println("Please enter first number : ");
	int num1= k.nextInt();
	//double num1= k.nextDouble();
	System.out.println("Please enter Second number : ");
	int num2= k.nextInt();
	//double num2= k.nextDouble();
	System.out.println("Result of division is : "+(num1/num2));
	}
	catch(ArithmeticException e)
	{
		System.out.println("Please do not enter 0 in the denominator");
	}
	catch(InputMismatchException e)
	{
		System.out.println("Only integer values are allowed");
	}
	catch(Exception e)
	{
		System.out.println("Please enter valid input");
	}
	finally
	{
		System.out.println("Good Morning");
	}
}
}
	

	
	
	

