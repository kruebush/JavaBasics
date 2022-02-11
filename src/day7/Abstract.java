package day7;


abstract class Vehicle {
	
	int price;
	
	abstract void start();
	abstract void stop();
	public void applyingBreak() {
		System.out.println("Applying break should stop the vehicle");
	}
}
//Concrete class
class Bike extends Vehicle {

	@Override
	void start() {
		System.out.print("The bike will start");
	}
	@Override
	void stop() {
		System.out.println("\nBike switches off");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.stop();
		b.applyingBreak();
		
	}

}
