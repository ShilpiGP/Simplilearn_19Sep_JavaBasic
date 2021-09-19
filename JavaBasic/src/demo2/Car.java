package demo2;

public class Car 
{
	private String color;
	private String engineType;
	
	public Car(String colorofCar, String typeofEngine)
	{
		color=colorofCar;
		engineType=typeofEngine;
	}
	public void printcarinfo()
	{
		System.out.println("Color of car is- " + color);
		System.out.println("Type of engine is- "+ engineType);

	}
	public static void main(String args[])
	{
		Car mercedes = new Car("Silver","Petrol");
		Car audi = new Car("Black","Diesel");
		mercedes.printcarinfo();
		audi.printcarinfo();
	}

}
	

