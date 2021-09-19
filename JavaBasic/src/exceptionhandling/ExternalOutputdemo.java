package exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutputdemo {
	
public static void main(String args[])throws FileNotFoundException
{
	File file = new File ("/home/shilpigp36gmail/Documents/");
	PrintWriter printwriter = new PrintWriter(file);
	printwriter.print("Today is Saturday");
	printwriter.close();
}
}
