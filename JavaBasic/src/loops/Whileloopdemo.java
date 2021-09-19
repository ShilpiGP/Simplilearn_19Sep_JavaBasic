package loops;
import java.util.Scanner;

public class Whileloopdemo {
	public static void main(String args[])
	{
		int PINinDB=1234;
		Scanner k=new Scanner(System.in);
		System.out.println("Please enter your ATM PIN ");
		int PINentered=k.nextInt();
		while(PINentered!=PINinDB)
		{
			System.out.println ("Pin is Incorrect. Please enter your PIN again:");
			PINentered=k.nextInt();
		}
		
		System.out.println("Welcome to ABC Bank");

	}

}
