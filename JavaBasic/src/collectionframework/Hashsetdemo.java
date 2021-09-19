package collectionframework;
import java.util.HashSet;

public class Hashsetdemo 
{
	public static void main(String args[])
	{
		HashSet <String> cities= new HashSet<>();
		cities.add("London");
		cities.add("New york");
		cities.add("Paris");
		cities.add("California");
		
		for (String t:cities)
		{
			System.out.println(t);
			
		}
		
		
		System.out.println("Total number of elements is-"+ cities.size());
		//System.out.println("Item at index one is-"+ cities.get(1));
		//System.out.println("Index of Paris is-"+ cities.indexOf("Paris"));
		System.out.println("Is Bangalore present in list-"+ cities.contains("Bangalore"));
	}
	}


