package classexercised6;

public class Road {
	
	public static void main (String []args) {
		Truck t= new Truck("Blue", 12 , "Chevy");
		t.usedFor();
		t.carriesPeople();
		t.displayTruckDetails();
	
		Bus bus= new Bus ("Yellow", 8, "Ford");
		bus.usedFor();
		bus.displayBusDetails();
		bus.carriesPeople();
		
		Car car= new Car ("balck", 4 , "hyndua");
		car.usedFor();
		car.carriesPeople();
		car.displayCarDetails();
		
		
	}

}