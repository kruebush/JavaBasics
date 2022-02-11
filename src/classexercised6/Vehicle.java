package classexercised6;


class Truck extends Vehicle {
	
	public Truck () {
	System.out.println("Default Construct ");
	}
public void usedFor() {
	System.out.println("Used for hauling trialors");
}
public void carriesPeople() {
	System.out.println("Carries 2 people");
	
}

public Truck(String color, int numOfWheels, String model) {
	super(color, numOfWheels, model);
	System.out.println("Truck paramtrized from superclass:\n");
}

public void displayTruckDetails() {
	System.out.println("Truck color "+ color);
	System.out.println("The Truck has "+ numOfWheels + "number of wheels");
	System.out.println("Truck model is  "+ model);
	
}
	
}
class Bus extends Vehicle {

	public Bus (){
		System.out.println("default construct");
	}
	
	public void usedFor() {
		System.out.println("used for public transportion carry multiple people");
	}
	public void carriesPeople() {
		System.out.println("Carries people us to 20 passengers");
		
		}

	public Bus(String color, int numOfWheels, String model) {
			super(color, numOfWheels, model);
			System.out.println("\n Buss parametrized from superclass:\n");
		}
	public void displayBusDetails() {
			System.out.println("Bus color "+ color);
			System.out.println("The bus has "+ numOfWheels+ "number of wheels");
			System.out.println("Bus model is  "+ model);
		}
	
}

class Car extends Vehicle{

	public Car () {
		System.out.println(" default constructor");
		
	}
	public void usedFor() {
		System.out.println("Car used for daily transportation and erronds");
	}

	public void carriesPeople() {
	System.out.println("Carries people up to 4 passengers");
	
}
	public Car(String color, int numOfWheels, String model) {
		super(color, numOfWheels, model);
		System.out.println("\n Car paramtrized from superclass:\n");
	}
	public void displayCarDetails() {
		System.out.println("Car is the color "+ color);
		System.out.println("The Car  has "+ numOfWheels + "number of wheels");
		System.out.println("Car model is  "+ model);

	}
}


public class Vehicle {
	
	String color;
	int numOfWheels;
	String model;

	
	public Vehicle () {
		System.out.println("Vehicle default constructor");
	}
	
	public void usedFor() {
		System.out.println("what are vehicles used for");
	}
	
	public void carriesPeople() {
		System.out.println("Carries people");	
	}
	
	public Vehicle (String color, int numOfWheels, String model) {
		super ();
		this.color = color;
		this.numOfWheels = numOfWheels;
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}




}
