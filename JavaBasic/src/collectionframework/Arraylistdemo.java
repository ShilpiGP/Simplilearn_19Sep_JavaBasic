package collectionframework;

import java.util.ArrayList;

public class Arraylistdemo 
{
public static void main(String args[])
{
	ArrayList <String> cities= new ArrayList<>();
	cities.add("London");
	cities.add("New york");
	cities.add("Paris");
	cities.add("California");
	
	for (String t:cities)
	{
		System.out.println(t);
		
	}
	
	//Retrieving Data
	System.out.println("Total number of elements is-"+ cities.size());
	System.out.println("Item at index one is-"+ cities.get(1));
	System.out.println("Index of Paris is-"+ cities.indexOf("Paris"));
	System.out.println("Is Bangalore present in list-"+ cities.contains("Bangalore"));
	
	//Removing date
	cities.remove(1);
	System.out.println("Item at index one is-"+ cities.get(1));//Paris will take place of New york
	System.out.println("Index of New york is-"+ cities.indexOf("New york"));//removed
	
	
}


}
