package examplesofoverriding;

public class Basic  { 

	private void engine() 
	{ 
		System.out.println("Vehicle engine"); 
	} 
	protected void fueltype() 
	{ 
		System.out.println("Vehicle fueltype"); 
	} 
	} 
	class Car extends Basic { 
	void engine() 
	{ 
		System.out.println("Car engine"); 
	} 
	protected void fueltype() 
	{ 
		System.out.println("Car fueltype"); 
	} 
	} 
	class Myvehicle {
	public static void main(String[] arg) {
	Basic vehicle = new Basic(); 
	vehicle.fueltype(); 
	Basic benz = new Car(); 
	benz.fueltype();
	}
}